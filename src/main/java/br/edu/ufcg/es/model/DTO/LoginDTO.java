package br.edu.ufcg.es.model.DTO;

public class LoginDTO {

	private Long userId;
    private String token;

    public LoginDTO(String token, Long userId) {
        this.userId = userId;
        this.token = token;
    }

    public LoginDTO() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
