package com.tao.cloudthree.Mapper;

import com.tao.cloudthree.entity.User;
import io.micrometer.core.instrument.util.JsonUtils;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

@Repository
@Mapper
public interface Usermapper {
//    @Select("select * from user where id=#{id}")
//    User selectbyid(int id);

    void insert();

    public User selectById(@Param("id") Long id);

    void delete();


    void deletefirst();

    void addEmps(@Param("emps") List<User> emps);

    void addusers(@Param("users")List<User> users);

    void adduser(@Param("username")String username,@Param("password")String password);
}
