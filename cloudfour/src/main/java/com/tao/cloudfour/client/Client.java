package com.tao.cloudfour.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
// 此注解用于声明一个Feign客户端，name属性指定服务的名称
@FeignClient(name = "PRODUCT")
public interface Client {
    /**
     * 商品列表接口，注意这里的uri要写全
     *
     * @return Product List
     */
    @GetMapping("/student/detail")
    Object getStudet();
}
