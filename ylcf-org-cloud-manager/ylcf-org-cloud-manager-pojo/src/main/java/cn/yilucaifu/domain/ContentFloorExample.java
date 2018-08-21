package cn.yilucaifu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContentFloorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContentFloorExample() {
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

        public Criteria andFloorNameIsNull() {
            addCriterion("floor_name is null");
            return (Criteria) this;
        }

        public Criteria andFloorNameIsNotNull() {
            addCriterion("floor_name is not null");
            return (Criteria) this;
        }

        public Criteria andFloorNameEqualTo(String value) {
            addCriterion("floor_name =", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotEqualTo(String value) {
            addCriterion("floor_name <>", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameGreaterThan(String value) {
            addCriterion("floor_name >", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameGreaterThanOrEqualTo(String value) {
            addCriterion("floor_name >=", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLessThan(String value) {
            addCriterion("floor_name <", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLessThanOrEqualTo(String value) {
            addCriterion("floor_name <=", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLike(String value) {
            addCriterion("floor_name like", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotLike(String value) {
            addCriterion("floor_name not like", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameIn(List<String> values) {
            addCriterion("floor_name in", values, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotIn(List<String> values) {
            addCriterion("floor_name not in", values, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameBetween(String value1, String value2) {
            addCriterion("floor_name between", value1, value2, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotBetween(String value1, String value2) {
            addCriterion("floor_name not between", value1, value2, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorWeightIsNull() {
            addCriterion("floor_weight is null");
            return (Criteria) this;
        }

        public Criteria andFloorWeightIsNotNull() {
            addCriterion("floor_weight is not null");
            return (Criteria) this;
        }

        public Criteria andFloorWeightEqualTo(Integer value) {
            addCriterion("floor_weight =", value, "floorWeight");
            return (Criteria) this;
        }

        public Criteria andFloorWeightNotEqualTo(Integer value) {
            addCriterion("floor_weight <>", value, "floorWeight");
            return (Criteria) this;
        }

        public Criteria andFloorWeightGreaterThan(Integer value) {
            addCriterion("floor_weight >", value, "floorWeight");
            return (Criteria) this;
        }

        public Criteria andFloorWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor_weight >=", value, "floorWeight");
            return (Criteria) this;
        }

        public Criteria andFloorWeightLessThan(Integer value) {
            addCriterion("floor_weight <", value, "floorWeight");
            return (Criteria) this;
        }

        public Criteria andFloorWeightLessThanOrEqualTo(Integer value) {
            addCriterion("floor_weight <=", value, "floorWeight");
            return (Criteria) this;
        }

        public Criteria andFloorWeightIn(List<Integer> values) {
            addCriterion("floor_weight in", values, "floorWeight");
            return (Criteria) this;
        }

        public Criteria andFloorWeightNotIn(List<Integer> values) {
            addCriterion("floor_weight not in", values, "floorWeight");
            return (Criteria) this;
        }

        public Criteria andFloorWeightBetween(Integer value1, Integer value2) {
            addCriterion("floor_weight between", value1, value2, "floorWeight");
            return (Criteria) this;
        }

        public Criteria andFloorWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("floor_weight not between", value1, value2, "floorWeight");
            return (Criteria) this;
        }

        public Criteria andFloorTypesIsNull() {
            addCriterion("floor_types is null");
            return (Criteria) this;
        }

        public Criteria andFloorTypesIsNotNull() {
            addCriterion("floor_types is not null");
            return (Criteria) this;
        }

        public Criteria andFloorTypesEqualTo(String value) {
            addCriterion("floor_types =", value, "floorTypes");
            return (Criteria) this;
        }

        public Criteria andFloorTypesNotEqualTo(String value) {
            addCriterion("floor_types <>", value, "floorTypes");
            return (Criteria) this;
        }

        public Criteria andFloorTypesGreaterThan(String value) {
            addCriterion("floor_types >", value, "floorTypes");
            return (Criteria) this;
        }

        public Criteria andFloorTypesGreaterThanOrEqualTo(String value) {
            addCriterion("floor_types >=", value, "floorTypes");
            return (Criteria) this;
        }

        public Criteria andFloorTypesLessThan(String value) {
            addCriterion("floor_types <", value, "floorTypes");
            return (Criteria) this;
        }

        public Criteria andFloorTypesLessThanOrEqualTo(String value) {
            addCriterion("floor_types <=", value, "floorTypes");
            return (Criteria) this;
        }

        public Criteria andFloorTypesLike(String value) {
            addCriterion("floor_types like", value, "floorTypes");
            return (Criteria) this;
        }

        public Criteria andFloorTypesNotLike(String value) {
            addCriterion("floor_types not like", value, "floorTypes");
            return (Criteria) this;
        }

        public Criteria andFloorTypesIn(List<String> values) {
            addCriterion("floor_types in", values, "floorTypes");
            return (Criteria) this;
        }

        public Criteria andFloorTypesNotIn(List<String> values) {
            addCriterion("floor_types not in", values, "floorTypes");
            return (Criteria) this;
        }

        public Criteria andFloorTypesBetween(String value1, String value2) {
            addCriterion("floor_types between", value1, value2, "floorTypes");
            return (Criteria) this;
        }

        public Criteria andFloorTypesNotBetween(String value1, String value2) {
            addCriterion("floor_types not between", value1, value2, "floorTypes");
            return (Criteria) this;
        }

        public Criteria andFloorStatusIsNull() {
            addCriterion("floor_status is null");
            return (Criteria) this;
        }

        public Criteria andFloorStatusIsNotNull() {
            addCriterion("floor_status is not null");
            return (Criteria) this;
        }

        public Criteria andFloorStatusEqualTo(Byte value) {
            addCriterion("floor_status =", value, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusNotEqualTo(Byte value) {
            addCriterion("floor_status <>", value, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusGreaterThan(Byte value) {
            addCriterion("floor_status >", value, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("floor_status >=", value, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusLessThan(Byte value) {
            addCriterion("floor_status <", value, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusLessThanOrEqualTo(Byte value) {
            addCriterion("floor_status <=", value, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusIn(List<Byte> values) {
            addCriterion("floor_status in", values, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusNotIn(List<Byte> values) {
            addCriterion("floor_status not in", values, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusBetween(Byte value1, Byte value2) {
            addCriterion("floor_status between", value1, value2, "floorStatus");
            return (Criteria) this;
        }

        public Criteria andFloorStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("floor_status not between", value1, value2, "floorStatus");
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

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
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