package cn.yilucaifu.domain;

import java.util.ArrayList;
import java.util.List;

public class UserWealthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserWealthExample() {
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

        public Criteria andP2pDepositIsNull() {
            addCriterion("p2p_deposit is null");
            return (Criteria) this;
        }

        public Criteria andP2pDepositIsNotNull() {
            addCriterion("p2p_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andP2pDepositEqualTo(String value) {
            addCriterion("p2p_deposit =", value, "p2pDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pDepositNotEqualTo(String value) {
            addCriterion("p2p_deposit <>", value, "p2pDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pDepositGreaterThan(String value) {
            addCriterion("p2p_deposit >", value, "p2pDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pDepositGreaterThanOrEqualTo(String value) {
            addCriterion("p2p_deposit >=", value, "p2pDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pDepositLessThan(String value) {
            addCriterion("p2p_deposit <", value, "p2pDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pDepositLessThanOrEqualTo(String value) {
            addCriterion("p2p_deposit <=", value, "p2pDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pDepositLike(String value) {
            addCriterion("p2p_deposit like", value, "p2pDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pDepositNotLike(String value) {
            addCriterion("p2p_deposit not like", value, "p2pDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pDepositIn(List<String> values) {
            addCriterion("p2p_deposit in", values, "p2pDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pDepositNotIn(List<String> values) {
            addCriterion("p2p_deposit not in", values, "p2pDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pDepositBetween(String value1, String value2) {
            addCriterion("p2p_deposit between", value1, value2, "p2pDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pDepositNotBetween(String value1, String value2) {
            addCriterion("p2p_deposit not between", value1, value2, "p2pDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pnavDepositIsNull() {
            addCriterion("p2pnav_deposit is null");
            return (Criteria) this;
        }

        public Criteria andP2pnavDepositIsNotNull() {
            addCriterion("p2pnav_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andP2pnavDepositEqualTo(String value) {
            addCriterion("p2pnav_deposit =", value, "p2pnavDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pnavDepositNotEqualTo(String value) {
            addCriterion("p2pnav_deposit <>", value, "p2pnavDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pnavDepositGreaterThan(String value) {
            addCriterion("p2pnav_deposit >", value, "p2pnavDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pnavDepositGreaterThanOrEqualTo(String value) {
            addCriterion("p2pnav_deposit >=", value, "p2pnavDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pnavDepositLessThan(String value) {
            addCriterion("p2pnav_deposit <", value, "p2pnavDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pnavDepositLessThanOrEqualTo(String value) {
            addCriterion("p2pnav_deposit <=", value, "p2pnavDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pnavDepositLike(String value) {
            addCriterion("p2pnav_deposit like", value, "p2pnavDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pnavDepositNotLike(String value) {
            addCriterion("p2pnav_deposit not like", value, "p2pnavDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pnavDepositIn(List<String> values) {
            addCriterion("p2pnav_deposit in", values, "p2pnavDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pnavDepositNotIn(List<String> values) {
            addCriterion("p2pnav_deposit not in", values, "p2pnavDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pnavDepositBetween(String value1, String value2) {
            addCriterion("p2pnav_deposit between", value1, value2, "p2pnavDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pnavDepositNotBetween(String value1, String value2) {
            addCriterion("p2pnav_deposit not between", value1, value2, "p2pnavDeposit");
            return (Criteria) this;
        }

        public Criteria andFundDepositIsNull() {
            addCriterion("fund_deposit is null");
            return (Criteria) this;
        }

        public Criteria andFundDepositIsNotNull() {
            addCriterion("fund_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andFundDepositEqualTo(String value) {
            addCriterion("fund_deposit =", value, "fundDeposit");
            return (Criteria) this;
        }

        public Criteria andFundDepositNotEqualTo(String value) {
            addCriterion("fund_deposit <>", value, "fundDeposit");
            return (Criteria) this;
        }

        public Criteria andFundDepositGreaterThan(String value) {
            addCriterion("fund_deposit >", value, "fundDeposit");
            return (Criteria) this;
        }

        public Criteria andFundDepositGreaterThanOrEqualTo(String value) {
            addCriterion("fund_deposit >=", value, "fundDeposit");
            return (Criteria) this;
        }

        public Criteria andFundDepositLessThan(String value) {
            addCriterion("fund_deposit <", value, "fundDeposit");
            return (Criteria) this;
        }

        public Criteria andFundDepositLessThanOrEqualTo(String value) {
            addCriterion("fund_deposit <=", value, "fundDeposit");
            return (Criteria) this;
        }

        public Criteria andFundDepositLike(String value) {
            addCriterion("fund_deposit like", value, "fundDeposit");
            return (Criteria) this;
        }

        public Criteria andFundDepositNotLike(String value) {
            addCriterion("fund_deposit not like", value, "fundDeposit");
            return (Criteria) this;
        }

        public Criteria andFundDepositIn(List<String> values) {
            addCriterion("fund_deposit in", values, "fundDeposit");
            return (Criteria) this;
        }

        public Criteria andFundDepositNotIn(List<String> values) {
            addCriterion("fund_deposit not in", values, "fundDeposit");
            return (Criteria) this;
        }

        public Criteria andFundDepositBetween(String value1, String value2) {
            addCriterion("fund_deposit between", value1, value2, "fundDeposit");
            return (Criteria) this;
        }

        public Criteria andFundDepositNotBetween(String value1, String value2) {
            addCriterion("fund_deposit not between", value1, value2, "fundDeposit");
            return (Criteria) this;
        }

        public Criteria andP2pEarningsIsNull() {
            addCriterion("p2p_earnings is null");
            return (Criteria) this;
        }

        public Criteria andP2pEarningsIsNotNull() {
            addCriterion("p2p_earnings is not null");
            return (Criteria) this;
        }

        public Criteria andP2pEarningsEqualTo(String value) {
            addCriterion("p2p_earnings =", value, "p2pEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pEarningsNotEqualTo(String value) {
            addCriterion("p2p_earnings <>", value, "p2pEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pEarningsGreaterThan(String value) {
            addCriterion("p2p_earnings >", value, "p2pEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pEarningsGreaterThanOrEqualTo(String value) {
            addCriterion("p2p_earnings >=", value, "p2pEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pEarningsLessThan(String value) {
            addCriterion("p2p_earnings <", value, "p2pEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pEarningsLessThanOrEqualTo(String value) {
            addCriterion("p2p_earnings <=", value, "p2pEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pEarningsLike(String value) {
            addCriterion("p2p_earnings like", value, "p2pEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pEarningsNotLike(String value) {
            addCriterion("p2p_earnings not like", value, "p2pEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pEarningsIn(List<String> values) {
            addCriterion("p2p_earnings in", values, "p2pEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pEarningsNotIn(List<String> values) {
            addCriterion("p2p_earnings not in", values, "p2pEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pEarningsBetween(String value1, String value2) {
            addCriterion("p2p_earnings between", value1, value2, "p2pEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pEarningsNotBetween(String value1, String value2) {
            addCriterion("p2p_earnings not between", value1, value2, "p2pEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavEarningsIsNull() {
            addCriterion("p2pnav_earnings is null");
            return (Criteria) this;
        }

        public Criteria andP2pnavEarningsIsNotNull() {
            addCriterion("p2pnav_earnings is not null");
            return (Criteria) this;
        }

        public Criteria andP2pnavEarningsEqualTo(String value) {
            addCriterion("p2pnav_earnings =", value, "p2pnavEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavEarningsNotEqualTo(String value) {
            addCriterion("p2pnav_earnings <>", value, "p2pnavEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavEarningsGreaterThan(String value) {
            addCriterion("p2pnav_earnings >", value, "p2pnavEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavEarningsGreaterThanOrEqualTo(String value) {
            addCriterion("p2pnav_earnings >=", value, "p2pnavEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavEarningsLessThan(String value) {
            addCriterion("p2pnav_earnings <", value, "p2pnavEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavEarningsLessThanOrEqualTo(String value) {
            addCriterion("p2pnav_earnings <=", value, "p2pnavEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavEarningsLike(String value) {
            addCriterion("p2pnav_earnings like", value, "p2pnavEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavEarningsNotLike(String value) {
            addCriterion("p2pnav_earnings not like", value, "p2pnavEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavEarningsIn(List<String> values) {
            addCriterion("p2pnav_earnings in", values, "p2pnavEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavEarningsNotIn(List<String> values) {
            addCriterion("p2pnav_earnings not in", values, "p2pnavEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavEarningsBetween(String value1, String value2) {
            addCriterion("p2pnav_earnings between", value1, value2, "p2pnavEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavEarningsNotBetween(String value1, String value2) {
            addCriterion("p2pnav_earnings not between", value1, value2, "p2pnavEarnings");
            return (Criteria) this;
        }

        public Criteria andFundEarningsIsNull() {
            addCriterion("fund_earnings is null");
            return (Criteria) this;
        }

        public Criteria andFundEarningsIsNotNull() {
            addCriterion("fund_earnings is not null");
            return (Criteria) this;
        }

        public Criteria andFundEarningsEqualTo(String value) {
            addCriterion("fund_earnings =", value, "fundEarnings");
            return (Criteria) this;
        }

        public Criteria andFundEarningsNotEqualTo(String value) {
            addCriterion("fund_earnings <>", value, "fundEarnings");
            return (Criteria) this;
        }

        public Criteria andFundEarningsGreaterThan(String value) {
            addCriterion("fund_earnings >", value, "fundEarnings");
            return (Criteria) this;
        }

        public Criteria andFundEarningsGreaterThanOrEqualTo(String value) {
            addCriterion("fund_earnings >=", value, "fundEarnings");
            return (Criteria) this;
        }

        public Criteria andFundEarningsLessThan(String value) {
            addCriterion("fund_earnings <", value, "fundEarnings");
            return (Criteria) this;
        }

        public Criteria andFundEarningsLessThanOrEqualTo(String value) {
            addCriterion("fund_earnings <=", value, "fundEarnings");
            return (Criteria) this;
        }

        public Criteria andFundEarningsLike(String value) {
            addCriterion("fund_earnings like", value, "fundEarnings");
            return (Criteria) this;
        }

        public Criteria andFundEarningsNotLike(String value) {
            addCriterion("fund_earnings not like", value, "fundEarnings");
            return (Criteria) this;
        }

        public Criteria andFundEarningsIn(List<String> values) {
            addCriterion("fund_earnings in", values, "fundEarnings");
            return (Criteria) this;
        }

        public Criteria andFundEarningsNotIn(List<String> values) {
            addCriterion("fund_earnings not in", values, "fundEarnings");
            return (Criteria) this;
        }

        public Criteria andFundEarningsBetween(String value1, String value2) {
            addCriterion("fund_earnings between", value1, value2, "fundEarnings");
            return (Criteria) this;
        }

        public Criteria andFundEarningsNotBetween(String value1, String value2) {
            addCriterion("fund_earnings not between", value1, value2, "fundEarnings");
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

        public Criteria andFiledateIsNull() {
            addCriterion("filedate is null");
            return (Criteria) this;
        }

        public Criteria andFiledateIsNotNull() {
            addCriterion("filedate is not null");
            return (Criteria) this;
        }

        public Criteria andFiledateEqualTo(String value) {
            addCriterion("filedate =", value, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateNotEqualTo(String value) {
            addCriterion("filedate <>", value, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateGreaterThan(String value) {
            addCriterion("filedate >", value, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateGreaterThanOrEqualTo(String value) {
            addCriterion("filedate >=", value, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateLessThan(String value) {
            addCriterion("filedate <", value, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateLessThanOrEqualTo(String value) {
            addCriterion("filedate <=", value, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateLike(String value) {
            addCriterion("filedate like", value, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateNotLike(String value) {
            addCriterion("filedate not like", value, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateIn(List<String> values) {
            addCriterion("filedate in", values, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateNotIn(List<String> values) {
            addCriterion("filedate not in", values, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateBetween(String value1, String value2) {
            addCriterion("filedate between", value1, value2, "filedate");
            return (Criteria) this;
        }

        public Criteria andFiledateNotBetween(String value1, String value2) {
            addCriterion("filedate not between", value1, value2, "filedate");
            return (Criteria) this;
        }

        public Criteria andP2pNewEarningsIsNull() {
            addCriterion("p2p_new_earnings is null");
            return (Criteria) this;
        }

        public Criteria andP2pNewEarningsIsNotNull() {
            addCriterion("p2p_new_earnings is not null");
            return (Criteria) this;
        }

        public Criteria andP2pNewEarningsEqualTo(String value) {
            addCriterion("p2p_new_earnings =", value, "p2pNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pNewEarningsNotEqualTo(String value) {
            addCriterion("p2p_new_earnings <>", value, "p2pNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pNewEarningsGreaterThan(String value) {
            addCriterion("p2p_new_earnings >", value, "p2pNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pNewEarningsGreaterThanOrEqualTo(String value) {
            addCriterion("p2p_new_earnings >=", value, "p2pNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pNewEarningsLessThan(String value) {
            addCriterion("p2p_new_earnings <", value, "p2pNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pNewEarningsLessThanOrEqualTo(String value) {
            addCriterion("p2p_new_earnings <=", value, "p2pNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pNewEarningsLike(String value) {
            addCriterion("p2p_new_earnings like", value, "p2pNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pNewEarningsNotLike(String value) {
            addCriterion("p2p_new_earnings not like", value, "p2pNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pNewEarningsIn(List<String> values) {
            addCriterion("p2p_new_earnings in", values, "p2pNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pNewEarningsNotIn(List<String> values) {
            addCriterion("p2p_new_earnings not in", values, "p2pNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pNewEarningsBetween(String value1, String value2) {
            addCriterion("p2p_new_earnings between", value1, value2, "p2pNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pNewEarningsNotBetween(String value1, String value2) {
            addCriterion("p2p_new_earnings not between", value1, value2, "p2pNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavNewEarningsIsNull() {
            addCriterion("p2pnav_new_earnings is null");
            return (Criteria) this;
        }

        public Criteria andP2pnavNewEarningsIsNotNull() {
            addCriterion("p2pnav_new_earnings is not null");
            return (Criteria) this;
        }

        public Criteria andP2pnavNewEarningsEqualTo(String value) {
            addCriterion("p2pnav_new_earnings =", value, "p2pnavNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavNewEarningsNotEqualTo(String value) {
            addCriterion("p2pnav_new_earnings <>", value, "p2pnavNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavNewEarningsGreaterThan(String value) {
            addCriterion("p2pnav_new_earnings >", value, "p2pnavNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavNewEarningsGreaterThanOrEqualTo(String value) {
            addCriterion("p2pnav_new_earnings >=", value, "p2pnavNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavNewEarningsLessThan(String value) {
            addCriterion("p2pnav_new_earnings <", value, "p2pnavNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavNewEarningsLessThanOrEqualTo(String value) {
            addCriterion("p2pnav_new_earnings <=", value, "p2pnavNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavNewEarningsLike(String value) {
            addCriterion("p2pnav_new_earnings like", value, "p2pnavNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavNewEarningsNotLike(String value) {
            addCriterion("p2pnav_new_earnings not like", value, "p2pnavNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavNewEarningsIn(List<String> values) {
            addCriterion("p2pnav_new_earnings in", values, "p2pnavNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavNewEarningsNotIn(List<String> values) {
            addCriterion("p2pnav_new_earnings not in", values, "p2pnavNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavNewEarningsBetween(String value1, String value2) {
            addCriterion("p2pnav_new_earnings between", value1, value2, "p2pnavNewEarnings");
            return (Criteria) this;
        }

        public Criteria andP2pnavNewEarningsNotBetween(String value1, String value2) {
            addCriterion("p2pnav_new_earnings not between", value1, value2, "p2pnavNewEarnings");
            return (Criteria) this;
        }

        public Criteria andFundNewEarningsIsNull() {
            addCriterion("fund_new_earnings is null");
            return (Criteria) this;
        }

        public Criteria andFundNewEarningsIsNotNull() {
            addCriterion("fund_new_earnings is not null");
            return (Criteria) this;
        }

        public Criteria andFundNewEarningsEqualTo(String value) {
            addCriterion("fund_new_earnings =", value, "fundNewEarnings");
            return (Criteria) this;
        }

        public Criteria andFundNewEarningsNotEqualTo(String value) {
            addCriterion("fund_new_earnings <>", value, "fundNewEarnings");
            return (Criteria) this;
        }

        public Criteria andFundNewEarningsGreaterThan(String value) {
            addCriterion("fund_new_earnings >", value, "fundNewEarnings");
            return (Criteria) this;
        }

        public Criteria andFundNewEarningsGreaterThanOrEqualTo(String value) {
            addCriterion("fund_new_earnings >=", value, "fundNewEarnings");
            return (Criteria) this;
        }

        public Criteria andFundNewEarningsLessThan(String value) {
            addCriterion("fund_new_earnings <", value, "fundNewEarnings");
            return (Criteria) this;
        }

        public Criteria andFundNewEarningsLessThanOrEqualTo(String value) {
            addCriterion("fund_new_earnings <=", value, "fundNewEarnings");
            return (Criteria) this;
        }

        public Criteria andFundNewEarningsLike(String value) {
            addCriterion("fund_new_earnings like", value, "fundNewEarnings");
            return (Criteria) this;
        }

        public Criteria andFundNewEarningsNotLike(String value) {
            addCriterion("fund_new_earnings not like", value, "fundNewEarnings");
            return (Criteria) this;
        }

        public Criteria andFundNewEarningsIn(List<String> values) {
            addCriterion("fund_new_earnings in", values, "fundNewEarnings");
            return (Criteria) this;
        }

        public Criteria andFundNewEarningsNotIn(List<String> values) {
            addCriterion("fund_new_earnings not in", values, "fundNewEarnings");
            return (Criteria) this;
        }

        public Criteria andFundNewEarningsBetween(String value1, String value2) {
            addCriterion("fund_new_earnings between", value1, value2, "fundNewEarnings");
            return (Criteria) this;
        }

        public Criteria andFundNewEarningsNotBetween(String value1, String value2) {
            addCriterion("fund_new_earnings not between", value1, value2, "fundNewEarnings");
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