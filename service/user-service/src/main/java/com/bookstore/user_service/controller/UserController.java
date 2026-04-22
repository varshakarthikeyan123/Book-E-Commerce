package com.bookstore.user_service.controller;

import com.bookstore.user_service.entity.User;
import com.bookstore.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    public User addUser(@RequestBody User user) {
        return repository.save(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }
}