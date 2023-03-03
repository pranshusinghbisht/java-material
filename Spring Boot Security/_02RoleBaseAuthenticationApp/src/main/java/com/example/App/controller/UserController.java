package com.example.App.controller;

import com.example.App.model.User;
import com.example.App.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class UserController {

    @Autowired
    private UserService userService;

    //allusers
    @GetMapping("/")
    public List<User> getAllUsersHandler(){
        return this.userService.getAllUsers();
    }

    //return single user
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/{username}")
    public User getUserHandler(@PathVariable("username") String username){
        return this.userService.getUser(username);
    }

    //add user
    @PostMapping("/")
    public User addHandler(@RequestBody User user){
        return this.userService.addUser(user);
    }

}
