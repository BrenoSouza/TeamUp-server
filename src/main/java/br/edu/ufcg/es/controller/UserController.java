package br.edu.ufcg.es.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufcg.es.component.TokenService;
import br.edu.ufcg.es.model.Game;
import br.edu.ufcg.es.model.User;
import br.edu.ufcg.es.model.DTO.RegisterUser;
import br.edu.ufcg.es.model.DTO.SearchDTO;
import br.edu.ufcg.es.service.GameService;
import br.edu.ufcg.es.service.UserService;

@RestController
@CrossOrigin
public class UserController {
    private UserService userService;
    private TokenService tokenService;
    private GameService gameService;

    @Autowired
    public UserController(UserService userService, TokenService tokenService, GameService gameService) {
        this.userService = userService;
        this.tokenService = tokenService;
        this.gameService = gameService;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getAllUser(@RequestHeader(value = "Authorization") String token){
       User user = tokenService.getUser(token);
       if(user != null){
           return new ResponseEntity<>(userService.getAll(),HttpStatus.OK);
       }

       return new ResponseEntity<>(new ArrayList<User>(), HttpStatus.UNAUTHORIZED);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUserById(@RequestHeader(value = "Authorization") String token,
    		@PathVariable("id") Long id){
    	User user = tokenService.getUser(token);
        if(user != null){
            return new ResponseEntity<>(userService.getById(id), HttpStatus.OK);
        }
        return new ResponseEntity<>(new User(), HttpStatus.UNAUTHORIZED);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> editUser(@RequestHeader(value = "Authorization") String token,
    		@Valid @RequestBody final RegisterUser registerUser){
        User user = tokenService.getUser(token);

    	User userUpdate = new User(registerUser.getName(),
                    registerUser.getEmail(),
                    registerUser.getPassword(),
                    registerUser.getPhone(),
                    registerUser.getAddress(),
                    user.getId(),
                    user.getGames(),
                    user.getMyGames(),
                    user.getGamesRequested(),
                    user.getFavoriteUsers(),
                    user.getInvitesReceived(),
                    user.getTimesRated(),
                    user.getAbilityRating(),
                    user.getFairPlayRating());

            return new ResponseEntity<>(userService.update(userUpdate), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/user", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> deleteUser(@RequestHeader(value = "Authorization") String token){
        User user = tokenService.getUser(token);
        if (user != null){
        	//remover das suas partidas, remover das partidas em que é convidado e das partidas que solicitou entrada
        	ArrayList<Long> games = user.getGames();
        	Long userId = user.getId();
        	Game game;
        	ArrayList<Long> gameGuests;
        	//remove o usuário dos jogos onde é convidado
        	for (Long gameId : games) {
				game = gameService.getById(gameId);
				gameGuests = game.getGuests();
				gameGuests.remove(userId);
				game.setGuests(gameGuests);
				gameService.update(game);
			}
        	//remove o usuário dos jogos onde solicitou entrada
        	games = user.getGamesRequested();
        	for (Long gameId : games) {
				game = gameService.getById(gameId);
				gameGuests = game.getGuestsRequests();
				gameGuests.remove(userId);
				game.setGuestRequests(gameGuests);
				gameService.update(game);
			}
        	//remove o usuário dos jogos que ele é dono
        	games = user.getMyGames();
        	for (Long gameId : games) {
				game = gameService.getById(gameId);
				game.getGuests().remove(user.getId());
				if (game.getGuests().isEmpty()) {
					//remove os pedidos de entrada na partida
		        	ArrayList<Long> guestUsers = game.getGuestsRequests();
		        	for (Long guestUserId : guestUsers) {
						User guestUser = userService.getById(guestUserId);
						games = guestUser.getGamesRequested();
						games.remove(gameId);
						guestUser.setGamesRequested(games);
						userService.update(guestUser);
					}
					gameService.removeById(gameId);
				}
				else {
					User newOwner = userService.getById(game.getGuests().get(0));
					game.setIdOwner(game.getGuests().get(0));
					ArrayList<Long> newOwnerGames = newOwner.getMyGames();
					newOwnerGames.add(gameId);
					newOwner.getGames().remove(gameId);
					userService.update(newOwner);
					gameService.update(game);
				}
			}
        	userService.removeById(user.getId());
        	return new ResponseEntity<>(new User(), HttpStatus.OK);
        }
        return new ResponseEntity<>(new User(), HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/favoriteusers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getMyFavoriteUsers(@RequestHeader(value = "Authorization") String token){
    	User user = tokenService.getUser(token);
        if(user != null){
            return new ResponseEntity<>(userService.getAllById(user.getFavoriteUsers()), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ArrayList<User>(), HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/favorite/{id}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<User> addOrRemoveFavoriteUser(@RequestHeader(value = "Authorization") String token,
    	@PathVariable("id") Long id){
    	User user = tokenService.getUser(token);
    	ArrayList<Long> favoriteUsers = user.getFavoriteUsers();
    	if (!favoriteUsers.contains(id)) {
    		favoriteUsers.add(id);
    		user.setFavoriteUsers(favoriteUsers);
    		userService.update(user);
            return new ResponseEntity<>(user, HttpStatus.CREATED);
    	} else {
    		favoriteUsers.remove(id);
    		user.setFavoriteUsers(favoriteUsers);
    		userService.update(user);
            return new ResponseEntity<>(user, HttpStatus.CREATED);
    	}  	
    }
    
    @RequestMapping(value = "/user/searchAddress", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> searchUserByAddress(@RequestHeader(value = "Authorization") String token, @RequestBody final SearchDTO searchDTO){
    	User user = tokenService.getUser(token);
    	if(user != null){
    		return new ResponseEntity<>(userService.findByAddress(searchDTO.getName()),HttpStatus.OK);
    	}

    	return new ResponseEntity<>(new ArrayList<User>(), HttpStatus.UNAUTHORIZED);
    }
    
    
    @RequestMapping(value = "/user/searchAddress", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> searchUserByName(@RequestHeader(value = "Authorization") String token, @RequestBody final SearchDTO searchDTO){
    	User user = tokenService.getUser(token);
    	if(user != null){
    		return new ResponseEntity<>(userService.findByName(searchDTO.getName()),HttpStatus.OK);
    	}

    	return new ResponseEntity<>(new ArrayList<User>(), HttpStatus.UNAUTHORIZED);
    }
    @RequestMapping(value = "/gameInvites", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Game>> getMyGameInvites(@RequestHeader(value = "Authorization") String token){
    	User user = tokenService.getUser(token);
        if(user != null){
            return new ResponseEntity<>(gameService.getAllById(user.getInvitesReceived()), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ArrayList<Game>(), HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/acceptInvite/{gameId}", method = RequestMethod.POST) 
    public ResponseEntity<Game> acceptInvite(@RequestHeader(value = "Authorization") String token, 
    		@PathVariable("gameId") Long gameId){
    	
    	User user = tokenService.getUser(token);
    	Game game = gameService.getById(gameId);
    	
    	if (user != null) {
    		game.getGuests().add(user.getId());
    		
    		user.getInvitesReceived().remove(game.getId());
    		user.getGames().add(gameId);
    		
    		return new ResponseEntity<>(gameService.update(game), HttpStatus.OK);
    	}
    	return new ResponseEntity<>(new Game(), HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/rejectInvite/{gameId}", method = RequestMethod.POST) 
    public ResponseEntity<Game> rejectInvite(@RequestHeader(value = "Authorization") String token, 
    		@PathVariable("gameId") Long gameId){
    	
    	User user = tokenService.getUser(token);
    	Game game = gameService.getById(gameId);
    	
    	if (user != null) {
    		user.getInvitesReceived().remove(game.getId());
    		
    		return new ResponseEntity<>(gameService.update(game), HttpStatus.OK);
    	}
    	return new ResponseEntity<>(new Game(), HttpStatus.UNAUTHORIZED);
    }
    
}