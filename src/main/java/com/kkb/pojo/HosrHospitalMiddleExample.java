package com.kkb.pojo;

import java.util.ArrayList;
import java.util.List;

public class HosrHospitalMiddleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HosrHospitalMiddleExample() {
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

        public Criteria andHosrHospitalIdIsNull() {
            addCriterion("hosr_hospital_id is null");
            return (Criteria) this;
        }

        public Criteria andHosrHospitalIdIsNotNull() {
            addCriterion("hosr_hospital_id is not null");
            return (Criteria) this;
        }

        public Criteria andHosrHospitalIdEqualTo(Integer value) {
            addCriterion("hosr_hospital_id =", value, "hosrHospitalId");
            return (Criteria) this;
        }

        public Criteria andHosrHospitalIdNotEqualTo(Integer value) {
            addCriterion("hosr_hospital_id <>", value, "hosrHospitalId");
            return (Criteria) this;
        }

        public Criteria andHosrHospitalIdGreaterThan(Integer value) {
            addCriterion("hosr_hospital_id >", value, "hosrHospitalId");
            return (Criteria) this;
        }

        public Criteria andHosrHospitalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosr_hospital_id >=", value, "hosrHospitalId");
            return (Criteria) this;
        }

        public Criteria andHosrHospitalIdLessThan(Integer value) {
            addCriterion("hosr_hospital_id <", value, "hosrHospitalId");
            return (Criteria) this;
        }

        public Criteria andHosrHospitalIdLessThanOrEqualTo(Integer value) {
            addCriterion("hosr_hospital_id <=", value, "hosrHospitalId");
            return (Criteria) this;
        }

        public Criteria andHosrHospitalIdIn(List<Integer> values) {
            addCriterion("hosr_hospital_id in", values, "hosrHospitalId");
            return (Criteria) this;
        }

        public Criteria andHosrHospitalIdNotIn(List<Integer> values) {
            addCriterion("hosr_hospital_id not in", values, "hosrHospitalId");
            return (Criteria) this;
        }

        public Criteria andHosrHospitalIdBetween(Integer value1, Integer value2) {
            addCriterion("hosr_hospital_id between", value1, value2, "hosrHospitalId");
            return (Criteria) this;
        }

        public Criteria andHosrHospitalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hosr_hospital_id not between", value1, value2, "hosrHospitalId");
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