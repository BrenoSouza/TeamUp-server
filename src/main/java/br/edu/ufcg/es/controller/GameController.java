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
import br.edu.ufcg.es.model.DTO.RatingParameters;
import br.edu.ufcg.es.model.DTO.RegisterGame;
import br.edu.ufcg.es.service.GameService;
import br.edu.ufcg.es.service.UserService;

@RestController
@CrossOrigin
public class GameController {
    private GameService gameService;
    private TokenService tokenService;
    private UserService userService;
    
    @Autowired
    public GameController(GameService gameService, TokenService tokenService, UserService userService) {
		this.gameService = gameService;
		this.tokenService = tokenService;
		this.userService = userService;
	}
    
    @RequestMapping(value = "/game", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Game>> getAllGame(@RequestHeader(value = "Authorization") String token){
       User user = tokenService.getUser(token);
       if(user != null){
           return new ResponseEntity<>(gameService.getAll(),HttpStatus.OK);
       }

       return new ResponseEntity<>(new ArrayList<Game>(), HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/game/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Game> getGameById(@RequestHeader(value = "Authorization") String token,
    		@PathVariable("id") Long id){
    	User user = tokenService.getUser(token);
        if(user != null){
            return new ResponseEntity<>(gameService.getById(id), HttpStatus.OK);
        }
        return new ResponseEntity<>(new Game(), HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/game/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Game> editGame(@RequestHeader(value = "Authorization") String token,
    		@Valid @RequestBody final RegisterGame registerGame, @PathVariable("id") Long id){
        User user = tokenService.getUser(token);
        Game game = gameService.getById(id);
        
        if (game.getIdOwner() == user.getId()){
        	Game gameUpdate = new Game(registerGame.getDate(),
                    registerGame.getLocal(),
                    registerGame.getSport(),
                    registerGame.getDescription(),
                    registerGame.getName());
        	gameUpdate.setIdOwner(user.getId());
        	gameUpdate.setGuests(game.getGuests());
        	gameUpdate.setGuestRequests(game.getGuestsRequests());
        	gameUpdate.setFinished( game.isFinished());
            
            gameUpdate.setId(id);
            return new ResponseEntity<>(gameService.update(gameUpdate), HttpStatus.OK);
        }
        
        return new ResponseEntity<>(new Game(), HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/game", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Game> registerGame(@RequestHeader(value = "Authorization") String token,
    		@Valid @RequestBody RegisterGame registerGame){
    	User user = tokenService.getUser(token);
    	
        Game game = new Game(registerGame.getDate(),
                                registerGame.getLocal(),
                                registerGame.getSport(),
                                registerGame.getDescription(),
                                registerGame.getName());
        game.setIdOwner(user.getId());
        
        gameService.create(game);
        game.getGuests().add(user.getId());
        updateUserGames(user, game.getId());
        return new ResponseEntity<>(gameService.update(game), HttpStatus.CREATED);
    }
    
    private void updateUserGames(User user, long gameId){ // adiciona uma partida a lista de partidas em que
    	ArrayList<Long> userGames = user.getMyGames();	  // o usuario é o dono
    	userGames.add(gameId);
    	user.setMyGames(userGames);
    	userService.update(user);
    }
    
    @RequestMapping(value = "/mygames", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Game>> getMyGames(@RequestHeader(value = "Authorization") String token){
    	User user = tokenService.getUser(token);
        if(user != null){
            return new ResponseEntity<>(gameService.getAllById(user.getMyGames()), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ArrayList<Game>(), HttpStatus.UNAUTHORIZED);
    }
    
    // Retornar as partidas que eu participo mas que não sou dono, depois ajeitar o nome da rota
    @RequestMapping(value = "/games", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Game>> getGames(@RequestHeader(value = "Authorization") String token){
    	User user = tokenService.getUser(token);
        if(user != null){
            return new ResponseEntity<>(gameService.getAllById(user.getGames()), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ArrayList<Game>(), HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/guests/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getGameGuests(@RequestHeader(value = "Authorization") String token,
    		@PathVariable("id") Long id){
    	User user = tokenService.getUser(token);
    	Game game = gameService.getById(id);
        if(user != null) {
            return new ResponseEntity<>(userService.getAllById(game.getGuests()), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ArrayList<User>(), HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/gameRequest/{id}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Game> requestGame(@RequestHeader(value = "Authorization") String token,
        	@PathVariable("id") Long id){
    	
    	User user = tokenService.getUser(token);
    	Game game = gameService.getById(id);
    	
    	if (user != null) {
        	ArrayList<Long> guestRequests = game.getGuestsRequests();
        	guestRequests.add(user.getId());
        	game.setGuestRequests(guestRequests);
        	
        	ArrayList<Long> gamesRequested = user.getGamesRequested();
        	gamesRequested.add(id);
        	user.setGamesRequested(gamesRequested);
        	
        	userService.update(user);
        	return new ResponseEntity<>(gameService.update(game), HttpStatus.OK);
    	}
    	return new ResponseEntity<>(new Game(), HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/acceptRequest/{gameId}/{requestedId}", method = RequestMethod.POST) 
    public ResponseEntity<Game> acceptRequest(@RequestHeader(value = "Authorization") String token, 
    		@PathVariable("gameId") Long gameId, @PathVariable("requestedId") Long requestedId ){
    	
    	User user = tokenService.getUser(token);
    	User requestUser = userService.getById(requestedId);
    	Game game = gameService.getById(gameId);
    	
    	if (user != null && user.getId() == game.getIdOwner()) {
    		game.getGuests().add(requestedId);
    		game.getGuestsRequests().remove(requestedId);
    		requestUser.getGamesRequested().remove(game.getId());
    		requestUser.getGames().add(gameId);
    		
    		return new ResponseEntity<>(gameService.update(game), HttpStatus.OK);
    	}
    	return new ResponseEntity<>(new Game(), HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/rejectRequest/{gameId}/{requestedId}", method = RequestMethod.POST)
    public ResponseEntity<Game> rejectRequest(@RequestHeader(value = "Authorization") String token, 
    		@PathVariable("gameId") Long gameId, @PathVariable("requestedId") Long requestedId){
    	
    	User user = tokenService.getUser(token);
    	User requestUser = userService.getById(requestedId);
    	Game game = gameService.getById(gameId);
    	
    	if (user != null && user.getId() == game.getIdOwner()) {
    		game.getGuestsRequests().remove(requestedId);
    		requestUser.getGamesRequested().remove(gameId);
    		
    		return new ResponseEntity<>(gameService.update(game), HttpStatus.OK);
    	}    	
    	return new ResponseEntity<>(new Game(), HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/invite/{id}/{userId}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Game> inviteUser(@RequestHeader(value = "Authorization") String token,
        	@PathVariable("id") Long id, @PathVariable("userId") Long userId){
    	
    	User user = tokenService.getUser(token);
    	Game game = gameService.getById(id);
    	User invitedUser = userService.getById(userId);
    	
    	if (user != null && user.getId() == game.getIdOwner()) {
    		invitedUser.getInvitesReceived().add(id);
    		
        	userService.update(invitedUser);
        	return new ResponseEntity<>(gameService.update(game), HttpStatus.OK);
    	}
    	return new ResponseEntity<>(game, HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/guestRequests/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getGameRequests(@RequestHeader(value = "Authorization") String token,
    		@PathVariable("id") Long id){
    	User user = tokenService.getUser(token);
    	Game game = gameService.getById(id);
        if(user != null && user.getId() == game.getIdOwner()) {
            return new ResponseEntity<>(userService.getAllById(game.getGuestsRequests()), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ArrayList<User>(), HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/leaveGame/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> leaveGame(@RequestHeader(value = "Authorization") String token,
    		@PathVariable("id") Long id){
    	User user = tokenService.getUser(token);
    	Game game = gameService.getById(id);
    	if (user != null) {
    		
			ArrayList<Long> guestUsers = game.getGuests();
			guestUsers.remove(user.getId());
			game.setGuests(guestUsers);
			gameService.update(game);
			
    		if (user.getId() != game.getIdOwner()) {
    			ArrayList<Long> games = user.getGames();
    			games.remove(id);
    			user.setGames(games);
    		}
    		else {
    			ArrayList<Long> games = user.getMyGames();
    			games.remove(id);
    			user.setMyGames(games);
    			
				if (game.getGuests().isEmpty()) {
					//remove os pedidos de entrada na partida
		        	ArrayList<Long> guestRequests = game.getGuestsRequests();
		        	for (Long userId : guestRequests) {
						User guestUser = userService.getById(userId);
						games = guestUser.getGamesRequested();
						games.remove(id);
						guestUser.setGamesRequested(games);
						userService.update(guestUser);
					}
					gameService.removeById(id);
				}
				else {
					User newOwner = userService.getById(game.getGuests().get(0));
					game.setIdOwner(game.getGuests().get(0));
					ArrayList<Long> newOwnerGames = newOwner.getMyGames();
					newOwnerGames.add(id);
					newOwner.getGames().remove(id);
					userService.update(newOwner);
					gameService.update(game);
				}
    		}
    		userService.update(user);
    		return new ResponseEntity<>(user, HttpStatus.OK);
    	}
    	return new ResponseEntity<>(user, HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/kickUser/{id}/{userId}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Game> kickUser(@RequestHeader(value = "Authorization") String token,
    		@PathVariable("id") Long id, @PathVariable("userId") Long userId){
    	User user = tokenService.getUser(token);
    	User guestUser = userService.getById(userId);
    	Game game = gameService.getById(id);
    	if (user != null && user.getId() == game.getIdOwner()) {
			ArrayList<Long> games = guestUser.getGames();
			games.remove(id);
			guestUser.setGames(games);
			
			ArrayList<Long> guestUsers = game.getGuests();
			guestUsers.remove(guestUser.getId());
			game.setGuests(guestUsers);
			
    		return new ResponseEntity<>(gameService.update(game), HttpStatus.OK);
    	}
    	return new ResponseEntity<>(new Game(), HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/game/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> deleteGame(@RequestHeader(value = "Authorization") String token,
    		@PathVariable("id") Long id){
        User user = tokenService.getUser(token);
        Game game = gameService.getById(id);
        ArrayList<Long> games;
        ArrayList<Long> guestUsers;
        User guestUser;
        
        if (game.getIdOwner() == user.getId()) {
        	games = user.getMyGames();
        	games.remove(id);
        	user.setMyGames(games);
        	userService.update(user);
        	
        	guestUsers = game.getGuests();
        	for (Long userId : guestUsers) {
				guestUser = userService.getById(userId);
				games = guestUser.getGames();
				games.remove(id);
				guestUser.setGames(games);
				userService.update(guestUser);
			}
        	
        	guestUsers = game.getGuestsRequests();
        	for (Long userId : guestUsers) {
				guestUser = userService.getById(userId);
				games = guestUser.getGamesRequested();
				games.remove(id);
				guestUser.setGamesRequested(games);
				userService.update(guestUser);
			}
        	
        	gameService.removeById(id);
        	return new ResponseEntity<>(user, HttpStatus.OK);
        }
        return new ResponseEntity<>(user, HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/evaluate/{id}/{userId}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Game> evaluateUsers(@RequestHeader(value = "Authorization") String token,
        	@PathVariable("id") Long id, @PathVariable("userId") Long userId,
        	@RequestBody RatingParameters rating){
    	
    	User user = tokenService.getUser(token);
    	Game game = gameService.getById(id);
    	User evaluatedUser = userService.getById(userId);
    	
    	if ((user != null) && (!user.getId().equals(evaluatedUser.getId()))) {
    		evaluatedUser.computeRating(rating.getAbility(), rating.getFairPlay());
    		
        	userService.update(evaluatedUser);
        	return new ResponseEntity<>(gameService.update(game), HttpStatus.OK);
    	}
    	return new ResponseEntity<>(game, HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/endGame/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Game> endGame(@RequestHeader(value = "Authorization") String token,
    		@PathVariable("id") Long id){
       User user = tokenService.getUser(token);
       Game game = gameService.getById(id);
       
       if(user != null && user.getId() == game.getIdOwner()){
    	   game.setFinished(true);
    	   
           return new ResponseEntity<>(gameService.update(game),HttpStatus.OK);
       }
       return new ResponseEntity<>(game, HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/usersToEvaluate/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getUsersToEvaluate(@RequestHeader(value = "Authorization") String token,
    		@PathVariable("id") Long id){
    	User user = tokenService.getUser(token);
    	Game game = gameService.getById(id);
        if(user != null && game.isFinished() == true) {
        	ArrayList<User> users = (ArrayList<User>) userService.getAllById(game.getGuests());
        	users.remove(user);
        	
            return new ResponseEntity<>(users, HttpStatus.OK);
        }
        return new ResponseEntity<>(new ArrayList<User>(), HttpStatus.UNAUTHORIZED);
    }
    
}
