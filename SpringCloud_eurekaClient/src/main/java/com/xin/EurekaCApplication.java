package com.xin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //注册服务发现
public class EurekaCApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaCApplication.class,args);
    }
}
