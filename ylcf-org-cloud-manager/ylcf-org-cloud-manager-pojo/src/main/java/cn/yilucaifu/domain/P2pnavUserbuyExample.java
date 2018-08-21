package cn.yilucaifu.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class P2pnavUserbuyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public P2pnavUserbuyExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andP2pnavIdIsNull() {
            addCriterion("p2pnav_id is null");
            return (Criteria) this;
        }

        public Criteria andP2pnavIdIsNotNull() {
            addCriterion("p2pnav_id is not null");
            return (Criteria) this;
        }

        public Criteria andP2pnavIdEqualTo(String value) {
            addCriterion("p2pnav_id =", value, "p2pnavId");
            return (Criteria) this;
        }

        public Criteria andP2pnavIdNotEqualTo(String value) {
            addCriterion("p2pnav_id <>", value, "p2pnavId");
            return (Criteria) this;
        }

        public Criteria andP2pnavIdGreaterThan(String value) {
            addCriterion("p2pnav_id >", value, "p2pnavId");
            return (Criteria) this;
        }

        public Criteria andP2pnavIdGreaterThanOrEqualTo(String value) {
            addCriterion("p2pnav_id >=", value, "p2pnavId");
            return (Criteria) this;
        }

        public Criteria andP2pnavIdLessThan(String value) {
            addCriterion("p2pnav_id <", value, "p2pnavId");
            return (Criteria) this;
        }

        public Criteria andP2pnavIdLessThanOrEqualTo(String value) {
            addCriterion("p2pnav_id <=", value, "p2pnavId");
            return (Criteria) this;
        }

        public Criteria andP2pnavIdLike(String value) {
            addCriterion("p2pnav_id like", value, "p2pnavId");
            return (Criteria) this;
        }

        public Criteria andP2pnavIdNotLike(String value) {
            addCriterion("p2pnav_id not like", value, "p2pnavId");
            return (Criteria) this;
        }

        public Criteria andP2pnavIdIn(List<String> values) {
            addCriterion("p2pnav_id in", values, "p2pnavId");
            return (Criteria) this;
        }

        public Criteria andP2pnavIdNotIn(List<String> values) {
            addCriterion("p2pnav_id not in", values, "p2pnavId");
            return (Criteria) this;
        }

        public Criteria andP2pnavIdBetween(String value1, String value2) {
            addCriterion("p2pnav_id between", value1, value2, "p2pnavId");
            return (Criteria) this;
        }

        public Criteria andP2pnavIdNotBetween(String value1, String value2) {
            addCriterion("p2pnav_id not between", value1, value2, "p2pnavId");
            return (Criteria) this;
        }

        public Criteria andP2pnavnameIsNull() {
            addCriterion("p2pnavName is null");
            return (Criteria) this;
        }

        public Criteria andP2pnavnameIsNotNull() {
            addCriterion("p2pnavName is not null");
            return (Criteria) this;
        }

        public Criteria andP2pnavnameEqualTo(String value) {
            addCriterion("p2pnavName =", value, "p2pnavname");
            return (Criteria) this;
        }

        public Criteria andP2pnavnameNotEqualTo(String value) {
            addCriterion("p2pnavName <>", value, "p2pnavname");
            return (Criteria) this;
        }

        public Criteria andP2pnavnameGreaterThan(String value) {
            addCriterion("p2pnavName >", value, "p2pnavname");
            return (Criteria) this;
        }

        public Criteria andP2pnavnameGreaterThanOrEqualTo(String value) {
            addCriterion("p2pnavName >=", value, "p2pnavname");
            return (Criteria) this;
        }

        public Criteria andP2pnavnameLessThan(String value) {
            addCriterion("p2pnavName <", value, "p2pnavname");
            return (Criteria) this;
        }

        public Criteria andP2pnavnameLessThanOrEqualTo(String value) {
            addCriterion("p2pnavName <=", value, "p2pnavname");
            return (Criteria) this;
        }

        public Criteria andP2pnavnameLike(String value) {
            addCriterion("p2pnavName like", value, "p2pnavname");
            return (Criteria) this;
        }

        public Criteria andP2pnavnameNotLike(String value) {
            addCriterion("p2pnavName not like", value, "p2pnavname");
            return (Criteria) this;
        }

        public Criteria andP2pnavnameIn(List<String> values) {
            addCriterion("p2pnavName in", values, "p2pnavname");
            return (Criteria) this;
        }

        public Criteria andP2pnavnameNotIn(List<String> values) {
            addCriterion("p2pnavName not in", values, "p2pnavname");
            return (Criteria) this;
        }

        public Criteria andP2pnavnameBetween(String value1, String value2) {
            addCriterion("p2pnavName between", value1, value2, "p2pnavname");
            return (Criteria) this;
        }

        public Criteria andP2pnavnameNotBetween(String value1, String value2) {
            addCriterion("p2pnavName not between", value1, value2, "p2pnavname");
            return (Criteria) this;
        }

        public Criteria andTypecodeIsNull() {
            addCriterion("typecode is null");
            return (Criteria) this;
        }

        public Criteria andTypecodeIsNotNull() {
            addCriterion("typecode is not null");
            return (Criteria) this;
        }

        public Criteria andTypecodeEqualTo(String value) {
            addCriterion("typecode =", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotEqualTo(String value) {
            addCriterion("typecode <>", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThan(String value) {
            addCriterion("typecode >", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("typecode >=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThan(String value) {
            addCriterion("typecode <", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThanOrEqualTo(String value) {
            addCriterion("typecode <=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLike(String value) {
            addCriterion("typecode like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotLike(String value) {
            addCriterion("typecode not like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeIn(List<String> values) {
            addCriterion("typecode in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotIn(List<String> values) {
            addCriterion("typecode not in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeBetween(String value1, String value2) {
            addCriterion("typecode between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotBetween(String value1, String value2) {
            addCriterion("typecode not between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNull() {
            addCriterion("payStatus is null");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNotNull() {
            addCriterion("payStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPaystatusEqualTo(Short value) {
            addCriterion("payStatus =", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotEqualTo(Short value) {
            addCriterion("payStatus <>", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThan(Short value) {
            addCriterion("payStatus >", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThanOrEqualTo(Short value) {
            addCriterion("payStatus >=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThan(Short value) {
            addCriterion("payStatus <", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThanOrEqualTo(Short value) {
            addCriterion("payStatus <=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusIn(List<Short> values) {
            addCriterion("payStatus in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotIn(List<Short> values) {
            addCriterion("payStatus not in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusBetween(Short value1, Short value2) {
            addCriterion("payStatus between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotBetween(Short value1, Short value2) {
            addCriterion("payStatus not between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNull() {
            addCriterion("orderTime is null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNotNull() {
            addCriterion("orderTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeEqualTo(String value) {
            addCriterion("orderTime =", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotEqualTo(String value) {
            addCriterion("orderTime <>", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThan(String value) {
            addCriterion("orderTime >", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThanOrEqualTo(String value) {
            addCriterion("orderTime >=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThan(String value) {
            addCriterion("orderTime <", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThanOrEqualTo(String value) {
            addCriterion("orderTime <=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLike(String value) {
            addCriterion("orderTime like", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotLike(String value) {
            addCriterion("orderTime not like", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIn(List<String> values) {
            addCriterion("orderTime in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotIn(List<String> values) {
            addCriterion("orderTime not in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeBetween(String value1, String value2) {
            addCriterion("orderTime between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotBetween(String value1, String value2) {
            addCriterion("orderTime not between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("payTime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("payTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(String value) {
            addCriterion("payTime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(String value) {
            addCriterion("payTime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(String value) {
            addCriterion("payTime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(String value) {
            addCriterion("payTime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(String value) {
            addCriterion("payTime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(String value) {
            addCriterion("payTime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLike(String value) {
            addCriterion("payTime like", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotLike(String value) {
            addCriterion("payTime not like", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<String> values) {
            addCriterion("payTime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<String> values) {
            addCriterion("payTime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(String value1, String value2) {
            addCriterion("payTime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(String value1, String value2) {
            addCriterion("payTime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andBuyShareIsNull() {
            addCriterion("buy_share is null");
            return (Criteria) this;
        }

        public Criteria andBuyShareIsNotNull() {
            addCriterion("buy_share is not null");
            return (Criteria) this;
        }

        public Criteria andBuyShareEqualTo(String value) {
            addCriterion("buy_share =", value, "buyShare");
            return (Criteria) this;
        }

        public Criteria andBuyShareNotEqualTo(String value) {
            addCriterion("buy_share <>", value, "buyShare");
            return (Criteria) this;
        }

        public Criteria andBuyShareGreaterThan(String value) {
            addCriterion("buy_share >", value, "buyShare");
            return (Criteria) this;
        }

        public Criteria andBuyShareGreaterThanOrEqualTo(String value) {
            addCriterion("buy_share >=", value, "buyShare");
            return (Criteria) this;
        }

        public Criteria andBuyShareLessThan(String value) {
            addCriterion("buy_share <", value, "buyShare");
            return (Criteria) this;
        }

        public Criteria andBuyShareLessThanOrEqualTo(String value) {
            addCriterion("buy_share <=", value, "buyShare");
            return (Criteria) this;
        }

        public Criteria andBuyShareLike(String value) {
            addCriterion("buy_share like", value, "buyShare");
            return (Criteria) this;
        }

        public Criteria andBuyShareNotLike(String value) {
            addCriterion("buy_share not like", value, "buyShare");
            return (Criteria) this;
        }

        public Criteria andBuyShareIn(List<String> values) {
            addCriterion("buy_share in", values, "buyShare");
            return (Criteria) this;
        }

        public Criteria andBuyShareNotIn(List<String> values) {
            addCriterion("buy_share not in", values, "buyShare");
            return (Criteria) this;
        }

        public Criteria andBuyShareBetween(String value1, String value2) {
            addCriterion("buy_share between", value1, value2, "buyShare");
            return (Criteria) this;
        }

        public Criteria andBuyShareNotBetween(String value1, String value2) {
            addCriterion("buy_share not between", value1, value2, "buyShare");
            return (Criteria) this;
        }

        public Criteria andChargeIsNull() {
            addCriterion("charge is null");
            return (Criteria) this;
        }

        public Criteria andChargeIsNotNull() {
            addCriterion("charge is not null");
            return (Criteria) this;
        }

        public Criteria andChargeEqualTo(String value) {
            addCriterion("charge =", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotEqualTo(String value) {
            addCriterion("charge <>", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThan(String value) {
            addCriterion("charge >", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThanOrEqualTo(String value) {
            addCriterion("charge >=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThan(String value) {
            addCriterion("charge <", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThanOrEqualTo(String value) {
            addCriterion("charge <=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLike(String value) {
            addCriterion("charge like", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotLike(String value) {
            addCriterion("charge not like", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeIn(List<String> values) {
            addCriterion("charge in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotIn(List<String> values) {
            addCriterion("charge not in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeBetween(String value1, String value2) {
            addCriterion("charge between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotBetween(String value1, String value2) {
            addCriterion("charge not between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsIsNull() {
            addCriterion("p2pnav_periods is null");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsIsNotNull() {
            addCriterion("p2pnav_periods is not null");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsEqualTo(String value) {
            addCriterion("p2pnav_periods =", value, "p2pnavPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsNotEqualTo(String value) {
            addCriterion("p2pnav_periods <>", value, "p2pnavPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsGreaterThan(String value) {
            addCriterion("p2pnav_periods >", value, "p2pnavPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsGreaterThanOrEqualTo(String value) {
            addCriterion("p2pnav_periods >=", value, "p2pnavPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsLessThan(String value) {
            addCriterion("p2pnav_periods <", value, "p2pnavPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsLessThanOrEqualTo(String value) {
            addCriterion("p2pnav_periods <=", value, "p2pnavPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsLike(String value) {
            addCriterion("p2pnav_periods like", value, "p2pnavPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsNotLike(String value) {
            addCriterion("p2pnav_periods not like", value, "p2pnavPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsIn(List<String> values) {
            addCriterion("p2pnav_periods in", values, "p2pnavPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsNotIn(List<String> values) {
            addCriterion("p2pnav_periods not in", values, "p2pnavPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsBetween(String value1, String value2) {
            addCriterion("p2pnav_periods between", value1, value2, "p2pnavPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsNotBetween(String value1, String value2) {
            addCriterion("p2pnav_periods not between", value1, value2, "p2pnavPeriods");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsUnitIsNull() {
            addCriterion("p2pnav_periods_unit is null");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsUnitIsNotNull() {
            addCriterion("p2pnav_periods_unit is not null");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsUnitEqualTo(Integer value) {
            addCriterion("p2pnav_periods_unit =", value, "p2pnavPeriodsUnit");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsUnitNotEqualTo(Integer value) {
            addCriterion("p2pnav_periods_unit <>", value, "p2pnavPeriodsUnit");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsUnitGreaterThan(Integer value) {
            addCriterion("p2pnav_periods_unit >", value, "p2pnavPeriodsUnit");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("p2pnav_periods_unit >=", value, "p2pnavPeriodsUnit");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsUnitLessThan(Integer value) {
            addCriterion("p2pnav_periods_unit <", value, "p2pnavPeriodsUnit");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsUnitLessThanOrEqualTo(Integer value) {
            addCriterion("p2pnav_periods_unit <=", value, "p2pnavPeriodsUnit");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsUnitIn(List<Integer> values) {
            addCriterion("p2pnav_periods_unit in", values, "p2pnavPeriodsUnit");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsUnitNotIn(List<Integer> values) {
            addCriterion("p2pnav_periods_unit not in", values, "p2pnavPeriodsUnit");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsUnitBetween(Integer value1, Integer value2) {
            addCriterion("p2pnav_periods_unit between", value1, value2, "p2pnavPeriodsUnit");
            return (Criteria) this;
        }

        public Criteria andP2pnavPeriodsUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("p2pnav_periods_unit not between", value1, value2, "p2pnavPeriodsUnit");
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

        public Criteria andAmountprofitIsNull() {
            addCriterion("amountProfit is null");
            return (Criteria) this;
        }

        public Criteria andAmountprofitIsNotNull() {
            addCriterion("amountProfit is not null");
            return (Criteria) this;
        }

        public Criteria andAmountprofitEqualTo(BigDecimal value) {
            addCriterion("amountProfit =", value, "amountprofit");
            return (Criteria) this;
        }

        public Criteria andAmountprofitNotEqualTo(BigDecimal value) {
            addCriterion("amountProfit <>", value, "amountprofit");
            return (Criteria) this;
        }

        public Criteria andAmountprofitGreaterThan(BigDecimal value) {
            addCriterion("amountProfit >", value, "amountprofit");
            return (Criteria) this;
        }

        public Criteria andAmountprofitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amountProfit >=", value, "amountprofit");
            return (Criteria) this;
        }

        public Criteria andAmountprofitLessThan(BigDecimal value) {
            addCriterion("amountProfit <", value, "amountprofit");
            return (Criteria) this;
        }

        public Criteria andAmountprofitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amountProfit <=", value, "amountprofit");
            return (Criteria) this;
        }

        public Criteria andAmountprofitIn(List<BigDecimal> values) {
            addCriterion("amountProfit in", values, "amountprofit");
            return (Criteria) this;
        }

        public Criteria andAmountprofitNotIn(List<BigDecimal> values) {
            addCriterion("amountProfit not in", values, "amountprofit");
            return (Criteria) this;
        }

        public Criteria andAmountprofitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amountProfit between", value1, value2, "amountprofit");
            return (Criteria) this;
        }

        public Criteria andAmountprofitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amountProfit not between", value1, value2, "amountprofit");
            return (Criteria) this;
        }

        public Criteria andAccumprofitIsNull() {
            addCriterion("accumProfit is null");
            return (Criteria) this;
        }

        public Criteria andAccumprofitIsNotNull() {
            addCriterion("accumProfit is not null");
            return (Criteria) this;
        }

        public Criteria andAccumprofitEqualTo(BigDecimal value) {
            addCriterion("accumProfit =", value, "accumprofit");
            return (Criteria) this;
        }

        public Criteria andAccumprofitNotEqualTo(BigDecimal value) {
            addCriterion("accumProfit <>", value, "accumprofit");
            return (Criteria) this;
        }

        public Criteria andAccumprofitGreaterThan(BigDecimal value) {
            addCriterion("accumProfit >", value, "accumprofit");
            return (Criteria) this;
        }

        public Criteria andAccumprofitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("accumProfit >=", value, "accumprofit");
            return (Criteria) this;
        }

        public Criteria andAccumprofitLessThan(BigDecimal value) {
            addCriterion("accumProfit <", value, "accumprofit");
            return (Criteria) this;
        }

        public Criteria andAccumprofitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("accumProfit <=", value, "accumprofit");
            return (Criteria) this;
        }

        public Criteria andAccumprofitIn(List<BigDecimal> values) {
            addCriterion("accumProfit in", values, "accumprofit");
            return (Criteria) this;
        }

        public Criteria andAccumprofitNotIn(List<BigDecimal> values) {
            addCriterion("accumProfit not in", values, "accumprofit");
            return (Criteria) this;
        }

        public Criteria andAccumprofitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accumProfit between", value1, value2, "accumprofit");
            return (Criteria) this;
        }

        public Criteria andAccumprofitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accumProfit not between", value1, value2, "accumprofit");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andEAccountIsNull() {
            addCriterion("e_account is null");
            return (Criteria) this;
        }

        public Criteria andEAccountIsNotNull() {
            addCriterion("e_account is not null");
            return (Criteria) this;
        }

        public Criteria andEAccountEqualTo(String value) {
            addCriterion("e_account =", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountNotEqualTo(String value) {
            addCriterion("e_account <>", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountGreaterThan(String value) {
            addCriterion("e_account >", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountGreaterThanOrEqualTo(String value) {
            addCriterion("e_account >=", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountLessThan(String value) {
            addCriterion("e_account <", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountLessThanOrEqualTo(String value) {
            addCriterion("e_account <=", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountLike(String value) {
            addCriterion("e_account like", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountNotLike(String value) {
            addCriterion("e_account not like", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountIn(List<String> values) {
            addCriterion("e_account in", values, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountNotIn(List<String> values) {
            addCriterion("e_account not in", values, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountBetween(String value1, String value2) {
            addCriterion("e_account between", value1, value2, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountNotBetween(String value1, String value2) {
            addCriterion("e_account not between", value1, value2, "eAccount");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeIsNull() {
            addCriterion("identity_code is null");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeIsNotNull() {
            addCriterion("identity_code is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeEqualTo(String value) {
            addCriterion("identity_code =", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeNotEqualTo(String value) {
            addCriterion("identity_code <>", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeGreaterThan(String value) {
            addCriterion("identity_code >", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("identity_code >=", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeLessThan(String value) {
            addCriterion("identity_code <", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeLessThanOrEqualTo(String value) {
            addCriterion("identity_code <=", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeLike(String value) {
            addCriterion("identity_code like", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeNotLike(String value) {
            addCriterion("identity_code not like", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeIn(List<String> values) {
            addCriterion("identity_code in", values, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeNotIn(List<String> values) {
            addCriterion("identity_code not in", values, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeBetween(String value1, String value2) {
            addCriterion("identity_code between", value1, value2, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeNotBetween(String value1, String value2) {
            addCriterion("identity_code not between", value1, value2, "identityCode");
            return (Criteria) this;
        }

        public Criteria andBankbookIsNull() {
            addCriterion("bankbook is null");
            return (Criteria) this;
        }

        public Criteria andBankbookIsNotNull() {
            addCriterion("bankbook is not null");
            return (Criteria) this;
        }

        public Criteria andBankbookEqualTo(String value) {
            addCriterion("bankbook =", value, "bankbook");
            return (Criteria) this;
        }

        public Criteria andBankbookNotEqualTo(String value) {
            addCriterion("bankbook <>", value, "bankbook");
            return (Criteria) this;
        }

        public Criteria andBankbookGreaterThan(String value) {
            addCriterion("bankbook >", value, "bankbook");
            return (Criteria) this;
        }

        public Criteria andBankbookGreaterThanOrEqualTo(String value) {
            addCriterion("bankbook >=", value, "bankbook");
            return (Criteria) this;
        }

        public Criteria andBankbookLessThan(String value) {
            addCriterion("bankbook <", value, "bankbook");
            return (Criteria) this;
        }

        public Criteria andBankbookLessThanOrEqualTo(String value) {
            addCriterion("bankbook <=", value, "bankbook");
            return (Criteria) this;
        }

        public Criteria andBankbookLike(String value) {
            addCriterion("bankbook like", value, "bankbook");
            return (Criteria) this;
        }

        public Criteria andBankbookNotLike(String value) {
            addCriterion("bankbook not like", value, "bankbook");
            return (Criteria) this;
        }

        public Criteria andBankbookIn(List<String> values) {
            addCriterion("bankbook in", values, "bankbook");
            return (Criteria) this;
        }

        public Criteria andBankbookNotIn(List<String> values) {
            addCriterion("bankbook not in", values, "bankbook");
            return (Criteria) this;
        }

        public Criteria andBankbookBetween(String value1, String value2) {
            addCriterion("bankbook between", value1, value2, "bankbook");
            return (Criteria) this;
        }

        public Criteria andBankbookNotBetween(String value1, String value2) {
            addCriterion("bankbook not between", value1, value2, "bankbook");
            return (Criteria) this;
        }

        public Criteria andBanknoIsNull() {
            addCriterion("bankno is null");
            return (Criteria) this;
        }

        public Criteria andBanknoIsNotNull() {
            addCriterion("bankno is not null");
            return (Criteria) this;
        }

        public Criteria andBanknoEqualTo(String value) {
            addCriterion("bankno =", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotEqualTo(String value) {
            addCriterion("bankno <>", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThan(String value) {
            addCriterion("bankno >", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThanOrEqualTo(String value) {
            addCriterion("bankno >=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThan(String value) {
            addCriterion("bankno <", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThanOrEqualTo(String value) {
            addCriterion("bankno <=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLike(String value) {
            addCriterion("bankno like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotLike(String value) {
            addCriterion("bankno not like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoIn(List<String> values) {
            addCriterion("bankno in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotIn(List<String> values) {
            addCriterion("bankno not in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoBetween(String value1, String value2) {
            addCriterion("bankno between", value1, value2, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotBetween(String value1, String value2) {
            addCriterion("bankno not between", value1, value2, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("bankname is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("bankname is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("bankname =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("bankname <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("bankname >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("bankname >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("bankname <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("bankname <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("bankname like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("bankname not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("bankname in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("bankname not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("bankname between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("bankname not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andClientIsNull() {
            addCriterion("client is null");
            return (Criteria) this;
        }

        public Criteria andClientIsNotNull() {
            addCriterion("client is not null");
            return (Criteria) this;
        }

        public Criteria andClientEqualTo(String value) {
            addCriterion("client =", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotEqualTo(String value) {
            addCriterion("client <>", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThan(String value) {
            addCriterion("client >", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThanOrEqualTo(String value) {
            addCriterion("client >=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThan(String value) {
            addCriterion("client <", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThanOrEqualTo(String value) {
            addCriterion("client <=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLike(String value) {
            addCriterion("client like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotLike(String value) {
            addCriterion("client not like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientIn(List<String> values) {
            addCriterion("client in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotIn(List<String> values) {
            addCriterion("client not in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientBetween(String value1, String value2) {
            addCriterion("client between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotBetween(String value1, String value2) {
            addCriterion("client not between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("pay_way is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("pay_way is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(Integer value) {
            addCriterion("pay_way =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(Integer value) {
            addCriterion("pay_way <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(Integer value) {
            addCriterion("pay_way >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_way >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(Integer value) {
            addCriterion("pay_way <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(Integer value) {
            addCriterion("pay_way <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<Integer> values) {
            addCriterion("pay_way in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<Integer> values) {
            addCriterion("pay_way not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(Integer value1, Integer value2) {
            addCriterion("pay_way between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_way not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoIsNull() {
            addCriterion("mobiletelno is null");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoIsNotNull() {
            addCriterion("mobiletelno is not null");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoEqualTo(String value) {
            addCriterion("mobiletelno =", value, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoNotEqualTo(String value) {
            addCriterion("mobiletelno <>", value, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoGreaterThan(String value) {
            addCriterion("mobiletelno >", value, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoGreaterThanOrEqualTo(String value) {
            addCriterion("mobiletelno >=", value, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoLessThan(String value) {
            addCriterion("mobiletelno <", value, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoLessThanOrEqualTo(String value) {
            addCriterion("mobiletelno <=", value, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoLike(String value) {
            addCriterion("mobiletelno like", value, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoNotLike(String value) {
            addCriterion("mobiletelno not like", value, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoIn(List<String> values) {
            addCriterion("mobiletelno in", values, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoNotIn(List<String> values) {
            addCriterion("mobiletelno not in", values, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoBetween(String value1, String value2) {
            addCriterion("mobiletelno between", value1, value2, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoNotBetween(String value1, String value2) {
            addCriterion("mobiletelno not between", value1, value2, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andPayProofIsNull() {
            addCriterion("pay_proof is null");
            return (Criteria) this;
        }

        public Criteria andPayProofIsNotNull() {
            addCriterion("pay_proof is not null");
            return (Criteria) this;
        }

        public Criteria andPayProofEqualTo(String value) {
            addCriterion("pay_proof =", value, "payProof");
            return (Criteria) this;
        }

        public Criteria andPayProofNotEqualTo(String value) {
            addCriterion("pay_proof <>", value, "payProof");
            return (Criteria) this;
        }

        public Criteria andPayProofGreaterThan(String value) {
            addCriterion("pay_proof >", value, "payProof");
            return (Criteria) this;
        }

        public Criteria andPayProofGreaterThanOrEqualTo(String value) {
            addCriterion("pay_proof >=", value, "payProof");
            return (Criteria) this;
        }

        public Criteria andPayProofLessThan(String value) {
            addCriterion("pay_proof <", value, "payProof");
            return (Criteria) this;
        }

        public Criteria andPayProofLessThanOrEqualTo(String value) {
            addCriterion("pay_proof <=", value, "payProof");
            return (Criteria) this;
        }

        public Criteria andPayProofLike(String value) {
            addCriterion("pay_proof like", value, "payProof");
            return (Criteria) this;
        }

        public Criteria andPayProofNotLike(String value) {
            addCriterion("pay_proof not like", value, "payProof");
            return (Criteria) this;
        }

        public Criteria andPayProofIn(List<String> values) {
            addCriterion("pay_proof in", values, "payProof");
            return (Criteria) this;
        }

        public Criteria andPayProofNotIn(List<String> values) {
            addCriterion("pay_proof not in", values, "payProof");
            return (Criteria) this;
        }

        public Criteria andPayProofBetween(String value1, String value2) {
            addCriterion("pay_proof between", value1, value2, "payProof");
            return (Criteria) this;
        }

        public Criteria andPayProofNotBetween(String value1, String value2) {
            addCriterion("pay_proof not between", value1, value2, "payProof");
            return (Criteria) this;
        }

        public Criteria andPayApplyIsNull() {
            addCriterion("pay_apply is null");
            return (Criteria) this;
        }

        public Criteria andPayApplyIsNotNull() {
            addCriterion("pay_apply is not null");
            return (Criteria) this;
        }

        public Criteria andPayApplyEqualTo(String value) {
            addCriterion("pay_apply =", value, "payApply");
            return (Criteria) this;
        }

        public Criteria andPayApplyNotEqualTo(String value) {
            addCriterion("pay_apply <>", value, "payApply");
            return (Criteria) this;
        }

        public Criteria andPayApplyGreaterThan(String value) {
            addCriterion("pay_apply >", value, "payApply");
            return (Criteria) this;
        }

        public Criteria andPayApplyGreaterThanOrEqualTo(String value) {
            addCriterion("pay_apply >=", value, "payApply");
            return (Criteria) this;
        }

        public Criteria andPayApplyLessThan(String value) {
            addCriterion("pay_apply <", value, "payApply");
            return (Criteria) this;
        }

        public Criteria andPayApplyLessThanOrEqualTo(String value) {
            addCriterion("pay_apply <=", value, "payApply");
            return (Criteria) this;
        }

        public Criteria andPayApplyLike(String value) {
            addCriterion("pay_apply like", value, "payApply");
            return (Criteria) this;
        }

        public Criteria andPayApplyNotLike(String value) {
            addCriterion("pay_apply not like", value, "payApply");
            return (Criteria) this;
        }

        public Criteria andPayApplyIn(List<String> values) {
            addCriterion("pay_apply in", values, "payApply");
            return (Criteria) this;
        }

        public Criteria andPayApplyNotIn(List<String> values) {
            addCriterion("pay_apply not in", values, "payApply");
            return (Criteria) this;
        }

        public Criteria andPayApplyBetween(String value1, String value2) {
            addCriterion("pay_apply between", value1, value2, "payApply");
            return (Criteria) this;
        }

        public Criteria andPayApplyNotBetween(String value1, String value2) {
            addCriterion("pay_apply not between", value1, value2, "payApply");
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

        public Criteria andUsernoIsNull() {
            addCriterion("userNo is null");
            return (Criteria) this;
        }

        public Criteria andUsernoIsNotNull() {
            addCriterion("userNo is not null");
            return (Criteria) this;
        }

        public Criteria andUsernoEqualTo(String value) {
            addCriterion("userNo =", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotEqualTo(String value) {
            addCriterion("userNo <>", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoGreaterThan(String value) {
            addCriterion("userNo >", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoGreaterThanOrEqualTo(String value) {
            addCriterion("userNo >=", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoLessThan(String value) {
            addCriterion("userNo <", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoLessThanOrEqualTo(String value) {
            addCriterion("userNo <=", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoLike(String value) {
            addCriterion("userNo like", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotLike(String value) {
            addCriterion("userNo not like", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoIn(List<String> values) {
            addCriterion("userNo in", values, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotIn(List<String> values) {
            addCriterion("userNo not in", values, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoBetween(String value1, String value2) {
            addCriterion("userNo between", value1, value2, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotBetween(String value1, String value2) {
            addCriterion("userNo not between", value1, value2, "userno");
            return (Criteria) this;
        }

        public Criteria andRetcodeIsNull() {
            addCriterion("retcode is null");
            return (Criteria) this;
        }

        public Criteria andRetcodeIsNotNull() {
            addCriterion("retcode is not null");
            return (Criteria) this;
        }

        public Criteria andRetcodeEqualTo(String value) {
            addCriterion("retcode =", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeNotEqualTo(String value) {
            addCriterion("retcode <>", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeGreaterThan(String value) {
            addCriterion("retcode >", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeGreaterThanOrEqualTo(String value) {
            addCriterion("retcode >=", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeLessThan(String value) {
            addCriterion("retcode <", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeLessThanOrEqualTo(String value) {
            addCriterion("retcode <=", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeLike(String value) {
            addCriterion("retcode like", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeNotLike(String value) {
            addCriterion("retcode not like", value, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeIn(List<String> values) {
            addCriterion("retcode in", values, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeNotIn(List<String> values) {
            addCriterion("retcode not in", values, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeBetween(String value1, String value2) {
            addCriterion("retcode between", value1, value2, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetcodeNotBetween(String value1, String value2) {
            addCriterion("retcode not between", value1, value2, "retcode");
            return (Criteria) this;
        }

        public Criteria andRetmsgIsNull() {
            addCriterion("retmsg is null");
            return (Criteria) this;
        }

        public Criteria andRetmsgIsNotNull() {
            addCriterion("retmsg is not null");
            return (Criteria) this;
        }

        public Criteria andRetmsgEqualTo(String value) {
            addCriterion("retmsg =", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgNotEqualTo(String value) {
            addCriterion("retmsg <>", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgGreaterThan(String value) {
            addCriterion("retmsg >", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgGreaterThanOrEqualTo(String value) {
            addCriterion("retmsg >=", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgLessThan(String value) {
            addCriterion("retmsg <", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgLessThanOrEqualTo(String value) {
            addCriterion("retmsg <=", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgLike(String value) {
            addCriterion("retmsg like", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgNotLike(String value) {
            addCriterion("retmsg not like", value, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgIn(List<String> values) {
            addCriterion("retmsg in", values, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgNotIn(List<String> values) {
            addCriterion("retmsg not in", values, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgBetween(String value1, String value2) {
            addCriterion("retmsg between", value1, value2, "retmsg");
            return (Criteria) this;
        }

        public Criteria andRetmsgNotBetween(String value1, String value2) {
            addCriterion("retmsg not between", value1, value2, "retmsg");
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