package br.edu.ufcg.es.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	private Date date;
	
	@Column
	private String local;
	
	@Column
	private String sport;
	
	@Column
	private String description;
	
	@Column
	private long idOwner;
	
	@Column
	private List<Long> invites;
	
	public Game(Date date, String local, String sport, String description){
		this.date = date;
		this.local = local;
		this.sport = local;
		this.description = description;
		this.invites = new ArrayList<>();
	}
	
	public Game(){
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
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

	public List getInvites() {
		return invites;
	}

	public void setInvites(List invites) {
		this.invites = invites;
	}
	
	
	

}
