package com.lt.gzj.sp.service.sentinel8401;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.PathVariable;

public class FallBack {

    public static String handlerFallback(@PathVariable String id){
        return id+"fallBackA";
    }
    public static String fallBackB(){
        return "fallBackB阻塞";
    }
}
