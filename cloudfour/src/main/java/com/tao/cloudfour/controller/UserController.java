package com.tao.cloudfour.controller;

import com.tao.cloudfour.Mapper.Usermapper;
import com.tao.cloudfour.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/user")
public class UserController {
//    @Autowired
//    private UserMapper userMapper;
//    @GetMapping("/{id}")
//    public User user(@PathVariable("id") int id) {
////        User users = userMapper.selectbyid(id);
////        return users;
//
//    }
    @Autowired
    private Usermapper usermapper;
    @GetMapping(value = "/{id}",produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User test(@PathVariable("id") int id) {
      User user = usermapper.selectbyid(id);
      return user;
    }
}
