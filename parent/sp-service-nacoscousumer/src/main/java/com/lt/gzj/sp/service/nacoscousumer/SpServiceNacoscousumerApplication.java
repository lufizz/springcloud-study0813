package com.lt.gzj.sp.service.nacoscousumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpServiceNacoscousumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpServiceNacoscousumerApplication.class, args);
    }

}
