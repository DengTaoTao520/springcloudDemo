package com.tao.cloudone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Cloudoneapplication {
    public static void main(String[] args) {
        SpringApplication.run( Cloudoneapplication.class, args);
    }
}
