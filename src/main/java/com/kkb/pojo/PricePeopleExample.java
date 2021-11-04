package com.kkb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PricePeopleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PricePeopleExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andChapIdIsNull() {
            addCriterion("chap_id is null");
            return (Criteria) this;
        }

        public Criteria andChapIdIsNotNull() {
            addCriterion("chap_id is not null");
            return (Criteria) this;
        }

        public Criteria andChapIdEqualTo(Integer value) {
            addCriterion("chap_id =", value, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdNotEqualTo(Integer value) {
            addCriterion("chap_id <>", value, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdGreaterThan(Integer value) {
            addCriterion("chap_id >", value, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chap_id >=", value, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdLessThan(Integer value) {
            addCriterion("chap_id <", value, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdLessThanOrEqualTo(Integer value) {
            addCriterion("chap_id <=", value, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdIn(List<Integer> values) {
            addCriterion("chap_id in", values, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdNotIn(List<Integer> values) {
            addCriterion("chap_id not in", values, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdBetween(Integer value1, Integer value2) {
            addCriterion("chap_id between", value1, value2, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chap_id not between", value1, value2, "chapId");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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