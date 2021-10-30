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

        public Criteria andDrbehIdIsNull() {
            addCriterion("drbeh_id is null");
            return (Criteria) this;
        }

        public Criteria andDrbehIdIsNotNull() {
            addCriterion("drbeh_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrbehIdEqualTo(Integer value) {
            addCriterion("drbeh_id =", value, "drbehId");
            return (Criteria) this;
        }

        public Criteria andDrbehIdNotEqualTo(Integer value) {
            addCriterion("drbeh_id <>", value, "drbehId");
            return (Criteria) this;
        }

        public Criteria andDrbehIdGreaterThan(Integer value) {
            addCriterion("drbeh_id >", value, "drbehId");
            return (Criteria) this;
        }

        public Criteria andDrbehIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("drbeh_id >=", value, "drbehId");
            return (Criteria) this;
        }

        public Criteria andDrbehIdLessThan(Integer value) {
            addCriterion("drbeh_id <", value, "drbehId");
            return (Criteria) this;
        }

        public Criteria andDrbehIdLessThanOrEqualTo(Integer value) {
            addCriterion("drbeh_id <=", value, "drbehId");
            return (Criteria) this;
        }

        public Criteria andDrbehIdIn(List<Integer> values) {
            addCriterion("drbeh_id in", values, "drbehId");
            return (Criteria) this;
        }

        public Criteria andDrbehIdNotIn(List<Integer> values) {
            addCriterion("drbeh_id not in", values, "drbehId");
            return (Criteria) this;
        }

        public Criteria andDrbehIdBetween(Integer value1, Integer value2) {
            addCriterion("drbeh_id between", value1, value2, "drbehId");
            return (Criteria) this;
        }

        public Criteria andDrbehIdNotBetween(Integer value1, Integer value2) {
            addCriterion("drbeh_id not between", value1, value2, "drbehId");
            return (Criteria) this;
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

        public Criteria andBehIdIsNull() {
            addCriterion("beh_id is null");
            return (Criteria) this;
        }

        public Criteria andBehIdIsNotNull() {
            addCriterion("beh_id is not null");
            return (Criteria) this;
        }

        public Criteria andBehIdEqualTo(Integer value) {
            addCriterion("beh_id =", value, "behId");
            return (Criteria) this;
        }

        public Criteria andBehIdNotEqualTo(Integer value) {
            addCriterion("beh_id <>", value, "behId");
            return (Criteria) this;
        }

        public Criteria andBehIdGreaterThan(Integer value) {
            addCriterion("beh_id >", value, "behId");
            return (Criteria) this;
        }

        public Criteria andBehIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("beh_id >=", value, "behId");
            return (Criteria) this;
        }

        public Criteria andBehIdLessThan(Integer value) {
            addCriterion("beh_id <", value, "behId");
            return (Criteria) this;
        }

        public Criteria andBehIdLessThanOrEqualTo(Integer value) {
            addCriterion("beh_id <=", value, "behId");
            return (Criteria) this;
        }

        public Criteria andBehIdIn(List<Integer> values) {
            addCriterion("beh_id in", values, "behId");
            return (Criteria) this;
        }

        public Criteria andBehIdNotIn(List<Integer> values) {
            addCriterion("beh_id not in", values, "behId");
            return (Criteria) this;
        }

        public Criteria andBehIdBetween(Integer value1, Integer value2) {
            addCriterion("beh_id between", value1, value2, "behId");
            return (Criteria) this;
        }

        public Criteria andBehIdNotBetween(Integer value1, Integer value2) {
            addCriterion("beh_id not between", value1, value2, "behId");
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

        public Criteria andDrGiveNumberIsNull() {
            addCriterion("dr_give_number is null");
            return (Criteria) this;
        }

        public Criteria andDrGiveNumberIsNotNull() {
            addCriterion("dr_give_number is not null");
            return (Criteria) this;
        }

        public Criteria andDrGiveNumberEqualTo(Integer value) {
            addCriterion("dr_give_number =", value, "drGiveNumber");
            return (Criteria) this;
        }

        public Criteria andDrGiveNumberNotEqualTo(Integer value) {
            addCriterion("dr_give_number <>", value, "drGiveNumber");
            return (Criteria) this;
        }

        public Criteria andDrGiveNumberGreaterThan(Integer value) {
            addCriterion("dr_give_number >", value, "drGiveNumber");
            return (Criteria) this;
        }

        public Criteria andDrGiveNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr_give_number >=", value, "drGiveNumber");
            return (Criteria) this;
        }

        public Criteria andDrGiveNumberLessThan(Integer value) {
            addCriterion("dr_give_number <", value, "drGiveNumber");
            return (Criteria) this;
        }

        public Criteria andDrGiveNumberLessThanOrEqualTo(Integer value) {
            addCriterion("dr_give_number <=", value, "drGiveNumber");
            return (Criteria) this;
        }

        public Criteria andDrGiveNumberIn(List<Integer> values) {
            addCriterion("dr_give_number in", values, "drGiveNumber");
            return (Criteria) this;
        }

        public Criteria andDrGiveNumberNotIn(List<Integer> values) {
            addCriterion("dr_give_number not in", values, "drGiveNumber");
            return (Criteria) this;
        }

        public Criteria andDrGiveNumberBetween(Integer value1, Integer value2) {
            addCriterion("dr_give_number between", value1, value2, "drGiveNumber");
            return (Criteria) this;
        }

        public Criteria andDrGiveNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("dr_give_number not between", value1, value2, "drGiveNumber");
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