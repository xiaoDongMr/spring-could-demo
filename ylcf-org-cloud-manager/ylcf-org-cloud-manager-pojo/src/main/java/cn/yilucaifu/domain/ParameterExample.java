package cn.yilucaifu.domain;

import java.util.ArrayList;
import java.util.List;

public class ParameterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParameterExample() {
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

        public Criteria andParamnameIsNull() {
            addCriterion("paramName is null");
            return (Criteria) this;
        }

        public Criteria andParamnameIsNotNull() {
            addCriterion("paramName is not null");
            return (Criteria) this;
        }

        public Criteria andParamnameEqualTo(String value) {
            addCriterion("paramName =", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameNotEqualTo(String value) {
            addCriterion("paramName <>", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameGreaterThan(String value) {
            addCriterion("paramName >", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameGreaterThanOrEqualTo(String value) {
            addCriterion("paramName >=", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameLessThan(String value) {
            addCriterion("paramName <", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameLessThanOrEqualTo(String value) {
            addCriterion("paramName <=", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameLike(String value) {
            addCriterion("paramName like", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameNotLike(String value) {
            addCriterion("paramName not like", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameIn(List<String> values) {
            addCriterion("paramName in", values, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameNotIn(List<String> values) {
            addCriterion("paramName not in", values, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameBetween(String value1, String value2) {
            addCriterion("paramName between", value1, value2, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameNotBetween(String value1, String value2) {
            addCriterion("paramName not between", value1, value2, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamvalueIsNull() {
            addCriterion("paramValue is null");
            return (Criteria) this;
        }

        public Criteria andParamvalueIsNotNull() {
            addCriterion("paramValue is not null");
            return (Criteria) this;
        }

        public Criteria andParamvalueEqualTo(String value) {
            addCriterion("paramValue =", value, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueNotEqualTo(String value) {
            addCriterion("paramValue <>", value, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueGreaterThan(String value) {
            addCriterion("paramValue >", value, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueGreaterThanOrEqualTo(String value) {
            addCriterion("paramValue >=", value, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueLessThan(String value) {
            addCriterion("paramValue <", value, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueLessThanOrEqualTo(String value) {
            addCriterion("paramValue <=", value, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueLike(String value) {
            addCriterion("paramValue like", value, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueNotLike(String value) {
            addCriterion("paramValue not like", value, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueIn(List<String> values) {
            addCriterion("paramValue in", values, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueNotIn(List<String> values) {
            addCriterion("paramValue not in", values, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueBetween(String value1, String value2) {
            addCriterion("paramValue between", value1, value2, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueNotBetween(String value1, String value2) {
            addCriterion("paramValue not between", value1, value2, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamflagIsNull() {
            addCriterion("paramFlag is null");
            return (Criteria) this;
        }

        public Criteria andParamflagIsNotNull() {
            addCriterion("paramFlag is not null");
            return (Criteria) this;
        }

        public Criteria andParamflagEqualTo(String value) {
            addCriterion("paramFlag =", value, "paramflag");
            return (Criteria) this;
        }

        public Criteria andParamflagNotEqualTo(String value) {
            addCriterion("paramFlag <>", value, "paramflag");
            return (Criteria) this;
        }

        public Criteria andParamflagGreaterThan(String value) {
            addCriterion("paramFlag >", value, "paramflag");
            return (Criteria) this;
        }

        public Criteria andParamflagGreaterThanOrEqualTo(String value) {
            addCriterion("paramFlag >=", value, "paramflag");
            return (Criteria) this;
        }

        public Criteria andParamflagLessThan(String value) {
            addCriterion("paramFlag <", value, "paramflag");
            return (Criteria) this;
        }

        public Criteria andParamflagLessThanOrEqualTo(String value) {
            addCriterion("paramFlag <=", value, "paramflag");
            return (Criteria) this;
        }

        public Criteria andParamflagLike(String value) {
            addCriterion("paramFlag like", value, "paramflag");
            return (Criteria) this;
        }

        public Criteria andParamflagNotLike(String value) {
            addCriterion("paramFlag not like", value, "paramflag");
            return (Criteria) this;
        }

        public Criteria andParamflagIn(List<String> values) {
            addCriterion("paramFlag in", values, "paramflag");
            return (Criteria) this;
        }

        public Criteria andParamflagNotIn(List<String> values) {
            addCriterion("paramFlag not in", values, "paramflag");
            return (Criteria) this;
        }

        public Criteria andParamflagBetween(String value1, String value2) {
            addCriterion("paramFlag between", value1, value2, "paramflag");
            return (Criteria) this;
        }

        public Criteria andParamflagNotBetween(String value1, String value2) {
            addCriterion("paramFlag not between", value1, value2, "paramflag");
            return (Criteria) this;
        }

        public Criteria andParamdateIsNull() {
            addCriterion("paramDate is null");
            return (Criteria) this;
        }

        public Criteria andParamdateIsNotNull() {
            addCriterion("paramDate is not null");
            return (Criteria) this;
        }

        public Criteria andParamdateEqualTo(String value) {
            addCriterion("paramDate =", value, "paramdate");
            return (Criteria) this;
        }

        public Criteria andParamdateNotEqualTo(String value) {
            addCriterion("paramDate <>", value, "paramdate");
            return (Criteria) this;
        }

        public Criteria andParamdateGreaterThan(String value) {
            addCriterion("paramDate >", value, "paramdate");
            return (Criteria) this;
        }

        public Criteria andParamdateGreaterThanOrEqualTo(String value) {
            addCriterion("paramDate >=", value, "paramdate");
            return (Criteria) this;
        }

        public Criteria andParamdateLessThan(String value) {
            addCriterion("paramDate <", value, "paramdate");
            return (Criteria) this;
        }

        public Criteria andParamdateLessThanOrEqualTo(String value) {
            addCriterion("paramDate <=", value, "paramdate");
            return (Criteria) this;
        }

        public Criteria andParamdateLike(String value) {
            addCriterion("paramDate like", value, "paramdate");
            return (Criteria) this;
        }

        public Criteria andParamdateNotLike(String value) {
            addCriterion("paramDate not like", value, "paramdate");
            return (Criteria) this;
        }

        public Criteria andParamdateIn(List<String> values) {
            addCriterion("paramDate in", values, "paramdate");
            return (Criteria) this;
        }

        public Criteria andParamdateNotIn(List<String> values) {
            addCriterion("paramDate not in", values, "paramdate");
            return (Criteria) this;
        }

        public Criteria andParamdateBetween(String value1, String value2) {
            addCriterion("paramDate between", value1, value2, "paramdate");
            return (Criteria) this;
        }

        public Criteria andParamdateNotBetween(String value1, String value2) {
            addCriterion("paramDate not between", value1, value2, "paramdate");
            return (Criteria) this;
        }

        public Criteria andParamstatusIsNull() {
            addCriterion("paramStatus is null");
            return (Criteria) this;
        }

        public Criteria andParamstatusIsNotNull() {
            addCriterion("paramStatus is not null");
            return (Criteria) this;
        }

        public Criteria andParamstatusEqualTo(Integer value) {
            addCriterion("paramStatus =", value, "paramstatus");
            return (Criteria) this;
        }

        public Criteria andParamstatusNotEqualTo(Integer value) {
            addCriterion("paramStatus <>", value, "paramstatus");
            return (Criteria) this;
        }

        public Criteria andParamstatusGreaterThan(Integer value) {
            addCriterion("paramStatus >", value, "paramstatus");
            return (Criteria) this;
        }

        public Criteria andParamstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("paramStatus >=", value, "paramstatus");
            return (Criteria) this;
        }

        public Criteria andParamstatusLessThan(Integer value) {
            addCriterion("paramStatus <", value, "paramstatus");
            return (Criteria) this;
        }

        public Criteria andParamstatusLessThanOrEqualTo(Integer value) {
            addCriterion("paramStatus <=", value, "paramstatus");
            return (Criteria) this;
        }

        public Criteria andParamstatusIn(List<Integer> values) {
            addCriterion("paramStatus in", values, "paramstatus");
            return (Criteria) this;
        }

        public Criteria andParamstatusNotIn(List<Integer> values) {
            addCriterion("paramStatus not in", values, "paramstatus");
            return (Criteria) this;
        }

        public Criteria andParamstatusBetween(Integer value1, Integer value2) {
            addCriterion("paramStatus between", value1, value2, "paramstatus");
            return (Criteria) this;
        }

        public Criteria andParamstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("paramStatus not between", value1, value2, "paramstatus");
            return (Criteria) this;
        }

        public Criteria andFromipIsNull() {
            addCriterion("fromip is null");
            return (Criteria) this;
        }

        public Criteria andFromipIsNotNull() {
            addCriterion("fromip is not null");
            return (Criteria) this;
        }

        public Criteria andFromipEqualTo(String value) {
            addCriterion("fromip =", value, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipNotEqualTo(String value) {
            addCriterion("fromip <>", value, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipGreaterThan(String value) {
            addCriterion("fromip >", value, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipGreaterThanOrEqualTo(String value) {
            addCriterion("fromip >=", value, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipLessThan(String value) {
            addCriterion("fromip <", value, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipLessThanOrEqualTo(String value) {
            addCriterion("fromip <=", value, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipLike(String value) {
            addCriterion("fromip like", value, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipNotLike(String value) {
            addCriterion("fromip not like", value, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipIn(List<String> values) {
            addCriterion("fromip in", values, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipNotIn(List<String> values) {
            addCriterion("fromip not in", values, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipBetween(String value1, String value2) {
            addCriterion("fromip between", value1, value2, "fromip");
            return (Criteria) this;
        }

        public Criteria andFromipNotBetween(String value1, String value2) {
            addCriterion("fromip not between", value1, value2, "fromip");
            return (Criteria) this;
        }

        public Criteria andFirstfromIsNull() {
            addCriterion("firstfrom is null");
            return (Criteria) this;
        }

        public Criteria andFirstfromIsNotNull() {
            addCriterion("firstfrom is not null");
            return (Criteria) this;
        }

        public Criteria andFirstfromEqualTo(String value) {
            addCriterion("firstfrom =", value, "firstfrom");
            return (Criteria) this;
        }

        public Criteria andFirstfromNotEqualTo(String value) {
            addCriterion("firstfrom <>", value, "firstfrom");
            return (Criteria) this;
        }

        public Criteria andFirstfromGreaterThan(String value) {
            addCriterion("firstfrom >", value, "firstfrom");
            return (Criteria) this;
        }

        public Criteria andFirstfromGreaterThanOrEqualTo(String value) {
            addCriterion("firstfrom >=", value, "firstfrom");
            return (Criteria) this;
        }

        public Criteria andFirstfromLessThan(String value) {
            addCriterion("firstfrom <", value, "firstfrom");
            return (Criteria) this;
        }

        public Criteria andFirstfromLessThanOrEqualTo(String value) {
            addCriterion("firstfrom <=", value, "firstfrom");
            return (Criteria) this;
        }

        public Criteria andFirstfromLike(String value) {
            addCriterion("firstfrom like", value, "firstfrom");
            return (Criteria) this;
        }

        public Criteria andFirstfromNotLike(String value) {
            addCriterion("firstfrom not like", value, "firstfrom");
            return (Criteria) this;
        }

        public Criteria andFirstfromIn(List<String> values) {
            addCriterion("firstfrom in", values, "firstfrom");
            return (Criteria) this;
        }

        public Criteria andFirstfromNotIn(List<String> values) {
            addCriterion("firstfrom not in", values, "firstfrom");
            return (Criteria) this;
        }

        public Criteria andFirstfromBetween(String value1, String value2) {
            addCriterion("firstfrom between", value1, value2, "firstfrom");
            return (Criteria) this;
        }

        public Criteria andFirstfromNotBetween(String value1, String value2) {
            addCriterion("firstfrom not between", value1, value2, "firstfrom");
            return (Criteria) this;
        }

        public Criteria andFirstadIsNull() {
            addCriterion("firstad is null");
            return (Criteria) this;
        }

        public Criteria andFirstadIsNotNull() {
            addCriterion("firstad is not null");
            return (Criteria) this;
        }

        public Criteria andFirstadEqualTo(String value) {
            addCriterion("firstad =", value, "firstad");
            return (Criteria) this;
        }

        public Criteria andFirstadNotEqualTo(String value) {
            addCriterion("firstad <>", value, "firstad");
            return (Criteria) this;
        }

        public Criteria andFirstadGreaterThan(String value) {
            addCriterion("firstad >", value, "firstad");
            return (Criteria) this;
        }

        public Criteria andFirstadGreaterThanOrEqualTo(String value) {
            addCriterion("firstad >=", value, "firstad");
            return (Criteria) this;
        }

        public Criteria andFirstadLessThan(String value) {
            addCriterion("firstad <", value, "firstad");
            return (Criteria) this;
        }

        public Criteria andFirstadLessThanOrEqualTo(String value) {
            addCriterion("firstad <=", value, "firstad");
            return (Criteria) this;
        }

        public Criteria andFirstadLike(String value) {
            addCriterion("firstad like", value, "firstad");
            return (Criteria) this;
        }

        public Criteria andFirstadNotLike(String value) {
            addCriterion("firstad not like", value, "firstad");
            return (Criteria) this;
        }

        public Criteria andFirstadIn(List<String> values) {
            addCriterion("firstad in", values, "firstad");
            return (Criteria) this;
        }

        public Criteria andFirstadNotIn(List<String> values) {
            addCriterion("firstad not in", values, "firstad");
            return (Criteria) this;
        }

        public Criteria andFirstadBetween(String value1, String value2) {
            addCriterion("firstad between", value1, value2, "firstad");
            return (Criteria) this;
        }

        public Criteria andFirstadNotBetween(String value1, String value2) {
            addCriterion("firstad not between", value1, value2, "firstad");
            return (Criteria) this;
        }

        public Criteria andVailcountIsNull() {
            addCriterion("vailCount is null");
            return (Criteria) this;
        }

        public Criteria andVailcountIsNotNull() {
            addCriterion("vailCount is not null");
            return (Criteria) this;
        }

        public Criteria andVailcountEqualTo(Integer value) {
            addCriterion("vailCount =", value, "vailcount");
            return (Criteria) this;
        }

        public Criteria andVailcountNotEqualTo(Integer value) {
            addCriterion("vailCount <>", value, "vailcount");
            return (Criteria) this;
        }

        public Criteria andVailcountGreaterThan(Integer value) {
            addCriterion("vailCount >", value, "vailcount");
            return (Criteria) this;
        }

        public Criteria andVailcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("vailCount >=", value, "vailcount");
            return (Criteria) this;
        }

        public Criteria andVailcountLessThan(Integer value) {
            addCriterion("vailCount <", value, "vailcount");
            return (Criteria) this;
        }

        public Criteria andVailcountLessThanOrEqualTo(Integer value) {
            addCriterion("vailCount <=", value, "vailcount");
            return (Criteria) this;
        }

        public Criteria andVailcountIn(List<Integer> values) {
            addCriterion("vailCount in", values, "vailcount");
            return (Criteria) this;
        }

        public Criteria andVailcountNotIn(List<Integer> values) {
            addCriterion("vailCount not in", values, "vailcount");
            return (Criteria) this;
        }

        public Criteria andVailcountBetween(Integer value1, Integer value2) {
            addCriterion("vailCount between", value1, value2, "vailcount");
            return (Criteria) this;
        }

        public Criteria andVailcountNotBetween(Integer value1, Integer value2) {
            addCriterion("vailCount not between", value1, value2, "vailcount");
            return (Criteria) this;
        }

        public Criteria andDeviceuuidIsNull() {
            addCriterion("deviceUUID is null");
            return (Criteria) this;
        }

        public Criteria andDeviceuuidIsNotNull() {
            addCriterion("deviceUUID is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceuuidEqualTo(String value) {
            addCriterion("deviceUUID =", value, "deviceuuid");
            return (Criteria) this;
        }

        public Criteria andDeviceuuidNotEqualTo(String value) {
            addCriterion("deviceUUID <>", value, "deviceuuid");
            return (Criteria) this;
        }

        public Criteria andDeviceuuidGreaterThan(String value) {
            addCriterion("deviceUUID >", value, "deviceuuid");
            return (Criteria) this;
        }

        public Criteria andDeviceuuidGreaterThanOrEqualTo(String value) {
            addCriterion("deviceUUID >=", value, "deviceuuid");
            return (Criteria) this;
        }

        public Criteria andDeviceuuidLessThan(String value) {
            addCriterion("deviceUUID <", value, "deviceuuid");
            return (Criteria) this;
        }

        public Criteria andDeviceuuidLessThanOrEqualTo(String value) {
            addCriterion("deviceUUID <=", value, "deviceuuid");
            return (Criteria) this;
        }

        public Criteria andDeviceuuidLike(String value) {
            addCriterion("deviceUUID like", value, "deviceuuid");
            return (Criteria) this;
        }

        public Criteria andDeviceuuidNotLike(String value) {
            addCriterion("deviceUUID not like", value, "deviceuuid");
            return (Criteria) this;
        }

        public Criteria andDeviceuuidIn(List<String> values) {
            addCriterion("deviceUUID in", values, "deviceuuid");
            return (Criteria) this;
        }

        public Criteria andDeviceuuidNotIn(List<String> values) {
            addCriterion("deviceUUID not in", values, "deviceuuid");
            return (Criteria) this;
        }

        public Criteria andDeviceuuidBetween(String value1, String value2) {
            addCriterion("deviceUUID between", value1, value2, "deviceuuid");
            return (Criteria) this;
        }

        public Criteria andDeviceuuidNotBetween(String value1, String value2) {
            addCriterion("deviceUUID not between", value1, value2, "deviceuuid");
            return (Criteria) this;
        }

        public Criteria andSerialidIsNull() {
            addCriterion("serialId is null");
            return (Criteria) this;
        }

        public Criteria andSerialidIsNotNull() {
            addCriterion("serialId is not null");
            return (Criteria) this;
        }

        public Criteria andSerialidEqualTo(String value) {
            addCriterion("serialId =", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotEqualTo(String value) {
            addCriterion("serialId <>", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidGreaterThan(String value) {
            addCriterion("serialId >", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidGreaterThanOrEqualTo(String value) {
            addCriterion("serialId >=", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidLessThan(String value) {
            addCriterion("serialId <", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidLessThanOrEqualTo(String value) {
            addCriterion("serialId <=", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidLike(String value) {
            addCriterion("serialId like", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotLike(String value) {
            addCriterion("serialId not like", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidIn(List<String> values) {
            addCriterion("serialId in", values, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotIn(List<String> values) {
            addCriterion("serialId not in", values, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidBetween(String value1, String value2) {
            addCriterion("serialId between", value1, value2, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotBetween(String value1, String value2) {
            addCriterion("serialId not between", value1, value2, "serialid");
            return (Criteria) this;
        }

        public Criteria andIsvoiceIsNull() {
            addCriterion("isVoice is null");
            return (Criteria) this;
        }

        public Criteria andIsvoiceIsNotNull() {
            addCriterion("isVoice is not null");
            return (Criteria) this;
        }

        public Criteria andIsvoiceEqualTo(Integer value) {
            addCriterion("isVoice =", value, "isvoice");
            return (Criteria) this;
        }

        public Criteria andIsvoiceNotEqualTo(Integer value) {
            addCriterion("isVoice <>", value, "isvoice");
            return (Criteria) this;
        }

        public Criteria andIsvoiceGreaterThan(Integer value) {
            addCriterion("isVoice >", value, "isvoice");
            return (Criteria) this;
        }

        public Criteria andIsvoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("isVoice >=", value, "isvoice");
            return (Criteria) this;
        }

        public Criteria andIsvoiceLessThan(Integer value) {
            addCriterion("isVoice <", value, "isvoice");
            return (Criteria) this;
        }

        public Criteria andIsvoiceLessThanOrEqualTo(Integer value) {
            addCriterion("isVoice <=", value, "isvoice");
            return (Criteria) this;
        }

        public Criteria andIsvoiceIn(List<Integer> values) {
            addCriterion("isVoice in", values, "isvoice");
            return (Criteria) this;
        }

        public Criteria andIsvoiceNotIn(List<Integer> values) {
            addCriterion("isVoice not in", values, "isvoice");
            return (Criteria) this;
        }

        public Criteria andIsvoiceBetween(Integer value1, Integer value2) {
            addCriterion("isVoice between", value1, value2, "isvoice");
            return (Criteria) this;
        }

        public Criteria andIsvoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("isVoice not between", value1, value2, "isvoice");
            return (Criteria) this;
        }

        public Criteria andBankcardnoIsNull() {
            addCriterion("bankcardno is null");
            return (Criteria) this;
        }

        public Criteria andBankcardnoIsNotNull() {
            addCriterion("bankcardno is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardnoEqualTo(String value) {
            addCriterion("bankcardno =", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoNotEqualTo(String value) {
            addCriterion("bankcardno <>", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoGreaterThan(String value) {
            addCriterion("bankcardno >", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoGreaterThanOrEqualTo(String value) {
            addCriterion("bankcardno >=", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoLessThan(String value) {
            addCriterion("bankcardno <", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoLessThanOrEqualTo(String value) {
            addCriterion("bankcardno <=", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoLike(String value) {
            addCriterion("bankcardno like", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoNotLike(String value) {
            addCriterion("bankcardno not like", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoIn(List<String> values) {
            addCriterion("bankcardno in", values, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoNotIn(List<String> values) {
            addCriterion("bankcardno not in", values, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoBetween(String value1, String value2) {
            addCriterion("bankcardno between", value1, value2, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoNotBetween(String value1, String value2) {
            addCriterion("bankcardno not between", value1, value2, "bankcardno");
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