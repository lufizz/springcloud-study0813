package com.lt.gzj.sp.service.order.dto;

import java.util.List;

/**
 * @ProjectName: parent
 * @Package: com.lt.gzj.sp.service.order.dto
 * @ClassName: gzj
 * @Author: gzj
 * @Description: ${description}
 * @Date: 2020/6/10 15:30
 * @Version: 1.0
 */
public class MemberAccInfo {
    private Long id;
    private Long memberCode;
    private String name;
    private String loginName;
    private List<AccInfo> accList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(Long memberCode) {
        this.memberCode = memberCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public List<AccInfo> getAccList() {
        return accList;
    }

    public void setAccList(List<AccInfo> accList) {
        this.accList = accList;
    }
}
