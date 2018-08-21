package cn.yilucaifu.domain;

import java.util.ArrayList;
import java.util.List;

public class P2pAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public P2pAccountExample() {
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

        public Criteria andIdentityCodeIsNull() {
            addCriterion("identity_code is null");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeIsNotNull() {
            addCriterion("identity_code is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeEqualTo(String value) {
            addCriterion("identity_code =", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeNotEqualTo(String value) {
            addCriterion("identity_code <>", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeGreaterThan(String value) {
            addCriterion("identity_code >", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("identity_code >=", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeLessThan(String value) {
            addCriterion("identity_code <", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeLessThanOrEqualTo(String value) {
            addCriterion("identity_code <=", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeLike(String value) {
            addCriterion("identity_code like", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeNotLike(String value) {
            addCriterion("identity_code not like", value, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeIn(List<String> values) {
            addCriterion("identity_code in", values, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeNotIn(List<String> values) {
            addCriterion("identity_code not in", values, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeBetween(String value1, String value2) {
            addCriterion("identity_code between", value1, value2, "identityCode");
            return (Criteria) this;
        }

        public Criteria andIdentityCodeNotBetween(String value1, String value2) {
            addCriterion("identity_code not between", value1, value2, "identityCode");
            return (Criteria) this;
        }

        public Criteria andInvestTypeIsNull() {
            addCriterion("invest_type is null");
            return (Criteria) this;
        }

        public Criteria andInvestTypeIsNotNull() {
            addCriterion("invest_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvestTypeEqualTo(Integer value) {
            addCriterion("invest_type =", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeNotEqualTo(Integer value) {
            addCriterion("invest_type <>", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeGreaterThan(Integer value) {
            addCriterion("invest_type >", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("invest_type >=", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeLessThan(Integer value) {
            addCriterion("invest_type <", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeLessThanOrEqualTo(Integer value) {
            addCriterion("invest_type <=", value, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeIn(List<Integer> values) {
            addCriterion("invest_type in", values, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeNotIn(List<Integer> values) {
            addCriterion("invest_type not in", values, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeBetween(Integer value1, Integer value2) {
            addCriterion("invest_type between", value1, value2, "investType");
            return (Criteria) this;
        }

        public Criteria andInvestTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("invest_type not between", value1, value2, "investType");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("card_id like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("card_id not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardHolderIsNull() {
            addCriterion("card_holder is null");
            return (Criteria) this;
        }

        public Criteria andCardHolderIsNotNull() {
            addCriterion("card_holder is not null");
            return (Criteria) this;
        }

        public Criteria andCardHolderEqualTo(String value) {
            addCriterion("card_holder =", value, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderNotEqualTo(String value) {
            addCriterion("card_holder <>", value, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderGreaterThan(String value) {
            addCriterion("card_holder >", value, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderGreaterThanOrEqualTo(String value) {
            addCriterion("card_holder >=", value, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderLessThan(String value) {
            addCriterion("card_holder <", value, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderLessThanOrEqualTo(String value) {
            addCriterion("card_holder <=", value, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderLike(String value) {
            addCriterion("card_holder like", value, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderNotLike(String value) {
            addCriterion("card_holder not like", value, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderIn(List<String> values) {
            addCriterion("card_holder in", values, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderNotIn(List<String> values) {
            addCriterion("card_holder not in", values, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderBetween(String value1, String value2) {
            addCriterion("card_holder between", value1, value2, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andCardHolderNotBetween(String value1, String value2) {
            addCriterion("card_holder not between", value1, value2, "cardHolder");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNull() {
            addCriterion("media_id is null");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNotNull() {
            addCriterion("media_id is not null");
            return (Criteria) this;
        }

        public Criteria andMediaIdEqualTo(String value) {
            addCriterion("media_id =", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotEqualTo(String value) {
            addCriterion("media_id <>", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThan(String value) {
            addCriterion("media_id >", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThanOrEqualTo(String value) {
            addCriterion("media_id >=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThan(String value) {
            addCriterion("media_id <", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThanOrEqualTo(String value) {
            addCriterion("media_id <=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLike(String value) {
            addCriterion("media_id like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotLike(String value) {
            addCriterion("media_id not like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdIn(List<String> values) {
            addCriterion("media_id in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotIn(List<String> values) {
            addCriterion("media_id not in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdBetween(String value1, String value2) {
            addCriterion("media_id between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotBetween(String value1, String value2) {
            addCriterion("media_id not between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andColaccprovIsNull() {
            addCriterion("colAccProv is null");
            return (Criteria) this;
        }

        public Criteria andColaccprovIsNotNull() {
            addCriterion("colAccProv is not null");
            return (Criteria) this;
        }

        public Criteria andColaccprovEqualTo(String value) {
            addCriterion("colAccProv =", value, "colaccprov");
            return (Criteria) this;
        }

        public Criteria andColaccprovNotEqualTo(String value) {
            addCriterion("colAccProv <>", value, "colaccprov");
            return (Criteria) this;
        }

        public Criteria andColaccprovGreaterThan(String value) {
            addCriterion("colAccProv >", value, "colaccprov");
            return (Criteria) this;
        }

        public Criteria andColaccprovGreaterThanOrEqualTo(String value) {
            addCriterion("colAccProv >=", value, "colaccprov");
            return (Criteria) this;
        }

        public Criteria andColaccprovLessThan(String value) {
            addCriterion("colAccProv <", value, "colaccprov");
            return (Criteria) this;
        }

        public Criteria andColaccprovLessThanOrEqualTo(String value) {
            addCriterion("colAccProv <=", value, "colaccprov");
            return (Criteria) this;
        }

        public Criteria andColaccprovLike(String value) {
            addCriterion("colAccProv like", value, "colaccprov");
            return (Criteria) this;
        }

        public Criteria andColaccprovNotLike(String value) {
            addCriterion("colAccProv not like", value, "colaccprov");
            return (Criteria) this;
        }

        public Criteria andColaccprovIn(List<String> values) {
            addCriterion("colAccProv in", values, "colaccprov");
            return (Criteria) this;
        }

        public Criteria andColaccprovNotIn(List<String> values) {
            addCriterion("colAccProv not in", values, "colaccprov");
            return (Criteria) this;
        }

        public Criteria andColaccprovBetween(String value1, String value2) {
            addCriterion("colAccProv between", value1, value2, "colaccprov");
            return (Criteria) this;
        }

        public Criteria andColaccprovNotBetween(String value1, String value2) {
            addCriterion("colAccProv not between", value1, value2, "colaccprov");
            return (Criteria) this;
        }

        public Criteria andColacccityIsNull() {
            addCriterion("colAccCity is null");
            return (Criteria) this;
        }

        public Criteria andColacccityIsNotNull() {
            addCriterion("colAccCity is not null");
            return (Criteria) this;
        }

        public Criteria andColacccityEqualTo(String value) {
            addCriterion("colAccCity =", value, "colacccity");
            return (Criteria) this;
        }

        public Criteria andColacccityNotEqualTo(String value) {
            addCriterion("colAccCity <>", value, "colacccity");
            return (Criteria) this;
        }

        public Criteria andColacccityGreaterThan(String value) {
            addCriterion("colAccCity >", value, "colacccity");
            return (Criteria) this;
        }

        public Criteria andColacccityGreaterThanOrEqualTo(String value) {
            addCriterion("colAccCity >=", value, "colacccity");
            return (Criteria) this;
        }

        public Criteria andColacccityLessThan(String value) {
            addCriterion("colAccCity <", value, "colacccity");
            return (Criteria) this;
        }

        public Criteria andColacccityLessThanOrEqualTo(String value) {
            addCriterion("colAccCity <=", value, "colacccity");
            return (Criteria) this;
        }

        public Criteria andColacccityLike(String value) {
            addCriterion("colAccCity like", value, "colacccity");
            return (Criteria) this;
        }

        public Criteria andColacccityNotLike(String value) {
            addCriterion("colAccCity not like", value, "colacccity");
            return (Criteria) this;
        }

        public Criteria andColacccityIn(List<String> values) {
            addCriterion("colAccCity in", values, "colacccity");
            return (Criteria) this;
        }

        public Criteria andColacccityNotIn(List<String> values) {
            addCriterion("colAccCity not in", values, "colacccity");
            return (Criteria) this;
        }

        public Criteria andColacccityBetween(String value1, String value2) {
            addCriterion("colAccCity between", value1, value2, "colacccity");
            return (Criteria) this;
        }

        public Criteria andColacccityNotBetween(String value1, String value2) {
            addCriterion("colAccCity not between", value1, value2, "colacccity");
            return (Criteria) this;
        }

        public Criteria andColaccareaIsNull() {
            addCriterion("colAccArea is null");
            return (Criteria) this;
        }

        public Criteria andColaccareaIsNotNull() {
            addCriterion("colAccArea is not null");
            return (Criteria) this;
        }

        public Criteria andColaccareaEqualTo(String value) {
            addCriterion("colAccArea =", value, "colaccarea");
            return (Criteria) this;
        }

        public Criteria andColaccareaNotEqualTo(String value) {
            addCriterion("colAccArea <>", value, "colaccarea");
            return (Criteria) this;
        }

        public Criteria andColaccareaGreaterThan(String value) {
            addCriterion("colAccArea >", value, "colaccarea");
            return (Criteria) this;
        }

        public Criteria andColaccareaGreaterThanOrEqualTo(String value) {
            addCriterion("colAccArea >=", value, "colaccarea");
            return (Criteria) this;
        }

        public Criteria andColaccareaLessThan(String value) {
            addCriterion("colAccArea <", value, "colaccarea");
            return (Criteria) this;
        }

        public Criteria andColaccareaLessThanOrEqualTo(String value) {
            addCriterion("colAccArea <=", value, "colaccarea");
            return (Criteria) this;
        }

        public Criteria andColaccareaLike(String value) {
            addCriterion("colAccArea like", value, "colaccarea");
            return (Criteria) this;
        }

        public Criteria andColaccareaNotLike(String value) {
            addCriterion("colAccArea not like", value, "colaccarea");
            return (Criteria) this;
        }

        public Criteria andColaccareaIn(List<String> values) {
            addCriterion("colAccArea in", values, "colaccarea");
            return (Criteria) this;
        }

        public Criteria andColaccareaNotIn(List<String> values) {
            addCriterion("colAccArea not in", values, "colaccarea");
            return (Criteria) this;
        }

        public Criteria andColaccareaBetween(String value1, String value2) {
            addCriterion("colAccArea between", value1, value2, "colaccarea");
            return (Criteria) this;
        }

        public Criteria andColaccareaNotBetween(String value1, String value2) {
            addCriterion("colAccArea not between", value1, value2, "colaccarea");
            return (Criteria) this;
        }

        public Criteria andBankbrhnameIsNull() {
            addCriterion("bankBrhName is null");
            return (Criteria) this;
        }

        public Criteria andBankbrhnameIsNotNull() {
            addCriterion("bankBrhName is not null");
            return (Criteria) this;
        }

        public Criteria andBankbrhnameEqualTo(String value) {
            addCriterion("bankBrhName =", value, "bankbrhname");
            return (Criteria) this;
        }

        public Criteria andBankbrhnameNotEqualTo(String value) {
            addCriterion("bankBrhName <>", value, "bankbrhname");
            return (Criteria) this;
        }

        public Criteria andBankbrhnameGreaterThan(String value) {
            addCriterion("bankBrhName >", value, "bankbrhname");
            return (Criteria) this;
        }

        public Criteria andBankbrhnameGreaterThanOrEqualTo(String value) {
            addCriterion("bankBrhName >=", value, "bankbrhname");
            return (Criteria) this;
        }

        public Criteria andBankbrhnameLessThan(String value) {
            addCriterion("bankBrhName <", value, "bankbrhname");
            return (Criteria) this;
        }

        public Criteria andBankbrhnameLessThanOrEqualTo(String value) {
            addCriterion("bankBrhName <=", value, "bankbrhname");
            return (Criteria) this;
        }

        public Criteria andBankbrhnameLike(String value) {
            addCriterion("bankBrhName like", value, "bankbrhname");
            return (Criteria) this;
        }

        public Criteria andBankbrhnameNotLike(String value) {
            addCriterion("bankBrhName not like", value, "bankbrhname");
            return (Criteria) this;
        }

        public Criteria andBankbrhnameIn(List<String> values) {
            addCriterion("bankBrhName in", values, "bankbrhname");
            return (Criteria) this;
        }

        public Criteria andBankbrhnameNotIn(List<String> values) {
            addCriterion("bankBrhName not in", values, "bankbrhname");
            return (Criteria) this;
        }

        public Criteria andBankbrhnameBetween(String value1, String value2) {
            addCriterion("bankBrhName between", value1, value2, "bankbrhname");
            return (Criteria) this;
        }

        public Criteria andBankbrhnameNotBetween(String value1, String value2) {
            addCriterion("bankBrhName not between", value1, value2, "bankbrhname");
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

        public Criteria andIssignIsNull() {
            addCriterion("issign is null");
            return (Criteria) this;
        }

        public Criteria andIssignIsNotNull() {
            addCriterion("issign is not null");
            return (Criteria) this;
        }

        public Criteria andIssignEqualTo(String value) {
            addCriterion("issign =", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignNotEqualTo(String value) {
            addCriterion("issign <>", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignGreaterThan(String value) {
            addCriterion("issign >", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignGreaterThanOrEqualTo(String value) {
            addCriterion("issign >=", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignLessThan(String value) {
            addCriterion("issign <", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignLessThanOrEqualTo(String value) {
            addCriterion("issign <=", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignLike(String value) {
            addCriterion("issign like", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignNotLike(String value) {
            addCriterion("issign not like", value, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignIn(List<String> values) {
            addCriterion("issign in", values, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignNotIn(List<String> values) {
            addCriterion("issign not in", values, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignBetween(String value1, String value2) {
            addCriterion("issign between", value1, value2, "issign");
            return (Criteria) this;
        }

        public Criteria andIssignNotBetween(String value1, String value2) {
            addCriterion("issign not between", value1, value2, "issign");
            return (Criteria) this;
        }

        public Criteria andRetMsgIsNull() {
            addCriterion("ret_msg is null");
            return (Criteria) this;
        }

        public Criteria andRetMsgIsNotNull() {
            addCriterion("ret_msg is not null");
            return (Criteria) this;
        }

        public Criteria andRetMsgEqualTo(String value) {
            addCriterion("ret_msg =", value, "retMsg");
            return (Criteria) this;
        }

        public Criteria andRetMsgNotEqualTo(String value) {
            addCriterion("ret_msg <>", value, "retMsg");
            return (Criteria) this;
        }

        public Criteria andRetMsgGreaterThan(String value) {
            addCriterion("ret_msg >", value, "retMsg");
            return (Criteria) this;
        }

        public Criteria andRetMsgGreaterThanOrEqualTo(String value) {
            addCriterion("ret_msg >=", value, "retMsg");
            return (Criteria) this;
        }

        public Criteria andRetMsgLessThan(String value) {
            addCriterion("ret_msg <", value, "retMsg");
            return (Criteria) this;
        }

        public Criteria andRetMsgLessThanOrEqualTo(String value) {
            addCriterion("ret_msg <=", value, "retMsg");
            return (Criteria) this;
        }

        public Criteria andRetMsgLike(String value) {
            addCriterion("ret_msg like", value, "retMsg");
            return (Criteria) this;
        }

        public Criteria andRetMsgNotLike(String value) {
            addCriterion("ret_msg not like", value, "retMsg");
            return (Criteria) this;
        }

        public Criteria andRetMsgIn(List<String> values) {
            addCriterion("ret_msg in", values, "retMsg");
            return (Criteria) this;
        }

        public Criteria andRetMsgNotIn(List<String> values) {
            addCriterion("ret_msg not in", values, "retMsg");
            return (Criteria) this;
        }

        public Criteria andRetMsgBetween(String value1, String value2) {
            addCriterion("ret_msg between", value1, value2, "retMsg");
            return (Criteria) this;
        }

        public Criteria andRetMsgNotBetween(String value1, String value2) {
            addCriterion("ret_msg not between", value1, value2, "retMsg");
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

        public Criteria andEAccountIsNull() {
            addCriterion("e_account is null");
            return (Criteria) this;
        }

        public Criteria andEAccountIsNotNull() {
            addCriterion("e_account is not null");
            return (Criteria) this;
        }

        public Criteria andEAccountEqualTo(String value) {
            addCriterion("e_account =", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountNotEqualTo(String value) {
            addCriterion("e_account <>", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountGreaterThan(String value) {
            addCriterion("e_account >", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountGreaterThanOrEqualTo(String value) {
            addCriterion("e_account >=", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountLessThan(String value) {
            addCriterion("e_account <", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountLessThanOrEqualTo(String value) {
            addCriterion("e_account <=", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountLike(String value) {
            addCriterion("e_account like", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountNotLike(String value) {
            addCriterion("e_account not like", value, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountIn(List<String> values) {
            addCriterion("e_account in", values, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountNotIn(List<String> values) {
            addCriterion("e_account not in", values, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountBetween(String value1, String value2) {
            addCriterion("e_account between", value1, value2, "eAccount");
            return (Criteria) this;
        }

        public Criteria andEAccountNotBetween(String value1, String value2) {
            addCriterion("e_account not between", value1, value2, "eAccount");
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