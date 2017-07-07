package br.edu.ufcg.es.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufcg.es.model.User;
import br.edu.ufcg.es.model.DTO.RegisterUser;
import br.edu.ufcg.es.service.UserService;

@RestController
@CrossOrigin
public class UserController {
    private UserService userService;
    private TokenService tokenService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getAllUser(){
       return new ResponseEntity<>(userService.getAll(),HttpStatus.OK);

    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id){
    	return new ResponseEntity<>(userService.getById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> editUser(@Valid @RequestBody final RegisterUser registerUser){
            User user = new User(registerUser.getName(),
                    registerUser.getEmail(),
                    registerUser.getPassword(),
                    registerUser.getPhone(),
                    registerUser.getAddress());

            user.setId(user.getId());
            return new ResponseEntity<>(userService.update(user), HttpStatus.OK);
    }
}