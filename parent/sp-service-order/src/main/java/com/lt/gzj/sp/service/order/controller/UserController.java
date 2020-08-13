package com.lt.gzj.sp.service.order.controller;

/**
 * @ProjectName: parent
 * @Package: com.lt.gzj.sp.service.order.controller
 * @ClassName: gzj
 * @Author: gzj
 * @Description: ${description}
 * @Date: 2020/6/15 16:52
 * @Version: 1.0
 */

import com.lt.gzj.sp.service.order.dto.AccInfo;
import org.springframework.web.bind.annotation.*;

/**
 * 用户接口
 */
@RequestMapping("/api/user/")
@RestController
public class UserController {
    /**
     * 用户列表
     * @param listForm
     */
    @RequestMapping(path = "list", method = {RequestMethod.GET,  RequestMethod.POST}  )
    public AccInfo list(AccInfo listForm){
        return null;
    }

}
