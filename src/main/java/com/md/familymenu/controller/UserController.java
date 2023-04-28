package com.md.familymenu.controller;

import com.md.familymenu.model.Test;
import com.md.familymenu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author md
 * @version 1.0.0
 * @description 用户登录Controller
 * @date 2023-04-24 4:39 PM
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/login")
    public String login(Test test){
        return "you did it";
    }
}
