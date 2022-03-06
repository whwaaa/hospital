package com.kkb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andDIdIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdCarIsNull() {
            addCriterion("d_id_car is null");
            return (Criteria) this;
        }

        public Criteria andDIdCarIsNotNull() {
            addCriterion("d_id_car is not null");
            return (Criteria) this;
        }

        public Criteria andDIdCarEqualTo(String value) {
            addCriterion("d_id_car =", value, "dIdCar");
            return (Criteria) this;
        }

        public Criteria andDIdCarNotEqualTo(String value) {
            addCriterion("d_id_car <>", value, "dIdCar");
            return (Criteria) this;
        }

        public Criteria andDIdCarGreaterThan(String value) {
            addCriterion("d_id_car >", value, "dIdCar");
            return (Criteria) this;
        }

        public Criteria andDIdCarGreaterThanOrEqualTo(String value) {
            addCriterion("d_id_car >=", value, "dIdCar");
            return (Criteria) this;
        }

        public Criteria andDIdCarLessThan(String value) {
            addCriterion("d_id_car <", value, "dIdCar");
            return (Criteria) this;
        }

        public Criteria andDIdCarLessThanOrEqualTo(String value) {
            addCriterion("d_id_car <=", value, "dIdCar");
            return (Criteria) this;
        }

        public Criteria andDIdCarLike(String value) {
            addCriterion("d_id_car like", value, "dIdCar");
            return (Criteria) this;
        }

        public Criteria andDIdCarNotLike(String value) {
            addCriterion("d_id_car not like", value, "dIdCar");
            return (Criteria) this;
        }

        public Criteria andDIdCarIn(List<String> values) {
            addCriterion("d_id_car in", values, "dIdCar");
            return (Criteria) this;
        }

        public Criteria andDIdCarNotIn(List<String> values) {
            addCriterion("d_id_car not in", values, "dIdCar");
            return (Criteria) this;
        }

        public Criteria andDIdCarBetween(String value1, String value2) {
            addCriterion("d_id_car between", value1, value2, "dIdCar");
            return (Criteria) this;
        }

        public Criteria andDIdCarNotBetween(String value1, String value2) {
            addCriterion("d_id_car not between", value1, value2, "dIdCar");
            return (Criteria) this;
        }

        public Criteria andDPhoneIsNull() {
            addCriterion("d_phone is null");
            return (Criteria) this;
        }

        public Criteria andDPhoneIsNotNull() {
            addCriterion("d_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDPhoneEqualTo(String value) {
            addCriterion("d_phone =", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneNotEqualTo(String value) {
            addCriterion("d_phone <>", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneGreaterThan(String value) {
            addCriterion("d_phone >", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("d_phone >=", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneLessThan(String value) {
            addCriterion("d_phone <", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneLessThanOrEqualTo(String value) {
            addCriterion("d_phone <=", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneLike(String value) {
            addCriterion("d_phone like", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneNotLike(String value) {
            addCriterion("d_phone not like", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneIn(List<String> values) {
            addCriterion("d_phone in", values, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneNotIn(List<String> values) {
            addCriterion("d_phone not in", values, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneBetween(String value1, String value2) {
            addCriterion("d_phone between", value1, value2, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneNotBetween(String value1, String value2) {
            addCriterion("d_phone not between", value1, value2, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDTelphoneIsNull() {
            addCriterion("d_telphone is null");
            return (Criteria) this;
        }

        public Criteria andDTelphoneIsNotNull() {
            addCriterion("d_telphone is not null");
            return (Criteria) this;
        }

        public Criteria andDTelphoneEqualTo(String value) {
            addCriterion("d_telphone =", value, "dTelphone");
            return (Criteria) this;
        }

        public Criteria andDTelphoneNotEqualTo(String value) {
            addCriterion("d_telphone <>", value, "dTelphone");
            return (Criteria) this;
        }

        public Criteria andDTelphoneGreaterThan(String value) {
            addCriterion("d_telphone >", value, "dTelphone");
            return (Criteria) this;
        }

        public Criteria andDTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("d_telphone >=", value, "dTelphone");
            return (Criteria) this;
        }

        public Criteria andDTelphoneLessThan(String value) {
            addCriterion("d_telphone <", value, "dTelphone");
            return (Criteria) this;
        }

        public Criteria andDTelphoneLessThanOrEqualTo(String value) {
            addCriterion("d_telphone <=", value, "dTelphone");
            return (Criteria) this;
        }

        public Criteria andDTelphoneLike(String value) {
            addCriterion("d_telphone like", value, "dTelphone");
            return (Criteria) this;
        }

        public Criteria andDTelphoneNotLike(String value) {
            addCriterion("d_telphone not like", value, "dTelphone");
            return (Criteria) this;
        }

        public Criteria andDTelphoneIn(List<String> values) {
            addCriterion("d_telphone in", values, "dTelphone");
            return (Criteria) this;
        }

        public Criteria andDTelphoneNotIn(List<String> values) {
            addCriterion("d_telphone not in", values, "dTelphone");
            return (Criteria) this;
        }

        public Criteria andDTelphoneBetween(String value1, String value2) {
            addCriterion("d_telphone between", value1, value2, "dTelphone");
            return (Criteria) this;
        }

        public Criteria andDTelphoneNotBetween(String value1, String value2) {
            addCriterion("d_telphone not between", value1, value2, "dTelphone");
            return (Criteria) this;
        }

        public Criteria andDSexIsNull() {
            addCriterion("d_sex is null");
            return (Criteria) this;
        }

        public Criteria andDSexIsNotNull() {
            addCriterion("d_sex is not null");
            return (Criteria) this;
        }

        public Criteria andDSexEqualTo(Integer value) {
            addCriterion("d_sex =", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexNotEqualTo(Integer value) {
            addCriterion("d_sex <>", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexGreaterThan(Integer value) {
            addCriterion("d_sex >", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_sex >=", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexLessThan(Integer value) {
            addCriterion("d_sex <", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexLessThanOrEqualTo(Integer value) {
            addCriterion("d_sex <=", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexIn(List<Integer> values) {
            addCriterion("d_sex in", values, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexNotIn(List<Integer> values) {
            addCriterion("d_sex not in", values, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexBetween(Integer value1, Integer value2) {
            addCriterion("d_sex between", value1, value2, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexNotBetween(Integer value1, Integer value2) {
            addCriterion("d_sex not between", value1, value2, "dSex");
            return (Criteria) this;
        }

        public Criteria andDBirthdayIsNull() {
            addCriterion("d_birthday is null");
            return (Criteria) this;
        }

        public Criteria andDBirthdayIsNotNull() {
            addCriterion("d_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andDBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("d_birthday =", value, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("d_birthday <>", value, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("d_birthday >", value, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("d_birthday >=", value, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("d_birthday <", value, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("d_birthday <=", value, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("d_birthday in", values, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("d_birthday not in", values, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("d_birthday between", value1, value2, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("d_birthday not between", value1, value2, "dBirthday");
            return (Criteria) this;
        }

        public Criteria andDAgeIsNull() {
            addCriterion("d_age is null");
            return (Criteria) this;
        }

        public Criteria andDAgeIsNotNull() {
            addCriterion("d_age is not null");
            return (Criteria) this;
        }

        public Criteria andDAgeEqualTo(Integer value) {
            addCriterion("d_age =", value, "dAge");
            return (Criteria) this;
        }

        public Criteria andDAgeNotEqualTo(Integer value) {
            addCriterion("d_age <>", value, "dAge");
            return (Criteria) this;
        }

        public Criteria andDAgeGreaterThan(Integer value) {
            addCriterion("d_age >", value, "dAge");
            return (Criteria) this;
        }

        public Criteria andDAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_age >=", value, "dAge");
            return (Criteria) this;
        }

        public Criteria andDAgeLessThan(Integer value) {
            addCriterion("d_age <", value, "dAge");
            return (Criteria) this;
        }

        public Criteria andDAgeLessThanOrEqualTo(Integer value) {
            addCriterion("d_age <=", value, "dAge");
            return (Criteria) this;
        }

        public Criteria andDAgeIn(List<Integer> values) {
            addCriterion("d_age in", values, "dAge");
            return (Criteria) this;
        }

        public Criteria andDAgeNotIn(List<Integer> values) {
            addCriterion("d_age not in", values, "dAge");
            return (Criteria) this;
        }

        public Criteria andDAgeBetween(Integer value1, Integer value2) {
            addCriterion("d_age between", value1, value2, "dAge");
            return (Criteria) this;
        }

        public Criteria andDAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("d_age not between", value1, value2, "dAge");
            return (Criteria) this;
        }

        public Criteria andDEmailIsNull() {
            addCriterion("d_email is null");
            return (Criteria) this;
        }

        public Criteria andDEmailIsNotNull() {
            addCriterion("d_email is not null");
            return (Criteria) this;
        }

        public Criteria andDEmailEqualTo(String value) {
            addCriterion("d_email =", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailNotEqualTo(String value) {
            addCriterion("d_email <>", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailGreaterThan(String value) {
            addCriterion("d_email >", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailGreaterThanOrEqualTo(String value) {
            addCriterion("d_email >=", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailLessThan(String value) {
            addCriterion("d_email <", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailLessThanOrEqualTo(String value) {
            addCriterion("d_email <=", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailLike(String value) {
            addCriterion("d_email like", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailNotLike(String value) {
            addCriterion("d_email not like", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailIn(List<String> values) {
            addCriterion("d_email in", values, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailNotIn(List<String> values) {
            addCriterion("d_email not in", values, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailBetween(String value1, String value2) {
            addCriterion("d_email between", value1, value2, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailNotBetween(String value1, String value2) {
            addCriterion("d_email not between", value1, value2, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDKeshiIsNull() {
            addCriterion("d_keshi is null");
            return (Criteria) this;
        }

        public Criteria andDKeshiIsNotNull() {
            addCriterion("d_keshi is not null");
            return (Criteria) this;
        }

        public Criteria andDKeshiEqualTo(String value) {
            addCriterion("d_keshi =", value, "dKeshi");
            return (Criteria) this;
        }

        public Criteria andDKeshiNotEqualTo(String value) {
            addCriterion("d_keshi <>", value, "dKeshi");
            return (Criteria) this;
        }

        public Criteria andDKeshiGreaterThan(String value) {
            addCriterion("d_keshi >", value, "dKeshi");
            return (Criteria) this;
        }

        public Criteria andDKeshiGreaterThanOrEqualTo(String value) {
            addCriterion("d_keshi >=", value, "dKeshi");
            return (Criteria) this;
        }

        public Criteria andDKeshiLessThan(String value) {
            addCriterion("d_keshi <", value, "dKeshi");
            return (Criteria) this;
        }

        public Criteria andDKeshiLessThanOrEqualTo(String value) {
            addCriterion("d_keshi <=", value, "dKeshi");
            return (Criteria) this;
        }

        public Criteria andDKeshiLike(String value) {
            addCriterion("d_keshi like", value, "dKeshi");
            return (Criteria) this;
        }

        public Criteria andDKeshiNotLike(String value) {
            addCriterion("d_keshi not like", value, "dKeshi");
            return (Criteria) this;
        }

        public Criteria andDKeshiIn(List<String> values) {
            addCriterion("d_keshi in", values, "dKeshi");
            return (Criteria) this;
        }

        public Criteria andDKeshiNotIn(List<String> values) {
            addCriterion("d_keshi not in", values, "dKeshi");
            return (Criteria) this;
        }

        public Criteria andDKeshiBetween(String value1, String value2) {
            addCriterion("d_keshi between", value1, value2, "dKeshi");
            return (Criteria) this;
        }

        public Criteria andDKeshiNotBetween(String value1, String value2) {
            addCriterion("d_keshi not between", value1, value2, "dKeshi");
            return (Criteria) this;
        }

        public Criteria andDXueliIsNull() {
            addCriterion("d_xueli is null");
            return (Criteria) this;
        }

        public Criteria andDXueliIsNotNull() {
            addCriterion("d_xueli is not null");
            return (Criteria) this;
        }

        public Criteria andDXueliEqualTo(String value) {
            addCriterion("d_xueli =", value, "dXueli");
            return (Criteria) this;
        }

        public Criteria andDXueliNotEqualTo(String value) {
            addCriterion("d_xueli <>", value, "dXueli");
            return (Criteria) this;
        }

        public Criteria andDXueliGreaterThan(String value) {
            addCriterion("d_xueli >", value, "dXueli");
            return (Criteria) this;
        }

        public Criteria andDXueliGreaterThanOrEqualTo(String value) {
            addCriterion("d_xueli >=", value, "dXueli");
            return (Criteria) this;
        }

        public Criteria andDXueliLessThan(String value) {
            addCriterion("d_xueli <", value, "dXueli");
            return (Criteria) this;
        }

        public Criteria andDXueliLessThanOrEqualTo(String value) {
            addCriterion("d_xueli <=", value, "dXueli");
            return (Criteria) this;
        }

        public Criteria andDXueliLike(String value) {
            addCriterion("d_xueli like", value, "dXueli");
            return (Criteria) this;
        }

        public Criteria andDXueliNotLike(String value) {
            addCriterion("d_xueli not like", value, "dXueli");
            return (Criteria) this;
        }

        public Criteria andDXueliIn(List<String> values) {
            addCriterion("d_xueli in", values, "dXueli");
            return (Criteria) this;
        }

        public Criteria andDXueliNotIn(List<String> values) {
            addCriterion("d_xueli not in", values, "dXueli");
            return (Criteria) this;
        }

        public Criteria andDXueliBetween(String value1, String value2) {
            addCriterion("d_xueli between", value1, value2, "dXueli");
            return (Criteria) this;
        }

        public Criteria andDXueliNotBetween(String value1, String value2) {
            addCriterion("d_xueli not between", value1, value2, "dXueli");
            return (Criteria) this;
        }

        public Criteria andDDescIsNull() {
            addCriterion("d_desc is null");
            return (Criteria) this;
        }

        public Criteria andDDescIsNotNull() {
            addCriterion("d_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDDescEqualTo(String value) {
            addCriterion("d_desc =", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotEqualTo(String value) {
            addCriterion("d_desc <>", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescGreaterThan(String value) {
            addCriterion("d_desc >", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescGreaterThanOrEqualTo(String value) {
            addCriterion("d_desc >=", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescLessThan(String value) {
            addCriterion("d_desc <", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescLessThanOrEqualTo(String value) {
            addCriterion("d_desc <=", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescLike(String value) {
            addCriterion("d_desc like", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotLike(String value) {
            addCriterion("d_desc not like", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescIn(List<String> values) {
            addCriterion("d_desc in", values, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotIn(List<String> values) {
            addCriterion("d_desc not in", values, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescBetween(String value1, String value2) {
            addCriterion("d_desc between", value1, value2, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotBetween(String value1, String value2) {
            addCriterion("d_desc not between", value1, value2, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDIntimeIsNull() {
            addCriterion("d_intime is null");
            return (Criteria) this;
        }

        public Criteria andDIntimeIsNotNull() {
            addCriterion("d_intime is not null");
            return (Criteria) this;
        }

        public Criteria andDIntimeEqualTo(Date value) {
            addCriterionForJDBCDate("d_intime =", value, "dIntime");
            return (Criteria) this;
        }

        public Criteria andDIntimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("d_intime <>", value, "dIntime");
            return (Criteria) this;
        }

        public Criteria andDIntimeGreaterThan(Date value) {
            addCriterionForJDBCDate("d_intime >", value, "dIntime");
            return (Criteria) this;
        }

        public Criteria andDIntimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("d_intime >=", value, "dIntime");
            return (Criteria) this;
        }

        public Criteria andDIntimeLessThan(Date value) {
            addCriterionForJDBCDate("d_intime <", value, "dIntime");
            return (Criteria) this;
        }

        public Criteria andDIntimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("d_intime <=", value, "dIntime");
            return (Criteria) this;
        }

        public Criteria andDIntimeIn(List<Date> values) {
            addCriterionForJDBCDate("d_intime in", values, "dIntime");
            return (Criteria) this;
        }

        public Criteria andDIntimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("d_intime not in", values, "dIntime");
            return (Criteria) this;
        }

        public Criteria andDIntimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("d_intime between", value1, value2, "dIntime");
            return (Criteria) this;
        }

        public Criteria andDIntimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("d_intime not between", value1, value2, "dIntime");
            return (Criteria) this;
        }

        public Criteria andDStateIsNull() {
            addCriterion("d_state is null");
            return (Criteria) this;
        }

        public Criteria andDStateIsNotNull() {
            addCriterion("d_state is not null");
            return (Criteria) this;
        }

        public Criteria andDStateEqualTo(Integer value) {
            addCriterion("d_state =", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateNotEqualTo(Integer value) {
            addCriterion("d_state <>", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateGreaterThan(Integer value) {
            addCriterion("d_state >", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_state >=", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateLessThan(Integer value) {
            addCriterion("d_state <", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateLessThanOrEqualTo(Integer value) {
            addCriterion("d_state <=", value, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateIn(List<Integer> values) {
            addCriterion("d_state in", values, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateNotIn(List<Integer> values) {
            addCriterion("d_state not in", values, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateBetween(Integer value1, Integer value2) {
            addCriterion("d_state between", value1, value2, "dState");
            return (Criteria) this;
        }

        public Criteria andDStateNotBetween(Integer value1, Integer value2) {
            addCriterion("d_state not between", value1, value2, "dState");
            return (Criteria) this;
        }

        public Criteria andDIsDelIsNull() {
            addCriterion("d_is_del is null");
            return (Criteria) this;
        }

        public Criteria andDIsDelIsNotNull() {
            addCriterion("d_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andDIsDelEqualTo(Integer value) {
            addCriterion("d_is_del =", value, "dIsDel");
            return (Criteria) this;
        }

        public Criteria andDIsDelNotEqualTo(Integer value) {
            addCriterion("d_is_del <>", value, "dIsDel");
            return (Criteria) this;
        }

        public Criteria andDIsDelGreaterThan(Integer value) {
            addCriterion("d_is_del >", value, "dIsDel");
            return (Criteria) this;
        }

        public Criteria andDIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_is_del >=", value, "dIsDel");
            return (Criteria) this;
        }

        public Criteria andDIsDelLessThan(Integer value) {
            addCriterion("d_is_del <", value, "dIsDel");
            return (Criteria) this;
        }

        public Criteria andDIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("d_is_del <=", value, "dIsDel");
            return (Criteria) this;
        }

        public Criteria andDIsDelIn(List<Integer> values) {
            addCriterion("d_is_del in", values, "dIsDel");
            return (Criteria) this;
        }

        public Criteria andDIsDelNotIn(List<Integer> values) {
            addCriterion("d_is_del not in", values, "dIsDel");
            return (Criteria) this;
        }

        public Criteria andDIsDelBetween(Integer value1, Integer value2) {
            addCriterion("d_is_del between", value1, value2, "dIsDel");
            return (Criteria) this;
        }

        public Criteria andDIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("d_is_del not between", value1, value2, "dIsDel");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeIsNull() {
            addCriterion("d_create_time is null");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeIsNotNull() {
            addCriterion("d_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeEqualTo(Date value) {
            addCriterion("d_create_time =", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeNotEqualTo(Date value) {
            addCriterion("d_create_time <>", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeGreaterThan(Date value) {
            addCriterion("d_create_time >", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("d_create_time >=", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeLessThan(Date value) {
            addCriterion("d_create_time <", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("d_create_time <=", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeIn(List<Date> values) {
            addCriterion("d_create_time in", values, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeNotIn(List<Date> values) {
            addCriterion("d_create_time not in", values, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeBetween(Date value1, Date value2) {
            addCriterion("d_create_time between", value1, value2, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("d_create_time not between", value1, value2, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeIsNull() {
            addCriterion("d_update_time is null");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeIsNotNull() {
            addCriterion("d_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeEqualTo(Date value) {
            addCriterion("d_update_time =", value, "dUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeNotEqualTo(Date value) {
            addCriterion("d_update_time <>", value, "dUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeGreaterThan(Date value) {
            addCriterion("d_update_time >", value, "dUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("d_update_time >=", value, "dUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeLessThan(Date value) {
            addCriterion("d_update_time <", value, "dUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("d_update_time <=", value, "dUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeIn(List<Date> values) {
            addCriterion("d_update_time in", values, "dUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeNotIn(List<Date> values) {
            addCriterion("d_update_time not in", values, "dUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("d_update_time between", value1, value2, "dUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("d_update_time not between", value1, value2, "dUpdateTime");
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