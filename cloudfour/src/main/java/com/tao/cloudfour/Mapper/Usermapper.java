package com.tao.cloudfour.Mapper;

import com.tao.cloudfour.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface Usermapper {
    @Select("select * from user where id=#{id}")
    User selectbyid(int id);

}

