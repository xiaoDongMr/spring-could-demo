package cn.yilucaifu.domain;

import java.util.ArrayList;
import java.util.List;

public class P2pBanksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public P2pBanksExample() {
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

        public Criteria andBankpicIsNull() {
            addCriterion("bankpic is null");
            return (Criteria) this;
        }

        public Criteria andBankpicIsNotNull() {
            addCriterion("bankpic is not null");
            return (Criteria) this;
        }

        public Criteria andBankpicEqualTo(String value) {
            addCriterion("bankpic =", value, "bankpic");
            return (Criteria) this;
        }

        public Criteria andBankpicNotEqualTo(String value) {
            addCriterion("bankpic <>", value, "bankpic");
            return (Criteria) this;
        }

        public Criteria andBankpicGreaterThan(String value) {
            addCriterion("bankpic >", value, "bankpic");
            return (Criteria) this;
        }

        public Criteria andBankpicGreaterThanOrEqualTo(String value) {
            addCriterion("bankpic >=", value, "bankpic");
            return (Criteria) this;
        }

        public Criteria andBankpicLessThan(String value) {
            addCriterion("bankpic <", value, "bankpic");
            return (Criteria) this;
        }

        public Criteria andBankpicLessThanOrEqualTo(String value) {
            addCriterion("bankpic <=", value, "bankpic");
            return (Criteria) this;
        }

        public Criteria andBankpicLike(String value) {
            addCriterion("bankpic like", value, "bankpic");
            return (Criteria) this;
        }

        public Criteria andBankpicNotLike(String value) {
            addCriterion("bankpic not like", value, "bankpic");
            return (Criteria) this;
        }

        public Criteria andBankpicIn(List<String> values) {
            addCriterion("bankpic in", values, "bankpic");
            return (Criteria) this;
        }

        public Criteria andBankpicNotIn(List<String> values) {
            addCriterion("bankpic not in", values, "bankpic");
            return (Criteria) this;
        }

        public Criteria andBankpicBetween(String value1, String value2) {
            addCriterion("bankpic between", value1, value2, "bankpic");
            return (Criteria) this;
        }

        public Criteria andBankpicNotBetween(String value1, String value2) {
            addCriterion("bankpic not between", value1, value2, "bankpic");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNull() {
            addCriterion("shortname is null");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNotNull() {
            addCriterion("shortname is not null");
            return (Criteria) this;
        }

        public Criteria andShortnameEqualTo(String value) {
            addCriterion("shortname =", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotEqualTo(String value) {
            addCriterion("shortname <>", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThan(String value) {
            addCriterion("shortname >", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("shortname >=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThan(String value) {
            addCriterion("shortname <", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThanOrEqualTo(String value) {
            addCriterion("shortname <=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLike(String value) {
            addCriterion("shortname like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotLike(String value) {
            addCriterion("shortname not like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameIn(List<String> values) {
            addCriterion("shortname in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotIn(List<String> values) {
            addCriterion("shortname not in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameBetween(String value1, String value2) {
            addCriterion("shortname between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotBetween(String value1, String value2) {
            addCriterion("shortname not between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andMaxinvestlimitIsNull() {
            addCriterion("maxInvestLimit is null");
            return (Criteria) this;
        }

        public Criteria andMaxinvestlimitIsNotNull() {
            addCriterion("maxInvestLimit is not null");
            return (Criteria) this;
        }

        public Criteria andMaxinvestlimitEqualTo(String value) {
            addCriterion("maxInvestLimit =", value, "maxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andMaxinvestlimitNotEqualTo(String value) {
            addCriterion("maxInvestLimit <>", value, "maxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andMaxinvestlimitGreaterThan(String value) {
            addCriterion("maxInvestLimit >", value, "maxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andMaxinvestlimitGreaterThanOrEqualTo(String value) {
            addCriterion("maxInvestLimit >=", value, "maxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andMaxinvestlimitLessThan(String value) {
            addCriterion("maxInvestLimit <", value, "maxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andMaxinvestlimitLessThanOrEqualTo(String value) {
            addCriterion("maxInvestLimit <=", value, "maxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andMaxinvestlimitLike(String value) {
            addCriterion("maxInvestLimit like", value, "maxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andMaxinvestlimitNotLike(String value) {
            addCriterion("maxInvestLimit not like", value, "maxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andMaxinvestlimitIn(List<String> values) {
            addCriterion("maxInvestLimit in", values, "maxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andMaxinvestlimitNotIn(List<String> values) {
            addCriterion("maxInvestLimit not in", values, "maxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andMaxinvestlimitBetween(String value1, String value2) {
            addCriterion("maxInvestLimit between", value1, value2, "maxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andMaxinvestlimitNotBetween(String value1, String value2) {
            addCriterion("maxInvestLimit not between", value1, value2, "maxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andTodaymaxinvestlimitIsNull() {
            addCriterion("todayMaxInvestLimit is null");
            return (Criteria) this;
        }

        public Criteria andTodaymaxinvestlimitIsNotNull() {
            addCriterion("todayMaxInvestLimit is not null");
            return (Criteria) this;
        }

        public Criteria andTodaymaxinvestlimitEqualTo(String value) {
            addCriterion("todayMaxInvestLimit =", value, "todaymaxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andTodaymaxinvestlimitNotEqualTo(String value) {
            addCriterion("todayMaxInvestLimit <>", value, "todaymaxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andTodaymaxinvestlimitGreaterThan(String value) {
            addCriterion("todayMaxInvestLimit >", value, "todaymaxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andTodaymaxinvestlimitGreaterThanOrEqualTo(String value) {
            addCriterion("todayMaxInvestLimit >=", value, "todaymaxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andTodaymaxinvestlimitLessThan(String value) {
            addCriterion("todayMaxInvestLimit <", value, "todaymaxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andTodaymaxinvestlimitLessThanOrEqualTo(String value) {
            addCriterion("todayMaxInvestLimit <=", value, "todaymaxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andTodaymaxinvestlimitLike(String value) {
            addCriterion("todayMaxInvestLimit like", value, "todaymaxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andTodaymaxinvestlimitNotLike(String value) {
            addCriterion("todayMaxInvestLimit not like", value, "todaymaxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andTodaymaxinvestlimitIn(List<String> values) {
            addCriterion("todayMaxInvestLimit in", values, "todaymaxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andTodaymaxinvestlimitNotIn(List<String> values) {
            addCriterion("todayMaxInvestLimit not in", values, "todaymaxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andTodaymaxinvestlimitBetween(String value1, String value2) {
            addCriterion("todayMaxInvestLimit between", value1, value2, "todaymaxinvestlimit");
            return (Criteria) this;
        }

        public Criteria andTodaymaxinvestlimitNotBetween(String value1, String value2) {
            addCriterion("todayMaxInvestLimit not between", value1, value2, "todaymaxinvestlimit");
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