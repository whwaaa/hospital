package com.kkb.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BeHospitalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BeHospitalExample() {
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

        public Criteria andBehNameIsNull() {
            addCriterion("beh_name is null");
            return (Criteria) this;
        }

        public Criteria andBehNameIsNotNull() {
            addCriterion("beh_name is not null");
            return (Criteria) this;
        }

        public Criteria andBehNameEqualTo(String value) {
            addCriterion("beh_name =", value, "behName");
            return (Criteria) this;
        }

        public Criteria andBehNameNotEqualTo(String value) {
            addCriterion("beh_name <>", value, "behName");
            return (Criteria) this;
        }

        public Criteria andBehNameGreaterThan(String value) {
            addCriterion("beh_name >", value, "behName");
            return (Criteria) this;
        }

        public Criteria andBehNameGreaterThanOrEqualTo(String value) {
            addCriterion("beh_name >=", value, "behName");
            return (Criteria) this;
        }

        public Criteria andBehNameLessThan(String value) {
            addCriterion("beh_name <", value, "behName");
            return (Criteria) this;
        }

        public Criteria andBehNameLessThanOrEqualTo(String value) {
            addCriterion("beh_name <=", value, "behName");
            return (Criteria) this;
        }

        public Criteria andBehNameLike(String value) {
            addCriterion("beh_name like", value, "behName");
            return (Criteria) this;
        }

        public Criteria andBehNameNotLike(String value) {
            addCriterion("beh_name not like", value, "behName");
            return (Criteria) this;
        }

        public Criteria andBehNameIn(List<String> values) {
            addCriterion("beh_name in", values, "behName");
            return (Criteria) this;
        }

        public Criteria andBehNameNotIn(List<String> values) {
            addCriterion("beh_name not in", values, "behName");
            return (Criteria) this;
        }

        public Criteria andBehNameBetween(String value1, String value2) {
            addCriterion("beh_name between", value1, value2, "behName");
            return (Criteria) this;
        }

        public Criteria andBehNameNotBetween(String value1, String value2) {
            addCriterion("beh_name not between", value1, value2, "behName");
            return (Criteria) this;
        }

        public Criteria andBehNursePeopleIsNull() {
            addCriterion("beh_nurse_people is null");
            return (Criteria) this;
        }

        public Criteria andBehNursePeopleIsNotNull() {
            addCriterion("beh_nurse_people is not null");
            return (Criteria) this;
        }

        public Criteria andBehNursePeopleEqualTo(String value) {
            addCriterion("beh_nurse_people =", value, "behNursePeople");
            return (Criteria) this;
        }

        public Criteria andBehNursePeopleNotEqualTo(String value) {
            addCriterion("beh_nurse_people <>", value, "behNursePeople");
            return (Criteria) this;
        }

        public Criteria andBehNursePeopleGreaterThan(String value) {
            addCriterion("beh_nurse_people >", value, "behNursePeople");
            return (Criteria) this;
        }

        public Criteria andBehNursePeopleGreaterThanOrEqualTo(String value) {
            addCriterion("beh_nurse_people >=", value, "behNursePeople");
            return (Criteria) this;
        }

        public Criteria andBehNursePeopleLessThan(String value) {
            addCriterion("beh_nurse_people <", value, "behNursePeople");
            return (Criteria) this;
        }

        public Criteria andBehNursePeopleLessThanOrEqualTo(String value) {
            addCriterion("beh_nurse_people <=", value, "behNursePeople");
            return (Criteria) this;
        }

        public Criteria andBehNursePeopleLike(String value) {
            addCriterion("beh_nurse_people like", value, "behNursePeople");
            return (Criteria) this;
        }

        public Criteria andBehNursePeopleNotLike(String value) {
            addCriterion("beh_nurse_people not like", value, "behNursePeople");
            return (Criteria) this;
        }

        public Criteria andBehNursePeopleIn(List<String> values) {
            addCriterion("beh_nurse_people in", values, "behNursePeople");
            return (Criteria) this;
        }

        public Criteria andBehNursePeopleNotIn(List<String> values) {
            addCriterion("beh_nurse_people not in", values, "behNursePeople");
            return (Criteria) this;
        }

        public Criteria andBehNursePeopleBetween(String value1, String value2) {
            addCriterion("beh_nurse_people between", value1, value2, "behNursePeople");
            return (Criteria) this;
        }

        public Criteria andBehNursePeopleNotBetween(String value1, String value2) {
            addCriterion("beh_nurse_people not between", value1, value2, "behNursePeople");
            return (Criteria) this;
        }

        public Criteria andBehPatBedIsNull() {
            addCriterion("beh_pat_bed is null");
            return (Criteria) this;
        }

        public Criteria andBehPatBedIsNotNull() {
            addCriterion("beh_pat_bed is not null");
            return (Criteria) this;
        }

        public Criteria andBehPatBedEqualTo(String value) {
            addCriterion("beh_pat_bed =", value, "behPatBed");
            return (Criteria) this;
        }

        public Criteria andBehPatBedNotEqualTo(String value) {
            addCriterion("beh_pat_bed <>", value, "behPatBed");
            return (Criteria) this;
        }

        public Criteria andBehPatBedGreaterThan(String value) {
            addCriterion("beh_pat_bed >", value, "behPatBed");
            return (Criteria) this;
        }

        public Criteria andBehPatBedGreaterThanOrEqualTo(String value) {
            addCriterion("beh_pat_bed >=", value, "behPatBed");
            return (Criteria) this;
        }

        public Criteria andBehPatBedLessThan(String value) {
            addCriterion("beh_pat_bed <", value, "behPatBed");
            return (Criteria) this;
        }

        public Criteria andBehPatBedLessThanOrEqualTo(String value) {
            addCriterion("beh_pat_bed <=", value, "behPatBed");
            return (Criteria) this;
        }

        public Criteria andBehPatBedLike(String value) {
            addCriterion("beh_pat_bed like", value, "behPatBed");
            return (Criteria) this;
        }

        public Criteria andBehPatBedNotLike(String value) {
            addCriterion("beh_pat_bed not like", value, "behPatBed");
            return (Criteria) this;
        }

        public Criteria andBehPatBedIn(List<String> values) {
            addCriterion("beh_pat_bed in", values, "behPatBed");
            return (Criteria) this;
        }

        public Criteria andBehPatBedNotIn(List<String> values) {
            addCriterion("beh_pat_bed not in", values, "behPatBed");
            return (Criteria) this;
        }

        public Criteria andBehPatBedBetween(String value1, String value2) {
            addCriterion("beh_pat_bed between", value1, value2, "behPatBed");
            return (Criteria) this;
        }

        public Criteria andBehPatBedNotBetween(String value1, String value2) {
            addCriterion("beh_pat_bed not between", value1, value2, "behPatBed");
            return (Criteria) this;
        }

        public Criteria andBehAntecedentIsNull() {
            addCriterion("beh_antecedent is null");
            return (Criteria) this;
        }

        public Criteria andBehAntecedentIsNotNull() {
            addCriterion("beh_antecedent is not null");
            return (Criteria) this;
        }

        public Criteria andBehAntecedentEqualTo(BigDecimal value) {
            addCriterion("beh_antecedent =", value, "behAntecedent");
            return (Criteria) this;
        }

        public Criteria andBehAntecedentNotEqualTo(BigDecimal value) {
            addCriterion("beh_antecedent <>", value, "behAntecedent");
            return (Criteria) this;
        }

        public Criteria andBehAntecedentGreaterThan(BigDecimal value) {
            addCriterion("beh_antecedent >", value, "behAntecedent");
            return (Criteria) this;
        }

        public Criteria andBehAntecedentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("beh_antecedent >=", value, "behAntecedent");
            return (Criteria) this;
        }

        public Criteria andBehAntecedentLessThan(BigDecimal value) {
            addCriterion("beh_antecedent <", value, "behAntecedent");
            return (Criteria) this;
        }

        public Criteria andBehAntecedentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("beh_antecedent <=", value, "behAntecedent");
            return (Criteria) this;
        }

        public Criteria andBehAntecedentIn(List<BigDecimal> values) {
            addCriterion("beh_antecedent in", values, "behAntecedent");
            return (Criteria) this;
        }

        public Criteria andBehAntecedentNotIn(List<BigDecimal> values) {
            addCriterion("beh_antecedent not in", values, "behAntecedent");
            return (Criteria) this;
        }

        public Criteria andBehAntecedentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("beh_antecedent between", value1, value2, "behAntecedent");
            return (Criteria) this;
        }

        public Criteria andBehAntecedentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("beh_antecedent not between", value1, value2, "behAntecedent");
            return (Criteria) this;
        }

        public Criteria andBehIllnessIsNull() {
            addCriterion("beh_illness is null");
            return (Criteria) this;
        }

        public Criteria andBehIllnessIsNotNull() {
            addCriterion("beh_illness is not null");
            return (Criteria) this;
        }

        public Criteria andBehIllnessEqualTo(String value) {
            addCriterion("beh_illness =", value, "behIllness");
            return (Criteria) this;
        }

        public Criteria andBehIllnessNotEqualTo(String value) {
            addCriterion("beh_illness <>", value, "behIllness");
            return (Criteria) this;
        }

        public Criteria andBehIllnessGreaterThan(String value) {
            addCriterion("beh_illness >", value, "behIllness");
            return (Criteria) this;
        }

        public Criteria andBehIllnessGreaterThanOrEqualTo(String value) {
            addCriterion("beh_illness >=", value, "behIllness");
            return (Criteria) this;
        }

        public Criteria andBehIllnessLessThan(String value) {
            addCriterion("beh_illness <", value, "behIllness");
            return (Criteria) this;
        }

        public Criteria andBehIllnessLessThanOrEqualTo(String value) {
            addCriterion("beh_illness <=", value, "behIllness");
            return (Criteria) this;
        }

        public Criteria andBehIllnessLike(String value) {
            addCriterion("beh_illness like", value, "behIllness");
            return (Criteria) this;
        }

        public Criteria andBehIllnessNotLike(String value) {
            addCriterion("beh_illness not like", value, "behIllness");
            return (Criteria) this;
        }

        public Criteria andBehIllnessIn(List<String> values) {
            addCriterion("beh_illness in", values, "behIllness");
            return (Criteria) this;
        }

        public Criteria andBehIllnessNotIn(List<String> values) {
            addCriterion("beh_illness not in", values, "behIllness");
            return (Criteria) this;
        }

        public Criteria andBehIllnessBetween(String value1, String value2) {
            addCriterion("beh_illness between", value1, value2, "behIllness");
            return (Criteria) this;
        }

        public Criteria andBehIllnessNotBetween(String value1, String value2) {
            addCriterion("beh_illness not between", value1, value2, "behIllness");
            return (Criteria) this;
        }

        public Criteria andBehClosePriceIsNull() {
            addCriterion("beh_close_price is null");
            return (Criteria) this;
        }

        public Criteria andBehClosePriceIsNotNull() {
            addCriterion("beh_close_price is not null");
            return (Criteria) this;
        }

        public Criteria andBehClosePriceEqualTo(Integer value) {
            addCriterion("beh_close_price =", value, "behClosePrice");
            return (Criteria) this;
        }

        public Criteria andBehClosePriceNotEqualTo(Integer value) {
            addCriterion("beh_close_price <>", value, "behClosePrice");
            return (Criteria) this;
        }

        public Criteria andBehClosePriceGreaterThan(Integer value) {
            addCriterion("beh_close_price >", value, "behClosePrice");
            return (Criteria) this;
        }

        public Criteria andBehClosePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("beh_close_price >=", value, "behClosePrice");
            return (Criteria) this;
        }

        public Criteria andBehClosePriceLessThan(Integer value) {
            addCriterion("beh_close_price <", value, "behClosePrice");
            return (Criteria) this;
        }

        public Criteria andBehClosePriceLessThanOrEqualTo(Integer value) {
            addCriterion("beh_close_price <=", value, "behClosePrice");
            return (Criteria) this;
        }

        public Criteria andBehClosePriceIn(List<Integer> values) {
            addCriterion("beh_close_price in", values, "behClosePrice");
            return (Criteria) this;
        }

        public Criteria andBehClosePriceNotIn(List<Integer> values) {
            addCriterion("beh_close_price not in", values, "behClosePrice");
            return (Criteria) this;
        }

        public Criteria andBehClosePriceBetween(Integer value1, Integer value2) {
            addCriterion("beh_close_price between", value1, value2, "behClosePrice");
            return (Criteria) this;
        }

        public Criteria andBehClosePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("beh_close_price not between", value1, value2, "behClosePrice");
            return (Criteria) this;
        }

        public Criteria andBehStateIsNull() {
            addCriterion("beh_state is null");
            return (Criteria) this;
        }

        public Criteria andBehStateIsNotNull() {
            addCriterion("beh_state is not null");
            return (Criteria) this;
        }

        public Criteria andBehStateEqualTo(Integer value) {
            addCriterion("beh_state =", value, "behState");
            return (Criteria) this;
        }

        public Criteria andBehStateNotEqualTo(Integer value) {
            addCriterion("beh_state <>", value, "behState");
            return (Criteria) this;
        }

        public Criteria andBehStateGreaterThan(Integer value) {
            addCriterion("beh_state >", value, "behState");
            return (Criteria) this;
        }

        public Criteria andBehStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("beh_state >=", value, "behState");
            return (Criteria) this;
        }

        public Criteria andBehStateLessThan(Integer value) {
            addCriterion("beh_state <", value, "behState");
            return (Criteria) this;
        }

        public Criteria andBehStateLessThanOrEqualTo(Integer value) {
            addCriterion("beh_state <=", value, "behState");
            return (Criteria) this;
        }

        public Criteria andBehStateIn(List<Integer> values) {
            addCriterion("beh_state in", values, "behState");
            return (Criteria) this;
        }

        public Criteria andBehStateNotIn(List<Integer> values) {
            addCriterion("beh_state not in", values, "behState");
            return (Criteria) this;
        }

        public Criteria andBehStateBetween(Integer value1, Integer value2) {
            addCriterion("beh_state between", value1, value2, "behState");
            return (Criteria) this;
        }

        public Criteria andBehStateNotBetween(Integer value1, Integer value2) {
            addCriterion("beh_state not between", value1, value2, "behState");
            return (Criteria) this;
        }

        public Criteria andBehIsDelIsNull() {
            addCriterion("beh_is_del is null");
            return (Criteria) this;
        }

        public Criteria andBehIsDelIsNotNull() {
            addCriterion("beh_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andBehIsDelEqualTo(Integer value) {
            addCriterion("beh_is_del =", value, "behIsDel");
            return (Criteria) this;
        }

        public Criteria andBehIsDelNotEqualTo(Integer value) {
            addCriterion("beh_is_del <>", value, "behIsDel");
            return (Criteria) this;
        }

        public Criteria andBehIsDelGreaterThan(Integer value) {
            addCriterion("beh_is_del >", value, "behIsDel");
            return (Criteria) this;
        }

        public Criteria andBehIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("beh_is_del >=", value, "behIsDel");
            return (Criteria) this;
        }

        public Criteria andBehIsDelLessThan(Integer value) {
            addCriterion("beh_is_del <", value, "behIsDel");
            return (Criteria) this;
        }

        public Criteria andBehIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("beh_is_del <=", value, "behIsDel");
            return (Criteria) this;
        }

        public Criteria andBehIsDelIn(List<Integer> values) {
            addCriterion("beh_is_del in", values, "behIsDel");
            return (Criteria) this;
        }

        public Criteria andBehIsDelNotIn(List<Integer> values) {
            addCriterion("beh_is_del not in", values, "behIsDel");
            return (Criteria) this;
        }

        public Criteria andBehIsDelBetween(Integer value1, Integer value2) {
            addCriterion("beh_is_del between", value1, value2, "behIsDel");
            return (Criteria) this;
        }

        public Criteria andBehIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("beh_is_del not between", value1, value2, "behIsDel");
            return (Criteria) this;
        }

        public Criteria andBehCreateTimeIsNull() {
            addCriterion("beh_create_time is null");
            return (Criteria) this;
        }

        public Criteria andBehCreateTimeIsNotNull() {
            addCriterion("beh_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andBehCreateTimeEqualTo(Date value) {
            addCriterion("beh_create_time =", value, "behCreateTime");
            return (Criteria) this;
        }

        public Criteria andBehCreateTimeNotEqualTo(Date value) {
            addCriterion("beh_create_time <>", value, "behCreateTime");
            return (Criteria) this;
        }

        public Criteria andBehCreateTimeGreaterThan(Date value) {
            addCriterion("beh_create_time >", value, "behCreateTime");
            return (Criteria) this;
        }

        public Criteria andBehCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("beh_create_time >=", value, "behCreateTime");
            return (Criteria) this;
        }

        public Criteria andBehCreateTimeLessThan(Date value) {
            addCriterion("beh_create_time <", value, "behCreateTime");
            return (Criteria) this;
        }

        public Criteria andBehCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("beh_create_time <=", value, "behCreateTime");
            return (Criteria) this;
        }

        public Criteria andBehCreateTimeIn(List<Date> values) {
            addCriterion("beh_create_time in", values, "behCreateTime");
            return (Criteria) this;
        }

        public Criteria andBehCreateTimeNotIn(List<Date> values) {
            addCriterion("beh_create_time not in", values, "behCreateTime");
            return (Criteria) this;
        }

        public Criteria andBehCreateTimeBetween(Date value1, Date value2) {
            addCriterion("beh_create_time between", value1, value2, "behCreateTime");
            return (Criteria) this;
        }

        public Criteria andBehCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("beh_create_time not between", value1, value2, "behCreateTime");
            return (Criteria) this;
        }

        public Criteria andBehUpdateTimeIsNull() {
            addCriterion("beh_update_time is null");
            return (Criteria) this;
        }

        public Criteria andBehUpdateTimeIsNotNull() {
            addCriterion("beh_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andBehUpdateTimeEqualTo(Date value) {
            addCriterion("beh_update_time =", value, "behUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBehUpdateTimeNotEqualTo(Date value) {
            addCriterion("beh_update_time <>", value, "behUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBehUpdateTimeGreaterThan(Date value) {
            addCriterion("beh_update_time >", value, "behUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBehUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("beh_update_time >=", value, "behUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBehUpdateTimeLessThan(Date value) {
            addCriterion("beh_update_time <", value, "behUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBehUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("beh_update_time <=", value, "behUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBehUpdateTimeIn(List<Date> values) {
            addCriterion("beh_update_time in", values, "behUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBehUpdateTimeNotIn(List<Date> values) {
            addCriterion("beh_update_time not in", values, "behUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBehUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("beh_update_time between", value1, value2, "behUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBehUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("beh_update_time not between", value1, value2, "behUpdateTime");
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