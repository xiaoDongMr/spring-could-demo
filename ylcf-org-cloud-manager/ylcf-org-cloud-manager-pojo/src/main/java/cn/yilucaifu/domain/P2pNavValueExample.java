package cn.yilucaifu.domain;

import java.util.ArrayList;
import java.util.List;

public class P2pNavValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public P2pNavValueExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andP2pnavidIsNull() {
            addCriterion("p2pNavId is null");
            return (Criteria) this;
        }

        public Criteria andP2pnavidIsNotNull() {
            addCriterion("p2pNavId is not null");
            return (Criteria) this;
        }

        public Criteria andP2pnavidEqualTo(Integer value) {
            addCriterion("p2pNavId =", value, "p2pnavid");
            return (Criteria) this;
        }

        public Criteria andP2pnavidNotEqualTo(Integer value) {
            addCriterion("p2pNavId <>", value, "p2pnavid");
            return (Criteria) this;
        }

        public Criteria andP2pnavidGreaterThan(Integer value) {
            addCriterion("p2pNavId >", value, "p2pnavid");
            return (Criteria) this;
        }

        public Criteria andP2pnavidGreaterThanOrEqualTo(Integer value) {
            addCriterion("p2pNavId >=", value, "p2pnavid");
            return (Criteria) this;
        }

        public Criteria andP2pnavidLessThan(Integer value) {
            addCriterion("p2pNavId <", value, "p2pnavid");
            return (Criteria) this;
        }

        public Criteria andP2pnavidLessThanOrEqualTo(Integer value) {
            addCriterion("p2pNavId <=", value, "p2pnavid");
            return (Criteria) this;
        }

        public Criteria andP2pnavidIn(List<Integer> values) {
            addCriterion("p2pNavId in", values, "p2pnavid");
            return (Criteria) this;
        }

        public Criteria andP2pnavidNotIn(List<Integer> values) {
            addCriterion("p2pNavId not in", values, "p2pnavid");
            return (Criteria) this;
        }

        public Criteria andP2pnavidBetween(Integer value1, Integer value2) {
            addCriterion("p2pNavId between", value1, value2, "p2pnavid");
            return (Criteria) this;
        }

        public Criteria andP2pnavidNotBetween(Integer value1, Integer value2) {
            addCriterion("p2pNavId not between", value1, value2, "p2pnavid");
            return (Criteria) this;
        }

        public Criteria andNavvalueIsNull() {
            addCriterion("navValue is null");
            return (Criteria) this;
        }

        public Criteria andNavvalueIsNotNull() {
            addCriterion("navValue is not null");
            return (Criteria) this;
        }

        public Criteria andNavvalueEqualTo(String value) {
            addCriterion("navValue =", value, "navvalue");
            return (Criteria) this;
        }

        public Criteria andNavvalueNotEqualTo(String value) {
            addCriterion("navValue <>", value, "navvalue");
            return (Criteria) this;
        }

        public Criteria andNavvalueGreaterThan(String value) {
            addCriterion("navValue >", value, "navvalue");
            return (Criteria) this;
        }

        public Criteria andNavvalueGreaterThanOrEqualTo(String value) {
            addCriterion("navValue >=", value, "navvalue");
            return (Criteria) this;
        }

        public Criteria andNavvalueLessThan(String value) {
            addCriterion("navValue <", value, "navvalue");
            return (Criteria) this;
        }

        public Criteria andNavvalueLessThanOrEqualTo(String value) {
            addCriterion("navValue <=", value, "navvalue");
            return (Criteria) this;
        }

        public Criteria andNavvalueLike(String value) {
            addCriterion("navValue like", value, "navvalue");
            return (Criteria) this;
        }

        public Criteria andNavvalueNotLike(String value) {
            addCriterion("navValue not like", value, "navvalue");
            return (Criteria) this;
        }

        public Criteria andNavvalueIn(List<String> values) {
            addCriterion("navValue in", values, "navvalue");
            return (Criteria) this;
        }

        public Criteria andNavvalueNotIn(List<String> values) {
            addCriterion("navValue not in", values, "navvalue");
            return (Criteria) this;
        }

        public Criteria andNavvalueBetween(String value1, String value2) {
            addCriterion("navValue between", value1, value2, "navvalue");
            return (Criteria) this;
        }

        public Criteria andNavvalueNotBetween(String value1, String value2) {
            addCriterion("navValue not between", value1, value2, "navvalue");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsIsNull() {
            addCriterion("p2p_periods is null");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsIsNotNull() {
            addCriterion("p2p_periods is not null");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsEqualTo(String value) {
            addCriterion("p2p_periods =", value, "p2pPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsNotEqualTo(String value) {
            addCriterion("p2p_periods <>", value, "p2pPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsGreaterThan(String value) {
            addCriterion("p2p_periods >", value, "p2pPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsGreaterThanOrEqualTo(String value) {
            addCriterion("p2p_periods >=", value, "p2pPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsLessThan(String value) {
            addCriterion("p2p_periods <", value, "p2pPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsLessThanOrEqualTo(String value) {
            addCriterion("p2p_periods <=", value, "p2pPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsLike(String value) {
            addCriterion("p2p_periods like", value, "p2pPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsNotLike(String value) {
            addCriterion("p2p_periods not like", value, "p2pPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsIn(List<String> values) {
            addCriterion("p2p_periods in", values, "p2pPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsNotIn(List<String> values) {
            addCriterion("p2p_periods not in", values, "p2pPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsBetween(String value1, String value2) {
            addCriterion("p2p_periods between", value1, value2, "p2pPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsNotBetween(String value1, String value2) {
            addCriterion("p2p_periods not between", value1, value2, "p2pPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsUnitIsNull() {
            addCriterion("p2p_periods_unit is null");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsUnitIsNotNull() {
            addCriterion("p2p_periods_unit is not null");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsUnitEqualTo(Integer value) {
            addCriterion("p2p_periods_unit =", value, "p2pPeriodsUnit");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsUnitNotEqualTo(Integer value) {
            addCriterion("p2p_periods_unit <>", value, "p2pPeriodsUnit");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsUnitGreaterThan(Integer value) {
            addCriterion("p2p_periods_unit >", value, "p2pPeriodsUnit");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("p2p_periods_unit >=", value, "p2pPeriodsUnit");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsUnitLessThan(Integer value) {
            addCriterion("p2p_periods_unit <", value, "p2pPeriodsUnit");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsUnitLessThanOrEqualTo(Integer value) {
            addCriterion("p2p_periods_unit <=", value, "p2pPeriodsUnit");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsUnitIn(List<Integer> values) {
            addCriterion("p2p_periods_unit in", values, "p2pPeriodsUnit");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsUnitNotIn(List<Integer> values) {
            addCriterion("p2p_periods_unit not in", values, "p2pPeriodsUnit");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsUnitBetween(Integer value1, Integer value2) {
            addCriterion("p2p_periods_unit between", value1, value2, "p2pPeriodsUnit");
            return (Criteria) this;
        }

        public Criteria andP2pPeriodsUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("p2p_periods_unit not between", value1, value2, "p2pPeriodsUnit");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusIsNull() {
            addCriterion("application_status is null");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusIsNotNull() {
            addCriterion("application_status is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusEqualTo(Integer value) {
            addCriterion("application_status =", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusNotEqualTo(Integer value) {
            addCriterion("application_status <>", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusGreaterThan(Integer value) {
            addCriterion("application_status >", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("application_status >=", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusLessThan(Integer value) {
            addCriterion("application_status <", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusLessThanOrEqualTo(Integer value) {
            addCriterion("application_status <=", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusIn(List<Integer> values) {
            addCriterion("application_status in", values, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusNotIn(List<Integer> values) {
            addCriterion("application_status not in", values, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusBetween(Integer value1, Integer value2) {
            addCriterion("application_status between", value1, value2, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("application_status not between", value1, value2, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andRedemptionStatusIsNull() {
            addCriterion("redemption_status is null");
            return (Criteria) this;
        }

        public Criteria andRedemptionStatusIsNotNull() {
            addCriterion("redemption_status is not null");
            return (Criteria) this;
        }

        public Criteria andRedemptionStatusEqualTo(Integer value) {
            addCriterion("redemption_status =", value, "redemptionStatus");
            return (Criteria) this;
        }

        public Criteria andRedemptionStatusNotEqualTo(Integer value) {
            addCriterion("redemption_status <>", value, "redemptionStatus");
            return (Criteria) this;
        }

        public Criteria andRedemptionStatusGreaterThan(Integer value) {
            addCriterion("redemption_status >", value, "redemptionStatus");
            return (Criteria) this;
        }

        public Criteria andRedemptionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("redemption_status >=", value, "redemptionStatus");
            return (Criteria) this;
        }

        public Criteria andRedemptionStatusLessThan(Integer value) {
            addCriterion("redemption_status <", value, "redemptionStatus");
            return (Criteria) this;
        }

        public Criteria andRedemptionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("redemption_status <=", value, "redemptionStatus");
            return (Criteria) this;
        }

        public Criteria andRedemptionStatusIn(List<Integer> values) {
            addCriterion("redemption_status in", values, "redemptionStatus");
            return (Criteria) this;
        }

        public Criteria andRedemptionStatusNotIn(List<Integer> values) {
            addCriterion("redemption_status not in", values, "redemptionStatus");
            return (Criteria) this;
        }

        public Criteria andRedemptionStatusBetween(Integer value1, Integer value2) {
            addCriterion("redemption_status between", value1, value2, "redemptionStatus");
            return (Criteria) this;
        }

        public Criteria andRedemptionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("redemption_status not between", value1, value2, "redemptionStatus");
            return (Criteria) this;
        }

        public Criteria andBuyMoneyIsNull() {
            addCriterion("buy_money is null");
            return (Criteria) this;
        }

        public Criteria andBuyMoneyIsNotNull() {
            addCriterion("buy_money is not null");
            return (Criteria) this;
        }

        public Criteria andBuyMoneyEqualTo(String value) {
            addCriterion("buy_money =", value, "buyMoney");
            return (Criteria) this;
        }

        public Criteria andBuyMoneyNotEqualTo(String value) {
            addCriterion("buy_money <>", value, "buyMoney");
            return (Criteria) this;
        }

        public Criteria andBuyMoneyGreaterThan(String value) {
            addCriterion("buy_money >", value, "buyMoney");
            return (Criteria) this;
        }

        public Criteria andBuyMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("buy_money >=", value, "buyMoney");
            return (Criteria) this;
        }

        public Criteria andBuyMoneyLessThan(String value) {
            addCriterion("buy_money <", value, "buyMoney");
            return (Criteria) this;
        }

        public Criteria andBuyMoneyLessThanOrEqualTo(String value) {
            addCriterion("buy_money <=", value, "buyMoney");
            return (Criteria) this;
        }

        public Criteria andBuyMoneyLike(String value) {
            addCriterion("buy_money like", value, "buyMoney");
            return (Criteria) this;
        }

        public Criteria andBuyMoneyNotLike(String value) {
            addCriterion("buy_money not like", value, "buyMoney");
            return (Criteria) this;
        }

        public Criteria andBuyMoneyIn(List<String> values) {
            addCriterion("buy_money in", values, "buyMoney");
            return (Criteria) this;
        }

        public Criteria andBuyMoneyNotIn(List<String> values) {
            addCriterion("buy_money not in", values, "buyMoney");
            return (Criteria) this;
        }

        public Criteria andBuyMoneyBetween(String value1, String value2) {
            addCriterion("buy_money between", value1, value2, "buyMoney");
            return (Criteria) this;
        }

        public Criteria andBuyMoneyNotBetween(String value1, String value2) {
            addCriterion("buy_money not between", value1, value2, "buyMoney");
            return (Criteria) this;
        }

        public Criteria andIncreaseMoneyIsNull() {
            addCriterion("increase_money is null");
            return (Criteria) this;
        }

        public Criteria andIncreaseMoneyIsNotNull() {
            addCriterion("increase_money is not null");
            return (Criteria) this;
        }

        public Criteria andIncreaseMoneyEqualTo(String value) {
            addCriterion("increase_money =", value, "increaseMoney");
            return (Criteria) this;
        }

        public Criteria andIncreaseMoneyNotEqualTo(String value) {
            addCriterion("increase_money <>", value, "increaseMoney");
            return (Criteria) this;
        }

        public Criteria andIncreaseMoneyGreaterThan(String value) {
            addCriterion("increase_money >", value, "increaseMoney");
            return (Criteria) this;
        }

        public Criteria andIncreaseMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("increase_money >=", value, "increaseMoney");
            return (Criteria) this;
        }

        public Criteria andIncreaseMoneyLessThan(String value) {
            addCriterion("increase_money <", value, "increaseMoney");
            return (Criteria) this;
        }

        public Criteria andIncreaseMoneyLessThanOrEqualTo(String value) {
            addCriterion("increase_money <=", value, "increaseMoney");
            return (Criteria) this;
        }

        public Criteria andIncreaseMoneyLike(String value) {
            addCriterion("increase_money like", value, "increaseMoney");
            return (Criteria) this;
        }

        public Criteria andIncreaseMoneyNotLike(String value) {
            addCriterion("increase_money not like", value, "increaseMoney");
            return (Criteria) this;
        }

        public Criteria andIncreaseMoneyIn(List<String> values) {
            addCriterion("increase_money in", values, "increaseMoney");
            return (Criteria) this;
        }

        public Criteria andIncreaseMoneyNotIn(List<String> values) {
            addCriterion("increase_money not in", values, "increaseMoney");
            return (Criteria) this;
        }

        public Criteria andIncreaseMoneyBetween(String value1, String value2) {
            addCriterion("increase_money between", value1, value2, "increaseMoney");
            return (Criteria) this;
        }

        public Criteria andIncreaseMoneyNotBetween(String value1, String value2) {
            addCriterion("increase_money not between", value1, value2, "increaseMoney");
            return (Criteria) this;
        }

        public Criteria andMonthRiseIsNull() {
            addCriterion("month_rise is null");
            return (Criteria) this;
        }

        public Criteria andMonthRiseIsNotNull() {
            addCriterion("month_rise is not null");
            return (Criteria) this;
        }

        public Criteria andMonthRiseEqualTo(String value) {
            addCriterion("month_rise =", value, "monthRise");
            return (Criteria) this;
        }

        public Criteria andMonthRiseNotEqualTo(String value) {
            addCriterion("month_rise <>", value, "monthRise");
            return (Criteria) this;
        }

        public Criteria andMonthRiseGreaterThan(String value) {
            addCriterion("month_rise >", value, "monthRise");
            return (Criteria) this;
        }

        public Criteria andMonthRiseGreaterThanOrEqualTo(String value) {
            addCriterion("month_rise >=", value, "monthRise");
            return (Criteria) this;
        }

        public Criteria andMonthRiseLessThan(String value) {
            addCriterion("month_rise <", value, "monthRise");
            return (Criteria) this;
        }

        public Criteria andMonthRiseLessThanOrEqualTo(String value) {
            addCriterion("month_rise <=", value, "monthRise");
            return (Criteria) this;
        }

        public Criteria andMonthRiseLike(String value) {
            addCriterion("month_rise like", value, "monthRise");
            return (Criteria) this;
        }

        public Criteria andMonthRiseNotLike(String value) {
            addCriterion("month_rise not like", value, "monthRise");
            return (Criteria) this;
        }

        public Criteria andMonthRiseIn(List<String> values) {
            addCriterion("month_rise in", values, "monthRise");
            return (Criteria) this;
        }

        public Criteria andMonthRiseNotIn(List<String> values) {
            addCriterion("month_rise not in", values, "monthRise");
            return (Criteria) this;
        }

        public Criteria andMonthRiseBetween(String value1, String value2) {
            addCriterion("month_rise between", value1, value2, "monthRise");
            return (Criteria) this;
        }

        public Criteria andMonthRiseNotBetween(String value1, String value2) {
            addCriterion("month_rise not between", value1, value2, "monthRise");
            return (Criteria) this;
        }

        public Criteria andYearEarningsIsNull() {
            addCriterion("year_earnings is null");
            return (Criteria) this;
        }

        public Criteria andYearEarningsIsNotNull() {
            addCriterion("year_earnings is not null");
            return (Criteria) this;
        }

        public Criteria andYearEarningsEqualTo(String value) {
            addCriterion("year_earnings =", value, "yearEarnings");
            return (Criteria) this;
        }

        public Criteria andYearEarningsNotEqualTo(String value) {
            addCriterion("year_earnings <>", value, "yearEarnings");
            return (Criteria) this;
        }

        public Criteria andYearEarningsGreaterThan(String value) {
            addCriterion("year_earnings >", value, "yearEarnings");
            return (Criteria) this;
        }

        public Criteria andYearEarningsGreaterThanOrEqualTo(String value) {
            addCriterion("year_earnings >=", value, "yearEarnings");
            return (Criteria) this;
        }

        public Criteria andYearEarningsLessThan(String value) {
            addCriterion("year_earnings <", value, "yearEarnings");
            return (Criteria) this;
        }

        public Criteria andYearEarningsLessThanOrEqualTo(String value) {
            addCriterion("year_earnings <=", value, "yearEarnings");
            return (Criteria) this;
        }

        public Criteria andYearEarningsLike(String value) {
            addCriterion("year_earnings like", value, "yearEarnings");
            return (Criteria) this;
        }

        public Criteria andYearEarningsNotLike(String value) {
            addCriterion("year_earnings not like", value, "yearEarnings");
            return (Criteria) this;
        }

        public Criteria andYearEarningsIn(List<String> values) {
            addCriterion("year_earnings in", values, "yearEarnings");
            return (Criteria) this;
        }

        public Criteria andYearEarningsNotIn(List<String> values) {
            addCriterion("year_earnings not in", values, "yearEarnings");
            return (Criteria) this;
        }

        public Criteria andYearEarningsBetween(String value1, String value2) {
            addCriterion("year_earnings between", value1, value2, "yearEarnings");
            return (Criteria) this;
        }

        public Criteria andYearEarningsNotBetween(String value1, String value2) {
            addCriterion("year_earnings not between", value1, value2, "yearEarnings");
            return (Criteria) this;
        }

        public Criteria andMaxRetracementIsNull() {
            addCriterion("max_retracement is null");
            return (Criteria) this;
        }

        public Criteria andMaxRetracementIsNotNull() {
            addCriterion("max_retracement is not null");
            return (Criteria) this;
        }

        public Criteria andMaxRetracementEqualTo(String value) {
            addCriterion("max_retracement =", value, "maxRetracement");
            return (Criteria) this;
        }

        public Criteria andMaxRetracementNotEqualTo(String value) {
            addCriterion("max_retracement <>", value, "maxRetracement");
            return (Criteria) this;
        }

        public Criteria andMaxRetracementGreaterThan(String value) {
            addCriterion("max_retracement >", value, "maxRetracement");
            return (Criteria) this;
        }

        public Criteria andMaxRetracementGreaterThanOrEqualTo(String value) {
            addCriterion("max_retracement >=", value, "maxRetracement");
            return (Criteria) this;
        }

        public Criteria andMaxRetracementLessThan(String value) {
            addCriterion("max_retracement <", value, "maxRetracement");
            return (Criteria) this;
        }

        public Criteria andMaxRetracementLessThanOrEqualTo(String value) {
            addCriterion("max_retracement <=", value, "maxRetracement");
            return (Criteria) this;
        }

        public Criteria andMaxRetracementLike(String value) {
            addCriterion("max_retracement like", value, "maxRetracement");
            return (Criteria) this;
        }

        public Criteria andMaxRetracementNotLike(String value) {
            addCriterion("max_retracement not like", value, "maxRetracement");
            return (Criteria) this;
        }

        public Criteria andMaxRetracementIn(List<String> values) {
            addCriterion("max_retracement in", values, "maxRetracement");
            return (Criteria) this;
        }

        public Criteria andMaxRetracementNotIn(List<String> values) {
            addCriterion("max_retracement not in", values, "maxRetracement");
            return (Criteria) this;
        }

        public Criteria andMaxRetracementBetween(String value1, String value2) {
            addCriterion("max_retracement between", value1, value2, "maxRetracement");
            return (Criteria) this;
        }

        public Criteria andMaxRetracementNotBetween(String value1, String value2) {
            addCriterion("max_retracement not between", value1, value2, "maxRetracement");
            return (Criteria) this;
        }

        public Criteria andSumEarningsIsNull() {
            addCriterion("sum_earnings is null");
            return (Criteria) this;
        }

        public Criteria andSumEarningsIsNotNull() {
            addCriterion("sum_earnings is not null");
            return (Criteria) this;
        }

        public Criteria andSumEarningsEqualTo(String value) {
            addCriterion("sum_earnings =", value, "sumEarnings");
            return (Criteria) this;
        }

        public Criteria andSumEarningsNotEqualTo(String value) {
            addCriterion("sum_earnings <>", value, "sumEarnings");
            return (Criteria) this;
        }

        public Criteria andSumEarningsGreaterThan(String value) {
            addCriterion("sum_earnings >", value, "sumEarnings");
            return (Criteria) this;
        }

        public Criteria andSumEarningsGreaterThanOrEqualTo(String value) {
            addCriterion("sum_earnings >=", value, "sumEarnings");
            return (Criteria) this;
        }

        public Criteria andSumEarningsLessThan(String value) {
            addCriterion("sum_earnings <", value, "sumEarnings");
            return (Criteria) this;
        }

        public Criteria andSumEarningsLessThanOrEqualTo(String value) {
            addCriterion("sum_earnings <=", value, "sumEarnings");
            return (Criteria) this;
        }

        public Criteria andSumEarningsLike(String value) {
            addCriterion("sum_earnings like", value, "sumEarnings");
            return (Criteria) this;
        }

        public Criteria andSumEarningsNotLike(String value) {
            addCriterion("sum_earnings not like", value, "sumEarnings");
            return (Criteria) this;
        }

        public Criteria andSumEarningsIn(List<String> values) {
            addCriterion("sum_earnings in", values, "sumEarnings");
            return (Criteria) this;
        }

        public Criteria andSumEarningsNotIn(List<String> values) {
            addCriterion("sum_earnings not in", values, "sumEarnings");
            return (Criteria) this;
        }

        public Criteria andSumEarningsBetween(String value1, String value2) {
            addCriterion("sum_earnings between", value1, value2, "sumEarnings");
            return (Criteria) this;
        }

        public Criteria andSumEarningsNotBetween(String value1, String value2) {
            addCriterion("sum_earnings not between", value1, value2, "sumEarnings");
            return (Criteria) this;
        }

        public Criteria andLatestOpenTimeIsNull() {
            addCriterion("latest_open_time is null");
            return (Criteria) this;
        }

        public Criteria andLatestOpenTimeIsNotNull() {
            addCriterion("latest_open_time is not null");
            return (Criteria) this;
        }

        public Criteria andLatestOpenTimeEqualTo(String value) {
            addCriterion("latest_open_time =", value, "latestOpenTime");
            return (Criteria) this;
        }

        public Criteria andLatestOpenTimeNotEqualTo(String value) {
            addCriterion("latest_open_time <>", value, "latestOpenTime");
            return (Criteria) this;
        }

        public Criteria andLatestOpenTimeGreaterThan(String value) {
            addCriterion("latest_open_time >", value, "latestOpenTime");
            return (Criteria) this;
        }

        public Criteria andLatestOpenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("latest_open_time >=", value, "latestOpenTime");
            return (Criteria) this;
        }

        public Criteria andLatestOpenTimeLessThan(String value) {
            addCriterion("latest_open_time <", value, "latestOpenTime");
            return (Criteria) this;
        }

        public Criteria andLatestOpenTimeLessThanOrEqualTo(String value) {
            addCriterion("latest_open_time <=", value, "latestOpenTime");
            return (Criteria) this;
        }

        public Criteria andLatestOpenTimeLike(String value) {
            addCriterion("latest_open_time like", value, "latestOpenTime");
            return (Criteria) this;
        }

        public Criteria andLatestOpenTimeNotLike(String value) {
            addCriterion("latest_open_time not like", value, "latestOpenTime");
            return (Criteria) this;
        }

        public Criteria andLatestOpenTimeIn(List<String> values) {
            addCriterion("latest_open_time in", values, "latestOpenTime");
            return (Criteria) this;
        }

        public Criteria andLatestOpenTimeNotIn(List<String> values) {
            addCriterion("latest_open_time not in", values, "latestOpenTime");
            return (Criteria) this;
        }

        public Criteria andLatestOpenTimeBetween(String value1, String value2) {
            addCriterion("latest_open_time between", value1, value2, "latestOpenTime");
            return (Criteria) this;
        }

        public Criteria andLatestOpenTimeNotBetween(String value1, String value2) {
            addCriterion("latest_open_time not between", value1, value2, "latestOpenTime");
            return (Criteria) this;
        }

        public Criteria andLatestApplicationTimeIsNull() {
            addCriterion("latest_application_time is null");
            return (Criteria) this;
        }

        public Criteria andLatestApplicationTimeIsNotNull() {
            addCriterion("latest_application_time is not null");
            return (Criteria) this;
        }

        public Criteria andLatestApplicationTimeEqualTo(String value) {
            addCriterion("latest_application_time =", value, "latestApplicationTime");
            return (Criteria) this;
        }

        public Criteria andLatestApplicationTimeNotEqualTo(String value) {
            addCriterion("latest_application_time <>", value, "latestApplicationTime");
            return (Criteria) this;
        }

        public Criteria andLatestApplicationTimeGreaterThan(String value) {
            addCriterion("latest_application_time >", value, "latestApplicationTime");
            return (Criteria) this;
        }

        public Criteria andLatestApplicationTimeGreaterThanOrEqualTo(String value) {
            addCriterion("latest_application_time >=", value, "latestApplicationTime");
            return (Criteria) this;
        }

        public Criteria andLatestApplicationTimeLessThan(String value) {
            addCriterion("latest_application_time <", value, "latestApplicationTime");
            return (Criteria) this;
        }

        public Criteria andLatestApplicationTimeLessThanOrEqualTo(String value) {
            addCriterion("latest_application_time <=", value, "latestApplicationTime");
            return (Criteria) this;
        }

        public Criteria andLatestApplicationTimeLike(String value) {
            addCriterion("latest_application_time like", value, "latestApplicationTime");
            return (Criteria) this;
        }

        public Criteria andLatestApplicationTimeNotLike(String value) {
            addCriterion("latest_application_time not like", value, "latestApplicationTime");
            return (Criteria) this;
        }

        public Criteria andLatestApplicationTimeIn(List<String> values) {
            addCriterion("latest_application_time in", values, "latestApplicationTime");
            return (Criteria) this;
        }

        public Criteria andLatestApplicationTimeNotIn(List<String> values) {
            addCriterion("latest_application_time not in", values, "latestApplicationTime");
            return (Criteria) this;
        }

        public Criteria andLatestApplicationTimeBetween(String value1, String value2) {
            addCriterion("latest_application_time between", value1, value2, "latestApplicationTime");
            return (Criteria) this;
        }

        public Criteria andLatestApplicationTimeNotBetween(String value1, String value2) {
            addCriterion("latest_application_time not between", value1, value2, "latestApplicationTime");
            return (Criteria) this;
        }

        public Criteria andLatestRedemptionTimeIsNull() {
            addCriterion("latest_redemption_time is null");
            return (Criteria) this;
        }

        public Criteria andLatestRedemptionTimeIsNotNull() {
            addCriterion("latest_redemption_time is not null");
            return (Criteria) this;
        }

        public Criteria andLatestRedemptionTimeEqualTo(String value) {
            addCriterion("latest_redemption_time =", value, "latestRedemptionTime");
            return (Criteria) this;
        }

        public Criteria andLatestRedemptionTimeNotEqualTo(String value) {
            addCriterion("latest_redemption_time <>", value, "latestRedemptionTime");
            return (Criteria) this;
        }

        public Criteria andLatestRedemptionTimeGreaterThan(String value) {
            addCriterion("latest_redemption_time >", value, "latestRedemptionTime");
            return (Criteria) this;
        }

        public Criteria andLatestRedemptionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("latest_redemption_time >=", value, "latestRedemptionTime");
            return (Criteria) this;
        }

        public Criteria andLatestRedemptionTimeLessThan(String value) {
            addCriterion("latest_redemption_time <", value, "latestRedemptionTime");
            return (Criteria) this;
        }

        public Criteria andLatestRedemptionTimeLessThanOrEqualTo(String value) {
            addCriterion("latest_redemption_time <=", value, "latestRedemptionTime");
            return (Criteria) this;
        }

        public Criteria andLatestRedemptionTimeLike(String value) {
            addCriterion("latest_redemption_time like", value, "latestRedemptionTime");
            return (Criteria) this;
        }

        public Criteria andLatestRedemptionTimeNotLike(String value) {
            addCriterion("latest_redemption_time not like", value, "latestRedemptionTime");
            return (Criteria) this;
        }

        public Criteria andLatestRedemptionTimeIn(List<String> values) {
            addCriterion("latest_redemption_time in", values, "latestRedemptionTime");
            return (Criteria) this;
        }

        public Criteria andLatestRedemptionTimeNotIn(List<String> values) {
            addCriterion("latest_redemption_time not in", values, "latestRedemptionTime");
            return (Criteria) this;
        }

        public Criteria andLatestRedemptionTimeBetween(String value1, String value2) {
            addCriterion("latest_redemption_time between", value1, value2, "latestRedemptionTime");
            return (Criteria) this;
        }

        public Criteria andLatestRedemptionTimeNotBetween(String value1, String value2) {
            addCriterion("latest_redemption_time not between", value1, value2, "latestRedemptionTime");
            return (Criteria) this;
        }

        public Criteria andManageFeeIsNull() {
            addCriterion("manage_fee is null");
            return (Criteria) this;
        }

        public Criteria andManageFeeIsNotNull() {
            addCriterion("manage_fee is not null");
            return (Criteria) this;
        }

        public Criteria andManageFeeEqualTo(String value) {
            addCriterion("manage_fee =", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeNotEqualTo(String value) {
            addCriterion("manage_fee <>", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeGreaterThan(String value) {
            addCriterion("manage_fee >", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeGreaterThanOrEqualTo(String value) {
            addCriterion("manage_fee >=", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeLessThan(String value) {
            addCriterion("manage_fee <", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeLessThanOrEqualTo(String value) {
            addCriterion("manage_fee <=", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeLike(String value) {
            addCriterion("manage_fee like", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeNotLike(String value) {
            addCriterion("manage_fee not like", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeIn(List<String> values) {
            addCriterion("manage_fee in", values, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeNotIn(List<String> values) {
            addCriterion("manage_fee not in", values, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeBetween(String value1, String value2) {
            addCriterion("manage_fee between", value1, value2, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeNotBetween(String value1, String value2) {
            addCriterion("manage_fee not between", value1, value2, "manageFee");
            return (Criteria) this;
        }

        public Criteria andFullRoyaltyIsNull() {
            addCriterion("full_royalty is null");
            return (Criteria) this;
        }

        public Criteria andFullRoyaltyIsNotNull() {
            addCriterion("full_royalty is not null");
            return (Criteria) this;
        }

        public Criteria andFullRoyaltyEqualTo(String value) {
            addCriterion("full_royalty =", value, "fullRoyalty");
            return (Criteria) this;
        }

        public Criteria andFullRoyaltyNotEqualTo(String value) {
            addCriterion("full_royalty <>", value, "fullRoyalty");
            return (Criteria) this;
        }

        public Criteria andFullRoyaltyGreaterThan(String value) {
            addCriterion("full_royalty >", value, "fullRoyalty");
            return (Criteria) this;
        }

        public Criteria andFullRoyaltyGreaterThanOrEqualTo(String value) {
            addCriterion("full_royalty >=", value, "fullRoyalty");
            return (Criteria) this;
        }

        public Criteria andFullRoyaltyLessThan(String value) {
            addCriterion("full_royalty <", value, "fullRoyalty");
            return (Criteria) this;
        }

        public Criteria andFullRoyaltyLessThanOrEqualTo(String value) {
            addCriterion("full_royalty <=", value, "fullRoyalty");
            return (Criteria) this;
        }

        public Criteria andFullRoyaltyLike(String value) {
            addCriterion("full_royalty like", value, "fullRoyalty");
            return (Criteria) this;
        }

        public Criteria andFullRoyaltyNotLike(String value) {
            addCriterion("full_royalty not like", value, "fullRoyalty");
            return (Criteria) this;
        }

        public Criteria andFullRoyaltyIn(List<String> values) {
            addCriterion("full_royalty in", values, "fullRoyalty");
            return (Criteria) this;
        }

        public Criteria andFullRoyaltyNotIn(List<String> values) {
            addCriterion("full_royalty not in", values, "fullRoyalty");
            return (Criteria) this;
        }

        public Criteria andFullRoyaltyBetween(String value1, String value2) {
            addCriterion("full_royalty between", value1, value2, "fullRoyalty");
            return (Criteria) this;
        }

        public Criteria andFullRoyaltyNotBetween(String value1, String value2) {
            addCriterion("full_royalty not between", value1, value2, "fullRoyalty");
            return (Criteria) this;
        }

        public Criteria andDeductRoyaltyIsNull() {
            addCriterion("deduct_royalty is null");
            return (Criteria) this;
        }

        public Criteria andDeductRoyaltyIsNotNull() {
            addCriterion("deduct_royalty is not null");
            return (Criteria) this;
        }

        public Criteria andDeductRoyaltyEqualTo(String value) {
            addCriterion("deduct_royalty =", value, "deductRoyalty");
            return (Criteria) this;
        }

        public Criteria andDeductRoyaltyNotEqualTo(String value) {
            addCriterion("deduct_royalty <>", value, "deductRoyalty");
            return (Criteria) this;
        }

        public Criteria andDeductRoyaltyGreaterThan(String value) {
            addCriterion("deduct_royalty >", value, "deductRoyalty");
            return (Criteria) this;
        }

        public Criteria andDeductRoyaltyGreaterThanOrEqualTo(String value) {
            addCriterion("deduct_royalty >=", value, "deductRoyalty");
            return (Criteria) this;
        }

        public Criteria andDeductRoyaltyLessThan(String value) {
            addCriterion("deduct_royalty <", value, "deductRoyalty");
            return (Criteria) this;
        }

        public Criteria andDeductRoyaltyLessThanOrEqualTo(String value) {
            addCriterion("deduct_royalty <=", value, "deductRoyalty");
            return (Criteria) this;
        }

        public Criteria andDeductRoyaltyLike(String value) {
            addCriterion("deduct_royalty like", value, "deductRoyalty");
            return (Criteria) this;
        }

        public Criteria andDeductRoyaltyNotLike(String value) {
            addCriterion("deduct_royalty not like", value, "deductRoyalty");
            return (Criteria) this;
        }

        public Criteria andDeductRoyaltyIn(List<String> values) {
            addCriterion("deduct_royalty in", values, "deductRoyalty");
            return (Criteria) this;
        }

        public Criteria andDeductRoyaltyNotIn(List<String> values) {
            addCriterion("deduct_royalty not in", values, "deductRoyalty");
            return (Criteria) this;
        }

        public Criteria andDeductRoyaltyBetween(String value1, String value2) {
            addCriterion("deduct_royalty between", value1, value2, "deductRoyalty");
            return (Criteria) this;
        }

        public Criteria andDeductRoyaltyNotBetween(String value1, String value2) {
            addCriterion("deduct_royalty not between", value1, value2, "deductRoyalty");
            return (Criteria) this;
        }

        public Criteria andNowScaleIsNull() {
            addCriterion("now_scale is null");
            return (Criteria) this;
        }

        public Criteria andNowScaleIsNotNull() {
            addCriterion("now_scale is not null");
            return (Criteria) this;
        }

        public Criteria andNowScaleEqualTo(String value) {
            addCriterion("now_scale =", value, "nowScale");
            return (Criteria) this;
        }

        public Criteria andNowScaleNotEqualTo(String value) {
            addCriterion("now_scale <>", value, "nowScale");
            return (Criteria) this;
        }

        public Criteria andNowScaleGreaterThan(String value) {
            addCriterion("now_scale >", value, "nowScale");
            return (Criteria) this;
        }

        public Criteria andNowScaleGreaterThanOrEqualTo(String value) {
            addCriterion("now_scale >=", value, "nowScale");
            return (Criteria) this;
        }

        public Criteria andNowScaleLessThan(String value) {
            addCriterion("now_scale <", value, "nowScale");
            return (Criteria) this;
        }

        public Criteria andNowScaleLessThanOrEqualTo(String value) {
            addCriterion("now_scale <=", value, "nowScale");
            return (Criteria) this;
        }

        public Criteria andNowScaleLike(String value) {
            addCriterion("now_scale like", value, "nowScale");
            return (Criteria) this;
        }

        public Criteria andNowScaleNotLike(String value) {
            addCriterion("now_scale not like", value, "nowScale");
            return (Criteria) this;
        }

        public Criteria andNowScaleIn(List<String> values) {
            addCriterion("now_scale in", values, "nowScale");
            return (Criteria) this;
        }

        public Criteria andNowScaleNotIn(List<String> values) {
            addCriterion("now_scale not in", values, "nowScale");
            return (Criteria) this;
        }

        public Criteria andNowScaleBetween(String value1, String value2) {
            addCriterion("now_scale between", value1, value2, "nowScale");
            return (Criteria) this;
        }

        public Criteria andNowScaleNotBetween(String value1, String value2) {
            addCriterion("now_scale not between", value1, value2, "nowScale");
            return (Criteria) this;
        }

        public Criteria andSetupTimeIsNull() {
            addCriterion("setup_time is null");
            return (Criteria) this;
        }

        public Criteria andSetupTimeIsNotNull() {
            addCriterion("setup_time is not null");
            return (Criteria) this;
        }

        public Criteria andSetupTimeEqualTo(String value) {
            addCriterion("setup_time =", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeNotEqualTo(String value) {
            addCriterion("setup_time <>", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeGreaterThan(String value) {
            addCriterion("setup_time >", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeGreaterThanOrEqualTo(String value) {
            addCriterion("setup_time >=", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeLessThan(String value) {
            addCriterion("setup_time <", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeLessThanOrEqualTo(String value) {
            addCriterion("setup_time <=", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeLike(String value) {
            addCriterion("setup_time like", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeNotLike(String value) {
            addCriterion("setup_time not like", value, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeIn(List<String> values) {
            addCriterion("setup_time in", values, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeNotIn(List<String> values) {
            addCriterion("setup_time not in", values, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeBetween(String value1, String value2) {
            addCriterion("setup_time between", value1, value2, "setupTime");
            return (Criteria) this;
        }

        public Criteria andSetupTimeNotBetween(String value1, String value2) {
            addCriterion("setup_time not between", value1, value2, "setupTime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createtime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createtime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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