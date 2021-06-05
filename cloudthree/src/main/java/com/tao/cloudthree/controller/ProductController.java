package com.tao.cloudthree.controller;
import com.tao.cloudthree.Service.ProductService;
import com.tao.cloudthree.entity.Product;
import com.tao.cloudthree.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
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
    private ProductService productService;

    @GetMapping("/{id}")
    public Product test(@PathVariable("id") int id) {
        Product product = productService.selectById(id);
        return product;
    }

    @RequestMapping("/insert")
    public void insert() {
        int i = 0;
        long startTime = System.currentTimeMillis();   //获取开始时间
        while (i < 1000) {
            productService.insert();
            i++;
        }
        long endTime = System.currentTimeMillis(); //获取结束时间
        System.out.println("springcloud+while插入一千条数据时间： " + (endTime - startTime) + "ms");
    }

    @RequestMapping("/inserttwo")
    public void inserttwo() {
        productService.insert();
    }


    @RequestMapping("/delete")
    public void delete() {
        long startTime = System.currentTimeMillis();   //获取开始时间
        productService.delete();
        long endTime = System.currentTimeMillis(); //获取结束时间
        System.out.println("springcloud删除一千条数据时间： " + (endTime - startTime) + "ms");
    }

    @RequestMapping("/deletefirst")
    public String deletefirst() {
        try {
            productService.deletefirst();
            return "删除成功";
        } catch (Exception e) {
            return "删除失败";
        }
    }

    @RequestMapping("/insertall")
    public void insertall() {
        List<Product> products = new ArrayList<Product>();
        for (int i = 0; i < 1000; i++) {
            products.add(new Product("9090", "3"));
        }
        long startTime = System.currentTimeMillis();   //获取开始时间
        productService.addproducts(products);
        long endTime = System.currentTimeMillis(); //获取结束时间
        System.out.println("springcloud+list插入一千条数据时间： " + (endTime - startTime) + "ms");
    }

    @PostMapping("/insertAll")
    public void insertAll(@RequestParam("title") String title, @RequestParam("image") String image) {
       Product product= new Product(title,image);
        productService.addproduct(product);

    }

}
