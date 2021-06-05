package com.tao.cloudtwo.Mapper;

import com.tao.cloudtwo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where id=#{id}")
    User selectbyid(int id);
}

