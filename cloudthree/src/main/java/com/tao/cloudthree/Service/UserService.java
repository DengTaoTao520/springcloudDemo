package com.tao.cloudthree.Service;

import com.tao.cloudthree.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    public User selectById(Long id);

   void insert();

    void delete();

    void deletefirst();
    void addEmps(@Param("emps") List<User> emps);

    void addusers(List<User> users);

    void adduser(User user);
}

