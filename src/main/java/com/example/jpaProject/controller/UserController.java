package com.example.jpaProject.controller;

import com.example.jpaProject.entity.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/")
    public String main(){
        return "Hello UserController";
    }

    @PostMapping("/user")
    public UserEntity user(UserEntity user){
        return user;
    }
}
