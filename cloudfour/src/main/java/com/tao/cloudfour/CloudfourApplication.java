package com.tao.cloudfour;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.tao.cloudfour.Mapper"})
public class CloudfourApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudfourApplication.class, args);
    }
}
