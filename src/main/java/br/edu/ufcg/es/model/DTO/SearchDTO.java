package br.edu.ufcg.es.model.DTO;

public class SearchDTO {

	private String name;

	public SearchDTO(){
		
	}
	
	public SearchDTO(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
