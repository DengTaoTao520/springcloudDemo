package com.tao.cloudtwo.Controller;

import com.tao.cloudtwo.Mapper.UserMapper;
import com.tao.cloudtwo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/{id}")
    public User user(@PathVariable("id") int id) {
        User users = userMapper.selectbyid(id);
        return users;
    }
}

