package com.tao.cloudthree.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Product {

    private int id;
    private String title;
    private String image;
    private String likes="0";


    public Product(String title, String image) {
        this.title=title;
        this.image=image;
    }
}
