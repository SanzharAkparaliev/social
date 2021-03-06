package com.example.hibernate.controller;

import com.example.hibernate.models.Post;
import com.example.hibernate.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/posts/addNew")
    public void AddPost(@RequestBody Post post){
        postService.addPost(post);
    }

    @PutMapping("/posts/{id}/update")
    public void UpdatePost(@RequestBody Post post){
        postService.updatePots(post);
    }

    @DeleteMapping("/post/{id}/delete")
    public void DeletePost(@PathVariable Integer id){
        postService.deletePost(id);
    }
}
