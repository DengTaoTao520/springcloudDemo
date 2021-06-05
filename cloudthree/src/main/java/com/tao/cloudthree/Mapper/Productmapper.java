package com.tao.cloudthree.Mapper;

import com.tao.cloudthree.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Productmapper {

    void insert();

    public Product selectById(@Param("id") int id);
    void delete();

    void deletefirst();

    void addproducts(@Param("products")List<Product> products);

    void addproduct(@Param("title")String title,@Param("image")String image);
}
