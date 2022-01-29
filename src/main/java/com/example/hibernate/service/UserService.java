package com.example.hibernate.service;

import com.example.hibernate.models.User;
import com.example.hibernate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public Optional<User> getUserById(Integer id) {
        return userRepository.findById(id);
    }

    public List<User> getUsersByLocation(Integer id) {
        return userRepository.findByLocationId(id);
    }

    public void InsertUser(User user){
        userRepository.save(user);
    }

    public void UpdateUser(User user) {
        userRepository.save(user);
    }
}
