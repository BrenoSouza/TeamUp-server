package br.edu.ufcg.es.component;

import java.nio.charset.Charset;
import java.security.Key;
import java.util.Date;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.edu.ufcg.es.model.User;
import br.edu.ufcg.es.service.UserService;
import br.edu.ufcg.es.util.AuthException;

import org.json.JSONException;
import org.json.JSONObject;


@Component
public class TokenService {
    private UserService userService;

    @Autowired
    public TokenService(UserService userService) {
        this.userService = userService;
    }
    
    private static final String API_SECRET = "Be7REoNiOyS3f3OU";
    private static final Long EXPIRATION_SECONDS = 604800L;
    private static final Integer DIVIDER = 1000;

    private String encrypt(final String text) throws Exception {
        Key aesKey = new SecretKeySpec(API_SECRET.getBytes(Charset.forName("UTF-8")), "AES");

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, aesKey);

        byte[] encrypted = cipher.doFinal(text.getBytes(Charset.forName("UTF-8")));
        return Base64.encodeBase64String(encrypted);
    }

    private String decrypt(final String text) throws Exception {
        byte[] decodedText = Base64.decodeBase64(text);

        Key aesKey = new SecretKeySpec(API_SECRET.getBytes(Charset.forName("UTF-8")), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, aesKey);

        byte[] decrypted = cipher.doFinal(decodedText);

        return new String(decrypted, Charset.forName("UTF-8"));
    }

    public String generateToken(final User user) throws JSONException {
        long currentTime = new Date().getTime() / DIVIDER;

        JSONObject json = new JSONObject();
        json.put("email", user.getEmail());
        json.put("expires", currentTime + EXPIRATION_SECONDS);

        String token = null;

        try {
            token = encrypt(json.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return token;
    }

    public User validateToken(final String token) {
        String value = token.replace("Token ", "");

        JSONObject json;
        String email;
        long expires;

        try {
            String decrypted = decrypt(value);
            json = new JSONObject(decrypted);
            email = json.getString("email");
            expires = json.getLong("expires");
        } catch (Exception e) {
            throw new AuthException("Token malformed.");
        }

        long currentTime = new Date().getTime() / DIVIDER;

        if (currentTime > expires) {
            throw new AuthException("Token has expired.");
        }


        User user = userService.getByEmail(email);

        if (user != null) {
            return user;
        }
        throw new AuthException("User not found.");
    }

    public User getUser(final String token) {
        try {
            return validateToken(token);
        } catch (Exception e) {
            return null;
        }
    }
}

