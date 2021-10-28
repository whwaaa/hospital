package com.kkb.pojo;

import java.util.ArrayList;
import java.util.List;

public class DrugpeopleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugpeopleExample() {
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

        public Criteria andDr_p_idIsNull() {
            addCriterion("dr_p_id is null");
            return (Criteria) this;
        }

        public Criteria andDr_p_idIsNotNull() {
            addCriterion("dr_p_id is not null");
            return (Criteria) this;
        }

        public Criteria andDr_p_idEqualTo(Integer value) {
            addCriterion("dr_p_id =", value, "dr_p_id");
            return (Criteria) this;
        }

        public Criteria andDr_p_idNotEqualTo(Integer value) {
            addCriterion("dr_p_id <>", value, "dr_p_id");
            return (Criteria) this;
        }

        public Criteria andDr_p_idGreaterThan(Integer value) {
            addCriterion("dr_p_id >", value, "dr_p_id");
            return (Criteria) this;
        }

        public Criteria andDr_p_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr_p_id >=", value, "dr_p_id");
            return (Criteria) this;
        }

        public Criteria andDr_p_idLessThan(Integer value) {
            addCriterion("dr_p_id <", value, "dr_p_id");
            return (Criteria) this;
        }

        public Criteria andDr_p_idLessThanOrEqualTo(Integer value) {
            addCriterion("dr_p_id <=", value, "dr_p_id");
            return (Criteria) this;
        }

        public Criteria andDr_p_idIn(List<Integer> values) {
            addCriterion("dr_p_id in", values, "dr_p_id");
            return (Criteria) this;
        }

        public Criteria andDr_p_idNotIn(List<Integer> values) {
            addCriterion("dr_p_id not in", values, "dr_p_id");
            return (Criteria) this;
        }

        public Criteria andDr_p_idBetween(Integer value1, Integer value2) {
            addCriterion("dr_p_id between", value1, value2, "dr_p_id");
            return (Criteria) this;
        }

        public Criteria andDr_p_idNotBetween(Integer value1, Integer value2) {
            addCriterion("dr_p_id not between", value1, value2, "dr_p_id");
            return (Criteria) this;
        }

        public Criteria andDr_idIsNull() {
            addCriterion("dr_id is null");
            return (Criteria) this;
        }

        public Criteria andDr_idIsNotNull() {
            addCriterion("dr_id is not null");
            return (Criteria) this;
        }

        public Criteria andDr_idEqualTo(Integer value) {
            addCriterion("dr_id =", value, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idNotEqualTo(Integer value) {
            addCriterion("dr_id <>", value, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idGreaterThan(Integer value) {
            addCriterion("dr_id >", value, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr_id >=", value, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idLessThan(Integer value) {
            addCriterion("dr_id <", value, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idLessThanOrEqualTo(Integer value) {
            addCriterion("dr_id <=", value, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idIn(List<Integer> values) {
            addCriterion("dr_id in", values, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idNotIn(List<Integer> values) {
            addCriterion("dr_id not in", values, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idBetween(Integer value1, Integer value2) {
            addCriterion("dr_id between", value1, value2, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idNotBetween(Integer value1, Integer value2) {
            addCriterion("dr_id not between", value1, value2, "dr_id");
            return (Criteria) this;
        }

        public Criteria andPeopleIdIsNull() {
            addCriterion("peopleId is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIdIsNotNull() {
            addCriterion("peopleId is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleIdEqualTo(Integer value) {
            addCriterion("peopleId =", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdNotEqualTo(Integer value) {
            addCriterion("peopleId <>", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdGreaterThan(Integer value) {
            addCriterion("peopleId >", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("peopleId >=", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdLessThan(Integer value) {
            addCriterion("peopleId <", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdLessThanOrEqualTo(Integer value) {
            addCriterion("peopleId <=", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdIn(List<Integer> values) {
            addCriterion("peopleId in", values, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdNotIn(List<Integer> values) {
            addCriterion("peopleId not in", values, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdBetween(Integer value1, Integer value2) {
            addCriterion("peopleId between", value1, value2, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("peopleId not between", value1, value2, "peopleId");
            return (Criteria) this;
        }

        public Criteria andDr_numberIsNull() {
            addCriterion("dr_number is null");
            return (Criteria) this;
        }

        public Criteria andDr_numberIsNotNull() {
            addCriterion("dr_number is not null");
            return (Criteria) this;
        }

        public Criteria andDr_numberEqualTo(Integer value) {
            addCriterion("dr_number =", value, "dr_number");
            return (Criteria) this;
        }

        public Criteria andDr_numberNotEqualTo(Integer value) {
            addCriterion("dr_number <>", value, "dr_number");
            return (Criteria) this;
        }

        public Criteria andDr_numberGreaterThan(Integer value) {
            addCriterion("dr_number >", value, "dr_number");
            return (Criteria) this;
        }

        public Criteria andDr_numberGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr_number >=", value, "dr_number");
            return (Criteria) this;
        }

        public Criteria andDr_numberLessThan(Integer value) {
            addCriterion("dr_number <", value, "dr_number");
            return (Criteria) this;
        }

        public Criteria andDr_numberLessThanOrEqualTo(Integer value) {
            addCriterion("dr_number <=", value, "dr_number");
            return (Criteria) this;
        }

        public Criteria andDr_numberIn(List<Integer> values) {
            addCriterion("dr_number in", values, "dr_number");
            return (Criteria) this;
        }

        public Criteria andDr_numberNotIn(List<Integer> values) {
            addCriterion("dr_number not in", values, "dr_number");
            return (Criteria) this;
        }

        public Criteria andDr_numberBetween(Integer value1, Integer value2) {
            addCriterion("dr_number between", value1, value2, "dr_number");
            return (Criteria) this;
        }

        public Criteria andDr_numberNotBetween(Integer value1, Integer value2) {
            addCriterion("dr_number not between", value1, value2, "dr_number");
            return (Criteria) this;
        }

        public Criteria andDr_give_numberIsNull() {
            addCriterion("dr_give_number is null");
            return (Criteria) this;
        }

        public Criteria andDr_give_numberIsNotNull() {
            addCriterion("dr_give_number is not null");
            return (Criteria) this;
        }

        public Criteria andDr_give_numberEqualTo(Integer value) {
            addCriterion("dr_give_number =", value, "dr_give_number");
            return (Criteria) this;
        }

        public Criteria andDr_give_numberNotEqualTo(Integer value) {
            addCriterion("dr_give_number <>", value, "dr_give_number");
            return (Criteria) this;
        }

        public Criteria andDr_give_numberGreaterThan(Integer value) {
            addCriterion("dr_give_number >", value, "dr_give_number");
            return (Criteria) this;
        }

        public Criteria andDr_give_numberGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr_give_number >=", value, "dr_give_number");
            return (Criteria) this;
        }

        public Criteria andDr_give_numberLessThan(Integer value) {
            addCriterion("dr_give_number <", value, "dr_give_number");
            return (Criteria) this;
        }

        public Criteria andDr_give_numberLessThanOrEqualTo(Integer value) {
            addCriterion("dr_give_number <=", value, "dr_give_number");
            return (Criteria) this;
        }

        public Criteria andDr_give_numberIn(List<Integer> values) {
            addCriterion("dr_give_number in", values, "dr_give_number");
            return (Criteria) this;
        }

        public Criteria andDr_give_numberNotIn(List<Integer> values) {
            addCriterion("dr_give_number not in", values, "dr_give_number");
            return (Criteria) this;
        }

        public Criteria andDr_give_numberBetween(Integer value1, Integer value2) {
            addCriterion("dr_give_number between", value1, value2, "dr_give_number");
            return (Criteria) this;
        }

        public Criteria andDr_give_numberNotBetween(Integer value1, Integer value2) {
            addCriterion("dr_give_number not between", value1, value2, "dr_give_number");
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