package com.example.demo.services.impl;

import com.example.demo.entities.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;



@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    @Override
    public  Optional<User> getUserById(long used) {
        return userRepo.findById(used);
    }





}
