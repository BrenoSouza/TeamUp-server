package br.edu.ufcg.es.model.DTO;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;

public class RatingParameters {

	@NotNull
    @NotEmpty
    @NumberFormat
    @Max(value = 5, message = "O valor não pode ser maior que 5")
	@Min(value = 0, message = "O valor não pode ser menor que 0")
	private int ability;
	
	@NotNull
    @NotEmpty
    @NumberFormat
    @Max(value = 5, message = "O valor não pode ser maior que 5")
	@Min(value = 0, message = "O valor não pode ser menor que 0")
	private int fairPlay;

	public int getAbility() {
		return ability;
	}

	public void setAbility(int ability) {
		this.ability = ability;
	}

	public int getFairPlay() {
		return fairPlay;
	}

	public void setFairPlay(int fairPlay) {
		this.fairPlay = fairPlay;
	}
	
}
