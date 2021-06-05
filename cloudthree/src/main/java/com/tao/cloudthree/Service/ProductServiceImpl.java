package com.tao.cloudthree.Service;

import com.tao.cloudthree.Mapper.Productmapper;
import com.tao.cloudthree.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    Productmapper productmapper;

    @Override
    public Product selectById(int id) {
        return productmapper.selectById(id);
    }

    @Override
    public void insert() {
        productmapper.insert();
    }

    @Override
    public void delete() {
        productmapper.delete();
    }

    @Override
    public void deletefirst() {
        productmapper.deletefirst();
    }



    @Override
    public void addproducts(List<Product> products) {
        productmapper.addproducts(products);
    }

    @Override
    public void addproduct(Product product) {

        productmapper.addproduct(product.getTitle(),product.getImage());
    }
}
