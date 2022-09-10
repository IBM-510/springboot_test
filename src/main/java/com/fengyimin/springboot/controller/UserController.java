package com.fengyimin.springboot.controller;

import com.fengyimin.springboot.entity.User;
import com.fengyimin.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @PostMapping
    public Integer save(@RequestBody User user){
        return userMapper.insert(user);
    }
    @GetMapping
    public List<User> index(){
        return userMapper.findALL();
    }
}
