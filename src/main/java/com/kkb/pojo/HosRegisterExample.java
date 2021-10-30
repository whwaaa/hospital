package com.kkb.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HosRegisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HosRegisterExample() {
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

        public Criteria andHosrIdIsNull() {
            addCriterion("hosr_id is null");
            return (Criteria) this;
        }

        public Criteria andHosrIdIsNotNull() {
            addCriterion("hosr_id is not null");
            return (Criteria) this;
        }

        public Criteria andHosrIdEqualTo(Integer value) {
            addCriterion("hosr_id =", value, "hosrId");
            return (Criteria) this;
        }

        public Criteria andHosrIdNotEqualTo(Integer value) {
            addCriterion("hosr_id <>", value, "hosrId");
            return (Criteria) this;
        }

        public Criteria andHosrIdGreaterThan(Integer value) {
            addCriterion("hosr_id >", value, "hosrId");
            return (Criteria) this;
        }

        public Criteria andHosrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosr_id >=", value, "hosrId");
            return (Criteria) this;
        }

        public Criteria andHosrIdLessThan(Integer value) {
            addCriterion("hosr_id <", value, "hosrId");
            return (Criteria) this;
        }

        public Criteria andHosrIdLessThanOrEqualTo(Integer value) {
            addCriterion("hosr_id <=", value, "hosrId");
            return (Criteria) this;
        }

        public Criteria andHosrIdIn(List<Integer> values) {
            addCriterion("hosr_id in", values, "hosrId");
            return (Criteria) this;
        }

        public Criteria andHosrIdNotIn(List<Integer> values) {
            addCriterion("hosr_id not in", values, "hosrId");
            return (Criteria) this;
        }

        public Criteria andHosrIdBetween(Integer value1, Integer value2) {
            addCriterion("hosr_id between", value1, value2, "hosrId");
            return (Criteria) this;
        }

        public Criteria andHosrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hosr_id not between", value1, value2, "hosrId");
            return (Criteria) this;
        }

        public Criteria andHosrIdcarIsNull() {
            addCriterion("hosr_idcar is null");
            return (Criteria) this;
        }

        public Criteria andHosrIdcarIsNotNull() {
            addCriterion("hosr_idcar is not null");
            return (Criteria) this;
        }

        public Criteria andHosrIdcarEqualTo(String value) {
            addCriterion("hosr_idcar =", value, "hosrIdcar");
            return (Criteria) this;
        }

        public Criteria andHosrIdcarNotEqualTo(String value) {
            addCriterion("hosr_idcar <>", value, "hosrIdcar");
            return (Criteria) this;
        }

        public Criteria andHosrIdcarGreaterThan(String value) {
            addCriterion("hosr_idcar >", value, "hosrIdcar");
            return (Criteria) this;
        }

        public Criteria andHosrIdcarGreaterThanOrEqualTo(String value) {
            addCriterion("hosr_idcar >=", value, "hosrIdcar");
            return (Criteria) this;
        }

        public Criteria andHosrIdcarLessThan(String value) {
            addCriterion("hosr_idcar <", value, "hosrIdcar");
            return (Criteria) this;
        }

        public Criteria andHosrIdcarLessThanOrEqualTo(String value) {
            addCriterion("hosr_idcar <=", value, "hosrIdcar");
            return (Criteria) this;
        }

        public Criteria andHosrIdcarLike(String value) {
            addCriterion("hosr_idcar like", value, "hosrIdcar");
            return (Criteria) this;
        }

        public Criteria andHosrIdcarNotLike(String value) {
            addCriterion("hosr_idcar not like", value, "hosrIdcar");
            return (Criteria) this;
        }

        public Criteria andHosrIdcarIn(List<String> values) {
            addCriterion("hosr_idcar in", values, "hosrIdcar");
            return (Criteria) this;
        }

        public Criteria andHosrIdcarNotIn(List<String> values) {
            addCriterion("hosr_idcar not in", values, "hosrIdcar");
            return (Criteria) this;
        }

        public Criteria andHosrIdcarBetween(String value1, String value2) {
            addCriterion("hosr_idcar between", value1, value2, "hosrIdcar");
            return (Criteria) this;
        }

        public Criteria andHosrIdcarNotBetween(String value1, String value2) {
            addCriterion("hosr_idcar not between", value1, value2, "hosrIdcar");
            return (Criteria) this;
        }

        public Criteria andHosrMedicalIsNull() {
            addCriterion("hosr_medical is null");
            return (Criteria) this;
        }

        public Criteria andHosrMedicalIsNotNull() {
            addCriterion("hosr_medical is not null");
            return (Criteria) this;
        }

        public Criteria andHosrMedicalEqualTo(String value) {
            addCriterion("hosr_medical =", value, "hosrMedical");
            return (Criteria) this;
        }

        public Criteria andHosrMedicalNotEqualTo(String value) {
            addCriterion("hosr_medical <>", value, "hosrMedical");
            return (Criteria) this;
        }

        public Criteria andHosrMedicalGreaterThan(String value) {
            addCriterion("hosr_medical >", value, "hosrMedical");
            return (Criteria) this;
        }

        public Criteria andHosrMedicalGreaterThanOrEqualTo(String value) {
            addCriterion("hosr_medical >=", value, "hosrMedical");
            return (Criteria) this;
        }

        public Criteria andHosrMedicalLessThan(String value) {
            addCriterion("hosr_medical <", value, "hosrMedical");
            return (Criteria) this;
        }

        public Criteria andHosrMedicalLessThanOrEqualTo(String value) {
            addCriterion("hosr_medical <=", value, "hosrMedical");
            return (Criteria) this;
        }

        public Criteria andHosrMedicalLike(String value) {
            addCriterion("hosr_medical like", value, "hosrMedical");
            return (Criteria) this;
        }

        public Criteria andHosrMedicalNotLike(String value) {
            addCriterion("hosr_medical not like", value, "hosrMedical");
            return (Criteria) this;
        }

        public Criteria andHosrMedicalIn(List<String> values) {
            addCriterion("hosr_medical in", values, "hosrMedical");
            return (Criteria) this;
        }

        public Criteria andHosrMedicalNotIn(List<String> values) {
            addCriterion("hosr_medical not in", values, "hosrMedical");
            return (Criteria) this;
        }

        public Criteria andHosrMedicalBetween(String value1, String value2) {
            addCriterion("hosr_medical between", value1, value2, "hosrMedical");
            return (Criteria) this;
        }

        public Criteria andHosrMedicalNotBetween(String value1, String value2) {
            addCriterion("hosr_medical not between", value1, value2, "hosrMedical");
            return (Criteria) this;
        }

        public Criteria andHosrRegPriceIsNull() {
            addCriterion("hosr_reg_price is null");
            return (Criteria) this;
        }

        public Criteria andHosrRegPriceIsNotNull() {
            addCriterion("hosr_reg_price is not null");
            return (Criteria) this;
        }

        public Criteria andHosrRegPriceEqualTo(BigDecimal value) {
            addCriterion("hosr_reg_price =", value, "hosrRegPrice");
            return (Criteria) this;
        }

        public Criteria andHosrRegPriceNotEqualTo(BigDecimal value) {
            addCriterion("hosr_reg_price <>", value, "hosrRegPrice");
            return (Criteria) this;
        }

        public Criteria andHosrRegPriceGreaterThan(BigDecimal value) {
            addCriterion("hosr_reg_price >", value, "hosrRegPrice");
            return (Criteria) this;
        }

        public Criteria andHosrRegPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hosr_reg_price >=", value, "hosrRegPrice");
            return (Criteria) this;
        }

        public Criteria andHosrRegPriceLessThan(BigDecimal value) {
            addCriterion("hosr_reg_price <", value, "hosrRegPrice");
            return (Criteria) this;
        }

        public Criteria andHosrRegPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hosr_reg_price <=", value, "hosrRegPrice");
            return (Criteria) this;
        }

        public Criteria andHosrRegPriceIn(List<BigDecimal> values) {
            addCriterion("hosr_reg_price in", values, "hosrRegPrice");
            return (Criteria) this;
        }

        public Criteria andHosrRegPriceNotIn(List<BigDecimal> values) {
            addCriterion("hosr_reg_price not in", values, "hosrRegPrice");
            return (Criteria) this;
        }

        public Criteria andHosrRegPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hosr_reg_price between", value1, value2, "hosrRegPrice");
            return (Criteria) this;
        }

        public Criteria andHosrRegPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hosr_reg_price not between", value1, value2, "hosrRegPrice");
            return (Criteria) this;
        }

        public Criteria andHosrPhoneIsNull() {
            addCriterion("hosr_phone is null");
            return (Criteria) this;
        }

        public Criteria andHosrPhoneIsNotNull() {
            addCriterion("hosr_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHosrPhoneEqualTo(String value) {
            addCriterion("hosr_phone =", value, "hosrPhone");
            return (Criteria) this;
        }

        public Criteria andHosrPhoneNotEqualTo(String value) {
            addCriterion("hosr_phone <>", value, "hosrPhone");
            return (Criteria) this;
        }

        public Criteria andHosrPhoneGreaterThan(String value) {
            addCriterion("hosr_phone >", value, "hosrPhone");
            return (Criteria) this;
        }

        public Criteria andHosrPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("hosr_phone >=", value, "hosrPhone");
            return (Criteria) this;
        }

        public Criteria andHosrPhoneLessThan(String value) {
            addCriterion("hosr_phone <", value, "hosrPhone");
            return (Criteria) this;
        }

        public Criteria andHosrPhoneLessThanOrEqualTo(String value) {
            addCriterion("hosr_phone <=", value, "hosrPhone");
            return (Criteria) this;
        }

        public Criteria andHosrPhoneLike(String value) {
            addCriterion("hosr_phone like", value, "hosrPhone");
            return (Criteria) this;
        }

        public Criteria andHosrPhoneNotLike(String value) {
            addCriterion("hosr_phone not like", value, "hosrPhone");
            return (Criteria) this;
        }

        public Criteria andHosrPhoneIn(List<String> values) {
            addCriterion("hosr_phone in", values, "hosrPhone");
            return (Criteria) this;
        }

        public Criteria andHosrPhoneNotIn(List<String> values) {
            addCriterion("hosr_phone not in", values, "hosrPhone");
            return (Criteria) this;
        }

        public Criteria andHosrPhoneBetween(String value1, String value2) {
            addCriterion("hosr_phone between", value1, value2, "hosrPhone");
            return (Criteria) this;
        }

        public Criteria andHosrPhoneNotBetween(String value1, String value2) {
            addCriterion("hosr_phone not between", value1, value2, "hosrPhone");
            return (Criteria) this;
        }

        public Criteria andHosrSelfPriceIsNull() {
            addCriterion("hosr_self_price is null");
            return (Criteria) this;
        }

        public Criteria andHosrSelfPriceIsNotNull() {
            addCriterion("hosr_self_price is not null");
            return (Criteria) this;
        }

        public Criteria andHosrSelfPriceEqualTo(Integer value) {
            addCriterion("hosr_self_price =", value, "hosrSelfPrice");
            return (Criteria) this;
        }

        public Criteria andHosrSelfPriceNotEqualTo(Integer value) {
            addCriterion("hosr_self_price <>", value, "hosrSelfPrice");
            return (Criteria) this;
        }

        public Criteria andHosrSelfPriceGreaterThan(Integer value) {
            addCriterion("hosr_self_price >", value, "hosrSelfPrice");
            return (Criteria) this;
        }

        public Criteria andHosrSelfPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosr_self_price >=", value, "hosrSelfPrice");
            return (Criteria) this;
        }

        public Criteria andHosrSelfPriceLessThan(Integer value) {
            addCriterion("hosr_self_price <", value, "hosrSelfPrice");
            return (Criteria) this;
        }

        public Criteria andHosrSelfPriceLessThanOrEqualTo(Integer value) {
            addCriterion("hosr_self_price <=", value, "hosrSelfPrice");
            return (Criteria) this;
        }

        public Criteria andHosrSelfPriceIn(List<Integer> values) {
            addCriterion("hosr_self_price in", values, "hosrSelfPrice");
            return (Criteria) this;
        }

        public Criteria andHosrSelfPriceNotIn(List<Integer> values) {
            addCriterion("hosr_self_price not in", values, "hosrSelfPrice");
            return (Criteria) this;
        }

        public Criteria andHosrSelfPriceBetween(Integer value1, Integer value2) {
            addCriterion("hosr_self_price between", value1, value2, "hosrSelfPrice");
            return (Criteria) this;
        }

        public Criteria andHosrSelfPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("hosr_self_price not between", value1, value2, "hosrSelfPrice");
            return (Criteria) this;
        }

        public Criteria andHosrSexIsNull() {
            addCriterion("hosr_sex is null");
            return (Criteria) this;
        }

        public Criteria andHosrSexIsNotNull() {
            addCriterion("hosr_sex is not null");
            return (Criteria) this;
        }

        public Criteria andHosrSexEqualTo(Integer value) {
            addCriterion("hosr_sex =", value, "hosrSex");
            return (Criteria) this;
        }

        public Criteria andHosrSexNotEqualTo(Integer value) {
            addCriterion("hosr_sex <>", value, "hosrSex");
            return (Criteria) this;
        }

        public Criteria andHosrSexGreaterThan(Integer value) {
            addCriterion("hosr_sex >", value, "hosrSex");
            return (Criteria) this;
        }

        public Criteria andHosrSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosr_sex >=", value, "hosrSex");
            return (Criteria) this;
        }

        public Criteria andHosrSexLessThan(Integer value) {
            addCriterion("hosr_sex <", value, "hosrSex");
            return (Criteria) this;
        }

        public Criteria andHosrSexLessThanOrEqualTo(Integer value) {
            addCriterion("hosr_sex <=", value, "hosrSex");
            return (Criteria) this;
        }

        public Criteria andHosrSexIn(List<Integer> values) {
            addCriterion("hosr_sex in", values, "hosrSex");
            return (Criteria) this;
        }

        public Criteria andHosrSexNotIn(List<Integer> values) {
            addCriterion("hosr_sex not in", values, "hosrSex");
            return (Criteria) this;
        }

        public Criteria andHosrSexBetween(Integer value1, Integer value2) {
            addCriterion("hosr_sex between", value1, value2, "hosrSex");
            return (Criteria) this;
        }

        public Criteria andHosrSexNotBetween(Integer value1, Integer value2) {
            addCriterion("hosr_sex not between", value1, value2, "hosrSex");
            return (Criteria) this;
        }

        public Criteria andHosrAgeIsNull() {
            addCriterion("hosr_age is null");
            return (Criteria) this;
        }

        public Criteria andHosrAgeIsNotNull() {
            addCriterion("hosr_age is not null");
            return (Criteria) this;
        }

        public Criteria andHosrAgeEqualTo(Integer value) {
            addCriterion("hosr_age =", value, "hosrAge");
            return (Criteria) this;
        }

        public Criteria andHosrAgeNotEqualTo(Integer value) {
            addCriterion("hosr_age <>", value, "hosrAge");
            return (Criteria) this;
        }

        public Criteria andHosrAgeGreaterThan(Integer value) {
            addCriterion("hosr_age >", value, "hosrAge");
            return (Criteria) this;
        }

        public Criteria andHosrAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosr_age >=", value, "hosrAge");
            return (Criteria) this;
        }

        public Criteria andHosrAgeLessThan(Integer value) {
            addCriterion("hosr_age <", value, "hosrAge");
            return (Criteria) this;
        }

        public Criteria andHosrAgeLessThanOrEqualTo(Integer value) {
            addCriterion("hosr_age <=", value, "hosrAge");
            return (Criteria) this;
        }

        public Criteria andHosrAgeIn(List<Integer> values) {
            addCriterion("hosr_age in", values, "hosrAge");
            return (Criteria) this;
        }

        public Criteria andHosrAgeNotIn(List<Integer> values) {
            addCriterion("hosr_age not in", values, "hosrAge");
            return (Criteria) this;
        }

        public Criteria andHosrAgeBetween(Integer value1, Integer value2) {
            addCriterion("hosr_age between", value1, value2, "hosrAge");
            return (Criteria) this;
        }

        public Criteria andHosrAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("hosr_age not between", value1, value2, "hosrAge");
            return (Criteria) this;
        }

        public Criteria andHosrWorkIsNull() {
            addCriterion("hosr_work is null");
            return (Criteria) this;
        }

        public Criteria andHosrWorkIsNotNull() {
            addCriterion("hosr_work is not null");
            return (Criteria) this;
        }

        public Criteria andHosrWorkEqualTo(String value) {
            addCriterion("hosr_work =", value, "hosrWork");
            return (Criteria) this;
        }

        public Criteria andHosrWorkNotEqualTo(String value) {
            addCriterion("hosr_work <>", value, "hosrWork");
            return (Criteria) this;
        }

        public Criteria andHosrWorkGreaterThan(String value) {
            addCriterion("hosr_work >", value, "hosrWork");
            return (Criteria) this;
        }

        public Criteria andHosrWorkGreaterThanOrEqualTo(String value) {
            addCriterion("hosr_work >=", value, "hosrWork");
            return (Criteria) this;
        }

        public Criteria andHosrWorkLessThan(String value) {
            addCriterion("hosr_work <", value, "hosrWork");
            return (Criteria) this;
        }

        public Criteria andHosrWorkLessThanOrEqualTo(String value) {
            addCriterion("hosr_work <=", value, "hosrWork");
            return (Criteria) this;
        }

        public Criteria andHosrWorkLike(String value) {
            addCriterion("hosr_work like", value, "hosrWork");
            return (Criteria) this;
        }

        public Criteria andHosrWorkNotLike(String value) {
            addCriterion("hosr_work not like", value, "hosrWork");
            return (Criteria) this;
        }

        public Criteria andHosrWorkIn(List<String> values) {
            addCriterion("hosr_work in", values, "hosrWork");
            return (Criteria) this;
        }

        public Criteria andHosrWorkNotIn(List<String> values) {
            addCriterion("hosr_work not in", values, "hosrWork");
            return (Criteria) this;
        }

        public Criteria andHosrWorkBetween(String value1, String value2) {
            addCriterion("hosr_work between", value1, value2, "hosrWork");
            return (Criteria) this;
        }

        public Criteria andHosrWorkNotBetween(String value1, String value2) {
            addCriterion("hosr_work not between", value1, value2, "hosrWork");
            return (Criteria) this;
        }

        public Criteria andHosrLookDoctorIsNull() {
            addCriterion("hosr_look_doctor is null");
            return (Criteria) this;
        }

        public Criteria andHosrLookDoctorIsNotNull() {
            addCriterion("hosr_look_doctor is not null");
            return (Criteria) this;
        }

        public Criteria andHosrLookDoctorEqualTo(String value) {
            addCriterion("hosr_look_doctor =", value, "hosrLookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosrLookDoctorNotEqualTo(String value) {
            addCriterion("hosr_look_doctor <>", value, "hosrLookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosrLookDoctorGreaterThan(String value) {
            addCriterion("hosr_look_doctor >", value, "hosrLookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosrLookDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("hosr_look_doctor >=", value, "hosrLookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosrLookDoctorLessThan(String value) {
            addCriterion("hosr_look_doctor <", value, "hosrLookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosrLookDoctorLessThanOrEqualTo(String value) {
            addCriterion("hosr_look_doctor <=", value, "hosrLookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosrLookDoctorLike(String value) {
            addCriterion("hosr_look_doctor like", value, "hosrLookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosrLookDoctorNotLike(String value) {
            addCriterion("hosr_look_doctor not like", value, "hosrLookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosrLookDoctorIn(List<String> values) {
            addCriterion("hosr_look_doctor in", values, "hosrLookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosrLookDoctorNotIn(List<String> values) {
            addCriterion("hosr_look_doctor not in", values, "hosrLookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosrLookDoctorBetween(String value1, String value2) {
            addCriterion("hosr_look_doctor between", value1, value2, "hosrLookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosrLookDoctorNotBetween(String value1, String value2) {
            addCriterion("hosr_look_doctor not between", value1, value2, "hosrLookDoctor");
            return (Criteria) this;
        }

        public Criteria andDIdIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andHosrRemarkIsNull() {
            addCriterion("hosr_remark is null");
            return (Criteria) this;
        }

        public Criteria andHosrRemarkIsNotNull() {
            addCriterion("hosr_remark is not null");
            return (Criteria) this;
        }

        public Criteria andHosrRemarkEqualTo(String value) {
            addCriterion("hosr_remark =", value, "hosrRemark");
            return (Criteria) this;
        }

        public Criteria andHosrRemarkNotEqualTo(String value) {
            addCriterion("hosr_remark <>", value, "hosrRemark");
            return (Criteria) this;
        }

        public Criteria andHosrRemarkGreaterThan(String value) {
            addCriterion("hosr_remark >", value, "hosrRemark");
            return (Criteria) this;
        }

        public Criteria andHosrRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("hosr_remark >=", value, "hosrRemark");
            return (Criteria) this;
        }

        public Criteria andHosrRemarkLessThan(String value) {
            addCriterion("hosr_remark <", value, "hosrRemark");
            return (Criteria) this;
        }

        public Criteria andHosrRemarkLessThanOrEqualTo(String value) {
            addCriterion("hosr_remark <=", value, "hosrRemark");
            return (Criteria) this;
        }

        public Criteria andHosrRemarkLike(String value) {
            addCriterion("hosr_remark like", value, "hosrRemark");
            return (Criteria) this;
        }

        public Criteria andHosrRemarkNotLike(String value) {
            addCriterion("hosr_remark not like", value, "hosrRemark");
            return (Criteria) this;
        }

        public Criteria andHosrRemarkIn(List<String> values) {
            addCriterion("hosr_remark in", values, "hosrRemark");
            return (Criteria) this;
        }

        public Criteria andHosrRemarkNotIn(List<String> values) {
            addCriterion("hosr_remark not in", values, "hosrRemark");
            return (Criteria) this;
        }

        public Criteria andHosrRemarkBetween(String value1, String value2) {
            addCriterion("hosr_remark between", value1, value2, "hosrRemark");
            return (Criteria) this;
        }

        public Criteria andHosrRemarkNotBetween(String value1, String value2) {
            addCriterion("hosr_remark not between", value1, value2, "hosrRemark");
            return (Criteria) this;
        }

        public Criteria andHosrStateIsNull() {
            addCriterion("hosr_state is null");
            return (Criteria) this;
        }

        public Criteria andHosrStateIsNotNull() {
            addCriterion("hosr_state is not null");
            return (Criteria) this;
        }

        public Criteria andHosrStateEqualTo(Integer value) {
            addCriterion("hosr_state =", value, "hosrState");
            return (Criteria) this;
        }

        public Criteria andHosrStateNotEqualTo(Integer value) {
            addCriterion("hosr_state <>", value, "hosrState");
            return (Criteria) this;
        }

        public Criteria andHosrStateGreaterThan(Integer value) {
            addCriterion("hosr_state >", value, "hosrState");
            return (Criteria) this;
        }

        public Criteria andHosrStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosr_state >=", value, "hosrState");
            return (Criteria) this;
        }

        public Criteria andHosrStateLessThan(Integer value) {
            addCriterion("hosr_state <", value, "hosrState");
            return (Criteria) this;
        }

        public Criteria andHosrStateLessThanOrEqualTo(Integer value) {
            addCriterion("hosr_state <=", value, "hosrState");
            return (Criteria) this;
        }

        public Criteria andHosrStateIn(List<Integer> values) {
            addCriterion("hosr_state in", values, "hosrState");
            return (Criteria) this;
        }

        public Criteria andHosrStateNotIn(List<Integer> values) {
            addCriterion("hosr_state not in", values, "hosrState");
            return (Criteria) this;
        }

        public Criteria andHosrStateBetween(Integer value1, Integer value2) {
            addCriterion("hosr_state between", value1, value2, "hosrState");
            return (Criteria) this;
        }

        public Criteria andHosrStateNotBetween(Integer value1, Integer value2) {
            addCriterion("hosr_state not between", value1, value2, "hosrState");
            return (Criteria) this;
        }

        public Criteria andHosrIsDelIsNull() {
            addCriterion("hosr_is_del is null");
            return (Criteria) this;
        }

        public Criteria andHosrIsDelIsNotNull() {
            addCriterion("hosr_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andHosrIsDelEqualTo(Integer value) {
            addCriterion("hosr_is_del =", value, "hosrIsDel");
            return (Criteria) this;
        }

        public Criteria andHosrIsDelNotEqualTo(Integer value) {
            addCriterion("hosr_is_del <>", value, "hosrIsDel");
            return (Criteria) this;
        }

        public Criteria andHosrIsDelGreaterThan(Integer value) {
            addCriterion("hosr_is_del >", value, "hosrIsDel");
            return (Criteria) this;
        }

        public Criteria andHosrIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosr_is_del >=", value, "hosrIsDel");
            return (Criteria) this;
        }

        public Criteria andHosrIsDelLessThan(Integer value) {
            addCriterion("hosr_is_del <", value, "hosrIsDel");
            return (Criteria) this;
        }

        public Criteria andHosrIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("hosr_is_del <=", value, "hosrIsDel");
            return (Criteria) this;
        }

        public Criteria andHosrIsDelIn(List<Integer> values) {
            addCriterion("hosr_is_del in", values, "hosrIsDel");
            return (Criteria) this;
        }

        public Criteria andHosrIsDelNotIn(List<Integer> values) {
            addCriterion("hosr_is_del not in", values, "hosrIsDel");
            return (Criteria) this;
        }

        public Criteria andHosrIsDelBetween(Integer value1, Integer value2) {
            addCriterion("hosr_is_del between", value1, value2, "hosrIsDel");
            return (Criteria) this;
        }

        public Criteria andHosrIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("hosr_is_del not between", value1, value2, "hosrIsDel");
            return (Criteria) this;
        }

        public Criteria andHosrCreateTimeIsNull() {
            addCriterion("hosr_create_time is null");
            return (Criteria) this;
        }

        public Criteria andHosrCreateTimeIsNotNull() {
            addCriterion("hosr_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andHosrCreateTimeEqualTo(Date value) {
            addCriterion("hosr_create_time =", value, "hosrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHosrCreateTimeNotEqualTo(Date value) {
            addCriterion("hosr_create_time <>", value, "hosrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHosrCreateTimeGreaterThan(Date value) {
            addCriterion("hosr_create_time >", value, "hosrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHosrCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("hosr_create_time >=", value, "hosrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHosrCreateTimeLessThan(Date value) {
            addCriterion("hosr_create_time <", value, "hosrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHosrCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("hosr_create_time <=", value, "hosrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHosrCreateTimeIn(List<Date> values) {
            addCriterion("hosr_create_time in", values, "hosrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHosrCreateTimeNotIn(List<Date> values) {
            addCriterion("hosr_create_time not in", values, "hosrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHosrCreateTimeBetween(Date value1, Date value2) {
            addCriterion("hosr_create_time between", value1, value2, "hosrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHosrCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("hosr_create_time not between", value1, value2, "hosrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHosrUpdateTimeIsNull() {
            addCriterion("hosr_update_time is null");
            return (Criteria) this;
        }

        public Criteria andHosrUpdateTimeIsNotNull() {
            addCriterion("hosr_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andHosrUpdateTimeEqualTo(Date value) {
            addCriterion("hosr_update_time =", value, "hosrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHosrUpdateTimeNotEqualTo(Date value) {
            addCriterion("hosr_update_time <>", value, "hosrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHosrUpdateTimeGreaterThan(Date value) {
            addCriterion("hosr_update_time >", value, "hosrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHosrUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("hosr_update_time >=", value, "hosrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHosrUpdateTimeLessThan(Date value) {
            addCriterion("hosr_update_time <", value, "hosrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHosrUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("hosr_update_time <=", value, "hosrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHosrUpdateTimeIn(List<Date> values) {
            addCriterion("hosr_update_time in", values, "hosrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHosrUpdateTimeNotIn(List<Date> values) {
            addCriterion("hosr_update_time not in", values, "hosrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHosrUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("hosr_update_time between", value1, value2, "hosrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHosrUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("hosr_update_time not between", value1, value2, "hosrUpdateTime");
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