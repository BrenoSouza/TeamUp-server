package br.edu.ufcg.es.model.DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class RegisterUser {

	@NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 5, max = 20, message = "O nome deve ter entre 5 e 20 caracters.")
    private String name;
    @Email(message = "Insira um email valido.")
    private String email;
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 8, max = 16, message = "A senha deve ter entre 8 e 16 caracters.")
    private String password;
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 8, max = 16, message = "O telefone deve ter entre 8 e 16 caracters.")
    private String phone;
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 10, max = 50, message = "O endereço deve ter entre 10 e 50 caracters.")
    private String address;

    public RegisterUser() {
    	
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
	
}
