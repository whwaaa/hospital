package com.kkb.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HosregisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HosregisterExample() {
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

        public Criteria andHosR_idIsNull() {
            addCriterion("hosR_id is null");
            return (Criteria) this;
        }

        public Criteria andHosR_idIsNotNull() {
            addCriterion("hosR_id is not null");
            return (Criteria) this;
        }

        public Criteria andHosR_idEqualTo(Integer value) {
            addCriterion("hosR_id =", value, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idNotEqualTo(Integer value) {
            addCriterion("hosR_id <>", value, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idGreaterThan(Integer value) {
            addCriterion("hosR_id >", value, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosR_id >=", value, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idLessThan(Integer value) {
            addCriterion("hosR_id <", value, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idLessThanOrEqualTo(Integer value) {
            addCriterion("hosR_id <=", value, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idIn(List<Integer> values) {
            addCriterion("hosR_id in", values, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idNotIn(List<Integer> values) {
            addCriterion("hosR_id not in", values, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idBetween(Integer value1, Integer value2) {
            addCriterion("hosR_id between", value1, value2, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idNotBetween(Integer value1, Integer value2) {
            addCriterion("hosR_id not between", value1, value2, "hosR_id");
            return (Criteria) this;
        }

        public Criteria andHosR_idCarIsNull() {
            addCriterion("hosR_idCar is null");
            return (Criteria) this;
        }

        public Criteria andHosR_idCarIsNotNull() {
            addCriterion("hosR_idCar is not null");
            return (Criteria) this;
        }

        public Criteria andHosR_idCarEqualTo(String value) {
            addCriterion("hosR_idCar =", value, "hosR_idCar");
            return (Criteria) this;
        }

        public Criteria andHosR_idCarNotEqualTo(String value) {
            addCriterion("hosR_idCar <>", value, "hosR_idCar");
            return (Criteria) this;
        }

        public Criteria andHosR_idCarGreaterThan(String value) {
            addCriterion("hosR_idCar >", value, "hosR_idCar");
            return (Criteria) this;
        }

        public Criteria andHosR_idCarGreaterThanOrEqualTo(String value) {
            addCriterion("hosR_idCar >=", value, "hosR_idCar");
            return (Criteria) this;
        }

        public Criteria andHosR_idCarLessThan(String value) {
            addCriterion("hosR_idCar <", value, "hosR_idCar");
            return (Criteria) this;
        }

        public Criteria andHosR_idCarLessThanOrEqualTo(String value) {
            addCriterion("hosR_idCar <=", value, "hosR_idCar");
            return (Criteria) this;
        }

        public Criteria andHosR_idCarLike(String value) {
            addCriterion("hosR_idCar like", value, "hosR_idCar");
            return (Criteria) this;
        }

        public Criteria andHosR_idCarNotLike(String value) {
            addCriterion("hosR_idCar not like", value, "hosR_idCar");
            return (Criteria) this;
        }

        public Criteria andHosR_idCarIn(List<String> values) {
            addCriterion("hosR_idCar in", values, "hosR_idCar");
            return (Criteria) this;
        }

        public Criteria andHosR_idCarNotIn(List<String> values) {
            addCriterion("hosR_idCar not in", values, "hosR_idCar");
            return (Criteria) this;
        }

        public Criteria andHosR_idCarBetween(String value1, String value2) {
            addCriterion("hosR_idCar between", value1, value2, "hosR_idCar");
            return (Criteria) this;
        }

        public Criteria andHosR_idCarNotBetween(String value1, String value2) {
            addCriterion("hosR_idCar not between", value1, value2, "hosR_idCar");
            return (Criteria) this;
        }

        public Criteria andHosR_medicalIsNull() {
            addCriterion("hosR_medical is null");
            return (Criteria) this;
        }

        public Criteria andHosR_medicalIsNotNull() {
            addCriterion("hosR_medical is not null");
            return (Criteria) this;
        }

        public Criteria andHosR_medicalEqualTo(String value) {
            addCriterion("hosR_medical =", value, "hosR_medical");
            return (Criteria) this;
        }

        public Criteria andHosR_medicalNotEqualTo(String value) {
            addCriterion("hosR_medical <>", value, "hosR_medical");
            return (Criteria) this;
        }

        public Criteria andHosR_medicalGreaterThan(String value) {
            addCriterion("hosR_medical >", value, "hosR_medical");
            return (Criteria) this;
        }

        public Criteria andHosR_medicalGreaterThanOrEqualTo(String value) {
            addCriterion("hosR_medical >=", value, "hosR_medical");
            return (Criteria) this;
        }

        public Criteria andHosR_medicalLessThan(String value) {
            addCriterion("hosR_medical <", value, "hosR_medical");
            return (Criteria) this;
        }

        public Criteria andHosR_medicalLessThanOrEqualTo(String value) {
            addCriterion("hosR_medical <=", value, "hosR_medical");
            return (Criteria) this;
        }

        public Criteria andHosR_medicalLike(String value) {
            addCriterion("hosR_medical like", value, "hosR_medical");
            return (Criteria) this;
        }

        public Criteria andHosR_medicalNotLike(String value) {
            addCriterion("hosR_medical not like", value, "hosR_medical");
            return (Criteria) this;
        }

        public Criteria andHosR_medicalIn(List<String> values) {
            addCriterion("hosR_medical in", values, "hosR_medical");
            return (Criteria) this;
        }

        public Criteria andHosR_medicalNotIn(List<String> values) {
            addCriterion("hosR_medical not in", values, "hosR_medical");
            return (Criteria) this;
        }

        public Criteria andHosR_medicalBetween(String value1, String value2) {
            addCriterion("hosR_medical between", value1, value2, "hosR_medical");
            return (Criteria) this;
        }

        public Criteria andHosR_medicalNotBetween(String value1, String value2) {
            addCriterion("hosR_medical not between", value1, value2, "hosR_medical");
            return (Criteria) this;
        }

        public Criteria andHosR_regPriceIsNull() {
            addCriterion("hosR_regPrice is null");
            return (Criteria) this;
        }

        public Criteria andHosR_regPriceIsNotNull() {
            addCriterion("hosR_regPrice is not null");
            return (Criteria) this;
        }

        public Criteria andHosR_regPriceEqualTo(BigDecimal value) {
            addCriterion("hosR_regPrice =", value, "hosR_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_regPriceNotEqualTo(BigDecimal value) {
            addCriterion("hosR_regPrice <>", value, "hosR_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_regPriceGreaterThan(BigDecimal value) {
            addCriterion("hosR_regPrice >", value, "hosR_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_regPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hosR_regPrice >=", value, "hosR_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_regPriceLessThan(BigDecimal value) {
            addCriterion("hosR_regPrice <", value, "hosR_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_regPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hosR_regPrice <=", value, "hosR_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_regPriceIn(List<BigDecimal> values) {
            addCriterion("hosR_regPrice in", values, "hosR_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_regPriceNotIn(List<BigDecimal> values) {
            addCriterion("hosR_regPrice not in", values, "hosR_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_regPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hosR_regPrice between", value1, value2, "hosR_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_regPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hosR_regPrice not between", value1, value2, "hosR_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_phoneIsNull() {
            addCriterion("hosR_phone is null");
            return (Criteria) this;
        }

        public Criteria andHosR_phoneIsNotNull() {
            addCriterion("hosR_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHosR_phoneEqualTo(String value) {
            addCriterion("hosR_phone =", value, "hosR_phone");
            return (Criteria) this;
        }

        public Criteria andHosR_phoneNotEqualTo(String value) {
            addCriterion("hosR_phone <>", value, "hosR_phone");
            return (Criteria) this;
        }

        public Criteria andHosR_phoneGreaterThan(String value) {
            addCriterion("hosR_phone >", value, "hosR_phone");
            return (Criteria) this;
        }

        public Criteria andHosR_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("hosR_phone >=", value, "hosR_phone");
            return (Criteria) this;
        }

        public Criteria andHosR_phoneLessThan(String value) {
            addCriterion("hosR_phone <", value, "hosR_phone");
            return (Criteria) this;
        }

        public Criteria andHosR_phoneLessThanOrEqualTo(String value) {
            addCriterion("hosR_phone <=", value, "hosR_phone");
            return (Criteria) this;
        }

        public Criteria andHosR_phoneLike(String value) {
            addCriterion("hosR_phone like", value, "hosR_phone");
            return (Criteria) this;
        }

        public Criteria andHosR_phoneNotLike(String value) {
            addCriterion("hosR_phone not like", value, "hosR_phone");
            return (Criteria) this;
        }

        public Criteria andHosR_phoneIn(List<String> values) {
            addCriterion("hosR_phone in", values, "hosR_phone");
            return (Criteria) this;
        }

        public Criteria andHosR_phoneNotIn(List<String> values) {
            addCriterion("hosR_phone not in", values, "hosR_phone");
            return (Criteria) this;
        }

        public Criteria andHosR_phoneBetween(String value1, String value2) {
            addCriterion("hosR_phone between", value1, value2, "hosR_phone");
            return (Criteria) this;
        }

        public Criteria andHosR_phoneNotBetween(String value1, String value2) {
            addCriterion("hosR_phone not between", value1, value2, "hosR_phone");
            return (Criteria) this;
        }

        public Criteria andHosR_selfPriceIsNull() {
            addCriterion("hosR_selfPrice is null");
            return (Criteria) this;
        }

        public Criteria andHosR_selfPriceIsNotNull() {
            addCriterion("hosR_selfPrice is not null");
            return (Criteria) this;
        }

        public Criteria andHosR_selfPriceEqualTo(Integer value) {
            addCriterion("hosR_selfPrice =", value, "hosR_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_selfPriceNotEqualTo(Integer value) {
            addCriterion("hosR_selfPrice <>", value, "hosR_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_selfPriceGreaterThan(Integer value) {
            addCriterion("hosR_selfPrice >", value, "hosR_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_selfPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosR_selfPrice >=", value, "hosR_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_selfPriceLessThan(Integer value) {
            addCriterion("hosR_selfPrice <", value, "hosR_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_selfPriceLessThanOrEqualTo(Integer value) {
            addCriterion("hosR_selfPrice <=", value, "hosR_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_selfPriceIn(List<Integer> values) {
            addCriterion("hosR_selfPrice in", values, "hosR_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_selfPriceNotIn(List<Integer> values) {
            addCriterion("hosR_selfPrice not in", values, "hosR_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_selfPriceBetween(Integer value1, Integer value2) {
            addCriterion("hosR_selfPrice between", value1, value2, "hosR_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_selfPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("hosR_selfPrice not between", value1, value2, "hosR_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosR_sexIsNull() {
            addCriterion("hosR_sex is null");
            return (Criteria) this;
        }

        public Criteria andHosR_sexIsNotNull() {
            addCriterion("hosR_sex is not null");
            return (Criteria) this;
        }

        public Criteria andHosR_sexEqualTo(Integer value) {
            addCriterion("hosR_sex =", value, "hosR_sex");
            return (Criteria) this;
        }

        public Criteria andHosR_sexNotEqualTo(Integer value) {
            addCriterion("hosR_sex <>", value, "hosR_sex");
            return (Criteria) this;
        }

        public Criteria andHosR_sexGreaterThan(Integer value) {
            addCriterion("hosR_sex >", value, "hosR_sex");
            return (Criteria) this;
        }

        public Criteria andHosR_sexGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosR_sex >=", value, "hosR_sex");
            return (Criteria) this;
        }

        public Criteria andHosR_sexLessThan(Integer value) {
            addCriterion("hosR_sex <", value, "hosR_sex");
            return (Criteria) this;
        }

        public Criteria andHosR_sexLessThanOrEqualTo(Integer value) {
            addCriterion("hosR_sex <=", value, "hosR_sex");
            return (Criteria) this;
        }

        public Criteria andHosR_sexIn(List<Integer> values) {
            addCriterion("hosR_sex in", values, "hosR_sex");
            return (Criteria) this;
        }

        public Criteria andHosR_sexNotIn(List<Integer> values) {
            addCriterion("hosR_sex not in", values, "hosR_sex");
            return (Criteria) this;
        }

        public Criteria andHosR_sexBetween(Integer value1, Integer value2) {
            addCriterion("hosR_sex between", value1, value2, "hosR_sex");
            return (Criteria) this;
        }

        public Criteria andHosR_sexNotBetween(Integer value1, Integer value2) {
            addCriterion("hosR_sex not between", value1, value2, "hosR_sex");
            return (Criteria) this;
        }

        public Criteria andHosR_ageIsNull() {
            addCriterion("hosR_age is null");
            return (Criteria) this;
        }

        public Criteria andHosR_ageIsNotNull() {
            addCriterion("hosR_age is not null");
            return (Criteria) this;
        }

        public Criteria andHosR_ageEqualTo(Integer value) {
            addCriterion("hosR_age =", value, "hosR_age");
            return (Criteria) this;
        }

        public Criteria andHosR_ageNotEqualTo(Integer value) {
            addCriterion("hosR_age <>", value, "hosR_age");
            return (Criteria) this;
        }

        public Criteria andHosR_ageGreaterThan(Integer value) {
            addCriterion("hosR_age >", value, "hosR_age");
            return (Criteria) this;
        }

        public Criteria andHosR_ageGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosR_age >=", value, "hosR_age");
            return (Criteria) this;
        }

        public Criteria andHosR_ageLessThan(Integer value) {
            addCriterion("hosR_age <", value, "hosR_age");
            return (Criteria) this;
        }

        public Criteria andHosR_ageLessThanOrEqualTo(Integer value) {
            addCriterion("hosR_age <=", value, "hosR_age");
            return (Criteria) this;
        }

        public Criteria andHosR_ageIn(List<Integer> values) {
            addCriterion("hosR_age in", values, "hosR_age");
            return (Criteria) this;
        }

        public Criteria andHosR_ageNotIn(List<Integer> values) {
            addCriterion("hosR_age not in", values, "hosR_age");
            return (Criteria) this;
        }

        public Criteria andHosR_ageBetween(Integer value1, Integer value2) {
            addCriterion("hosR_age between", value1, value2, "hosR_age");
            return (Criteria) this;
        }

        public Criteria andHosR_ageNotBetween(Integer value1, Integer value2) {
            addCriterion("hosR_age not between", value1, value2, "hosR_age");
            return (Criteria) this;
        }

        public Criteria andHosR_workIsNull() {
            addCriterion("hosR_work is null");
            return (Criteria) this;
        }

        public Criteria andHosR_workIsNotNull() {
            addCriterion("hosR_work is not null");
            return (Criteria) this;
        }

        public Criteria andHosR_workEqualTo(String value) {
            addCriterion("hosR_work =", value, "hosR_work");
            return (Criteria) this;
        }

        public Criteria andHosR_workNotEqualTo(String value) {
            addCriterion("hosR_work <>", value, "hosR_work");
            return (Criteria) this;
        }

        public Criteria andHosR_workGreaterThan(String value) {
            addCriterion("hosR_work >", value, "hosR_work");
            return (Criteria) this;
        }

        public Criteria andHosR_workGreaterThanOrEqualTo(String value) {
            addCriterion("hosR_work >=", value, "hosR_work");
            return (Criteria) this;
        }

        public Criteria andHosR_workLessThan(String value) {
            addCriterion("hosR_work <", value, "hosR_work");
            return (Criteria) this;
        }

        public Criteria andHosR_workLessThanOrEqualTo(String value) {
            addCriterion("hosR_work <=", value, "hosR_work");
            return (Criteria) this;
        }

        public Criteria andHosR_workLike(String value) {
            addCriterion("hosR_work like", value, "hosR_work");
            return (Criteria) this;
        }

        public Criteria andHosR_workNotLike(String value) {
            addCriterion("hosR_work not like", value, "hosR_work");
            return (Criteria) this;
        }

        public Criteria andHosR_workIn(List<String> values) {
            addCriterion("hosR_work in", values, "hosR_work");
            return (Criteria) this;
        }

        public Criteria andHosR_workNotIn(List<String> values) {
            addCriterion("hosR_work not in", values, "hosR_work");
            return (Criteria) this;
        }

        public Criteria andHosR_workBetween(String value1, String value2) {
            addCriterion("hosR_work between", value1, value2, "hosR_work");
            return (Criteria) this;
        }

        public Criteria andHosR_workNotBetween(String value1, String value2) {
            addCriterion("hosR_work not between", value1, value2, "hosR_work");
            return (Criteria) this;
        }

        public Criteria andHosR_lookDoctorIsNull() {
            addCriterion("hosR_lookDoctor is null");
            return (Criteria) this;
        }

        public Criteria andHosR_lookDoctorIsNotNull() {
            addCriterion("hosR_lookDoctor is not null");
            return (Criteria) this;
        }

        public Criteria andHosR_lookDoctorEqualTo(String value) {
            addCriterion("hosR_lookDoctor =", value, "hosR_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosR_lookDoctorNotEqualTo(String value) {
            addCriterion("hosR_lookDoctor <>", value, "hosR_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosR_lookDoctorGreaterThan(String value) {
            addCriterion("hosR_lookDoctor >", value, "hosR_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosR_lookDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("hosR_lookDoctor >=", value, "hosR_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosR_lookDoctorLessThan(String value) {
            addCriterion("hosR_lookDoctor <", value, "hosR_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosR_lookDoctorLessThanOrEqualTo(String value) {
            addCriterion("hosR_lookDoctor <=", value, "hosR_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosR_lookDoctorLike(String value) {
            addCriterion("hosR_lookDoctor like", value, "hosR_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosR_lookDoctorNotLike(String value) {
            addCriterion("hosR_lookDoctor not like", value, "hosR_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosR_lookDoctorIn(List<String> values) {
            addCriterion("hosR_lookDoctor in", values, "hosR_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosR_lookDoctorNotIn(List<String> values) {
            addCriterion("hosR_lookDoctor not in", values, "hosR_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosR_lookDoctorBetween(String value1, String value2) {
            addCriterion("hosR_lookDoctor between", value1, value2, "hosR_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosR_lookDoctorNotBetween(String value1, String value2) {
            addCriterion("hosR_lookDoctor not between", value1, value2, "hosR_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andD_idIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andD_idIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andD_idEqualTo(Integer value) {
            addCriterion("d_id =", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idGreaterThan(Integer value) {
            addCriterion("d_id >", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idLessThan(Integer value) {
            addCriterion("d_id <", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idIn(List<Integer> values) {
            addCriterion("d_id in", values, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "d_id");
            return (Criteria) this;
        }

        public Criteria andHosR_remarkIsNull() {
            addCriterion("hosR_remark is null");
            return (Criteria) this;
        }

        public Criteria andHosR_remarkIsNotNull() {
            addCriterion("hosR_remark is not null");
            return (Criteria) this;
        }

        public Criteria andHosR_remarkEqualTo(String value) {
            addCriterion("hosR_remark =", value, "hosR_remark");
            return (Criteria) this;
        }

        public Criteria andHosR_remarkNotEqualTo(String value) {
            addCriterion("hosR_remark <>", value, "hosR_remark");
            return (Criteria) this;
        }

        public Criteria andHosR_remarkGreaterThan(String value) {
            addCriterion("hosR_remark >", value, "hosR_remark");
            return (Criteria) this;
        }

        public Criteria andHosR_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("hosR_remark >=", value, "hosR_remark");
            return (Criteria) this;
        }

        public Criteria andHosR_remarkLessThan(String value) {
            addCriterion("hosR_remark <", value, "hosR_remark");
            return (Criteria) this;
        }

        public Criteria andHosR_remarkLessThanOrEqualTo(String value) {
            addCriterion("hosR_remark <=", value, "hosR_remark");
            return (Criteria) this;
        }

        public Criteria andHosR_remarkLike(String value) {
            addCriterion("hosR_remark like", value, "hosR_remark");
            return (Criteria) this;
        }

        public Criteria andHosR_remarkNotLike(String value) {
            addCriterion("hosR_remark not like", value, "hosR_remark");
            return (Criteria) this;
        }

        public Criteria andHosR_remarkIn(List<String> values) {
            addCriterion("hosR_remark in", values, "hosR_remark");
            return (Criteria) this;
        }

        public Criteria andHosR_remarkNotIn(List<String> values) {
            addCriterion("hosR_remark not in", values, "hosR_remark");
            return (Criteria) this;
        }

        public Criteria andHosR_remarkBetween(String value1, String value2) {
            addCriterion("hosR_remark between", value1, value2, "hosR_remark");
            return (Criteria) this;
        }

        public Criteria andHosR_remarkNotBetween(String value1, String value2) {
            addCriterion("hosR_remark not between", value1, value2, "hosR_remark");
            return (Criteria) this;
        }

        public Criteria andHosR_stateIsNull() {
            addCriterion("hosR_state is null");
            return (Criteria) this;
        }

        public Criteria andHosR_stateIsNotNull() {
            addCriterion("hosR_state is not null");
            return (Criteria) this;
        }

        public Criteria andHosR_stateEqualTo(Integer value) {
            addCriterion("hosR_state =", value, "hosR_state");
            return (Criteria) this;
        }

        public Criteria andHosR_stateNotEqualTo(Integer value) {
            addCriterion("hosR_state <>", value, "hosR_state");
            return (Criteria) this;
        }

        public Criteria andHosR_stateGreaterThan(Integer value) {
            addCriterion("hosR_state >", value, "hosR_state");
            return (Criteria) this;
        }

        public Criteria andHosR_stateGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosR_state >=", value, "hosR_state");
            return (Criteria) this;
        }

        public Criteria andHosR_stateLessThan(Integer value) {
            addCriterion("hosR_state <", value, "hosR_state");
            return (Criteria) this;
        }

        public Criteria andHosR_stateLessThanOrEqualTo(Integer value) {
            addCriterion("hosR_state <=", value, "hosR_state");
            return (Criteria) this;
        }

        public Criteria andHosR_stateIn(List<Integer> values) {
            addCriterion("hosR_state in", values, "hosR_state");
            return (Criteria) this;
        }

        public Criteria andHosR_stateNotIn(List<Integer> values) {
            addCriterion("hosR_state not in", values, "hosR_state");
            return (Criteria) this;
        }

        public Criteria andHosR_stateBetween(Integer value1, Integer value2) {
            addCriterion("hosR_state between", value1, value2, "hosR_state");
            return (Criteria) this;
        }

        public Criteria andHosR_stateNotBetween(Integer value1, Integer value2) {
            addCriterion("hosR_state not between", value1, value2, "hosR_state");
            return (Criteria) this;
        }

        public Criteria andHosR_isDelIsNull() {
            addCriterion("hosR_isDel is null");
            return (Criteria) this;
        }

        public Criteria andHosR_isDelIsNotNull() {
            addCriterion("hosR_isDel is not null");
            return (Criteria) this;
        }

        public Criteria andHosR_isDelEqualTo(Integer value) {
            addCriterion("hosR_isDel =", value, "hosR_isDel");
            return (Criteria) this;
        }

        public Criteria andHosR_isDelNotEqualTo(Integer value) {
            addCriterion("hosR_isDel <>", value, "hosR_isDel");
            return (Criteria) this;
        }

        public Criteria andHosR_isDelGreaterThan(Integer value) {
            addCriterion("hosR_isDel >", value, "hosR_isDel");
            return (Criteria) this;
        }

        public Criteria andHosR_isDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosR_isDel >=", value, "hosR_isDel");
            return (Criteria) this;
        }

        public Criteria andHosR_isDelLessThan(Integer value) {
            addCriterion("hosR_isDel <", value, "hosR_isDel");
            return (Criteria) this;
        }

        public Criteria andHosR_isDelLessThanOrEqualTo(Integer value) {
            addCriterion("hosR_isDel <=", value, "hosR_isDel");
            return (Criteria) this;
        }

        public Criteria andHosR_isDelIn(List<Integer> values) {
            addCriterion("hosR_isDel in", values, "hosR_isDel");
            return (Criteria) this;
        }

        public Criteria andHosR_isDelNotIn(List<Integer> values) {
            addCriterion("hosR_isDel not in", values, "hosR_isDel");
            return (Criteria) this;
        }

        public Criteria andHosR_isDelBetween(Integer value1, Integer value2) {
            addCriterion("hosR_isDel between", value1, value2, "hosR_isDel");
            return (Criteria) this;
        }

        public Criteria andHosR_isDelNotBetween(Integer value1, Integer value2) {
            addCriterion("hosR_isDel not between", value1, value2, "hosR_isDel");
            return (Criteria) this;
        }

        public Criteria andHosR_create_timeIsNull() {
            addCriterion("hosR_create_time is null");
            return (Criteria) this;
        }

        public Criteria andHosR_create_timeIsNotNull() {
            addCriterion("hosR_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andHosR_create_timeEqualTo(Date value) {
            addCriterion("hosR_create_time =", value, "hosR_create_time");
            return (Criteria) this;
        }

        public Criteria andHosR_create_timeNotEqualTo(Date value) {
            addCriterion("hosR_create_time <>", value, "hosR_create_time");
            return (Criteria) this;
        }

        public Criteria andHosR_create_timeGreaterThan(Date value) {
            addCriterion("hosR_create_time >", value, "hosR_create_time");
            return (Criteria) this;
        }

        public Criteria andHosR_create_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("hosR_create_time >=", value, "hosR_create_time");
            return (Criteria) this;
        }

        public Criteria andHosR_create_timeLessThan(Date value) {
            addCriterion("hosR_create_time <", value, "hosR_create_time");
            return (Criteria) this;
        }

        public Criteria andHosR_create_timeLessThanOrEqualTo(Date value) {
            addCriterion("hosR_create_time <=", value, "hosR_create_time");
            return (Criteria) this;
        }

        public Criteria andHosR_create_timeIn(List<Date> values) {
            addCriterion("hosR_create_time in", values, "hosR_create_time");
            return (Criteria) this;
        }

        public Criteria andHosR_create_timeNotIn(List<Date> values) {
            addCriterion("hosR_create_time not in", values, "hosR_create_time");
            return (Criteria) this;
        }

        public Criteria andHosR_create_timeBetween(Date value1, Date value2) {
            addCriterion("hosR_create_time between", value1, value2, "hosR_create_time");
            return (Criteria) this;
        }

        public Criteria andHosR_create_timeNotBetween(Date value1, Date value2) {
            addCriterion("hosR_create_time not between", value1, value2, "hosR_create_time");
            return (Criteria) this;
        }

        public Criteria andHosR_update_timeIsNull() {
            addCriterion("hosR_update_time is null");
            return (Criteria) this;
        }

        public Criteria andHosR_update_timeIsNotNull() {
            addCriterion("hosR_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andHosR_update_timeEqualTo(Date value) {
            addCriterion("hosR_update_time =", value, "hosR_update_time");
            return (Criteria) this;
        }

        public Criteria andHosR_update_timeNotEqualTo(Date value) {
            addCriterion("hosR_update_time <>", value, "hosR_update_time");
            return (Criteria) this;
        }

        public Criteria andHosR_update_timeGreaterThan(Date value) {
            addCriterion("hosR_update_time >", value, "hosR_update_time");
            return (Criteria) this;
        }

        public Criteria andHosR_update_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("hosR_update_time >=", value, "hosR_update_time");
            return (Criteria) this;
        }

        public Criteria andHosR_update_timeLessThan(Date value) {
            addCriterion("hosR_update_time <", value, "hosR_update_time");
            return (Criteria) this;
        }

        public Criteria andHosR_update_timeLessThanOrEqualTo(Date value) {
            addCriterion("hosR_update_time <=", value, "hosR_update_time");
            return (Criteria) this;
        }

        public Criteria andHosR_update_timeIn(List<Date> values) {
            addCriterion("hosR_update_time in", values, "hosR_update_time");
            return (Criteria) this;
        }

        public Criteria andHosR_update_timeNotIn(List<Date> values) {
            addCriterion("hosR_update_time not in", values, "hosR_update_time");
            return (Criteria) this;
        }

        public Criteria andHosR_update_timeBetween(Date value1, Date value2) {
            addCriterion("hosR_update_time between", value1, value2, "hosR_update_time");
            return (Criteria) this;
        }

        public Criteria andHosR_update_timeNotBetween(Date value1, Date value2) {
            addCriterion("hosR_update_time not between", value1, value2, "hosR_update_time");
            return (Criteria) this;
        }

        public Criteria andU_idIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andU_idIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andU_idEqualTo(Integer value) {
            addCriterion("u_id =", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idGreaterThan(Integer value) {
            addCriterion("u_id >", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idLessThan(Integer value) {
            addCriterion("u_id <", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idIn(List<Integer> values) {
            addCriterion("u_id in", values, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "u_id");
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