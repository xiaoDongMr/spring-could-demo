package cn.yilucaifu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andBusinessLicenseFrontIsNull() {
            addCriterion("business_license_front is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFrontIsNotNull() {
            addCriterion("business_license_front is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFrontEqualTo(String value) {
            addCriterion("business_license_front =", value, "businessLicenseFront");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFrontNotEqualTo(String value) {
            addCriterion("business_license_front <>", value, "businessLicenseFront");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFrontGreaterThan(String value) {
            addCriterion("business_license_front >", value, "businessLicenseFront");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFrontGreaterThanOrEqualTo(String value) {
            addCriterion("business_license_front >=", value, "businessLicenseFront");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFrontLessThan(String value) {
            addCriterion("business_license_front <", value, "businessLicenseFront");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFrontLessThanOrEqualTo(String value) {
            addCriterion("business_license_front <=", value, "businessLicenseFront");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFrontLike(String value) {
            addCriterion("business_license_front like", value, "businessLicenseFront");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFrontNotLike(String value) {
            addCriterion("business_license_front not like", value, "businessLicenseFront");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFrontIn(List<String> values) {
            addCriterion("business_license_front in", values, "businessLicenseFront");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFrontNotIn(List<String> values) {
            addCriterion("business_license_front not in", values, "businessLicenseFront");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFrontBetween(String value1, String value2) {
            addCriterion("business_license_front between", value1, value2, "businessLicenseFront");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFrontNotBetween(String value1, String value2) {
            addCriterion("business_license_front not between", value1, value2, "businessLicenseFront");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseVersoIsNull() {
            addCriterion("business_license_verso is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseVersoIsNotNull() {
            addCriterion("business_license_verso is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseVersoEqualTo(String value) {
            addCriterion("business_license_verso =", value, "businessLicenseVerso");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseVersoNotEqualTo(String value) {
            addCriterion("business_license_verso <>", value, "businessLicenseVerso");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseVersoGreaterThan(String value) {
            addCriterion("business_license_verso >", value, "businessLicenseVerso");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseVersoGreaterThanOrEqualTo(String value) {
            addCriterion("business_license_verso >=", value, "businessLicenseVerso");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseVersoLessThan(String value) {
            addCriterion("business_license_verso <", value, "businessLicenseVerso");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseVersoLessThanOrEqualTo(String value) {
            addCriterion("business_license_verso <=", value, "businessLicenseVerso");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseVersoLike(String value) {
            addCriterion("business_license_verso like", value, "businessLicenseVerso");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseVersoNotLike(String value) {
            addCriterion("business_license_verso not like", value, "businessLicenseVerso");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseVersoIn(List<String> values) {
            addCriterion("business_license_verso in", values, "businessLicenseVerso");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseVersoNotIn(List<String> values) {
            addCriterion("business_license_verso not in", values, "businessLicenseVerso");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseVersoBetween(String value1, String value2) {
            addCriterion("business_license_verso between", value1, value2, "businessLicenseVerso");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseVersoNotBetween(String value1, String value2) {
            addCriterion("business_license_verso not between", value1, value2, "businessLicenseVerso");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountCardIsNull() {
            addCriterion("company_account_card is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountCardIsNotNull() {
            addCriterion("company_account_card is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountCardEqualTo(String value) {
            addCriterion("company_account_card =", value, "companyAccountCard");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountCardNotEqualTo(String value) {
            addCriterion("company_account_card <>", value, "companyAccountCard");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountCardGreaterThan(String value) {
            addCriterion("company_account_card >", value, "companyAccountCard");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountCardGreaterThanOrEqualTo(String value) {
            addCriterion("company_account_card >=", value, "companyAccountCard");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountCardLessThan(String value) {
            addCriterion("company_account_card <", value, "companyAccountCard");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountCardLessThanOrEqualTo(String value) {
            addCriterion("company_account_card <=", value, "companyAccountCard");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountCardLike(String value) {
            addCriterion("company_account_card like", value, "companyAccountCard");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountCardNotLike(String value) {
            addCriterion("company_account_card not like", value, "companyAccountCard");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountCardIn(List<String> values) {
            addCriterion("company_account_card in", values, "companyAccountCard");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountCardNotIn(List<String> values) {
            addCriterion("company_account_card not in", values, "companyAccountCard");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountCardBetween(String value1, String value2) {
            addCriterion("company_account_card between", value1, value2, "companyAccountCard");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountCardNotBetween(String value1, String value2) {
            addCriterion("company_account_card not between", value1, value2, "companyAccountCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardIsNull() {
            addCriterion("identity_card is null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardIsNotNull() {
            addCriterion("identity_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardEqualTo(String value) {
            addCriterion("identity_card =", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotEqualTo(String value) {
            addCriterion("identity_card <>", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardGreaterThan(String value) {
            addCriterion("identity_card >", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardGreaterThanOrEqualTo(String value) {
            addCriterion("identity_card >=", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardLessThan(String value) {
            addCriterion("identity_card <", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardLessThanOrEqualTo(String value) {
            addCriterion("identity_card <=", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardLike(String value) {
            addCriterion("identity_card like", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotLike(String value) {
            addCriterion("identity_card not like", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardIn(List<String> values) {
            addCriterion("identity_card in", values, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotIn(List<String> values) {
            addCriterion("identity_card not in", values, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardBetween(String value1, String value2) {
            addCriterion("identity_card between", value1, value2, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotBetween(String value1, String value2) {
            addCriterion("identity_card not between", value1, value2, "identityCard");
            return (Criteria) this;
        }

        public Criteria andCompanyEntrustBookIsNull() {
            addCriterion("company_entrust_book is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEntrustBookIsNotNull() {
            addCriterion("company_entrust_book is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEntrustBookEqualTo(String value) {
            addCriterion("company_entrust_book =", value, "companyEntrustBook");
            return (Criteria) this;
        }

        public Criteria andCompanyEntrustBookNotEqualTo(String value) {
            addCriterion("company_entrust_book <>", value, "companyEntrustBook");
            return (Criteria) this;
        }

        public Criteria andCompanyEntrustBookGreaterThan(String value) {
            addCriterion("company_entrust_book >", value, "companyEntrustBook");
            return (Criteria) this;
        }

        public Criteria andCompanyEntrustBookGreaterThanOrEqualTo(String value) {
            addCriterion("company_entrust_book >=", value, "companyEntrustBook");
            return (Criteria) this;
        }

        public Criteria andCompanyEntrustBookLessThan(String value) {
            addCriterion("company_entrust_book <", value, "companyEntrustBook");
            return (Criteria) this;
        }

        public Criteria andCompanyEntrustBookLessThanOrEqualTo(String value) {
            addCriterion("company_entrust_book <=", value, "companyEntrustBook");
            return (Criteria) this;
        }

        public Criteria andCompanyEntrustBookLike(String value) {
            addCriterion("company_entrust_book like", value, "companyEntrustBook");
            return (Criteria) this;
        }

        public Criteria andCompanyEntrustBookNotLike(String value) {
            addCriterion("company_entrust_book not like", value, "companyEntrustBook");
            return (Criteria) this;
        }

        public Criteria andCompanyEntrustBookIn(List<String> values) {
            addCriterion("company_entrust_book in", values, "companyEntrustBook");
            return (Criteria) this;
        }

        public Criteria andCompanyEntrustBookNotIn(List<String> values) {
            addCriterion("company_entrust_book not in", values, "companyEntrustBook");
            return (Criteria) this;
        }

        public Criteria andCompanyEntrustBookBetween(String value1, String value2) {
            addCriterion("company_entrust_book between", value1, value2, "companyEntrustBook");
            return (Criteria) this;
        }

        public Criteria andCompanyEntrustBookNotBetween(String value1, String value2) {
            addCriterion("company_entrust_book not between", value1, value2, "companyEntrustBook");
            return (Criteria) this;
        }

        public Criteria andManIdentityIsNull() {
            addCriterion("man_identity is null");
            return (Criteria) this;
        }

        public Criteria andManIdentityIsNotNull() {
            addCriterion("man_identity is not null");
            return (Criteria) this;
        }

        public Criteria andManIdentityEqualTo(String value) {
            addCriterion("man_identity =", value, "manIdentity");
            return (Criteria) this;
        }

        public Criteria andManIdentityNotEqualTo(String value) {
            addCriterion("man_identity <>", value, "manIdentity");
            return (Criteria) this;
        }

        public Criteria andManIdentityGreaterThan(String value) {
            addCriterion("man_identity >", value, "manIdentity");
            return (Criteria) this;
        }

        public Criteria andManIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("man_identity >=", value, "manIdentity");
            return (Criteria) this;
        }

        public Criteria andManIdentityLessThan(String value) {
            addCriterion("man_identity <", value, "manIdentity");
            return (Criteria) this;
        }

        public Criteria andManIdentityLessThanOrEqualTo(String value) {
            addCriterion("man_identity <=", value, "manIdentity");
            return (Criteria) this;
        }

        public Criteria andManIdentityLike(String value) {
            addCriterion("man_identity like", value, "manIdentity");
            return (Criteria) this;
        }

        public Criteria andManIdentityNotLike(String value) {
            addCriterion("man_identity not like", value, "manIdentity");
            return (Criteria) this;
        }

        public Criteria andManIdentityIn(List<String> values) {
            addCriterion("man_identity in", values, "manIdentity");
            return (Criteria) this;
        }

        public Criteria andManIdentityNotIn(List<String> values) {
            addCriterion("man_identity not in", values, "manIdentity");
            return (Criteria) this;
        }

        public Criteria andManIdentityBetween(String value1, String value2) {
            addCriterion("man_identity between", value1, value2, "manIdentity");
            return (Criteria) this;
        }

        public Criteria andManIdentityNotBetween(String value1, String value2) {
            addCriterion("man_identity not between", value1, value2, "manIdentity");
            return (Criteria) this;
        }

        public Criteria andElseAccountCardIsNull() {
            addCriterion("else_account_card is null");
            return (Criteria) this;
        }

        public Criteria andElseAccountCardIsNotNull() {
            addCriterion("else_account_card is not null");
            return (Criteria) this;
        }

        public Criteria andElseAccountCardEqualTo(String value) {
            addCriterion("else_account_card =", value, "elseAccountCard");
            return (Criteria) this;
        }

        public Criteria andElseAccountCardNotEqualTo(String value) {
            addCriterion("else_account_card <>", value, "elseAccountCard");
            return (Criteria) this;
        }

        public Criteria andElseAccountCardGreaterThan(String value) {
            addCriterion("else_account_card >", value, "elseAccountCard");
            return (Criteria) this;
        }

        public Criteria andElseAccountCardGreaterThanOrEqualTo(String value) {
            addCriterion("else_account_card >=", value, "elseAccountCard");
            return (Criteria) this;
        }

        public Criteria andElseAccountCardLessThan(String value) {
            addCriterion("else_account_card <", value, "elseAccountCard");
            return (Criteria) this;
        }

        public Criteria andElseAccountCardLessThanOrEqualTo(String value) {
            addCriterion("else_account_card <=", value, "elseAccountCard");
            return (Criteria) this;
        }

        public Criteria andElseAccountCardLike(String value) {
            addCriterion("else_account_card like", value, "elseAccountCard");
            return (Criteria) this;
        }

        public Criteria andElseAccountCardNotLike(String value) {
            addCriterion("else_account_card not like", value, "elseAccountCard");
            return (Criteria) this;
        }

        public Criteria andElseAccountCardIn(List<String> values) {
            addCriterion("else_account_card in", values, "elseAccountCard");
            return (Criteria) this;
        }

        public Criteria andElseAccountCardNotIn(List<String> values) {
            addCriterion("else_account_card not in", values, "elseAccountCard");
            return (Criteria) this;
        }

        public Criteria andElseAccountCardBetween(String value1, String value2) {
            addCriterion("else_account_card between", value1, value2, "elseAccountCard");
            return (Criteria) this;
        }

        public Criteria andElseAccountCardNotBetween(String value1, String value2) {
            addCriterion("else_account_card not between", value1, value2, "elseAccountCard");
            return (Criteria) this;
        }

        public Criteria andQfiiCardIsNull() {
            addCriterion("qfii_card is null");
            return (Criteria) this;
        }

        public Criteria andQfiiCardIsNotNull() {
            addCriterion("qfii_card is not null");
            return (Criteria) this;
        }

        public Criteria andQfiiCardEqualTo(String value) {
            addCriterion("qfii_card =", value, "qfiiCard");
            return (Criteria) this;
        }

        public Criteria andQfiiCardNotEqualTo(String value) {
            addCriterion("qfii_card <>", value, "qfiiCard");
            return (Criteria) this;
        }

        public Criteria andQfiiCardGreaterThan(String value) {
            addCriterion("qfii_card >", value, "qfiiCard");
            return (Criteria) this;
        }

        public Criteria andQfiiCardGreaterThanOrEqualTo(String value) {
            addCriterion("qfii_card >=", value, "qfiiCard");
            return (Criteria) this;
        }

        public Criteria andQfiiCardLessThan(String value) {
            addCriterion("qfii_card <", value, "qfiiCard");
            return (Criteria) this;
        }

        public Criteria andQfiiCardLessThanOrEqualTo(String value) {
            addCriterion("qfii_card <=", value, "qfiiCard");
            return (Criteria) this;
        }

        public Criteria andQfiiCardLike(String value) {
            addCriterion("qfii_card like", value, "qfiiCard");
            return (Criteria) this;
        }

        public Criteria andQfiiCardNotLike(String value) {
            addCriterion("qfii_card not like", value, "qfiiCard");
            return (Criteria) this;
        }

        public Criteria andQfiiCardIn(List<String> values) {
            addCriterion("qfii_card in", values, "qfiiCard");
            return (Criteria) this;
        }

        public Criteria andQfiiCardNotIn(List<String> values) {
            addCriterion("qfii_card not in", values, "qfiiCard");
            return (Criteria) this;
        }

        public Criteria andQfiiCardBetween(String value1, String value2) {
            addCriterion("qfii_card between", value1, value2, "qfiiCard");
            return (Criteria) this;
        }

        public Criteria andQfiiCardNotBetween(String value1, String value2) {
            addCriterion("qfii_card not between", value1, value2, "qfiiCard");
            return (Criteria) this;
        }

        public Criteria andEgalpersonIsNull() {
            addCriterion("egalPerson is null");
            return (Criteria) this;
        }

        public Criteria andEgalpersonIsNotNull() {
            addCriterion("egalPerson is not null");
            return (Criteria) this;
        }

        public Criteria andEgalpersonEqualTo(String value) {
            addCriterion("egalPerson =", value, "egalperson");
            return (Criteria) this;
        }

        public Criteria andEgalpersonNotEqualTo(String value) {
            addCriterion("egalPerson <>", value, "egalperson");
            return (Criteria) this;
        }

        public Criteria andEgalpersonGreaterThan(String value) {
            addCriterion("egalPerson >", value, "egalperson");
            return (Criteria) this;
        }

        public Criteria andEgalpersonGreaterThanOrEqualTo(String value) {
            addCriterion("egalPerson >=", value, "egalperson");
            return (Criteria) this;
        }

        public Criteria andEgalpersonLessThan(String value) {
            addCriterion("egalPerson <", value, "egalperson");
            return (Criteria) this;
        }

        public Criteria andEgalpersonLessThanOrEqualTo(String value) {
            addCriterion("egalPerson <=", value, "egalperson");
            return (Criteria) this;
        }

        public Criteria andEgalpersonLike(String value) {
            addCriterion("egalPerson like", value, "egalperson");
            return (Criteria) this;
        }

        public Criteria andEgalpersonNotLike(String value) {
            addCriterion("egalPerson not like", value, "egalperson");
            return (Criteria) this;
        }

        public Criteria andEgalpersonIn(List<String> values) {
            addCriterion("egalPerson in", values, "egalperson");
            return (Criteria) this;
        }

        public Criteria andEgalpersonNotIn(List<String> values) {
            addCriterion("egalPerson not in", values, "egalperson");
            return (Criteria) this;
        }

        public Criteria andEgalpersonBetween(String value1, String value2) {
            addCriterion("egalPerson between", value1, value2, "egalperson");
            return (Criteria) this;
        }

        public Criteria andEgalpersonNotBetween(String value1, String value2) {
            addCriterion("egalPerson not between", value1, value2, "egalperson");
            return (Criteria) this;
        }

        public Criteria andEgalpersoncertnoIsNull() {
            addCriterion("egalPersonCertNo is null");
            return (Criteria) this;
        }

        public Criteria andEgalpersoncertnoIsNotNull() {
            addCriterion("egalPersonCertNo is not null");
            return (Criteria) this;
        }

        public Criteria andEgalpersoncertnoEqualTo(String value) {
            addCriterion("egalPersonCertNo =", value, "egalpersoncertno");
            return (Criteria) this;
        }

        public Criteria andEgalpersoncertnoNotEqualTo(String value) {
            addCriterion("egalPersonCertNo <>", value, "egalpersoncertno");
            return (Criteria) this;
        }

        public Criteria andEgalpersoncertnoGreaterThan(String value) {
            addCriterion("egalPersonCertNo >", value, "egalpersoncertno");
            return (Criteria) this;
        }

        public Criteria andEgalpersoncertnoGreaterThanOrEqualTo(String value) {
            addCriterion("egalPersonCertNo >=", value, "egalpersoncertno");
            return (Criteria) this;
        }

        public Criteria andEgalpersoncertnoLessThan(String value) {
            addCriterion("egalPersonCertNo <", value, "egalpersoncertno");
            return (Criteria) this;
        }

        public Criteria andEgalpersoncertnoLessThanOrEqualTo(String value) {
            addCriterion("egalPersonCertNo <=", value, "egalpersoncertno");
            return (Criteria) this;
        }

        public Criteria andEgalpersoncertnoLike(String value) {
            addCriterion("egalPersonCertNo like", value, "egalpersoncertno");
            return (Criteria) this;
        }

        public Criteria andEgalpersoncertnoNotLike(String value) {
            addCriterion("egalPersonCertNo not like", value, "egalpersoncertno");
            return (Criteria) this;
        }

        public Criteria andEgalpersoncertnoIn(List<String> values) {
            addCriterion("egalPersonCertNo in", values, "egalpersoncertno");
            return (Criteria) this;
        }

        public Criteria andEgalpersoncertnoNotIn(List<String> values) {
            addCriterion("egalPersonCertNo not in", values, "egalpersoncertno");
            return (Criteria) this;
        }

        public Criteria andEgalpersoncertnoBetween(String value1, String value2) {
            addCriterion("egalPersonCertNo between", value1, value2, "egalpersoncertno");
            return (Criteria) this;
        }

        public Criteria andEgalpersoncertnoNotBetween(String value1, String value2) {
            addCriterion("egalPersonCertNo not between", value1, value2, "egalpersoncertno");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeIsNull() {
            addCriterion("socialCreditCode is null");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeIsNotNull() {
            addCriterion("socialCreditCode is not null");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeEqualTo(String value) {
            addCriterion("socialCreditCode =", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeNotEqualTo(String value) {
            addCriterion("socialCreditCode <>", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeGreaterThan(String value) {
            addCriterion("socialCreditCode >", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeGreaterThanOrEqualTo(String value) {
            addCriterion("socialCreditCode >=", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeLessThan(String value) {
            addCriterion("socialCreditCode <", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeLessThanOrEqualTo(String value) {
            addCriterion("socialCreditCode <=", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeLike(String value) {
            addCriterion("socialCreditCode like", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeNotLike(String value) {
            addCriterion("socialCreditCode not like", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeIn(List<String> values) {
            addCriterion("socialCreditCode in", values, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeNotIn(List<String> values) {
            addCriterion("socialCreditCode not in", values, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeBetween(String value1, String value2) {
            addCriterion("socialCreditCode between", value1, value2, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeNotBetween(String value1, String value2) {
            addCriterion("socialCreditCode not between", value1, value2, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andExpiresendIsNull() {
            addCriterion("expiresEnd is null");
            return (Criteria) this;
        }

        public Criteria andExpiresendIsNotNull() {
            addCriterion("expiresEnd is not null");
            return (Criteria) this;
        }

        public Criteria andExpiresendEqualTo(String value) {
            addCriterion("expiresEnd =", value, "expiresend");
            return (Criteria) this;
        }

        public Criteria andExpiresendNotEqualTo(String value) {
            addCriterion("expiresEnd <>", value, "expiresend");
            return (Criteria) this;
        }

        public Criteria andExpiresendGreaterThan(String value) {
            addCriterion("expiresEnd >", value, "expiresend");
            return (Criteria) this;
        }

        public Criteria andExpiresendGreaterThanOrEqualTo(String value) {
            addCriterion("expiresEnd >=", value, "expiresend");
            return (Criteria) this;
        }

        public Criteria andExpiresendLessThan(String value) {
            addCriterion("expiresEnd <", value, "expiresend");
            return (Criteria) this;
        }

        public Criteria andExpiresendLessThanOrEqualTo(String value) {
            addCriterion("expiresEnd <=", value, "expiresend");
            return (Criteria) this;
        }

        public Criteria andExpiresendLike(String value) {
            addCriterion("expiresEnd like", value, "expiresend");
            return (Criteria) this;
        }

        public Criteria andExpiresendNotLike(String value) {
            addCriterion("expiresEnd not like", value, "expiresend");
            return (Criteria) this;
        }

        public Criteria andExpiresendIn(List<String> values) {
            addCriterion("expiresEnd in", values, "expiresend");
            return (Criteria) this;
        }

        public Criteria andExpiresendNotIn(List<String> values) {
            addCriterion("expiresEnd not in", values, "expiresend");
            return (Criteria) this;
        }

        public Criteria andExpiresendBetween(String value1, String value2) {
            addCriterion("expiresEnd between", value1, value2, "expiresend");
            return (Criteria) this;
        }

        public Criteria andExpiresendNotBetween(String value1, String value2) {
            addCriterion("expiresEnd not between", value1, value2, "expiresend");
            return (Criteria) this;
        }

        public Criteria andCertorganizationIsNull() {
            addCriterion("certOrganization is null");
            return (Criteria) this;
        }

        public Criteria andCertorganizationIsNotNull() {
            addCriterion("certOrganization is not null");
            return (Criteria) this;
        }

        public Criteria andCertorganizationEqualTo(String value) {
            addCriterion("certOrganization =", value, "certorganization");
            return (Criteria) this;
        }

        public Criteria andCertorganizationNotEqualTo(String value) {
            addCriterion("certOrganization <>", value, "certorganization");
            return (Criteria) this;
        }

        public Criteria andCertorganizationGreaterThan(String value) {
            addCriterion("certOrganization >", value, "certorganization");
            return (Criteria) this;
        }

        public Criteria andCertorganizationGreaterThanOrEqualTo(String value) {
            addCriterion("certOrganization >=", value, "certorganization");
            return (Criteria) this;
        }

        public Criteria andCertorganizationLessThan(String value) {
            addCriterion("certOrganization <", value, "certorganization");
            return (Criteria) this;
        }

        public Criteria andCertorganizationLessThanOrEqualTo(String value) {
            addCriterion("certOrganization <=", value, "certorganization");
            return (Criteria) this;
        }

        public Criteria andCertorganizationLike(String value) {
            addCriterion("certOrganization like", value, "certorganization");
            return (Criteria) this;
        }

        public Criteria andCertorganizationNotLike(String value) {
            addCriterion("certOrganization not like", value, "certorganization");
            return (Criteria) this;
        }

        public Criteria andCertorganizationIn(List<String> values) {
            addCriterion("certOrganization in", values, "certorganization");
            return (Criteria) this;
        }

        public Criteria andCertorganizationNotIn(List<String> values) {
            addCriterion("certOrganization not in", values, "certorganization");
            return (Criteria) this;
        }

        public Criteria andCertorganizationBetween(String value1, String value2) {
            addCriterion("certOrganization between", value1, value2, "certorganization");
            return (Criteria) this;
        }

        public Criteria andCertorganizationNotBetween(String value1, String value2) {
            addCriterion("certOrganization not between", value1, value2, "certorganization");
            return (Criteria) this;
        }

        public Criteria andContactoraddressIsNull() {
            addCriterion("contactorAddress is null");
            return (Criteria) this;
        }

        public Criteria andContactoraddressIsNotNull() {
            addCriterion("contactorAddress is not null");
            return (Criteria) this;
        }

        public Criteria andContactoraddressEqualTo(String value) {
            addCriterion("contactorAddress =", value, "contactoraddress");
            return (Criteria) this;
        }

        public Criteria andContactoraddressNotEqualTo(String value) {
            addCriterion("contactorAddress <>", value, "contactoraddress");
            return (Criteria) this;
        }

        public Criteria andContactoraddressGreaterThan(String value) {
            addCriterion("contactorAddress >", value, "contactoraddress");
            return (Criteria) this;
        }

        public Criteria andContactoraddressGreaterThanOrEqualTo(String value) {
            addCriterion("contactorAddress >=", value, "contactoraddress");
            return (Criteria) this;
        }

        public Criteria andContactoraddressLessThan(String value) {
            addCriterion("contactorAddress <", value, "contactoraddress");
            return (Criteria) this;
        }

        public Criteria andContactoraddressLessThanOrEqualTo(String value) {
            addCriterion("contactorAddress <=", value, "contactoraddress");
            return (Criteria) this;
        }

        public Criteria andContactoraddressLike(String value) {
            addCriterion("contactorAddress like", value, "contactoraddress");
            return (Criteria) this;
        }

        public Criteria andContactoraddressNotLike(String value) {
            addCriterion("contactorAddress not like", value, "contactoraddress");
            return (Criteria) this;
        }

        public Criteria andContactoraddressIn(List<String> values) {
            addCriterion("contactorAddress in", values, "contactoraddress");
            return (Criteria) this;
        }

        public Criteria andContactoraddressNotIn(List<String> values) {
            addCriterion("contactorAddress not in", values, "contactoraddress");
            return (Criteria) this;
        }

        public Criteria andContactoraddressBetween(String value1, String value2) {
            addCriterion("contactorAddress between", value1, value2, "contactoraddress");
            return (Criteria) this;
        }

        public Criteria andContactoraddressNotBetween(String value1, String value2) {
            addCriterion("contactorAddress not between", value1, value2, "contactoraddress");
            return (Criteria) this;
        }

        public Criteria andTaxregisternoIsNull() {
            addCriterion("taxRegisterNo is null");
            return (Criteria) this;
        }

        public Criteria andTaxregisternoIsNotNull() {
            addCriterion("taxRegisterNo is not null");
            return (Criteria) this;
        }

        public Criteria andTaxregisternoEqualTo(String value) {
            addCriterion("taxRegisterNo =", value, "taxregisterno");
            return (Criteria) this;
        }

        public Criteria andTaxregisternoNotEqualTo(String value) {
            addCriterion("taxRegisterNo <>", value, "taxregisterno");
            return (Criteria) this;
        }

        public Criteria andTaxregisternoGreaterThan(String value) {
            addCriterion("taxRegisterNo >", value, "taxregisterno");
            return (Criteria) this;
        }

        public Criteria andTaxregisternoGreaterThanOrEqualTo(String value) {
            addCriterion("taxRegisterNo >=", value, "taxregisterno");
            return (Criteria) this;
        }

        public Criteria andTaxregisternoLessThan(String value) {
            addCriterion("taxRegisterNo <", value, "taxregisterno");
            return (Criteria) this;
        }

        public Criteria andTaxregisternoLessThanOrEqualTo(String value) {
            addCriterion("taxRegisterNo <=", value, "taxregisterno");
            return (Criteria) this;
        }

        public Criteria andTaxregisternoLike(String value) {
            addCriterion("taxRegisterNo like", value, "taxregisterno");
            return (Criteria) this;
        }

        public Criteria andTaxregisternoNotLike(String value) {
            addCriterion("taxRegisterNo not like", value, "taxregisterno");
            return (Criteria) this;
        }

        public Criteria andTaxregisternoIn(List<String> values) {
            addCriterion("taxRegisterNo in", values, "taxregisterno");
            return (Criteria) this;
        }

        public Criteria andTaxregisternoNotIn(List<String> values) {
            addCriterion("taxRegisterNo not in", values, "taxregisterno");
            return (Criteria) this;
        }

        public Criteria andTaxregisternoBetween(String value1, String value2) {
            addCriterion("taxRegisterNo between", value1, value2, "taxregisterno");
            return (Criteria) this;
        }

        public Criteria andTaxregisternoNotBetween(String value1, String value2) {
            addCriterion("taxRegisterNo not between", value1, value2, "taxregisterno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoIsNull() {
            addCriterion("businessLicenseNo is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoIsNotNull() {
            addCriterion("businessLicenseNo is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoEqualTo(String value) {
            addCriterion("businessLicenseNo =", value, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoNotEqualTo(String value) {
            addCriterion("businessLicenseNo <>", value, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoGreaterThan(String value) {
            addCriterion("businessLicenseNo >", value, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoGreaterThanOrEqualTo(String value) {
            addCriterion("businessLicenseNo >=", value, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoLessThan(String value) {
            addCriterion("businessLicenseNo <", value, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoLessThanOrEqualTo(String value) {
            addCriterion("businessLicenseNo <=", value, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoLike(String value) {
            addCriterion("businessLicenseNo like", value, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoNotLike(String value) {
            addCriterion("businessLicenseNo not like", value, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoIn(List<String> values) {
            addCriterion("businessLicenseNo in", values, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoNotIn(List<String> values) {
            addCriterion("businessLicenseNo not in", values, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoBetween(String value1, String value2) {
            addCriterion("businessLicenseNo between", value1, value2, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenoNotBetween(String value1, String value2) {
            addCriterion("businessLicenseNo not between", value1, value2, "businesslicenseno");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNull() {
            addCriterion("auditStatus is null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNotNull() {
            addCriterion("auditStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusEqualTo(Integer value) {
            addCriterion("auditStatus =", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotEqualTo(Integer value) {
            addCriterion("auditStatus <>", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThan(Integer value) {
            addCriterion("auditStatus >", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("auditStatus >=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThan(Integer value) {
            addCriterion("auditStatus <", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThanOrEqualTo(Integer value) {
            addCriterion("auditStatus <=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIn(List<Integer> values) {
            addCriterion("auditStatus in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotIn(List<Integer> values) {
            addCriterion("auditStatus not in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusBetween(Integer value1, Integer value2) {
            addCriterion("auditStatus between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("auditStatus not between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditqfiiIsNull() {
            addCriterion("auditQfii is null");
            return (Criteria) this;
        }

        public Criteria andAuditqfiiIsNotNull() {
            addCriterion("auditQfii is not null");
            return (Criteria) this;
        }

        public Criteria andAuditqfiiEqualTo(Integer value) {
            addCriterion("auditQfii =", value, "auditqfii");
            return (Criteria) this;
        }

        public Criteria andAuditqfiiNotEqualTo(Integer value) {
            addCriterion("auditQfii <>", value, "auditqfii");
            return (Criteria) this;
        }

        public Criteria andAuditqfiiGreaterThan(Integer value) {
            addCriterion("auditQfii >", value, "auditqfii");
            return (Criteria) this;
        }

        public Criteria andAuditqfiiGreaterThanOrEqualTo(Integer value) {
            addCriterion("auditQfii >=", value, "auditqfii");
            return (Criteria) this;
        }

        public Criteria andAuditqfiiLessThan(Integer value) {
            addCriterion("auditQfii <", value, "auditqfii");
            return (Criteria) this;
        }

        public Criteria andAuditqfiiLessThanOrEqualTo(Integer value) {
            addCriterion("auditQfii <=", value, "auditqfii");
            return (Criteria) this;
        }

        public Criteria andAuditqfiiIn(List<Integer> values) {
            addCriterion("auditQfii in", values, "auditqfii");
            return (Criteria) this;
        }

        public Criteria andAuditqfiiNotIn(List<Integer> values) {
            addCriterion("auditQfii not in", values, "auditqfii");
            return (Criteria) this;
        }

        public Criteria andAuditqfiiBetween(Integer value1, Integer value2) {
            addCriterion("auditQfii between", value1, value2, "auditqfii");
            return (Criteria) this;
        }

        public Criteria andAuditqfiiNotBetween(Integer value1, Integer value2) {
            addCriterion("auditQfii not between", value1, value2, "auditqfii");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNull() {
            addCriterion("audittime is null");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNotNull() {
            addCriterion("audittime is not null");
            return (Criteria) this;
        }

        public Criteria andAudittimeEqualTo(String value) {
            addCriterion("audittime =", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotEqualTo(String value) {
            addCriterion("audittime <>", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThan(String value) {
            addCriterion("audittime >", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThanOrEqualTo(String value) {
            addCriterion("audittime >=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThan(String value) {
            addCriterion("audittime <", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThanOrEqualTo(String value) {
            addCriterion("audittime <=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLike(String value) {
            addCriterion("audittime like", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotLike(String value) {
            addCriterion("audittime not like", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeIn(List<String> values) {
            addCriterion("audittime in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotIn(List<String> values) {
            addCriterion("audittime not in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeBetween(String value1, String value2) {
            addCriterion("audittime between", value1, value2, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotBetween(String value1, String value2) {
            addCriterion("audittime not between", value1, value2, "audittime");
            return (Criteria) this;
        }

        public Criteria andAuditqfiitimeIsNull() {
            addCriterion("auditqfiitime is null");
            return (Criteria) this;
        }

        public Criteria andAuditqfiitimeIsNotNull() {
            addCriterion("auditqfiitime is not null");
            return (Criteria) this;
        }

        public Criteria andAuditqfiitimeEqualTo(String value) {
            addCriterion("auditqfiitime =", value, "auditqfiitime");
            return (Criteria) this;
        }

        public Criteria andAuditqfiitimeNotEqualTo(String value) {
            addCriterion("auditqfiitime <>", value, "auditqfiitime");
            return (Criteria) this;
        }

        public Criteria andAuditqfiitimeGreaterThan(String value) {
            addCriterion("auditqfiitime >", value, "auditqfiitime");
            return (Criteria) this;
        }

        public Criteria andAuditqfiitimeGreaterThanOrEqualTo(String value) {
            addCriterion("auditqfiitime >=", value, "auditqfiitime");
            return (Criteria) this;
        }

        public Criteria andAuditqfiitimeLessThan(String value) {
            addCriterion("auditqfiitime <", value, "auditqfiitime");
            return (Criteria) this;
        }

        public Criteria andAuditqfiitimeLessThanOrEqualTo(String value) {
            addCriterion("auditqfiitime <=", value, "auditqfiitime");
            return (Criteria) this;
        }

        public Criteria andAuditqfiitimeLike(String value) {
            addCriterion("auditqfiitime like", value, "auditqfiitime");
            return (Criteria) this;
        }

        public Criteria andAuditqfiitimeNotLike(String value) {
            addCriterion("auditqfiitime not like", value, "auditqfiitime");
            return (Criteria) this;
        }

        public Criteria andAuditqfiitimeIn(List<String> values) {
            addCriterion("auditqfiitime in", values, "auditqfiitime");
            return (Criteria) this;
        }

        public Criteria andAuditqfiitimeNotIn(List<String> values) {
            addCriterion("auditqfiitime not in", values, "auditqfiitime");
            return (Criteria) this;
        }

        public Criteria andAuditqfiitimeBetween(String value1, String value2) {
            addCriterion("auditqfiitime between", value1, value2, "auditqfiitime");
            return (Criteria) this;
        }

        public Criteria andAuditqfiitimeNotBetween(String value1, String value2) {
            addCriterion("auditqfiitime not between", value1, value2, "auditqfiitime");
            return (Criteria) this;
        }

        public Criteria andAuditstatusfailreasonIsNull() {
            addCriterion("auditStatusFailReason is null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusfailreasonIsNotNull() {
            addCriterion("auditStatusFailReason is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusfailreasonEqualTo(String value) {
            addCriterion("auditStatusFailReason =", value, "auditstatusfailreason");
            return (Criteria) this;
        }

        public Criteria andAuditstatusfailreasonNotEqualTo(String value) {
            addCriterion("auditStatusFailReason <>", value, "auditstatusfailreason");
            return (Criteria) this;
        }

        public Criteria andAuditstatusfailreasonGreaterThan(String value) {
            addCriterion("auditStatusFailReason >", value, "auditstatusfailreason");
            return (Criteria) this;
        }

        public Criteria andAuditstatusfailreasonGreaterThanOrEqualTo(String value) {
            addCriterion("auditStatusFailReason >=", value, "auditstatusfailreason");
            return (Criteria) this;
        }

        public Criteria andAuditstatusfailreasonLessThan(String value) {
            addCriterion("auditStatusFailReason <", value, "auditstatusfailreason");
            return (Criteria) this;
        }

        public Criteria andAuditstatusfailreasonLessThanOrEqualTo(String value) {
            addCriterion("auditStatusFailReason <=", value, "auditstatusfailreason");
            return (Criteria) this;
        }

        public Criteria andAuditstatusfailreasonLike(String value) {
            addCriterion("auditStatusFailReason like", value, "auditstatusfailreason");
            return (Criteria) this;
        }

        public Criteria andAuditstatusfailreasonNotLike(String value) {
            addCriterion("auditStatusFailReason not like", value, "auditstatusfailreason");
            return (Criteria) this;
        }

        public Criteria andAuditstatusfailreasonIn(List<String> values) {
            addCriterion("auditStatusFailReason in", values, "auditstatusfailreason");
            return (Criteria) this;
        }

        public Criteria andAuditstatusfailreasonNotIn(List<String> values) {
            addCriterion("auditStatusFailReason not in", values, "auditstatusfailreason");
            return (Criteria) this;
        }

        public Criteria andAuditstatusfailreasonBetween(String value1, String value2) {
            addCriterion("auditStatusFailReason between", value1, value2, "auditstatusfailreason");
            return (Criteria) this;
        }

        public Criteria andAuditstatusfailreasonNotBetween(String value1, String value2) {
            addCriterion("auditStatusFailReason not between", value1, value2, "auditstatusfailreason");
            return (Criteria) this;
        }

        public Criteria andAuditqfiifailreasonIsNull() {
            addCriterion("auditQfiiFailReason is null");
            return (Criteria) this;
        }

        public Criteria andAuditqfiifailreasonIsNotNull() {
            addCriterion("auditQfiiFailReason is not null");
            return (Criteria) this;
        }

        public Criteria andAuditqfiifailreasonEqualTo(String value) {
            addCriterion("auditQfiiFailReason =", value, "auditqfiifailreason");
            return (Criteria) this;
        }

        public Criteria andAuditqfiifailreasonNotEqualTo(String value) {
            addCriterion("auditQfiiFailReason <>", value, "auditqfiifailreason");
            return (Criteria) this;
        }

        public Criteria andAuditqfiifailreasonGreaterThan(String value) {
            addCriterion("auditQfiiFailReason >", value, "auditqfiifailreason");
            return (Criteria) this;
        }

        public Criteria andAuditqfiifailreasonGreaterThanOrEqualTo(String value) {
            addCriterion("auditQfiiFailReason >=", value, "auditqfiifailreason");
            return (Criteria) this;
        }

        public Criteria andAuditqfiifailreasonLessThan(String value) {
            addCriterion("auditQfiiFailReason <", value, "auditqfiifailreason");
            return (Criteria) this;
        }

        public Criteria andAuditqfiifailreasonLessThanOrEqualTo(String value) {
            addCriterion("auditQfiiFailReason <=", value, "auditqfiifailreason");
            return (Criteria) this;
        }

        public Criteria andAuditqfiifailreasonLike(String value) {
            addCriterion("auditQfiiFailReason like", value, "auditqfiifailreason");
            return (Criteria) this;
        }

        public Criteria andAuditqfiifailreasonNotLike(String value) {
            addCriterion("auditQfiiFailReason not like", value, "auditqfiifailreason");
            return (Criteria) this;
        }

        public Criteria andAuditqfiifailreasonIn(List<String> values) {
            addCriterion("auditQfiiFailReason in", values, "auditqfiifailreason");
            return (Criteria) this;
        }

        public Criteria andAuditqfiifailreasonNotIn(List<String> values) {
            addCriterion("auditQfiiFailReason not in", values, "auditqfiifailreason");
            return (Criteria) this;
        }

        public Criteria andAuditqfiifailreasonBetween(String value1, String value2) {
            addCriterion("auditQfiiFailReason between", value1, value2, "auditqfiifailreason");
            return (Criteria) this;
        }

        public Criteria andAuditqfiifailreasonNotBetween(String value1, String value2) {
            addCriterion("auditQfiiFailReason not between", value1, value2, "auditqfiifailreason");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterIsNull() {
            addCriterion("merchant_register is null");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterIsNotNull() {
            addCriterion("merchant_register is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterEqualTo(Byte value) {
            addCriterion("merchant_register =", value, "merchantRegister");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterNotEqualTo(Byte value) {
            addCriterion("merchant_register <>", value, "merchantRegister");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterGreaterThan(Byte value) {
            addCriterion("merchant_register >", value, "merchantRegister");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterGreaterThanOrEqualTo(Byte value) {
            addCriterion("merchant_register >=", value, "merchantRegister");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterLessThan(Byte value) {
            addCriterion("merchant_register <", value, "merchantRegister");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterLessThanOrEqualTo(Byte value) {
            addCriterion("merchant_register <=", value, "merchantRegister");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterIn(List<Byte> values) {
            addCriterion("merchant_register in", values, "merchantRegister");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterNotIn(List<Byte> values) {
            addCriterion("merchant_register not in", values, "merchantRegister");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterBetween(Byte value1, Byte value2) {
            addCriterion("merchant_register between", value1, value2, "merchantRegister");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterNotBetween(Byte value1, Byte value2) {
            addCriterion("merchant_register not between", value1, value2, "merchantRegister");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterTimeIsNull() {
            addCriterion("merchant_register_time is null");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterTimeIsNotNull() {
            addCriterion("merchant_register_time is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterTimeEqualTo(Date value) {
            addCriterion("merchant_register_time =", value, "merchantRegisterTime");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterTimeNotEqualTo(Date value) {
            addCriterion("merchant_register_time <>", value, "merchantRegisterTime");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterTimeGreaterThan(Date value) {
            addCriterion("merchant_register_time >", value, "merchantRegisterTime");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("merchant_register_time >=", value, "merchantRegisterTime");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterTimeLessThan(Date value) {
            addCriterion("merchant_register_time <", value, "merchantRegisterTime");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("merchant_register_time <=", value, "merchantRegisterTime");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterTimeIn(List<Date> values) {
            addCriterion("merchant_register_time in", values, "merchantRegisterTime");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterTimeNotIn(List<Date> values) {
            addCriterion("merchant_register_time not in", values, "merchantRegisterTime");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("merchant_register_time between", value1, value2, "merchantRegisterTime");
            return (Criteria) this;
        }

        public Criteria andMerchantRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("merchant_register_time not between", value1, value2, "merchantRegisterTime");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthIsNull() {
            addCriterion("merchant_auth is null");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthIsNotNull() {
            addCriterion("merchant_auth is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthEqualTo(Byte value) {
            addCriterion("merchant_auth =", value, "merchantAuth");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthNotEqualTo(Byte value) {
            addCriterion("merchant_auth <>", value, "merchantAuth");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthGreaterThan(Byte value) {
            addCriterion("merchant_auth >", value, "merchantAuth");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthGreaterThanOrEqualTo(Byte value) {
            addCriterion("merchant_auth >=", value, "merchantAuth");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthLessThan(Byte value) {
            addCriterion("merchant_auth <", value, "merchantAuth");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthLessThanOrEqualTo(Byte value) {
            addCriterion("merchant_auth <=", value, "merchantAuth");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthIn(List<Byte> values) {
            addCriterion("merchant_auth in", values, "merchantAuth");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthNotIn(List<Byte> values) {
            addCriterion("merchant_auth not in", values, "merchantAuth");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthBetween(Byte value1, Byte value2) {
            addCriterion("merchant_auth between", value1, value2, "merchantAuth");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthNotBetween(Byte value1, Byte value2) {
            addCriterion("merchant_auth not between", value1, value2, "merchantAuth");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthTimeIsNull() {
            addCriterion("merchant_auth_time is null");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthTimeIsNotNull() {
            addCriterion("merchant_auth_time is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthTimeEqualTo(Date value) {
            addCriterion("merchant_auth_time =", value, "merchantAuthTime");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthTimeNotEqualTo(Date value) {
            addCriterion("merchant_auth_time <>", value, "merchantAuthTime");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthTimeGreaterThan(Date value) {
            addCriterion("merchant_auth_time >", value, "merchantAuthTime");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("merchant_auth_time >=", value, "merchantAuthTime");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthTimeLessThan(Date value) {
            addCriterion("merchant_auth_time <", value, "merchantAuthTime");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthTimeLessThanOrEqualTo(Date value) {
            addCriterion("merchant_auth_time <=", value, "merchantAuthTime");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthTimeIn(List<Date> values) {
            addCriterion("merchant_auth_time in", values, "merchantAuthTime");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthTimeNotIn(List<Date> values) {
            addCriterion("merchant_auth_time not in", values, "merchantAuthTime");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthTimeBetween(Date value1, Date value2) {
            addCriterion("merchant_auth_time between", value1, value2, "merchantAuthTime");
            return (Criteria) this;
        }

        public Criteria andMerchantAuthTimeNotBetween(Date value1, Date value2) {
            addCriterion("merchant_auth_time not between", value1, value2, "merchantAuthTime");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningIsNull() {
            addCriterion("merchant_opening is null");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningIsNotNull() {
            addCriterion("merchant_opening is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningEqualTo(Byte value) {
            addCriterion("merchant_opening =", value, "merchantOpening");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningNotEqualTo(Byte value) {
            addCriterion("merchant_opening <>", value, "merchantOpening");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningGreaterThan(Byte value) {
            addCriterion("merchant_opening >", value, "merchantOpening");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningGreaterThanOrEqualTo(Byte value) {
            addCriterion("merchant_opening >=", value, "merchantOpening");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningLessThan(Byte value) {
            addCriterion("merchant_opening <", value, "merchantOpening");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningLessThanOrEqualTo(Byte value) {
            addCriterion("merchant_opening <=", value, "merchantOpening");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningIn(List<Byte> values) {
            addCriterion("merchant_opening in", values, "merchantOpening");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningNotIn(List<Byte> values) {
            addCriterion("merchant_opening not in", values, "merchantOpening");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningBetween(Byte value1, Byte value2) {
            addCriterion("merchant_opening between", value1, value2, "merchantOpening");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningNotBetween(Byte value1, Byte value2) {
            addCriterion("merchant_opening not between", value1, value2, "merchantOpening");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningTimeIsNull() {
            addCriterion("merchant_opening_time is null");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningTimeIsNotNull() {
            addCriterion("merchant_opening_time is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningTimeEqualTo(Date value) {
            addCriterion("merchant_opening_time =", value, "merchantOpeningTime");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningTimeNotEqualTo(Date value) {
            addCriterion("merchant_opening_time <>", value, "merchantOpeningTime");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningTimeGreaterThan(Date value) {
            addCriterion("merchant_opening_time >", value, "merchantOpeningTime");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("merchant_opening_time >=", value, "merchantOpeningTime");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningTimeLessThan(Date value) {
            addCriterion("merchant_opening_time <", value, "merchantOpeningTime");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningTimeLessThanOrEqualTo(Date value) {
            addCriterion("merchant_opening_time <=", value, "merchantOpeningTime");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningTimeIn(List<Date> values) {
            addCriterion("merchant_opening_time in", values, "merchantOpeningTime");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningTimeNotIn(List<Date> values) {
            addCriterion("merchant_opening_time not in", values, "merchantOpeningTime");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningTimeBetween(Date value1, Date value2) {
            addCriterion("merchant_opening_time between", value1, value2, "merchantOpeningTime");
            return (Criteria) this;
        }

        public Criteria andMerchantOpeningTimeNotBetween(Date value1, Date value2) {
            addCriterion("merchant_opening_time not between", value1, value2, "merchantOpeningTime");
            return (Criteria) this;
        }

        public Criteria andFundOpeningIsNull() {
            addCriterion("fund_opening is null");
            return (Criteria) this;
        }

        public Criteria andFundOpeningIsNotNull() {
            addCriterion("fund_opening is not null");
            return (Criteria) this;
        }

        public Criteria andFundOpeningEqualTo(Byte value) {
            addCriterion("fund_opening =", value, "fundOpening");
            return (Criteria) this;
        }

        public Criteria andFundOpeningNotEqualTo(Byte value) {
            addCriterion("fund_opening <>", value, "fundOpening");
            return (Criteria) this;
        }

        public Criteria andFundOpeningGreaterThan(Byte value) {
            addCriterion("fund_opening >", value, "fundOpening");
            return (Criteria) this;
        }

        public Criteria andFundOpeningGreaterThanOrEqualTo(Byte value) {
            addCriterion("fund_opening >=", value, "fundOpening");
            return (Criteria) this;
        }

        public Criteria andFundOpeningLessThan(Byte value) {
            addCriterion("fund_opening <", value, "fundOpening");
            return (Criteria) this;
        }

        public Criteria andFundOpeningLessThanOrEqualTo(Byte value) {
            addCriterion("fund_opening <=", value, "fundOpening");
            return (Criteria) this;
        }

        public Criteria andFundOpeningIn(List<Byte> values) {
            addCriterion("fund_opening in", values, "fundOpening");
            return (Criteria) this;
        }

        public Criteria andFundOpeningNotIn(List<Byte> values) {
            addCriterion("fund_opening not in", values, "fundOpening");
            return (Criteria) this;
        }

        public Criteria andFundOpeningBetween(Byte value1, Byte value2) {
            addCriterion("fund_opening between", value1, value2, "fundOpening");
            return (Criteria) this;
        }

        public Criteria andFundOpeningNotBetween(Byte value1, Byte value2) {
            addCriterion("fund_opening not between", value1, value2, "fundOpening");
            return (Criteria) this;
        }

        public Criteria andFundOpeningTimeIsNull() {
            addCriterion("fund_opening_time is null");
            return (Criteria) this;
        }

        public Criteria andFundOpeningTimeIsNotNull() {
            addCriterion("fund_opening_time is not null");
            return (Criteria) this;
        }

        public Criteria andFundOpeningTimeEqualTo(Date value) {
            addCriterion("fund_opening_time =", value, "fundOpeningTime");
            return (Criteria) this;
        }

        public Criteria andFundOpeningTimeNotEqualTo(Date value) {
            addCriterion("fund_opening_time <>", value, "fundOpeningTime");
            return (Criteria) this;
        }

        public Criteria andFundOpeningTimeGreaterThan(Date value) {
            addCriterion("fund_opening_time >", value, "fundOpeningTime");
            return (Criteria) this;
        }

        public Criteria andFundOpeningTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fund_opening_time >=", value, "fundOpeningTime");
            return (Criteria) this;
        }

        public Criteria andFundOpeningTimeLessThan(Date value) {
            addCriterion("fund_opening_time <", value, "fundOpeningTime");
            return (Criteria) this;
        }

        public Criteria andFundOpeningTimeLessThanOrEqualTo(Date value) {
            addCriterion("fund_opening_time <=", value, "fundOpeningTime");
            return (Criteria) this;
        }

        public Criteria andFundOpeningTimeIn(List<Date> values) {
            addCriterion("fund_opening_time in", values, "fundOpeningTime");
            return (Criteria) this;
        }

        public Criteria andFundOpeningTimeNotIn(List<Date> values) {
            addCriterion("fund_opening_time not in", values, "fundOpeningTime");
            return (Criteria) this;
        }

        public Criteria andFundOpeningTimeBetween(Date value1, Date value2) {
            addCriterion("fund_opening_time between", value1, value2, "fundOpeningTime");
            return (Criteria) this;
        }

        public Criteria andFundOpeningTimeNotBetween(Date value1, Date value2) {
            addCriterion("fund_opening_time not between", value1, value2, "fundOpeningTime");
            return (Criteria) this;
        }

        public Criteria andMerchantFailReasonIsNull() {
            addCriterion("merchant_fail_reason is null");
            return (Criteria) this;
        }

        public Criteria andMerchantFailReasonIsNotNull() {
            addCriterion("merchant_fail_reason is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantFailReasonEqualTo(String value) {
            addCriterion("merchant_fail_reason =", value, "merchantFailReason");
            return (Criteria) this;
        }

        public Criteria andMerchantFailReasonNotEqualTo(String value) {
            addCriterion("merchant_fail_reason <>", value, "merchantFailReason");
            return (Criteria) this;
        }

        public Criteria andMerchantFailReasonGreaterThan(String value) {
            addCriterion("merchant_fail_reason >", value, "merchantFailReason");
            return (Criteria) this;
        }

        public Criteria andMerchantFailReasonGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_fail_reason >=", value, "merchantFailReason");
            return (Criteria) this;
        }

        public Criteria andMerchantFailReasonLessThan(String value) {
            addCriterion("merchant_fail_reason <", value, "merchantFailReason");
            return (Criteria) this;
        }

        public Criteria andMerchantFailReasonLessThanOrEqualTo(String value) {
            addCriterion("merchant_fail_reason <=", value, "merchantFailReason");
            return (Criteria) this;
        }

        public Criteria andMerchantFailReasonLike(String value) {
            addCriterion("merchant_fail_reason like", value, "merchantFailReason");
            return (Criteria) this;
        }

        public Criteria andMerchantFailReasonNotLike(String value) {
            addCriterion("merchant_fail_reason not like", value, "merchantFailReason");
            return (Criteria) this;
        }

        public Criteria andMerchantFailReasonIn(List<String> values) {
            addCriterion("merchant_fail_reason in", values, "merchantFailReason");
            return (Criteria) this;
        }

        public Criteria andMerchantFailReasonNotIn(List<String> values) {
            addCriterion("merchant_fail_reason not in", values, "merchantFailReason");
            return (Criteria) this;
        }

        public Criteria andMerchantFailReasonBetween(String value1, String value2) {
            addCriterion("merchant_fail_reason between", value1, value2, "merchantFailReason");
            return (Criteria) this;
        }

        public Criteria andMerchantFailReasonNotBetween(String value1, String value2) {
            addCriterion("merchant_fail_reason not between", value1, value2, "merchantFailReason");
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

        public Criteria andHsApiDataIsNull() {
            addCriterion("hs_api_data is null");
            return (Criteria) this;
        }

        public Criteria andHsApiDataIsNotNull() {
            addCriterion("hs_api_data is not null");
            return (Criteria) this;
        }

        public Criteria andHsApiDataEqualTo(String value) {
            addCriterion("hs_api_data =", value, "hsApiData");
            return (Criteria) this;
        }

        public Criteria andHsApiDataNotEqualTo(String value) {
            addCriterion("hs_api_data <>", value, "hsApiData");
            return (Criteria) this;
        }

        public Criteria andHsApiDataGreaterThan(String value) {
            addCriterion("hs_api_data >", value, "hsApiData");
            return (Criteria) this;
        }

        public Criteria andHsApiDataGreaterThanOrEqualTo(String value) {
            addCriterion("hs_api_data >=", value, "hsApiData");
            return (Criteria) this;
        }

        public Criteria andHsApiDataLessThan(String value) {
            addCriterion("hs_api_data <", value, "hsApiData");
            return (Criteria) this;
        }

        public Criteria andHsApiDataLessThanOrEqualTo(String value) {
            addCriterion("hs_api_data <=", value, "hsApiData");
            return (Criteria) this;
        }

        public Criteria andHsApiDataLike(String value) {
            addCriterion("hs_api_data like", value, "hsApiData");
            return (Criteria) this;
        }

        public Criteria andHsApiDataNotLike(String value) {
            addCriterion("hs_api_data not like", value, "hsApiData");
            return (Criteria) this;
        }

        public Criteria andHsApiDataIn(List<String> values) {
            addCriterion("hs_api_data in", values, "hsApiData");
            return (Criteria) this;
        }

        public Criteria andHsApiDataNotIn(List<String> values) {
            addCriterion("hs_api_data not in", values, "hsApiData");
            return (Criteria) this;
        }

        public Criteria andHsApiDataBetween(String value1, String value2) {
            addCriterion("hs_api_data between", value1, value2, "hsApiData");
            return (Criteria) this;
        }

        public Criteria andHsApiDataNotBetween(String value1, String value2) {
            addCriterion("hs_api_data not between", value1, value2, "hsApiData");
            return (Criteria) this;
        }

        public Criteria andFundApiDataIsNull() {
            addCriterion("fund_api_data is null");
            return (Criteria) this;
        }

        public Criteria andFundApiDataIsNotNull() {
            addCriterion("fund_api_data is not null");
            return (Criteria) this;
        }

        public Criteria andFundApiDataEqualTo(String value) {
            addCriterion("fund_api_data =", value, "fundApiData");
            return (Criteria) this;
        }

        public Criteria andFundApiDataNotEqualTo(String value) {
            addCriterion("fund_api_data <>", value, "fundApiData");
            return (Criteria) this;
        }

        public Criteria andFundApiDataGreaterThan(String value) {
            addCriterion("fund_api_data >", value, "fundApiData");
            return (Criteria) this;
        }

        public Criteria andFundApiDataGreaterThanOrEqualTo(String value) {
            addCriterion("fund_api_data >=", value, "fundApiData");
            return (Criteria) this;
        }

        public Criteria andFundApiDataLessThan(String value) {
            addCriterion("fund_api_data <", value, "fundApiData");
            return (Criteria) this;
        }

        public Criteria andFundApiDataLessThanOrEqualTo(String value) {
            addCriterion("fund_api_data <=", value, "fundApiData");
            return (Criteria) this;
        }

        public Criteria andFundApiDataLike(String value) {
            addCriterion("fund_api_data like", value, "fundApiData");
            return (Criteria) this;
        }

        public Criteria andFundApiDataNotLike(String value) {
            addCriterion("fund_api_data not like", value, "fundApiData");
            return (Criteria) this;
        }

        public Criteria andFundApiDataIn(List<String> values) {
            addCriterion("fund_api_data in", values, "fundApiData");
            return (Criteria) this;
        }

        public Criteria andFundApiDataNotIn(List<String> values) {
            addCriterion("fund_api_data not in", values, "fundApiData");
            return (Criteria) this;
        }

        public Criteria andFundApiDataBetween(String value1, String value2) {
            addCriterion("fund_api_data between", value1, value2, "fundApiData");
            return (Criteria) this;
        }

        public Criteria andFundApiDataNotBetween(String value1, String value2) {
            addCriterion("fund_api_data not between", value1, value2, "fundApiData");
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