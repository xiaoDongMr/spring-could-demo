package cn.yilucaifu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PinganTranaccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PinganTranaccountExample() {
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

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
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

        public Criteria andInvestornameIsNull() {
            addCriterion("investorname is null");
            return (Criteria) this;
        }

        public Criteria andInvestornameIsNotNull() {
            addCriterion("investorname is not null");
            return (Criteria) this;
        }

        public Criteria andInvestornameEqualTo(String value) {
            addCriterion("investorname =", value, "investorname");
            return (Criteria) this;
        }

        public Criteria andInvestornameNotEqualTo(String value) {
            addCriterion("investorname <>", value, "investorname");
            return (Criteria) this;
        }

        public Criteria andInvestornameGreaterThan(String value) {
            addCriterion("investorname >", value, "investorname");
            return (Criteria) this;
        }

        public Criteria andInvestornameGreaterThanOrEqualTo(String value) {
            addCriterion("investorname >=", value, "investorname");
            return (Criteria) this;
        }

        public Criteria andInvestornameLessThan(String value) {
            addCriterion("investorname <", value, "investorname");
            return (Criteria) this;
        }

        public Criteria andInvestornameLessThanOrEqualTo(String value) {
            addCriterion("investorname <=", value, "investorname");
            return (Criteria) this;
        }

        public Criteria andInvestornameLike(String value) {
            addCriterion("investorname like", value, "investorname");
            return (Criteria) this;
        }

        public Criteria andInvestornameNotLike(String value) {
            addCriterion("investorname not like", value, "investorname");
            return (Criteria) this;
        }

        public Criteria andInvestornameIn(List<String> values) {
            addCriterion("investorname in", values, "investorname");
            return (Criteria) this;
        }

        public Criteria andInvestornameNotIn(List<String> values) {
            addCriterion("investorname not in", values, "investorname");
            return (Criteria) this;
        }

        public Criteria andInvestornameBetween(String value1, String value2) {
            addCriterion("investorname between", value1, value2, "investorname");
            return (Criteria) this;
        }

        public Criteria andInvestornameNotBetween(String value1, String value2) {
            addCriterion("investorname not between", value1, value2, "investorname");
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

        public Criteria andMobiletelnoIsNull() {
            addCriterion("mobiletelno is null");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoIsNotNull() {
            addCriterion("mobiletelno is not null");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoEqualTo(String value) {
            addCriterion("mobiletelno =", value, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoNotEqualTo(String value) {
            addCriterion("mobiletelno <>", value, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoGreaterThan(String value) {
            addCriterion("mobiletelno >", value, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoGreaterThanOrEqualTo(String value) {
            addCriterion("mobiletelno >=", value, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoLessThan(String value) {
            addCriterion("mobiletelno <", value, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoLessThanOrEqualTo(String value) {
            addCriterion("mobiletelno <=", value, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoLike(String value) {
            addCriterion("mobiletelno like", value, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoNotLike(String value) {
            addCriterion("mobiletelno not like", value, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoIn(List<String> values) {
            addCriterion("mobiletelno in", values, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoNotIn(List<String> values) {
            addCriterion("mobiletelno not in", values, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoBetween(String value1, String value2) {
            addCriterion("mobiletelno between", value1, value2, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andMobiletelnoNotBetween(String value1, String value2) {
            addCriterion("mobiletelno not between", value1, value2, "mobiletelno");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("postcode not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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

        public Criteria andUiIsNull() {
            addCriterion("ui is null");
            return (Criteria) this;
        }

        public Criteria andUiIsNotNull() {
            addCriterion("ui is not null");
            return (Criteria) this;
        }

        public Criteria andUiEqualTo(String value) {
            addCriterion("ui =", value, "ui");
            return (Criteria) this;
        }

        public Criteria andUiNotEqualTo(String value) {
            addCriterion("ui <>", value, "ui");
            return (Criteria) this;
        }

        public Criteria andUiGreaterThan(String value) {
            addCriterion("ui >", value, "ui");
            return (Criteria) this;
        }

        public Criteria andUiGreaterThanOrEqualTo(String value) {
            addCriterion("ui >=", value, "ui");
            return (Criteria) this;
        }

        public Criteria andUiLessThan(String value) {
            addCriterion("ui <", value, "ui");
            return (Criteria) this;
        }

        public Criteria andUiLessThanOrEqualTo(String value) {
            addCriterion("ui <=", value, "ui");
            return (Criteria) this;
        }

        public Criteria andUiLike(String value) {
            addCriterion("ui like", value, "ui");
            return (Criteria) this;
        }

        public Criteria andUiNotLike(String value) {
            addCriterion("ui not like", value, "ui");
            return (Criteria) this;
        }

        public Criteria andUiIn(List<String> values) {
            addCriterion("ui in", values, "ui");
            return (Criteria) this;
        }

        public Criteria andUiNotIn(List<String> values) {
            addCriterion("ui not in", values, "ui");
            return (Criteria) this;
        }

        public Criteria andUiBetween(String value1, String value2) {
            addCriterion("ui between", value1, value2, "ui");
            return (Criteria) this;
        }

        public Criteria andUiNotBetween(String value1, String value2) {
            addCriterion("ui not between", value1, value2, "ui");
            return (Criteria) this;
        }

        public Criteria andXjbaoUiIsNull() {
            addCriterion("xjbao_ui is null");
            return (Criteria) this;
        }

        public Criteria andXjbaoUiIsNotNull() {
            addCriterion("xjbao_ui is not null");
            return (Criteria) this;
        }

        public Criteria andXjbaoUiEqualTo(String value) {
            addCriterion("xjbao_ui =", value, "xjbaoUi");
            return (Criteria) this;
        }

        public Criteria andXjbaoUiNotEqualTo(String value) {
            addCriterion("xjbao_ui <>", value, "xjbaoUi");
            return (Criteria) this;
        }

        public Criteria andXjbaoUiGreaterThan(String value) {
            addCriterion("xjbao_ui >", value, "xjbaoUi");
            return (Criteria) this;
        }

        public Criteria andXjbaoUiGreaterThanOrEqualTo(String value) {
            addCriterion("xjbao_ui >=", value, "xjbaoUi");
            return (Criteria) this;
        }

        public Criteria andXjbaoUiLessThan(String value) {
            addCriterion("xjbao_ui <", value, "xjbaoUi");
            return (Criteria) this;
        }

        public Criteria andXjbaoUiLessThanOrEqualTo(String value) {
            addCriterion("xjbao_ui <=", value, "xjbaoUi");
            return (Criteria) this;
        }

        public Criteria andXjbaoUiLike(String value) {
            addCriterion("xjbao_ui like", value, "xjbaoUi");
            return (Criteria) this;
        }

        public Criteria andXjbaoUiNotLike(String value) {
            addCriterion("xjbao_ui not like", value, "xjbaoUi");
            return (Criteria) this;
        }

        public Criteria andXjbaoUiIn(List<String> values) {
            addCriterion("xjbao_ui in", values, "xjbaoUi");
            return (Criteria) this;
        }

        public Criteria andXjbaoUiNotIn(List<String> values) {
            addCriterion("xjbao_ui not in", values, "xjbaoUi");
            return (Criteria) this;
        }

        public Criteria andXjbaoUiBetween(String value1, String value2) {
            addCriterion("xjbao_ui between", value1, value2, "xjbaoUi");
            return (Criteria) this;
        }

        public Criteria andXjbaoUiNotBetween(String value1, String value2) {
            addCriterion("xjbao_ui not between", value1, value2, "xjbaoUi");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNull() {
            addCriterion("identity is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNotNull() {
            addCriterion("identity is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityEqualTo(String value) {
            addCriterion("identity =", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotEqualTo(String value) {
            addCriterion("identity <>", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThan(String value) {
            addCriterion("identity >", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("identity >=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThan(String value) {
            addCriterion("identity <", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThanOrEqualTo(String value) {
            addCriterion("identity <=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLike(String value) {
            addCriterion("identity like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotLike(String value) {
            addCriterion("identity not like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityIn(List<String> values) {
            addCriterion("identity in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotIn(List<String> values) {
            addCriterion("identity not in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityBetween(String value1, String value2) {
            addCriterion("identity between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotBetween(String value1, String value2) {
            addCriterion("identity not between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andCiIsNull() {
            addCriterion("ci is null");
            return (Criteria) this;
        }

        public Criteria andCiIsNotNull() {
            addCriterion("ci is not null");
            return (Criteria) this;
        }

        public Criteria andCiEqualTo(String value) {
            addCriterion("ci =", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotEqualTo(String value) {
            addCriterion("ci <>", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiGreaterThan(String value) {
            addCriterion("ci >", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiGreaterThanOrEqualTo(String value) {
            addCriterion("ci >=", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiLessThan(String value) {
            addCriterion("ci <", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiLessThanOrEqualTo(String value) {
            addCriterion("ci <=", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiLike(String value) {
            addCriterion("ci like", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotLike(String value) {
            addCriterion("ci not like", value, "ci");
            return (Criteria) this;
        }

        public Criteria andCiIn(List<String> values) {
            addCriterion("ci in", values, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotIn(List<String> values) {
            addCriterion("ci not in", values, "ci");
            return (Criteria) this;
        }

        public Criteria andCiBetween(String value1, String value2) {
            addCriterion("ci between", value1, value2, "ci");
            return (Criteria) this;
        }

        public Criteria andCiNotBetween(String value1, String value2) {
            addCriterion("ci not between", value1, value2, "ci");
            return (Criteria) this;
        }

        public Criteria andRisklevelIsNull() {
            addCriterion("risklevel is null");
            return (Criteria) this;
        }

        public Criteria andRisklevelIsNotNull() {
            addCriterion("risklevel is not null");
            return (Criteria) this;
        }

        public Criteria andRisklevelEqualTo(Integer value) {
            addCriterion("risklevel =", value, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelNotEqualTo(Integer value) {
            addCriterion("risklevel <>", value, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelGreaterThan(Integer value) {
            addCriterion("risklevel >", value, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("risklevel >=", value, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelLessThan(Integer value) {
            addCriterion("risklevel <", value, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelLessThanOrEqualTo(Integer value) {
            addCriterion("risklevel <=", value, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelIn(List<Integer> values) {
            addCriterion("risklevel in", values, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelNotIn(List<Integer> values) {
            addCriterion("risklevel not in", values, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelBetween(Integer value1, Integer value2) {
            addCriterion("risklevel between", value1, value2, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelNotBetween(Integer value1, Integer value2) {
            addCriterion("risklevel not between", value1, value2, "risklevel");
            return (Criteria) this;
        }

        public Criteria andPrivaterisklevelIsNull() {
            addCriterion("privateRisklevel is null");
            return (Criteria) this;
        }

        public Criteria andPrivaterisklevelIsNotNull() {
            addCriterion("privateRisklevel is not null");
            return (Criteria) this;
        }

        public Criteria andPrivaterisklevelEqualTo(Integer value) {
            addCriterion("privateRisklevel =", value, "privaterisklevel");
            return (Criteria) this;
        }

        public Criteria andPrivaterisklevelNotEqualTo(Integer value) {
            addCriterion("privateRisklevel <>", value, "privaterisklevel");
            return (Criteria) this;
        }

        public Criteria andPrivaterisklevelGreaterThan(Integer value) {
            addCriterion("privateRisklevel >", value, "privaterisklevel");
            return (Criteria) this;
        }

        public Criteria andPrivaterisklevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("privateRisklevel >=", value, "privaterisklevel");
            return (Criteria) this;
        }

        public Criteria andPrivaterisklevelLessThan(Integer value) {
            addCriterion("privateRisklevel <", value, "privaterisklevel");
            return (Criteria) this;
        }

        public Criteria andPrivaterisklevelLessThanOrEqualTo(Integer value) {
            addCriterion("privateRisklevel <=", value, "privaterisklevel");
            return (Criteria) this;
        }

        public Criteria andPrivaterisklevelIn(List<Integer> values) {
            addCriterion("privateRisklevel in", values, "privaterisklevel");
            return (Criteria) this;
        }

        public Criteria andPrivaterisklevelNotIn(List<Integer> values) {
            addCriterion("privateRisklevel not in", values, "privaterisklevel");
            return (Criteria) this;
        }

        public Criteria andPrivaterisklevelBetween(Integer value1, Integer value2) {
            addCriterion("privateRisklevel between", value1, value2, "privaterisklevel");
            return (Criteria) this;
        }

        public Criteria andPrivaterisklevelNotBetween(Integer value1, Integer value2) {
            addCriterion("privateRisklevel not between", value1, value2, "privaterisklevel");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNull() {
            addCriterion("isactive is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNotNull() {
            addCriterion("isactive is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveEqualTo(Integer value) {
            addCriterion("isactive =", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotEqualTo(Integer value) {
            addCriterion("isactive <>", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThan(Integer value) {
            addCriterion("isactive >", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("isactive >=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThan(Integer value) {
            addCriterion("isactive <", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThanOrEqualTo(Integer value) {
            addCriterion("isactive <=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveIn(List<Integer> values) {
            addCriterion("isactive in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotIn(List<Integer> values) {
            addCriterion("isactive not in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveBetween(Integer value1, Integer value2) {
            addCriterion("isactive between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotBetween(Integer value1, Integer value2) {
            addCriterion("isactive not between", value1, value2, "isactive");
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

        public Criteria andIsvailcardIsNull() {
            addCriterion("isVailcard is null");
            return (Criteria) this;
        }

        public Criteria andIsvailcardIsNotNull() {
            addCriterion("isVailcard is not null");
            return (Criteria) this;
        }

        public Criteria andIsvailcardEqualTo(Integer value) {
            addCriterion("isVailcard =", value, "isvailcard");
            return (Criteria) this;
        }

        public Criteria andIsvailcardNotEqualTo(Integer value) {
            addCriterion("isVailcard <>", value, "isvailcard");
            return (Criteria) this;
        }

        public Criteria andIsvailcardGreaterThan(Integer value) {
            addCriterion("isVailcard >", value, "isvailcard");
            return (Criteria) this;
        }

        public Criteria andIsvailcardGreaterThanOrEqualTo(Integer value) {
            addCriterion("isVailcard >=", value, "isvailcard");
            return (Criteria) this;
        }

        public Criteria andIsvailcardLessThan(Integer value) {
            addCriterion("isVailcard <", value, "isvailcard");
            return (Criteria) this;
        }

        public Criteria andIsvailcardLessThanOrEqualTo(Integer value) {
            addCriterion("isVailcard <=", value, "isvailcard");
            return (Criteria) this;
        }

        public Criteria andIsvailcardIn(List<Integer> values) {
            addCriterion("isVailcard in", values, "isvailcard");
            return (Criteria) this;
        }

        public Criteria andIsvailcardNotIn(List<Integer> values) {
            addCriterion("isVailcard not in", values, "isvailcard");
            return (Criteria) this;
        }

        public Criteria andIsvailcardBetween(Integer value1, Integer value2) {
            addCriterion("isVailcard between", value1, value2, "isvailcard");
            return (Criteria) this;
        }

        public Criteria andIsvailcardNotBetween(Integer value1, Integer value2) {
            addCriterion("isVailcard not between", value1, value2, "isvailcard");
            return (Criteria) this;
        }

        public Criteria andValicarddateIsNull() {
            addCriterion("valiCardDate is null");
            return (Criteria) this;
        }

        public Criteria andValicarddateIsNotNull() {
            addCriterion("valiCardDate is not null");
            return (Criteria) this;
        }

        public Criteria andValicarddateEqualTo(String value) {
            addCriterion("valiCardDate =", value, "valicarddate");
            return (Criteria) this;
        }

        public Criteria andValicarddateNotEqualTo(String value) {
            addCriterion("valiCardDate <>", value, "valicarddate");
            return (Criteria) this;
        }

        public Criteria andValicarddateGreaterThan(String value) {
            addCriterion("valiCardDate >", value, "valicarddate");
            return (Criteria) this;
        }

        public Criteria andValicarddateGreaterThanOrEqualTo(String value) {
            addCriterion("valiCardDate >=", value, "valicarddate");
            return (Criteria) this;
        }

        public Criteria andValicarddateLessThan(String value) {
            addCriterion("valiCardDate <", value, "valicarddate");
            return (Criteria) this;
        }

        public Criteria andValicarddateLessThanOrEqualTo(String value) {
            addCriterion("valiCardDate <=", value, "valicarddate");
            return (Criteria) this;
        }

        public Criteria andValicarddateLike(String value) {
            addCriterion("valiCardDate like", value, "valicarddate");
            return (Criteria) this;
        }

        public Criteria andValicarddateNotLike(String value) {
            addCriterion("valiCardDate not like", value, "valicarddate");
            return (Criteria) this;
        }

        public Criteria andValicarddateIn(List<String> values) {
            addCriterion("valiCardDate in", values, "valicarddate");
            return (Criteria) this;
        }

        public Criteria andValicarddateNotIn(List<String> values) {
            addCriterion("valiCardDate not in", values, "valicarddate");
            return (Criteria) this;
        }

        public Criteria andValicarddateBetween(String value1, String value2) {
            addCriterion("valiCardDate between", value1, value2, "valicarddate");
            return (Criteria) this;
        }

        public Criteria andValicarddateNotBetween(String value1, String value2) {
            addCriterion("valiCardDate not between", value1, value2, "valicarddate");
            return (Criteria) this;
        }

        public Criteria andIssignIsNull() {
            addCriterion("isSign is null");
            return (Criteria) this;
        }

        public Criteria andIssignIsNotNull() {
            addCriterion("isSign is not null");
            return (Criteria) this;
        }

        public Criteria andIssignEqualTo(Integer value) {
            addCriterion("isSign =", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignNotEqualTo(Integer value) {
            addCriterion("isSign <>", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignGreaterThan(Integer value) {
            addCriterion("isSign >", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignGreaterThanOrEqualTo(Integer value) {
            addCriterion("isSign >=", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignLessThan(Integer value) {
            addCriterion("isSign <", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignLessThanOrEqualTo(Integer value) {
            addCriterion("isSign <=", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignIn(List<Integer> values) {
            addCriterion("isSign in", values, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignNotIn(List<Integer> values) {
            addCriterion("isSign not in", values, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignBetween(Integer value1, Integer value2) {
            addCriterion("isSign between", value1, value2, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignNotBetween(Integer value1, Integer value2) {
            addCriterion("isSign not between", value1, value2, "issign");
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("amount like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("amount not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNull() {
            addCriterion("signtime is null");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNotNull() {
            addCriterion("signtime is not null");
            return (Criteria) this;
        }

        public Criteria andSigntimeEqualTo(String value) {
            addCriterion("signtime =", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotEqualTo(String value) {
            addCriterion("signtime <>", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThan(String value) {
            addCriterion("signtime >", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThanOrEqualTo(String value) {
            addCriterion("signtime >=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThan(String value) {
            addCriterion("signtime <", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThanOrEqualTo(String value) {
            addCriterion("signtime <=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLike(String value) {
            addCriterion("signtime like", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotLike(String value) {
            addCriterion("signtime not like", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeIn(List<String> values) {
            addCriterion("signtime in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotIn(List<String> values) {
            addCriterion("signtime not in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeBetween(String value1, String value2) {
            addCriterion("signtime between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotBetween(String value1, String value2) {
            addCriterion("signtime not between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andValicountIsNull() {
            addCriterion("valiCount is null");
            return (Criteria) this;
        }

        public Criteria andValicountIsNotNull() {
            addCriterion("valiCount is not null");
            return (Criteria) this;
        }

        public Criteria andValicountEqualTo(Integer value) {
            addCriterion("valiCount =", value, "valicount");
            return (Criteria) this;
        }

        public Criteria andValicountNotEqualTo(Integer value) {
            addCriterion("valiCount <>", value, "valicount");
            return (Criteria) this;
        }

        public Criteria andValicountGreaterThan(Integer value) {
            addCriterion("valiCount >", value, "valicount");
            return (Criteria) this;
        }

        public Criteria andValicountGreaterThanOrEqualTo(Integer value) {
            addCriterion("valiCount >=", value, "valicount");
            return (Criteria) this;
        }

        public Criteria andValicountLessThan(Integer value) {
            addCriterion("valiCount <", value, "valicount");
            return (Criteria) this;
        }

        public Criteria andValicountLessThanOrEqualTo(Integer value) {
            addCriterion("valiCount <=", value, "valicount");
            return (Criteria) this;
        }

        public Criteria andValicountIn(List<Integer> values) {
            addCriterion("valiCount in", values, "valicount");
            return (Criteria) this;
        }

        public Criteria andValicountNotIn(List<Integer> values) {
            addCriterion("valiCount not in", values, "valicount");
            return (Criteria) this;
        }

        public Criteria andValicountBetween(Integer value1, Integer value2) {
            addCriterion("valiCount between", value1, value2, "valicount");
            return (Criteria) this;
        }

        public Criteria andValicountNotBetween(Integer value1, Integer value2) {
            addCriterion("valiCount not between", value1, value2, "valicount");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNull() {
            addCriterion("citycode is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("citycode is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(String value) {
            addCriterion("citycode =", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(String value) {
            addCriterion("citycode <>", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(String value) {
            addCriterion("citycode >", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("citycode >=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(String value) {
            addCriterion("citycode <", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(String value) {
            addCriterion("citycode <=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLike(String value) {
            addCriterion("citycode like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotLike(String value) {
            addCriterion("citycode not like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<String> values) {
            addCriterion("citycode in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<String> values) {
            addCriterion("citycode not in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(String value1, String value2) {
            addCriterion("citycode between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(String value1, String value2) {
            addCriterion("citycode not between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeIsNull() {
            addCriterion("provincecode is null");
            return (Criteria) this;
        }

        public Criteria andProvincecodeIsNotNull() {
            addCriterion("provincecode is not null");
            return (Criteria) this;
        }

        public Criteria andProvincecodeEqualTo(String value) {
            addCriterion("provincecode =", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotEqualTo(String value) {
            addCriterion("provincecode <>", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeGreaterThan(String value) {
            addCriterion("provincecode >", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeGreaterThanOrEqualTo(String value) {
            addCriterion("provincecode >=", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeLessThan(String value) {
            addCriterion("provincecode <", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeLessThanOrEqualTo(String value) {
            addCriterion("provincecode <=", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeLike(String value) {
            addCriterion("provincecode like", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotLike(String value) {
            addCriterion("provincecode not like", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeIn(List<String> values) {
            addCriterion("provincecode in", values, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotIn(List<String> values) {
            addCriterion("provincecode not in", values, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeBetween(String value1, String value2) {
            addCriterion("provincecode between", value1, value2, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotBetween(String value1, String value2) {
            addCriterion("provincecode not between", value1, value2, "provincecode");
            return (Criteria) this;
        }

        public Criteria andValitypeIsNull() {
            addCriterion("valiType is null");
            return (Criteria) this;
        }

        public Criteria andValitypeIsNotNull() {
            addCriterion("valiType is not null");
            return (Criteria) this;
        }

        public Criteria andValitypeEqualTo(Integer value) {
            addCriterion("valiType =", value, "valitype");
            return (Criteria) this;
        }

        public Criteria andValitypeNotEqualTo(Integer value) {
            addCriterion("valiType <>", value, "valitype");
            return (Criteria) this;
        }

        public Criteria andValitypeGreaterThan(Integer value) {
            addCriterion("valiType >", value, "valitype");
            return (Criteria) this;
        }

        public Criteria andValitypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("valiType >=", value, "valitype");
            return (Criteria) this;
        }

        public Criteria andValitypeLessThan(Integer value) {
            addCriterion("valiType <", value, "valitype");
            return (Criteria) this;
        }

        public Criteria andValitypeLessThanOrEqualTo(Integer value) {
            addCriterion("valiType <=", value, "valitype");
            return (Criteria) this;
        }

        public Criteria andValitypeIn(List<Integer> values) {
            addCriterion("valiType in", values, "valitype");
            return (Criteria) this;
        }

        public Criteria andValitypeNotIn(List<Integer> values) {
            addCriterion("valiType not in", values, "valitype");
            return (Criteria) this;
        }

        public Criteria andValitypeBetween(Integer value1, Integer value2) {
            addCriterion("valiType between", value1, value2, "valitype");
            return (Criteria) this;
        }

        public Criteria andValitypeNotBetween(Integer value1, Integer value2) {
            addCriterion("valiType not between", value1, value2, "valitype");
            return (Criteria) this;
        }

        public Criteria andLastrisktimeIsNull() {
            addCriterion("lastRiskTime is null");
            return (Criteria) this;
        }

        public Criteria andLastrisktimeIsNotNull() {
            addCriterion("lastRiskTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastrisktimeEqualTo(Date value) {
            addCriterion("lastRiskTime =", value, "lastrisktime");
            return (Criteria) this;
        }

        public Criteria andLastrisktimeNotEqualTo(Date value) {
            addCriterion("lastRiskTime <>", value, "lastrisktime");
            return (Criteria) this;
        }

        public Criteria andLastrisktimeGreaterThan(Date value) {
            addCriterion("lastRiskTime >", value, "lastrisktime");
            return (Criteria) this;
        }

        public Criteria andLastrisktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastRiskTime >=", value, "lastrisktime");
            return (Criteria) this;
        }

        public Criteria andLastrisktimeLessThan(Date value) {
            addCriterion("lastRiskTime <", value, "lastrisktime");
            return (Criteria) this;
        }

        public Criteria andLastrisktimeLessThanOrEqualTo(Date value) {
            addCriterion("lastRiskTime <=", value, "lastrisktime");
            return (Criteria) this;
        }

        public Criteria andLastrisktimeIn(List<Date> values) {
            addCriterion("lastRiskTime in", values, "lastrisktime");
            return (Criteria) this;
        }

        public Criteria andLastrisktimeNotIn(List<Date> values) {
            addCriterion("lastRiskTime not in", values, "lastrisktime");
            return (Criteria) this;
        }

        public Criteria andLastrisktimeBetween(Date value1, Date value2) {
            addCriterion("lastRiskTime between", value1, value2, "lastrisktime");
            return (Criteria) this;
        }

        public Criteria andLastrisktimeNotBetween(Date value1, Date value2) {
            addCriterion("lastRiskTime not between", value1, value2, "lastrisktime");
            return (Criteria) this;
        }

        public Criteria andShowvailtypeIsNull() {
            addCriterion("showvailtype is null");
            return (Criteria) this;
        }

        public Criteria andShowvailtypeIsNotNull() {
            addCriterion("showvailtype is not null");
            return (Criteria) this;
        }

        public Criteria andShowvailtypeEqualTo(String value) {
            addCriterion("showvailtype =", value, "showvailtype");
            return (Criteria) this;
        }

        public Criteria andShowvailtypeNotEqualTo(String value) {
            addCriterion("showvailtype <>", value, "showvailtype");
            return (Criteria) this;
        }

        public Criteria andShowvailtypeGreaterThan(String value) {
            addCriterion("showvailtype >", value, "showvailtype");
            return (Criteria) this;
        }

        public Criteria andShowvailtypeGreaterThanOrEqualTo(String value) {
            addCriterion("showvailtype >=", value, "showvailtype");
            return (Criteria) this;
        }

        public Criteria andShowvailtypeLessThan(String value) {
            addCriterion("showvailtype <", value, "showvailtype");
            return (Criteria) this;
        }

        public Criteria andShowvailtypeLessThanOrEqualTo(String value) {
            addCriterion("showvailtype <=", value, "showvailtype");
            return (Criteria) this;
        }

        public Criteria andShowvailtypeLike(String value) {
            addCriterion("showvailtype like", value, "showvailtype");
            return (Criteria) this;
        }

        public Criteria andShowvailtypeNotLike(String value) {
            addCriterion("showvailtype not like", value, "showvailtype");
            return (Criteria) this;
        }

        public Criteria andShowvailtypeIn(List<String> values) {
            addCriterion("showvailtype in", values, "showvailtype");
            return (Criteria) this;
        }

        public Criteria andShowvailtypeNotIn(List<String> values) {
            addCriterion("showvailtype not in", values, "showvailtype");
            return (Criteria) this;
        }

        public Criteria andShowvailtypeBetween(String value1, String value2) {
            addCriterion("showvailtype between", value1, value2, "showvailtype");
            return (Criteria) this;
        }

        public Criteria andShowvailtypeNotBetween(String value1, String value2) {
            addCriterion("showvailtype not between", value1, value2, "showvailtype");
            return (Criteria) this;
        }

        public Criteria andIsunionIsNull() {
            addCriterion("isUnion is null");
            return (Criteria) this;
        }

        public Criteria andIsunionIsNotNull() {
            addCriterion("isUnion is not null");
            return (Criteria) this;
        }

        public Criteria andIsunionEqualTo(Integer value) {
            addCriterion("isUnion =", value, "isunion");
            return (Criteria) this;
        }

        public Criteria andIsunionNotEqualTo(Integer value) {
            addCriterion("isUnion <>", value, "isunion");
            return (Criteria) this;
        }

        public Criteria andIsunionGreaterThan(Integer value) {
            addCriterion("isUnion >", value, "isunion");
            return (Criteria) this;
        }

        public Criteria andIsunionGreaterThanOrEqualTo(Integer value) {
            addCriterion("isUnion >=", value, "isunion");
            return (Criteria) this;
        }

        public Criteria andIsunionLessThan(Integer value) {
            addCriterion("isUnion <", value, "isunion");
            return (Criteria) this;
        }

        public Criteria andIsunionLessThanOrEqualTo(Integer value) {
            addCriterion("isUnion <=", value, "isunion");
            return (Criteria) this;
        }

        public Criteria andIsunionIn(List<Integer> values) {
            addCriterion("isUnion in", values, "isunion");
            return (Criteria) this;
        }

        public Criteria andIsunionNotIn(List<Integer> values) {
            addCriterion("isUnion not in", values, "isunion");
            return (Criteria) this;
        }

        public Criteria andIsunionBetween(Integer value1, Integer value2) {
            addCriterion("isUnion between", value1, value2, "isunion");
            return (Criteria) this;
        }

        public Criteria andIsunionNotBetween(Integer value1, Integer value2) {
            addCriterion("isUnion not between", value1, value2, "isunion");
            return (Criteria) this;
        }

        public Criteria andAllotNoIsNull() {
            addCriterion("allot_no is null");
            return (Criteria) this;
        }

        public Criteria andAllotNoIsNotNull() {
            addCriterion("allot_no is not null");
            return (Criteria) this;
        }

        public Criteria andAllotNoEqualTo(String value) {
            addCriterion("allot_no =", value, "allotNo");
            return (Criteria) this;
        }

        public Criteria andAllotNoNotEqualTo(String value) {
            addCriterion("allot_no <>", value, "allotNo");
            return (Criteria) this;
        }

        public Criteria andAllotNoGreaterThan(String value) {
            addCriterion("allot_no >", value, "allotNo");
            return (Criteria) this;
        }

        public Criteria andAllotNoGreaterThanOrEqualTo(String value) {
            addCriterion("allot_no >=", value, "allotNo");
            return (Criteria) this;
        }

        public Criteria andAllotNoLessThan(String value) {
            addCriterion("allot_no <", value, "allotNo");
            return (Criteria) this;
        }

        public Criteria andAllotNoLessThanOrEqualTo(String value) {
            addCriterion("allot_no <=", value, "allotNo");
            return (Criteria) this;
        }

        public Criteria andAllotNoLike(String value) {
            addCriterion("allot_no like", value, "allotNo");
            return (Criteria) this;
        }

        public Criteria andAllotNoNotLike(String value) {
            addCriterion("allot_no not like", value, "allotNo");
            return (Criteria) this;
        }

        public Criteria andAllotNoIn(List<String> values) {
            addCriterion("allot_no in", values, "allotNo");
            return (Criteria) this;
        }

        public Criteria andAllotNoNotIn(List<String> values) {
            addCriterion("allot_no not in", values, "allotNo");
            return (Criteria) this;
        }

        public Criteria andAllotNoBetween(String value1, String value2) {
            addCriterion("allot_no between", value1, value2, "allotNo");
            return (Criteria) this;
        }

        public Criteria andAllotNoNotBetween(String value1, String value2) {
            addCriterion("allot_no not between", value1, value2, "allotNo");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("client_id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(String value) {
            addCriterion("client_id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(String value) {
            addCriterion("client_id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(String value) {
            addCriterion("client_id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("client_id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(String value) {
            addCriterion("client_id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(String value) {
            addCriterion("client_id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLike(String value) {
            addCriterion("client_id like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotLike(String value) {
            addCriterion("client_id not like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<String> values) {
            addCriterion("client_id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<String> values) {
            addCriterion("client_id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(String value1, String value2) {
            addCriterion("client_id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(String value1, String value2) {
            addCriterion("client_id not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("apply_date is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("apply_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(String value) {
            addCriterion("apply_date =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(String value) {
            addCriterion("apply_date <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(String value) {
            addCriterion("apply_date >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(String value) {
            addCriterion("apply_date >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(String value) {
            addCriterion("apply_date <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(String value) {
            addCriterion("apply_date <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLike(String value) {
            addCriterion("apply_date like", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotLike(String value) {
            addCriterion("apply_date not like", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<String> values) {
            addCriterion("apply_date in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<String> values) {
            addCriterion("apply_date not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(String value1, String value2) {
            addCriterion("apply_date between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(String value1, String value2) {
            addCriterion("apply_date not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeIsNull() {
            addCriterion("investor_type is null");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeIsNotNull() {
            addCriterion("investor_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeEqualTo(Integer value) {
            addCriterion("investor_type =", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeNotEqualTo(Integer value) {
            addCriterion("investor_type <>", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeGreaterThan(Integer value) {
            addCriterion("investor_type >", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("investor_type >=", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeLessThan(Integer value) {
            addCriterion("investor_type <", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeLessThanOrEqualTo(Integer value) {
            addCriterion("investor_type <=", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeIn(List<Integer> values) {
            addCriterion("investor_type in", values, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeNotIn(List<Integer> values) {
            addCriterion("investor_type not in", values, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeBetween(Integer value1, Integer value2) {
            addCriterion("investor_type between", value1, value2, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("investor_type not between", value1, value2, "investorType");
            return (Criteria) this;
        }

        public Criteria andIsConvertibleIsNull() {
            addCriterion("is_convertible is null");
            return (Criteria) this;
        }

        public Criteria andIsConvertibleIsNotNull() {
            addCriterion("is_convertible is not null");
            return (Criteria) this;
        }

        public Criteria andIsConvertibleEqualTo(Integer value) {
            addCriterion("is_convertible =", value, "isConvertible");
            return (Criteria) this;
        }

        public Criteria andIsConvertibleNotEqualTo(Integer value) {
            addCriterion("is_convertible <>", value, "isConvertible");
            return (Criteria) this;
        }

        public Criteria andIsConvertibleGreaterThan(Integer value) {
            addCriterion("is_convertible >", value, "isConvertible");
            return (Criteria) this;
        }

        public Criteria andIsConvertibleGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_convertible >=", value, "isConvertible");
            return (Criteria) this;
        }

        public Criteria andIsConvertibleLessThan(Integer value) {
            addCriterion("is_convertible <", value, "isConvertible");
            return (Criteria) this;
        }

        public Criteria andIsConvertibleLessThanOrEqualTo(Integer value) {
            addCriterion("is_convertible <=", value, "isConvertible");
            return (Criteria) this;
        }

        public Criteria andIsConvertibleIn(List<Integer> values) {
            addCriterion("is_convertible in", values, "isConvertible");
            return (Criteria) this;
        }

        public Criteria andIsConvertibleNotIn(List<Integer> values) {
            addCriterion("is_convertible not in", values, "isConvertible");
            return (Criteria) this;
        }

        public Criteria andIsConvertibleBetween(Integer value1, Integer value2) {
            addCriterion("is_convertible between", value1, value2, "isConvertible");
            return (Criteria) this;
        }

        public Criteria andIsConvertibleNotBetween(Integer value1, Integer value2) {
            addCriterion("is_convertible not between", value1, value2, "isConvertible");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNull() {
            addCriterion("profession is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNotNull() {
            addCriterion("profession is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionEqualTo(String value) {
            addCriterion("profession =", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotEqualTo(String value) {
            addCriterion("profession <>", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThan(String value) {
            addCriterion("profession >", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("profession >=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThan(String value) {
            addCriterion("profession <", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThanOrEqualTo(String value) {
            addCriterion("profession <=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLike(String value) {
            addCriterion("profession like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotLike(String value) {
            addCriterion("profession not like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionIn(List<String> values) {
            addCriterion("profession in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotIn(List<String> values) {
            addCriterion("profession not in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionBetween(String value1, String value2) {
            addCriterion("profession between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotBetween(String value1, String value2) {
            addCriterion("profession not between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andTaxResidentIdentityTypeIsNull() {
            addCriterion("tax_resident_identity_type is null");
            return (Criteria) this;
        }

        public Criteria andTaxResidentIdentityTypeIsNotNull() {
            addCriterion("tax_resident_identity_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaxResidentIdentityTypeEqualTo(String value) {
            addCriterion("tax_resident_identity_type =", value, "taxResidentIdentityType");
            return (Criteria) this;
        }

        public Criteria andTaxResidentIdentityTypeNotEqualTo(String value) {
            addCriterion("tax_resident_identity_type <>", value, "taxResidentIdentityType");
            return (Criteria) this;
        }

        public Criteria andTaxResidentIdentityTypeGreaterThan(String value) {
            addCriterion("tax_resident_identity_type >", value, "taxResidentIdentityType");
            return (Criteria) this;
        }

        public Criteria andTaxResidentIdentityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tax_resident_identity_type >=", value, "taxResidentIdentityType");
            return (Criteria) this;
        }

        public Criteria andTaxResidentIdentityTypeLessThan(String value) {
            addCriterion("tax_resident_identity_type <", value, "taxResidentIdentityType");
            return (Criteria) this;
        }

        public Criteria andTaxResidentIdentityTypeLessThanOrEqualTo(String value) {
            addCriterion("tax_resident_identity_type <=", value, "taxResidentIdentityType");
            return (Criteria) this;
        }

        public Criteria andTaxResidentIdentityTypeLike(String value) {
            addCriterion("tax_resident_identity_type like", value, "taxResidentIdentityType");
            return (Criteria) this;
        }

        public Criteria andTaxResidentIdentityTypeNotLike(String value) {
            addCriterion("tax_resident_identity_type not like", value, "taxResidentIdentityType");
            return (Criteria) this;
        }

        public Criteria andTaxResidentIdentityTypeIn(List<String> values) {
            addCriterion("tax_resident_identity_type in", values, "taxResidentIdentityType");
            return (Criteria) this;
        }

        public Criteria andTaxResidentIdentityTypeNotIn(List<String> values) {
            addCriterion("tax_resident_identity_type not in", values, "taxResidentIdentityType");
            return (Criteria) this;
        }

        public Criteria andTaxResidentIdentityTypeBetween(String value1, String value2) {
            addCriterion("tax_resident_identity_type between", value1, value2, "taxResidentIdentityType");
            return (Criteria) this;
        }

        public Criteria andTaxResidentIdentityTypeNotBetween(String value1, String value2) {
            addCriterion("tax_resident_identity_type not between", value1, value2, "taxResidentIdentityType");
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