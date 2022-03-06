package com.kkb.pojo;

import java.util.ArrayList;
import java.util.List;

public class DrugPeopleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugPeopleExample() {
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

        public Criteria andDrugPeoIdIsNull() {
            addCriterion("drug_peo_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugPeoIdIsNotNull() {
            addCriterion("drug_peo_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugPeoIdEqualTo(Integer value) {
            addCriterion("drug_peo_id =", value, "drugPeoId");
            return (Criteria) this;
        }

        public Criteria andDrugPeoIdNotEqualTo(Integer value) {
            addCriterion("drug_peo_id <>", value, "drugPeoId");
            return (Criteria) this;
        }

        public Criteria andDrugPeoIdGreaterThan(Integer value) {
            addCriterion("drug_peo_id >", value, "drugPeoId");
            return (Criteria) this;
        }

        public Criteria andDrugPeoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("drug_peo_id >=", value, "drugPeoId");
            return (Criteria) this;
        }

        public Criteria andDrugPeoIdLessThan(Integer value) {
            addCriterion("drug_peo_id <", value, "drugPeoId");
            return (Criteria) this;
        }

        public Criteria andDrugPeoIdLessThanOrEqualTo(Integer value) {
            addCriterion("drug_peo_id <=", value, "drugPeoId");
            return (Criteria) this;
        }

        public Criteria andDrugPeoIdIn(List<Integer> values) {
            addCriterion("drug_peo_id in", values, "drugPeoId");
            return (Criteria) this;
        }

        public Criteria andDrugPeoIdNotIn(List<Integer> values) {
            addCriterion("drug_peo_id not in", values, "drugPeoId");
            return (Criteria) this;
        }

        public Criteria andDrugPeoIdBetween(Integer value1, Integer value2) {
            addCriterion("drug_peo_id between", value1, value2, "drugPeoId");
            return (Criteria) this;
        }

        public Criteria andDrugPeoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("drug_peo_id not between", value1, value2, "drugPeoId");
            return (Criteria) this;
        }

        public Criteria andDrugIdIsNull() {
            addCriterion("drug_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugIdIsNotNull() {
            addCriterion("drug_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugIdEqualTo(String value) {
            addCriterion("drug_id =", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdNotEqualTo(String value) {
            addCriterion("drug_id <>", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdGreaterThan(String value) {
            addCriterion("drug_id >", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdGreaterThanOrEqualTo(String value) {
            addCriterion("drug_id >=", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdLessThan(String value) {
            addCriterion("drug_id <", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdLessThanOrEqualTo(String value) {
            addCriterion("drug_id <=", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdLike(String value) {
            addCriterion("drug_id like", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdNotLike(String value) {
            addCriterion("drug_id not like", value, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdIn(List<String> values) {
            addCriterion("drug_id in", values, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdNotIn(List<String> values) {
            addCriterion("drug_id not in", values, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdBetween(String value1, String value2) {
            addCriterion("drug_id between", value1, value2, "drugId");
            return (Criteria) this;
        }

        public Criteria andDrugIdNotBetween(String value1, String value2) {
            addCriterion("drug_id not between", value1, value2, "drugId");
            return (Criteria) this;
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

        public Criteria andDrugNumberIsNull() {
            addCriterion("drug_number is null");
            return (Criteria) this;
        }

        public Criteria andDrugNumberIsNotNull() {
            addCriterion("drug_number is not null");
            return (Criteria) this;
        }

        public Criteria andDrugNumberEqualTo(Integer value) {
            addCriterion("drug_number =", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberNotEqualTo(Integer value) {
            addCriterion("drug_number <>", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberGreaterThan(Integer value) {
            addCriterion("drug_number >", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("drug_number >=", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberLessThan(Integer value) {
            addCriterion("drug_number <", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberLessThanOrEqualTo(Integer value) {
            addCriterion("drug_number <=", value, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberIn(List<Integer> values) {
            addCriterion("drug_number in", values, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberNotIn(List<Integer> values) {
            addCriterion("drug_number not in", values, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberBetween(Integer value1, Integer value2) {
            addCriterion("drug_number between", value1, value2, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("drug_number not between", value1, value2, "drugNumber");
            return (Criteria) this;
        }

        public Criteria andDrugGiveNumberIsNull() {
            addCriterion("drug_give_number is null");
            return (Criteria) this;
        }

        public Criteria andDrugGiveNumberIsNotNull() {
            addCriterion("drug_give_number is not null");
            return (Criteria) this;
        }

        public Criteria andDrugGiveNumberEqualTo(Integer value) {
            addCriterion("drug_give_number =", value, "drugGiveNumber");
            return (Criteria) this;
        }

        public Criteria andDrugGiveNumberNotEqualTo(Integer value) {
            addCriterion("drug_give_number <>", value, "drugGiveNumber");
            return (Criteria) this;
        }

        public Criteria andDrugGiveNumberGreaterThan(Integer value) {
            addCriterion("drug_give_number >", value, "drugGiveNumber");
            return (Criteria) this;
        }

        public Criteria andDrugGiveNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("drug_give_number >=", value, "drugGiveNumber");
            return (Criteria) this;
        }

        public Criteria andDrugGiveNumberLessThan(Integer value) {
            addCriterion("drug_give_number <", value, "drugGiveNumber");
            return (Criteria) this;
        }

        public Criteria andDrugGiveNumberLessThanOrEqualTo(Integer value) {
            addCriterion("drug_give_number <=", value, "drugGiveNumber");
            return (Criteria) this;
        }

        public Criteria andDrugGiveNumberIn(List<Integer> values) {
            addCriterion("drug_give_number in", values, "drugGiveNumber");
            return (Criteria) this;
        }

        public Criteria andDrugGiveNumberNotIn(List<Integer> values) {
            addCriterion("drug_give_number not in", values, "drugGiveNumber");
            return (Criteria) this;
        }

        public Criteria andDrugGiveNumberBetween(Integer value1, Integer value2) {
            addCriterion("drug_give_number between", value1, value2, "drugGiveNumber");
            return (Criteria) this;
        }

        public Criteria andDrugGiveNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("drug_give_number not between", value1, value2, "drugGiveNumber");
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