package com.tao.cloudthree.Service;

import com.tao.cloudthree.entity.Product;
import com.tao.cloudthree.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductService {

    public Product selectById(int id);

    void insert();

    void delete();

    void deletefirst();


    void addproducts(List<Product> products);

    void addproduct(Product product);
}

