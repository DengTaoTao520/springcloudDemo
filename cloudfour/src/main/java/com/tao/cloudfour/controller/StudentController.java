package com.tao.cloudfour.controller;

import com.tao.cloudfour.Mapper.Usermapper;
import com.tao.cloudfour.client.Client;
import com.tao.cloudfour.entity.Student;
import com.tao.cloudfour.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    /**
     *  获取一个学生
     * @return JSON对象
     * */
    @GetMapping(value = "/detail")
    public Object getStudent () throws InterruptedException {
//        TimeUnit.SECONDS.sleep(6);
        Student student = new Student();
        //可以看到，我们没有在实体类写get和set方法，但是我们依然可以调用这些方法
        //这就是Lombok插件的好处，只需要在实体类加一个@Data注解
        student.setName("李艾");
        student.setAge(18);
        return student;
    }


//    @GetMapping(value ="id")
//    public void test( ) {
//        System.out.println(1213123);
//    }

    @Autowired
    private Usermapper usermapper;
    @GetMapping("/{id}")
    public User user(@PathVariable("id") int id) {
        User users = usermapper.selectbyid(id);
        return users;
    }






}

