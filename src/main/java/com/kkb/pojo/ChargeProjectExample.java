package com.kkb.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChargeProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChargeProjectExample() {
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

        public Criteria andChapNameIsNull() {
            addCriterion("chap_name is null");
            return (Criteria) this;
        }

        public Criteria andChapNameIsNotNull() {
            addCriterion("chap_name is not null");
            return (Criteria) this;
        }

        public Criteria andChapNameEqualTo(String value) {
            addCriterion("chap_name =", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameNotEqualTo(String value) {
            addCriterion("chap_name <>", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameGreaterThan(String value) {
            addCriterion("chap_name >", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameGreaterThanOrEqualTo(String value) {
            addCriterion("chap_name >=", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameLessThan(String value) {
            addCriterion("chap_name <", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameLessThanOrEqualTo(String value) {
            addCriterion("chap_name <=", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameLike(String value) {
            addCriterion("chap_name like", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameNotLike(String value) {
            addCriterion("chap_name not like", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameIn(List<String> values) {
            addCriterion("chap_name in", values, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameNotIn(List<String> values) {
            addCriterion("chap_name not in", values, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameBetween(String value1, String value2) {
            addCriterion("chap_name between", value1, value2, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameNotBetween(String value1, String value2) {
            addCriterion("chap_name not between", value1, value2, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapMoneyIsNull() {
            addCriterion("chap_money is null");
            return (Criteria) this;
        }

        public Criteria andChapMoneyIsNotNull() {
            addCriterion("chap_money is not null");
            return (Criteria) this;
        }

        public Criteria andChapMoneyEqualTo(BigDecimal value) {
            addCriterion("chap_money =", value, "chapMoney");
            return (Criteria) this;
        }

        public Criteria andChapMoneyNotEqualTo(BigDecimal value) {
            addCriterion("chap_money <>", value, "chapMoney");
            return (Criteria) this;
        }

        public Criteria andChapMoneyGreaterThan(BigDecimal value) {
            addCriterion("chap_money >", value, "chapMoney");
            return (Criteria) this;
        }

        public Criteria andChapMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("chap_money >=", value, "chapMoney");
            return (Criteria) this;
        }

        public Criteria andChapMoneyLessThan(BigDecimal value) {
            addCriterion("chap_money <", value, "chapMoney");
            return (Criteria) this;
        }

        public Criteria andChapMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("chap_money <=", value, "chapMoney");
            return (Criteria) this;
        }

        public Criteria andChapMoneyIn(List<BigDecimal> values) {
            addCriterion("chap_money in", values, "chapMoney");
            return (Criteria) this;
        }

        public Criteria andChapMoneyNotIn(List<BigDecimal> values) {
            addCriterion("chap_money not in", values, "chapMoney");
            return (Criteria) this;
        }

        public Criteria andChapMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chap_money between", value1, value2, "chapMoney");
            return (Criteria) this;
        }

        public Criteria andChapMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chap_money not between", value1, value2, "chapMoney");
            return (Criteria) this;
        }

        public Criteria andChapIsDelIsNull() {
            addCriterion("chap_is_del is null");
            return (Criteria) this;
        }

        public Criteria andChapIsDelIsNotNull() {
            addCriterion("chap_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andChapIsDelEqualTo(Integer value) {
            addCriterion("chap_is_del =", value, "chapIsDel");
            return (Criteria) this;
        }

        public Criteria andChapIsDelNotEqualTo(Integer value) {
            addCriterion("chap_is_del <>", value, "chapIsDel");
            return (Criteria) this;
        }

        public Criteria andChapIsDelGreaterThan(Integer value) {
            addCriterion("chap_is_del >", value, "chapIsDel");
            return (Criteria) this;
        }

        public Criteria andChapIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("chap_is_del >=", value, "chapIsDel");
            return (Criteria) this;
        }

        public Criteria andChapIsDelLessThan(Integer value) {
            addCriterion("chap_is_del <", value, "chapIsDel");
            return (Criteria) this;
        }

        public Criteria andChapIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("chap_is_del <=", value, "chapIsDel");
            return (Criteria) this;
        }

        public Criteria andChapIsDelIn(List<Integer> values) {
            addCriterion("chap_is_del in", values, "chapIsDel");
            return (Criteria) this;
        }

        public Criteria andChapIsDelNotIn(List<Integer> values) {
            addCriterion("chap_is_del not in", values, "chapIsDel");
            return (Criteria) this;
        }

        public Criteria andChapIsDelBetween(Integer value1, Integer value2) {
            addCriterion("chap_is_del between", value1, value2, "chapIsDel");
            return (Criteria) this;
        }

        public Criteria andChapIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("chap_is_del not between", value1, value2, "chapIsDel");
            return (Criteria) this;
        }

        public Criteria andChapCreateTimeIsNull() {
            addCriterion("chap_create_time is null");
            return (Criteria) this;
        }

        public Criteria andChapCreateTimeIsNotNull() {
            addCriterion("chap_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andChapCreateTimeEqualTo(Date value) {
            addCriterion("chap_create_time =", value, "chapCreateTime");
            return (Criteria) this;
        }

        public Criteria andChapCreateTimeNotEqualTo(Date value) {
            addCriterion("chap_create_time <>", value, "chapCreateTime");
            return (Criteria) this;
        }

        public Criteria andChapCreateTimeGreaterThan(Date value) {
            addCriterion("chap_create_time >", value, "chapCreateTime");
            return (Criteria) this;
        }

        public Criteria andChapCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("chap_create_time >=", value, "chapCreateTime");
            return (Criteria) this;
        }

        public Criteria andChapCreateTimeLessThan(Date value) {
            addCriterion("chap_create_time <", value, "chapCreateTime");
            return (Criteria) this;
        }

        public Criteria andChapCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("chap_create_time <=", value, "chapCreateTime");
            return (Criteria) this;
        }

        public Criteria andChapCreateTimeIn(List<Date> values) {
            addCriterion("chap_create_time in", values, "chapCreateTime");
            return (Criteria) this;
        }

        public Criteria andChapCreateTimeNotIn(List<Date> values) {
            addCriterion("chap_create_time not in", values, "chapCreateTime");
            return (Criteria) this;
        }

        public Criteria andChapCreateTimeBetween(Date value1, Date value2) {
            addCriterion("chap_create_time between", value1, value2, "chapCreateTime");
            return (Criteria) this;
        }

        public Criteria andChapCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("chap_create_time not between", value1, value2, "chapCreateTime");
            return (Criteria) this;
        }

        public Criteria andChapUpdateTimeIsNull() {
            addCriterion("chap_update_time is null");
            return (Criteria) this;
        }

        public Criteria andChapUpdateTimeIsNotNull() {
            addCriterion("chap_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andChapUpdateTimeEqualTo(Date value) {
            addCriterion("chap_update_time =", value, "chapUpdateTime");
            return (Criteria) this;
        }

        public Criteria andChapUpdateTimeNotEqualTo(Date value) {
            addCriterion("chap_update_time <>", value, "chapUpdateTime");
            return (Criteria) this;
        }

        public Criteria andChapUpdateTimeGreaterThan(Date value) {
            addCriterion("chap_update_time >", value, "chapUpdateTime");
            return (Criteria) this;
        }

        public Criteria andChapUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("chap_update_time >=", value, "chapUpdateTime");
            return (Criteria) this;
        }

        public Criteria andChapUpdateTimeLessThan(Date value) {
            addCriterion("chap_update_time <", value, "chapUpdateTime");
            return (Criteria) this;
        }

        public Criteria andChapUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("chap_update_time <=", value, "chapUpdateTime");
            return (Criteria) this;
        }

        public Criteria andChapUpdateTimeIn(List<Date> values) {
            addCriterion("chap_update_time in", values, "chapUpdateTime");
            return (Criteria) this;
        }

        public Criteria andChapUpdateTimeNotIn(List<Date> values) {
            addCriterion("chap_update_time not in", values, "chapUpdateTime");
            return (Criteria) this;
        }

        public Criteria andChapUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("chap_update_time between", value1, value2, "chapUpdateTime");
            return (Criteria) this;
        }

        public Criteria andChapUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("chap_update_time not between", value1, value2, "chapUpdateTime");
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