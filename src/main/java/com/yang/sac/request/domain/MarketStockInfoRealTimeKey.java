package com.yang.sac.request.domain;

import java.util.Date;

public class MarketStockInfoRealTimeKey {
    private Integer stockCode;

    private Date updateTime;

    public Integer getStockCode() {
        return stockCode;
    }

    public void setStockCode(Integer stockCode) {
        this.stockCode = stockCode;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}