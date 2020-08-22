package com.nine.bigbrother.controller;


import com.nine.bigbrother.entity.User;
import com.nine.bigbrother.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "api/getuserinfo")
    public List<User> getUserInfo(){
        return userService.getUserInfo();
    }

}
