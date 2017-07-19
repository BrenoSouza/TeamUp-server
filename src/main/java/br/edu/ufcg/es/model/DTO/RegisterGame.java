package br.edu.ufcg.es.model.DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class RegisterGame {
	
	@NotNull
	private String date;
	
	@NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 10, max = 50, message = "O endereço deve ter entre 10 e 50 caracters.")
	private String local;
	
	@NotNull
    @NotEmpty
    @NotBlank
	@Size(min = 5, max = 20, message = "O nome do esporte deve ter entre 5 e 20 caracters.")
	private String sport;
	
	@NotNull
	@Size(min = 0, max = 200, message = "A descrição deve ter no máximo 200 caracters.")
	private String description;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
