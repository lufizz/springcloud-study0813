package com.lt.gzj.sp.service.nacosdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: parent
 * @Package: com.lt.gzj.sp.service.nacosdemo.controller
 * @ClassName: gzj
 * @Author: gzj
 * @Description: ${description}
 * @Date: 2020/7/2 14:59
 * @Version: 1.0
 */
@RestController
public class TestController {
    @GetMapping("payment/nacos/")
    public String testNacos(){
        return "666";
    }
}
