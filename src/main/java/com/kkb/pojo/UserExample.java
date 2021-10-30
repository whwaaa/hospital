package com.kkb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andULoginNameIsNull() {
            addCriterion("u_login_name is null");
            return (Criteria) this;
        }

        public Criteria andULoginNameIsNotNull() {
            addCriterion("u_login_name is not null");
            return (Criteria) this;
        }

        public Criteria andULoginNameEqualTo(String value) {
            addCriterion("u_login_name =", value, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameNotEqualTo(String value) {
            addCriterion("u_login_name <>", value, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameGreaterThan(String value) {
            addCriterion("u_login_name >", value, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_login_name >=", value, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameLessThan(String value) {
            addCriterion("u_login_name <", value, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameLessThanOrEqualTo(String value) {
            addCriterion("u_login_name <=", value, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameLike(String value) {
            addCriterion("u_login_name like", value, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameNotLike(String value) {
            addCriterion("u_login_name not like", value, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameIn(List<String> values) {
            addCriterion("u_login_name in", values, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameNotIn(List<String> values) {
            addCriterion("u_login_name not in", values, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameBetween(String value1, String value2) {
            addCriterion("u_login_name between", value1, value2, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andULoginNameNotBetween(String value1, String value2) {
            addCriterion("u_login_name not between", value1, value2, "uLoginName");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNull() {
            addCriterion("u_password is null");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNotNull() {
            addCriterion("u_password is not null");
            return (Criteria) this;
        }

        public Criteria andUPasswordEqualTo(String value) {
            addCriterion("u_password =", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotEqualTo(String value) {
            addCriterion("u_password <>", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThan(String value) {
            addCriterion("u_password >", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("u_password >=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThan(String value) {
            addCriterion("u_password <", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThanOrEqualTo(String value) {
            addCriterion("u_password <=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLike(String value) {
            addCriterion("u_password like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotLike(String value) {
            addCriterion("u_password not like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordIn(List<String> values) {
            addCriterion("u_password in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotIn(List<String> values) {
            addCriterion("u_password not in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordBetween(String value1, String value2) {
            addCriterion("u_password between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotBetween(String value1, String value2) {
            addCriterion("u_password not between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUTrueNameIsNull() {
            addCriterion("u_true_name is null");
            return (Criteria) this;
        }

        public Criteria andUTrueNameIsNotNull() {
            addCriterion("u_true_name is not null");
            return (Criteria) this;
        }

        public Criteria andUTrueNameEqualTo(String value) {
            addCriterion("u_true_name =", value, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameNotEqualTo(String value) {
            addCriterion("u_true_name <>", value, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameGreaterThan(String value) {
            addCriterion("u_true_name >", value, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_true_name >=", value, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameLessThan(String value) {
            addCriterion("u_true_name <", value, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameLessThanOrEqualTo(String value) {
            addCriterion("u_true_name <=", value, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameLike(String value) {
            addCriterion("u_true_name like", value, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameNotLike(String value) {
            addCriterion("u_true_name not like", value, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameIn(List<String> values) {
            addCriterion("u_true_name in", values, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameNotIn(List<String> values) {
            addCriterion("u_true_name not in", values, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameBetween(String value1, String value2) {
            addCriterion("u_true_name between", value1, value2, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUTrueNameNotBetween(String value1, String value2) {
            addCriterion("u_true_name not between", value1, value2, "uTrueName");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNull() {
            addCriterion("u_email is null");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNotNull() {
            addCriterion("u_email is not null");
            return (Criteria) this;
        }

        public Criteria andUEmailEqualTo(String value) {
            addCriterion("u_email =", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotEqualTo(String value) {
            addCriterion("u_email <>", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThan(String value) {
            addCriterion("u_email >", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThanOrEqualTo(String value) {
            addCriterion("u_email >=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThan(String value) {
            addCriterion("u_email <", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThanOrEqualTo(String value) {
            addCriterion("u_email <=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLike(String value) {
            addCriterion("u_email like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotLike(String value) {
            addCriterion("u_email not like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailIn(List<String> values) {
            addCriterion("u_email in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotIn(List<String> values) {
            addCriterion("u_email not in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailBetween(String value1, String value2) {
            addCriterion("u_email between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotBetween(String value1, String value2) {
            addCriterion("u_email not between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUStateIsNull() {
            addCriterion("u_state is null");
            return (Criteria) this;
        }

        public Criteria andUStateIsNotNull() {
            addCriterion("u_state is not null");
            return (Criteria) this;
        }

        public Criteria andUStateEqualTo(Integer value) {
            addCriterion("u_state =", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateNotEqualTo(Integer value) {
            addCriterion("u_state <>", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateGreaterThan(Integer value) {
            addCriterion("u_state >", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_state >=", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateLessThan(Integer value) {
            addCriterion("u_state <", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateLessThanOrEqualTo(Integer value) {
            addCriterion("u_state <=", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateIn(List<Integer> values) {
            addCriterion("u_state in", values, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateNotIn(List<Integer> values) {
            addCriterion("u_state not in", values, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateBetween(Integer value1, Integer value2) {
            addCriterion("u_state between", value1, value2, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateNotBetween(Integer value1, Integer value2) {
            addCriterion("u_state not between", value1, value2, "uState");
            return (Criteria) this;
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

        public Criteria andUIsDelIsNull() {
            addCriterion("u_is_del is null");
            return (Criteria) this;
        }

        public Criteria andUIsDelIsNotNull() {
            addCriterion("u_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andUIsDelEqualTo(Integer value) {
            addCriterion("u_is_del =", value, "uIsDel");
            return (Criteria) this;
        }

        public Criteria andUIsDelNotEqualTo(Integer value) {
            addCriterion("u_is_del <>", value, "uIsDel");
            return (Criteria) this;
        }

        public Criteria andUIsDelGreaterThan(Integer value) {
            addCriterion("u_is_del >", value, "uIsDel");
            return (Criteria) this;
        }

        public Criteria andUIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_is_del >=", value, "uIsDel");
            return (Criteria) this;
        }

        public Criteria andUIsDelLessThan(Integer value) {
            addCriterion("u_is_del <", value, "uIsDel");
            return (Criteria) this;
        }

        public Criteria andUIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("u_is_del <=", value, "uIsDel");
            return (Criteria) this;
        }

        public Criteria andUIsDelIn(List<Integer> values) {
            addCriterion("u_is_del in", values, "uIsDel");
            return (Criteria) this;
        }

        public Criteria andUIsDelNotIn(List<Integer> values) {
            addCriterion("u_is_del not in", values, "uIsDel");
            return (Criteria) this;
        }

        public Criteria andUIsDelBetween(Integer value1, Integer value2) {
            addCriterion("u_is_del between", value1, value2, "uIsDel");
            return (Criteria) this;
        }

        public Criteria andUIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("u_is_del not between", value1, value2, "uIsDel");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeIsNull() {
            addCriterion("u_create_time is null");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeIsNotNull() {
            addCriterion("u_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeEqualTo(Date value) {
            addCriterion("u_create_time =", value, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeNotEqualTo(Date value) {
            addCriterion("u_create_time <>", value, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeGreaterThan(Date value) {
            addCriterion("u_create_time >", value, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("u_create_time >=", value, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeLessThan(Date value) {
            addCriterion("u_create_time <", value, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("u_create_time <=", value, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeIn(List<Date> values) {
            addCriterion("u_create_time in", values, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeNotIn(List<Date> values) {
            addCriterion("u_create_time not in", values, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeBetween(Date value1, Date value2) {
            addCriterion("u_create_time between", value1, value2, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("u_create_time not between", value1, value2, "uCreateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeIsNull() {
            addCriterion("u_update_time is null");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeIsNotNull() {
            addCriterion("u_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeEqualTo(Date value) {
            addCriterion("u_update_time =", value, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeNotEqualTo(Date value) {
            addCriterion("u_update_time <>", value, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeGreaterThan(Date value) {
            addCriterion("u_update_time >", value, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("u_update_time >=", value, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeLessThan(Date value) {
            addCriterion("u_update_time <", value, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("u_update_time <=", value, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeIn(List<Date> values) {
            addCriterion("u_update_time in", values, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeNotIn(List<Date> values) {
            addCriterion("u_update_time not in", values, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("u_update_time between", value1, value2, "uUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("u_update_time not between", value1, value2, "uUpdateTime");
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