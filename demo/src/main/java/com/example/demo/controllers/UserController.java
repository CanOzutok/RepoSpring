package com.example.demo.controllers;

import com.example.demo.entities.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.services.impl.UserServiceImpl;
import com.example.demo.services.interfaces.PostService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServiceImpl userService;
    private PostService postService;
    private UserRepo userRepo;

    @Autowired
    public UserController(UserServiceImpl userService, PostService postService, UserRepo userRepo) {
        this.userService = userService;
        this.postService = postService;
        this.userRepo = userRepo;
    }

    @GetMapping(path = "/{id}")
    public User getAllUsers(@PathVariable Long id) {

        //return new User();
        Optional<User> opt = userService.getUserById(id);

        if(opt.isPresent()){
            return opt.get();
        }else{
            throw new EntityNotFoundException();
        }
    }

    @PostMapping
    public User createUser(@RequestBody User newUser) {


        return userRepo.save(newUser);

    }

/*
    @GetMapping("/{userId}")
    public Optional<User> getOneUser(@PathVariable Long userId){
        return userRepo.findById(userId);
    }
    /*
    @PutMapping("/{userId}")
    public Users updateUser(@PathVariable Long  userId){
        optional <Users> user = userRepo.findById(userId);
        if(users.isPresent())
            Users foundUser = user.get(newUser.getUserName());


    }
    */
    }

