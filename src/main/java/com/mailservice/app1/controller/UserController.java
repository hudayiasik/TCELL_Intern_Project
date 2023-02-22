package com.mailservice.app1.controller;

import com.mailservice.app1.exception.ResourceNotFoundException;
import com.mailservice.app1.model.User;
import com.mailservice.app1.repository.UserRepository;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/domain")
public class UserController {
    private UserRepository userRepository;
    @GetMapping("/user")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    //user by Id
    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUsersById(@PathVariable(value = "id") Long userId)
            throws ResourceNotFoundException {
        User user =
                userRepository
                        .findById(userId)
                        .orElseThrow(() -> new ResourceNotFoundException("User not found on :: " + userId));
        return ResponseEntity.ok().body(user);
    }
    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }




}
