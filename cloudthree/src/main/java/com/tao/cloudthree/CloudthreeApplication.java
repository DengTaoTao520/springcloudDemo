package com.tao.cloudthree;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages="com.tao.cloudfour.client")
//@EntityScan(basePackages = {"com.tao.cloudthree.entity"})
@MapperScan(basePackages = {"com.tao.cloudthree.Mapper"})
public class CloudthreeApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudthreeApplication.class, args);
    }
}
