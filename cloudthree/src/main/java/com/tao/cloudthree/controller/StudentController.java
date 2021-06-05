package com.tao.cloudthree.controller;

import com.tao.cloudfour.client.Client;
import com.tao.cloudthree.Mapper.Usermapper;
import com.tao.cloudthree.entity.Student;
import com.tao.cloudthree.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @GetMapping(value = "/detail")
    public Object getStudent () {
        Student student = new Student();
        student.setName("张三");
        student.setAge(18);
        return student;
    }
    @Autowired
    private Client client;
    @GetMapping("/info")
    public Object info() {
       return client.getStudet() ;
//        RestTemplate restTemplate = new RestTemplate();
//        return restTemplate.getForObject("http://localhost:8082/student/detail", List.class);
    }

//    @GetMapping(value ="id")
//    public void test( ) {
//        System.out.println(1213123);
//    }

//    @Autowired
//    private Usermapper usermapper;
//    @GetMapping("/{id}")
//    public User user(@PathVariable("id") int id) {
//        User users = usermapper.selectbyid(id);
//        return users;
//    }




}

