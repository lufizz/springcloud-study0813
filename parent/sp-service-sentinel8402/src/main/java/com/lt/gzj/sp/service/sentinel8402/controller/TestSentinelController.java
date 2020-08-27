package com.lt.gzj.sp.service.sentinel8402.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSentinelController {
    @GetMapping("v1/sentinel/testa/{name}")
    public String testA(@PathVariable("name") String name){
        System.out.println("123");
        return "ttt"+name;
    }
}
