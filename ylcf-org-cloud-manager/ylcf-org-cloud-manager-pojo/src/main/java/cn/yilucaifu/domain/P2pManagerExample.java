package cn.yilucaifu.domain;

import java.util.ArrayList;
import java.util.List;

public class P2pManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public P2pManagerExample() {
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

        public Criteria andManNameIsNull() {
            addCriterion("man_name is null");
            return (Criteria) this;
        }

        public Criteria andManNameIsNotNull() {
            addCriterion("man_name is not null");
            return (Criteria) this;
        }

        public Criteria andManNameEqualTo(String value) {
            addCriterion("man_name =", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotEqualTo(String value) {
            addCriterion("man_name <>", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameGreaterThan(String value) {
            addCriterion("man_name >", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameGreaterThanOrEqualTo(String value) {
            addCriterion("man_name >=", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameLessThan(String value) {
            addCriterion("man_name <", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameLessThanOrEqualTo(String value) {
            addCriterion("man_name <=", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameLike(String value) {
            addCriterion("man_name like", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotLike(String value) {
            addCriterion("man_name not like", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameIn(List<String> values) {
            addCriterion("man_name in", values, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotIn(List<String> values) {
            addCriterion("man_name not in", values, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameBetween(String value1, String value2) {
            addCriterion("man_name between", value1, value2, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotBetween(String value1, String value2) {
            addCriterion("man_name not between", value1, value2, "manName");
            return (Criteria) this;
        }

        public Criteria andManShortNameIsNull() {
            addCriterion("man_short_name is null");
            return (Criteria) this;
        }

        public Criteria andManShortNameIsNotNull() {
            addCriterion("man_short_name is not null");
            return (Criteria) this;
        }

        public Criteria andManShortNameEqualTo(String value) {
            addCriterion("man_short_name =", value, "manShortName");
            return (Criteria) this;
        }

        public Criteria andManShortNameNotEqualTo(String value) {
            addCriterion("man_short_name <>", value, "manShortName");
            return (Criteria) this;
        }

        public Criteria andManShortNameGreaterThan(String value) {
            addCriterion("man_short_name >", value, "manShortName");
            return (Criteria) this;
        }

        public Criteria andManShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("man_short_name >=", value, "manShortName");
            return (Criteria) this;
        }

        public Criteria andManShortNameLessThan(String value) {
            addCriterion("man_short_name <", value, "manShortName");
            return (Criteria) this;
        }

        public Criteria andManShortNameLessThanOrEqualTo(String value) {
            addCriterion("man_short_name <=", value, "manShortName");
            return (Criteria) this;
        }

        public Criteria andManShortNameLike(String value) {
            addCriterion("man_short_name like", value, "manShortName");
            return (Criteria) this;
        }

        public Criteria andManShortNameNotLike(String value) {
            addCriterion("man_short_name not like", value, "manShortName");
            return (Criteria) this;
        }

        public Criteria andManShortNameIn(List<String> values) {
            addCriterion("man_short_name in", values, "manShortName");
            return (Criteria) this;
        }

        public Criteria andManShortNameNotIn(List<String> values) {
            addCriterion("man_short_name not in", values, "manShortName");
            return (Criteria) this;
        }

        public Criteria andManShortNameBetween(String value1, String value2) {
            addCriterion("man_short_name between", value1, value2, "manShortName");
            return (Criteria) this;
        }

        public Criteria andManShortNameNotBetween(String value1, String value2) {
            addCriterion("man_short_name not between", value1, value2, "manShortName");
            return (Criteria) this;
        }

        public Criteria andManTypeIsNull() {
            addCriterion("man_type is null");
            return (Criteria) this;
        }

        public Criteria andManTypeIsNotNull() {
            addCriterion("man_type is not null");
            return (Criteria) this;
        }

        public Criteria andManTypeEqualTo(String value) {
            addCriterion("man_type =", value, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeNotEqualTo(String value) {
            addCriterion("man_type <>", value, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeGreaterThan(String value) {
            addCriterion("man_type >", value, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeGreaterThanOrEqualTo(String value) {
            addCriterion("man_type >=", value, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeLessThan(String value) {
            addCriterion("man_type <", value, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeLessThanOrEqualTo(String value) {
            addCriterion("man_type <=", value, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeLike(String value) {
            addCriterion("man_type like", value, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeNotLike(String value) {
            addCriterion("man_type not like", value, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeIn(List<String> values) {
            addCriterion("man_type in", values, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeNotIn(List<String> values) {
            addCriterion("man_type not in", values, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeBetween(String value1, String value2) {
            addCriterion("man_type between", value1, value2, "manType");
            return (Criteria) this;
        }

        public Criteria andManTypeNotBetween(String value1, String value2) {
            addCriterion("man_type not between", value1, value2, "manType");
            return (Criteria) this;
        }

        public Criteria andManStatusIsNull() {
            addCriterion("man_status is null");
            return (Criteria) this;
        }

        public Criteria andManStatusIsNotNull() {
            addCriterion("man_status is not null");
            return (Criteria) this;
        }

        public Criteria andManStatusEqualTo(Integer value) {
            addCriterion("man_status =", value, "manStatus");
            return (Criteria) this;
        }

        public Criteria andManStatusNotEqualTo(Integer value) {
            addCriterion("man_status <>", value, "manStatus");
            return (Criteria) this;
        }

        public Criteria andManStatusGreaterThan(Integer value) {
            addCriterion("man_status >", value, "manStatus");
            return (Criteria) this;
        }

        public Criteria andManStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("man_status >=", value, "manStatus");
            return (Criteria) this;
        }

        public Criteria andManStatusLessThan(Integer value) {
            addCriterion("man_status <", value, "manStatus");
            return (Criteria) this;
        }

        public Criteria andManStatusLessThanOrEqualTo(Integer value) {
            addCriterion("man_status <=", value, "manStatus");
            return (Criteria) this;
        }

        public Criteria andManStatusIn(List<Integer> values) {
            addCriterion("man_status in", values, "manStatus");
            return (Criteria) this;
        }

        public Criteria andManStatusNotIn(List<Integer> values) {
            addCriterion("man_status not in", values, "manStatus");
            return (Criteria) this;
        }

        public Criteria andManStatusBetween(Integer value1, Integer value2) {
            addCriterion("man_status between", value1, value2, "manStatus");
            return (Criteria) this;
        }

        public Criteria andManStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("man_status not between", value1, value2, "manStatus");
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

        public Criteria andBankcardIsNull() {
            addCriterion("bankcard is null");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNotNull() {
            addCriterion("bankcard is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardEqualTo(String value) {
            addCriterion("bankcard =", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotEqualTo(String value) {
            addCriterion("bankcard <>", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThan(String value) {
            addCriterion("bankcard >", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThanOrEqualTo(String value) {
            addCriterion("bankcard >=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThan(String value) {
            addCriterion("bankcard <", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThanOrEqualTo(String value) {
            addCriterion("bankcard <=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLike(String value) {
            addCriterion("bankcard like", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotLike(String value) {
            addCriterion("bankcard not like", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardIn(List<String> values) {
            addCriterion("bankcard in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotIn(List<String> values) {
            addCriterion("bankcard not in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardBetween(String value1, String value2) {
            addCriterion("bankcard between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotBetween(String value1, String value2) {
            addCriterion("bankcard not between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andRaiseHouseIsNull() {
            addCriterion("raise_house is null");
            return (Criteria) this;
        }

        public Criteria andRaiseHouseIsNotNull() {
            addCriterion("raise_house is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseHouseEqualTo(String value) {
            addCriterion("raise_house =", value, "raiseHouse");
            return (Criteria) this;
        }

        public Criteria andRaiseHouseNotEqualTo(String value) {
            addCriterion("raise_house <>", value, "raiseHouse");
            return (Criteria) this;
        }

        public Criteria andRaiseHouseGreaterThan(String value) {
            addCriterion("raise_house >", value, "raiseHouse");
            return (Criteria) this;
        }

        public Criteria andRaiseHouseGreaterThanOrEqualTo(String value) {
            addCriterion("raise_house >=", value, "raiseHouse");
            return (Criteria) this;
        }

        public Criteria andRaiseHouseLessThan(String value) {
            addCriterion("raise_house <", value, "raiseHouse");
            return (Criteria) this;
        }

        public Criteria andRaiseHouseLessThanOrEqualTo(String value) {
            addCriterion("raise_house <=", value, "raiseHouse");
            return (Criteria) this;
        }

        public Criteria andRaiseHouseLike(String value) {
            addCriterion("raise_house like", value, "raiseHouse");
            return (Criteria) this;
        }

        public Criteria andRaiseHouseNotLike(String value) {
            addCriterion("raise_house not like", value, "raiseHouse");
            return (Criteria) this;
        }

        public Criteria andRaiseHouseIn(List<String> values) {
            addCriterion("raise_house in", values, "raiseHouse");
            return (Criteria) this;
        }

        public Criteria andRaiseHouseNotIn(List<String> values) {
            addCriterion("raise_house not in", values, "raiseHouse");
            return (Criteria) this;
        }

        public Criteria andRaiseHouseBetween(String value1, String value2) {
            addCriterion("raise_house between", value1, value2, "raiseHouse");
            return (Criteria) this;
        }

        public Criteria andRaiseHouseNotBetween(String value1, String value2) {
            addCriterion("raise_house not between", value1, value2, "raiseHouse");
            return (Criteria) this;
        }

        public Criteria andBankSubNameIsNull() {
            addCriterion("bank_sub_name is null");
            return (Criteria) this;
        }

        public Criteria andBankSubNameIsNotNull() {
            addCriterion("bank_sub_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankSubNameEqualTo(String value) {
            addCriterion("bank_sub_name =", value, "bankSubName");
            return (Criteria) this;
        }

        public Criteria andBankSubNameNotEqualTo(String value) {
            addCriterion("bank_sub_name <>", value, "bankSubName");
            return (Criteria) this;
        }

        public Criteria andBankSubNameGreaterThan(String value) {
            addCriterion("bank_sub_name >", value, "bankSubName");
            return (Criteria) this;
        }

        public Criteria andBankSubNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_sub_name >=", value, "bankSubName");
            return (Criteria) this;
        }

        public Criteria andBankSubNameLessThan(String value) {
            addCriterion("bank_sub_name <", value, "bankSubName");
            return (Criteria) this;
        }

        public Criteria andBankSubNameLessThanOrEqualTo(String value) {
            addCriterion("bank_sub_name <=", value, "bankSubName");
            return (Criteria) this;
        }

        public Criteria andBankSubNameLike(String value) {
            addCriterion("bank_sub_name like", value, "bankSubName");
            return (Criteria) this;
        }

        public Criteria andBankSubNameNotLike(String value) {
            addCriterion("bank_sub_name not like", value, "bankSubName");
            return (Criteria) this;
        }

        public Criteria andBankSubNameIn(List<String> values) {
            addCriterion("bank_sub_name in", values, "bankSubName");
            return (Criteria) this;
        }

        public Criteria andBankSubNameNotIn(List<String> values) {
            addCriterion("bank_sub_name not in", values, "bankSubName");
            return (Criteria) this;
        }

        public Criteria andBankSubNameBetween(String value1, String value2) {
            addCriterion("bank_sub_name between", value1, value2, "bankSubName");
            return (Criteria) this;
        }

        public Criteria andBankSubNameNotBetween(String value1, String value2) {
            addCriterion("bank_sub_name not between", value1, value2, "bankSubName");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("linkman not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andManJobIsNull() {
            addCriterion("man_job is null");
            return (Criteria) this;
        }

        public Criteria andManJobIsNotNull() {
            addCriterion("man_job is not null");
            return (Criteria) this;
        }

        public Criteria andManJobEqualTo(String value) {
            addCriterion("man_job =", value, "manJob");
            return (Criteria) this;
        }

        public Criteria andManJobNotEqualTo(String value) {
            addCriterion("man_job <>", value, "manJob");
            return (Criteria) this;
        }

        public Criteria andManJobGreaterThan(String value) {
            addCriterion("man_job >", value, "manJob");
            return (Criteria) this;
        }

        public Criteria andManJobGreaterThanOrEqualTo(String value) {
            addCriterion("man_job >=", value, "manJob");
            return (Criteria) this;
        }

        public Criteria andManJobLessThan(String value) {
            addCriterion("man_job <", value, "manJob");
            return (Criteria) this;
        }

        public Criteria andManJobLessThanOrEqualTo(String value) {
            addCriterion("man_job <=", value, "manJob");
            return (Criteria) this;
        }

        public Criteria andManJobLike(String value) {
            addCriterion("man_job like", value, "manJob");
            return (Criteria) this;
        }

        public Criteria andManJobNotLike(String value) {
            addCriterion("man_job not like", value, "manJob");
            return (Criteria) this;
        }

        public Criteria andManJobIn(List<String> values) {
            addCriterion("man_job in", values, "manJob");
            return (Criteria) this;
        }

        public Criteria andManJobNotIn(List<String> values) {
            addCriterion("man_job not in", values, "manJob");
            return (Criteria) this;
        }

        public Criteria andManJobBetween(String value1, String value2) {
            addCriterion("man_job between", value1, value2, "manJob");
            return (Criteria) this;
        }

        public Criteria andManJobNotBetween(String value1, String value2) {
            addCriterion("man_job not between", value1, value2, "manJob");
            return (Criteria) this;
        }

        public Criteria andManMobiletelnoIsNull() {
            addCriterion("man_mobiletelno is null");
            return (Criteria) this;
        }

        public Criteria andManMobiletelnoIsNotNull() {
            addCriterion("man_mobiletelno is not null");
            return (Criteria) this;
        }

        public Criteria andManMobiletelnoEqualTo(String value) {
            addCriterion("man_mobiletelno =", value, "manMobiletelno");
            return (Criteria) this;
        }

        public Criteria andManMobiletelnoNotEqualTo(String value) {
            addCriterion("man_mobiletelno <>", value, "manMobiletelno");
            return (Criteria) this;
        }

        public Criteria andManMobiletelnoGreaterThan(String value) {
            addCriterion("man_mobiletelno >", value, "manMobiletelno");
            return (Criteria) this;
        }

        public Criteria andManMobiletelnoGreaterThanOrEqualTo(String value) {
            addCriterion("man_mobiletelno >=", value, "manMobiletelno");
            return (Criteria) this;
        }

        public Criteria andManMobiletelnoLessThan(String value) {
            addCriterion("man_mobiletelno <", value, "manMobiletelno");
            return (Criteria) this;
        }

        public Criteria andManMobiletelnoLessThanOrEqualTo(String value) {
            addCriterion("man_mobiletelno <=", value, "manMobiletelno");
            return (Criteria) this;
        }

        public Criteria andManMobiletelnoLike(String value) {
            addCriterion("man_mobiletelno like", value, "manMobiletelno");
            return (Criteria) this;
        }

        public Criteria andManMobiletelnoNotLike(String value) {
            addCriterion("man_mobiletelno not like", value, "manMobiletelno");
            return (Criteria) this;
        }

        public Criteria andManMobiletelnoIn(List<String> values) {
            addCriterion("man_mobiletelno in", values, "manMobiletelno");
            return (Criteria) this;
        }

        public Criteria andManMobiletelnoNotIn(List<String> values) {
            addCriterion("man_mobiletelno not in", values, "manMobiletelno");
            return (Criteria) this;
        }

        public Criteria andManMobiletelnoBetween(String value1, String value2) {
            addCriterion("man_mobiletelno between", value1, value2, "manMobiletelno");
            return (Criteria) this;
        }

        public Criteria andManMobiletelnoNotBetween(String value1, String value2) {
            addCriterion("man_mobiletelno not between", value1, value2, "manMobiletelno");
            return (Criteria) this;
        }

        public Criteria andManPhoneIsNull() {
            addCriterion("man_phone is null");
            return (Criteria) this;
        }

        public Criteria andManPhoneIsNotNull() {
            addCriterion("man_phone is not null");
            return (Criteria) this;
        }

        public Criteria andManPhoneEqualTo(String value) {
            addCriterion("man_phone =", value, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneNotEqualTo(String value) {
            addCriterion("man_phone <>", value, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneGreaterThan(String value) {
            addCriterion("man_phone >", value, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("man_phone >=", value, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneLessThan(String value) {
            addCriterion("man_phone <", value, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneLessThanOrEqualTo(String value) {
            addCriterion("man_phone <=", value, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneLike(String value) {
            addCriterion("man_phone like", value, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneNotLike(String value) {
            addCriterion("man_phone not like", value, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneIn(List<String> values) {
            addCriterion("man_phone in", values, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneNotIn(List<String> values) {
            addCriterion("man_phone not in", values, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneBetween(String value1, String value2) {
            addCriterion("man_phone between", value1, value2, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneNotBetween(String value1, String value2) {
            addCriterion("man_phone not between", value1, value2, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManFaxIsNull() {
            addCriterion("man_fax is null");
            return (Criteria) this;
        }

        public Criteria andManFaxIsNotNull() {
            addCriterion("man_fax is not null");
            return (Criteria) this;
        }

        public Criteria andManFaxEqualTo(String value) {
            addCriterion("man_fax =", value, "manFax");
            return (Criteria) this;
        }

        public Criteria andManFaxNotEqualTo(String value) {
            addCriterion("man_fax <>", value, "manFax");
            return (Criteria) this;
        }

        public Criteria andManFaxGreaterThan(String value) {
            addCriterion("man_fax >", value, "manFax");
            return (Criteria) this;
        }

        public Criteria andManFaxGreaterThanOrEqualTo(String value) {
            addCriterion("man_fax >=", value, "manFax");
            return (Criteria) this;
        }

        public Criteria andManFaxLessThan(String value) {
            addCriterion("man_fax <", value, "manFax");
            return (Criteria) this;
        }

        public Criteria andManFaxLessThanOrEqualTo(String value) {
            addCriterion("man_fax <=", value, "manFax");
            return (Criteria) this;
        }

        public Criteria andManFaxLike(String value) {
            addCriterion("man_fax like", value, "manFax");
            return (Criteria) this;
        }

        public Criteria andManFaxNotLike(String value) {
            addCriterion("man_fax not like", value, "manFax");
            return (Criteria) this;
        }

        public Criteria andManFaxIn(List<String> values) {
            addCriterion("man_fax in", values, "manFax");
            return (Criteria) this;
        }

        public Criteria andManFaxNotIn(List<String> values) {
            addCriterion("man_fax not in", values, "manFax");
            return (Criteria) this;
        }

        public Criteria andManFaxBetween(String value1, String value2) {
            addCriterion("man_fax between", value1, value2, "manFax");
            return (Criteria) this;
        }

        public Criteria andManFaxNotBetween(String value1, String value2) {
            addCriterion("man_fax not between", value1, value2, "manFax");
            return (Criteria) this;
        }

        public Criteria andManQqIsNull() {
            addCriterion("man_QQ is null");
            return (Criteria) this;
        }

        public Criteria andManQqIsNotNull() {
            addCriterion("man_QQ is not null");
            return (Criteria) this;
        }

        public Criteria andManQqEqualTo(String value) {
            addCriterion("man_QQ =", value, "manQq");
            return (Criteria) this;
        }

        public Criteria andManQqNotEqualTo(String value) {
            addCriterion("man_QQ <>", value, "manQq");
            return (Criteria) this;
        }

        public Criteria andManQqGreaterThan(String value) {
            addCriterion("man_QQ >", value, "manQq");
            return (Criteria) this;
        }

        public Criteria andManQqGreaterThanOrEqualTo(String value) {
            addCriterion("man_QQ >=", value, "manQq");
            return (Criteria) this;
        }

        public Criteria andManQqLessThan(String value) {
            addCriterion("man_QQ <", value, "manQq");
            return (Criteria) this;
        }

        public Criteria andManQqLessThanOrEqualTo(String value) {
            addCriterion("man_QQ <=", value, "manQq");
            return (Criteria) this;
        }

        public Criteria andManQqLike(String value) {
            addCriterion("man_QQ like", value, "manQq");
            return (Criteria) this;
        }

        public Criteria andManQqNotLike(String value) {
            addCriterion("man_QQ not like", value, "manQq");
            return (Criteria) this;
        }

        public Criteria andManQqIn(List<String> values) {
            addCriterion("man_QQ in", values, "manQq");
            return (Criteria) this;
        }

        public Criteria andManQqNotIn(List<String> values) {
            addCriterion("man_QQ not in", values, "manQq");
            return (Criteria) this;
        }

        public Criteria andManQqBetween(String value1, String value2) {
            addCriterion("man_QQ between", value1, value2, "manQq");
            return (Criteria) this;
        }

        public Criteria andManQqNotBetween(String value1, String value2) {
            addCriterion("man_QQ not between", value1, value2, "manQq");
            return (Criteria) this;
        }

        public Criteria andManProvIsNull() {
            addCriterion("man_prov is null");
            return (Criteria) this;
        }

        public Criteria andManProvIsNotNull() {
            addCriterion("man_prov is not null");
            return (Criteria) this;
        }

        public Criteria andManProvEqualTo(String value) {
            addCriterion("man_prov =", value, "manProv");
            return (Criteria) this;
        }

        public Criteria andManProvNotEqualTo(String value) {
            addCriterion("man_prov <>", value, "manProv");
            return (Criteria) this;
        }

        public Criteria andManProvGreaterThan(String value) {
            addCriterion("man_prov >", value, "manProv");
            return (Criteria) this;
        }

        public Criteria andManProvGreaterThanOrEqualTo(String value) {
            addCriterion("man_prov >=", value, "manProv");
            return (Criteria) this;
        }

        public Criteria andManProvLessThan(String value) {
            addCriterion("man_prov <", value, "manProv");
            return (Criteria) this;
        }

        public Criteria andManProvLessThanOrEqualTo(String value) {
            addCriterion("man_prov <=", value, "manProv");
            return (Criteria) this;
        }

        public Criteria andManProvLike(String value) {
            addCriterion("man_prov like", value, "manProv");
            return (Criteria) this;
        }

        public Criteria andManProvNotLike(String value) {
            addCriterion("man_prov not like", value, "manProv");
            return (Criteria) this;
        }

        public Criteria andManProvIn(List<String> values) {
            addCriterion("man_prov in", values, "manProv");
            return (Criteria) this;
        }

        public Criteria andManProvNotIn(List<String> values) {
            addCriterion("man_prov not in", values, "manProv");
            return (Criteria) this;
        }

        public Criteria andManProvBetween(String value1, String value2) {
            addCriterion("man_prov between", value1, value2, "manProv");
            return (Criteria) this;
        }

        public Criteria andManProvNotBetween(String value1, String value2) {
            addCriterion("man_prov not between", value1, value2, "manProv");
            return (Criteria) this;
        }

        public Criteria andManAreaIsNull() {
            addCriterion("man_area is null");
            return (Criteria) this;
        }

        public Criteria andManAreaIsNotNull() {
            addCriterion("man_area is not null");
            return (Criteria) this;
        }

        public Criteria andManAreaEqualTo(String value) {
            addCriterion("man_area =", value, "manArea");
            return (Criteria) this;
        }

        public Criteria andManAreaNotEqualTo(String value) {
            addCriterion("man_area <>", value, "manArea");
            return (Criteria) this;
        }

        public Criteria andManAreaGreaterThan(String value) {
            addCriterion("man_area >", value, "manArea");
            return (Criteria) this;
        }

        public Criteria andManAreaGreaterThanOrEqualTo(String value) {
            addCriterion("man_area >=", value, "manArea");
            return (Criteria) this;
        }

        public Criteria andManAreaLessThan(String value) {
            addCriterion("man_area <", value, "manArea");
            return (Criteria) this;
        }

        public Criteria andManAreaLessThanOrEqualTo(String value) {
            addCriterion("man_area <=", value, "manArea");
            return (Criteria) this;
        }

        public Criteria andManAreaLike(String value) {
            addCriterion("man_area like", value, "manArea");
            return (Criteria) this;
        }

        public Criteria andManAreaNotLike(String value) {
            addCriterion("man_area not like", value, "manArea");
            return (Criteria) this;
        }

        public Criteria andManAreaIn(List<String> values) {
            addCriterion("man_area in", values, "manArea");
            return (Criteria) this;
        }

        public Criteria andManAreaNotIn(List<String> values) {
            addCriterion("man_area not in", values, "manArea");
            return (Criteria) this;
        }

        public Criteria andManAreaBetween(String value1, String value2) {
            addCriterion("man_area between", value1, value2, "manArea");
            return (Criteria) this;
        }

        public Criteria andManAreaNotBetween(String value1, String value2) {
            addCriterion("man_area not between", value1, value2, "manArea");
            return (Criteria) this;
        }

        public Criteria andManAdressIsNull() {
            addCriterion("man_adress is null");
            return (Criteria) this;
        }

        public Criteria andManAdressIsNotNull() {
            addCriterion("man_adress is not null");
            return (Criteria) this;
        }

        public Criteria andManAdressEqualTo(String value) {
            addCriterion("man_adress =", value, "manAdress");
            return (Criteria) this;
        }

        public Criteria andManAdressNotEqualTo(String value) {
            addCriterion("man_adress <>", value, "manAdress");
            return (Criteria) this;
        }

        public Criteria andManAdressGreaterThan(String value) {
            addCriterion("man_adress >", value, "manAdress");
            return (Criteria) this;
        }

        public Criteria andManAdressGreaterThanOrEqualTo(String value) {
            addCriterion("man_adress >=", value, "manAdress");
            return (Criteria) this;
        }

        public Criteria andManAdressLessThan(String value) {
            addCriterion("man_adress <", value, "manAdress");
            return (Criteria) this;
        }

        public Criteria andManAdressLessThanOrEqualTo(String value) {
            addCriterion("man_adress <=", value, "manAdress");
            return (Criteria) this;
        }

        public Criteria andManAdressLike(String value) {
            addCriterion("man_adress like", value, "manAdress");
            return (Criteria) this;
        }

        public Criteria andManAdressNotLike(String value) {
            addCriterion("man_adress not like", value, "manAdress");
            return (Criteria) this;
        }

        public Criteria andManAdressIn(List<String> values) {
            addCriterion("man_adress in", values, "manAdress");
            return (Criteria) this;
        }

        public Criteria andManAdressNotIn(List<String> values) {
            addCriterion("man_adress not in", values, "manAdress");
            return (Criteria) this;
        }

        public Criteria andManAdressBetween(String value1, String value2) {
            addCriterion("man_adress between", value1, value2, "manAdress");
            return (Criteria) this;
        }

        public Criteria andManAdressNotBetween(String value1, String value2) {
            addCriterion("man_adress not between", value1, value2, "manAdress");
            return (Criteria) this;
        }

        public Criteria andManLicenseUrlIsNull() {
            addCriterion("man_license_url is null");
            return (Criteria) this;
        }

        public Criteria andManLicenseUrlIsNotNull() {
            addCriterion("man_license_url is not null");
            return (Criteria) this;
        }

        public Criteria andManLicenseUrlEqualTo(String value) {
            addCriterion("man_license_url =", value, "manLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andManLicenseUrlNotEqualTo(String value) {
            addCriterion("man_license_url <>", value, "manLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andManLicenseUrlGreaterThan(String value) {
            addCriterion("man_license_url >", value, "manLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andManLicenseUrlGreaterThanOrEqualTo(String value) {
            addCriterion("man_license_url >=", value, "manLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andManLicenseUrlLessThan(String value) {
            addCriterion("man_license_url <", value, "manLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andManLicenseUrlLessThanOrEqualTo(String value) {
            addCriterion("man_license_url <=", value, "manLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andManLicenseUrlLike(String value) {
            addCriterion("man_license_url like", value, "manLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andManLicenseUrlNotLike(String value) {
            addCriterion("man_license_url not like", value, "manLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andManLicenseUrlIn(List<String> values) {
            addCriterion("man_license_url in", values, "manLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andManLicenseUrlNotIn(List<String> values) {
            addCriterion("man_license_url not in", values, "manLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andManLicenseUrlBetween(String value1, String value2) {
            addCriterion("man_license_url between", value1, value2, "manLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andManLicenseUrlNotBetween(String value1, String value2) {
            addCriterion("man_license_url not between", value1, value2, "manLicenseUrl");
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

        public Criteria andNetlinenoIsNull() {
            addCriterion("netlineno is null");
            return (Criteria) this;
        }

        public Criteria andNetlinenoIsNotNull() {
            addCriterion("netlineno is not null");
            return (Criteria) this;
        }

        public Criteria andNetlinenoEqualTo(String value) {
            addCriterion("netlineno =", value, "netlineno");
            return (Criteria) this;
        }

        public Criteria andNetlinenoNotEqualTo(String value) {
            addCriterion("netlineno <>", value, "netlineno");
            return (Criteria) this;
        }

        public Criteria andNetlinenoGreaterThan(String value) {
            addCriterion("netlineno >", value, "netlineno");
            return (Criteria) this;
        }

        public Criteria andNetlinenoGreaterThanOrEqualTo(String value) {
            addCriterion("netlineno >=", value, "netlineno");
            return (Criteria) this;
        }

        public Criteria andNetlinenoLessThan(String value) {
            addCriterion("netlineno <", value, "netlineno");
            return (Criteria) this;
        }

        public Criteria andNetlinenoLessThanOrEqualTo(String value) {
            addCriterion("netlineno <=", value, "netlineno");
            return (Criteria) this;
        }

        public Criteria andNetlinenoLike(String value) {
            addCriterion("netlineno like", value, "netlineno");
            return (Criteria) this;
        }

        public Criteria andNetlinenoNotLike(String value) {
            addCriterion("netlineno not like", value, "netlineno");
            return (Criteria) this;
        }

        public Criteria andNetlinenoIn(List<String> values) {
            addCriterion("netlineno in", values, "netlineno");
            return (Criteria) this;
        }

        public Criteria andNetlinenoNotIn(List<String> values) {
            addCriterion("netlineno not in", values, "netlineno");
            return (Criteria) this;
        }

        public Criteria andNetlinenoBetween(String value1, String value2) {
            addCriterion("netlineno between", value1, value2, "netlineno");
            return (Criteria) this;
        }

        public Criteria andNetlinenoNotBetween(String value1, String value2) {
            addCriterion("netlineno not between", value1, value2, "netlineno");
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