package com.example.hibernate.repository;

import com.example.hibernate.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
    List<User> findByLocationId(Integer id);
}
