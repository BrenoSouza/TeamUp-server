package br.edu.ufcg.es.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Game")
@Table(name = "tb_game")
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String date;
	
	@Column
	private String local;
	
	@Column
	private String sport;
	
	@Column
	private String description;
	
	@Column
	private long idOwner;
	

	@Column
	private ArrayList<Long> invites;
	
	public Game(String date, String local, String sport, String description, long idOwner){
		this.date = date;
		this.local = local;
		this.sport = sport;
		this.description = description;
		this.idOwner = idOwner;
		this.invites = new ArrayList<>();
	}
	
	public Game(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
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

	public long getIdOwner() {
		return idOwner;
	}

	public void setIdOwner(long idOwner) {
		this.idOwner = idOwner;
	}

	public ArrayList<Long> getInvites() {
		return invites;
	}

	public void setInvites(ArrayList<Long> invites) {
		this.invites = invites;
	}
	
}
