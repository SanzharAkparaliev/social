package com.example.hibernate.controller;

import com.example.hibernate.models.Post;
import com.example.hibernate.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("posts")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/post/{id}")
    public Optional<Post> getPotsById(@PathVariable("id") Integer id){
        return postService.getPotsById(id);

    }

    @GetMapping("/posts/user/{id}/posts")
    public List<Post> GetPostsByUser(@PathVariable("id") Integer id){
        return postService.getPotsByUser(id);
    }
}
