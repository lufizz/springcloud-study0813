package com.lt.gzj.sp.service.nacoscousumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: parent
 * @Package: com.lt.gzj.sp.service.nacoscousumer
 * @ClassName: gzj
 * @Author: gzj
 * @Description: ${description}
 * @Date: 2020/7/2 16:04
 * @Version: 1.0
 */
@RestController
public class Controller {

    @Value(value = "${service-url.nacos-user-service}")
    String serverUrl;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/v1/nacos/Cousumer/{id}")
    public Object testCousumer(@PathVariable("id") String id){
        return restTemplate.getForObject(serverUrl + "/payment/nacos/", String.class);
    }
}
