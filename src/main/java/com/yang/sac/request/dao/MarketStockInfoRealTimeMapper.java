package com.yang.sac.request.dao;

import com.yang.sac.request.domain.MarketStockInfoRealTime;
import com.yang.sac.request.domain.MarketStockInfoRealTimeExample;
import com.yang.sac.request.domain.MarketStockInfoRealTimeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketStockInfoRealTimeMapper {
    int countByExample(MarketStockInfoRealTimeExample example);

    int deleteByExample(MarketStockInfoRealTimeExample example);

    int deleteByPrimaryKey(MarketStockInfoRealTimeKey key);

    int insert(MarketStockInfoRealTime record);

    int insertSelective(MarketStockInfoRealTime record);

    List<MarketStockInfoRealTime> selectByExample(MarketStockInfoRealTimeExample example);

    MarketStockInfoRealTime selectByPrimaryKey(MarketStockInfoRealTimeKey key);

    int updateByExampleSelective(@Param("record") MarketStockInfoRealTime record, @Param("example") MarketStockInfoRealTimeExample example);

    int updateByExample(@Param("record") MarketStockInfoRealTime record, @Param("example") MarketStockInfoRealTimeExample example);

    int updateByPrimaryKeySelective(MarketStockInfoRealTime record);

    int updateByPrimaryKey(MarketStockInfoRealTime record);
}