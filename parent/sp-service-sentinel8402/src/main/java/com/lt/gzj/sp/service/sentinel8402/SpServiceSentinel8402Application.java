package com.lt.gzj.sp.service.sentinel8402;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpServiceSentinel8402Application {

    public static void main(String[] args) {
        SpringApplication.run(SpServiceSentinel8402Application.class, args);
    }

}
