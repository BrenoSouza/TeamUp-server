package br.edu.ufcg.es.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufcg.es.component.TokenService;
import br.edu.ufcg.es.model.Game;
import br.edu.ufcg.es.model.User;
import br.edu.ufcg.es.service.GameService;

@RestController
@CrossOrigin
public class GameController {
    private GameService gameService;
    private TokenService tokenService;
    
    @Autowired
	public GameController(GameService gameService, TokenService tokenService) {
		this.gameService = gameService;
		this.tokenService = tokenService;
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
    public ResponseEntity<Game> getGameById(@RequestHeader(value = "Authorization") String token, @PathVariable("id") Long id){
    	User user = tokenService.getUser(token);
        if(user != null){
            return new ResponseEntity<>(gameService.getById(id), HttpStatus.OK);
        }
        return new ResponseEntity<>(new Game(), HttpStatus.UNAUTHORIZED);
    }
	
}
