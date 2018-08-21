package cn.yilucaifu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Byte value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Byte value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Byte value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Byte value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Byte value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Byte value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Byte> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Byte> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Byte value1, Byte value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Byte value1, Byte value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessIsNull() {
            addCriterion("company_business is null");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessIsNotNull() {
            addCriterion("company_business is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessEqualTo(Integer value) {
            addCriterion("company_business =", value, "companyBusiness");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessNotEqualTo(Integer value) {
            addCriterion("company_business <>", value, "companyBusiness");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessGreaterThan(Integer value) {
            addCriterion("company_business >", value, "companyBusiness");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_business >=", value, "companyBusiness");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLessThan(Integer value) {
            addCriterion("company_business <", value, "companyBusiness");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessLessThanOrEqualTo(Integer value) {
            addCriterion("company_business <=", value, "companyBusiness");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessIn(List<Integer> values) {
            addCriterion("company_business in", values, "companyBusiness");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessNotIn(List<Integer> values) {
            addCriterion("company_business not in", values, "companyBusiness");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessBetween(Integer value1, Integer value2) {
            addCriterion("company_business between", value1, value2, "companyBusiness");
            return (Criteria) this;
        }

        public Criteria andCompanyBusinessNotBetween(Integer value1, Integer value2) {
            addCriterion("company_business not between", value1, value2, "companyBusiness");
            return (Criteria) this;
        }

        public Criteria andCompanyNumIsNull() {
            addCriterion("company_num is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNumIsNotNull() {
            addCriterion("company_num is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNumEqualTo(Integer value) {
            addCriterion("company_num =", value, "companyNum");
            return (Criteria) this;
        }

        public Criteria andCompanyNumNotEqualTo(Integer value) {
            addCriterion("company_num <>", value, "companyNum");
            return (Criteria) this;
        }

        public Criteria andCompanyNumGreaterThan(Integer value) {
            addCriterion("company_num >", value, "companyNum");
            return (Criteria) this;
        }

        public Criteria andCompanyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_num >=", value, "companyNum");
            return (Criteria) this;
        }

        public Criteria andCompanyNumLessThan(Integer value) {
            addCriterion("company_num <", value, "companyNum");
            return (Criteria) this;
        }

        public Criteria andCompanyNumLessThanOrEqualTo(Integer value) {
            addCriterion("company_num <=", value, "companyNum");
            return (Criteria) this;
        }

        public Criteria andCompanyNumIn(List<Integer> values) {
            addCriterion("company_num in", values, "companyNum");
            return (Criteria) this;
        }

        public Criteria andCompanyNumNotIn(List<Integer> values) {
            addCriterion("company_num not in", values, "companyNum");
            return (Criteria) this;
        }

        public Criteria andCompanyNumBetween(Integer value1, Integer value2) {
            addCriterion("company_num between", value1, value2, "companyNum");
            return (Criteria) this;
        }

        public Criteria andCompanyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("company_num not between", value1, value2, "companyNum");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNull() {
            addCriterion("company_type is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("company_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeEqualTo(Integer value) {
            addCriterion("company_type =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(Integer value) {
            addCriterion("company_type <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(Integer value) {
            addCriterion("company_type >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_type >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(Integer value) {
            addCriterion("company_type <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("company_type <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<Integer> values) {
            addCriterion("company_type in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<Integer> values) {
            addCriterion("company_type not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(Integer value1, Integer value2) {
            addCriterion("company_type between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("company_type not between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyProvIsNull() {
            addCriterion("company_prov is null");
            return (Criteria) this;
        }

        public Criteria andCompanyProvIsNotNull() {
            addCriterion("company_prov is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyProvEqualTo(String value) {
            addCriterion("company_prov =", value, "companyProv");
            return (Criteria) this;
        }

        public Criteria andCompanyProvNotEqualTo(String value) {
            addCriterion("company_prov <>", value, "companyProv");
            return (Criteria) this;
        }

        public Criteria andCompanyProvGreaterThan(String value) {
            addCriterion("company_prov >", value, "companyProv");
            return (Criteria) this;
        }

        public Criteria andCompanyProvGreaterThanOrEqualTo(String value) {
            addCriterion("company_prov >=", value, "companyProv");
            return (Criteria) this;
        }

        public Criteria andCompanyProvLessThan(String value) {
            addCriterion("company_prov <", value, "companyProv");
            return (Criteria) this;
        }

        public Criteria andCompanyProvLessThanOrEqualTo(String value) {
            addCriterion("company_prov <=", value, "companyProv");
            return (Criteria) this;
        }

        public Criteria andCompanyProvLike(String value) {
            addCriterion("company_prov like", value, "companyProv");
            return (Criteria) this;
        }

        public Criteria andCompanyProvNotLike(String value) {
            addCriterion("company_prov not like", value, "companyProv");
            return (Criteria) this;
        }

        public Criteria andCompanyProvIn(List<String> values) {
            addCriterion("company_prov in", values, "companyProv");
            return (Criteria) this;
        }

        public Criteria andCompanyProvNotIn(List<String> values) {
            addCriterion("company_prov not in", values, "companyProv");
            return (Criteria) this;
        }

        public Criteria andCompanyProvBetween(String value1, String value2) {
            addCriterion("company_prov between", value1, value2, "companyProv");
            return (Criteria) this;
        }

        public Criteria andCompanyProvNotBetween(String value1, String value2) {
            addCriterion("company_prov not between", value1, value2, "companyProv");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIsNull() {
            addCriterion("company_city is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIsNotNull() {
            addCriterion("company_city is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCityEqualTo(String value) {
            addCriterion("company_city =", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNotEqualTo(String value) {
            addCriterion("company_city <>", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityGreaterThan(String value) {
            addCriterion("company_city >", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityGreaterThanOrEqualTo(String value) {
            addCriterion("company_city >=", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityLessThan(String value) {
            addCriterion("company_city <", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityLessThanOrEqualTo(String value) {
            addCriterion("company_city <=", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityLike(String value) {
            addCriterion("company_city like", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNotLike(String value) {
            addCriterion("company_city not like", value, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIn(List<String> values) {
            addCriterion("company_city in", values, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNotIn(List<String> values) {
            addCriterion("company_city not in", values, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityBetween(String value1, String value2) {
            addCriterion("company_city between", value1, value2, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyCityNotBetween(String value1, String value2) {
            addCriterion("company_city not between", value1, value2, "companyCity");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIsNull() {
            addCriterion("company_area is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIsNotNull() {
            addCriterion("company_area is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaEqualTo(String value) {
            addCriterion("company_area =", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaNotEqualTo(String value) {
            addCriterion("company_area <>", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaGreaterThan(String value) {
            addCriterion("company_area >", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaGreaterThanOrEqualTo(String value) {
            addCriterion("company_area >=", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaLessThan(String value) {
            addCriterion("company_area <", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaLessThanOrEqualTo(String value) {
            addCriterion("company_area <=", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaLike(String value) {
            addCriterion("company_area like", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaNotLike(String value) {
            addCriterion("company_area not like", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIn(List<String> values) {
            addCriterion("company_area in", values, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaNotIn(List<String> values) {
            addCriterion("company_area not in", values, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaBetween(String value1, String value2) {
            addCriterion("company_area between", value1, value2, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaNotBetween(String value1, String value2) {
            addCriterion("company_area not between", value1, value2, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAdressIsNull() {
            addCriterion("company_adress is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAdressIsNotNull() {
            addCriterion("company_adress is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAdressEqualTo(String value) {
            addCriterion("company_adress =", value, "companyAdress");
            return (Criteria) this;
        }

        public Criteria andCompanyAdressNotEqualTo(String value) {
            addCriterion("company_adress <>", value, "companyAdress");
            return (Criteria) this;
        }

        public Criteria andCompanyAdressGreaterThan(String value) {
            addCriterion("company_adress >", value, "companyAdress");
            return (Criteria) this;
        }

        public Criteria andCompanyAdressGreaterThanOrEqualTo(String value) {
            addCriterion("company_adress >=", value, "companyAdress");
            return (Criteria) this;
        }

        public Criteria andCompanyAdressLessThan(String value) {
            addCriterion("company_adress <", value, "companyAdress");
            return (Criteria) this;
        }

        public Criteria andCompanyAdressLessThanOrEqualTo(String value) {
            addCriterion("company_adress <=", value, "companyAdress");
            return (Criteria) this;
        }

        public Criteria andCompanyAdressLike(String value) {
            addCriterion("company_adress like", value, "companyAdress");
            return (Criteria) this;
        }

        public Criteria andCompanyAdressNotLike(String value) {
            addCriterion("company_adress not like", value, "companyAdress");
            return (Criteria) this;
        }

        public Criteria andCompanyAdressIn(List<String> values) {
            addCriterion("company_adress in", values, "companyAdress");
            return (Criteria) this;
        }

        public Criteria andCompanyAdressNotIn(List<String> values) {
            addCriterion("company_adress not in", values, "companyAdress");
            return (Criteria) this;
        }

        public Criteria andCompanyAdressBetween(String value1, String value2) {
            addCriterion("company_adress between", value1, value2, "companyAdress");
            return (Criteria) this;
        }

        public Criteria andCompanyAdressNotBetween(String value1, String value2) {
            addCriterion("company_adress not between", value1, value2, "companyAdress");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(Integer value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(Integer value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(Integer value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(Integer value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(Integer value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<Integer> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<Integer> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(Integer value1, Integer value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("operator not between", value1, value2, "operator");
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

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
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

        public Criteria andLastLoginIsNull() {
            addCriterion("last_login is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIsNotNull() {
            addCriterion("last_login is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginEqualTo(Date value) {
            addCriterion("last_login =", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotEqualTo(Date value) {
            addCriterion("last_login <>", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThan(Date value) {
            addCriterion("last_login >", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login >=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThan(Date value) {
            addCriterion("last_login <", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThanOrEqualTo(Date value) {
            addCriterion("last_login <=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginIn(List<Date> values) {
            addCriterion("last_login in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotIn(List<Date> values) {
            addCriterion("last_login not in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginBetween(Date value1, Date value2) {
            addCriterion("last_login between", value1, value2, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotBetween(Date value1, Date value2) {
            addCriterion("last_login not between", value1, value2, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andHsIsOpeningIsNull() {
            addCriterion("hs_is_opening is null");
            return (Criteria) this;
        }

        public Criteria andHsIsOpeningIsNotNull() {
            addCriterion("hs_is_opening is not null");
            return (Criteria) this;
        }

        public Criteria andHsIsOpeningEqualTo(Byte value) {
            addCriterion("hs_is_opening =", value, "hsIsOpening");
            return (Criteria) this;
        }

        public Criteria andHsIsOpeningNotEqualTo(Byte value) {
            addCriterion("hs_is_opening <>", value, "hsIsOpening");
            return (Criteria) this;
        }

        public Criteria andHsIsOpeningGreaterThan(Byte value) {
            addCriterion("hs_is_opening >", value, "hsIsOpening");
            return (Criteria) this;
        }

        public Criteria andHsIsOpeningGreaterThanOrEqualTo(Byte value) {
            addCriterion("hs_is_opening >=", value, "hsIsOpening");
            return (Criteria) this;
        }

        public Criteria andHsIsOpeningLessThan(Byte value) {
            addCriterion("hs_is_opening <", value, "hsIsOpening");
            return (Criteria) this;
        }

        public Criteria andHsIsOpeningLessThanOrEqualTo(Byte value) {
            addCriterion("hs_is_opening <=", value, "hsIsOpening");
            return (Criteria) this;
        }

        public Criteria andHsIsOpeningIn(List<Byte> values) {
            addCriterion("hs_is_opening in", values, "hsIsOpening");
            return (Criteria) this;
        }

        public Criteria andHsIsOpeningNotIn(List<Byte> values) {
            addCriterion("hs_is_opening not in", values, "hsIsOpening");
            return (Criteria) this;
        }

        public Criteria andHsIsOpeningBetween(Byte value1, Byte value2) {
            addCriterion("hs_is_opening between", value1, value2, "hsIsOpening");
            return (Criteria) this;
        }

        public Criteria andHsIsOpeningNotBetween(Byte value1, Byte value2) {
            addCriterion("hs_is_opening not between", value1, value2, "hsIsOpening");
            return (Criteria) this;
        }

        public Criteria andIsopeningIsNull() {
            addCriterion("isOpening is null");
            return (Criteria) this;
        }

        public Criteria andIsopeningIsNotNull() {
            addCriterion("isOpening is not null");
            return (Criteria) this;
        }

        public Criteria andIsopeningEqualTo(Byte value) {
            addCriterion("isOpening =", value, "isopening");
            return (Criteria) this;
        }

        public Criteria andIsopeningNotEqualTo(Byte value) {
            addCriterion("isOpening <>", value, "isopening");
            return (Criteria) this;
        }

        public Criteria andIsopeningGreaterThan(Byte value) {
            addCriterion("isOpening >", value, "isopening");
            return (Criteria) this;
        }

        public Criteria andIsopeningGreaterThanOrEqualTo(Byte value) {
            addCriterion("isOpening >=", value, "isopening");
            return (Criteria) this;
        }

        public Criteria andIsopeningLessThan(Byte value) {
            addCriterion("isOpening <", value, "isopening");
            return (Criteria) this;
        }

        public Criteria andIsopeningLessThanOrEqualTo(Byte value) {
            addCriterion("isOpening <=", value, "isopening");
            return (Criteria) this;
        }

        public Criteria andIsopeningIn(List<Byte> values) {
            addCriterion("isOpening in", values, "isopening");
            return (Criteria) this;
        }

        public Criteria andIsopeningNotIn(List<Byte> values) {
            addCriterion("isOpening not in", values, "isopening");
            return (Criteria) this;
        }

        public Criteria andIsopeningBetween(Byte value1, Byte value2) {
            addCriterion("isOpening between", value1, value2, "isopening");
            return (Criteria) this;
        }

        public Criteria andIsopeningNotBetween(Byte value1, Byte value2) {
            addCriterion("isOpening not between", value1, value2, "isopening");
            return (Criteria) this;
        }

        public Criteria andTranspasswdIsNull() {
            addCriterion("transpasswd is null");
            return (Criteria) this;
        }

        public Criteria andTranspasswdIsNotNull() {
            addCriterion("transpasswd is not null");
            return (Criteria) this;
        }

        public Criteria andTranspasswdEqualTo(String value) {
            addCriterion("transpasswd =", value, "transpasswd");
            return (Criteria) this;
        }

        public Criteria andTranspasswdNotEqualTo(String value) {
            addCriterion("transpasswd <>", value, "transpasswd");
            return (Criteria) this;
        }

        public Criteria andTranspasswdGreaterThan(String value) {
            addCriterion("transpasswd >", value, "transpasswd");
            return (Criteria) this;
        }

        public Criteria andTranspasswdGreaterThanOrEqualTo(String value) {
            addCriterion("transpasswd >=", value, "transpasswd");
            return (Criteria) this;
        }

        public Criteria andTranspasswdLessThan(String value) {
            addCriterion("transpasswd <", value, "transpasswd");
            return (Criteria) this;
        }

        public Criteria andTranspasswdLessThanOrEqualTo(String value) {
            addCriterion("transpasswd <=", value, "transpasswd");
            return (Criteria) this;
        }

        public Criteria andTranspasswdLike(String value) {
            addCriterion("transpasswd like", value, "transpasswd");
            return (Criteria) this;
        }

        public Criteria andTranspasswdNotLike(String value) {
            addCriterion("transpasswd not like", value, "transpasswd");
            return (Criteria) this;
        }

        public Criteria andTranspasswdIn(List<String> values) {
            addCriterion("transpasswd in", values, "transpasswd");
            return (Criteria) this;
        }

        public Criteria andTranspasswdNotIn(List<String> values) {
            addCriterion("transpasswd not in", values, "transpasswd");
            return (Criteria) this;
        }

        public Criteria andTranspasswdBetween(String value1, String value2) {
            addCriterion("transpasswd between", value1, value2, "transpasswd");
            return (Criteria) this;
        }

        public Criteria andTranspasswdNotBetween(String value1, String value2) {
            addCriterion("transpasswd not between", value1, value2, "transpasswd");
            return (Criteria) this;
        }

        public Criteria andFundTranspasswdIsNull() {
            addCriterion("fund_transpasswd is null");
            return (Criteria) this;
        }

        public Criteria andFundTranspasswdIsNotNull() {
            addCriterion("fund_transpasswd is not null");
            return (Criteria) this;
        }

        public Criteria andFundTranspasswdEqualTo(String value) {
            addCriterion("fund_transpasswd =", value, "fundTranspasswd");
            return (Criteria) this;
        }

        public Criteria andFundTranspasswdNotEqualTo(String value) {
            addCriterion("fund_transpasswd <>", value, "fundTranspasswd");
            return (Criteria) this;
        }

        public Criteria andFundTranspasswdGreaterThan(String value) {
            addCriterion("fund_transpasswd >", value, "fundTranspasswd");
            return (Criteria) this;
        }

        public Criteria andFundTranspasswdGreaterThanOrEqualTo(String value) {
            addCriterion("fund_transpasswd >=", value, "fundTranspasswd");
            return (Criteria) this;
        }

        public Criteria andFundTranspasswdLessThan(String value) {
            addCriterion("fund_transpasswd <", value, "fundTranspasswd");
            return (Criteria) this;
        }

        public Criteria andFundTranspasswdLessThanOrEqualTo(String value) {
            addCriterion("fund_transpasswd <=", value, "fundTranspasswd");
            return (Criteria) this;
        }

        public Criteria andFundTranspasswdLike(String value) {
            addCriterion("fund_transpasswd like", value, "fundTranspasswd");
            return (Criteria) this;
        }

        public Criteria andFundTranspasswdNotLike(String value) {
            addCriterion("fund_transpasswd not like", value, "fundTranspasswd");
            return (Criteria) this;
        }

        public Criteria andFundTranspasswdIn(List<String> values) {
            addCriterion("fund_transpasswd in", values, "fundTranspasswd");
            return (Criteria) this;
        }

        public Criteria andFundTranspasswdNotIn(List<String> values) {
            addCriterion("fund_transpasswd not in", values, "fundTranspasswd");
            return (Criteria) this;
        }

        public Criteria andFundTranspasswdBetween(String value1, String value2) {
            addCriterion("fund_transpasswd between", value1, value2, "fundTranspasswd");
            return (Criteria) this;
        }

        public Criteria andFundTranspasswdNotBetween(String value1, String value2) {
            addCriterion("fund_transpasswd not between", value1, value2, "fundTranspasswd");
            return (Criteria) this;
        }

        public Criteria andIssetHsTranspasswdIsNull() {
            addCriterion("isset_hs_transpasswd is null");
            return (Criteria) this;
        }

        public Criteria andIssetHsTranspasswdIsNotNull() {
            addCriterion("isset_hs_transpasswd is not null");
            return (Criteria) this;
        }

        public Criteria andIssetHsTranspasswdEqualTo(Boolean value) {
            addCriterion("isset_hs_transpasswd =", value, "issetHsTranspasswd");
            return (Criteria) this;
        }

        public Criteria andIssetHsTranspasswdNotEqualTo(Boolean value) {
            addCriterion("isset_hs_transpasswd <>", value, "issetHsTranspasswd");
            return (Criteria) this;
        }

        public Criteria andIssetHsTranspasswdGreaterThan(Boolean value) {
            addCriterion("isset_hs_transpasswd >", value, "issetHsTranspasswd");
            return (Criteria) this;
        }

        public Criteria andIssetHsTranspasswdGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isset_hs_transpasswd >=", value, "issetHsTranspasswd");
            return (Criteria) this;
        }

        public Criteria andIssetHsTranspasswdLessThan(Boolean value) {
            addCriterion("isset_hs_transpasswd <", value, "issetHsTranspasswd");
            return (Criteria) this;
        }

        public Criteria andIssetHsTranspasswdLessThanOrEqualTo(Boolean value) {
            addCriterion("isset_hs_transpasswd <=", value, "issetHsTranspasswd");
            return (Criteria) this;
        }

        public Criteria andIssetHsTranspasswdIn(List<Boolean> values) {
            addCriterion("isset_hs_transpasswd in", values, "issetHsTranspasswd");
            return (Criteria) this;
        }

        public Criteria andIssetHsTranspasswdNotIn(List<Boolean> values) {
            addCriterion("isset_hs_transpasswd not in", values, "issetHsTranspasswd");
            return (Criteria) this;
        }

        public Criteria andIssetHsTranspasswdBetween(Boolean value1, Boolean value2) {
            addCriterion("isset_hs_transpasswd between", value1, value2, "issetHsTranspasswd");
            return (Criteria) this;
        }

        public Criteria andIssetHsTranspasswdNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isset_hs_transpasswd not between", value1, value2, "issetHsTranspasswd");
            return (Criteria) this;
        }

        public Criteria andOperationStepIsNull() {
            addCriterion("operation_step is null");
            return (Criteria) this;
        }

        public Criteria andOperationStepIsNotNull() {
            addCriterion("operation_step is not null");
            return (Criteria) this;
        }

        public Criteria andOperationStepEqualTo(Integer value) {
            addCriterion("operation_step =", value, "operationStep");
            return (Criteria) this;
        }

        public Criteria andOperationStepNotEqualTo(Integer value) {
            addCriterion("operation_step <>", value, "operationStep");
            return (Criteria) this;
        }

        public Criteria andOperationStepGreaterThan(Integer value) {
            addCriterion("operation_step >", value, "operationStep");
            return (Criteria) this;
        }

        public Criteria andOperationStepGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation_step >=", value, "operationStep");
            return (Criteria) this;
        }

        public Criteria andOperationStepLessThan(Integer value) {
            addCriterion("operation_step <", value, "operationStep");
            return (Criteria) this;
        }

        public Criteria andOperationStepLessThanOrEqualTo(Integer value) {
            addCriterion("operation_step <=", value, "operationStep");
            return (Criteria) this;
        }

        public Criteria andOperationStepIn(List<Integer> values) {
            addCriterion("operation_step in", values, "operationStep");
            return (Criteria) this;
        }

        public Criteria andOperationStepNotIn(List<Integer> values) {
            addCriterion("operation_step not in", values, "operationStep");
            return (Criteria) this;
        }

        public Criteria andOperationStepBetween(Integer value1, Integer value2) {
            addCriterion("operation_step between", value1, value2, "operationStep");
            return (Criteria) this;
        }

        public Criteria andOperationStepNotBetween(Integer value1, Integer value2) {
            addCriterion("operation_step not between", value1, value2, "operationStep");
            return (Criteria) this;
        }

        public Criteria andAuditQfiiIsNull() {
            addCriterion("audit_qfii is null");
            return (Criteria) this;
        }

        public Criteria andAuditQfiiIsNotNull() {
            addCriterion("audit_qfii is not null");
            return (Criteria) this;
        }

        public Criteria andAuditQfiiEqualTo(Byte value) {
            addCriterion("audit_qfii =", value, "auditQfii");
            return (Criteria) this;
        }

        public Criteria andAuditQfiiNotEqualTo(Byte value) {
            addCriterion("audit_qfii <>", value, "auditQfii");
            return (Criteria) this;
        }

        public Criteria andAuditQfiiGreaterThan(Byte value) {
            addCriterion("audit_qfii >", value, "auditQfii");
            return (Criteria) this;
        }

        public Criteria andAuditQfiiGreaterThanOrEqualTo(Byte value) {
            addCriterion("audit_qfii >=", value, "auditQfii");
            return (Criteria) this;
        }

        public Criteria andAuditQfiiLessThan(Byte value) {
            addCriterion("audit_qfii <", value, "auditQfii");
            return (Criteria) this;
        }

        public Criteria andAuditQfiiLessThanOrEqualTo(Byte value) {
            addCriterion("audit_qfii <=", value, "auditQfii");
            return (Criteria) this;
        }

        public Criteria andAuditQfiiIn(List<Byte> values) {
            addCriterion("audit_qfii in", values, "auditQfii");
            return (Criteria) this;
        }

        public Criteria andAuditQfiiNotIn(List<Byte> values) {
            addCriterion("audit_qfii not in", values, "auditQfii");
            return (Criteria) this;
        }

        public Criteria andAuditQfiiBetween(Byte value1, Byte value2) {
            addCriterion("audit_qfii between", value1, value2, "auditQfii");
            return (Criteria) this;
        }

        public Criteria andAuditQfiiNotBetween(Byte value1, Byte value2) {
            addCriterion("audit_qfii not between", value1, value2, "auditQfii");
            return (Criteria) this;
        }

        public Criteria andRegistfromIsNull() {
            addCriterion("registFrom is null");
            return (Criteria) this;
        }

        public Criteria andRegistfromIsNotNull() {
            addCriterion("registFrom is not null");
            return (Criteria) this;
        }

        public Criteria andRegistfromEqualTo(Integer value) {
            addCriterion("registFrom =", value, "registfrom");
            return (Criteria) this;
        }

        public Criteria andRegistfromNotEqualTo(Integer value) {
            addCriterion("registFrom <>", value, "registfrom");
            return (Criteria) this;
        }

        public Criteria andRegistfromGreaterThan(Integer value) {
            addCriterion("registFrom >", value, "registfrom");
            return (Criteria) this;
        }

        public Criteria andRegistfromGreaterThanOrEqualTo(Integer value) {
            addCriterion("registFrom >=", value, "registfrom");
            return (Criteria) this;
        }

        public Criteria andRegistfromLessThan(Integer value) {
            addCriterion("registFrom <", value, "registfrom");
            return (Criteria) this;
        }

        public Criteria andRegistfromLessThanOrEqualTo(Integer value) {
            addCriterion("registFrom <=", value, "registfrom");
            return (Criteria) this;
        }

        public Criteria andRegistfromIn(List<Integer> values) {
            addCriterion("registFrom in", values, "registfrom");
            return (Criteria) this;
        }

        public Criteria andRegistfromNotIn(List<Integer> values) {
            addCriterion("registFrom not in", values, "registfrom");
            return (Criteria) this;
        }

        public Criteria andRegistfromBetween(Integer value1, Integer value2) {
            addCriterion("registFrom between", value1, value2, "registfrom");
            return (Criteria) this;
        }

        public Criteria andRegistfromNotBetween(Integer value1, Integer value2) {
            addCriterion("registFrom not between", value1, value2, "registfrom");
            return (Criteria) this;
        }

        public Criteria andIpadressIsNull() {
            addCriterion("ipAdress is null");
            return (Criteria) this;
        }

        public Criteria andIpadressIsNotNull() {
            addCriterion("ipAdress is not null");
            return (Criteria) this;
        }

        public Criteria andIpadressEqualTo(String value) {
            addCriterion("ipAdress =", value, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressNotEqualTo(String value) {
            addCriterion("ipAdress <>", value, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressGreaterThan(String value) {
            addCriterion("ipAdress >", value, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressGreaterThanOrEqualTo(String value) {
            addCriterion("ipAdress >=", value, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressLessThan(String value) {
            addCriterion("ipAdress <", value, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressLessThanOrEqualTo(String value) {
            addCriterion("ipAdress <=", value, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressLike(String value) {
            addCriterion("ipAdress like", value, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressNotLike(String value) {
            addCriterion("ipAdress not like", value, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressIn(List<String> values) {
            addCriterion("ipAdress in", values, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressNotIn(List<String> values) {
            addCriterion("ipAdress not in", values, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressBetween(String value1, String value2) {
            addCriterion("ipAdress between", value1, value2, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressNotBetween(String value1, String value2) {
            addCriterion("ipAdress not between", value1, value2, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIsbuyerIsNull() {
            addCriterion("isBuyer is null");
            return (Criteria) this;
        }

        public Criteria andIsbuyerIsNotNull() {
            addCriterion("isBuyer is not null");
            return (Criteria) this;
        }

        public Criteria andIsbuyerEqualTo(Integer value) {
            addCriterion("isBuyer =", value, "isbuyer");
            return (Criteria) this;
        }

        public Criteria andIsbuyerNotEqualTo(Integer value) {
            addCriterion("isBuyer <>", value, "isbuyer");
            return (Criteria) this;
        }

        public Criteria andIsbuyerGreaterThan(Integer value) {
            addCriterion("isBuyer >", value, "isbuyer");
            return (Criteria) this;
        }

        public Criteria andIsbuyerGreaterThanOrEqualTo(Integer value) {
            addCriterion("isBuyer >=", value, "isbuyer");
            return (Criteria) this;
        }

        public Criteria andIsbuyerLessThan(Integer value) {
            addCriterion("isBuyer <", value, "isbuyer");
            return (Criteria) this;
        }

        public Criteria andIsbuyerLessThanOrEqualTo(Integer value) {
            addCriterion("isBuyer <=", value, "isbuyer");
            return (Criteria) this;
        }

        public Criteria andIsbuyerIn(List<Integer> values) {
            addCriterion("isBuyer in", values, "isbuyer");
            return (Criteria) this;
        }

        public Criteria andIsbuyerNotIn(List<Integer> values) {
            addCriterion("isBuyer not in", values, "isbuyer");
            return (Criteria) this;
        }

        public Criteria andIsbuyerBetween(Integer value1, Integer value2) {
            addCriterion("isBuyer between", value1, value2, "isbuyer");
            return (Criteria) this;
        }

        public Criteria andIsbuyerNotBetween(Integer value1, Integer value2) {
            addCriterion("isBuyer not between", value1, value2, "isbuyer");
            return (Criteria) this;
        }

        public Criteria andFirstbuydateIsNull() {
            addCriterion("firstBuyDate is null");
            return (Criteria) this;
        }

        public Criteria andFirstbuydateIsNotNull() {
            addCriterion("firstBuyDate is not null");
            return (Criteria) this;
        }

        public Criteria andFirstbuydateEqualTo(Date value) {
            addCriterion("firstBuyDate =", value, "firstbuydate");
            return (Criteria) this;
        }

        public Criteria andFirstbuydateNotEqualTo(Date value) {
            addCriterion("firstBuyDate <>", value, "firstbuydate");
            return (Criteria) this;
        }

        public Criteria andFirstbuydateGreaterThan(Date value) {
            addCriterion("firstBuyDate >", value, "firstbuydate");
            return (Criteria) this;
        }

        public Criteria andFirstbuydateGreaterThanOrEqualTo(Date value) {
            addCriterion("firstBuyDate >=", value, "firstbuydate");
            return (Criteria) this;
        }

        public Criteria andFirstbuydateLessThan(Date value) {
            addCriterion("firstBuyDate <", value, "firstbuydate");
            return (Criteria) this;
        }

        public Criteria andFirstbuydateLessThanOrEqualTo(Date value) {
            addCriterion("firstBuyDate <=", value, "firstbuydate");
            return (Criteria) this;
        }

        public Criteria andFirstbuydateIn(List<Date> values) {
            addCriterion("firstBuyDate in", values, "firstbuydate");
            return (Criteria) this;
        }

        public Criteria andFirstbuydateNotIn(List<Date> values) {
            addCriterion("firstBuyDate not in", values, "firstbuydate");
            return (Criteria) this;
        }

        public Criteria andFirstbuydateBetween(Date value1, Date value2) {
            addCriterion("firstBuyDate between", value1, value2, "firstbuydate");
            return (Criteria) this;
        }

        public Criteria andFirstbuydateNotBetween(Date value1, Date value2) {
            addCriterion("firstBuyDate not between", value1, value2, "firstbuydate");
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