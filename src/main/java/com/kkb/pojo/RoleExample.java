package com.kkb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleExample() {
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

        public Criteria andRIdIsNull() {
            addCriterion("r_id is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("r_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("r_id =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("r_id <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("r_id >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_id >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("r_id <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_id <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("r_id in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("r_id not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("r_id between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_id not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRNameIsNull() {
            addCriterion("r_name is null");
            return (Criteria) this;
        }

        public Criteria andRNameIsNotNull() {
            addCriterion("r_name is not null");
            return (Criteria) this;
        }

        public Criteria andRNameEqualTo(String value) {
            addCriterion("r_name =", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotEqualTo(String value) {
            addCriterion("r_name <>", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameGreaterThan(String value) {
            addCriterion("r_name >", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameGreaterThanOrEqualTo(String value) {
            addCriterion("r_name >=", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLessThan(String value) {
            addCriterion("r_name <", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLessThanOrEqualTo(String value) {
            addCriterion("r_name <=", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLike(String value) {
            addCriterion("r_name like", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotLike(String value) {
            addCriterion("r_name not like", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameIn(List<String> values) {
            addCriterion("r_name in", values, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotIn(List<String> values) {
            addCriterion("r_name not in", values, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameBetween(String value1, String value2) {
            addCriterion("r_name between", value1, value2, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotBetween(String value1, String value2) {
            addCriterion("r_name not between", value1, value2, "rName");
            return (Criteria) this;
        }

        public Criteria andRStateIsNull() {
            addCriterion("r_state is null");
            return (Criteria) this;
        }

        public Criteria andRStateIsNotNull() {
            addCriterion("r_state is not null");
            return (Criteria) this;
        }

        public Criteria andRStateEqualTo(Integer value) {
            addCriterion("r_state =", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateNotEqualTo(Integer value) {
            addCriterion("r_state <>", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateGreaterThan(Integer value) {
            addCriterion("r_state >", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_state >=", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateLessThan(Integer value) {
            addCriterion("r_state <", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateLessThanOrEqualTo(Integer value) {
            addCriterion("r_state <=", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateIn(List<Integer> values) {
            addCriterion("r_state in", values, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateNotIn(List<Integer> values) {
            addCriterion("r_state not in", values, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateBetween(Integer value1, Integer value2) {
            addCriterion("r_state between", value1, value2, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateNotBetween(Integer value1, Integer value2) {
            addCriterion("r_state not between", value1, value2, "rState");
            return (Criteria) this;
        }

        public Criteria andRIsDelIsNull() {
            addCriterion("r_is_del is null");
            return (Criteria) this;
        }

        public Criteria andRIsDelIsNotNull() {
            addCriterion("r_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andRIsDelEqualTo(Integer value) {
            addCriterion("r_is_del =", value, "rIsDel");
            return (Criteria) this;
        }

        public Criteria andRIsDelNotEqualTo(Integer value) {
            addCriterion("r_is_del <>", value, "rIsDel");
            return (Criteria) this;
        }

        public Criteria andRIsDelGreaterThan(Integer value) {
            addCriterion("r_is_del >", value, "rIsDel");
            return (Criteria) this;
        }

        public Criteria andRIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_is_del >=", value, "rIsDel");
            return (Criteria) this;
        }

        public Criteria andRIsDelLessThan(Integer value) {
            addCriterion("r_is_del <", value, "rIsDel");
            return (Criteria) this;
        }

        public Criteria andRIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("r_is_del <=", value, "rIsDel");
            return (Criteria) this;
        }

        public Criteria andRIsDelIn(List<Integer> values) {
            addCriterion("r_is_del in", values, "rIsDel");
            return (Criteria) this;
        }

        public Criteria andRIsDelNotIn(List<Integer> values) {
            addCriterion("r_is_del not in", values, "rIsDel");
            return (Criteria) this;
        }

        public Criteria andRIsDelBetween(Integer value1, Integer value2) {
            addCriterion("r_is_del between", value1, value2, "rIsDel");
            return (Criteria) this;
        }

        public Criteria andRIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("r_is_del not between", value1, value2, "rIsDel");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeIsNull() {
            addCriterion("r_create_time is null");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeIsNotNull() {
            addCriterion("r_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeEqualTo(Date value) {
            addCriterion("r_create_time =", value, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeNotEqualTo(Date value) {
            addCriterion("r_create_time <>", value, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeGreaterThan(Date value) {
            addCriterion("r_create_time >", value, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("r_create_time >=", value, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeLessThan(Date value) {
            addCriterion("r_create_time <", value, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("r_create_time <=", value, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeIn(List<Date> values) {
            addCriterion("r_create_time in", values, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeNotIn(List<Date> values) {
            addCriterion("r_create_time not in", values, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeBetween(Date value1, Date value2) {
            addCriterion("r_create_time between", value1, value2, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("r_create_time not between", value1, value2, "rCreateTime");
            return (Criteria) this;
        }

        public Criteria andRUpdateTimeIsNull() {
            addCriterion("r_update_time is null");
            return (Criteria) this;
        }

        public Criteria andRUpdateTimeIsNotNull() {
            addCriterion("r_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andRUpdateTimeEqualTo(Date value) {
            addCriterion("r_update_time =", value, "rUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRUpdateTimeNotEqualTo(Date value) {
            addCriterion("r_update_time <>", value, "rUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRUpdateTimeGreaterThan(Date value) {
            addCriterion("r_update_time >", value, "rUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("r_update_time >=", value, "rUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRUpdateTimeLessThan(Date value) {
            addCriterion("r_update_time <", value, "rUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("r_update_time <=", value, "rUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRUpdateTimeIn(List<Date> values) {
            addCriterion("r_update_time in", values, "rUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRUpdateTimeNotIn(List<Date> values) {
            addCriterion("r_update_time not in", values, "rUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("r_update_time between", value1, value2, "rUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("r_update_time not between", value1, value2, "rUpdateTime");
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