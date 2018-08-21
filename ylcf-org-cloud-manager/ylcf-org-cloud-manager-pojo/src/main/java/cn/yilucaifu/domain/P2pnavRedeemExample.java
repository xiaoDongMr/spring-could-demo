package cn.yilucaifu.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class P2pnavRedeemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public P2pnavRedeemExample() {
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

        public Criteria andP2pnavuserbuyidIsNull() {
            addCriterion("p2pNavUserBuyId is null");
            return (Criteria) this;
        }

        public Criteria andP2pnavuserbuyidIsNotNull() {
            addCriterion("p2pNavUserBuyId is not null");
            return (Criteria) this;
        }

        public Criteria andP2pnavuserbuyidEqualTo(Integer value) {
            addCriterion("p2pNavUserBuyId =", value, "p2pnavuserbuyid");
            return (Criteria) this;
        }

        public Criteria andP2pnavuserbuyidNotEqualTo(Integer value) {
            addCriterion("p2pNavUserBuyId <>", value, "p2pnavuserbuyid");
            return (Criteria) this;
        }

        public Criteria andP2pnavuserbuyidGreaterThan(Integer value) {
            addCriterion("p2pNavUserBuyId >", value, "p2pnavuserbuyid");
            return (Criteria) this;
        }

        public Criteria andP2pnavuserbuyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("p2pNavUserBuyId >=", value, "p2pnavuserbuyid");
            return (Criteria) this;
        }

        public Criteria andP2pnavuserbuyidLessThan(Integer value) {
            addCriterion("p2pNavUserBuyId <", value, "p2pnavuserbuyid");
            return (Criteria) this;
        }

        public Criteria andP2pnavuserbuyidLessThanOrEqualTo(Integer value) {
            addCriterion("p2pNavUserBuyId <=", value, "p2pnavuserbuyid");
            return (Criteria) this;
        }

        public Criteria andP2pnavuserbuyidIn(List<Integer> values) {
            addCriterion("p2pNavUserBuyId in", values, "p2pnavuserbuyid");
            return (Criteria) this;
        }

        public Criteria andP2pnavuserbuyidNotIn(List<Integer> values) {
            addCriterion("p2pNavUserBuyId not in", values, "p2pnavuserbuyid");
            return (Criteria) this;
        }

        public Criteria andP2pnavuserbuyidBetween(Integer value1, Integer value2) {
            addCriterion("p2pNavUserBuyId between", value1, value2, "p2pnavuserbuyid");
            return (Criteria) this;
        }

        public Criteria andP2pnavuserbuyidNotBetween(Integer value1, Integer value2) {
            addCriterion("p2pNavUserBuyId not between", value1, value2, "p2pnavuserbuyid");
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

        public Criteria andRedeemstatusIsNull() {
            addCriterion("redeemStatus is null");
            return (Criteria) this;
        }

        public Criteria andRedeemstatusIsNotNull() {
            addCriterion("redeemStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRedeemstatusEqualTo(Short value) {
            addCriterion("redeemStatus =", value, "redeemstatus");
            return (Criteria) this;
        }

        public Criteria andRedeemstatusNotEqualTo(Short value) {
            addCriterion("redeemStatus <>", value, "redeemstatus");
            return (Criteria) this;
        }

        public Criteria andRedeemstatusGreaterThan(Short value) {
            addCriterion("redeemStatus >", value, "redeemstatus");
            return (Criteria) this;
        }

        public Criteria andRedeemstatusGreaterThanOrEqualTo(Short value) {
            addCriterion("redeemStatus >=", value, "redeemstatus");
            return (Criteria) this;
        }

        public Criteria andRedeemstatusLessThan(Short value) {
            addCriterion("redeemStatus <", value, "redeemstatus");
            return (Criteria) this;
        }

        public Criteria andRedeemstatusLessThanOrEqualTo(Short value) {
            addCriterion("redeemStatus <=", value, "redeemstatus");
            return (Criteria) this;
        }

        public Criteria andRedeemstatusIn(List<Short> values) {
            addCriterion("redeemStatus in", values, "redeemstatus");
            return (Criteria) this;
        }

        public Criteria andRedeemstatusNotIn(List<Short> values) {
            addCriterion("redeemStatus not in", values, "redeemstatus");
            return (Criteria) this;
        }

        public Criteria andRedeemstatusBetween(Short value1, Short value2) {
            addCriterion("redeemStatus between", value1, value2, "redeemstatus");
            return (Criteria) this;
        }

        public Criteria andRedeemstatusNotBetween(Short value1, Short value2) {
            addCriterion("redeemStatus not between", value1, value2, "redeemstatus");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNull() {
            addCriterion("applyTime is null");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNotNull() {
            addCriterion("applyTime is not null");
            return (Criteria) this;
        }

        public Criteria andApplytimeEqualTo(String value) {
            addCriterion("applyTime =", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotEqualTo(String value) {
            addCriterion("applyTime <>", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThan(String value) {
            addCriterion("applyTime >", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThanOrEqualTo(String value) {
            addCriterion("applyTime >=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThan(String value) {
            addCriterion("applyTime <", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThanOrEqualTo(String value) {
            addCriterion("applyTime <=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLike(String value) {
            addCriterion("applyTime like", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotLike(String value) {
            addCriterion("applyTime not like", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeIn(List<String> values) {
            addCriterion("applyTime in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotIn(List<String> values) {
            addCriterion("applyTime not in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeBetween(String value1, String value2) {
            addCriterion("applyTime between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotBetween(String value1, String value2) {
            addCriterion("applyTime not between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andAffirmtimeIsNull() {
            addCriterion("affirmTime is null");
            return (Criteria) this;
        }

        public Criteria andAffirmtimeIsNotNull() {
            addCriterion("affirmTime is not null");
            return (Criteria) this;
        }

        public Criteria andAffirmtimeEqualTo(String value) {
            addCriterion("affirmTime =", value, "affirmtime");
            return (Criteria) this;
        }

        public Criteria andAffirmtimeNotEqualTo(String value) {
            addCriterion("affirmTime <>", value, "affirmtime");
            return (Criteria) this;
        }

        public Criteria andAffirmtimeGreaterThan(String value) {
            addCriterion("affirmTime >", value, "affirmtime");
            return (Criteria) this;
        }

        public Criteria andAffirmtimeGreaterThanOrEqualTo(String value) {
            addCriterion("affirmTime >=", value, "affirmtime");
            return (Criteria) this;
        }

        public Criteria andAffirmtimeLessThan(String value) {
            addCriterion("affirmTime <", value, "affirmtime");
            return (Criteria) this;
        }

        public Criteria andAffirmtimeLessThanOrEqualTo(String value) {
            addCriterion("affirmTime <=", value, "affirmtime");
            return (Criteria) this;
        }

        public Criteria andAffirmtimeLike(String value) {
            addCriterion("affirmTime like", value, "affirmtime");
            return (Criteria) this;
        }

        public Criteria andAffirmtimeNotLike(String value) {
            addCriterion("affirmTime not like", value, "affirmtime");
            return (Criteria) this;
        }

        public Criteria andAffirmtimeIn(List<String> values) {
            addCriterion("affirmTime in", values, "affirmtime");
            return (Criteria) this;
        }

        public Criteria andAffirmtimeNotIn(List<String> values) {
            addCriterion("affirmTime not in", values, "affirmtime");
            return (Criteria) this;
        }

        public Criteria andAffirmtimeBetween(String value1, String value2) {
            addCriterion("affirmTime between", value1, value2, "affirmtime");
            return (Criteria) this;
        }

        public Criteria andAffirmtimeNotBetween(String value1, String value2) {
            addCriterion("affirmTime not between", value1, value2, "affirmtime");
            return (Criteria) this;
        }

        public Criteria andApplicationvolIsNull() {
            addCriterion("applicationvol is null");
            return (Criteria) this;
        }

        public Criteria andApplicationvolIsNotNull() {
            addCriterion("applicationvol is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationvolEqualTo(String value) {
            addCriterion("applicationvol =", value, "applicationvol");
            return (Criteria) this;
        }

        public Criteria andApplicationvolNotEqualTo(String value) {
            addCriterion("applicationvol <>", value, "applicationvol");
            return (Criteria) this;
        }

        public Criteria andApplicationvolGreaterThan(String value) {
            addCriterion("applicationvol >", value, "applicationvol");
            return (Criteria) this;
        }

        public Criteria andApplicationvolGreaterThanOrEqualTo(String value) {
            addCriterion("applicationvol >=", value, "applicationvol");
            return (Criteria) this;
        }

        public Criteria andApplicationvolLessThan(String value) {
            addCriterion("applicationvol <", value, "applicationvol");
            return (Criteria) this;
        }

        public Criteria andApplicationvolLessThanOrEqualTo(String value) {
            addCriterion("applicationvol <=", value, "applicationvol");
            return (Criteria) this;
        }

        public Criteria andApplicationvolLike(String value) {
            addCriterion("applicationvol like", value, "applicationvol");
            return (Criteria) this;
        }

        public Criteria andApplicationvolNotLike(String value) {
            addCriterion("applicationvol not like", value, "applicationvol");
            return (Criteria) this;
        }

        public Criteria andApplicationvolIn(List<String> values) {
            addCriterion("applicationvol in", values, "applicationvol");
            return (Criteria) this;
        }

        public Criteria andApplicationvolNotIn(List<String> values) {
            addCriterion("applicationvol not in", values, "applicationvol");
            return (Criteria) this;
        }

        public Criteria andApplicationvolBetween(String value1, String value2) {
            addCriterion("applicationvol between", value1, value2, "applicationvol");
            return (Criteria) this;
        }

        public Criteria andApplicationvolNotBetween(String value1, String value2) {
            addCriterion("applicationvol not between", value1, value2, "applicationvol");
            return (Criteria) this;
        }

        public Criteria andConfirmedvolIsNull() {
            addCriterion("confirmedvol is null");
            return (Criteria) this;
        }

        public Criteria andConfirmedvolIsNotNull() {
            addCriterion("confirmedvol is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmedvolEqualTo(String value) {
            addCriterion("confirmedvol =", value, "confirmedvol");
            return (Criteria) this;
        }

        public Criteria andConfirmedvolNotEqualTo(String value) {
            addCriterion("confirmedvol <>", value, "confirmedvol");
            return (Criteria) this;
        }

        public Criteria andConfirmedvolGreaterThan(String value) {
            addCriterion("confirmedvol >", value, "confirmedvol");
            return (Criteria) this;
        }

        public Criteria andConfirmedvolGreaterThanOrEqualTo(String value) {
            addCriterion("confirmedvol >=", value, "confirmedvol");
            return (Criteria) this;
        }

        public Criteria andConfirmedvolLessThan(String value) {
            addCriterion("confirmedvol <", value, "confirmedvol");
            return (Criteria) this;
        }

        public Criteria andConfirmedvolLessThanOrEqualTo(String value) {
            addCriterion("confirmedvol <=", value, "confirmedvol");
            return (Criteria) this;
        }

        public Criteria andConfirmedvolLike(String value) {
            addCriterion("confirmedvol like", value, "confirmedvol");
            return (Criteria) this;
        }

        public Criteria andConfirmedvolNotLike(String value) {
            addCriterion("confirmedvol not like", value, "confirmedvol");
            return (Criteria) this;
        }

        public Criteria andConfirmedvolIn(List<String> values) {
            addCriterion("confirmedvol in", values, "confirmedvol");
            return (Criteria) this;
        }

        public Criteria andConfirmedvolNotIn(List<String> values) {
            addCriterion("confirmedvol not in", values, "confirmedvol");
            return (Criteria) this;
        }

        public Criteria andConfirmedvolBetween(String value1, String value2) {
            addCriterion("confirmedvol between", value1, value2, "confirmedvol");
            return (Criteria) this;
        }

        public Criteria andConfirmedvolNotBetween(String value1, String value2) {
            addCriterion("confirmedvol not between", value1, value2, "confirmedvol");
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