package com.yang.sac.request.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MarketStockInfoRealTimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarketStockInfoRealTimeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andStockCodeIsNull() {
            addCriterion("stock_code is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(Integer value) {
            addCriterion("stock_code =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(Integer value) {
            addCriterion("stock_code <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(Integer value) {
            addCriterion("stock_code >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_code >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(Integer value) {
            addCriterion("stock_code <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(Integer value) {
            addCriterion("stock_code <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<Integer> values) {
            addCriterion("stock_code in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<Integer> values) {
            addCriterion("stock_code not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(Integer value1, Integer value2) {
            addCriterion("stock_code between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_code not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPercentIsNull() {
            addCriterion("percent is null");
            return (Criteria) this;
        }

        public Criteria andPercentIsNotNull() {
            addCriterion("percent is not null");
            return (Criteria) this;
        }

        public Criteria andPercentEqualTo(Double value) {
            addCriterion("percent =", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotEqualTo(Double value) {
            addCriterion("percent <>", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentGreaterThan(Double value) {
            addCriterion("percent >", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentGreaterThanOrEqualTo(Double value) {
            addCriterion("percent >=", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentLessThan(Double value) {
            addCriterion("percent <", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentLessThanOrEqualTo(Double value) {
            addCriterion("percent <=", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentIn(List<Double> values) {
            addCriterion("percent in", values, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotIn(List<Double> values) {
            addCriterion("percent not in", values, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentBetween(Double value1, Double value2) {
            addCriterion("percent between", value1, value2, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotBetween(Double value1, Double value2) {
            addCriterion("percent not between", value1, value2, "percent");
            return (Criteria) this;
        }

        public Criteria andOpenIsNull() {
            addCriterion("open is null");
            return (Criteria) this;
        }

        public Criteria andOpenIsNotNull() {
            addCriterion("open is not null");
            return (Criteria) this;
        }

        public Criteria andOpenEqualTo(Double value) {
            addCriterion("open =", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotEqualTo(Double value) {
            addCriterion("open <>", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThan(Double value) {
            addCriterion("open >", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThanOrEqualTo(Double value) {
            addCriterion("open >=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThan(Double value) {
            addCriterion("open <", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThanOrEqualTo(Double value) {
            addCriterion("open <=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenIn(List<Double> values) {
            addCriterion("open in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotIn(List<Double> values) {
            addCriterion("open not in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenBetween(Double value1, Double value2) {
            addCriterion("open between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotBetween(Double value1, Double value2) {
            addCriterion("open not between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andYestcloseIsNull() {
            addCriterion("yestclose is null");
            return (Criteria) this;
        }

        public Criteria andYestcloseIsNotNull() {
            addCriterion("yestclose is not null");
            return (Criteria) this;
        }

        public Criteria andYestcloseEqualTo(Double value) {
            addCriterion("yestclose =", value, "yestclose");
            return (Criteria) this;
        }

        public Criteria andYestcloseNotEqualTo(Double value) {
            addCriterion("yestclose <>", value, "yestclose");
            return (Criteria) this;
        }

        public Criteria andYestcloseGreaterThan(Double value) {
            addCriterion("yestclose >", value, "yestclose");
            return (Criteria) this;
        }

        public Criteria andYestcloseGreaterThanOrEqualTo(Double value) {
            addCriterion("yestclose >=", value, "yestclose");
            return (Criteria) this;
        }

        public Criteria andYestcloseLessThan(Double value) {
            addCriterion("yestclose <", value, "yestclose");
            return (Criteria) this;
        }

        public Criteria andYestcloseLessThanOrEqualTo(Double value) {
            addCriterion("yestclose <=", value, "yestclose");
            return (Criteria) this;
        }

        public Criteria andYestcloseIn(List<Double> values) {
            addCriterion("yestclose in", values, "yestclose");
            return (Criteria) this;
        }

        public Criteria andYestcloseNotIn(List<Double> values) {
            addCriterion("yestclose not in", values, "yestclose");
            return (Criteria) this;
        }

        public Criteria andYestcloseBetween(Double value1, Double value2) {
            addCriterion("yestclose between", value1, value2, "yestclose");
            return (Criteria) this;
        }

        public Criteria andYestcloseNotBetween(Double value1, Double value2) {
            addCriterion("yestclose not between", value1, value2, "yestclose");
            return (Criteria) this;
        }

        public Criteria andHighIsNull() {
            addCriterion("high is null");
            return (Criteria) this;
        }

        public Criteria andHighIsNotNull() {
            addCriterion("high is not null");
            return (Criteria) this;
        }

        public Criteria andHighEqualTo(Double value) {
            addCriterion("high =", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotEqualTo(Double value) {
            addCriterion("high <>", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThan(Double value) {
            addCriterion("high >", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThanOrEqualTo(Double value) {
            addCriterion("high >=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThan(Double value) {
            addCriterion("high <", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThanOrEqualTo(Double value) {
            addCriterion("high <=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighIn(List<Double> values) {
            addCriterion("high in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotIn(List<Double> values) {
            addCriterion("high not in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighBetween(Double value1, Double value2) {
            addCriterion("high between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotBetween(Double value1, Double value2) {
            addCriterion("high not between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andLowIsNull() {
            addCriterion("low is null");
            return (Criteria) this;
        }

        public Criteria andLowIsNotNull() {
            addCriterion("low is not null");
            return (Criteria) this;
        }

        public Criteria andLowEqualTo(Double value) {
            addCriterion("low =", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotEqualTo(Double value) {
            addCriterion("low <>", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowGreaterThan(Double value) {
            addCriterion("low >", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowGreaterThanOrEqualTo(Double value) {
            addCriterion("low >=", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLessThan(Double value) {
            addCriterion("low <", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLessThanOrEqualTo(Double value) {
            addCriterion("low <=", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowIn(List<Double> values) {
            addCriterion("low in", values, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotIn(List<Double> values) {
            addCriterion("low not in", values, "low");
            return (Criteria) this;
        }

        public Criteria andLowBetween(Double value1, Double value2) {
            addCriterion("low between", value1, value2, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotBetween(Double value1, Double value2) {
            addCriterion("low not between", value1, value2, "low");
            return (Criteria) this;
        }

        public Criteria andUpdownIsNull() {
            addCriterion("updown is null");
            return (Criteria) this;
        }

        public Criteria andUpdownIsNotNull() {
            addCriterion("updown is not null");
            return (Criteria) this;
        }

        public Criteria andUpdownEqualTo(Double value) {
            addCriterion("updown =", value, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownNotEqualTo(Double value) {
            addCriterion("updown <>", value, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownGreaterThan(Double value) {
            addCriterion("updown >", value, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownGreaterThanOrEqualTo(Double value) {
            addCriterion("updown >=", value, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownLessThan(Double value) {
            addCriterion("updown <", value, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownLessThanOrEqualTo(Double value) {
            addCriterion("updown <=", value, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownIn(List<Double> values) {
            addCriterion("updown in", values, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownNotIn(List<Double> values) {
            addCriterion("updown not in", values, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownBetween(Double value1, Double value2) {
            addCriterion("updown between", value1, value2, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownNotBetween(Double value1, Double value2) {
            addCriterion("updown not between", value1, value2, "updown");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Integer value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Integer value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Integer value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Integer value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Integer> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Integer> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Integer value1, Integer value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andTurnoverIsNull() {
            addCriterion("turnover is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverIsNotNull() {
            addCriterion("turnover is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverEqualTo(Double value) {
            addCriterion("turnover =", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotEqualTo(Double value) {
            addCriterion("turnover <>", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverGreaterThan(Double value) {
            addCriterion("turnover >", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverGreaterThanOrEqualTo(Double value) {
            addCriterion("turnover >=", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverLessThan(Double value) {
            addCriterion("turnover <", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverLessThanOrEqualTo(Double value) {
            addCriterion("turnover <=", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverIn(List<Double> values) {
            addCriterion("turnover in", values, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotIn(List<Double> values) {
            addCriterion("turnover not in", values, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverBetween(Double value1, Double value2) {
            addCriterion("turnover between", value1, value2, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotBetween(Double value1, Double value2) {
            addCriterion("turnover not between", value1, value2, "turnover");
            return (Criteria) this;
        }

        public Criteria andBidvol1IsNull() {
            addCriterion("bidvol1 is null");
            return (Criteria) this;
        }

        public Criteria andBidvol1IsNotNull() {
            addCriterion("bidvol1 is not null");
            return (Criteria) this;
        }

        public Criteria andBidvol1EqualTo(Double value) {
            addCriterion("bidvol1 =", value, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBidvol1NotEqualTo(Double value) {
            addCriterion("bidvol1 <>", value, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBidvol1GreaterThan(Double value) {
            addCriterion("bidvol1 >", value, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBidvol1GreaterThanOrEqualTo(Double value) {
            addCriterion("bidvol1 >=", value, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBidvol1LessThan(Double value) {
            addCriterion("bidvol1 <", value, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBidvol1LessThanOrEqualTo(Double value) {
            addCriterion("bidvol1 <=", value, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBidvol1In(List<Double> values) {
            addCriterion("bidvol1 in", values, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBidvol1NotIn(List<Double> values) {
            addCriterion("bidvol1 not in", values, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBidvol1Between(Double value1, Double value2) {
            addCriterion("bidvol1 between", value1, value2, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBidvol1NotBetween(Double value1, Double value2) {
            addCriterion("bidvol1 not between", value1, value2, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBid1IsNull() {
            addCriterion("bid1 is null");
            return (Criteria) this;
        }

        public Criteria andBid1IsNotNull() {
            addCriterion("bid1 is not null");
            return (Criteria) this;
        }

        public Criteria andBid1EqualTo(Double value) {
            addCriterion("bid1 =", value, "bid1");
            return (Criteria) this;
        }

        public Criteria andBid1NotEqualTo(Double value) {
            addCriterion("bid1 <>", value, "bid1");
            return (Criteria) this;
        }

        public Criteria andBid1GreaterThan(Double value) {
            addCriterion("bid1 >", value, "bid1");
            return (Criteria) this;
        }

        public Criteria andBid1GreaterThanOrEqualTo(Double value) {
            addCriterion("bid1 >=", value, "bid1");
            return (Criteria) this;
        }

        public Criteria andBid1LessThan(Double value) {
            addCriterion("bid1 <", value, "bid1");
            return (Criteria) this;
        }

        public Criteria andBid1LessThanOrEqualTo(Double value) {
            addCriterion("bid1 <=", value, "bid1");
            return (Criteria) this;
        }

        public Criteria andBid1In(List<Double> values) {
            addCriterion("bid1 in", values, "bid1");
            return (Criteria) this;
        }

        public Criteria andBid1NotIn(List<Double> values) {
            addCriterion("bid1 not in", values, "bid1");
            return (Criteria) this;
        }

        public Criteria andBid1Between(Double value1, Double value2) {
            addCriterion("bid1 between", value1, value2, "bid1");
            return (Criteria) this;
        }

        public Criteria andBid1NotBetween(Double value1, Double value2) {
            addCriterion("bid1 not between", value1, value2, "bid1");
            return (Criteria) this;
        }

        public Criteria andBidvol2IsNull() {
            addCriterion("bidvol2 is null");
            return (Criteria) this;
        }

        public Criteria andBidvol2IsNotNull() {
            addCriterion("bidvol2 is not null");
            return (Criteria) this;
        }

        public Criteria andBidvol2EqualTo(Double value) {
            addCriterion("bidvol2 =", value, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBidvol2NotEqualTo(Double value) {
            addCriterion("bidvol2 <>", value, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBidvol2GreaterThan(Double value) {
            addCriterion("bidvol2 >", value, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBidvol2GreaterThanOrEqualTo(Double value) {
            addCriterion("bidvol2 >=", value, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBidvol2LessThan(Double value) {
            addCriterion("bidvol2 <", value, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBidvol2LessThanOrEqualTo(Double value) {
            addCriterion("bidvol2 <=", value, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBidvol2In(List<Double> values) {
            addCriterion("bidvol2 in", values, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBidvol2NotIn(List<Double> values) {
            addCriterion("bidvol2 not in", values, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBidvol2Between(Double value1, Double value2) {
            addCriterion("bidvol2 between", value1, value2, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBidvol2NotBetween(Double value1, Double value2) {
            addCriterion("bidvol2 not between", value1, value2, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBid2IsNull() {
            addCriterion("bid2 is null");
            return (Criteria) this;
        }

        public Criteria andBid2IsNotNull() {
            addCriterion("bid2 is not null");
            return (Criteria) this;
        }

        public Criteria andBid2EqualTo(Double value) {
            addCriterion("bid2 =", value, "bid2");
            return (Criteria) this;
        }

        public Criteria andBid2NotEqualTo(Double value) {
            addCriterion("bid2 <>", value, "bid2");
            return (Criteria) this;
        }

        public Criteria andBid2GreaterThan(Double value) {
            addCriterion("bid2 >", value, "bid2");
            return (Criteria) this;
        }

        public Criteria andBid2GreaterThanOrEqualTo(Double value) {
            addCriterion("bid2 >=", value, "bid2");
            return (Criteria) this;
        }

        public Criteria andBid2LessThan(Double value) {
            addCriterion("bid2 <", value, "bid2");
            return (Criteria) this;
        }

        public Criteria andBid2LessThanOrEqualTo(Double value) {
            addCriterion("bid2 <=", value, "bid2");
            return (Criteria) this;
        }

        public Criteria andBid2In(List<Double> values) {
            addCriterion("bid2 in", values, "bid2");
            return (Criteria) this;
        }

        public Criteria andBid2NotIn(List<Double> values) {
            addCriterion("bid2 not in", values, "bid2");
            return (Criteria) this;
        }

        public Criteria andBid2Between(Double value1, Double value2) {
            addCriterion("bid2 between", value1, value2, "bid2");
            return (Criteria) this;
        }

        public Criteria andBid2NotBetween(Double value1, Double value2) {
            addCriterion("bid2 not between", value1, value2, "bid2");
            return (Criteria) this;
        }

        public Criteria andBidvol3IsNull() {
            addCriterion("bidvol3 is null");
            return (Criteria) this;
        }

        public Criteria andBidvol3IsNotNull() {
            addCriterion("bidvol3 is not null");
            return (Criteria) this;
        }

        public Criteria andBidvol3EqualTo(Double value) {
            addCriterion("bidvol3 =", value, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBidvol3NotEqualTo(Double value) {
            addCriterion("bidvol3 <>", value, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBidvol3GreaterThan(Double value) {
            addCriterion("bidvol3 >", value, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBidvol3GreaterThanOrEqualTo(Double value) {
            addCriterion("bidvol3 >=", value, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBidvol3LessThan(Double value) {
            addCriterion("bidvol3 <", value, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBidvol3LessThanOrEqualTo(Double value) {
            addCriterion("bidvol3 <=", value, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBidvol3In(List<Double> values) {
            addCriterion("bidvol3 in", values, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBidvol3NotIn(List<Double> values) {
            addCriterion("bidvol3 not in", values, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBidvol3Between(Double value1, Double value2) {
            addCriterion("bidvol3 between", value1, value2, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBidvol3NotBetween(Double value1, Double value2) {
            addCriterion("bidvol3 not between", value1, value2, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBid3IsNull() {
            addCriterion("bid3 is null");
            return (Criteria) this;
        }

        public Criteria andBid3IsNotNull() {
            addCriterion("bid3 is not null");
            return (Criteria) this;
        }

        public Criteria andBid3EqualTo(Double value) {
            addCriterion("bid3 =", value, "bid3");
            return (Criteria) this;
        }

        public Criteria andBid3NotEqualTo(Double value) {
            addCriterion("bid3 <>", value, "bid3");
            return (Criteria) this;
        }

        public Criteria andBid3GreaterThan(Double value) {
            addCriterion("bid3 >", value, "bid3");
            return (Criteria) this;
        }

        public Criteria andBid3GreaterThanOrEqualTo(Double value) {
            addCriterion("bid3 >=", value, "bid3");
            return (Criteria) this;
        }

        public Criteria andBid3LessThan(Double value) {
            addCriterion("bid3 <", value, "bid3");
            return (Criteria) this;
        }

        public Criteria andBid3LessThanOrEqualTo(Double value) {
            addCriterion("bid3 <=", value, "bid3");
            return (Criteria) this;
        }

        public Criteria andBid3In(List<Double> values) {
            addCriterion("bid3 in", values, "bid3");
            return (Criteria) this;
        }

        public Criteria andBid3NotIn(List<Double> values) {
            addCriterion("bid3 not in", values, "bid3");
            return (Criteria) this;
        }

        public Criteria andBid3Between(Double value1, Double value2) {
            addCriterion("bid3 between", value1, value2, "bid3");
            return (Criteria) this;
        }

        public Criteria andBid3NotBetween(Double value1, Double value2) {
            addCriterion("bid3 not between", value1, value2, "bid3");
            return (Criteria) this;
        }

        public Criteria andBidvol4IsNull() {
            addCriterion("bidvol4 is null");
            return (Criteria) this;
        }

        public Criteria andBidvol4IsNotNull() {
            addCriterion("bidvol4 is not null");
            return (Criteria) this;
        }

        public Criteria andBidvol4EqualTo(Double value) {
            addCriterion("bidvol4 =", value, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBidvol4NotEqualTo(Double value) {
            addCriterion("bidvol4 <>", value, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBidvol4GreaterThan(Double value) {
            addCriterion("bidvol4 >", value, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBidvol4GreaterThanOrEqualTo(Double value) {
            addCriterion("bidvol4 >=", value, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBidvol4LessThan(Double value) {
            addCriterion("bidvol4 <", value, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBidvol4LessThanOrEqualTo(Double value) {
            addCriterion("bidvol4 <=", value, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBidvol4In(List<Double> values) {
            addCriterion("bidvol4 in", values, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBidvol4NotIn(List<Double> values) {
            addCriterion("bidvol4 not in", values, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBidvol4Between(Double value1, Double value2) {
            addCriterion("bidvol4 between", value1, value2, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBidvol4NotBetween(Double value1, Double value2) {
            addCriterion("bidvol4 not between", value1, value2, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBid4IsNull() {
            addCriterion("bid4 is null");
            return (Criteria) this;
        }

        public Criteria andBid4IsNotNull() {
            addCriterion("bid4 is not null");
            return (Criteria) this;
        }

        public Criteria andBid4EqualTo(Double value) {
            addCriterion("bid4 =", value, "bid4");
            return (Criteria) this;
        }

        public Criteria andBid4NotEqualTo(Double value) {
            addCriterion("bid4 <>", value, "bid4");
            return (Criteria) this;
        }

        public Criteria andBid4GreaterThan(Double value) {
            addCriterion("bid4 >", value, "bid4");
            return (Criteria) this;
        }

        public Criteria andBid4GreaterThanOrEqualTo(Double value) {
            addCriterion("bid4 >=", value, "bid4");
            return (Criteria) this;
        }

        public Criteria andBid4LessThan(Double value) {
            addCriterion("bid4 <", value, "bid4");
            return (Criteria) this;
        }

        public Criteria andBid4LessThanOrEqualTo(Double value) {
            addCriterion("bid4 <=", value, "bid4");
            return (Criteria) this;
        }

        public Criteria andBid4In(List<Double> values) {
            addCriterion("bid4 in", values, "bid4");
            return (Criteria) this;
        }

        public Criteria andBid4NotIn(List<Double> values) {
            addCriterion("bid4 not in", values, "bid4");
            return (Criteria) this;
        }

        public Criteria andBid4Between(Double value1, Double value2) {
            addCriterion("bid4 between", value1, value2, "bid4");
            return (Criteria) this;
        }

        public Criteria andBid4NotBetween(Double value1, Double value2) {
            addCriterion("bid4 not between", value1, value2, "bid4");
            return (Criteria) this;
        }

        public Criteria andBidvol5IsNull() {
            addCriterion("bidvol5 is null");
            return (Criteria) this;
        }

        public Criteria andBidvol5IsNotNull() {
            addCriterion("bidvol5 is not null");
            return (Criteria) this;
        }

        public Criteria andBidvol5EqualTo(Double value) {
            addCriterion("bidvol5 =", value, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andBidvol5NotEqualTo(Double value) {
            addCriterion("bidvol5 <>", value, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andBidvol5GreaterThan(Double value) {
            addCriterion("bidvol5 >", value, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andBidvol5GreaterThanOrEqualTo(Double value) {
            addCriterion("bidvol5 >=", value, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andBidvol5LessThan(Double value) {
            addCriterion("bidvol5 <", value, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andBidvol5LessThanOrEqualTo(Double value) {
            addCriterion("bidvol5 <=", value, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andBidvol5In(List<Double> values) {
            addCriterion("bidvol5 in", values, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andBidvol5NotIn(List<Double> values) {
            addCriterion("bidvol5 not in", values, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andBidvol5Between(Double value1, Double value2) {
            addCriterion("bidvol5 between", value1, value2, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andBidvol5NotBetween(Double value1, Double value2) {
            addCriterion("bidvol5 not between", value1, value2, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andBid5IsNull() {
            addCriterion("bid5 is null");
            return (Criteria) this;
        }

        public Criteria andBid5IsNotNull() {
            addCriterion("bid5 is not null");
            return (Criteria) this;
        }

        public Criteria andBid5EqualTo(Double value) {
            addCriterion("bid5 =", value, "bid5");
            return (Criteria) this;
        }

        public Criteria andBid5NotEqualTo(Double value) {
            addCriterion("bid5 <>", value, "bid5");
            return (Criteria) this;
        }

        public Criteria andBid5GreaterThan(Double value) {
            addCriterion("bid5 >", value, "bid5");
            return (Criteria) this;
        }

        public Criteria andBid5GreaterThanOrEqualTo(Double value) {
            addCriterion("bid5 >=", value, "bid5");
            return (Criteria) this;
        }

        public Criteria andBid5LessThan(Double value) {
            addCriterion("bid5 <", value, "bid5");
            return (Criteria) this;
        }

        public Criteria andBid5LessThanOrEqualTo(Double value) {
            addCriterion("bid5 <=", value, "bid5");
            return (Criteria) this;
        }

        public Criteria andBid5In(List<Double> values) {
            addCriterion("bid5 in", values, "bid5");
            return (Criteria) this;
        }

        public Criteria andBid5NotIn(List<Double> values) {
            addCriterion("bid5 not in", values, "bid5");
            return (Criteria) this;
        }

        public Criteria andBid5Between(Double value1, Double value2) {
            addCriterion("bid5 between", value1, value2, "bid5");
            return (Criteria) this;
        }

        public Criteria andBid5NotBetween(Double value1, Double value2) {
            addCriterion("bid5 not between", value1, value2, "bid5");
            return (Criteria) this;
        }

        public Criteria andAskvol1IsNull() {
            addCriterion("askvol1 is null");
            return (Criteria) this;
        }

        public Criteria andAskvol1IsNotNull() {
            addCriterion("askvol1 is not null");
            return (Criteria) this;
        }

        public Criteria andAskvol1EqualTo(Double value) {
            addCriterion("askvol1 =", value, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAskvol1NotEqualTo(Double value) {
            addCriterion("askvol1 <>", value, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAskvol1GreaterThan(Double value) {
            addCriterion("askvol1 >", value, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAskvol1GreaterThanOrEqualTo(Double value) {
            addCriterion("askvol1 >=", value, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAskvol1LessThan(Double value) {
            addCriterion("askvol1 <", value, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAskvol1LessThanOrEqualTo(Double value) {
            addCriterion("askvol1 <=", value, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAskvol1In(List<Double> values) {
            addCriterion("askvol1 in", values, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAskvol1NotIn(List<Double> values) {
            addCriterion("askvol1 not in", values, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAskvol1Between(Double value1, Double value2) {
            addCriterion("askvol1 between", value1, value2, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAskvol1NotBetween(Double value1, Double value2) {
            addCriterion("askvol1 not between", value1, value2, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAsk1IsNull() {
            addCriterion("ask1 is null");
            return (Criteria) this;
        }

        public Criteria andAsk1IsNotNull() {
            addCriterion("ask1 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk1EqualTo(Double value) {
            addCriterion("ask1 =", value, "ask1");
            return (Criteria) this;
        }

        public Criteria andAsk1NotEqualTo(Double value) {
            addCriterion("ask1 <>", value, "ask1");
            return (Criteria) this;
        }

        public Criteria andAsk1GreaterThan(Double value) {
            addCriterion("ask1 >", value, "ask1");
            return (Criteria) this;
        }

        public Criteria andAsk1GreaterThanOrEqualTo(Double value) {
            addCriterion("ask1 >=", value, "ask1");
            return (Criteria) this;
        }

        public Criteria andAsk1LessThan(Double value) {
            addCriterion("ask1 <", value, "ask1");
            return (Criteria) this;
        }

        public Criteria andAsk1LessThanOrEqualTo(Double value) {
            addCriterion("ask1 <=", value, "ask1");
            return (Criteria) this;
        }

        public Criteria andAsk1In(List<Double> values) {
            addCriterion("ask1 in", values, "ask1");
            return (Criteria) this;
        }

        public Criteria andAsk1NotIn(List<Double> values) {
            addCriterion("ask1 not in", values, "ask1");
            return (Criteria) this;
        }

        public Criteria andAsk1Between(Double value1, Double value2) {
            addCriterion("ask1 between", value1, value2, "ask1");
            return (Criteria) this;
        }

        public Criteria andAsk1NotBetween(Double value1, Double value2) {
            addCriterion("ask1 not between", value1, value2, "ask1");
            return (Criteria) this;
        }

        public Criteria andAskvol2IsNull() {
            addCriterion("askvol2 is null");
            return (Criteria) this;
        }

        public Criteria andAskvol2IsNotNull() {
            addCriterion("askvol2 is not null");
            return (Criteria) this;
        }

        public Criteria andAskvol2EqualTo(Double value) {
            addCriterion("askvol2 =", value, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAskvol2NotEqualTo(Double value) {
            addCriterion("askvol2 <>", value, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAskvol2GreaterThan(Double value) {
            addCriterion("askvol2 >", value, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAskvol2GreaterThanOrEqualTo(Double value) {
            addCriterion("askvol2 >=", value, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAskvol2LessThan(Double value) {
            addCriterion("askvol2 <", value, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAskvol2LessThanOrEqualTo(Double value) {
            addCriterion("askvol2 <=", value, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAskvol2In(List<Double> values) {
            addCriterion("askvol2 in", values, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAskvol2NotIn(List<Double> values) {
            addCriterion("askvol2 not in", values, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAskvol2Between(Double value1, Double value2) {
            addCriterion("askvol2 between", value1, value2, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAskvol2NotBetween(Double value1, Double value2) {
            addCriterion("askvol2 not between", value1, value2, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAsk2IsNull() {
            addCriterion("ask2 is null");
            return (Criteria) this;
        }

        public Criteria andAsk2IsNotNull() {
            addCriterion("ask2 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk2EqualTo(Double value) {
            addCriterion("ask2 =", value, "ask2");
            return (Criteria) this;
        }

        public Criteria andAsk2NotEqualTo(Double value) {
            addCriterion("ask2 <>", value, "ask2");
            return (Criteria) this;
        }

        public Criteria andAsk2GreaterThan(Double value) {
            addCriterion("ask2 >", value, "ask2");
            return (Criteria) this;
        }

        public Criteria andAsk2GreaterThanOrEqualTo(Double value) {
            addCriterion("ask2 >=", value, "ask2");
            return (Criteria) this;
        }

        public Criteria andAsk2LessThan(Double value) {
            addCriterion("ask2 <", value, "ask2");
            return (Criteria) this;
        }

        public Criteria andAsk2LessThanOrEqualTo(Double value) {
            addCriterion("ask2 <=", value, "ask2");
            return (Criteria) this;
        }

        public Criteria andAsk2In(List<Double> values) {
            addCriterion("ask2 in", values, "ask2");
            return (Criteria) this;
        }

        public Criteria andAsk2NotIn(List<Double> values) {
            addCriterion("ask2 not in", values, "ask2");
            return (Criteria) this;
        }

        public Criteria andAsk2Between(Double value1, Double value2) {
            addCriterion("ask2 between", value1, value2, "ask2");
            return (Criteria) this;
        }

        public Criteria andAsk2NotBetween(Double value1, Double value2) {
            addCriterion("ask2 not between", value1, value2, "ask2");
            return (Criteria) this;
        }

        public Criteria andAskvol3IsNull() {
            addCriterion("askvol3 is null");
            return (Criteria) this;
        }

        public Criteria andAskvol3IsNotNull() {
            addCriterion("askvol3 is not null");
            return (Criteria) this;
        }

        public Criteria andAskvol3EqualTo(Double value) {
            addCriterion("askvol3 =", value, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAskvol3NotEqualTo(Double value) {
            addCriterion("askvol3 <>", value, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAskvol3GreaterThan(Double value) {
            addCriterion("askvol3 >", value, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAskvol3GreaterThanOrEqualTo(Double value) {
            addCriterion("askvol3 >=", value, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAskvol3LessThan(Double value) {
            addCriterion("askvol3 <", value, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAskvol3LessThanOrEqualTo(Double value) {
            addCriterion("askvol3 <=", value, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAskvol3In(List<Double> values) {
            addCriterion("askvol3 in", values, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAskvol3NotIn(List<Double> values) {
            addCriterion("askvol3 not in", values, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAskvol3Between(Double value1, Double value2) {
            addCriterion("askvol3 between", value1, value2, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAskvol3NotBetween(Double value1, Double value2) {
            addCriterion("askvol3 not between", value1, value2, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAsk3IsNull() {
            addCriterion("ask3 is null");
            return (Criteria) this;
        }

        public Criteria andAsk3IsNotNull() {
            addCriterion("ask3 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk3EqualTo(Double value) {
            addCriterion("ask3 =", value, "ask3");
            return (Criteria) this;
        }

        public Criteria andAsk3NotEqualTo(Double value) {
            addCriterion("ask3 <>", value, "ask3");
            return (Criteria) this;
        }

        public Criteria andAsk3GreaterThan(Double value) {
            addCriterion("ask3 >", value, "ask3");
            return (Criteria) this;
        }

        public Criteria andAsk3GreaterThanOrEqualTo(Double value) {
            addCriterion("ask3 >=", value, "ask3");
            return (Criteria) this;
        }

        public Criteria andAsk3LessThan(Double value) {
            addCriterion("ask3 <", value, "ask3");
            return (Criteria) this;
        }

        public Criteria andAsk3LessThanOrEqualTo(Double value) {
            addCriterion("ask3 <=", value, "ask3");
            return (Criteria) this;
        }

        public Criteria andAsk3In(List<Double> values) {
            addCriterion("ask3 in", values, "ask3");
            return (Criteria) this;
        }

        public Criteria andAsk3NotIn(List<Double> values) {
            addCriterion("ask3 not in", values, "ask3");
            return (Criteria) this;
        }

        public Criteria andAsk3Between(Double value1, Double value2) {
            addCriterion("ask3 between", value1, value2, "ask3");
            return (Criteria) this;
        }

        public Criteria andAsk3NotBetween(Double value1, Double value2) {
            addCriterion("ask3 not between", value1, value2, "ask3");
            return (Criteria) this;
        }

        public Criteria andAskvol4IsNull() {
            addCriterion("askvol4 is null");
            return (Criteria) this;
        }

        public Criteria andAskvol4IsNotNull() {
            addCriterion("askvol4 is not null");
            return (Criteria) this;
        }

        public Criteria andAskvol4EqualTo(Double value) {
            addCriterion("askvol4 =", value, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAskvol4NotEqualTo(Double value) {
            addCriterion("askvol4 <>", value, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAskvol4GreaterThan(Double value) {
            addCriterion("askvol4 >", value, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAskvol4GreaterThanOrEqualTo(Double value) {
            addCriterion("askvol4 >=", value, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAskvol4LessThan(Double value) {
            addCriterion("askvol4 <", value, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAskvol4LessThanOrEqualTo(Double value) {
            addCriterion("askvol4 <=", value, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAskvol4In(List<Double> values) {
            addCriterion("askvol4 in", values, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAskvol4NotIn(List<Double> values) {
            addCriterion("askvol4 not in", values, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAskvol4Between(Double value1, Double value2) {
            addCriterion("askvol4 between", value1, value2, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAskvol4NotBetween(Double value1, Double value2) {
            addCriterion("askvol4 not between", value1, value2, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAsk4IsNull() {
            addCriterion("ask4 is null");
            return (Criteria) this;
        }

        public Criteria andAsk4IsNotNull() {
            addCriterion("ask4 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk4EqualTo(Double value) {
            addCriterion("ask4 =", value, "ask4");
            return (Criteria) this;
        }

        public Criteria andAsk4NotEqualTo(Double value) {
            addCriterion("ask4 <>", value, "ask4");
            return (Criteria) this;
        }

        public Criteria andAsk4GreaterThan(Double value) {
            addCriterion("ask4 >", value, "ask4");
            return (Criteria) this;
        }

        public Criteria andAsk4GreaterThanOrEqualTo(Double value) {
            addCriterion("ask4 >=", value, "ask4");
            return (Criteria) this;
        }

        public Criteria andAsk4LessThan(Double value) {
            addCriterion("ask4 <", value, "ask4");
            return (Criteria) this;
        }

        public Criteria andAsk4LessThanOrEqualTo(Double value) {
            addCriterion("ask4 <=", value, "ask4");
            return (Criteria) this;
        }

        public Criteria andAsk4In(List<Double> values) {
            addCriterion("ask4 in", values, "ask4");
            return (Criteria) this;
        }

        public Criteria andAsk4NotIn(List<Double> values) {
            addCriterion("ask4 not in", values, "ask4");
            return (Criteria) this;
        }

        public Criteria andAsk4Between(Double value1, Double value2) {
            addCriterion("ask4 between", value1, value2, "ask4");
            return (Criteria) this;
        }

        public Criteria andAsk4NotBetween(Double value1, Double value2) {
            addCriterion("ask4 not between", value1, value2, "ask4");
            return (Criteria) this;
        }

        public Criteria andAskvol5IsNull() {
            addCriterion("askvol5 is null");
            return (Criteria) this;
        }

        public Criteria andAskvol5IsNotNull() {
            addCriterion("askvol5 is not null");
            return (Criteria) this;
        }

        public Criteria andAskvol5EqualTo(Double value) {
            addCriterion("askvol5 =", value, "askvol5");
            return (Criteria) this;
        }

        public Criteria andAskvol5NotEqualTo(Double value) {
            addCriterion("askvol5 <>", value, "askvol5");
            return (Criteria) this;
        }

        public Criteria andAskvol5GreaterThan(Double value) {
            addCriterion("askvol5 >", value, "askvol5");
            return (Criteria) this;
        }

        public Criteria andAskvol5GreaterThanOrEqualTo(Double value) {
            addCriterion("askvol5 >=", value, "askvol5");
            return (Criteria) this;
        }

        public Criteria andAskvol5LessThan(Double value) {
            addCriterion("askvol5 <", value, "askvol5");
            return (Criteria) this;
        }

        public Criteria andAskvol5LessThanOrEqualTo(Double value) {
            addCriterion("askvol5 <=", value, "askvol5");
            return (Criteria) this;
        }

        public Criteria andAskvol5In(List<Double> values) {
            addCriterion("askvol5 in", values, "askvol5");
            return (Criteria) this;
        }

        public Criteria andAskvol5NotIn(List<Double> values) {
            addCriterion("askvol5 not in", values, "askvol5");
            return (Criteria) this;
        }

        public Criteria andAskvol5Between(Double value1, Double value2) {
            addCriterion("askvol5 between", value1, value2, "askvol5");
            return (Criteria) this;
        }

        public Criteria andAskvol5NotBetween(Double value1, Double value2) {
            addCriterion("askvol5 not between", value1, value2, "askvol5");
            return (Criteria) this;
        }

        public Criteria andAsk5IsNull() {
            addCriterion("ask5 is null");
            return (Criteria) this;
        }

        public Criteria andAsk5IsNotNull() {
            addCriterion("ask5 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk5EqualTo(Double value) {
            addCriterion("ask5 =", value, "ask5");
            return (Criteria) this;
        }

        public Criteria andAsk5NotEqualTo(Double value) {
            addCriterion("ask5 <>", value, "ask5");
            return (Criteria) this;
        }

        public Criteria andAsk5GreaterThan(Double value) {
            addCriterion("ask5 >", value, "ask5");
            return (Criteria) this;
        }

        public Criteria andAsk5GreaterThanOrEqualTo(Double value) {
            addCriterion("ask5 >=", value, "ask5");
            return (Criteria) this;
        }

        public Criteria andAsk5LessThan(Double value) {
            addCriterion("ask5 <", value, "ask5");
            return (Criteria) this;
        }

        public Criteria andAsk5LessThanOrEqualTo(Double value) {
            addCriterion("ask5 <=", value, "ask5");
            return (Criteria) this;
        }

        public Criteria andAsk5In(List<Double> values) {
            addCriterion("ask5 in", values, "ask5");
            return (Criteria) this;
        }

        public Criteria andAsk5NotIn(List<Double> values) {
            addCriterion("ask5 not in", values, "ask5");
            return (Criteria) this;
        }

        public Criteria andAsk5Between(Double value1, Double value2) {
            addCriterion("ask5 between", value1, value2, "ask5");
            return (Criteria) this;
        }

        public Criteria andAsk5NotBetween(Double value1, Double value2) {
            addCriterion("ask5 not between", value1, value2, "ask5");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}