package cn.yilucaifu.domain;

import java.util.ArrayList;
import java.util.List;

public class FundRiskResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FundRiskResultExample() {
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

        public Criteria andTestClassIsNull() {
            addCriterion("test_class is null");
            return (Criteria) this;
        }

        public Criteria andTestClassIsNotNull() {
            addCriterion("test_class is not null");
            return (Criteria) this;
        }

        public Criteria andTestClassEqualTo(Integer value) {
            addCriterion("test_class =", value, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassNotEqualTo(Integer value) {
            addCriterion("test_class <>", value, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassGreaterThan(Integer value) {
            addCriterion("test_class >", value, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_class >=", value, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassLessThan(Integer value) {
            addCriterion("test_class <", value, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassLessThanOrEqualTo(Integer value) {
            addCriterion("test_class <=", value, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassIn(List<Integer> values) {
            addCriterion("test_class in", values, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassNotIn(List<Integer> values) {
            addCriterion("test_class not in", values, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassBetween(Integer value1, Integer value2) {
            addCriterion("test_class between", value1, value2, "testClass");
            return (Criteria) this;
        }

        public Criteria andTestClassNotBetween(Integer value1, Integer value2) {
            addCriterion("test_class not between", value1, value2, "testClass");
            return (Criteria) this;
        }

        public Criteria andRiskContentIsNull() {
            addCriterion("risk_content is null");
            return (Criteria) this;
        }

        public Criteria andRiskContentIsNotNull() {
            addCriterion("risk_content is not null");
            return (Criteria) this;
        }

        public Criteria andRiskContentEqualTo(String value) {
            addCriterion("risk_content =", value, "riskContent");
            return (Criteria) this;
        }

        public Criteria andRiskContentNotEqualTo(String value) {
            addCriterion("risk_content <>", value, "riskContent");
            return (Criteria) this;
        }

        public Criteria andRiskContentGreaterThan(String value) {
            addCriterion("risk_content >", value, "riskContent");
            return (Criteria) this;
        }

        public Criteria andRiskContentGreaterThanOrEqualTo(String value) {
            addCriterion("risk_content >=", value, "riskContent");
            return (Criteria) this;
        }

        public Criteria andRiskContentLessThan(String value) {
            addCriterion("risk_content <", value, "riskContent");
            return (Criteria) this;
        }

        public Criteria andRiskContentLessThanOrEqualTo(String value) {
            addCriterion("risk_content <=", value, "riskContent");
            return (Criteria) this;
        }

        public Criteria andRiskContentLike(String value) {
            addCriterion("risk_content like", value, "riskContent");
            return (Criteria) this;
        }

        public Criteria andRiskContentNotLike(String value) {
            addCriterion("risk_content not like", value, "riskContent");
            return (Criteria) this;
        }

        public Criteria andRiskContentIn(List<String> values) {
            addCriterion("risk_content in", values, "riskContent");
            return (Criteria) this;
        }

        public Criteria andRiskContentNotIn(List<String> values) {
            addCriterion("risk_content not in", values, "riskContent");
            return (Criteria) this;
        }

        public Criteria andRiskContentBetween(String value1, String value2) {
            addCriterion("risk_content between", value1, value2, "riskContent");
            return (Criteria) this;
        }

        public Criteria andRiskContentNotBetween(String value1, String value2) {
            addCriterion("risk_content not between", value1, value2, "riskContent");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNull() {
            addCriterion("risk_level is null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNotNull() {
            addCriterion("risk_level is not null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelEqualTo(Integer value) {
            addCriterion("risk_level =", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotEqualTo(Integer value) {
            addCriterion("risk_level <>", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThan(Integer value) {
            addCriterion("risk_level >", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("risk_level >=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThan(Integer value) {
            addCriterion("risk_level <", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThanOrEqualTo(Integer value) {
            addCriterion("risk_level <=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIn(List<Integer> values) {
            addCriterion("risk_level in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotIn(List<Integer> values) {
            addCriterion("risk_level not in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelBetween(Integer value1, Integer value2) {
            addCriterion("risk_level between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("risk_level not between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoScoreIsNull() {
            addCriterion("companyinfo_score is null");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoScoreIsNotNull() {
            addCriterion("companyinfo_score is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoScoreEqualTo(Double value) {
            addCriterion("companyinfo_score =", value, "companyinfoScore");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoScoreNotEqualTo(Double value) {
            addCriterion("companyinfo_score <>", value, "companyinfoScore");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoScoreGreaterThan(Double value) {
            addCriterion("companyinfo_score >", value, "companyinfoScore");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("companyinfo_score >=", value, "companyinfoScore");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoScoreLessThan(Double value) {
            addCriterion("companyinfo_score <", value, "companyinfoScore");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoScoreLessThanOrEqualTo(Double value) {
            addCriterion("companyinfo_score <=", value, "companyinfoScore");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoScoreIn(List<Double> values) {
            addCriterion("companyinfo_score in", values, "companyinfoScore");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoScoreNotIn(List<Double> values) {
            addCriterion("companyinfo_score not in", values, "companyinfoScore");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoScoreBetween(Double value1, Double value2) {
            addCriterion("companyinfo_score between", value1, value2, "companyinfoScore");
            return (Criteria) this;
        }

        public Criteria andCompanyinfoScoreNotBetween(Double value1, Double value2) {
            addCriterion("companyinfo_score not between", value1, value2, "companyinfoScore");
            return (Criteria) this;
        }

        public Criteria andFinancialScoreIsNull() {
            addCriterion("financial_score is null");
            return (Criteria) this;
        }

        public Criteria andFinancialScoreIsNotNull() {
            addCriterion("financial_score is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialScoreEqualTo(Double value) {
            addCriterion("financial_score =", value, "financialScore");
            return (Criteria) this;
        }

        public Criteria andFinancialScoreNotEqualTo(Double value) {
            addCriterion("financial_score <>", value, "financialScore");
            return (Criteria) this;
        }

        public Criteria andFinancialScoreGreaterThan(Double value) {
            addCriterion("financial_score >", value, "financialScore");
            return (Criteria) this;
        }

        public Criteria andFinancialScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("financial_score >=", value, "financialScore");
            return (Criteria) this;
        }

        public Criteria andFinancialScoreLessThan(Double value) {
            addCriterion("financial_score <", value, "financialScore");
            return (Criteria) this;
        }

        public Criteria andFinancialScoreLessThanOrEqualTo(Double value) {
            addCriterion("financial_score <=", value, "financialScore");
            return (Criteria) this;
        }

        public Criteria andFinancialScoreIn(List<Double> values) {
            addCriterion("financial_score in", values, "financialScore");
            return (Criteria) this;
        }

        public Criteria andFinancialScoreNotIn(List<Double> values) {
            addCriterion("financial_score not in", values, "financialScore");
            return (Criteria) this;
        }

        public Criteria andFinancialScoreBetween(Double value1, Double value2) {
            addCriterion("financial_score between", value1, value2, "financialScore");
            return (Criteria) this;
        }

        public Criteria andFinancialScoreNotBetween(Double value1, Double value2) {
            addCriterion("financial_score not between", value1, value2, "financialScore");
            return (Criteria) this;
        }

        public Criteria andKnowledgeScoreIsNull() {
            addCriterion("knowledge_score is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeScoreIsNotNull() {
            addCriterion("knowledge_score is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeScoreEqualTo(Double value) {
            addCriterion("knowledge_score =", value, "knowledgeScore");
            return (Criteria) this;
        }

        public Criteria andKnowledgeScoreNotEqualTo(Double value) {
            addCriterion("knowledge_score <>", value, "knowledgeScore");
            return (Criteria) this;
        }

        public Criteria andKnowledgeScoreGreaterThan(Double value) {
            addCriterion("knowledge_score >", value, "knowledgeScore");
            return (Criteria) this;
        }

        public Criteria andKnowledgeScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("knowledge_score >=", value, "knowledgeScore");
            return (Criteria) this;
        }

        public Criteria andKnowledgeScoreLessThan(Double value) {
            addCriterion("knowledge_score <", value, "knowledgeScore");
            return (Criteria) this;
        }

        public Criteria andKnowledgeScoreLessThanOrEqualTo(Double value) {
            addCriterion("knowledge_score <=", value, "knowledgeScore");
            return (Criteria) this;
        }

        public Criteria andKnowledgeScoreIn(List<Double> values) {
            addCriterion("knowledge_score in", values, "knowledgeScore");
            return (Criteria) this;
        }

        public Criteria andKnowledgeScoreNotIn(List<Double> values) {
            addCriterion("knowledge_score not in", values, "knowledgeScore");
            return (Criteria) this;
        }

        public Criteria andKnowledgeScoreBetween(Double value1, Double value2) {
            addCriterion("knowledge_score between", value1, value2, "knowledgeScore");
            return (Criteria) this;
        }

        public Criteria andKnowledgeScoreNotBetween(Double value1, Double value2) {
            addCriterion("knowledge_score not between", value1, value2, "knowledgeScore");
            return (Criteria) this;
        }

        public Criteria andInvestTargetScoreIsNull() {
            addCriterion("invest_target_score is null");
            return (Criteria) this;
        }

        public Criteria andInvestTargetScoreIsNotNull() {
            addCriterion("invest_target_score is not null");
            return (Criteria) this;
        }

        public Criteria andInvestTargetScoreEqualTo(Double value) {
            addCriterion("invest_target_score =", value, "investTargetScore");
            return (Criteria) this;
        }

        public Criteria andInvestTargetScoreNotEqualTo(Double value) {
            addCriterion("invest_target_score <>", value, "investTargetScore");
            return (Criteria) this;
        }

        public Criteria andInvestTargetScoreGreaterThan(Double value) {
            addCriterion("invest_target_score >", value, "investTargetScore");
            return (Criteria) this;
        }

        public Criteria andInvestTargetScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("invest_target_score >=", value, "investTargetScore");
            return (Criteria) this;
        }

        public Criteria andInvestTargetScoreLessThan(Double value) {
            addCriterion("invest_target_score <", value, "investTargetScore");
            return (Criteria) this;
        }

        public Criteria andInvestTargetScoreLessThanOrEqualTo(Double value) {
            addCriterion("invest_target_score <=", value, "investTargetScore");
            return (Criteria) this;
        }

        public Criteria andInvestTargetScoreIn(List<Double> values) {
            addCriterion("invest_target_score in", values, "investTargetScore");
            return (Criteria) this;
        }

        public Criteria andInvestTargetScoreNotIn(List<Double> values) {
            addCriterion("invest_target_score not in", values, "investTargetScore");
            return (Criteria) this;
        }

        public Criteria andInvestTargetScoreBetween(Double value1, Double value2) {
            addCriterion("invest_target_score between", value1, value2, "investTargetScore");
            return (Criteria) this;
        }

        public Criteria andInvestTargetScoreNotBetween(Double value1, Double value2) {
            addCriterion("invest_target_score not between", value1, value2, "investTargetScore");
            return (Criteria) this;
        }

        public Criteria andRistPreferenceScoreIsNull() {
            addCriterion("rist_preference_score is null");
            return (Criteria) this;
        }

        public Criteria andRistPreferenceScoreIsNotNull() {
            addCriterion("rist_preference_score is not null");
            return (Criteria) this;
        }

        public Criteria andRistPreferenceScoreEqualTo(Double value) {
            addCriterion("rist_preference_score =", value, "ristPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andRistPreferenceScoreNotEqualTo(Double value) {
            addCriterion("rist_preference_score <>", value, "ristPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andRistPreferenceScoreGreaterThan(Double value) {
            addCriterion("rist_preference_score >", value, "ristPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andRistPreferenceScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("rist_preference_score >=", value, "ristPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andRistPreferenceScoreLessThan(Double value) {
            addCriterion("rist_preference_score <", value, "ristPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andRistPreferenceScoreLessThanOrEqualTo(Double value) {
            addCriterion("rist_preference_score <=", value, "ristPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andRistPreferenceScoreIn(List<Double> values) {
            addCriterion("rist_preference_score in", values, "ristPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andRistPreferenceScoreNotIn(List<Double> values) {
            addCriterion("rist_preference_score not in", values, "ristPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andRistPreferenceScoreBetween(Double value1, Double value2) {
            addCriterion("rist_preference_score between", value1, value2, "ristPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andRistPreferenceScoreNotBetween(Double value1, Double value2) {
            addCriterion("rist_preference_score not between", value1, value2, "ristPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNull() {
            addCriterion("total_score is null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNotNull() {
            addCriterion("total_score is not null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreEqualTo(Double value) {
            addCriterion("total_score =", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotEqualTo(Double value) {
            addCriterion("total_score <>", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThan(Double value) {
            addCriterion("total_score >", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("total_score >=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThan(Double value) {
            addCriterion("total_score <", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThanOrEqualTo(Double value) {
            addCriterion("total_score <=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIn(List<Double> values) {
            addCriterion("total_score in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotIn(List<Double> values) {
            addCriterion("total_score not in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreBetween(Double value1, Double value2) {
            addCriterion("total_score between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotBetween(Double value1, Double value2) {
            addCriterion("total_score not between", value1, value2, "totalScore");
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