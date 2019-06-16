package com.xin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActuatorApplication {
    public static void main(String[] args) {
        // 引入Actuator可以监控微服务情况
        // 开启服务,直接访问 "/health"
        SpringApplication.run(ActuatorApplication.class,args);
    }
}
