package com.lt.gzj.sp.service.sentinel8401.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lt.gzj.sp.service.sentinel8401.FallBack;
import com.lt.gzj.sp.service.sentinel8401.client.SentinelClient8402;
import com.lt.gzj.sp.service.sentinel8401.client.SentinelClient84021Impl;
import com.lt.gzj.sp.service.sentinel8401.client.SentinelClient8402Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
//    @Autowired
//    SentinelClient8402 sentinelClient8402;
//    @Autowired
//    SentinelClient8402Impl sentinelClient8402;
    @Autowired
    SentinelClient84021Impl sentinelClient8402;

    @GetMapping("/testA/{id}")
//    @SentinelResource(value = "fallback",fallback = "handlerFallback")
//    @SentinelResource(value = "fallback",fallbackClass = FallBack.class,fallback = "handlerFallback")
    @SentinelResource(value = "fallback",blockHandler = "blockHandler")
    public String testA(@PathVariable("id") String id){
        String result = sentinelClient8402.testA("kobe");
        if("4".equals(id)){
            throw new RuntimeException("参数异常");
        }
        return result;
    }

    public String handlerFallback(@PathVariable String id){
        return id+"异常";
    }

    @GetMapping("/testB/{id}")
    @SentinelResource(value = "fallback2",blockHandler = "blockHandler")
    public String testB(@PathVariable("id") String id){
//        try {
//            Thread.sleep(8000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        String result = sentinelClient8402.testA("James");
        if("4".equals(id)){
            throw new RuntimeException("参数异常");
        }
        return result;
    }
    public String blockHandler(String id, BlockException e){
        return "blockHandler异常"+id;
    }
}
