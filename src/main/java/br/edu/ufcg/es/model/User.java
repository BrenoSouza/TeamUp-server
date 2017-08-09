package br.edu.ufcg.es.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "User")
@Table(name = "tb_user")
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
	@Column
    private String name;
    
	@Column(unique = true)
    private String email;
    
	@Column
    @JsonIgnore
    private String password;
    
	@Column
    private String phone;
    
	@Column
    private String address;
    
	@Column
    private float fairPlayRating;
    
	@Column
    private float abilityRating;
    
	@Column
    private ArrayList<Long> games;
    
	@Column
    private ArrayList<Long> myGames;
	
	@Column
	private ArrayList<Long> gamesRequested;
    
	@Column
	private ArrayList<Long> favoriteUsers;
	
	@Column
	private ArrayList<Long> invitesReceived;
	
	@Column
	private int timesRated;

	public User(String name, String email, String password, String phone, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.games = new ArrayList<>(); // jogos que o usuario participa
        this.myGames = new ArrayList<>(); // jogos que usuario é adm
        this.gamesRequested = new ArrayList<>();
        this.favoriteUsers = new ArrayList<>();
        this.invitesReceived = new ArrayList<>();
        this.timesRated = 0;
        this.abilityRating = 0;
        this.fairPlayRating = 0;
    }

	/*public User(String name, String email, String password, String phone, String address, Long id,
			ArrayList<Long> games, ArrayList<Long> myGames, ArrayList<Long> gamesRequested,
			ArrayList<Long> favoriteUsers, ArrayList<Long> invitesReceived, int timesRated,
			float abilityRating, float fairPlayRating) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.id = id;
        this.games = games;
        this.myGames = myGames;
        this.gamesRequested = gamesRequested;
        this.favoriteUsers = favoriteUsers;
        this.invitesReceived = invitesReceived;
        this.timesRated = timesRated;
        this.abilityRating = abilityRating;
        this.fairPlayRating = fairPlayRating;
    }*/

	public User() {
    	
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getAddress() {
        return address;
    }
    
    public ArrayList<Long> getGames() {
		return games;
	}

	public void setGames(ArrayList<Long> games) {
		this.games = games;
	}

	public ArrayList<Long> getMyGames() {
		return myGames;
	}

	public void setMyGames(ArrayList<Long> myGames) {
		this.myGames = myGames;
	}
	
	public ArrayList<Long> getFavoriteUsers() {
		return favoriteUsers;
	}

	public void setFavoriteUsers(ArrayList<Long> favoriteUsers) {
		this.favoriteUsers = favoriteUsers;
	}
	
    public ArrayList<Long> getGamesRequested() {
		return gamesRequested;
	}

	public void setGamesRequested(ArrayList<Long> gamesRequested) {
		this.gamesRequested = gamesRequested;
	}
	
	public ArrayList<Long> getInvitesReceived() {
		return invitesReceived;
	}

	public void setInvitesReceived(ArrayList<Long> invitesReceived) {
		this.invitesReceived = invitesReceived;
	}
	
    public float getFairPlayRating() {
        return fairPlayRating;
    }
    
    public float getAbilityRating() {
        return abilityRating;
    }
	
	public void setFairPlayRating(float fairPlayRating) {
		this.fairPlayRating = fairPlayRating;
	}

	public void setAbilityRating(float abilityRating) {
		this.abilityRating = abilityRating;
	}

	public int getTimesRated() {
		return timesRated;
	}

	public void setTimesRated(int timesRated) {
		this.timesRated = timesRated;
	}
	
	public void computeRating(float ability, float fairPlay){
		float abilityRating = (this.getAbilityRating() * this.getTimesRated() + ability)
				/(this.getTimesRated() + 1);
		
		float fairPlayRating = (this.getFairPlayRating() * this.getTimesRated() + fairPlay)
				/(this.getTimesRated() + 1);
		
		this.setAbilityRating(abilityRating);
		this.setFairPlayRating(fairPlayRating);
		this.setTimesRated(this.getTimesRated() + 1);
	}
	
}
