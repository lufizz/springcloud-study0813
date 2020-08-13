package com.lt.gzj.sp.service.sr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpServiceSrApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpServiceSrApplication.class, args);
    }

}
