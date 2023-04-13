package com.example.demo.services.interfaces;

import com.example.demo.entities.User;
import com.example.demo.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UserService {
     Optional<User> getUserById(long used);
}



