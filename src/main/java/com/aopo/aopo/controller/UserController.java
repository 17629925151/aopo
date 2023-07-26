package com.aopo.aopo.controller;


import com.aopo.aopo.domain.User;
import com.aopo.aopo.domain.mapper.UserMapper;
import com.aopo.aopo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/getUser")
    public List<User> getUsers(){
        return userService.getAll();
    }

    @RequestMapping("/getUser/admin")
    public String getName() {
        return userService.getName();
    }


    @RequestMapping("getUser/admin/resp")
    public String getResult(){
        ;return userService.getResponse();
    }
}
