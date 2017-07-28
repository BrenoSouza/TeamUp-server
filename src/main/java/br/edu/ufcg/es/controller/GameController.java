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
		super();
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
                    user.getId(),
                    game.getGuests());

            gameUpdate.setId(id);
            return new ResponseEntity<>(gameService.update(gameUpdate), HttpStatus.OK);
        }
        
        return new ResponseEntity<>(new Game(), HttpStatus.UNAUTHORIZED);
    }
    
    @RequestMapping(value = "/game", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> registerGame(@RequestHeader(value = "Authorization") String token,
    		@Valid @RequestBody RegisterGame registerGame){
    	User user = tokenService.getUser(token);
    	
        Game game = new Game(registerGame.getDate(),
                                registerGame.getLocal(),
                                registerGame.getSport(),
                                registerGame.getDescription(),
                                user.getId());
        
        gameService.create(game);
        updateUserGames(user, game.getId());
        return new ResponseEntity<>("Partida criada com sucesso.", HttpStatus.CREATED);
    }
    
    //melhorar
    private void updateUserGames(User user, long gameId){
    	ArrayList<Long> userGames = user.getMyGames();
    	userGames.add(gameId);
    	user.setMyGames(userGames);
    	userService.update(user);
    }
    
    private void updateGuestUserGames(User user, long gameId){
    	ArrayList<Long> userGames = user.getGames();
    	userGames.add(gameId);
    	user.setGames(userGames);
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
    
}
