package com.xuye.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient //激活Eureka中DiscoveryClient实现（自动化配置，创建DiscoveryClient接口针对Eureka客户端的EurekeDiscoveryClient实例），才能实现对Controller中对服务信息的输出
@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }
}
