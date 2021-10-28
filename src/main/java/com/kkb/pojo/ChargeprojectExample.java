package com.kkb.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChargeprojectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChargeprojectExample() {
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

        public Criteria andChaP_idIsNull() {
            addCriterion("chaP_id is null");
            return (Criteria) this;
        }

        public Criteria andChaP_idIsNotNull() {
            addCriterion("chaP_id is not null");
            return (Criteria) this;
        }

        public Criteria andChaP_idEqualTo(Integer value) {
            addCriterion("chaP_id =", value, "chaP_id");
            return (Criteria) this;
        }

        public Criteria andChaP_idNotEqualTo(Integer value) {
            addCriterion("chaP_id <>", value, "chaP_id");
            return (Criteria) this;
        }

        public Criteria andChaP_idGreaterThan(Integer value) {
            addCriterion("chaP_id >", value, "chaP_id");
            return (Criteria) this;
        }

        public Criteria andChaP_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("chaP_id >=", value, "chaP_id");
            return (Criteria) this;
        }

        public Criteria andChaP_idLessThan(Integer value) {
            addCriterion("chaP_id <", value, "chaP_id");
            return (Criteria) this;
        }

        public Criteria andChaP_idLessThanOrEqualTo(Integer value) {
            addCriterion("chaP_id <=", value, "chaP_id");
            return (Criteria) this;
        }

        public Criteria andChaP_idIn(List<Integer> values) {
            addCriterion("chaP_id in", values, "chaP_id");
            return (Criteria) this;
        }

        public Criteria andChaP_idNotIn(List<Integer> values) {
            addCriterion("chaP_id not in", values, "chaP_id");
            return (Criteria) this;
        }

        public Criteria andChaP_idBetween(Integer value1, Integer value2) {
            addCriterion("chaP_id between", value1, value2, "chaP_id");
            return (Criteria) this;
        }

        public Criteria andChaP_idNotBetween(Integer value1, Integer value2) {
            addCriterion("chaP_id not between", value1, value2, "chaP_id");
            return (Criteria) this;
        }

        public Criteria andChaP_nameIsNull() {
            addCriterion("chaP_name is null");
            return (Criteria) this;
        }

        public Criteria andChaP_nameIsNotNull() {
            addCriterion("chaP_name is not null");
            return (Criteria) this;
        }

        public Criteria andChaP_nameEqualTo(String value) {
            addCriterion("chaP_name =", value, "chaP_name");
            return (Criteria) this;
        }

        public Criteria andChaP_nameNotEqualTo(String value) {
            addCriterion("chaP_name <>", value, "chaP_name");
            return (Criteria) this;
        }

        public Criteria andChaP_nameGreaterThan(String value) {
            addCriterion("chaP_name >", value, "chaP_name");
            return (Criteria) this;
        }

        public Criteria andChaP_nameGreaterThanOrEqualTo(String value) {
            addCriterion("chaP_name >=", value, "chaP_name");
            return (Criteria) this;
        }

        public Criteria andChaP_nameLessThan(String value) {
            addCriterion("chaP_name <", value, "chaP_name");
            return (Criteria) this;
        }

        public Criteria andChaP_nameLessThanOrEqualTo(String value) {
            addCriterion("chaP_name <=", value, "chaP_name");
            return (Criteria) this;
        }

        public Criteria andChaP_nameLike(String value) {
            addCriterion("chaP_name like", value, "chaP_name");
            return (Criteria) this;
        }

        public Criteria andChaP_nameNotLike(String value) {
            addCriterion("chaP_name not like", value, "chaP_name");
            return (Criteria) this;
        }

        public Criteria andChaP_nameIn(List<String> values) {
            addCriterion("chaP_name in", values, "chaP_name");
            return (Criteria) this;
        }

        public Criteria andChaP_nameNotIn(List<String> values) {
            addCriterion("chaP_name not in", values, "chaP_name");
            return (Criteria) this;
        }

        public Criteria andChaP_nameBetween(String value1, String value2) {
            addCriterion("chaP_name between", value1, value2, "chaP_name");
            return (Criteria) this;
        }

        public Criteria andChaP_nameNotBetween(String value1, String value2) {
            addCriterion("chaP_name not between", value1, value2, "chaP_name");
            return (Criteria) this;
        }

        public Criteria andChaP_moneyIsNull() {
            addCriterion("chaP_money is null");
            return (Criteria) this;
        }

        public Criteria andChaP_moneyIsNotNull() {
            addCriterion("chaP_money is not null");
            return (Criteria) this;
        }

        public Criteria andChaP_moneyEqualTo(BigDecimal value) {
            addCriterion("chaP_money =", value, "chaP_money");
            return (Criteria) this;
        }

        public Criteria andChaP_moneyNotEqualTo(BigDecimal value) {
            addCriterion("chaP_money <>", value, "chaP_money");
            return (Criteria) this;
        }

        public Criteria andChaP_moneyGreaterThan(BigDecimal value) {
            addCriterion("chaP_money >", value, "chaP_money");
            return (Criteria) this;
        }

        public Criteria andChaP_moneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("chaP_money >=", value, "chaP_money");
            return (Criteria) this;
        }

        public Criteria andChaP_moneyLessThan(BigDecimal value) {
            addCriterion("chaP_money <", value, "chaP_money");
            return (Criteria) this;
        }

        public Criteria andChaP_moneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("chaP_money <=", value, "chaP_money");
            return (Criteria) this;
        }

        public Criteria andChaP_moneyIn(List<BigDecimal> values) {
            addCriterion("chaP_money in", values, "chaP_money");
            return (Criteria) this;
        }

        public Criteria andChaP_moneyNotIn(List<BigDecimal> values) {
            addCriterion("chaP_money not in", values, "chaP_money");
            return (Criteria) this;
        }

        public Criteria andChaP_moneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chaP_money between", value1, value2, "chaP_money");
            return (Criteria) this;
        }

        public Criteria andChaP_moneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chaP_money not between", value1, value2, "chaP_money");
            return (Criteria) this;
        }

        public Criteria andChaP_isDelIsNull() {
            addCriterion("chaP_isDel is null");
            return (Criteria) this;
        }

        public Criteria andChaP_isDelIsNotNull() {
            addCriterion("chaP_isDel is not null");
            return (Criteria) this;
        }

        public Criteria andChaP_isDelEqualTo(Integer value) {
            addCriterion("chaP_isDel =", value, "chaP_isDel");
            return (Criteria) this;
        }

        public Criteria andChaP_isDelNotEqualTo(Integer value) {
            addCriterion("chaP_isDel <>", value, "chaP_isDel");
            return (Criteria) this;
        }

        public Criteria andChaP_isDelGreaterThan(Integer value) {
            addCriterion("chaP_isDel >", value, "chaP_isDel");
            return (Criteria) this;
        }

        public Criteria andChaP_isDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("chaP_isDel >=", value, "chaP_isDel");
            return (Criteria) this;
        }

        public Criteria andChaP_isDelLessThan(Integer value) {
            addCriterion("chaP_isDel <", value, "chaP_isDel");
            return (Criteria) this;
        }

        public Criteria andChaP_isDelLessThanOrEqualTo(Integer value) {
            addCriterion("chaP_isDel <=", value, "chaP_isDel");
            return (Criteria) this;
        }

        public Criteria andChaP_isDelIn(List<Integer> values) {
            addCriterion("chaP_isDel in", values, "chaP_isDel");
            return (Criteria) this;
        }

        public Criteria andChaP_isDelNotIn(List<Integer> values) {
            addCriterion("chaP_isDel not in", values, "chaP_isDel");
            return (Criteria) this;
        }

        public Criteria andChaP_isDelBetween(Integer value1, Integer value2) {
            addCriterion("chaP_isDel between", value1, value2, "chaP_isDel");
            return (Criteria) this;
        }

        public Criteria andChaP_isDelNotBetween(Integer value1, Integer value2) {
            addCriterion("chaP_isDel not between", value1, value2, "chaP_isDel");
            return (Criteria) this;
        }

        public Criteria andChaP_create_timeIsNull() {
            addCriterion("chaP_create_time is null");
            return (Criteria) this;
        }

        public Criteria andChaP_create_timeIsNotNull() {
            addCriterion("chaP_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andChaP_create_timeEqualTo(Date value) {
            addCriterion("chaP_create_time =", value, "chaP_create_time");
            return (Criteria) this;
        }

        public Criteria andChaP_create_timeNotEqualTo(Date value) {
            addCriterion("chaP_create_time <>", value, "chaP_create_time");
            return (Criteria) this;
        }

        public Criteria andChaP_create_timeGreaterThan(Date value) {
            addCriterion("chaP_create_time >", value, "chaP_create_time");
            return (Criteria) this;
        }

        public Criteria andChaP_create_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("chaP_create_time >=", value, "chaP_create_time");
            return (Criteria) this;
        }

        public Criteria andChaP_create_timeLessThan(Date value) {
            addCriterion("chaP_create_time <", value, "chaP_create_time");
            return (Criteria) this;
        }

        public Criteria andChaP_create_timeLessThanOrEqualTo(Date value) {
            addCriterion("chaP_create_time <=", value, "chaP_create_time");
            return (Criteria) this;
        }

        public Criteria andChaP_create_timeIn(List<Date> values) {
            addCriterion("chaP_create_time in", values, "chaP_create_time");
            return (Criteria) this;
        }

        public Criteria andChaP_create_timeNotIn(List<Date> values) {
            addCriterion("chaP_create_time not in", values, "chaP_create_time");
            return (Criteria) this;
        }

        public Criteria andChaP_create_timeBetween(Date value1, Date value2) {
            addCriterion("chaP_create_time between", value1, value2, "chaP_create_time");
            return (Criteria) this;
        }

        public Criteria andChaP_create_timeNotBetween(Date value1, Date value2) {
            addCriterion("chaP_create_time not between", value1, value2, "chaP_create_time");
            return (Criteria) this;
        }

        public Criteria andChaP_update_timeIsNull() {
            addCriterion("chaP_update_time is null");
            return (Criteria) this;
        }

        public Criteria andChaP_update_timeIsNotNull() {
            addCriterion("chaP_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andChaP_update_timeEqualTo(Date value) {
            addCriterion("chaP_update_time =", value, "chaP_update_time");
            return (Criteria) this;
        }

        public Criteria andChaP_update_timeNotEqualTo(Date value) {
            addCriterion("chaP_update_time <>", value, "chaP_update_time");
            return (Criteria) this;
        }

        public Criteria andChaP_update_timeGreaterThan(Date value) {
            addCriterion("chaP_update_time >", value, "chaP_update_time");
            return (Criteria) this;
        }

        public Criteria andChaP_update_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("chaP_update_time >=", value, "chaP_update_time");
            return (Criteria) this;
        }

        public Criteria andChaP_update_timeLessThan(Date value) {
            addCriterion("chaP_update_time <", value, "chaP_update_time");
            return (Criteria) this;
        }

        public Criteria andChaP_update_timeLessThanOrEqualTo(Date value) {
            addCriterion("chaP_update_time <=", value, "chaP_update_time");
            return (Criteria) this;
        }

        public Criteria andChaP_update_timeIn(List<Date> values) {
            addCriterion("chaP_update_time in", values, "chaP_update_time");
            return (Criteria) this;
        }

        public Criteria andChaP_update_timeNotIn(List<Date> values) {
            addCriterion("chaP_update_time not in", values, "chaP_update_time");
            return (Criteria) this;
        }

        public Criteria andChaP_update_timeBetween(Date value1, Date value2) {
            addCriterion("chaP_update_time between", value1, value2, "chaP_update_time");
            return (Criteria) this;
        }

        public Criteria andChaP_update_timeNotBetween(Date value1, Date value2) {
            addCriterion("chaP_update_time not between", value1, value2, "chaP_update_time");
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