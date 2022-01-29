package com.example.hibernate.controller;

import com.example.hibernate.models.Post;
import com.example.hibernate.models.User;
import com.example.hibernate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> gelAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable("id") Integer id){
        return userService.getUserById(id);
    }

    @GetMapping("/user/{id}/posts")
    public List<Post> getPostsByUser(@PathVariable("id") Integer id){
        Optional<User> user = userService.getUserById(id);
        if(user.isPresent()){
            User newUser = user.get();
            return newUser.getPosts();
        }
        return null;
    }

    @GetMapping("/users/location/{id}/users")
    public List<User> getUsersByLocation(@PathVariable("id") Integer id){
        return userService.getUsersByLocation(id);
    }

    @PostMapping("/users/addNew")
    public void AddUser(@RequestBody User user){
        userService.InsertUser(user);
    }


    @PutMapping("/user/{id}/update")
    public void UpdateUser(@RequestBody User user){
        userService.UpdateUser(user);
    }
}
