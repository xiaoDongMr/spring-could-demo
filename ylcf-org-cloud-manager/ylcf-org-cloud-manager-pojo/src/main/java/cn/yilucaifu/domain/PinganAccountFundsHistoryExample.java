package cn.yilucaifu.domain;

import java.util.ArrayList;
import java.util.List;

public class PinganAccountFundsHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PinganAccountFundsHistoryExample() {
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

        public Criteria andAppsheetserialnoIsNull() {
            addCriterion("appsheetserialno is null");
            return (Criteria) this;
        }

        public Criteria andAppsheetserialnoIsNotNull() {
            addCriterion("appsheetserialno is not null");
            return (Criteria) this;
        }

        public Criteria andAppsheetserialnoEqualTo(String value) {
            addCriterion("appsheetserialno =", value, "appsheetserialno");
            return (Criteria) this;
        }

        public Criteria andAppsheetserialnoNotEqualTo(String value) {
            addCriterion("appsheetserialno <>", value, "appsheetserialno");
            return (Criteria) this;
        }

        public Criteria andAppsheetserialnoGreaterThan(String value) {
            addCriterion("appsheetserialno >", value, "appsheetserialno");
            return (Criteria) this;
        }

        public Criteria andAppsheetserialnoGreaterThanOrEqualTo(String value) {
            addCriterion("appsheetserialno >=", value, "appsheetserialno");
            return (Criteria) this;
        }

        public Criteria andAppsheetserialnoLessThan(String value) {
            addCriterion("appsheetserialno <", value, "appsheetserialno");
            return (Criteria) this;
        }

        public Criteria andAppsheetserialnoLessThanOrEqualTo(String value) {
            addCriterion("appsheetserialno <=", value, "appsheetserialno");
            return (Criteria) this;
        }

        public Criteria andAppsheetserialnoLike(String value) {
            addCriterion("appsheetserialno like", value, "appsheetserialno");
            return (Criteria) this;
        }

        public Criteria andAppsheetserialnoNotLike(String value) {
            addCriterion("appsheetserialno not like", value, "appsheetserialno");
            return (Criteria) this;
        }

        public Criteria andAppsheetserialnoIn(List<String> values) {
            addCriterion("appsheetserialno in", values, "appsheetserialno");
            return (Criteria) this;
        }

        public Criteria andAppsheetserialnoNotIn(List<String> values) {
            addCriterion("appsheetserialno not in", values, "appsheetserialno");
            return (Criteria) this;
        }

        public Criteria andAppsheetserialnoBetween(String value1, String value2) {
            addCriterion("appsheetserialno between", value1, value2, "appsheetserialno");
            return (Criteria) this;
        }

        public Criteria andAppsheetserialnoNotBetween(String value1, String value2) {
            addCriterion("appsheetserialno not between", value1, value2, "appsheetserialno");
            return (Criteria) this;
        }

        public Criteria andDepositacctIsNull() {
            addCriterion("depositacct is null");
            return (Criteria) this;
        }

        public Criteria andDepositacctIsNotNull() {
            addCriterion("depositacct is not null");
            return (Criteria) this;
        }

        public Criteria andDepositacctEqualTo(String value) {
            addCriterion("depositacct =", value, "depositacct");
            return (Criteria) this;
        }

        public Criteria andDepositacctNotEqualTo(String value) {
            addCriterion("depositacct <>", value, "depositacct");
            return (Criteria) this;
        }

        public Criteria andDepositacctGreaterThan(String value) {
            addCriterion("depositacct >", value, "depositacct");
            return (Criteria) this;
        }

        public Criteria andDepositacctGreaterThanOrEqualTo(String value) {
            addCriterion("depositacct >=", value, "depositacct");
            return (Criteria) this;
        }

        public Criteria andDepositacctLessThan(String value) {
            addCriterion("depositacct <", value, "depositacct");
            return (Criteria) this;
        }

        public Criteria andDepositacctLessThanOrEqualTo(String value) {
            addCriterion("depositacct <=", value, "depositacct");
            return (Criteria) this;
        }

        public Criteria andDepositacctLike(String value) {
            addCriterion("depositacct like", value, "depositacct");
            return (Criteria) this;
        }

        public Criteria andDepositacctNotLike(String value) {
            addCriterion("depositacct not like", value, "depositacct");
            return (Criteria) this;
        }

        public Criteria andDepositacctIn(List<String> values) {
            addCriterion("depositacct in", values, "depositacct");
            return (Criteria) this;
        }

        public Criteria andDepositacctNotIn(List<String> values) {
            addCriterion("depositacct not in", values, "depositacct");
            return (Criteria) this;
        }

        public Criteria andDepositacctBetween(String value1, String value2) {
            addCriterion("depositacct between", value1, value2, "depositacct");
            return (Criteria) this;
        }

        public Criteria andDepositacctNotBetween(String value1, String value2) {
            addCriterion("depositacct not between", value1, value2, "depositacct");
            return (Criteria) this;
        }

        public Criteria andTransactionaccountidIsNull() {
            addCriterion("transactionaccountid is null");
            return (Criteria) this;
        }

        public Criteria andTransactionaccountidIsNotNull() {
            addCriterion("transactionaccountid is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionaccountidEqualTo(String value) {
            addCriterion("transactionaccountid =", value, "transactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTransactionaccountidNotEqualTo(String value) {
            addCriterion("transactionaccountid <>", value, "transactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTransactionaccountidGreaterThan(String value) {
            addCriterion("transactionaccountid >", value, "transactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTransactionaccountidGreaterThanOrEqualTo(String value) {
            addCriterion("transactionaccountid >=", value, "transactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTransactionaccountidLessThan(String value) {
            addCriterion("transactionaccountid <", value, "transactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTransactionaccountidLessThanOrEqualTo(String value) {
            addCriterion("transactionaccountid <=", value, "transactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTransactionaccountidLike(String value) {
            addCriterion("transactionaccountid like", value, "transactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTransactionaccountidNotLike(String value) {
            addCriterion("transactionaccountid not like", value, "transactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTransactionaccountidIn(List<String> values) {
            addCriterion("transactionaccountid in", values, "transactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTransactionaccountidNotIn(List<String> values) {
            addCriterion("transactionaccountid not in", values, "transactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTransactionaccountidBetween(String value1, String value2) {
            addCriterion("transactionaccountid between", value1, value2, "transactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTransactionaccountidNotBetween(String value1, String value2) {
            addCriterion("transactionaccountid not between", value1, value2, "transactionaccountid");
            return (Criteria) this;
        }

        public Criteria andFundcodeIsNull() {
            addCriterion("fundcode is null");
            return (Criteria) this;
        }

        public Criteria andFundcodeIsNotNull() {
            addCriterion("fundcode is not null");
            return (Criteria) this;
        }

        public Criteria andFundcodeEqualTo(String value) {
            addCriterion("fundcode =", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeNotEqualTo(String value) {
            addCriterion("fundcode <>", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeGreaterThan(String value) {
            addCriterion("fundcode >", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeGreaterThanOrEqualTo(String value) {
            addCriterion("fundcode >=", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeLessThan(String value) {
            addCriterion("fundcode <", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeLessThanOrEqualTo(String value) {
            addCriterion("fundcode <=", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeLike(String value) {
            addCriterion("fundcode like", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeNotLike(String value) {
            addCriterion("fundcode not like", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeIn(List<String> values) {
            addCriterion("fundcode in", values, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeNotIn(List<String> values) {
            addCriterion("fundcode not in", values, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeBetween(String value1, String value2) {
            addCriterion("fundcode between", value1, value2, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeNotBetween(String value1, String value2) {
            addCriterion("fundcode not between", value1, value2, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundnameIsNull() {
            addCriterion("fundname is null");
            return (Criteria) this;
        }

        public Criteria andFundnameIsNotNull() {
            addCriterion("fundname is not null");
            return (Criteria) this;
        }

        public Criteria andFundnameEqualTo(String value) {
            addCriterion("fundname =", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameNotEqualTo(String value) {
            addCriterion("fundname <>", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameGreaterThan(String value) {
            addCriterion("fundname >", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameGreaterThanOrEqualTo(String value) {
            addCriterion("fundname >=", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameLessThan(String value) {
            addCriterion("fundname <", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameLessThanOrEqualTo(String value) {
            addCriterion("fundname <=", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameLike(String value) {
            addCriterion("fundname like", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameNotLike(String value) {
            addCriterion("fundname not like", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameIn(List<String> values) {
            addCriterion("fundname in", values, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameNotIn(List<String> values) {
            addCriterion("fundname not in", values, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameBetween(String value1, String value2) {
            addCriterion("fundname between", value1, value2, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameNotBetween(String value1, String value2) {
            addCriterion("fundname not between", value1, value2, "fundname");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeIsNull() {
            addCriterion("businesscode is null");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeIsNotNull() {
            addCriterion("businesscode is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeEqualTo(String value) {
            addCriterion("businesscode =", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotEqualTo(String value) {
            addCriterion("businesscode <>", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeGreaterThan(String value) {
            addCriterion("businesscode >", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeGreaterThanOrEqualTo(String value) {
            addCriterion("businesscode >=", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeLessThan(String value) {
            addCriterion("businesscode <", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeLessThanOrEqualTo(String value) {
            addCriterion("businesscode <=", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeLike(String value) {
            addCriterion("businesscode like", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotLike(String value) {
            addCriterion("businesscode not like", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeIn(List<String> values) {
            addCriterion("businesscode in", values, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotIn(List<String> values) {
            addCriterion("businesscode not in", values, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeBetween(String value1, String value2) {
            addCriterion("businesscode between", value1, value2, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotBetween(String value1, String value2) {
            addCriterion("businesscode not between", value1, value2, "businesscode");
            return (Criteria) this;
        }

        public Criteria andApplicationamountIsNull() {
            addCriterion("applicationamount is null");
            return (Criteria) this;
        }

        public Criteria andApplicationamountIsNotNull() {
            addCriterion("applicationamount is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationamountEqualTo(String value) {
            addCriterion("applicationamount =", value, "applicationamount");
            return (Criteria) this;
        }

        public Criteria andApplicationamountNotEqualTo(String value) {
            addCriterion("applicationamount <>", value, "applicationamount");
            return (Criteria) this;
        }

        public Criteria andApplicationamountGreaterThan(String value) {
            addCriterion("applicationamount >", value, "applicationamount");
            return (Criteria) this;
        }

        public Criteria andApplicationamountGreaterThanOrEqualTo(String value) {
            addCriterion("applicationamount >=", value, "applicationamount");
            return (Criteria) this;
        }

        public Criteria andApplicationamountLessThan(String value) {
            addCriterion("applicationamount <", value, "applicationamount");
            return (Criteria) this;
        }

        public Criteria andApplicationamountLessThanOrEqualTo(String value) {
            addCriterion("applicationamount <=", value, "applicationamount");
            return (Criteria) this;
        }

        public Criteria andApplicationamountLike(String value) {
            addCriterion("applicationamount like", value, "applicationamount");
            return (Criteria) this;
        }

        public Criteria andApplicationamountNotLike(String value) {
            addCriterion("applicationamount not like", value, "applicationamount");
            return (Criteria) this;
        }

        public Criteria andApplicationamountIn(List<String> values) {
            addCriterion("applicationamount in", values, "applicationamount");
            return (Criteria) this;
        }

        public Criteria andApplicationamountNotIn(List<String> values) {
            addCriterion("applicationamount not in", values, "applicationamount");
            return (Criteria) this;
        }

        public Criteria andApplicationamountBetween(String value1, String value2) {
            addCriterion("applicationamount between", value1, value2, "applicationamount");
            return (Criteria) this;
        }

        public Criteria andApplicationamountNotBetween(String value1, String value2) {
            addCriterion("applicationamount not between", value1, value2, "applicationamount");
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

        public Criteria andConfirmedamountIsNull() {
            addCriterion("confirmedamount is null");
            return (Criteria) this;
        }

        public Criteria andConfirmedamountIsNotNull() {
            addCriterion("confirmedamount is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmedamountEqualTo(String value) {
            addCriterion("confirmedamount =", value, "confirmedamount");
            return (Criteria) this;
        }

        public Criteria andConfirmedamountNotEqualTo(String value) {
            addCriterion("confirmedamount <>", value, "confirmedamount");
            return (Criteria) this;
        }

        public Criteria andConfirmedamountGreaterThan(String value) {
            addCriterion("confirmedamount >", value, "confirmedamount");
            return (Criteria) this;
        }

        public Criteria andConfirmedamountGreaterThanOrEqualTo(String value) {
            addCriterion("confirmedamount >=", value, "confirmedamount");
            return (Criteria) this;
        }

        public Criteria andConfirmedamountLessThan(String value) {
            addCriterion("confirmedamount <", value, "confirmedamount");
            return (Criteria) this;
        }

        public Criteria andConfirmedamountLessThanOrEqualTo(String value) {
            addCriterion("confirmedamount <=", value, "confirmedamount");
            return (Criteria) this;
        }

        public Criteria andConfirmedamountLike(String value) {
            addCriterion("confirmedamount like", value, "confirmedamount");
            return (Criteria) this;
        }

        public Criteria andConfirmedamountNotLike(String value) {
            addCriterion("confirmedamount not like", value, "confirmedamount");
            return (Criteria) this;
        }

        public Criteria andConfirmedamountIn(List<String> values) {
            addCriterion("confirmedamount in", values, "confirmedamount");
            return (Criteria) this;
        }

        public Criteria andConfirmedamountNotIn(List<String> values) {
            addCriterion("confirmedamount not in", values, "confirmedamount");
            return (Criteria) this;
        }

        public Criteria andConfirmedamountBetween(String value1, String value2) {
            addCriterion("confirmedamount between", value1, value2, "confirmedamount");
            return (Criteria) this;
        }

        public Criteria andConfirmedamountNotBetween(String value1, String value2) {
            addCriterion("confirmedamount not between", value1, value2, "confirmedamount");
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

        public Criteria andApplystnameIsNull() {
            addCriterion("applystname is null");
            return (Criteria) this;
        }

        public Criteria andApplystnameIsNotNull() {
            addCriterion("applystname is not null");
            return (Criteria) this;
        }

        public Criteria andApplystnameEqualTo(String value) {
            addCriterion("applystname =", value, "applystname");
            return (Criteria) this;
        }

        public Criteria andApplystnameNotEqualTo(String value) {
            addCriterion("applystname <>", value, "applystname");
            return (Criteria) this;
        }

        public Criteria andApplystnameGreaterThan(String value) {
            addCriterion("applystname >", value, "applystname");
            return (Criteria) this;
        }

        public Criteria andApplystnameGreaterThanOrEqualTo(String value) {
            addCriterion("applystname >=", value, "applystname");
            return (Criteria) this;
        }

        public Criteria andApplystnameLessThan(String value) {
            addCriterion("applystname <", value, "applystname");
            return (Criteria) this;
        }

        public Criteria andApplystnameLessThanOrEqualTo(String value) {
            addCriterion("applystname <=", value, "applystname");
            return (Criteria) this;
        }

        public Criteria andApplystnameLike(String value) {
            addCriterion("applystname like", value, "applystname");
            return (Criteria) this;
        }

        public Criteria andApplystnameNotLike(String value) {
            addCriterion("applystname not like", value, "applystname");
            return (Criteria) this;
        }

        public Criteria andApplystnameIn(List<String> values) {
            addCriterion("applystname in", values, "applystname");
            return (Criteria) this;
        }

        public Criteria andApplystnameNotIn(List<String> values) {
            addCriterion("applystname not in", values, "applystname");
            return (Criteria) this;
        }

        public Criteria andApplystnameBetween(String value1, String value2) {
            addCriterion("applystname between", value1, value2, "applystname");
            return (Criteria) this;
        }

        public Criteria andApplystnameNotBetween(String value1, String value2) {
            addCriterion("applystname not between", value1, value2, "applystname");
            return (Criteria) this;
        }

        public Criteria andTransactiondateIsNull() {
            addCriterion("transactiondate is null");
            return (Criteria) this;
        }

        public Criteria andTransactiondateIsNotNull() {
            addCriterion("transactiondate is not null");
            return (Criteria) this;
        }

        public Criteria andTransactiondateEqualTo(String value) {
            addCriterion("transactiondate =", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotEqualTo(String value) {
            addCriterion("transactiondate <>", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateGreaterThan(String value) {
            addCriterion("transactiondate >", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateGreaterThanOrEqualTo(String value) {
            addCriterion("transactiondate >=", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateLessThan(String value) {
            addCriterion("transactiondate <", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateLessThanOrEqualTo(String value) {
            addCriterion("transactiondate <=", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateLike(String value) {
            addCriterion("transactiondate like", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotLike(String value) {
            addCriterion("transactiondate not like", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateIn(List<String> values) {
            addCriterion("transactiondate in", values, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotIn(List<String> values) {
            addCriterion("transactiondate not in", values, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateBetween(String value1, String value2) {
            addCriterion("transactiondate between", value1, value2, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotBetween(String value1, String value2) {
            addCriterion("transactiondate not between", value1, value2, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactioncfmdateIsNull() {
            addCriterion("transactioncfmdate is null");
            return (Criteria) this;
        }

        public Criteria andTransactioncfmdateIsNotNull() {
            addCriterion("transactioncfmdate is not null");
            return (Criteria) this;
        }

        public Criteria andTransactioncfmdateEqualTo(String value) {
            addCriterion("transactioncfmdate =", value, "transactioncfmdate");
            return (Criteria) this;
        }

        public Criteria andTransactioncfmdateNotEqualTo(String value) {
            addCriterion("transactioncfmdate <>", value, "transactioncfmdate");
            return (Criteria) this;
        }

        public Criteria andTransactioncfmdateGreaterThan(String value) {
            addCriterion("transactioncfmdate >", value, "transactioncfmdate");
            return (Criteria) this;
        }

        public Criteria andTransactioncfmdateGreaterThanOrEqualTo(String value) {
            addCriterion("transactioncfmdate >=", value, "transactioncfmdate");
            return (Criteria) this;
        }

        public Criteria andTransactioncfmdateLessThan(String value) {
            addCriterion("transactioncfmdate <", value, "transactioncfmdate");
            return (Criteria) this;
        }

        public Criteria andTransactioncfmdateLessThanOrEqualTo(String value) {
            addCriterion("transactioncfmdate <=", value, "transactioncfmdate");
            return (Criteria) this;
        }

        public Criteria andTransactioncfmdateLike(String value) {
            addCriterion("transactioncfmdate like", value, "transactioncfmdate");
            return (Criteria) this;
        }

        public Criteria andTransactioncfmdateNotLike(String value) {
            addCriterion("transactioncfmdate not like", value, "transactioncfmdate");
            return (Criteria) this;
        }

        public Criteria andTransactioncfmdateIn(List<String> values) {
            addCriterion("transactioncfmdate in", values, "transactioncfmdate");
            return (Criteria) this;
        }

        public Criteria andTransactioncfmdateNotIn(List<String> values) {
            addCriterion("transactioncfmdate not in", values, "transactioncfmdate");
            return (Criteria) this;
        }

        public Criteria andTransactioncfmdateBetween(String value1, String value2) {
            addCriterion("transactioncfmdate between", value1, value2, "transactioncfmdate");
            return (Criteria) this;
        }

        public Criteria andTransactioncfmdateNotBetween(String value1, String value2) {
            addCriterion("transactioncfmdate not between", value1, value2, "transactioncfmdate");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIsNull() {
            addCriterion("businessname is null");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIsNotNull() {
            addCriterion("businessname is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessnameEqualTo(String value) {
            addCriterion("businessname =", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotEqualTo(String value) {
            addCriterion("businessname <>", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameGreaterThan(String value) {
            addCriterion("businessname >", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameGreaterThanOrEqualTo(String value) {
            addCriterion("businessname >=", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLessThan(String value) {
            addCriterion("businessname <", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLessThanOrEqualTo(String value) {
            addCriterion("businessname <=", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLike(String value) {
            addCriterion("businessname like", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotLike(String value) {
            addCriterion("businessname not like", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIn(List<String> values) {
            addCriterion("businessname in", values, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotIn(List<String> values) {
            addCriterion("businessname not in", values, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameBetween(String value1, String value2) {
            addCriterion("businessname between", value1, value2, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotBetween(String value1, String value2) {
            addCriterion("businessname not between", value1, value2, "businessname");
            return (Criteria) this;
        }

        public Criteria andCodeoftargetfundIsNull() {
            addCriterion("codeoftargetfund is null");
            return (Criteria) this;
        }

        public Criteria andCodeoftargetfundIsNotNull() {
            addCriterion("codeoftargetfund is not null");
            return (Criteria) this;
        }

        public Criteria andCodeoftargetfundEqualTo(String value) {
            addCriterion("codeoftargetfund =", value, "codeoftargetfund");
            return (Criteria) this;
        }

        public Criteria andCodeoftargetfundNotEqualTo(String value) {
            addCriterion("codeoftargetfund <>", value, "codeoftargetfund");
            return (Criteria) this;
        }

        public Criteria andCodeoftargetfundGreaterThan(String value) {
            addCriterion("codeoftargetfund >", value, "codeoftargetfund");
            return (Criteria) this;
        }

        public Criteria andCodeoftargetfundGreaterThanOrEqualTo(String value) {
            addCriterion("codeoftargetfund >=", value, "codeoftargetfund");
            return (Criteria) this;
        }

        public Criteria andCodeoftargetfundLessThan(String value) {
            addCriterion("codeoftargetfund <", value, "codeoftargetfund");
            return (Criteria) this;
        }

        public Criteria andCodeoftargetfundLessThanOrEqualTo(String value) {
            addCriterion("codeoftargetfund <=", value, "codeoftargetfund");
            return (Criteria) this;
        }

        public Criteria andCodeoftargetfundLike(String value) {
            addCriterion("codeoftargetfund like", value, "codeoftargetfund");
            return (Criteria) this;
        }

        public Criteria andCodeoftargetfundNotLike(String value) {
            addCriterion("codeoftargetfund not like", value, "codeoftargetfund");
            return (Criteria) this;
        }

        public Criteria andCodeoftargetfundIn(List<String> values) {
            addCriterion("codeoftargetfund in", values, "codeoftargetfund");
            return (Criteria) this;
        }

        public Criteria andCodeoftargetfundNotIn(List<String> values) {
            addCriterion("codeoftargetfund not in", values, "codeoftargetfund");
            return (Criteria) this;
        }

        public Criteria andCodeoftargetfundBetween(String value1, String value2) {
            addCriterion("codeoftargetfund between", value1, value2, "codeoftargetfund");
            return (Criteria) this;
        }

        public Criteria andCodeoftargetfundNotBetween(String value1, String value2) {
            addCriterion("codeoftargetfund not between", value1, value2, "codeoftargetfund");
            return (Criteria) this;
        }

        public Criteria andNameoftargetfundIsNull() {
            addCriterion("nameoftargetfund is null");
            return (Criteria) this;
        }

        public Criteria andNameoftargetfundIsNotNull() {
            addCriterion("nameoftargetfund is not null");
            return (Criteria) this;
        }

        public Criteria andNameoftargetfundEqualTo(String value) {
            addCriterion("nameoftargetfund =", value, "nameoftargetfund");
            return (Criteria) this;
        }

        public Criteria andNameoftargetfundNotEqualTo(String value) {
            addCriterion("nameoftargetfund <>", value, "nameoftargetfund");
            return (Criteria) this;
        }

        public Criteria andNameoftargetfundGreaterThan(String value) {
            addCriterion("nameoftargetfund >", value, "nameoftargetfund");
            return (Criteria) this;
        }

        public Criteria andNameoftargetfundGreaterThanOrEqualTo(String value) {
            addCriterion("nameoftargetfund >=", value, "nameoftargetfund");
            return (Criteria) this;
        }

        public Criteria andNameoftargetfundLessThan(String value) {
            addCriterion("nameoftargetfund <", value, "nameoftargetfund");
            return (Criteria) this;
        }

        public Criteria andNameoftargetfundLessThanOrEqualTo(String value) {
            addCriterion("nameoftargetfund <=", value, "nameoftargetfund");
            return (Criteria) this;
        }

        public Criteria andNameoftargetfundLike(String value) {
            addCriterion("nameoftargetfund like", value, "nameoftargetfund");
            return (Criteria) this;
        }

        public Criteria andNameoftargetfundNotLike(String value) {
            addCriterion("nameoftargetfund not like", value, "nameoftargetfund");
            return (Criteria) this;
        }

        public Criteria andNameoftargetfundIn(List<String> values) {
            addCriterion("nameoftargetfund in", values, "nameoftargetfund");
            return (Criteria) this;
        }

        public Criteria andNameoftargetfundNotIn(List<String> values) {
            addCriterion("nameoftargetfund not in", values, "nameoftargetfund");
            return (Criteria) this;
        }

        public Criteria andNameoftargetfundBetween(String value1, String value2) {
            addCriterion("nameoftargetfund between", value1, value2, "nameoftargetfund");
            return (Criteria) this;
        }

        public Criteria andNameoftargetfundNotBetween(String value1, String value2) {
            addCriterion("nameoftargetfund not between", value1, value2, "nameoftargetfund");
            return (Criteria) this;
        }

        public Criteria andTargetdistributorcodeIsNull() {
            addCriterion("targetdistributorcode is null");
            return (Criteria) this;
        }

        public Criteria andTargetdistributorcodeIsNotNull() {
            addCriterion("targetdistributorcode is not null");
            return (Criteria) this;
        }

        public Criteria andTargetdistributorcodeEqualTo(String value) {
            addCriterion("targetdistributorcode =", value, "targetdistributorcode");
            return (Criteria) this;
        }

        public Criteria andTargetdistributorcodeNotEqualTo(String value) {
            addCriterion("targetdistributorcode <>", value, "targetdistributorcode");
            return (Criteria) this;
        }

        public Criteria andTargetdistributorcodeGreaterThan(String value) {
            addCriterion("targetdistributorcode >", value, "targetdistributorcode");
            return (Criteria) this;
        }

        public Criteria andTargetdistributorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("targetdistributorcode >=", value, "targetdistributorcode");
            return (Criteria) this;
        }

        public Criteria andTargetdistributorcodeLessThan(String value) {
            addCriterion("targetdistributorcode <", value, "targetdistributorcode");
            return (Criteria) this;
        }

        public Criteria andTargetdistributorcodeLessThanOrEqualTo(String value) {
            addCriterion("targetdistributorcode <=", value, "targetdistributorcode");
            return (Criteria) this;
        }

        public Criteria andTargetdistributorcodeLike(String value) {
            addCriterion("targetdistributorcode like", value, "targetdistributorcode");
            return (Criteria) this;
        }

        public Criteria andTargetdistributorcodeNotLike(String value) {
            addCriterion("targetdistributorcode not like", value, "targetdistributorcode");
            return (Criteria) this;
        }

        public Criteria andTargetdistributorcodeIn(List<String> values) {
            addCriterion("targetdistributorcode in", values, "targetdistributorcode");
            return (Criteria) this;
        }

        public Criteria andTargetdistributorcodeNotIn(List<String> values) {
            addCriterion("targetdistributorcode not in", values, "targetdistributorcode");
            return (Criteria) this;
        }

        public Criteria andTargetdistributorcodeBetween(String value1, String value2) {
            addCriterion("targetdistributorcode between", value1, value2, "targetdistributorcode");
            return (Criteria) this;
        }

        public Criteria andTargetdistributorcodeNotBetween(String value1, String value2) {
            addCriterion("targetdistributorcode not between", value1, value2, "targetdistributorcode");
            return (Criteria) this;
        }

        public Criteria andTargetdistributornameIsNull() {
            addCriterion("targetdistributorname is null");
            return (Criteria) this;
        }

        public Criteria andTargetdistributornameIsNotNull() {
            addCriterion("targetdistributorname is not null");
            return (Criteria) this;
        }

        public Criteria andTargetdistributornameEqualTo(String value) {
            addCriterion("targetdistributorname =", value, "targetdistributorname");
            return (Criteria) this;
        }

        public Criteria andTargetdistributornameNotEqualTo(String value) {
            addCriterion("targetdistributorname <>", value, "targetdistributorname");
            return (Criteria) this;
        }

        public Criteria andTargetdistributornameGreaterThan(String value) {
            addCriterion("targetdistributorname >", value, "targetdistributorname");
            return (Criteria) this;
        }

        public Criteria andTargetdistributornameGreaterThanOrEqualTo(String value) {
            addCriterion("targetdistributorname >=", value, "targetdistributorname");
            return (Criteria) this;
        }

        public Criteria andTargetdistributornameLessThan(String value) {
            addCriterion("targetdistributorname <", value, "targetdistributorname");
            return (Criteria) this;
        }

        public Criteria andTargetdistributornameLessThanOrEqualTo(String value) {
            addCriterion("targetdistributorname <=", value, "targetdistributorname");
            return (Criteria) this;
        }

        public Criteria andTargetdistributornameLike(String value) {
            addCriterion("targetdistributorname like", value, "targetdistributorname");
            return (Criteria) this;
        }

        public Criteria andTargetdistributornameNotLike(String value) {
            addCriterion("targetdistributorname not like", value, "targetdistributorname");
            return (Criteria) this;
        }

        public Criteria andTargetdistributornameIn(List<String> values) {
            addCriterion("targetdistributorname in", values, "targetdistributorname");
            return (Criteria) this;
        }

        public Criteria andTargetdistributornameNotIn(List<String> values) {
            addCriterion("targetdistributorname not in", values, "targetdistributorname");
            return (Criteria) this;
        }

        public Criteria andTargetdistributornameBetween(String value1, String value2) {
            addCriterion("targetdistributorname between", value1, value2, "targetdistributorname");
            return (Criteria) this;
        }

        public Criteria andTargetdistributornameNotBetween(String value1, String value2) {
            addCriterion("targetdistributorname not between", value1, value2, "targetdistributorname");
            return (Criteria) this;
        }

        public Criteria andFundriskgradedescIsNull() {
            addCriterion("fundriskgradedesc is null");
            return (Criteria) this;
        }

        public Criteria andFundriskgradedescIsNotNull() {
            addCriterion("fundriskgradedesc is not null");
            return (Criteria) this;
        }

        public Criteria andFundriskgradedescEqualTo(String value) {
            addCriterion("fundriskgradedesc =", value, "fundriskgradedesc");
            return (Criteria) this;
        }

        public Criteria andFundriskgradedescNotEqualTo(String value) {
            addCriterion("fundriskgradedesc <>", value, "fundriskgradedesc");
            return (Criteria) this;
        }

        public Criteria andFundriskgradedescGreaterThan(String value) {
            addCriterion("fundriskgradedesc >", value, "fundriskgradedesc");
            return (Criteria) this;
        }

        public Criteria andFundriskgradedescGreaterThanOrEqualTo(String value) {
            addCriterion("fundriskgradedesc >=", value, "fundriskgradedesc");
            return (Criteria) this;
        }

        public Criteria andFundriskgradedescLessThan(String value) {
            addCriterion("fundriskgradedesc <", value, "fundriskgradedesc");
            return (Criteria) this;
        }

        public Criteria andFundriskgradedescLessThanOrEqualTo(String value) {
            addCriterion("fundriskgradedesc <=", value, "fundriskgradedesc");
            return (Criteria) this;
        }

        public Criteria andFundriskgradedescLike(String value) {
            addCriterion("fundriskgradedesc like", value, "fundriskgradedesc");
            return (Criteria) this;
        }

        public Criteria andFundriskgradedescNotLike(String value) {
            addCriterion("fundriskgradedesc not like", value, "fundriskgradedesc");
            return (Criteria) this;
        }

        public Criteria andFundriskgradedescIn(List<String> values) {
            addCriterion("fundriskgradedesc in", values, "fundriskgradedesc");
            return (Criteria) this;
        }

        public Criteria andFundriskgradedescNotIn(List<String> values) {
            addCriterion("fundriskgradedesc not in", values, "fundriskgradedesc");
            return (Criteria) this;
        }

        public Criteria andFundriskgradedescBetween(String value1, String value2) {
            addCriterion("fundriskgradedesc between", value1, value2, "fundriskgradedesc");
            return (Criteria) this;
        }

        public Criteria andFundriskgradedescNotBetween(String value1, String value2) {
            addCriterion("fundriskgradedesc not between", value1, value2, "fundriskgradedesc");
            return (Criteria) this;
        }

        public Criteria andSummaryiIsNull() {
            addCriterion("summaryi is null");
            return (Criteria) this;
        }

        public Criteria andSummaryiIsNotNull() {
            addCriterion("summaryi is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryiEqualTo(String value) {
            addCriterion("summaryi =", value, "summaryi");
            return (Criteria) this;
        }

        public Criteria andSummaryiNotEqualTo(String value) {
            addCriterion("summaryi <>", value, "summaryi");
            return (Criteria) this;
        }

        public Criteria andSummaryiGreaterThan(String value) {
            addCriterion("summaryi >", value, "summaryi");
            return (Criteria) this;
        }

        public Criteria andSummaryiGreaterThanOrEqualTo(String value) {
            addCriterion("summaryi >=", value, "summaryi");
            return (Criteria) this;
        }

        public Criteria andSummaryiLessThan(String value) {
            addCriterion("summaryi <", value, "summaryi");
            return (Criteria) this;
        }

        public Criteria andSummaryiLessThanOrEqualTo(String value) {
            addCriterion("summaryi <=", value, "summaryi");
            return (Criteria) this;
        }

        public Criteria andSummaryiLike(String value) {
            addCriterion("summaryi like", value, "summaryi");
            return (Criteria) this;
        }

        public Criteria andSummaryiNotLike(String value) {
            addCriterion("summaryi not like", value, "summaryi");
            return (Criteria) this;
        }

        public Criteria andSummaryiIn(List<String> values) {
            addCriterion("summaryi in", values, "summaryi");
            return (Criteria) this;
        }

        public Criteria andSummaryiNotIn(List<String> values) {
            addCriterion("summaryi not in", values, "summaryi");
            return (Criteria) this;
        }

        public Criteria andSummaryiBetween(String value1, String value2) {
            addCriterion("summaryi between", value1, value2, "summaryi");
            return (Criteria) this;
        }

        public Criteria andSummaryiNotBetween(String value1, String value2) {
            addCriterion("summaryi not between", value1, value2, "summaryi");
            return (Criteria) this;
        }

        public Criteria andSpecifyredeemflagIsNull() {
            addCriterion("specifyredeemflag is null");
            return (Criteria) this;
        }

        public Criteria andSpecifyredeemflagIsNotNull() {
            addCriterion("specifyredeemflag is not null");
            return (Criteria) this;
        }

        public Criteria andSpecifyredeemflagEqualTo(String value) {
            addCriterion("specifyredeemflag =", value, "specifyredeemflag");
            return (Criteria) this;
        }

        public Criteria andSpecifyredeemflagNotEqualTo(String value) {
            addCriterion("specifyredeemflag <>", value, "specifyredeemflag");
            return (Criteria) this;
        }

        public Criteria andSpecifyredeemflagGreaterThan(String value) {
            addCriterion("specifyredeemflag >", value, "specifyredeemflag");
            return (Criteria) this;
        }

        public Criteria andSpecifyredeemflagGreaterThanOrEqualTo(String value) {
            addCriterion("specifyredeemflag >=", value, "specifyredeemflag");
            return (Criteria) this;
        }

        public Criteria andSpecifyredeemflagLessThan(String value) {
            addCriterion("specifyredeemflag <", value, "specifyredeemflag");
            return (Criteria) this;
        }

        public Criteria andSpecifyredeemflagLessThanOrEqualTo(String value) {
            addCriterion("specifyredeemflag <=", value, "specifyredeemflag");
            return (Criteria) this;
        }

        public Criteria andSpecifyredeemflagLike(String value) {
            addCriterion("specifyredeemflag like", value, "specifyredeemflag");
            return (Criteria) this;
        }

        public Criteria andSpecifyredeemflagNotLike(String value) {
            addCriterion("specifyredeemflag not like", value, "specifyredeemflag");
            return (Criteria) this;
        }

        public Criteria andSpecifyredeemflagIn(List<String> values) {
            addCriterion("specifyredeemflag in", values, "specifyredeemflag");
            return (Criteria) this;
        }

        public Criteria andSpecifyredeemflagNotIn(List<String> values) {
            addCriterion("specifyredeemflag not in", values, "specifyredeemflag");
            return (Criteria) this;
        }

        public Criteria andSpecifyredeemflagBetween(String value1, String value2) {
            addCriterion("specifyredeemflag between", value1, value2, "specifyredeemflag");
            return (Criteria) this;
        }

        public Criteria andSpecifyredeemflagNotBetween(String value1, String value2) {
            addCriterion("specifyredeemflag not between", value1, value2, "specifyredeemflag");
            return (Criteria) this;
        }

        public Criteria andAcceptmethodIsNull() {
            addCriterion("acceptmethod is null");
            return (Criteria) this;
        }

        public Criteria andAcceptmethodIsNotNull() {
            addCriterion("acceptmethod is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptmethodEqualTo(String value) {
            addCriterion("acceptmethod =", value, "acceptmethod");
            return (Criteria) this;
        }

        public Criteria andAcceptmethodNotEqualTo(String value) {
            addCriterion("acceptmethod <>", value, "acceptmethod");
            return (Criteria) this;
        }

        public Criteria andAcceptmethodGreaterThan(String value) {
            addCriterion("acceptmethod >", value, "acceptmethod");
            return (Criteria) this;
        }

        public Criteria andAcceptmethodGreaterThanOrEqualTo(String value) {
            addCriterion("acceptmethod >=", value, "acceptmethod");
            return (Criteria) this;
        }

        public Criteria andAcceptmethodLessThan(String value) {
            addCriterion("acceptmethod <", value, "acceptmethod");
            return (Criteria) this;
        }

        public Criteria andAcceptmethodLessThanOrEqualTo(String value) {
            addCriterion("acceptmethod <=", value, "acceptmethod");
            return (Criteria) this;
        }

        public Criteria andAcceptmethodLike(String value) {
            addCriterion("acceptmethod like", value, "acceptmethod");
            return (Criteria) this;
        }

        public Criteria andAcceptmethodNotLike(String value) {
            addCriterion("acceptmethod not like", value, "acceptmethod");
            return (Criteria) this;
        }

        public Criteria andAcceptmethodIn(List<String> values) {
            addCriterion("acceptmethod in", values, "acceptmethod");
            return (Criteria) this;
        }

        public Criteria andAcceptmethodNotIn(List<String> values) {
            addCriterion("acceptmethod not in", values, "acceptmethod");
            return (Criteria) this;
        }

        public Criteria andAcceptmethodBetween(String value1, String value2) {
            addCriterion("acceptmethod between", value1, value2, "acceptmethod");
            return (Criteria) this;
        }

        public Criteria andAcceptmethodNotBetween(String value1, String value2) {
            addCriterion("acceptmethod not between", value1, value2, "acceptmethod");
            return (Criteria) this;
        }

        public Criteria andTanoIsNull() {
            addCriterion("tano is null");
            return (Criteria) this;
        }

        public Criteria andTanoIsNotNull() {
            addCriterion("tano is not null");
            return (Criteria) this;
        }

        public Criteria andTanoEqualTo(String value) {
            addCriterion("tano =", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoNotEqualTo(String value) {
            addCriterion("tano <>", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoGreaterThan(String value) {
            addCriterion("tano >", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoGreaterThanOrEqualTo(String value) {
            addCriterion("tano >=", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoLessThan(String value) {
            addCriterion("tano <", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoLessThanOrEqualTo(String value) {
            addCriterion("tano <=", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoLike(String value) {
            addCriterion("tano like", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoNotLike(String value) {
            addCriterion("tano not like", value, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoIn(List<String> values) {
            addCriterion("tano in", values, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoNotIn(List<String> values) {
            addCriterion("tano not in", values, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoBetween(String value1, String value2) {
            addCriterion("tano between", value1, value2, "tano");
            return (Criteria) this;
        }

        public Criteria andTanoNotBetween(String value1, String value2) {
            addCriterion("tano not between", value1, value2, "tano");
            return (Criteria) this;
        }

        public Criteria andTaaccountidIsNull() {
            addCriterion("taaccountid is null");
            return (Criteria) this;
        }

        public Criteria andTaaccountidIsNotNull() {
            addCriterion("taaccountid is not null");
            return (Criteria) this;
        }

        public Criteria andTaaccountidEqualTo(String value) {
            addCriterion("taaccountid =", value, "taaccountid");
            return (Criteria) this;
        }

        public Criteria andTaaccountidNotEqualTo(String value) {
            addCriterion("taaccountid <>", value, "taaccountid");
            return (Criteria) this;
        }

        public Criteria andTaaccountidGreaterThan(String value) {
            addCriterion("taaccountid >", value, "taaccountid");
            return (Criteria) this;
        }

        public Criteria andTaaccountidGreaterThanOrEqualTo(String value) {
            addCriterion("taaccountid >=", value, "taaccountid");
            return (Criteria) this;
        }

        public Criteria andTaaccountidLessThan(String value) {
            addCriterion("taaccountid <", value, "taaccountid");
            return (Criteria) this;
        }

        public Criteria andTaaccountidLessThanOrEqualTo(String value) {
            addCriterion("taaccountid <=", value, "taaccountid");
            return (Criteria) this;
        }

        public Criteria andTaaccountidLike(String value) {
            addCriterion("taaccountid like", value, "taaccountid");
            return (Criteria) this;
        }

        public Criteria andTaaccountidNotLike(String value) {
            addCriterion("taaccountid not like", value, "taaccountid");
            return (Criteria) this;
        }

        public Criteria andTaaccountidIn(List<String> values) {
            addCriterion("taaccountid in", values, "taaccountid");
            return (Criteria) this;
        }

        public Criteria andTaaccountidNotIn(List<String> values) {
            addCriterion("taaccountid not in", values, "taaccountid");
            return (Criteria) this;
        }

        public Criteria andTaaccountidBetween(String value1, String value2) {
            addCriterion("taaccountid between", value1, value2, "taaccountid");
            return (Criteria) this;
        }

        public Criteria andTaaccountidNotBetween(String value1, String value2) {
            addCriterion("taaccountid not between", value1, value2, "taaccountid");
            return (Criteria) this;
        }

        public Criteria andSaveplannoIsNull() {
            addCriterion("saveplanno is null");
            return (Criteria) this;
        }

        public Criteria andSaveplannoIsNotNull() {
            addCriterion("saveplanno is not null");
            return (Criteria) this;
        }

        public Criteria andSaveplannoEqualTo(String value) {
            addCriterion("saveplanno =", value, "saveplanno");
            return (Criteria) this;
        }

        public Criteria andSaveplannoNotEqualTo(String value) {
            addCriterion("saveplanno <>", value, "saveplanno");
            return (Criteria) this;
        }

        public Criteria andSaveplannoGreaterThan(String value) {
            addCriterion("saveplanno >", value, "saveplanno");
            return (Criteria) this;
        }

        public Criteria andSaveplannoGreaterThanOrEqualTo(String value) {
            addCriterion("saveplanno >=", value, "saveplanno");
            return (Criteria) this;
        }

        public Criteria andSaveplannoLessThan(String value) {
            addCriterion("saveplanno <", value, "saveplanno");
            return (Criteria) this;
        }

        public Criteria andSaveplannoLessThanOrEqualTo(String value) {
            addCriterion("saveplanno <=", value, "saveplanno");
            return (Criteria) this;
        }

        public Criteria andSaveplannoLike(String value) {
            addCriterion("saveplanno like", value, "saveplanno");
            return (Criteria) this;
        }

        public Criteria andSaveplannoNotLike(String value) {
            addCriterion("saveplanno not like", value, "saveplanno");
            return (Criteria) this;
        }

        public Criteria andSaveplannoIn(List<String> values) {
            addCriterion("saveplanno in", values, "saveplanno");
            return (Criteria) this;
        }

        public Criteria andSaveplannoNotIn(List<String> values) {
            addCriterion("saveplanno not in", values, "saveplanno");
            return (Criteria) this;
        }

        public Criteria andSaveplannoBetween(String value1, String value2) {
            addCriterion("saveplanno between", value1, value2, "saveplanno");
            return (Criteria) this;
        }

        public Criteria andSaveplannoNotBetween(String value1, String value2) {
            addCriterion("saveplanno not between", value1, value2, "saveplanno");
            return (Criteria) this;
        }

        public Criteria andNavIsNull() {
            addCriterion("nav is null");
            return (Criteria) this;
        }

        public Criteria andNavIsNotNull() {
            addCriterion("nav is not null");
            return (Criteria) this;
        }

        public Criteria andNavEqualTo(String value) {
            addCriterion("nav =", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavNotEqualTo(String value) {
            addCriterion("nav <>", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavGreaterThan(String value) {
            addCriterion("nav >", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavGreaterThanOrEqualTo(String value) {
            addCriterion("nav >=", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavLessThan(String value) {
            addCriterion("nav <", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavLessThanOrEqualTo(String value) {
            addCriterion("nav <=", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavLike(String value) {
            addCriterion("nav like", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavNotLike(String value) {
            addCriterion("nav not like", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavIn(List<String> values) {
            addCriterion("nav in", values, "nav");
            return (Criteria) this;
        }

        public Criteria andNavNotIn(List<String> values) {
            addCriterion("nav not in", values, "nav");
            return (Criteria) this;
        }

        public Criteria andNavBetween(String value1, String value2) {
            addCriterion("nav between", value1, value2, "nav");
            return (Criteria) this;
        }

        public Criteria andNavNotBetween(String value1, String value2) {
            addCriterion("nav not between", value1, value2, "nav");
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andTargettransactionaccountidIsNull() {
            addCriterion("targettransactionaccountid is null");
            return (Criteria) this;
        }

        public Criteria andTargettransactionaccountidIsNotNull() {
            addCriterion("targettransactionaccountid is not null");
            return (Criteria) this;
        }

        public Criteria andTargettransactionaccountidEqualTo(String value) {
            addCriterion("targettransactionaccountid =", value, "targettransactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTargettransactionaccountidNotEqualTo(String value) {
            addCriterion("targettransactionaccountid <>", value, "targettransactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTargettransactionaccountidGreaterThan(String value) {
            addCriterion("targettransactionaccountid >", value, "targettransactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTargettransactionaccountidGreaterThanOrEqualTo(String value) {
            addCriterion("targettransactionaccountid >=", value, "targettransactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTargettransactionaccountidLessThan(String value) {
            addCriterion("targettransactionaccountid <", value, "targettransactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTargettransactionaccountidLessThanOrEqualTo(String value) {
            addCriterion("targettransactionaccountid <=", value, "targettransactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTargettransactionaccountidLike(String value) {
            addCriterion("targettransactionaccountid like", value, "targettransactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTargettransactionaccountidNotLike(String value) {
            addCriterion("targettransactionaccountid not like", value, "targettransactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTargettransactionaccountidIn(List<String> values) {
            addCriterion("targettransactionaccountid in", values, "targettransactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTargettransactionaccountidNotIn(List<String> values) {
            addCriterion("targettransactionaccountid not in", values, "targettransactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTargettransactionaccountidBetween(String value1, String value2) {
            addCriterion("targettransactionaccountid between", value1, value2, "targettransactionaccountid");
            return (Criteria) this;
        }

        public Criteria andTargettransactionaccountidNotBetween(String value1, String value2) {
            addCriterion("targettransactionaccountid not between", value1, value2, "targettransactionaccountid");
            return (Criteria) this;
        }

        public Criteria andEmsnoIsNull() {
            addCriterion("EMSno is null");
            return (Criteria) this;
        }

        public Criteria andEmsnoIsNotNull() {
            addCriterion("EMSno is not null");
            return (Criteria) this;
        }

        public Criteria andEmsnoEqualTo(String value) {
            addCriterion("EMSno =", value, "emsno");
            return (Criteria) this;
        }

        public Criteria andEmsnoNotEqualTo(String value) {
            addCriterion("EMSno <>", value, "emsno");
            return (Criteria) this;
        }

        public Criteria andEmsnoGreaterThan(String value) {
            addCriterion("EMSno >", value, "emsno");
            return (Criteria) this;
        }

        public Criteria andEmsnoGreaterThanOrEqualTo(String value) {
            addCriterion("EMSno >=", value, "emsno");
            return (Criteria) this;
        }

        public Criteria andEmsnoLessThan(String value) {
            addCriterion("EMSno <", value, "emsno");
            return (Criteria) this;
        }

        public Criteria andEmsnoLessThanOrEqualTo(String value) {
            addCriterion("EMSno <=", value, "emsno");
            return (Criteria) this;
        }

        public Criteria andEmsnoLike(String value) {
            addCriterion("EMSno like", value, "emsno");
            return (Criteria) this;
        }

        public Criteria andEmsnoNotLike(String value) {
            addCriterion("EMSno not like", value, "emsno");
            return (Criteria) this;
        }

        public Criteria andEmsnoIn(List<String> values) {
            addCriterion("EMSno in", values, "emsno");
            return (Criteria) this;
        }

        public Criteria andEmsnoNotIn(List<String> values) {
            addCriterion("EMSno not in", values, "emsno");
            return (Criteria) this;
        }

        public Criteria andEmsnoBetween(String value1, String value2) {
            addCriterion("EMSno between", value1, value2, "emsno");
            return (Criteria) this;
        }

        public Criteria andEmsnoNotBetween(String value1, String value2) {
            addCriterion("EMSno not between", value1, value2, "emsno");
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