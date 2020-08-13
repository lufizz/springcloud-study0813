package com.lt.gzj.sp.service.order.controller;

import com.lt.gzj.sp.service.order.dto.MemberAccInfo;
import com.lt.gzj.sp.service.order.mappers.MemberAccInfoMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ProjectName: parent
 * @Package: com.lt.gzj.sp.service.order.controller
 * @ClassName: gzj
 * @Author: gzj
 * @Description: ${description}
 * @Date: 2020/6/10 16:17
 * @Version: 1.0
 */
@RestController
@RequestMapping("/v1/test")

public class TestController {

    @Autowired
    MemberAccInfoMapper memberAccInfoMapper;

    /**
     *
     * @param memberCode
     * @return
     */
    @GetMapping("queryMember/{memberCode}")
    public Object queryMember(@PathVariable("memberCode")String memberCode){
        List<MemberAccInfo> list =  memberAccInfoMapper.queryByMember(memberCode);
        ExecutorService executorService = Executors.newFixedThreadPool()
        return list;
    }

    @PostMapping("query")
    public List<MemberAccInfo> query(@Param("memberCode") String memberCode){
        return  null;
    }

}
