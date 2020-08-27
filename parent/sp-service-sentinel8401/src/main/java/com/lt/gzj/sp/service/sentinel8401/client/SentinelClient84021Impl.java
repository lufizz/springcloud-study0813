package com.lt.gzj.sp.service.sentinel8401.client;

import org.springframework.stereotype.Component;

@Component
public class SentinelClient84021Impl implements SentinelClient8402 {
    @Override
    public String testA(String name) {
        return "feign失败调用666";
    }
}
