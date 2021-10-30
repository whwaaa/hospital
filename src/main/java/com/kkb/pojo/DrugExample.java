package com.kkb.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DrugExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugExample() {
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

        public Criteria andDrIdIsNull() {
            addCriterion("dr_id is null");
            return (Criteria) this;
        }

        public Criteria andDrIdIsNotNull() {
            addCriterion("dr_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrIdEqualTo(Integer value) {
            addCriterion("dr_id =", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdNotEqualTo(Integer value) {
            addCriterion("dr_id <>", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdGreaterThan(Integer value) {
            addCriterion("dr_id >", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr_id >=", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdLessThan(Integer value) {
            addCriterion("dr_id <", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdLessThanOrEqualTo(Integer value) {
            addCriterion("dr_id <=", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdIn(List<Integer> values) {
            addCriterion("dr_id in", values, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdNotIn(List<Integer> values) {
            addCriterion("dr_id not in", values, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdBetween(Integer value1, Integer value2) {
            addCriterion("dr_id between", value1, value2, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dr_id not between", value1, value2, "drId");
            return (Criteria) this;
        }

        public Criteria andDrUrlIsNull() {
            addCriterion("dr_url is null");
            return (Criteria) this;
        }

        public Criteria andDrUrlIsNotNull() {
            addCriterion("dr_url is not null");
            return (Criteria) this;
        }

        public Criteria andDrUrlEqualTo(String value) {
            addCriterion("dr_url =", value, "drUrl");
            return (Criteria) this;
        }

        public Criteria andDrUrlNotEqualTo(String value) {
            addCriterion("dr_url <>", value, "drUrl");
            return (Criteria) this;
        }

        public Criteria andDrUrlGreaterThan(String value) {
            addCriterion("dr_url >", value, "drUrl");
            return (Criteria) this;
        }

        public Criteria andDrUrlGreaterThanOrEqualTo(String value) {
            addCriterion("dr_url >=", value, "drUrl");
            return (Criteria) this;
        }

        public Criteria andDrUrlLessThan(String value) {
            addCriterion("dr_url <", value, "drUrl");
            return (Criteria) this;
        }

        public Criteria andDrUrlLessThanOrEqualTo(String value) {
            addCriterion("dr_url <=", value, "drUrl");
            return (Criteria) this;
        }

        public Criteria andDrUrlLike(String value) {
            addCriterion("dr_url like", value, "drUrl");
            return (Criteria) this;
        }

        public Criteria andDrUrlNotLike(String value) {
            addCriterion("dr_url not like", value, "drUrl");
            return (Criteria) this;
        }

        public Criteria andDrUrlIn(List<String> values) {
            addCriterion("dr_url in", values, "drUrl");
            return (Criteria) this;
        }

        public Criteria andDrUrlNotIn(List<String> values) {
            addCriterion("dr_url not in", values, "drUrl");
            return (Criteria) this;
        }

        public Criteria andDrUrlBetween(String value1, String value2) {
            addCriterion("dr_url between", value1, value2, "drUrl");
            return (Criteria) this;
        }

        public Criteria andDrUrlNotBetween(String value1, String value2) {
            addCriterion("dr_url not between", value1, value2, "drUrl");
            return (Criteria) this;
        }

        public Criteria andDrInpriceIsNull() {
            addCriterion("dr_inprice is null");
            return (Criteria) this;
        }

        public Criteria andDrInpriceIsNotNull() {
            addCriterion("dr_inprice is not null");
            return (Criteria) this;
        }

        public Criteria andDrInpriceEqualTo(BigDecimal value) {
            addCriterion("dr_inprice =", value, "drInprice");
            return (Criteria) this;
        }

        public Criteria andDrInpriceNotEqualTo(BigDecimal value) {
            addCriterion("dr_inprice <>", value, "drInprice");
            return (Criteria) this;
        }

        public Criteria andDrInpriceGreaterThan(BigDecimal value) {
            addCriterion("dr_inprice >", value, "drInprice");
            return (Criteria) this;
        }

        public Criteria andDrInpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dr_inprice >=", value, "drInprice");
            return (Criteria) this;
        }

        public Criteria andDrInpriceLessThan(BigDecimal value) {
            addCriterion("dr_inprice <", value, "drInprice");
            return (Criteria) this;
        }

        public Criteria andDrInpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dr_inprice <=", value, "drInprice");
            return (Criteria) this;
        }

        public Criteria andDrInpriceIn(List<BigDecimal> values) {
            addCriterion("dr_inprice in", values, "drInprice");
            return (Criteria) this;
        }

        public Criteria andDrInpriceNotIn(List<BigDecimal> values) {
            addCriterion("dr_inprice not in", values, "drInprice");
            return (Criteria) this;
        }

        public Criteria andDrInpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dr_inprice between", value1, value2, "drInprice");
            return (Criteria) this;
        }

        public Criteria andDrInpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dr_inprice not between", value1, value2, "drInprice");
            return (Criteria) this;
        }

        public Criteria andDrOutpriceIsNull() {
            addCriterion("dr_outprice is null");
            return (Criteria) this;
        }

        public Criteria andDrOutpriceIsNotNull() {
            addCriterion("dr_outprice is not null");
            return (Criteria) this;
        }

        public Criteria andDrOutpriceEqualTo(BigDecimal value) {
            addCriterion("dr_outprice =", value, "drOutprice");
            return (Criteria) this;
        }

        public Criteria andDrOutpriceNotEqualTo(BigDecimal value) {
            addCriterion("dr_outprice <>", value, "drOutprice");
            return (Criteria) this;
        }

        public Criteria andDrOutpriceGreaterThan(BigDecimal value) {
            addCriterion("dr_outprice >", value, "drOutprice");
            return (Criteria) this;
        }

        public Criteria andDrOutpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dr_outprice >=", value, "drOutprice");
            return (Criteria) this;
        }

        public Criteria andDrOutpriceLessThan(BigDecimal value) {
            addCriterion("dr_outprice <", value, "drOutprice");
            return (Criteria) this;
        }

        public Criteria andDrOutpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dr_outprice <=", value, "drOutprice");
            return (Criteria) this;
        }

        public Criteria andDrOutpriceIn(List<BigDecimal> values) {
            addCriterion("dr_outprice in", values, "drOutprice");
            return (Criteria) this;
        }

        public Criteria andDrOutpriceNotIn(List<BigDecimal> values) {
            addCriterion("dr_outprice not in", values, "drOutprice");
            return (Criteria) this;
        }

        public Criteria andDrOutpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dr_outprice between", value1, value2, "drOutprice");
            return (Criteria) this;
        }

        public Criteria andDrOutpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dr_outprice not between", value1, value2, "drOutprice");
            return (Criteria) this;
        }

        public Criteria andDrNameIsNull() {
            addCriterion("dr_name is null");
            return (Criteria) this;
        }

        public Criteria andDrNameIsNotNull() {
            addCriterion("dr_name is not null");
            return (Criteria) this;
        }

        public Criteria andDrNameEqualTo(String value) {
            addCriterion("dr_name =", value, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameNotEqualTo(String value) {
            addCriterion("dr_name <>", value, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameGreaterThan(String value) {
            addCriterion("dr_name >", value, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameGreaterThanOrEqualTo(String value) {
            addCriterion("dr_name >=", value, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameLessThan(String value) {
            addCriterion("dr_name <", value, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameLessThanOrEqualTo(String value) {
            addCriterion("dr_name <=", value, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameLike(String value) {
            addCriterion("dr_name like", value, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameNotLike(String value) {
            addCriterion("dr_name not like", value, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameIn(List<String> values) {
            addCriterion("dr_name in", values, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameNotIn(List<String> values) {
            addCriterion("dr_name not in", values, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameBetween(String value1, String value2) {
            addCriterion("dr_name between", value1, value2, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameNotBetween(String value1, String value2) {
            addCriterion("dr_name not between", value1, value2, "drName");
            return (Criteria) this;
        }

        public Criteria andDrTypeIsNull() {
            addCriterion("dr_type is null");
            return (Criteria) this;
        }

        public Criteria andDrTypeIsNotNull() {
            addCriterion("dr_type is not null");
            return (Criteria) this;
        }

        public Criteria andDrTypeEqualTo(String value) {
            addCriterion("dr_type =", value, "drType");
            return (Criteria) this;
        }

        public Criteria andDrTypeNotEqualTo(String value) {
            addCriterion("dr_type <>", value, "drType");
            return (Criteria) this;
        }

        public Criteria andDrTypeGreaterThan(String value) {
            addCriterion("dr_type >", value, "drType");
            return (Criteria) this;
        }

        public Criteria andDrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dr_type >=", value, "drType");
            return (Criteria) this;
        }

        public Criteria andDrTypeLessThan(String value) {
            addCriterion("dr_type <", value, "drType");
            return (Criteria) this;
        }

        public Criteria andDrTypeLessThanOrEqualTo(String value) {
            addCriterion("dr_type <=", value, "drType");
            return (Criteria) this;
        }

        public Criteria andDrTypeLike(String value) {
            addCriterion("dr_type like", value, "drType");
            return (Criteria) this;
        }

        public Criteria andDrTypeNotLike(String value) {
            addCriterion("dr_type not like", value, "drType");
            return (Criteria) this;
        }

        public Criteria andDrTypeIn(List<String> values) {
            addCriterion("dr_type in", values, "drType");
            return (Criteria) this;
        }

        public Criteria andDrTypeNotIn(List<String> values) {
            addCriterion("dr_type not in", values, "drType");
            return (Criteria) this;
        }

        public Criteria andDrTypeBetween(String value1, String value2) {
            addCriterion("dr_type between", value1, value2, "drType");
            return (Criteria) this;
        }

        public Criteria andDrTypeNotBetween(String value1, String value2) {
            addCriterion("dr_type not between", value1, value2, "drType");
            return (Criteria) this;
        }

        public Criteria andDrSimDescIsNull() {
            addCriterion("dr_sim_desc is null");
            return (Criteria) this;
        }

        public Criteria andDrSimDescIsNotNull() {
            addCriterion("dr_sim_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDrSimDescEqualTo(String value) {
            addCriterion("dr_sim_desc =", value, "drSimDesc");
            return (Criteria) this;
        }

        public Criteria andDrSimDescNotEqualTo(String value) {
            addCriterion("dr_sim_desc <>", value, "drSimDesc");
            return (Criteria) this;
        }

        public Criteria andDrSimDescGreaterThan(String value) {
            addCriterion("dr_sim_desc >", value, "drSimDesc");
            return (Criteria) this;
        }

        public Criteria andDrSimDescGreaterThanOrEqualTo(String value) {
            addCriterion("dr_sim_desc >=", value, "drSimDesc");
            return (Criteria) this;
        }

        public Criteria andDrSimDescLessThan(String value) {
            addCriterion("dr_sim_desc <", value, "drSimDesc");
            return (Criteria) this;
        }

        public Criteria andDrSimDescLessThanOrEqualTo(String value) {
            addCriterion("dr_sim_desc <=", value, "drSimDesc");
            return (Criteria) this;
        }

        public Criteria andDrSimDescLike(String value) {
            addCriterion("dr_sim_desc like", value, "drSimDesc");
            return (Criteria) this;
        }

        public Criteria andDrSimDescNotLike(String value) {
            addCriterion("dr_sim_desc not like", value, "drSimDesc");
            return (Criteria) this;
        }

        public Criteria andDrSimDescIn(List<String> values) {
            addCriterion("dr_sim_desc in", values, "drSimDesc");
            return (Criteria) this;
        }

        public Criteria andDrSimDescNotIn(List<String> values) {
            addCriterion("dr_sim_desc not in", values, "drSimDesc");
            return (Criteria) this;
        }

        public Criteria andDrSimDescBetween(String value1, String value2) {
            addCriterion("dr_sim_desc between", value1, value2, "drSimDesc");
            return (Criteria) this;
        }

        public Criteria andDrSimDescNotBetween(String value1, String value2) {
            addCriterion("dr_sim_desc not between", value1, value2, "drSimDesc");
            return (Criteria) this;
        }

        public Criteria andDrExpireDateIsNull() {
            addCriterion("dr_expire_date is null");
            return (Criteria) this;
        }

        public Criteria andDrExpireDateIsNotNull() {
            addCriterion("dr_expire_date is not null");
            return (Criteria) this;
        }

        public Criteria andDrExpireDateEqualTo(String value) {
            addCriterion("dr_expire_date =", value, "drExpireDate");
            return (Criteria) this;
        }

        public Criteria andDrExpireDateNotEqualTo(String value) {
            addCriterion("dr_expire_date <>", value, "drExpireDate");
            return (Criteria) this;
        }

        public Criteria andDrExpireDateGreaterThan(String value) {
            addCriterion("dr_expire_date >", value, "drExpireDate");
            return (Criteria) this;
        }

        public Criteria andDrExpireDateGreaterThanOrEqualTo(String value) {
            addCriterion("dr_expire_date >=", value, "drExpireDate");
            return (Criteria) this;
        }

        public Criteria andDrExpireDateLessThan(String value) {
            addCriterion("dr_expire_date <", value, "drExpireDate");
            return (Criteria) this;
        }

        public Criteria andDrExpireDateLessThanOrEqualTo(String value) {
            addCriterion("dr_expire_date <=", value, "drExpireDate");
            return (Criteria) this;
        }

        public Criteria andDrExpireDateLike(String value) {
            addCriterion("dr_expire_date like", value, "drExpireDate");
            return (Criteria) this;
        }

        public Criteria andDrExpireDateNotLike(String value) {
            addCriterion("dr_expire_date not like", value, "drExpireDate");
            return (Criteria) this;
        }

        public Criteria andDrExpireDateIn(List<String> values) {
            addCriterion("dr_expire_date in", values, "drExpireDate");
            return (Criteria) this;
        }

        public Criteria andDrExpireDateNotIn(List<String> values) {
            addCriterion("dr_expire_date not in", values, "drExpireDate");
            return (Criteria) this;
        }

        public Criteria andDrExpireDateBetween(String value1, String value2) {
            addCriterion("dr_expire_date between", value1, value2, "drExpireDate");
            return (Criteria) this;
        }

        public Criteria andDrExpireDateNotBetween(String value1, String value2) {
            addCriterion("dr_expire_date not between", value1, value2, "drExpireDate");
            return (Criteria) this;
        }

        public Criteria andDrDetaDescIsNull() {
            addCriterion("dr_deta_desc is null");
            return (Criteria) this;
        }

        public Criteria andDrDetaDescIsNotNull() {
            addCriterion("dr_deta_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDrDetaDescEqualTo(String value) {
            addCriterion("dr_deta_desc =", value, "drDetaDesc");
            return (Criteria) this;
        }

        public Criteria andDrDetaDescNotEqualTo(String value) {
            addCriterion("dr_deta_desc <>", value, "drDetaDesc");
            return (Criteria) this;
        }

        public Criteria andDrDetaDescGreaterThan(String value) {
            addCriterion("dr_deta_desc >", value, "drDetaDesc");
            return (Criteria) this;
        }

        public Criteria andDrDetaDescGreaterThanOrEqualTo(String value) {
            addCriterion("dr_deta_desc >=", value, "drDetaDesc");
            return (Criteria) this;
        }

        public Criteria andDrDetaDescLessThan(String value) {
            addCriterion("dr_deta_desc <", value, "drDetaDesc");
            return (Criteria) this;
        }

        public Criteria andDrDetaDescLessThanOrEqualTo(String value) {
            addCriterion("dr_deta_desc <=", value, "drDetaDesc");
            return (Criteria) this;
        }

        public Criteria andDrDetaDescLike(String value) {
            addCriterion("dr_deta_desc like", value, "drDetaDesc");
            return (Criteria) this;
        }

        public Criteria andDrDetaDescNotLike(String value) {
            addCriterion("dr_deta_desc not like", value, "drDetaDesc");
            return (Criteria) this;
        }

        public Criteria andDrDetaDescIn(List<String> values) {
            addCriterion("dr_deta_desc in", values, "drDetaDesc");
            return (Criteria) this;
        }

        public Criteria andDrDetaDescNotIn(List<String> values) {
            addCriterion("dr_deta_desc not in", values, "drDetaDesc");
            return (Criteria) this;
        }

        public Criteria andDrDetaDescBetween(String value1, String value2) {
            addCriterion("dr_deta_desc between", value1, value2, "drDetaDesc");
            return (Criteria) this;
        }

        public Criteria andDrDetaDescNotBetween(String value1, String value2) {
            addCriterion("dr_deta_desc not between", value1, value2, "drDetaDesc");
            return (Criteria) this;
        }

        public Criteria andDrFatoryIsNull() {
            addCriterion("dr_fatory is null");
            return (Criteria) this;
        }

        public Criteria andDrFatoryIsNotNull() {
            addCriterion("dr_fatory is not null");
            return (Criteria) this;
        }

        public Criteria andDrFatoryEqualTo(String value) {
            addCriterion("dr_fatory =", value, "drFatory");
            return (Criteria) this;
        }

        public Criteria andDrFatoryNotEqualTo(String value) {
            addCriterion("dr_fatory <>", value, "drFatory");
            return (Criteria) this;
        }

        public Criteria andDrFatoryGreaterThan(String value) {
            addCriterion("dr_fatory >", value, "drFatory");
            return (Criteria) this;
        }

        public Criteria andDrFatoryGreaterThanOrEqualTo(String value) {
            addCriterion("dr_fatory >=", value, "drFatory");
            return (Criteria) this;
        }

        public Criteria andDrFatoryLessThan(String value) {
            addCriterion("dr_fatory <", value, "drFatory");
            return (Criteria) this;
        }

        public Criteria andDrFatoryLessThanOrEqualTo(String value) {
            addCriterion("dr_fatory <=", value, "drFatory");
            return (Criteria) this;
        }

        public Criteria andDrFatoryLike(String value) {
            addCriterion("dr_fatory like", value, "drFatory");
            return (Criteria) this;
        }

        public Criteria andDrFatoryNotLike(String value) {
            addCriterion("dr_fatory not like", value, "drFatory");
            return (Criteria) this;
        }

        public Criteria andDrFatoryIn(List<String> values) {
            addCriterion("dr_fatory in", values, "drFatory");
            return (Criteria) this;
        }

        public Criteria andDrFatoryNotIn(List<String> values) {
            addCriterion("dr_fatory not in", values, "drFatory");
            return (Criteria) this;
        }

        public Criteria andDrFatoryBetween(String value1, String value2) {
            addCriterion("dr_fatory between", value1, value2, "drFatory");
            return (Criteria) this;
        }

        public Criteria andDrFatoryNotBetween(String value1, String value2) {
            addCriterion("dr_fatory not between", value1, value2, "drFatory");
            return (Criteria) this;
        }

        public Criteria andDrDirectionIsNull() {
            addCriterion("dr_direction is null");
            return (Criteria) this;
        }

        public Criteria andDrDirectionIsNotNull() {
            addCriterion("dr_direction is not null");
            return (Criteria) this;
        }

        public Criteria andDrDirectionEqualTo(String value) {
            addCriterion("dr_direction =", value, "drDirection");
            return (Criteria) this;
        }

        public Criteria andDrDirectionNotEqualTo(String value) {
            addCriterion("dr_direction <>", value, "drDirection");
            return (Criteria) this;
        }

        public Criteria andDrDirectionGreaterThan(String value) {
            addCriterion("dr_direction >", value, "drDirection");
            return (Criteria) this;
        }

        public Criteria andDrDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("dr_direction >=", value, "drDirection");
            return (Criteria) this;
        }

        public Criteria andDrDirectionLessThan(String value) {
            addCriterion("dr_direction <", value, "drDirection");
            return (Criteria) this;
        }

        public Criteria andDrDirectionLessThanOrEqualTo(String value) {
            addCriterion("dr_direction <=", value, "drDirection");
            return (Criteria) this;
        }

        public Criteria andDrDirectionLike(String value) {
            addCriterion("dr_direction like", value, "drDirection");
            return (Criteria) this;
        }

        public Criteria andDrDirectionNotLike(String value) {
            addCriterion("dr_direction not like", value, "drDirection");
            return (Criteria) this;
        }

        public Criteria andDrDirectionIn(List<String> values) {
            addCriterion("dr_direction in", values, "drDirection");
            return (Criteria) this;
        }

        public Criteria andDrDirectionNotIn(List<String> values) {
            addCriterion("dr_direction not in", values, "drDirection");
            return (Criteria) this;
        }

        public Criteria andDrDirectionBetween(String value1, String value2) {
            addCriterion("dr_direction between", value1, value2, "drDirection");
            return (Criteria) this;
        }

        public Criteria andDrDirectionNotBetween(String value1, String value2) {
            addCriterion("dr_direction not between", value1, value2, "drDirection");
            return (Criteria) this;
        }

        public Criteria andDrRemarkIsNull() {
            addCriterion("dr_remark is null");
            return (Criteria) this;
        }

        public Criteria andDrRemarkIsNotNull() {
            addCriterion("dr_remark is not null");
            return (Criteria) this;
        }

        public Criteria andDrRemarkEqualTo(String value) {
            addCriterion("dr_remark =", value, "drRemark");
            return (Criteria) this;
        }

        public Criteria andDrRemarkNotEqualTo(String value) {
            addCriterion("dr_remark <>", value, "drRemark");
            return (Criteria) this;
        }

        public Criteria andDrRemarkGreaterThan(String value) {
            addCriterion("dr_remark >", value, "drRemark");
            return (Criteria) this;
        }

        public Criteria andDrRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("dr_remark >=", value, "drRemark");
            return (Criteria) this;
        }

        public Criteria andDrRemarkLessThan(String value) {
            addCriterion("dr_remark <", value, "drRemark");
            return (Criteria) this;
        }

        public Criteria andDrRemarkLessThanOrEqualTo(String value) {
            addCriterion("dr_remark <=", value, "drRemark");
            return (Criteria) this;
        }

        public Criteria andDrRemarkLike(String value) {
            addCriterion("dr_remark like", value, "drRemark");
            return (Criteria) this;
        }

        public Criteria andDrRemarkNotLike(String value) {
            addCriterion("dr_remark not like", value, "drRemark");
            return (Criteria) this;
        }

        public Criteria andDrRemarkIn(List<String> values) {
            addCriterion("dr_remark in", values, "drRemark");
            return (Criteria) this;
        }

        public Criteria andDrRemarkNotIn(List<String> values) {
            addCriterion("dr_remark not in", values, "drRemark");
            return (Criteria) this;
        }

        public Criteria andDrRemarkBetween(String value1, String value2) {
            addCriterion("dr_remark between", value1, value2, "drRemark");
            return (Criteria) this;
        }

        public Criteria andDrRemarkNotBetween(String value1, String value2) {
            addCriterion("dr_remark not between", value1, value2, "drRemark");
            return (Criteria) this;
        }

        public Criteria andDrNumberIsNull() {
            addCriterion("dr_number is null");
            return (Criteria) this;
        }

        public Criteria andDrNumberIsNotNull() {
            addCriterion("dr_number is not null");
            return (Criteria) this;
        }

        public Criteria andDrNumberEqualTo(Integer value) {
            addCriterion("dr_number =", value, "drNumber");
            return (Criteria) this;
        }

        public Criteria andDrNumberNotEqualTo(Integer value) {
            addCriterion("dr_number <>", value, "drNumber");
            return (Criteria) this;
        }

        public Criteria andDrNumberGreaterThan(Integer value) {
            addCriterion("dr_number >", value, "drNumber");
            return (Criteria) this;
        }

        public Criteria andDrNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr_number >=", value, "drNumber");
            return (Criteria) this;
        }

        public Criteria andDrNumberLessThan(Integer value) {
            addCriterion("dr_number <", value, "drNumber");
            return (Criteria) this;
        }

        public Criteria andDrNumberLessThanOrEqualTo(Integer value) {
            addCriterion("dr_number <=", value, "drNumber");
            return (Criteria) this;
        }

        public Criteria andDrNumberIn(List<Integer> values) {
            addCriterion("dr_number in", values, "drNumber");
            return (Criteria) this;
        }

        public Criteria andDrNumberNotIn(List<Integer> values) {
            addCriterion("dr_number not in", values, "drNumber");
            return (Criteria) this;
        }

        public Criteria andDrNumberBetween(Integer value1, Integer value2) {
            addCriterion("dr_number between", value1, value2, "drNumber");
            return (Criteria) this;
        }

        public Criteria andDrNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("dr_number not between", value1, value2, "drNumber");
            return (Criteria) this;
        }

        public Criteria andDrIsDelIsNull() {
            addCriterion("dr_is_del is null");
            return (Criteria) this;
        }

        public Criteria andDrIsDelIsNotNull() {
            addCriterion("dr_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andDrIsDelEqualTo(Integer value) {
            addCriterion("dr_is_del =", value, "drIsDel");
            return (Criteria) this;
        }

        public Criteria andDrIsDelNotEqualTo(Integer value) {
            addCriterion("dr_is_del <>", value, "drIsDel");
            return (Criteria) this;
        }

        public Criteria andDrIsDelGreaterThan(Integer value) {
            addCriterion("dr_is_del >", value, "drIsDel");
            return (Criteria) this;
        }

        public Criteria andDrIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr_is_del >=", value, "drIsDel");
            return (Criteria) this;
        }

        public Criteria andDrIsDelLessThan(Integer value) {
            addCriterion("dr_is_del <", value, "drIsDel");
            return (Criteria) this;
        }

        public Criteria andDrIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("dr_is_del <=", value, "drIsDel");
            return (Criteria) this;
        }

        public Criteria andDrIsDelIn(List<Integer> values) {
            addCriterion("dr_is_del in", values, "drIsDel");
            return (Criteria) this;
        }

        public Criteria andDrIsDelNotIn(List<Integer> values) {
            addCriterion("dr_is_del not in", values, "drIsDel");
            return (Criteria) this;
        }

        public Criteria andDrIsDelBetween(Integer value1, Integer value2) {
            addCriterion("dr_is_del between", value1, value2, "drIsDel");
            return (Criteria) this;
        }

        public Criteria andDrIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("dr_is_del not between", value1, value2, "drIsDel");
            return (Criteria) this;
        }

        public Criteria andDrCreateTimeIsNull() {
            addCriterion("dr_create_time is null");
            return (Criteria) this;
        }

        public Criteria andDrCreateTimeIsNotNull() {
            addCriterion("dr_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andDrCreateTimeEqualTo(Date value) {
            addCriterion("dr_create_time =", value, "drCreateTime");
            return (Criteria) this;
        }

        public Criteria andDrCreateTimeNotEqualTo(Date value) {
            addCriterion("dr_create_time <>", value, "drCreateTime");
            return (Criteria) this;
        }

        public Criteria andDrCreateTimeGreaterThan(Date value) {
            addCriterion("dr_create_time >", value, "drCreateTime");
            return (Criteria) this;
        }

        public Criteria andDrCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dr_create_time >=", value, "drCreateTime");
            return (Criteria) this;
        }

        public Criteria andDrCreateTimeLessThan(Date value) {
            addCriterion("dr_create_time <", value, "drCreateTime");
            return (Criteria) this;
        }

        public Criteria andDrCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dr_create_time <=", value, "drCreateTime");
            return (Criteria) this;
        }

        public Criteria andDrCreateTimeIn(List<Date> values) {
            addCriterion("dr_create_time in", values, "drCreateTime");
            return (Criteria) this;
        }

        public Criteria andDrCreateTimeNotIn(List<Date> values) {
            addCriterion("dr_create_time not in", values, "drCreateTime");
            return (Criteria) this;
        }

        public Criteria andDrCreateTimeBetween(Date value1, Date value2) {
            addCriterion("dr_create_time between", value1, value2, "drCreateTime");
            return (Criteria) this;
        }

        public Criteria andDrCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dr_create_time not between", value1, value2, "drCreateTime");
            return (Criteria) this;
        }

        public Criteria andDrUpdateTimeIsNull() {
            addCriterion("dr_update_time is null");
            return (Criteria) this;
        }

        public Criteria andDrUpdateTimeIsNotNull() {
            addCriterion("dr_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andDrUpdateTimeEqualTo(Date value) {
            addCriterion("dr_update_time =", value, "drUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDrUpdateTimeNotEqualTo(Date value) {
            addCriterion("dr_update_time <>", value, "drUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDrUpdateTimeGreaterThan(Date value) {
            addCriterion("dr_update_time >", value, "drUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDrUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dr_update_time >=", value, "drUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDrUpdateTimeLessThan(Date value) {
            addCriterion("dr_update_time <", value, "drUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDrUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dr_update_time <=", value, "drUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDrUpdateTimeIn(List<Date> values) {
            addCriterion("dr_update_time in", values, "drUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDrUpdateTimeNotIn(List<Date> values) {
            addCriterion("dr_update_time not in", values, "drUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDrUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("dr_update_time between", value1, value2, "drUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDrUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dr_update_time not between", value1, value2, "drUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
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