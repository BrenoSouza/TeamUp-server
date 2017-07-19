package br.edu.ufcg.es.controller;

import javax.validation.Valid;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufcg.es.component.TokenService;
import br.edu.ufcg.es.model.User;
import br.edu.ufcg.es.model.DTO.AuthDTO;
import br.edu.ufcg.es.service.UserService;

@RestController
@CrossOrigin
public class AuthController {
    private UserService userService;
    private TokenService tokenService;

    @Autowired
    public AuthController(UserService userService, TokenService tokenService) {
        this.userService = userService;
        this.tokenService = tokenService;
    }

    @RequestMapping(value = "/auth", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> authUser(final @Valid @RequestBody AuthDTO authDTO) throws JSONException {
        User user = getUser(authDTO.getEmail());
        System.out.println(authDTO);// era pra estar aqui mesmo?
        JSONObject body = new JSONObject();
        if (user == null || !user.getPassword().equals(authDTO.getPassword())){
            body.put("token", JSONObject.NULL);
            body.put("message", "Email ou senha não conferem.");
            body.put("user", JSONObject.NULL);

            return new ResponseEntity<>(body.toString(), HttpStatus.FORBIDDEN);
        }

        body.put("token", tokenService.generateToken(user));
        body.put("message", "Usuario Autorizado.");

        JSONObject jsonUser = new JSONObject();
        jsonUser.put("id", user.getId());
        jsonUser.put("email", user.getEmail());

        body.put("user", jsonUser);
        return new ResponseEntity<>(body.toString(), HttpStatus.ACCEPTED);
    }

    private User getUser(String username) {
        User user = userService.getByEmail(username);
        return user;
    }
}