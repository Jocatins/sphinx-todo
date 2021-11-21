package com.sphinxtodo.sphinxtodo.controllers;

import com.sphinxtodo.sphinxtodo.models.Users;
import com.sphinxtodo.sphinxtodo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public List<Users> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping(value = "/users/{id}")
    public Users getUserId(@PathVariable Long id) {
        return userService.getUserId(id);
    }

    @PostMapping(value = "/users")
    public void addUser(@RequestBody Users users) {
        System.out.println(users);
        userService.addUser(users);
    }

    @PutMapping(value = "/users/{id}")
    public void updateUser(@RequestBody Users users, @PathVariable Long id) {
        userService.updateUser(users);
    }

    @DeleteMapping(value = "/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
