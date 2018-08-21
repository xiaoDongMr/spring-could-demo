package cn.yilucaifu.domain;

import java.util.ArrayList;
import java.util.List;

public class P2pExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public P2pExample() {
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

        public Criteria andManIdIsNull() {
            addCriterion("man_id is null");
            return (Criteria) this;
        }

        public Criteria andManIdIsNotNull() {
            addCriterion("man_id is not null");
            return (Criteria) this;
        }

        public Criteria andManIdEqualTo(Integer value) {
            addCriterion("man_id =", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotEqualTo(Integer value) {
            addCriterion("man_id <>", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThan(Integer value) {
            addCriterion("man_id >", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("man_id >=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThan(Integer value) {
            addCriterion("man_id <", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThanOrEqualTo(Integer value) {
            addCriterion("man_id <=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdIn(List<Integer> values) {
            addCriterion("man_id in", values, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotIn(List<Integer> values) {
            addCriterion("man_id not in", values, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdBetween(Integer value1, Integer value2) {
            addCriterion("man_id between", value1, value2, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotBetween(Integer value1, Integer value2) {
            addCriterion("man_id not between", value1, value2, "manId");
            return (Criteria) this;
        }

        public Criteria andP2pnoIsNull() {
            addCriterion("p2pNo is null");
            return (Criteria) this;
        }

        public Criteria andP2pnoIsNotNull() {
            addCriterion("p2pNo is not null");
            return (Criteria) this;
        }

        public Criteria andP2pnoEqualTo(String value) {
            addCriterion("p2pNo =", value, "p2pno");
            return (Criteria) this;
        }

        public Criteria andP2pnoNotEqualTo(String value) {
            addCriterion("p2pNo <>", value, "p2pno");
            return (Criteria) this;
        }

        public Criteria andP2pnoGreaterThan(String value) {
            addCriterion("p2pNo >", value, "p2pno");
            return (Criteria) this;
        }

        public Criteria andP2pnoGreaterThanOrEqualTo(String value) {
            addCriterion("p2pNo >=", value, "p2pno");
            return (Criteria) this;
        }

        public Criteria andP2pnoLessThan(String value) {
            addCriterion("p2pNo <", value, "p2pno");
            return (Criteria) this;
        }

        public Criteria andP2pnoLessThanOrEqualTo(String value) {
            addCriterion("p2pNo <=", value, "p2pno");
            return (Criteria) this;
        }

        public Criteria andP2pnoLike(String value) {
            addCriterion("p2pNo like", value, "p2pno");
            return (Criteria) this;
        }

        public Criteria andP2pnoNotLike(String value) {
            addCriterion("p2pNo not like", value, "p2pno");
            return (Criteria) this;
        }

        public Criteria andP2pnoIn(List<String> values) {
            addCriterion("p2pNo in", values, "p2pno");
            return (Criteria) this;
        }

        public Criteria andP2pnoNotIn(List<String> values) {
            addCriterion("p2pNo not in", values, "p2pno");
            return (Criteria) this;
        }

        public Criteria andP2pnoBetween(String value1, String value2) {
            addCriterion("p2pNo between", value1, value2, "p2pno");
            return (Criteria) this;
        }

        public Criteria andP2pnoNotBetween(String value1, String value2) {
            addCriterion("p2pNo not between", value1, value2, "p2pno");
            return (Criteria) this;
        }

        public Criteria andP2pnameIsNull() {
            addCriterion("p2pName is null");
            return (Criteria) this;
        }

        public Criteria andP2pnameIsNotNull() {
            addCriterion("p2pName is not null");
            return (Criteria) this;
        }

        public Criteria andP2pnameEqualTo(String value) {
            addCriterion("p2pName =", value, "p2pname");
            return (Criteria) this;
        }

        public Criteria andP2pnameNotEqualTo(String value) {
            addCriterion("p2pName <>", value, "p2pname");
            return (Criteria) this;
        }

        public Criteria andP2pnameGreaterThan(String value) {
            addCriterion("p2pName >", value, "p2pname");
            return (Criteria) this;
        }

        public Criteria andP2pnameGreaterThanOrEqualTo(String value) {
            addCriterion("p2pName >=", value, "p2pname");
            return (Criteria) this;
        }

        public Criteria andP2pnameLessThan(String value) {
            addCriterion("p2pName <", value, "p2pname");
            return (Criteria) this;
        }

        public Criteria andP2pnameLessThanOrEqualTo(String value) {
            addCriterion("p2pName <=", value, "p2pname");
            return (Criteria) this;
        }

        public Criteria andP2pnameLike(String value) {
            addCriterion("p2pName like", value, "p2pname");
            return (Criteria) this;
        }

        public Criteria andP2pnameNotLike(String value) {
            addCriterion("p2pName not like", value, "p2pname");
            return (Criteria) this;
        }

        public Criteria andP2pnameIn(List<String> values) {
            addCriterion("p2pName in", values, "p2pname");
            return (Criteria) this;
        }

        public Criteria andP2pnameNotIn(List<String> values) {
            addCriterion("p2pName not in", values, "p2pname");
            return (Criteria) this;
        }

        public Criteria andP2pnameBetween(String value1, String value2) {
            addCriterion("p2pName between", value1, value2, "p2pname");
            return (Criteria) this;
        }

        public Criteria andP2pnameNotBetween(String value1, String value2) {
            addCriterion("p2pName not between", value1, value2, "p2pname");
            return (Criteria) this;
        }

        public Criteria andP2ptypeIsNull() {
            addCriterion("p2pType is null");
            return (Criteria) this;
        }

        public Criteria andP2ptypeIsNotNull() {
            addCriterion("p2pType is not null");
            return (Criteria) this;
        }

        public Criteria andP2ptypeEqualTo(String value) {
            addCriterion("p2pType =", value, "p2ptype");
            return (Criteria) this;
        }

        public Criteria andP2ptypeNotEqualTo(String value) {
            addCriterion("p2pType <>", value, "p2ptype");
            return (Criteria) this;
        }

        public Criteria andP2ptypeGreaterThan(String value) {
            addCriterion("p2pType >", value, "p2ptype");
            return (Criteria) this;
        }

        public Criteria andP2ptypeGreaterThanOrEqualTo(String value) {
            addCriterion("p2pType >=", value, "p2ptype");
            return (Criteria) this;
        }

        public Criteria andP2ptypeLessThan(String value) {
            addCriterion("p2pType <", value, "p2ptype");
            return (Criteria) this;
        }

        public Criteria andP2ptypeLessThanOrEqualTo(String value) {
            addCriterion("p2pType <=", value, "p2ptype");
            return (Criteria) this;
        }

        public Criteria andP2ptypeLike(String value) {
            addCriterion("p2pType like", value, "p2ptype");
            return (Criteria) this;
        }

        public Criteria andP2ptypeNotLike(String value) {
            addCriterion("p2pType not like", value, "p2ptype");
            return (Criteria) this;
        }

        public Criteria andP2ptypeIn(List<String> values) {
            addCriterion("p2pType in", values, "p2ptype");
            return (Criteria) this;
        }

        public Criteria andP2ptypeNotIn(List<String> values) {
            addCriterion("p2pType not in", values, "p2ptype");
            return (Criteria) this;
        }

        public Criteria andP2ptypeBetween(String value1, String value2) {
            addCriterion("p2pType between", value1, value2, "p2ptype");
            return (Criteria) this;
        }

        public Criteria andP2ptypeNotBetween(String value1, String value2) {
            addCriterion("p2pType not between", value1, value2, "p2ptype");
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

        public Criteria andIslineIsNull() {
            addCriterion("isLine is null");
            return (Criteria) this;
        }

        public Criteria andIslineIsNotNull() {
            addCriterion("isLine is not null");
            return (Criteria) this;
        }

        public Criteria andIslineEqualTo(Integer value) {
            addCriterion("isLine =", value, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineNotEqualTo(Integer value) {
            addCriterion("isLine <>", value, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineGreaterThan(Integer value) {
            addCriterion("isLine >", value, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineGreaterThanOrEqualTo(Integer value) {
            addCriterion("isLine >=", value, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineLessThan(Integer value) {
            addCriterion("isLine <", value, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineLessThanOrEqualTo(Integer value) {
            addCriterion("isLine <=", value, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineIn(List<Integer> values) {
            addCriterion("isLine in", values, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineNotIn(List<Integer> values) {
            addCriterion("isLine not in", values, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineBetween(Integer value1, Integer value2) {
            addCriterion("isLine between", value1, value2, "isline");
            return (Criteria) this;
        }

        public Criteria andIslineNotBetween(Integer value1, Integer value2) {
            addCriterion("isLine not between", value1, value2, "isline");
            return (Criteria) this;
        }

        public Criteria andProfitsTypeIsNull() {
            addCriterion("profits_type is null");
            return (Criteria) this;
        }

        public Criteria andProfitsTypeIsNotNull() {
            addCriterion("profits_type is not null");
            return (Criteria) this;
        }

        public Criteria andProfitsTypeEqualTo(Integer value) {
            addCriterion("profits_type =", value, "profitsType");
            return (Criteria) this;
        }

        public Criteria andProfitsTypeNotEqualTo(Integer value) {
            addCriterion("profits_type <>", value, "profitsType");
            return (Criteria) this;
        }

        public Criteria andProfitsTypeGreaterThan(Integer value) {
            addCriterion("profits_type >", value, "profitsType");
            return (Criteria) this;
        }

        public Criteria andProfitsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("profits_type >=", value, "profitsType");
            return (Criteria) this;
        }

        public Criteria andProfitsTypeLessThan(Integer value) {
            addCriterion("profits_type <", value, "profitsType");
            return (Criteria) this;
        }

        public Criteria andProfitsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("profits_type <=", value, "profitsType");
            return (Criteria) this;
        }

        public Criteria andProfitsTypeIn(List<Integer> values) {
            addCriterion("profits_type in", values, "profitsType");
            return (Criteria) this;
        }

        public Criteria andProfitsTypeNotIn(List<Integer> values) {
            addCriterion("profits_type not in", values, "profitsType");
            return (Criteria) this;
        }

        public Criteria andProfitsTypeBetween(Integer value1, Integer value2) {
            addCriterion("profits_type between", value1, value2, "profitsType");
            return (Criteria) this;
        }

        public Criteria andProfitsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("profits_type not between", value1, value2, "profitsType");
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

        public Criteria andPayMentIsNull() {
            addCriterion("pay_ment is null");
            return (Criteria) this;
        }

        public Criteria andPayMentIsNotNull() {
            addCriterion("pay_ment is not null");
            return (Criteria) this;
        }

        public Criteria andPayMentEqualTo(Integer value) {
            addCriterion("pay_ment =", value, "payMent");
            return (Criteria) this;
        }

        public Criteria andPayMentNotEqualTo(Integer value) {
            addCriterion("pay_ment <>", value, "payMent");
            return (Criteria) this;
        }

        public Criteria andPayMentGreaterThan(Integer value) {
            addCriterion("pay_ment >", value, "payMent");
            return (Criteria) this;
        }

        public Criteria andPayMentGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_ment >=", value, "payMent");
            return (Criteria) this;
        }

        public Criteria andPayMentLessThan(Integer value) {
            addCriterion("pay_ment <", value, "payMent");
            return (Criteria) this;
        }

        public Criteria andPayMentLessThanOrEqualTo(Integer value) {
            addCriterion("pay_ment <=", value, "payMent");
            return (Criteria) this;
        }

        public Criteria andPayMentIn(List<Integer> values) {
            addCriterion("pay_ment in", values, "payMent");
            return (Criteria) this;
        }

        public Criteria andPayMentNotIn(List<Integer> values) {
            addCriterion("pay_ment not in", values, "payMent");
            return (Criteria) this;
        }

        public Criteria andPayMentBetween(Integer value1, Integer value2) {
            addCriterion("pay_ment between", value1, value2, "payMent");
            return (Criteria) this;
        }

        public Criteria andPayMentNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_ment not between", value1, value2, "payMent");
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

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(String value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(String value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(String value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(String value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(String value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLike(String value) {
            addCriterion("deadline like", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotLike(String value) {
            addCriterion("deadline not like", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<String> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<String> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(String value1, String value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(String value1, String value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineUnitIsNull() {
            addCriterion("deadline_unit is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineUnitIsNotNull() {
            addCriterion("deadline_unit is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineUnitEqualTo(Integer value) {
            addCriterion("deadline_unit =", value, "deadlineUnit");
            return (Criteria) this;
        }

        public Criteria andDeadlineUnitNotEqualTo(Integer value) {
            addCriterion("deadline_unit <>", value, "deadlineUnit");
            return (Criteria) this;
        }

        public Criteria andDeadlineUnitGreaterThan(Integer value) {
            addCriterion("deadline_unit >", value, "deadlineUnit");
            return (Criteria) this;
        }

        public Criteria andDeadlineUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("deadline_unit >=", value, "deadlineUnit");
            return (Criteria) this;
        }

        public Criteria andDeadlineUnitLessThan(Integer value) {
            addCriterion("deadline_unit <", value, "deadlineUnit");
            return (Criteria) this;
        }

        public Criteria andDeadlineUnitLessThanOrEqualTo(Integer value) {
            addCriterion("deadline_unit <=", value, "deadlineUnit");
            return (Criteria) this;
        }

        public Criteria andDeadlineUnitIn(List<Integer> values) {
            addCriterion("deadline_unit in", values, "deadlineUnit");
            return (Criteria) this;
        }

        public Criteria andDeadlineUnitNotIn(List<Integer> values) {
            addCriterion("deadline_unit not in", values, "deadlineUnit");
            return (Criteria) this;
        }

        public Criteria andDeadlineUnitBetween(Integer value1, Integer value2) {
            addCriterion("deadline_unit between", value1, value2, "deadlineUnit");
            return (Criteria) this;
        }

        public Criteria andDeadlineUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("deadline_unit not between", value1, value2, "deadlineUnit");
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

        public Criteria andBuyCopiesIsNull() {
            addCriterion("buy_copies is null");
            return (Criteria) this;
        }

        public Criteria andBuyCopiesIsNotNull() {
            addCriterion("buy_copies is not null");
            return (Criteria) this;
        }

        public Criteria andBuyCopiesEqualTo(String value) {
            addCriterion("buy_copies =", value, "buyCopies");
            return (Criteria) this;
        }

        public Criteria andBuyCopiesNotEqualTo(String value) {
            addCriterion("buy_copies <>", value, "buyCopies");
            return (Criteria) this;
        }

        public Criteria andBuyCopiesGreaterThan(String value) {
            addCriterion("buy_copies >", value, "buyCopies");
            return (Criteria) this;
        }

        public Criteria andBuyCopiesGreaterThanOrEqualTo(String value) {
            addCriterion("buy_copies >=", value, "buyCopies");
            return (Criteria) this;
        }

        public Criteria andBuyCopiesLessThan(String value) {
            addCriterion("buy_copies <", value, "buyCopies");
            return (Criteria) this;
        }

        public Criteria andBuyCopiesLessThanOrEqualTo(String value) {
            addCriterion("buy_copies <=", value, "buyCopies");
            return (Criteria) this;
        }

        public Criteria andBuyCopiesLike(String value) {
            addCriterion("buy_copies like", value, "buyCopies");
            return (Criteria) this;
        }

        public Criteria andBuyCopiesNotLike(String value) {
            addCriterion("buy_copies not like", value, "buyCopies");
            return (Criteria) this;
        }

        public Criteria andBuyCopiesIn(List<String> values) {
            addCriterion("buy_copies in", values, "buyCopies");
            return (Criteria) this;
        }

        public Criteria andBuyCopiesNotIn(List<String> values) {
            addCriterion("buy_copies not in", values, "buyCopies");
            return (Criteria) this;
        }

        public Criteria andBuyCopiesBetween(String value1, String value2) {
            addCriterion("buy_copies between", value1, value2, "buyCopies");
            return (Criteria) this;
        }

        public Criteria andBuyCopiesNotBetween(String value1, String value2) {
            addCriterion("buy_copies not between", value1, value2, "buyCopies");
            return (Criteria) this;
        }

        public Criteria andRaiseMoneyIsNull() {
            addCriterion("raise_money is null");
            return (Criteria) this;
        }

        public Criteria andRaiseMoneyIsNotNull() {
            addCriterion("raise_money is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseMoneyEqualTo(String value) {
            addCriterion("raise_money =", value, "raiseMoney");
            return (Criteria) this;
        }

        public Criteria andRaiseMoneyNotEqualTo(String value) {
            addCriterion("raise_money <>", value, "raiseMoney");
            return (Criteria) this;
        }

        public Criteria andRaiseMoneyGreaterThan(String value) {
            addCriterion("raise_money >", value, "raiseMoney");
            return (Criteria) this;
        }

        public Criteria andRaiseMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("raise_money >=", value, "raiseMoney");
            return (Criteria) this;
        }

        public Criteria andRaiseMoneyLessThan(String value) {
            addCriterion("raise_money <", value, "raiseMoney");
            return (Criteria) this;
        }

        public Criteria andRaiseMoneyLessThanOrEqualTo(String value) {
            addCriterion("raise_money <=", value, "raiseMoney");
            return (Criteria) this;
        }

        public Criteria andRaiseMoneyLike(String value) {
            addCriterion("raise_money like", value, "raiseMoney");
            return (Criteria) this;
        }

        public Criteria andRaiseMoneyNotLike(String value) {
            addCriterion("raise_money not like", value, "raiseMoney");
            return (Criteria) this;
        }

        public Criteria andRaiseMoneyIn(List<String> values) {
            addCriterion("raise_money in", values, "raiseMoney");
            return (Criteria) this;
        }

        public Criteria andRaiseMoneyNotIn(List<String> values) {
            addCriterion("raise_money not in", values, "raiseMoney");
            return (Criteria) this;
        }

        public Criteria andRaiseMoneyBetween(String value1, String value2) {
            addCriterion("raise_money between", value1, value2, "raiseMoney");
            return (Criteria) this;
        }

        public Criteria andRaiseMoneyNotBetween(String value1, String value2) {
            addCriterion("raise_money not between", value1, value2, "raiseMoney");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeIsNull() {
            addCriterion("sell_time is null");
            return (Criteria) this;
        }

        public Criteria andSellTimeIsNotNull() {
            addCriterion("sell_time is not null");
            return (Criteria) this;
        }

        public Criteria andSellTimeEqualTo(String value) {
            addCriterion("sell_time =", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeNotEqualTo(String value) {
            addCriterion("sell_time <>", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeGreaterThan(String value) {
            addCriterion("sell_time >", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeGreaterThanOrEqualTo(String value) {
            addCriterion("sell_time >=", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeLessThan(String value) {
            addCriterion("sell_time <", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeLessThanOrEqualTo(String value) {
            addCriterion("sell_time <=", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeLike(String value) {
            addCriterion("sell_time like", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeNotLike(String value) {
            addCriterion("sell_time not like", value, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeIn(List<String> values) {
            addCriterion("sell_time in", values, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeNotIn(List<String> values) {
            addCriterion("sell_time not in", values, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeBetween(String value1, String value2) {
            addCriterion("sell_time between", value1, value2, "sellTime");
            return (Criteria) this;
        }

        public Criteria andSellTimeNotBetween(String value1, String value2) {
            addCriterion("sell_time not between", value1, value2, "sellTime");
            return (Criteria) this;
        }

        public Criteria andInterestTimeIsNull() {
            addCriterion("interest_time is null");
            return (Criteria) this;
        }

        public Criteria andInterestTimeIsNotNull() {
            addCriterion("interest_time is not null");
            return (Criteria) this;
        }

        public Criteria andInterestTimeEqualTo(String value) {
            addCriterion("interest_time =", value, "interestTime");
            return (Criteria) this;
        }

        public Criteria andInterestTimeNotEqualTo(String value) {
            addCriterion("interest_time <>", value, "interestTime");
            return (Criteria) this;
        }

        public Criteria andInterestTimeGreaterThan(String value) {
            addCriterion("interest_time >", value, "interestTime");
            return (Criteria) this;
        }

        public Criteria andInterestTimeGreaterThanOrEqualTo(String value) {
            addCriterion("interest_time >=", value, "interestTime");
            return (Criteria) this;
        }

        public Criteria andInterestTimeLessThan(String value) {
            addCriterion("interest_time <", value, "interestTime");
            return (Criteria) this;
        }

        public Criteria andInterestTimeLessThanOrEqualTo(String value) {
            addCriterion("interest_time <=", value, "interestTime");
            return (Criteria) this;
        }

        public Criteria andInterestTimeLike(String value) {
            addCriterion("interest_time like", value, "interestTime");
            return (Criteria) this;
        }

        public Criteria andInterestTimeNotLike(String value) {
            addCriterion("interest_time not like", value, "interestTime");
            return (Criteria) this;
        }

        public Criteria andInterestTimeIn(List<String> values) {
            addCriterion("interest_time in", values, "interestTime");
            return (Criteria) this;
        }

        public Criteria andInterestTimeNotIn(List<String> values) {
            addCriterion("interest_time not in", values, "interestTime");
            return (Criteria) this;
        }

        public Criteria andInterestTimeBetween(String value1, String value2) {
            addCriterion("interest_time between", value1, value2, "interestTime");
            return (Criteria) this;
        }

        public Criteria andInterestTimeNotBetween(String value1, String value2) {
            addCriterion("interest_time not between", value1, value2, "interestTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNull() {
            addCriterion("stop_time is null");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNotNull() {
            addCriterion("stop_time is not null");
            return (Criteria) this;
        }

        public Criteria andStopTimeEqualTo(String value) {
            addCriterion("stop_time =", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotEqualTo(String value) {
            addCriterion("stop_time <>", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThan(String value) {
            addCriterion("stop_time >", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThanOrEqualTo(String value) {
            addCriterion("stop_time >=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThan(String value) {
            addCriterion("stop_time <", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThanOrEqualTo(String value) {
            addCriterion("stop_time <=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLike(String value) {
            addCriterion("stop_time like", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotLike(String value) {
            addCriterion("stop_time not like", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeIn(List<String> values) {
            addCriterion("stop_time in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotIn(List<String> values) {
            addCriterion("stop_time not in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeBetween(String value1, String value2) {
            addCriterion("stop_time between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotBetween(String value1, String value2) {
            addCriterion("stop_time not between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andRaiseTypeIsNull() {
            addCriterion("raise_type is null");
            return (Criteria) this;
        }

        public Criteria andRaiseTypeIsNotNull() {
            addCriterion("raise_type is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseTypeEqualTo(Integer value) {
            addCriterion("raise_type =", value, "raiseType");
            return (Criteria) this;
        }

        public Criteria andRaiseTypeNotEqualTo(Integer value) {
            addCriterion("raise_type <>", value, "raiseType");
            return (Criteria) this;
        }

        public Criteria andRaiseTypeGreaterThan(Integer value) {
            addCriterion("raise_type >", value, "raiseType");
            return (Criteria) this;
        }

        public Criteria andRaiseTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("raise_type >=", value, "raiseType");
            return (Criteria) this;
        }

        public Criteria andRaiseTypeLessThan(Integer value) {
            addCriterion("raise_type <", value, "raiseType");
            return (Criteria) this;
        }

        public Criteria andRaiseTypeLessThanOrEqualTo(Integer value) {
            addCriterion("raise_type <=", value, "raiseType");
            return (Criteria) this;
        }

        public Criteria andRaiseTypeIn(List<Integer> values) {
            addCriterion("raise_type in", values, "raiseType");
            return (Criteria) this;
        }

        public Criteria andRaiseTypeNotIn(List<Integer> values) {
            addCriterion("raise_type not in", values, "raiseType");
            return (Criteria) this;
        }

        public Criteria andRaiseTypeBetween(Integer value1, Integer value2) {
            addCriterion("raise_type between", value1, value2, "raiseType");
            return (Criteria) this;
        }

        public Criteria andRaiseTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("raise_type not between", value1, value2, "raiseType");
            return (Criteria) this;
        }

        public Criteria andTInterestIsNull() {
            addCriterion("t_interest is null");
            return (Criteria) this;
        }

        public Criteria andTInterestIsNotNull() {
            addCriterion("t_interest is not null");
            return (Criteria) this;
        }

        public Criteria andTInterestEqualTo(Integer value) {
            addCriterion("t_interest =", value, "tInterest");
            return (Criteria) this;
        }

        public Criteria andTInterestNotEqualTo(Integer value) {
            addCriterion("t_interest <>", value, "tInterest");
            return (Criteria) this;
        }

        public Criteria andTInterestGreaterThan(Integer value) {
            addCriterion("t_interest >", value, "tInterest");
            return (Criteria) this;
        }

        public Criteria andTInterestGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_interest >=", value, "tInterest");
            return (Criteria) this;
        }

        public Criteria andTInterestLessThan(Integer value) {
            addCriterion("t_interest <", value, "tInterest");
            return (Criteria) this;
        }

        public Criteria andTInterestLessThanOrEqualTo(Integer value) {
            addCriterion("t_interest <=", value, "tInterest");
            return (Criteria) this;
        }

        public Criteria andTInterestIn(List<Integer> values) {
            addCriterion("t_interest in", values, "tInterest");
            return (Criteria) this;
        }

        public Criteria andTInterestNotIn(List<Integer> values) {
            addCriterion("t_interest not in", values, "tInterest");
            return (Criteria) this;
        }

        public Criteria andTInterestBetween(Integer value1, Integer value2) {
            addCriterion("t_interest between", value1, value2, "tInterest");
            return (Criteria) this;
        }

        public Criteria andTInterestNotBetween(Integer value1, Integer value2) {
            addCriterion("t_interest not between", value1, value2, "tInterest");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNull() {
            addCriterion("recommend is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNotNull() {
            addCriterion("recommend is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendEqualTo(String value) {
            addCriterion("recommend =", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotEqualTo(String value) {
            addCriterion("recommend <>", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThan(String value) {
            addCriterion("recommend >", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("recommend >=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThan(String value) {
            addCriterion("recommend <", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThanOrEqualTo(String value) {
            addCriterion("recommend <=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLike(String value) {
            addCriterion("recommend like", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotLike(String value) {
            addCriterion("recommend not like", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendIn(List<String> values) {
            addCriterion("recommend in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotIn(List<String> values) {
            addCriterion("recommend not in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendBetween(String value1, String value2) {
            addCriterion("recommend between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotBetween(String value1, String value2) {
            addCriterion("recommend not between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andIssuerIsNull() {
            addCriterion("issuer is null");
            return (Criteria) this;
        }

        public Criteria andIssuerIsNotNull() {
            addCriterion("issuer is not null");
            return (Criteria) this;
        }

        public Criteria andIssuerEqualTo(String value) {
            addCriterion("issuer =", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerNotEqualTo(String value) {
            addCriterion("issuer <>", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerGreaterThan(String value) {
            addCriterion("issuer >", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerGreaterThanOrEqualTo(String value) {
            addCriterion("issuer >=", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerLessThan(String value) {
            addCriterion("issuer <", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerLessThanOrEqualTo(String value) {
            addCriterion("issuer <=", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerLike(String value) {
            addCriterion("issuer like", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerNotLike(String value) {
            addCriterion("issuer not like", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerIn(List<String> values) {
            addCriterion("issuer in", values, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerNotIn(List<String> values) {
            addCriterion("issuer not in", values, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerBetween(String value1, String value2) {
            addCriterion("issuer between", value1, value2, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerNotBetween(String value1, String value2) {
            addCriterion("issuer not between", value1, value2, "issuer");
            return (Criteria) this;
        }

        public Criteria andP2pExplainbookUrlIsNull() {
            addCriterion("p2p_explainBook_url is null");
            return (Criteria) this;
        }

        public Criteria andP2pExplainbookUrlIsNotNull() {
            addCriterion("p2p_explainBook_url is not null");
            return (Criteria) this;
        }

        public Criteria andP2pExplainbookUrlEqualTo(String value) {
            addCriterion("p2p_explainBook_url =", value, "p2pExplainbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pExplainbookUrlNotEqualTo(String value) {
            addCriterion("p2p_explainBook_url <>", value, "p2pExplainbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pExplainbookUrlGreaterThan(String value) {
            addCriterion("p2p_explainBook_url >", value, "p2pExplainbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pExplainbookUrlGreaterThanOrEqualTo(String value) {
            addCriterion("p2p_explainBook_url >=", value, "p2pExplainbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pExplainbookUrlLessThan(String value) {
            addCriterion("p2p_explainBook_url <", value, "p2pExplainbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pExplainbookUrlLessThanOrEqualTo(String value) {
            addCriterion("p2p_explainBook_url <=", value, "p2pExplainbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pExplainbookUrlLike(String value) {
            addCriterion("p2p_explainBook_url like", value, "p2pExplainbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pExplainbookUrlNotLike(String value) {
            addCriterion("p2p_explainBook_url not like", value, "p2pExplainbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pExplainbookUrlIn(List<String> values) {
            addCriterion("p2p_explainBook_url in", values, "p2pExplainbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pExplainbookUrlNotIn(List<String> values) {
            addCriterion("p2p_explainBook_url not in", values, "p2pExplainbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pExplainbookUrlBetween(String value1, String value2) {
            addCriterion("p2p_explainBook_url between", value1, value2, "p2pExplainbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pExplainbookUrlNotBetween(String value1, String value2) {
            addCriterion("p2p_explainBook_url not between", value1, value2, "p2pExplainbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pRiskbookUrlIsNull() {
            addCriterion("p2p_riskBook_url is null");
            return (Criteria) this;
        }

        public Criteria andP2pRiskbookUrlIsNotNull() {
            addCriterion("p2p_riskBook_url is not null");
            return (Criteria) this;
        }

        public Criteria andP2pRiskbookUrlEqualTo(String value) {
            addCriterion("p2p_riskBook_url =", value, "p2pRiskbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pRiskbookUrlNotEqualTo(String value) {
            addCriterion("p2p_riskBook_url <>", value, "p2pRiskbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pRiskbookUrlGreaterThan(String value) {
            addCriterion("p2p_riskBook_url >", value, "p2pRiskbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pRiskbookUrlGreaterThanOrEqualTo(String value) {
            addCriterion("p2p_riskBook_url >=", value, "p2pRiskbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pRiskbookUrlLessThan(String value) {
            addCriterion("p2p_riskBook_url <", value, "p2pRiskbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pRiskbookUrlLessThanOrEqualTo(String value) {
            addCriterion("p2p_riskBook_url <=", value, "p2pRiskbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pRiskbookUrlLike(String value) {
            addCriterion("p2p_riskBook_url like", value, "p2pRiskbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pRiskbookUrlNotLike(String value) {
            addCriterion("p2p_riskBook_url not like", value, "p2pRiskbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pRiskbookUrlIn(List<String> values) {
            addCriterion("p2p_riskBook_url in", values, "p2pRiskbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pRiskbookUrlNotIn(List<String> values) {
            addCriterion("p2p_riskBook_url not in", values, "p2pRiskbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pRiskbookUrlBetween(String value1, String value2) {
            addCriterion("p2p_riskBook_url between", value1, value2, "p2pRiskbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pRiskbookUrlNotBetween(String value1, String value2) {
            addCriterion("p2p_riskBook_url not between", value1, value2, "p2pRiskbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pSellbookUrlIsNull() {
            addCriterion("p2p_sellBook_url is null");
            return (Criteria) this;
        }

        public Criteria andP2pSellbookUrlIsNotNull() {
            addCriterion("p2p_sellBook_url is not null");
            return (Criteria) this;
        }

        public Criteria andP2pSellbookUrlEqualTo(String value) {
            addCriterion("p2p_sellBook_url =", value, "p2pSellbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pSellbookUrlNotEqualTo(String value) {
            addCriterion("p2p_sellBook_url <>", value, "p2pSellbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pSellbookUrlGreaterThan(String value) {
            addCriterion("p2p_sellBook_url >", value, "p2pSellbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pSellbookUrlGreaterThanOrEqualTo(String value) {
            addCriterion("p2p_sellBook_url >=", value, "p2pSellbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pSellbookUrlLessThan(String value) {
            addCriterion("p2p_sellBook_url <", value, "p2pSellbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pSellbookUrlLessThanOrEqualTo(String value) {
            addCriterion("p2p_sellBook_url <=", value, "p2pSellbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pSellbookUrlLike(String value) {
            addCriterion("p2p_sellBook_url like", value, "p2pSellbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pSellbookUrlNotLike(String value) {
            addCriterion("p2p_sellBook_url not like", value, "p2pSellbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pSellbookUrlIn(List<String> values) {
            addCriterion("p2p_sellBook_url in", values, "p2pSellbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pSellbookUrlNotIn(List<String> values) {
            addCriterion("p2p_sellBook_url not in", values, "p2pSellbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pSellbookUrlBetween(String value1, String value2) {
            addCriterion("p2p_sellBook_url between", value1, value2, "p2pSellbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pSellbookUrlNotBetween(String value1, String value2) {
            addCriterion("p2p_sellBook_url not between", value1, value2, "p2pSellbookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pFilebookUrlIsNull() {
            addCriterion("p2p_fileBook_url is null");
            return (Criteria) this;
        }

        public Criteria andP2pFilebookUrlIsNotNull() {
            addCriterion("p2p_fileBook_url is not null");
            return (Criteria) this;
        }

        public Criteria andP2pFilebookUrlEqualTo(String value) {
            addCriterion("p2p_fileBook_url =", value, "p2pFilebookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pFilebookUrlNotEqualTo(String value) {
            addCriterion("p2p_fileBook_url <>", value, "p2pFilebookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pFilebookUrlGreaterThan(String value) {
            addCriterion("p2p_fileBook_url >", value, "p2pFilebookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pFilebookUrlGreaterThanOrEqualTo(String value) {
            addCriterion("p2p_fileBook_url >=", value, "p2pFilebookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pFilebookUrlLessThan(String value) {
            addCriterion("p2p_fileBook_url <", value, "p2pFilebookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pFilebookUrlLessThanOrEqualTo(String value) {
            addCriterion("p2p_fileBook_url <=", value, "p2pFilebookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pFilebookUrlLike(String value) {
            addCriterion("p2p_fileBook_url like", value, "p2pFilebookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pFilebookUrlNotLike(String value) {
            addCriterion("p2p_fileBook_url not like", value, "p2pFilebookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pFilebookUrlIn(List<String> values) {
            addCriterion("p2p_fileBook_url in", values, "p2pFilebookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pFilebookUrlNotIn(List<String> values) {
            addCriterion("p2p_fileBook_url not in", values, "p2pFilebookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pFilebookUrlBetween(String value1, String value2) {
            addCriterion("p2p_fileBook_url between", value1, value2, "p2pFilebookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pFilebookUrlNotBetween(String value1, String value2) {
            addCriterion("p2p_fileBook_url not between", value1, value2, "p2pFilebookUrl");
            return (Criteria) this;
        }

        public Criteria andP2pDescIsNull() {
            addCriterion("p2p_desc is null");
            return (Criteria) this;
        }

        public Criteria andP2pDescIsNotNull() {
            addCriterion("p2p_desc is not null");
            return (Criteria) this;
        }

        public Criteria andP2pDescEqualTo(String value) {
            addCriterion("p2p_desc =", value, "p2pDesc");
            return (Criteria) this;
        }

        public Criteria andP2pDescNotEqualTo(String value) {
            addCriterion("p2p_desc <>", value, "p2pDesc");
            return (Criteria) this;
        }

        public Criteria andP2pDescGreaterThan(String value) {
            addCriterion("p2p_desc >", value, "p2pDesc");
            return (Criteria) this;
        }

        public Criteria andP2pDescGreaterThanOrEqualTo(String value) {
            addCriterion("p2p_desc >=", value, "p2pDesc");
            return (Criteria) this;
        }

        public Criteria andP2pDescLessThan(String value) {
            addCriterion("p2p_desc <", value, "p2pDesc");
            return (Criteria) this;
        }

        public Criteria andP2pDescLessThanOrEqualTo(String value) {
            addCriterion("p2p_desc <=", value, "p2pDesc");
            return (Criteria) this;
        }

        public Criteria andP2pDescLike(String value) {
            addCriterion("p2p_desc like", value, "p2pDesc");
            return (Criteria) this;
        }

        public Criteria andP2pDescNotLike(String value) {
            addCriterion("p2p_desc not like", value, "p2pDesc");
            return (Criteria) this;
        }

        public Criteria andP2pDescIn(List<String> values) {
            addCriterion("p2p_desc in", values, "p2pDesc");
            return (Criteria) this;
        }

        public Criteria andP2pDescNotIn(List<String> values) {
            addCriterion("p2p_desc not in", values, "p2pDesc");
            return (Criteria) this;
        }

        public Criteria andP2pDescBetween(String value1, String value2) {
            addCriterion("p2p_desc between", value1, value2, "p2pDesc");
            return (Criteria) this;
        }

        public Criteria andP2pDescNotBetween(String value1, String value2) {
            addCriterion("p2p_desc not between", value1, value2, "p2pDesc");
            return (Criteria) this;
        }

        public Criteria andP2pRuleIsNull() {
            addCriterion("p2p_rule is null");
            return (Criteria) this;
        }

        public Criteria andP2pRuleIsNotNull() {
            addCriterion("p2p_rule is not null");
            return (Criteria) this;
        }

        public Criteria andP2pRuleEqualTo(String value) {
            addCriterion("p2p_rule =", value, "p2pRule");
            return (Criteria) this;
        }

        public Criteria andP2pRuleNotEqualTo(String value) {
            addCriterion("p2p_rule <>", value, "p2pRule");
            return (Criteria) this;
        }

        public Criteria andP2pRuleGreaterThan(String value) {
            addCriterion("p2p_rule >", value, "p2pRule");
            return (Criteria) this;
        }

        public Criteria andP2pRuleGreaterThanOrEqualTo(String value) {
            addCriterion("p2p_rule >=", value, "p2pRule");
            return (Criteria) this;
        }

        public Criteria andP2pRuleLessThan(String value) {
            addCriterion("p2p_rule <", value, "p2pRule");
            return (Criteria) this;
        }

        public Criteria andP2pRuleLessThanOrEqualTo(String value) {
            addCriterion("p2p_rule <=", value, "p2pRule");
            return (Criteria) this;
        }

        public Criteria andP2pRuleLike(String value) {
            addCriterion("p2p_rule like", value, "p2pRule");
            return (Criteria) this;
        }

        public Criteria andP2pRuleNotLike(String value) {
            addCriterion("p2p_rule not like", value, "p2pRule");
            return (Criteria) this;
        }

        public Criteria andP2pRuleIn(List<String> values) {
            addCriterion("p2p_rule in", values, "p2pRule");
            return (Criteria) this;
        }

        public Criteria andP2pRuleNotIn(List<String> values) {
            addCriterion("p2p_rule not in", values, "p2pRule");
            return (Criteria) this;
        }

        public Criteria andP2pRuleBetween(String value1, String value2) {
            addCriterion("p2p_rule between", value1, value2, "p2pRule");
            return (Criteria) this;
        }

        public Criteria andP2pRuleNotBetween(String value1, String value2) {
            addCriterion("p2p_rule not between", value1, value2, "p2pRule");
            return (Criteria) this;
        }

        public Criteria andP2pSafeIsNull() {
            addCriterion("p2p_safe is null");
            return (Criteria) this;
        }

        public Criteria andP2pSafeIsNotNull() {
            addCriterion("p2p_safe is not null");
            return (Criteria) this;
        }

        public Criteria andP2pSafeEqualTo(String value) {
            addCriterion("p2p_safe =", value, "p2pSafe");
            return (Criteria) this;
        }

        public Criteria andP2pSafeNotEqualTo(String value) {
            addCriterion("p2p_safe <>", value, "p2pSafe");
            return (Criteria) this;
        }

        public Criteria andP2pSafeGreaterThan(String value) {
            addCriterion("p2p_safe >", value, "p2pSafe");
            return (Criteria) this;
        }

        public Criteria andP2pSafeGreaterThanOrEqualTo(String value) {
            addCriterion("p2p_safe >=", value, "p2pSafe");
            return (Criteria) this;
        }

        public Criteria andP2pSafeLessThan(String value) {
            addCriterion("p2p_safe <", value, "p2pSafe");
            return (Criteria) this;
        }

        public Criteria andP2pSafeLessThanOrEqualTo(String value) {
            addCriterion("p2p_safe <=", value, "p2pSafe");
            return (Criteria) this;
        }

        public Criteria andP2pSafeLike(String value) {
            addCriterion("p2p_safe like", value, "p2pSafe");
            return (Criteria) this;
        }

        public Criteria andP2pSafeNotLike(String value) {
            addCriterion("p2p_safe not like", value, "p2pSafe");
            return (Criteria) this;
        }

        public Criteria andP2pSafeIn(List<String> values) {
            addCriterion("p2p_safe in", values, "p2pSafe");
            return (Criteria) this;
        }

        public Criteria andP2pSafeNotIn(List<String> values) {
            addCriterion("p2p_safe not in", values, "p2pSafe");
            return (Criteria) this;
        }

        public Criteria andP2pSafeBetween(String value1, String value2) {
            addCriterion("p2p_safe between", value1, value2, "p2pSafe");
            return (Criteria) this;
        }

        public Criteria andP2pSafeNotBetween(String value1, String value2) {
            addCriterion("p2p_safe not between", value1, value2, "p2pSafe");
            return (Criteria) this;
        }

        public Criteria andP2pIssueIsNull() {
            addCriterion("p2p_issue is null");
            return (Criteria) this;
        }

        public Criteria andP2pIssueIsNotNull() {
            addCriterion("p2p_issue is not null");
            return (Criteria) this;
        }

        public Criteria andP2pIssueEqualTo(String value) {
            addCriterion("p2p_issue =", value, "p2pIssue");
            return (Criteria) this;
        }

        public Criteria andP2pIssueNotEqualTo(String value) {
            addCriterion("p2p_issue <>", value, "p2pIssue");
            return (Criteria) this;
        }

        public Criteria andP2pIssueGreaterThan(String value) {
            addCriterion("p2p_issue >", value, "p2pIssue");
            return (Criteria) this;
        }

        public Criteria andP2pIssueGreaterThanOrEqualTo(String value) {
            addCriterion("p2p_issue >=", value, "p2pIssue");
            return (Criteria) this;
        }

        public Criteria andP2pIssueLessThan(String value) {
            addCriterion("p2p_issue <", value, "p2pIssue");
            return (Criteria) this;
        }

        public Criteria andP2pIssueLessThanOrEqualTo(String value) {
            addCriterion("p2p_issue <=", value, "p2pIssue");
            return (Criteria) this;
        }

        public Criteria andP2pIssueLike(String value) {
            addCriterion("p2p_issue like", value, "p2pIssue");
            return (Criteria) this;
        }

        public Criteria andP2pIssueNotLike(String value) {
            addCriterion("p2p_issue not like", value, "p2pIssue");
            return (Criteria) this;
        }

        public Criteria andP2pIssueIn(List<String> values) {
            addCriterion("p2p_issue in", values, "p2pIssue");
            return (Criteria) this;
        }

        public Criteria andP2pIssueNotIn(List<String> values) {
            addCriterion("p2p_issue not in", values, "p2pIssue");
            return (Criteria) this;
        }

        public Criteria andP2pIssueBetween(String value1, String value2) {
            addCriterion("p2p_issue between", value1, value2, "p2pIssue");
            return (Criteria) this;
        }

        public Criteria andP2pIssueNotBetween(String value1, String value2) {
            addCriterion("p2p_issue not between", value1, value2, "p2pIssue");
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