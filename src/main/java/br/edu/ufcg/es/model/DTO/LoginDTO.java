package br.edu.ufcg.es.model.DTO;

public class LoginDTO {

	private Long userId;

    public LoginDTO(String token, Long userId, String role) {
        this.userId = userId;
    }

    public LoginDTO() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
