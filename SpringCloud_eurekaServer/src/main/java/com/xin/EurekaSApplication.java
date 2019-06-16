package com.xin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaSApplication.class).web(true).run(args);
    }
}
