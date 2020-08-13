package com.lt.gzj.sp.service.order.mappers;

import com.lt.gzj.sp.service.order.dto.MemberAccInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ProjectName: parent
 * @Package: com.lt.gzj.sp.service.order.mappers
 * @ClassName: gzj
 * @Author: gzj
 * @Description: ${description}
 * @Date: 2020/6/10 15:28
 * @Version: 1.0
 */
@Mapper
public interface MemberAccInfoMapper {
    public List<MemberAccInfo> queryByMember(@Param("memberCode") String memberCode);
}
