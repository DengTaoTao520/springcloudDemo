package com.tao.cloudthree.controller;
import com.tao.cloudthree.Mapper.Usermapper;
import com.tao.cloudthree.Service.UserService;
import com.tao.cloudthree.entity.User;
import org.apache.ibatis.annotations.Param;
import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    //    @Autowired
//    private UserMapper userMapper;
//    @GetMapping("/{id}")
//    public User user(@PathVariable("id") int id) {
////        User users = userMapper.selectbyid(id);
////        return users;
//
//    }
//    @Autowired
//    private Usermapper usermapper;
//    @GetMapping("/{id}")
//    public User test(@PathVariable("id") int id) {
//      User user = usermapper.selectbyid(id);
//      return user;
//    }
    //   @GetMapping("/insert")
//    public void insert(){
//       System.out.println(12312);
//        usermapper.insert("1","2");
//
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User test(@PathVariable("id") Long id) {
        User user = userService.selectById(id);

        return user;
    }

    @RequestMapping("/insert")
    public void insert() {
        int i = 0;
        long startTime = System.currentTimeMillis();   //获取开始时间
        while (i < 1000) {
            userService.insert();
            i++;
        }
        long endTime = System.currentTimeMillis(); //获取结束时间
        System.out.println("springcloud+while插入一千条数据时间： " + (endTime - startTime) + "ms");
    }

    @RequestMapping("/inserttwo")
    public void inserttwo() {
        userService.insert();
    }


    @RequestMapping("/delete")
    public void delete() {
        long startTime = System.currentTimeMillis();   //获取开始时间
        userService.delete();
        long endTime = System.currentTimeMillis(); //获取结束时间
        System.out.println("springcloud删除一千条数据时间： " + (endTime - startTime) + "ms");
    }

    @RequestMapping("/deletefirst")
    public String deletefirst() {
        try {
            userService.deletefirst();
            return "删除成功";
        } catch (Exception e) {
            return "删除失败";
        }
    }

    @RequestMapping("/insertall")
    public void insertall() {
        List<User> users = new ArrayList<User>();
        for (int i = 0; i < 1000; i++) {
            users.add(new User("9090", "3"));
        }
        long startTime = System.currentTimeMillis();   //获取开始时间
        userService.addusers(users);
        long endTime = System.currentTimeMillis(); //获取结束时间
        System.out.println("springcloud+list插入一千条数据时间： " + (endTime - startTime) + "ms");
    }

    @PostMapping("/insertAll")
    public void insertAll(@RequestParam("username") String username, @RequestParam("password") String password) {
        User user = new User(username, password);
        userService.adduser(user);

    }

}
