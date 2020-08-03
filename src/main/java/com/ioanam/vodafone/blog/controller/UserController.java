package com.ioanam.vodafone.blog.controller;

import com.ioanam.vodafone.blog.entities.User;
import com.ioanam.vodafone.blog.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/blog")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/user/{id}")
    public Optional<User> getUserById(@PathVariable("id") Integer id) {
        return userService.getUserById(id);
    }

    @PostMapping(value = "/user")
    public void saveUser(@RequestBody User user) {
        userService.saveOrUpdate(user);
    }
    
}
