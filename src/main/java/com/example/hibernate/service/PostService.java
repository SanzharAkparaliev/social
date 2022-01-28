package com.example.hibernate.service;


import com.example.hibernate.models.Post;
import com.example.hibernate.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.Access;
import javax.persistence.PostRemove;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return (List<Post>) postRepository.findAll();
    }

    public Optional<Post> getPotsById(Integer id){
        return postRepository.findById(id);
    }
}
