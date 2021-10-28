package com.kkb.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BehospitalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BehospitalExample() {
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

        public Criteria andBeH_idIsNull() {
            addCriterion("beH_id is null");
            return (Criteria) this;
        }

        public Criteria andBeH_idIsNotNull() {
            addCriterion("beH_id is not null");
            return (Criteria) this;
        }

        public Criteria andBeH_idEqualTo(Integer value) {
            addCriterion("beH_id =", value, "beH_id");
            return (Criteria) this;
        }

        public Criteria andBeH_idNotEqualTo(Integer value) {
            addCriterion("beH_id <>", value, "beH_id");
            return (Criteria) this;
        }

        public Criteria andBeH_idGreaterThan(Integer value) {
            addCriterion("beH_id >", value, "beH_id");
            return (Criteria) this;
        }

        public Criteria andBeH_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("beH_id >=", value, "beH_id");
            return (Criteria) this;
        }

        public Criteria andBeH_idLessThan(Integer value) {
            addCriterion("beH_id <", value, "beH_id");
            return (Criteria) this;
        }

        public Criteria andBeH_idLessThanOrEqualTo(Integer value) {
            addCriterion("beH_id <=", value, "beH_id");
            return (Criteria) this;
        }

        public Criteria andBeH_idIn(List<Integer> values) {
            addCriterion("beH_id in", values, "beH_id");
            return (Criteria) this;
        }

        public Criteria andBeH_idNotIn(List<Integer> values) {
            addCriterion("beH_id not in", values, "beH_id");
            return (Criteria) this;
        }

        public Criteria andBeH_idBetween(Integer value1, Integer value2) {
            addCriterion("beH_id between", value1, value2, "beH_id");
            return (Criteria) this;
        }

        public Criteria andBeH_idNotBetween(Integer value1, Integer value2) {
            addCriterion("beH_id not between", value1, value2, "beH_id");
            return (Criteria) this;
        }

        public Criteria andBeH_nursePeoPleIsNull() {
            addCriterion("beH_nursePeoPle is null");
            return (Criteria) this;
        }

        public Criteria andBeH_nursePeoPleIsNotNull() {
            addCriterion("beH_nursePeoPle is not null");
            return (Criteria) this;
        }

        public Criteria andBeH_nursePeoPleEqualTo(String value) {
            addCriterion("beH_nursePeoPle =", value, "beH_nursePeoPle");
            return (Criteria) this;
        }

        public Criteria andBeH_nursePeoPleNotEqualTo(String value) {
            addCriterion("beH_nursePeoPle <>", value, "beH_nursePeoPle");
            return (Criteria) this;
        }

        public Criteria andBeH_nursePeoPleGreaterThan(String value) {
            addCriterion("beH_nursePeoPle >", value, "beH_nursePeoPle");
            return (Criteria) this;
        }

        public Criteria andBeH_nursePeoPleGreaterThanOrEqualTo(String value) {
            addCriterion("beH_nursePeoPle >=", value, "beH_nursePeoPle");
            return (Criteria) this;
        }

        public Criteria andBeH_nursePeoPleLessThan(String value) {
            addCriterion("beH_nursePeoPle <", value, "beH_nursePeoPle");
            return (Criteria) this;
        }

        public Criteria andBeH_nursePeoPleLessThanOrEqualTo(String value) {
            addCriterion("beH_nursePeoPle <=", value, "beH_nursePeoPle");
            return (Criteria) this;
        }

        public Criteria andBeH_nursePeoPleLike(String value) {
            addCriterion("beH_nursePeoPle like", value, "beH_nursePeoPle");
            return (Criteria) this;
        }

        public Criteria andBeH_nursePeoPleNotLike(String value) {
            addCriterion("beH_nursePeoPle not like", value, "beH_nursePeoPle");
            return (Criteria) this;
        }

        public Criteria andBeH_nursePeoPleIn(List<String> values) {
            addCriterion("beH_nursePeoPle in", values, "beH_nursePeoPle");
            return (Criteria) this;
        }

        public Criteria andBeH_nursePeoPleNotIn(List<String> values) {
            addCriterion("beH_nursePeoPle not in", values, "beH_nursePeoPle");
            return (Criteria) this;
        }

        public Criteria andBeH_nursePeoPleBetween(String value1, String value2) {
            addCriterion("beH_nursePeoPle between", value1, value2, "beH_nursePeoPle");
            return (Criteria) this;
        }

        public Criteria andBeH_nursePeoPleNotBetween(String value1, String value2) {
            addCriterion("beH_nursePeoPle not between", value1, value2, "beH_nursePeoPle");
            return (Criteria) this;
        }

        public Criteria andBeH_patBedIsNull() {
            addCriterion("beH_patBed is null");
            return (Criteria) this;
        }

        public Criteria andBeH_patBedIsNotNull() {
            addCriterion("beH_patBed is not null");
            return (Criteria) this;
        }

        public Criteria andBeH_patBedEqualTo(String value) {
            addCriterion("beH_patBed =", value, "beH_patBed");
            return (Criteria) this;
        }

        public Criteria andBeH_patBedNotEqualTo(String value) {
            addCriterion("beH_patBed <>", value, "beH_patBed");
            return (Criteria) this;
        }

        public Criteria andBeH_patBedGreaterThan(String value) {
            addCriterion("beH_patBed >", value, "beH_patBed");
            return (Criteria) this;
        }

        public Criteria andBeH_patBedGreaterThanOrEqualTo(String value) {
            addCriterion("beH_patBed >=", value, "beH_patBed");
            return (Criteria) this;
        }

        public Criteria andBeH_patBedLessThan(String value) {
            addCriterion("beH_patBed <", value, "beH_patBed");
            return (Criteria) this;
        }

        public Criteria andBeH_patBedLessThanOrEqualTo(String value) {
            addCriterion("beH_patBed <=", value, "beH_patBed");
            return (Criteria) this;
        }

        public Criteria andBeH_patBedLike(String value) {
            addCriterion("beH_patBed like", value, "beH_patBed");
            return (Criteria) this;
        }

        public Criteria andBeH_patBedNotLike(String value) {
            addCriterion("beH_patBed not like", value, "beH_patBed");
            return (Criteria) this;
        }

        public Criteria andBeH_patBedIn(List<String> values) {
            addCriterion("beH_patBed in", values, "beH_patBed");
            return (Criteria) this;
        }

        public Criteria andBeH_patBedNotIn(List<String> values) {
            addCriterion("beH_patBed not in", values, "beH_patBed");
            return (Criteria) this;
        }

        public Criteria andBeH_patBedBetween(String value1, String value2) {
            addCriterion("beH_patBed between", value1, value2, "beH_patBed");
            return (Criteria) this;
        }

        public Criteria andBeH_patBedNotBetween(String value1, String value2) {
            addCriterion("beH_patBed not between", value1, value2, "beH_patBed");
            return (Criteria) this;
        }

        public Criteria andBeH_antecedentIsNull() {
            addCriterion("beH_antecedent is null");
            return (Criteria) this;
        }

        public Criteria andBeH_antecedentIsNotNull() {
            addCriterion("beH_antecedent is not null");
            return (Criteria) this;
        }

        public Criteria andBeH_antecedentEqualTo(BigDecimal value) {
            addCriterion("beH_antecedent =", value, "beH_antecedent");
            return (Criteria) this;
        }

        public Criteria andBeH_antecedentNotEqualTo(BigDecimal value) {
            addCriterion("beH_antecedent <>", value, "beH_antecedent");
            return (Criteria) this;
        }

        public Criteria andBeH_antecedentGreaterThan(BigDecimal value) {
            addCriterion("beH_antecedent >", value, "beH_antecedent");
            return (Criteria) this;
        }

        public Criteria andBeH_antecedentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("beH_antecedent >=", value, "beH_antecedent");
            return (Criteria) this;
        }

        public Criteria andBeH_antecedentLessThan(BigDecimal value) {
            addCriterion("beH_antecedent <", value, "beH_antecedent");
            return (Criteria) this;
        }

        public Criteria andBeH_antecedentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("beH_antecedent <=", value, "beH_antecedent");
            return (Criteria) this;
        }

        public Criteria andBeH_antecedentIn(List<BigDecimal> values) {
            addCriterion("beH_antecedent in", values, "beH_antecedent");
            return (Criteria) this;
        }

        public Criteria andBeH_antecedentNotIn(List<BigDecimal> values) {
            addCriterion("beH_antecedent not in", values, "beH_antecedent");
            return (Criteria) this;
        }

        public Criteria andBeH_antecedentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("beH_antecedent between", value1, value2, "beH_antecedent");
            return (Criteria) this;
        }

        public Criteria andBeH_antecedentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("beH_antecedent not between", value1, value2, "beH_antecedent");
            return (Criteria) this;
        }

        public Criteria andBeH_illnessIsNull() {
            addCriterion("beH_illness is null");
            return (Criteria) this;
        }

        public Criteria andBeH_illnessIsNotNull() {
            addCriterion("beH_illness is not null");
            return (Criteria) this;
        }

        public Criteria andBeH_illnessEqualTo(String value) {
            addCriterion("beH_illness =", value, "beH_illness");
            return (Criteria) this;
        }

        public Criteria andBeH_illnessNotEqualTo(String value) {
            addCriterion("beH_illness <>", value, "beH_illness");
            return (Criteria) this;
        }

        public Criteria andBeH_illnessGreaterThan(String value) {
            addCriterion("beH_illness >", value, "beH_illness");
            return (Criteria) this;
        }

        public Criteria andBeH_illnessGreaterThanOrEqualTo(String value) {
            addCriterion("beH_illness >=", value, "beH_illness");
            return (Criteria) this;
        }

        public Criteria andBeH_illnessLessThan(String value) {
            addCriterion("beH_illness <", value, "beH_illness");
            return (Criteria) this;
        }

        public Criteria andBeH_illnessLessThanOrEqualTo(String value) {
            addCriterion("beH_illness <=", value, "beH_illness");
            return (Criteria) this;
        }

        public Criteria andBeH_illnessLike(String value) {
            addCriterion("beH_illness like", value, "beH_illness");
            return (Criteria) this;
        }

        public Criteria andBeH_illnessNotLike(String value) {
            addCriterion("beH_illness not like", value, "beH_illness");
            return (Criteria) this;
        }

        public Criteria andBeH_illnessIn(List<String> values) {
            addCriterion("beH_illness in", values, "beH_illness");
            return (Criteria) this;
        }

        public Criteria andBeH_illnessNotIn(List<String> values) {
            addCriterion("beH_illness not in", values, "beH_illness");
            return (Criteria) this;
        }

        public Criteria andBeH_illnessBetween(String value1, String value2) {
            addCriterion("beH_illness between", value1, value2, "beH_illness");
            return (Criteria) this;
        }

        public Criteria andBeH_illnessNotBetween(String value1, String value2) {
            addCriterion("beH_illness not between", value1, value2, "beH_illness");
            return (Criteria) this;
        }

        public Criteria andBeH_closePriceIsNull() {
            addCriterion("beH_closePrice is null");
            return (Criteria) this;
        }

        public Criteria andBeH_closePriceIsNotNull() {
            addCriterion("beH_closePrice is not null");
            return (Criteria) this;
        }

        public Criteria andBeH_closePriceEqualTo(Integer value) {
            addCriterion("beH_closePrice =", value, "beH_closePrice");
            return (Criteria) this;
        }

        public Criteria andBeH_closePriceNotEqualTo(Integer value) {
            addCriterion("beH_closePrice <>", value, "beH_closePrice");
            return (Criteria) this;
        }

        public Criteria andBeH_closePriceGreaterThan(Integer value) {
            addCriterion("beH_closePrice >", value, "beH_closePrice");
            return (Criteria) this;
        }

        public Criteria andBeH_closePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("beH_closePrice >=", value, "beH_closePrice");
            return (Criteria) this;
        }

        public Criteria andBeH_closePriceLessThan(Integer value) {
            addCriterion("beH_closePrice <", value, "beH_closePrice");
            return (Criteria) this;
        }

        public Criteria andBeH_closePriceLessThanOrEqualTo(Integer value) {
            addCriterion("beH_closePrice <=", value, "beH_closePrice");
            return (Criteria) this;
        }

        public Criteria andBeH_closePriceIn(List<Integer> values) {
            addCriterion("beH_closePrice in", values, "beH_closePrice");
            return (Criteria) this;
        }

        public Criteria andBeH_closePriceNotIn(List<Integer> values) {
            addCriterion("beH_closePrice not in", values, "beH_closePrice");
            return (Criteria) this;
        }

        public Criteria andBeH_closePriceBetween(Integer value1, Integer value2) {
            addCriterion("beH_closePrice between", value1, value2, "beH_closePrice");
            return (Criteria) this;
        }

        public Criteria andBeH_closePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("beH_closePrice not between", value1, value2, "beH_closePrice");
            return (Criteria) this;
        }

        public Criteria andBeH_stateIsNull() {
            addCriterion("beH_state is null");
            return (Criteria) this;
        }

        public Criteria andBeH_stateIsNotNull() {
            addCriterion("beH_state is not null");
            return (Criteria) this;
        }

        public Criteria andBeH_stateEqualTo(Integer value) {
            addCriterion("beH_state =", value, "beH_state");
            return (Criteria) this;
        }

        public Criteria andBeH_stateNotEqualTo(Integer value) {
            addCriterion("beH_state <>", value, "beH_state");
            return (Criteria) this;
        }

        public Criteria andBeH_stateGreaterThan(Integer value) {
            addCriterion("beH_state >", value, "beH_state");
            return (Criteria) this;
        }

        public Criteria andBeH_stateGreaterThanOrEqualTo(Integer value) {
            addCriterion("beH_state >=", value, "beH_state");
            return (Criteria) this;
        }

        public Criteria andBeH_stateLessThan(Integer value) {
            addCriterion("beH_state <", value, "beH_state");
            return (Criteria) this;
        }

        public Criteria andBeH_stateLessThanOrEqualTo(Integer value) {
            addCriterion("beH_state <=", value, "beH_state");
            return (Criteria) this;
        }

        public Criteria andBeH_stateIn(List<Integer> values) {
            addCriterion("beH_state in", values, "beH_state");
            return (Criteria) this;
        }

        public Criteria andBeH_stateNotIn(List<Integer> values) {
            addCriterion("beH_state not in", values, "beH_state");
            return (Criteria) this;
        }

        public Criteria andBeH_stateBetween(Integer value1, Integer value2) {
            addCriterion("beH_state between", value1, value2, "beH_state");
            return (Criteria) this;
        }

        public Criteria andBeH_stateNotBetween(Integer value1, Integer value2) {
            addCriterion("beH_state not between", value1, value2, "beH_state");
            return (Criteria) this;
        }

        public Criteria andBeH_isDelIsNull() {
            addCriterion("beH_isDel is null");
            return (Criteria) this;
        }

        public Criteria andBeH_isDelIsNotNull() {
            addCriterion("beH_isDel is not null");
            return (Criteria) this;
        }

        public Criteria andBeH_isDelEqualTo(Integer value) {
            addCriterion("beH_isDel =", value, "beH_isDel");
            return (Criteria) this;
        }

        public Criteria andBeH_isDelNotEqualTo(Integer value) {
            addCriterion("beH_isDel <>", value, "beH_isDel");
            return (Criteria) this;
        }

        public Criteria andBeH_isDelGreaterThan(Integer value) {
            addCriterion("beH_isDel >", value, "beH_isDel");
            return (Criteria) this;
        }

        public Criteria andBeH_isDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("beH_isDel >=", value, "beH_isDel");
            return (Criteria) this;
        }

        public Criteria andBeH_isDelLessThan(Integer value) {
            addCriterion("beH_isDel <", value, "beH_isDel");
            return (Criteria) this;
        }

        public Criteria andBeH_isDelLessThanOrEqualTo(Integer value) {
            addCriterion("beH_isDel <=", value, "beH_isDel");
            return (Criteria) this;
        }

        public Criteria andBeH_isDelIn(List<Integer> values) {
            addCriterion("beH_isDel in", values, "beH_isDel");
            return (Criteria) this;
        }

        public Criteria andBeH_isDelNotIn(List<Integer> values) {
            addCriterion("beH_isDel not in", values, "beH_isDel");
            return (Criteria) this;
        }

        public Criteria andBeH_isDelBetween(Integer value1, Integer value2) {
            addCriterion("beH_isDel between", value1, value2, "beH_isDel");
            return (Criteria) this;
        }

        public Criteria andBeH_isDelNotBetween(Integer value1, Integer value2) {
            addCriterion("beH_isDel not between", value1, value2, "beH_isDel");
            return (Criteria) this;
        }

        public Criteria andBeH_create_timeIsNull() {
            addCriterion("beH_create_time is null");
            return (Criteria) this;
        }

        public Criteria andBeH_create_timeIsNotNull() {
            addCriterion("beH_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeH_create_timeEqualTo(Date value) {
            addCriterion("beH_create_time =", value, "beH_create_time");
            return (Criteria) this;
        }

        public Criteria andBeH_create_timeNotEqualTo(Date value) {
            addCriterion("beH_create_time <>", value, "beH_create_time");
            return (Criteria) this;
        }

        public Criteria andBeH_create_timeGreaterThan(Date value) {
            addCriterion("beH_create_time >", value, "beH_create_time");
            return (Criteria) this;
        }

        public Criteria andBeH_create_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("beH_create_time >=", value, "beH_create_time");
            return (Criteria) this;
        }

        public Criteria andBeH_create_timeLessThan(Date value) {
            addCriterion("beH_create_time <", value, "beH_create_time");
            return (Criteria) this;
        }

        public Criteria andBeH_create_timeLessThanOrEqualTo(Date value) {
            addCriterion("beH_create_time <=", value, "beH_create_time");
            return (Criteria) this;
        }

        public Criteria andBeH_create_timeIn(List<Date> values) {
            addCriterion("beH_create_time in", values, "beH_create_time");
            return (Criteria) this;
        }

        public Criteria andBeH_create_timeNotIn(List<Date> values) {
            addCriterion("beH_create_time not in", values, "beH_create_time");
            return (Criteria) this;
        }

        public Criteria andBeH_create_timeBetween(Date value1, Date value2) {
            addCriterion("beH_create_time between", value1, value2, "beH_create_time");
            return (Criteria) this;
        }

        public Criteria andBeH_create_timeNotBetween(Date value1, Date value2) {
            addCriterion("beH_create_time not between", value1, value2, "beH_create_time");
            return (Criteria) this;
        }

        public Criteria andBeH_update_timeIsNull() {
            addCriterion("beH_update_time is null");
            return (Criteria) this;
        }

        public Criteria andBeH_update_timeIsNotNull() {
            addCriterion("beH_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeH_update_timeEqualTo(Date value) {
            addCriterion("beH_update_time =", value, "beH_update_time");
            return (Criteria) this;
        }

        public Criteria andBeH_update_timeNotEqualTo(Date value) {
            addCriterion("beH_update_time <>", value, "beH_update_time");
            return (Criteria) this;
        }

        public Criteria andBeH_update_timeGreaterThan(Date value) {
            addCriterion("beH_update_time >", value, "beH_update_time");
            return (Criteria) this;
        }

        public Criteria andBeH_update_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("beH_update_time >=", value, "beH_update_time");
            return (Criteria) this;
        }

        public Criteria andBeH_update_timeLessThan(Date value) {
            addCriterion("beH_update_time <", value, "beH_update_time");
            return (Criteria) this;
        }

        public Criteria andBeH_update_timeLessThanOrEqualTo(Date value) {
            addCriterion("beH_update_time <=", value, "beH_update_time");
            return (Criteria) this;
        }

        public Criteria andBeH_update_timeIn(List<Date> values) {
            addCriterion("beH_update_time in", values, "beH_update_time");
            return (Criteria) this;
        }

        public Criteria andBeH_update_timeNotIn(List<Date> values) {
            addCriterion("beH_update_time not in", values, "beH_update_time");
            return (Criteria) this;
        }

        public Criteria andBeH_update_timeBetween(Date value1, Date value2) {
            addCriterion("beH_update_time between", value1, value2, "beH_update_time");
            return (Criteria) this;
        }

        public Criteria andBeH_update_timeNotBetween(Date value1, Date value2) {
            addCriterion("beH_update_time not between", value1, value2, "beH_update_time");
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