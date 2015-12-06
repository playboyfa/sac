package com.yang.sac.user.domain;

import java.util.Date;

public class UserLogin {
    private Long userId;

    private Integer userStat;

    private String userSessionId;

    private Integer userLoginFailCount;

    private Integer userLockFlag;

    private Date loginTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getUserStat() {
        return userStat;
    }

    public void setUserStat(Integer userStat) {
        this.userStat = userStat;
    }

    public String getUserSessionId() {
        return userSessionId;
    }

    public void setUserSessionId(String userSessionId) {
        this.userSessionId = userSessionId;
    }

    public Integer getUserLoginFailCount() {
        return userLoginFailCount;
    }

    public void setUserLoginFailCount(Integer userLoginFailCount) {
        this.userLoginFailCount = userLoginFailCount;
    }

    public Integer getUserLockFlag() {
        return userLockFlag;
    }

    public void setUserLockFlag(Integer userLockFlag) {
        this.userLockFlag = userLockFlag;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}