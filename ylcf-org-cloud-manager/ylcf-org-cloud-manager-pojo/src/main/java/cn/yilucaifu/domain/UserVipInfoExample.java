package cn.yilucaifu.domain;

import java.util.ArrayList;
import java.util.List;

public class UserVipInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserVipInfoExample() {
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

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andWealthvalueIsNull() {
            addCriterion("wealthValue is null");
            return (Criteria) this;
        }

        public Criteria andWealthvalueIsNotNull() {
            addCriterion("wealthValue is not null");
            return (Criteria) this;
        }

        public Criteria andWealthvalueEqualTo(Long value) {
            addCriterion("wealthValue =", value, "wealthvalue");
            return (Criteria) this;
        }

        public Criteria andWealthvalueNotEqualTo(Long value) {
            addCriterion("wealthValue <>", value, "wealthvalue");
            return (Criteria) this;
        }

        public Criteria andWealthvalueGreaterThan(Long value) {
            addCriterion("wealthValue >", value, "wealthvalue");
            return (Criteria) this;
        }

        public Criteria andWealthvalueGreaterThanOrEqualTo(Long value) {
            addCriterion("wealthValue >=", value, "wealthvalue");
            return (Criteria) this;
        }

        public Criteria andWealthvalueLessThan(Long value) {
            addCriterion("wealthValue <", value, "wealthvalue");
            return (Criteria) this;
        }

        public Criteria andWealthvalueLessThanOrEqualTo(Long value) {
            addCriterion("wealthValue <=", value, "wealthvalue");
            return (Criteria) this;
        }

        public Criteria andWealthvalueIn(List<Long> values) {
            addCriterion("wealthValue in", values, "wealthvalue");
            return (Criteria) this;
        }

        public Criteria andWealthvalueNotIn(List<Long> values) {
            addCriterion("wealthValue not in", values, "wealthvalue");
            return (Criteria) this;
        }

        public Criteria andWealthvalueBetween(Long value1, Long value2) {
            addCriterion("wealthValue between", value1, value2, "wealthvalue");
            return (Criteria) this;
        }

        public Criteria andWealthvalueNotBetween(Long value1, Long value2) {
            addCriterion("wealthValue not between", value1, value2, "wealthvalue");
            return (Criteria) this;
        }

        public Criteria andViplevelIsNull() {
            addCriterion("vipLevel is null");
            return (Criteria) this;
        }

        public Criteria andViplevelIsNotNull() {
            addCriterion("vipLevel is not null");
            return (Criteria) this;
        }

        public Criteria andViplevelEqualTo(String value) {
            addCriterion("vipLevel =", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelNotEqualTo(String value) {
            addCriterion("vipLevel <>", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelGreaterThan(String value) {
            addCriterion("vipLevel >", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelGreaterThanOrEqualTo(String value) {
            addCriterion("vipLevel >=", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelLessThan(String value) {
            addCriterion("vipLevel <", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelLessThanOrEqualTo(String value) {
            addCriterion("vipLevel <=", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelLike(String value) {
            addCriterion("vipLevel like", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelNotLike(String value) {
            addCriterion("vipLevel not like", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelIn(List<String> values) {
            addCriterion("vipLevel in", values, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelNotIn(List<String> values) {
            addCriterion("vipLevel not in", values, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelBetween(String value1, String value2) {
            addCriterion("vipLevel between", value1, value2, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelNotBetween(String value1, String value2) {
            addCriterion("vipLevel not between", value1, value2, "viplevel");
            return (Criteria) this;
        }

        public Criteria andAdvisoridIsNull() {
            addCriterion("advisorId is null");
            return (Criteria) this;
        }

        public Criteria andAdvisoridIsNotNull() {
            addCriterion("advisorId is not null");
            return (Criteria) this;
        }

        public Criteria andAdvisoridEqualTo(Integer value) {
            addCriterion("advisorId =", value, "advisorid");
            return (Criteria) this;
        }

        public Criteria andAdvisoridNotEqualTo(Integer value) {
            addCriterion("advisorId <>", value, "advisorid");
            return (Criteria) this;
        }

        public Criteria andAdvisoridGreaterThan(Integer value) {
            addCriterion("advisorId >", value, "advisorid");
            return (Criteria) this;
        }

        public Criteria andAdvisoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("advisorId >=", value, "advisorid");
            return (Criteria) this;
        }

        public Criteria andAdvisoridLessThan(Integer value) {
            addCriterion("advisorId <", value, "advisorid");
            return (Criteria) this;
        }

        public Criteria andAdvisoridLessThanOrEqualTo(Integer value) {
            addCriterion("advisorId <=", value, "advisorid");
            return (Criteria) this;
        }

        public Criteria andAdvisoridIn(List<Integer> values) {
            addCriterion("advisorId in", values, "advisorid");
            return (Criteria) this;
        }

        public Criteria andAdvisoridNotIn(List<Integer> values) {
            addCriterion("advisorId not in", values, "advisorid");
            return (Criteria) this;
        }

        public Criteria andAdvisoridBetween(Integer value1, Integer value2) {
            addCriterion("advisorId between", value1, value2, "advisorid");
            return (Criteria) this;
        }

        public Criteria andAdvisoridNotBetween(Integer value1, Integer value2) {
            addCriterion("advisorId not between", value1, value2, "advisorid");
            return (Criteria) this;
        }

        public Criteria andInvestmentanalysisIsNull() {
            addCriterion("investmentAnalysis is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentanalysisIsNotNull() {
            addCriterion("investmentAnalysis is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentanalysisEqualTo(String value) {
            addCriterion("investmentAnalysis =", value, "investmentanalysis");
            return (Criteria) this;
        }

        public Criteria andInvestmentanalysisNotEqualTo(String value) {
            addCriterion("investmentAnalysis <>", value, "investmentanalysis");
            return (Criteria) this;
        }

        public Criteria andInvestmentanalysisGreaterThan(String value) {
            addCriterion("investmentAnalysis >", value, "investmentanalysis");
            return (Criteria) this;
        }

        public Criteria andInvestmentanalysisGreaterThanOrEqualTo(String value) {
            addCriterion("investmentAnalysis >=", value, "investmentanalysis");
            return (Criteria) this;
        }

        public Criteria andInvestmentanalysisLessThan(String value) {
            addCriterion("investmentAnalysis <", value, "investmentanalysis");
            return (Criteria) this;
        }

        public Criteria andInvestmentanalysisLessThanOrEqualTo(String value) {
            addCriterion("investmentAnalysis <=", value, "investmentanalysis");
            return (Criteria) this;
        }

        public Criteria andInvestmentanalysisLike(String value) {
            addCriterion("investmentAnalysis like", value, "investmentanalysis");
            return (Criteria) this;
        }

        public Criteria andInvestmentanalysisNotLike(String value) {
            addCriterion("investmentAnalysis not like", value, "investmentanalysis");
            return (Criteria) this;
        }

        public Criteria andInvestmentanalysisIn(List<String> values) {
            addCriterion("investmentAnalysis in", values, "investmentanalysis");
            return (Criteria) this;
        }

        public Criteria andInvestmentanalysisNotIn(List<String> values) {
            addCriterion("investmentAnalysis not in", values, "investmentanalysis");
            return (Criteria) this;
        }

        public Criteria andInvestmentanalysisBetween(String value1, String value2) {
            addCriterion("investmentAnalysis between", value1, value2, "investmentanalysis");
            return (Criteria) this;
        }

        public Criteria andInvestmentanalysisNotBetween(String value1, String value2) {
            addCriterion("investmentAnalysis not between", value1, value2, "investmentanalysis");
            return (Criteria) this;
        }

        public Criteria andCommentaryIsNull() {
            addCriterion("commentary is null");
            return (Criteria) this;
        }

        public Criteria andCommentaryIsNotNull() {
            addCriterion("commentary is not null");
            return (Criteria) this;
        }

        public Criteria andCommentaryEqualTo(String value) {
            addCriterion("commentary =", value, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryNotEqualTo(String value) {
            addCriterion("commentary <>", value, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryGreaterThan(String value) {
            addCriterion("commentary >", value, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryGreaterThanOrEqualTo(String value) {
            addCriterion("commentary >=", value, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryLessThan(String value) {
            addCriterion("commentary <", value, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryLessThanOrEqualTo(String value) {
            addCriterion("commentary <=", value, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryLike(String value) {
            addCriterion("commentary like", value, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryNotLike(String value) {
            addCriterion("commentary not like", value, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryIn(List<String> values) {
            addCriterion("commentary in", values, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryNotIn(List<String> values) {
            addCriterion("commentary not in", values, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryBetween(String value1, String value2) {
            addCriterion("commentary between", value1, value2, "commentary");
            return (Criteria) this;
        }

        public Criteria andCommentaryNotBetween(String value1, String value2) {
            addCriterion("commentary not between", value1, value2, "commentary");
            return (Criteria) this;
        }

        public Criteria andRevenuebroadcastIsNull() {
            addCriterion("revenueBroadcast is null");
            return (Criteria) this;
        }

        public Criteria andRevenuebroadcastIsNotNull() {
            addCriterion("revenueBroadcast is not null");
            return (Criteria) this;
        }

        public Criteria andRevenuebroadcastEqualTo(String value) {
            addCriterion("revenueBroadcast =", value, "revenuebroadcast");
            return (Criteria) this;
        }

        public Criteria andRevenuebroadcastNotEqualTo(String value) {
            addCriterion("revenueBroadcast <>", value, "revenuebroadcast");
            return (Criteria) this;
        }

        public Criteria andRevenuebroadcastGreaterThan(String value) {
            addCriterion("revenueBroadcast >", value, "revenuebroadcast");
            return (Criteria) this;
        }

        public Criteria andRevenuebroadcastGreaterThanOrEqualTo(String value) {
            addCriterion("revenueBroadcast >=", value, "revenuebroadcast");
            return (Criteria) this;
        }

        public Criteria andRevenuebroadcastLessThan(String value) {
            addCriterion("revenueBroadcast <", value, "revenuebroadcast");
            return (Criteria) this;
        }

        public Criteria andRevenuebroadcastLessThanOrEqualTo(String value) {
            addCriterion("revenueBroadcast <=", value, "revenuebroadcast");
            return (Criteria) this;
        }

        public Criteria andRevenuebroadcastLike(String value) {
            addCriterion("revenueBroadcast like", value, "revenuebroadcast");
            return (Criteria) this;
        }

        public Criteria andRevenuebroadcastNotLike(String value) {
            addCriterion("revenueBroadcast not like", value, "revenuebroadcast");
            return (Criteria) this;
        }

        public Criteria andRevenuebroadcastIn(List<String> values) {
            addCriterion("revenueBroadcast in", values, "revenuebroadcast");
            return (Criteria) this;
        }

        public Criteria andRevenuebroadcastNotIn(List<String> values) {
            addCriterion("revenueBroadcast not in", values, "revenuebroadcast");
            return (Criteria) this;
        }

        public Criteria andRevenuebroadcastBetween(String value1, String value2) {
            addCriterion("revenueBroadcast between", value1, value2, "revenuebroadcast");
            return (Criteria) this;
        }

        public Criteria andRevenuebroadcastNotBetween(String value1, String value2) {
            addCriterion("revenueBroadcast not between", value1, value2, "revenuebroadcast");
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