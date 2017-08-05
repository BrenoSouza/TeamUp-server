package br.edu.ufcg.es.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import br.edu.ufcg.es.model.User;
import br.edu.ufcg.es.model.DTO.RegisterUser;
import br.edu.ufcg.es.service.UserService;

@RestController
@CrossOrigin
public class RegisterController {
    private UserService userService;

    @Autowired
    public RegisterController(UserService userService) {
        this.userService = userService;
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<User> registerUser(@Valid @RequestBody RegisterUser registerUser){
        User user = new User(registerUser.getName(),
                                registerUser.getEmail(),
                                registerUser.getPassword(),
                                registerUser.getPhone(),
                                registerUser.getAddress());
        if(userService.getByEmail(user.getEmail()) == null) {
        	userService.create(user);
        	return new ResponseEntity<>(user, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(new User(), HttpStatus.CONFLICT);
    }
}