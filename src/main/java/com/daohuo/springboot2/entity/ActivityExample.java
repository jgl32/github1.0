package com.daohuo.springboot2.entity;

import java.util.ArrayList;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andHIdIsNull() {
            addCriterion("h_id is null");
            return (Criteria) this;
        }

        public Criteria andHIdIsNotNull() {
            addCriterion("h_id is not null");
            return (Criteria) this;
        }

        public Criteria andHIdEqualTo(Integer value) {
            addCriterion("h_id =", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotEqualTo(Integer value) {
            addCriterion("h_id <>", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThan(Integer value) {
            addCriterion("h_id >", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_id >=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThan(Integer value) {
            addCriterion("h_id <", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThanOrEqualTo(Integer value) {
            addCriterion("h_id <=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdIn(List<Integer> values) {
            addCriterion("h_id in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotIn(List<Integer> values) {
            addCriterion("h_id not in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdBetween(Integer value1, Integer value2) {
            addCriterion("h_id between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotBetween(Integer value1, Integer value2) {
            addCriterion("h_id not between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHActivityNameIsNull() {
            addCriterion("h_activity_name is null");
            return (Criteria) this;
        }

        public Criteria andHActivityNameIsNotNull() {
            addCriterion("h_activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andHActivityNameEqualTo(String value) {
            addCriterion("h_activity_name =", value, "hActivityName");
            return (Criteria) this;
        }

        public Criteria andHActivityNameNotEqualTo(String value) {
            addCriterion("h_activity_name <>", value, "hActivityName");
            return (Criteria) this;
        }

        public Criteria andHActivityNameGreaterThan(String value) {
            addCriterion("h_activity_name >", value, "hActivityName");
            return (Criteria) this;
        }

        public Criteria andHActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("h_activity_name >=", value, "hActivityName");
            return (Criteria) this;
        }

        public Criteria andHActivityNameLessThan(String value) {
            addCriterion("h_activity_name <", value, "hActivityName");
            return (Criteria) this;
        }

        public Criteria andHActivityNameLessThanOrEqualTo(String value) {
            addCriterion("h_activity_name <=", value, "hActivityName");
            return (Criteria) this;
        }

        public Criteria andHActivityNameLike(String value) {
            addCriterion("h_activity_name like", value, "hActivityName");
            return (Criteria) this;
        }

        public Criteria andHActivityNameNotLike(String value) {
            addCriterion("h_activity_name not like", value, "hActivityName");
            return (Criteria) this;
        }

        public Criteria andHActivityNameIn(List<String> values) {
            addCriterion("h_activity_name in", values, "hActivityName");
            return (Criteria) this;
        }

        public Criteria andHActivityNameNotIn(List<String> values) {
            addCriterion("h_activity_name not in", values, "hActivityName");
            return (Criteria) this;
        }

        public Criteria andHActivityNameBetween(String value1, String value2) {
            addCriterion("h_activity_name between", value1, value2, "hActivityName");
            return (Criteria) this;
        }

        public Criteria andHActivityNameNotBetween(String value1, String value2) {
            addCriterion("h_activity_name not between", value1, value2, "hActivityName");
            return (Criteria) this;
        }

        public Criteria andHContentIsNull() {
            addCriterion("h_content is null");
            return (Criteria) this;
        }

        public Criteria andHContentIsNotNull() {
            addCriterion("h_content is not null");
            return (Criteria) this;
        }

        public Criteria andHContentEqualTo(String value) {
            addCriterion("h_content =", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentNotEqualTo(String value) {
            addCriterion("h_content <>", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentGreaterThan(String value) {
            addCriterion("h_content >", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentGreaterThanOrEqualTo(String value) {
            addCriterion("h_content >=", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentLessThan(String value) {
            addCriterion("h_content <", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentLessThanOrEqualTo(String value) {
            addCriterion("h_content <=", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentLike(String value) {
            addCriterion("h_content like", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentNotLike(String value) {
            addCriterion("h_content not like", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentIn(List<String> values) {
            addCriterion("h_content in", values, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentNotIn(List<String> values) {
            addCriterion("h_content not in", values, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentBetween(String value1, String value2) {
            addCriterion("h_content between", value1, value2, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentNotBetween(String value1, String value2) {
            addCriterion("h_content not between", value1, value2, "hContent");
            return (Criteria) this;
        }

        public Criteria andHPictureIsNull() {
            addCriterion("h_picture is null");
            return (Criteria) this;
        }

        public Criteria andHPictureIsNotNull() {
            addCriterion("h_picture is not null");
            return (Criteria) this;
        }

        public Criteria andHPictureEqualTo(String value) {
            addCriterion("h_picture =", value, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureNotEqualTo(String value) {
            addCriterion("h_picture <>", value, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureGreaterThan(String value) {
            addCriterion("h_picture >", value, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureGreaterThanOrEqualTo(String value) {
            addCriterion("h_picture >=", value, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureLessThan(String value) {
            addCriterion("h_picture <", value, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureLessThanOrEqualTo(String value) {
            addCriterion("h_picture <=", value, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureLike(String value) {
            addCriterion("h_picture like", value, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureNotLike(String value) {
            addCriterion("h_picture not like", value, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureIn(List<String> values) {
            addCriterion("h_picture in", values, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureNotIn(List<String> values) {
            addCriterion("h_picture not in", values, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureBetween(String value1, String value2) {
            addCriterion("h_picture between", value1, value2, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHPictureNotBetween(String value1, String value2) {
            addCriterion("h_picture not between", value1, value2, "hPicture");
            return (Criteria) this;
        }

        public Criteria andHActivityCityIsNull() {
            addCriterion("h_activity_city is null");
            return (Criteria) this;
        }

        public Criteria andHActivityCityIsNotNull() {
            addCriterion("h_activity_city is not null");
            return (Criteria) this;
        }

        public Criteria andHActivityCityEqualTo(String value) {
            addCriterion("h_activity_city =", value, "hActivityCity");
            return (Criteria) this;
        }

        public Criteria andHActivityCityNotEqualTo(String value) {
            addCriterion("h_activity_city <>", value, "hActivityCity");
            return (Criteria) this;
        }

        public Criteria andHActivityCityGreaterThan(String value) {
            addCriterion("h_activity_city >", value, "hActivityCity");
            return (Criteria) this;
        }

        public Criteria andHActivityCityGreaterThanOrEqualTo(String value) {
            addCriterion("h_activity_city >=", value, "hActivityCity");
            return (Criteria) this;
        }

        public Criteria andHActivityCityLessThan(String value) {
            addCriterion("h_activity_city <", value, "hActivityCity");
            return (Criteria) this;
        }

        public Criteria andHActivityCityLessThanOrEqualTo(String value) {
            addCriterion("h_activity_city <=", value, "hActivityCity");
            return (Criteria) this;
        }

        public Criteria andHActivityCityLike(String value) {
            addCriterion("h_activity_city like", value, "hActivityCity");
            return (Criteria) this;
        }

        public Criteria andHActivityCityNotLike(String value) {
            addCriterion("h_activity_city not like", value, "hActivityCity");
            return (Criteria) this;
        }

        public Criteria andHActivityCityIn(List<String> values) {
            addCriterion("h_activity_city in", values, "hActivityCity");
            return (Criteria) this;
        }

        public Criteria andHActivityCityNotIn(List<String> values) {
            addCriterion("h_activity_city not in", values, "hActivityCity");
            return (Criteria) this;
        }

        public Criteria andHActivityCityBetween(String value1, String value2) {
            addCriterion("h_activity_city between", value1, value2, "hActivityCity");
            return (Criteria) this;
        }

        public Criteria andHActivityCityNotBetween(String value1, String value2) {
            addCriterion("h_activity_city not between", value1, value2, "hActivityCity");
            return (Criteria) this;
        }

        public Criteria andHActivityAddressIsNull() {
            addCriterion("h_activity_address is null");
            return (Criteria) this;
        }

        public Criteria andHActivityAddressIsNotNull() {
            addCriterion("h_activity_address is not null");
            return (Criteria) this;
        }

        public Criteria andHActivityAddressEqualTo(String value) {
            addCriterion("h_activity_address =", value, "hActivityAddress");
            return (Criteria) this;
        }

        public Criteria andHActivityAddressNotEqualTo(String value) {
            addCriterion("h_activity_address <>", value, "hActivityAddress");
            return (Criteria) this;
        }

        public Criteria andHActivityAddressGreaterThan(String value) {
            addCriterion("h_activity_address >", value, "hActivityAddress");
            return (Criteria) this;
        }

        public Criteria andHActivityAddressGreaterThanOrEqualTo(String value) {
            addCriterion("h_activity_address >=", value, "hActivityAddress");
            return (Criteria) this;
        }

        public Criteria andHActivityAddressLessThan(String value) {
            addCriterion("h_activity_address <", value, "hActivityAddress");
            return (Criteria) this;
        }

        public Criteria andHActivityAddressLessThanOrEqualTo(String value) {
            addCriterion("h_activity_address <=", value, "hActivityAddress");
            return (Criteria) this;
        }

        public Criteria andHActivityAddressLike(String value) {
            addCriterion("h_activity_address like", value, "hActivityAddress");
            return (Criteria) this;
        }

        public Criteria andHActivityAddressNotLike(String value) {
            addCriterion("h_activity_address not like", value, "hActivityAddress");
            return (Criteria) this;
        }

        public Criteria andHActivityAddressIn(List<String> values) {
            addCriterion("h_activity_address in", values, "hActivityAddress");
            return (Criteria) this;
        }

        public Criteria andHActivityAddressNotIn(List<String> values) {
            addCriterion("h_activity_address not in", values, "hActivityAddress");
            return (Criteria) this;
        }

        public Criteria andHActivityAddressBetween(String value1, String value2) {
            addCriterion("h_activity_address between", value1, value2, "hActivityAddress");
            return (Criteria) this;
        }

        public Criteria andHActivityAddressNotBetween(String value1, String value2) {
            addCriterion("h_activity_address not between", value1, value2, "hActivityAddress");
            return (Criteria) this;
        }

        public Criteria andHActivityDestinationIsNull() {
            addCriterion("h_activity_destination is null");
            return (Criteria) this;
        }

        public Criteria andHActivityDestinationIsNotNull() {
            addCriterion("h_activity_destination is not null");
            return (Criteria) this;
        }

        public Criteria andHActivityDestinationEqualTo(String value) {
            addCriterion("h_activity_destination =", value, "hActivityDestination");
            return (Criteria) this;
        }

        public Criteria andHActivityDestinationNotEqualTo(String value) {
            addCriterion("h_activity_destination <>", value, "hActivityDestination");
            return (Criteria) this;
        }

        public Criteria andHActivityDestinationGreaterThan(String value) {
            addCriterion("h_activity_destination >", value, "hActivityDestination");
            return (Criteria) this;
        }

        public Criteria andHActivityDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("h_activity_destination >=", value, "hActivityDestination");
            return (Criteria) this;
        }

        public Criteria andHActivityDestinationLessThan(String value) {
            addCriterion("h_activity_destination <", value, "hActivityDestination");
            return (Criteria) this;
        }

        public Criteria andHActivityDestinationLessThanOrEqualTo(String value) {
            addCriterion("h_activity_destination <=", value, "hActivityDestination");
            return (Criteria) this;
        }

        public Criteria andHActivityDestinationLike(String value) {
            addCriterion("h_activity_destination like", value, "hActivityDestination");
            return (Criteria) this;
        }

        public Criteria andHActivityDestinationNotLike(String value) {
            addCriterion("h_activity_destination not like", value, "hActivityDestination");
            return (Criteria) this;
        }

        public Criteria andHActivityDestinationIn(List<String> values) {
            addCriterion("h_activity_destination in", values, "hActivityDestination");
            return (Criteria) this;
        }

        public Criteria andHActivityDestinationNotIn(List<String> values) {
            addCriterion("h_activity_destination not in", values, "hActivityDestination");
            return (Criteria) this;
        }

        public Criteria andHActivityDestinationBetween(String value1, String value2) {
            addCriterion("h_activity_destination between", value1, value2, "hActivityDestination");
            return (Criteria) this;
        }

        public Criteria andHActivityDestinationNotBetween(String value1, String value2) {
            addCriterion("h_activity_destination not between", value1, value2, "hActivityDestination");
            return (Criteria) this;
        }

        public Criteria andHActivityStimeIsNull() {
            addCriterion("h_activity_sTime is null");
            return (Criteria) this;
        }

        public Criteria andHActivityStimeIsNotNull() {
            addCriterion("h_activity_sTime is not null");
            return (Criteria) this;
        }

        public Criteria andHActivityStimeEqualTo(String value) {
            addCriterion("h_activity_sTime =", value, "hActivityStime");
            return (Criteria) this;
        }

        public Criteria andHActivityStimeNotEqualTo(String value) {
            addCriterion("h_activity_sTime <>", value, "hActivityStime");
            return (Criteria) this;
        }

        public Criteria andHActivityStimeGreaterThan(String value) {
            addCriterion("h_activity_sTime >", value, "hActivityStime");
            return (Criteria) this;
        }

        public Criteria andHActivityStimeGreaterThanOrEqualTo(String value) {
            addCriterion("h_activity_sTime >=", value, "hActivityStime");
            return (Criteria) this;
        }

        public Criteria andHActivityStimeLessThan(String value) {
            addCriterion("h_activity_sTime <", value, "hActivityStime");
            return (Criteria) this;
        }

        public Criteria andHActivityStimeLessThanOrEqualTo(String value) {
            addCriterion("h_activity_sTime <=", value, "hActivityStime");
            return (Criteria) this;
        }

        public Criteria andHActivityStimeLike(String value) {
            addCriterion("h_activity_sTime like", value, "hActivityStime");
            return (Criteria) this;
        }

        public Criteria andHActivityStimeNotLike(String value) {
            addCriterion("h_activity_sTime not like", value, "hActivityStime");
            return (Criteria) this;
        }

        public Criteria andHActivityStimeIn(List<String> values) {
            addCriterion("h_activity_sTime in", values, "hActivityStime");
            return (Criteria) this;
        }

        public Criteria andHActivityStimeNotIn(List<String> values) {
            addCriterion("h_activity_sTime not in", values, "hActivityStime");
            return (Criteria) this;
        }

        public Criteria andHActivityStimeBetween(String value1, String value2) {
            addCriterion("h_activity_sTime between", value1, value2, "hActivityStime");
            return (Criteria) this;
        }

        public Criteria andHActivityStimeNotBetween(String value1, String value2) {
            addCriterion("h_activity_sTime not between", value1, value2, "hActivityStime");
            return (Criteria) this;
        }

        public Criteria andHActivityEtimeIsNull() {
            addCriterion("h_activity_eTime is null");
            return (Criteria) this;
        }

        public Criteria andHActivityEtimeIsNotNull() {
            addCriterion("h_activity_eTime is not null");
            return (Criteria) this;
        }

        public Criteria andHActivityEtimeEqualTo(String value) {
            addCriterion("h_activity_eTime =", value, "hActivityEtime");
            return (Criteria) this;
        }

        public Criteria andHActivityEtimeNotEqualTo(String value) {
            addCriterion("h_activity_eTime <>", value, "hActivityEtime");
            return (Criteria) this;
        }

        public Criteria andHActivityEtimeGreaterThan(String value) {
            addCriterion("h_activity_eTime >", value, "hActivityEtime");
            return (Criteria) this;
        }

        public Criteria andHActivityEtimeGreaterThanOrEqualTo(String value) {
            addCriterion("h_activity_eTime >=", value, "hActivityEtime");
            return (Criteria) this;
        }

        public Criteria andHActivityEtimeLessThan(String value) {
            addCriterion("h_activity_eTime <", value, "hActivityEtime");
            return (Criteria) this;
        }

        public Criteria andHActivityEtimeLessThanOrEqualTo(String value) {
            addCriterion("h_activity_eTime <=", value, "hActivityEtime");
            return (Criteria) this;
        }

        public Criteria andHActivityEtimeLike(String value) {
            addCriterion("h_activity_eTime like", value, "hActivityEtime");
            return (Criteria) this;
        }

        public Criteria andHActivityEtimeNotLike(String value) {
            addCriterion("h_activity_eTime not like", value, "hActivityEtime");
            return (Criteria) this;
        }

        public Criteria andHActivityEtimeIn(List<String> values) {
            addCriterion("h_activity_eTime in", values, "hActivityEtime");
            return (Criteria) this;
        }

        public Criteria andHActivityEtimeNotIn(List<String> values) {
            addCriterion("h_activity_eTime not in", values, "hActivityEtime");
            return (Criteria) this;
        }

        public Criteria andHActivityEtimeBetween(String value1, String value2) {
            addCriterion("h_activity_eTime between", value1, value2, "hActivityEtime");
            return (Criteria) this;
        }

        public Criteria andHActivityEtimeNotBetween(String value1, String value2) {
            addCriterion("h_activity_eTime not between", value1, value2, "hActivityEtime");
            return (Criteria) this;
        }

        public Criteria andHActivityWeekIsNull() {
            addCriterion("h_activity_week is null");
            return (Criteria) this;
        }

        public Criteria andHActivityWeekIsNotNull() {
            addCriterion("h_activity_week is not null");
            return (Criteria) this;
        }

        public Criteria andHActivityWeekEqualTo(String value) {
            addCriterion("h_activity_week =", value, "hActivityWeek");
            return (Criteria) this;
        }

        public Criteria andHActivityWeekNotEqualTo(String value) {
            addCriterion("h_activity_week <>", value, "hActivityWeek");
            return (Criteria) this;
        }

        public Criteria andHActivityWeekGreaterThan(String value) {
            addCriterion("h_activity_week >", value, "hActivityWeek");
            return (Criteria) this;
        }

        public Criteria andHActivityWeekGreaterThanOrEqualTo(String value) {
            addCriterion("h_activity_week >=", value, "hActivityWeek");
            return (Criteria) this;
        }

        public Criteria andHActivityWeekLessThan(String value) {
            addCriterion("h_activity_week <", value, "hActivityWeek");
            return (Criteria) this;
        }

        public Criteria andHActivityWeekLessThanOrEqualTo(String value) {
            addCriterion("h_activity_week <=", value, "hActivityWeek");
            return (Criteria) this;
        }

        public Criteria andHActivityWeekLike(String value) {
            addCriterion("h_activity_week like", value, "hActivityWeek");
            return (Criteria) this;
        }

        public Criteria andHActivityWeekNotLike(String value) {
            addCriterion("h_activity_week not like", value, "hActivityWeek");
            return (Criteria) this;
        }

        public Criteria andHActivityWeekIn(List<String> values) {
            addCriterion("h_activity_week in", values, "hActivityWeek");
            return (Criteria) this;
        }

        public Criteria andHActivityWeekNotIn(List<String> values) {
            addCriterion("h_activity_week not in", values, "hActivityWeek");
            return (Criteria) this;
        }

        public Criteria andHActivityWeekBetween(String value1, String value2) {
            addCriterion("h_activity_week between", value1, value2, "hActivityWeek");
            return (Criteria) this;
        }

        public Criteria andHActivityWeekNotBetween(String value1, String value2) {
            addCriterion("h_activity_week not between", value1, value2, "hActivityWeek");
            return (Criteria) this;
        }

        public Criteria andHActivitySdateIsNull() {
            addCriterion("h_activity_sDate is null");
            return (Criteria) this;
        }

        public Criteria andHActivitySdateIsNotNull() {
            addCriterion("h_activity_sDate is not null");
            return (Criteria) this;
        }

        public Criteria andHActivitySdateEqualTo(String value) {
            addCriterion("h_activity_sDate =", value, "hActivitySdate");
            return (Criteria) this;
        }

        public Criteria andHActivitySdateNotEqualTo(String value) {
            addCriterion("h_activity_sDate <>", value, "hActivitySdate");
            return (Criteria) this;
        }

        public Criteria andHActivitySdateGreaterThan(String value) {
            addCriterion("h_activity_sDate >", value, "hActivitySdate");
            return (Criteria) this;
        }

        public Criteria andHActivitySdateGreaterThanOrEqualTo(String value) {
            addCriterion("h_activity_sDate >=", value, "hActivitySdate");
            return (Criteria) this;
        }

        public Criteria andHActivitySdateLessThan(String value) {
            addCriterion("h_activity_sDate <", value, "hActivitySdate");
            return (Criteria) this;
        }

        public Criteria andHActivitySdateLessThanOrEqualTo(String value) {
            addCriterion("h_activity_sDate <=", value, "hActivitySdate");
            return (Criteria) this;
        }

        public Criteria andHActivitySdateLike(String value) {
            addCriterion("h_activity_sDate like", value, "hActivitySdate");
            return (Criteria) this;
        }

        public Criteria andHActivitySdateNotLike(String value) {
            addCriterion("h_activity_sDate not like", value, "hActivitySdate");
            return (Criteria) this;
        }

        public Criteria andHActivitySdateIn(List<String> values) {
            addCriterion("h_activity_sDate in", values, "hActivitySdate");
            return (Criteria) this;
        }

        public Criteria andHActivitySdateNotIn(List<String> values) {
            addCriterion("h_activity_sDate not in", values, "hActivitySdate");
            return (Criteria) this;
        }

        public Criteria andHActivitySdateBetween(String value1, String value2) {
            addCriterion("h_activity_sDate between", value1, value2, "hActivitySdate");
            return (Criteria) this;
        }

        public Criteria andHActivitySdateNotBetween(String value1, String value2) {
            addCriterion("h_activity_sDate not between", value1, value2, "hActivitySdate");
            return (Criteria) this;
        }

        public Criteria andHActivityEdateIsNull() {
            addCriterion("h_activity_eDate is null");
            return (Criteria) this;
        }

        public Criteria andHActivityEdateIsNotNull() {
            addCriterion("h_activity_eDate is not null");
            return (Criteria) this;
        }

        public Criteria andHActivityEdateEqualTo(String value) {
            addCriterion("h_activity_eDate =", value, "hActivityEdate");
            return (Criteria) this;
        }

        public Criteria andHActivityEdateNotEqualTo(String value) {
            addCriterion("h_activity_eDate <>", value, "hActivityEdate");
            return (Criteria) this;
        }

        public Criteria andHActivityEdateGreaterThan(String value) {
            addCriterion("h_activity_eDate >", value, "hActivityEdate");
            return (Criteria) this;
        }

        public Criteria andHActivityEdateGreaterThanOrEqualTo(String value) {
            addCriterion("h_activity_eDate >=", value, "hActivityEdate");
            return (Criteria) this;
        }

        public Criteria andHActivityEdateLessThan(String value) {
            addCriterion("h_activity_eDate <", value, "hActivityEdate");
            return (Criteria) this;
        }

        public Criteria andHActivityEdateLessThanOrEqualTo(String value) {
            addCriterion("h_activity_eDate <=", value, "hActivityEdate");
            return (Criteria) this;
        }

        public Criteria andHActivityEdateLike(String value) {
            addCriterion("h_activity_eDate like", value, "hActivityEdate");
            return (Criteria) this;
        }

        public Criteria andHActivityEdateNotLike(String value) {
            addCriterion("h_activity_eDate not like", value, "hActivityEdate");
            return (Criteria) this;
        }

        public Criteria andHActivityEdateIn(List<String> values) {
            addCriterion("h_activity_eDate in", values, "hActivityEdate");
            return (Criteria) this;
        }

        public Criteria andHActivityEdateNotIn(List<String> values) {
            addCriterion("h_activity_eDate not in", values, "hActivityEdate");
            return (Criteria) this;
        }

        public Criteria andHActivityEdateBetween(String value1, String value2) {
            addCriterion("h_activity_eDate between", value1, value2, "hActivityEdate");
            return (Criteria) this;
        }

        public Criteria andHActivityEdateNotBetween(String value1, String value2) {
            addCriterion("h_activity_eDate not between", value1, value2, "hActivityEdate");
            return (Criteria) this;
        }

        public Criteria andHActivityPlaceIsNull() {
            addCriterion("h_activity_place is null");
            return (Criteria) this;
        }

        public Criteria andHActivityPlaceIsNotNull() {
            addCriterion("h_activity_place is not null");
            return (Criteria) this;
        }

        public Criteria andHActivityPlaceEqualTo(String value) {
            addCriterion("h_activity_place =", value, "hActivityPlace");
            return (Criteria) this;
        }

        public Criteria andHActivityPlaceNotEqualTo(String value) {
            addCriterion("h_activity_place <>", value, "hActivityPlace");
            return (Criteria) this;
        }

        public Criteria andHActivityPlaceGreaterThan(String value) {
            addCriterion("h_activity_place >", value, "hActivityPlace");
            return (Criteria) this;
        }

        public Criteria andHActivityPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("h_activity_place >=", value, "hActivityPlace");
            return (Criteria) this;
        }

        public Criteria andHActivityPlaceLessThan(String value) {
            addCriterion("h_activity_place <", value, "hActivityPlace");
            return (Criteria) this;
        }

        public Criteria andHActivityPlaceLessThanOrEqualTo(String value) {
            addCriterion("h_activity_place <=", value, "hActivityPlace");
            return (Criteria) this;
        }

        public Criteria andHActivityPlaceLike(String value) {
            addCriterion("h_activity_place like", value, "hActivityPlace");
            return (Criteria) this;
        }

        public Criteria andHActivityPlaceNotLike(String value) {
            addCriterion("h_activity_place not like", value, "hActivityPlace");
            return (Criteria) this;
        }

        public Criteria andHActivityPlaceIn(List<String> values) {
            addCriterion("h_activity_place in", values, "hActivityPlace");
            return (Criteria) this;
        }

        public Criteria andHActivityPlaceNotIn(List<String> values) {
            addCriterion("h_activity_place not in", values, "hActivityPlace");
            return (Criteria) this;
        }

        public Criteria andHActivityPlaceBetween(String value1, String value2) {
            addCriterion("h_activity_place between", value1, value2, "hActivityPlace");
            return (Criteria) this;
        }

        public Criteria andHActivityPlaceNotBetween(String value1, String value2) {
            addCriterion("h_activity_place not between", value1, value2, "hActivityPlace");
            return (Criteria) this;
        }

        public Criteria andHLatitudeIsNull() {
            addCriterion("h_latitude is null");
            return (Criteria) this;
        }

        public Criteria andHLatitudeIsNotNull() {
            addCriterion("h_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andHLatitudeEqualTo(Double value) {
            addCriterion("h_latitude =", value, "hLatitude");
            return (Criteria) this;
        }

        public Criteria andHLatitudeNotEqualTo(Double value) {
            addCriterion("h_latitude <>", value, "hLatitude");
            return (Criteria) this;
        }

        public Criteria andHLatitudeGreaterThan(Double value) {
            addCriterion("h_latitude >", value, "hLatitude");
            return (Criteria) this;
        }

        public Criteria andHLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("h_latitude >=", value, "hLatitude");
            return (Criteria) this;
        }

        public Criteria andHLatitudeLessThan(Double value) {
            addCriterion("h_latitude <", value, "hLatitude");
            return (Criteria) this;
        }

        public Criteria andHLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("h_latitude <=", value, "hLatitude");
            return (Criteria) this;
        }

        public Criteria andHLatitudeIn(List<Double> values) {
            addCriterion("h_latitude in", values, "hLatitude");
            return (Criteria) this;
        }

        public Criteria andHLatitudeNotIn(List<Double> values) {
            addCriterion("h_latitude not in", values, "hLatitude");
            return (Criteria) this;
        }

        public Criteria andHLatitudeBetween(Double value1, Double value2) {
            addCriterion("h_latitude between", value1, value2, "hLatitude");
            return (Criteria) this;
        }

        public Criteria andHLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("h_latitude not between", value1, value2, "hLatitude");
            return (Criteria) this;
        }

        public Criteria andHLongitudeIsNull() {
            addCriterion("h_longitude is null");
            return (Criteria) this;
        }

        public Criteria andHLongitudeIsNotNull() {
            addCriterion("h_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andHLongitudeEqualTo(Double value) {
            addCriterion("h_longitude =", value, "hLongitude");
            return (Criteria) this;
        }

        public Criteria andHLongitudeNotEqualTo(Double value) {
            addCriterion("h_longitude <>", value, "hLongitude");
            return (Criteria) this;
        }

        public Criteria andHLongitudeGreaterThan(Double value) {
            addCriterion("h_longitude >", value, "hLongitude");
            return (Criteria) this;
        }

        public Criteria andHLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("h_longitude >=", value, "hLongitude");
            return (Criteria) this;
        }

        public Criteria andHLongitudeLessThan(Double value) {
            addCriterion("h_longitude <", value, "hLongitude");
            return (Criteria) this;
        }

        public Criteria andHLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("h_longitude <=", value, "hLongitude");
            return (Criteria) this;
        }

        public Criteria andHLongitudeIn(List<Double> values) {
            addCriterion("h_longitude in", values, "hLongitude");
            return (Criteria) this;
        }

        public Criteria andHLongitudeNotIn(List<Double> values) {
            addCriterion("h_longitude not in", values, "hLongitude");
            return (Criteria) this;
        }

        public Criteria andHLongitudeBetween(Double value1, Double value2) {
            addCriterion("h_longitude between", value1, value2, "hLongitude");
            return (Criteria) this;
        }

        public Criteria andHLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("h_longitude not between", value1, value2, "hLongitude");
            return (Criteria) this;
        }

        public Criteria andHCircuitlistCountIsNull() {
            addCriterion("h_circuitList_count is null");
            return (Criteria) this;
        }

        public Criteria andHCircuitlistCountIsNotNull() {
            addCriterion("h_circuitList_count is not null");
            return (Criteria) this;
        }

        public Criteria andHCircuitlistCountEqualTo(String value) {
            addCriterion("h_circuitList_count =", value, "hCircuitlistCount");
            return (Criteria) this;
        }

        public Criteria andHCircuitlistCountNotEqualTo(String value) {
            addCriterion("h_circuitList_count <>", value, "hCircuitlistCount");
            return (Criteria) this;
        }

        public Criteria andHCircuitlistCountGreaterThan(String value) {
            addCriterion("h_circuitList_count >", value, "hCircuitlistCount");
            return (Criteria) this;
        }

        public Criteria andHCircuitlistCountGreaterThanOrEqualTo(String value) {
            addCriterion("h_circuitList_count >=", value, "hCircuitlistCount");
            return (Criteria) this;
        }

        public Criteria andHCircuitlistCountLessThan(String value) {
            addCriterion("h_circuitList_count <", value, "hCircuitlistCount");
            return (Criteria) this;
        }

        public Criteria andHCircuitlistCountLessThanOrEqualTo(String value) {
            addCriterion("h_circuitList_count <=", value, "hCircuitlistCount");
            return (Criteria) this;
        }

        public Criteria andHCircuitlistCountLike(String value) {
            addCriterion("h_circuitList_count like", value, "hCircuitlistCount");
            return (Criteria) this;
        }

        public Criteria andHCircuitlistCountNotLike(String value) {
            addCriterion("h_circuitList_count not like", value, "hCircuitlistCount");
            return (Criteria) this;
        }

        public Criteria andHCircuitlistCountIn(List<String> values) {
            addCriterion("h_circuitList_count in", values, "hCircuitlistCount");
            return (Criteria) this;
        }

        public Criteria andHCircuitlistCountNotIn(List<String> values) {
            addCriterion("h_circuitList_count not in", values, "hCircuitlistCount");
            return (Criteria) this;
        }

        public Criteria andHCircuitlistCountBetween(String value1, String value2) {
            addCriterion("h_circuitList_count between", value1, value2, "hCircuitlistCount");
            return (Criteria) this;
        }

        public Criteria andHCircuitlistCountNotBetween(String value1, String value2) {
            addCriterion("h_circuitList_count not between", value1, value2, "hCircuitlistCount");
            return (Criteria) this;
        }

        public Criteria andHButtJointIsNull() {
            addCriterion("h_butt_joint is null");
            return (Criteria) this;
        }

        public Criteria andHButtJointIsNotNull() {
            addCriterion("h_butt_joint is not null");
            return (Criteria) this;
        }

        public Criteria andHButtJointEqualTo(Integer value) {
            addCriterion("h_butt_joint =", value, "hButtJoint");
            return (Criteria) this;
        }

        public Criteria andHButtJointNotEqualTo(Integer value) {
            addCriterion("h_butt_joint <>", value, "hButtJoint");
            return (Criteria) this;
        }

        public Criteria andHButtJointGreaterThan(Integer value) {
            addCriterion("h_butt_joint >", value, "hButtJoint");
            return (Criteria) this;
        }

        public Criteria andHButtJointGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_butt_joint >=", value, "hButtJoint");
            return (Criteria) this;
        }

        public Criteria andHButtJointLessThan(Integer value) {
            addCriterion("h_butt_joint <", value, "hButtJoint");
            return (Criteria) this;
        }

        public Criteria andHButtJointLessThanOrEqualTo(Integer value) {
            addCriterion("h_butt_joint <=", value, "hButtJoint");
            return (Criteria) this;
        }

        public Criteria andHButtJointIn(List<Integer> values) {
            addCriterion("h_butt_joint in", values, "hButtJoint");
            return (Criteria) this;
        }

        public Criteria andHButtJointNotIn(List<Integer> values) {
            addCriterion("h_butt_joint not in", values, "hButtJoint");
            return (Criteria) this;
        }

        public Criteria andHButtJointBetween(Integer value1, Integer value2) {
            addCriterion("h_butt_joint between", value1, value2, "hButtJoint");
            return (Criteria) this;
        }

        public Criteria andHButtJointNotBetween(Integer value1, Integer value2) {
            addCriterion("h_butt_joint not between", value1, value2, "hButtJoint");
            return (Criteria) this;
        }

        public Criteria andHInteractionIsNull() {
            addCriterion("h_interaction is null");
            return (Criteria) this;
        }

        public Criteria andHInteractionIsNotNull() {
            addCriterion("h_interaction is not null");
            return (Criteria) this;
        }

        public Criteria andHInteractionEqualTo(Integer value) {
            addCriterion("h_interaction =", value, "hInteraction");
            return (Criteria) this;
        }

        public Criteria andHInteractionNotEqualTo(Integer value) {
            addCriterion("h_interaction <>", value, "hInteraction");
            return (Criteria) this;
        }

        public Criteria andHInteractionGreaterThan(Integer value) {
            addCriterion("h_interaction >", value, "hInteraction");
            return (Criteria) this;
        }

        public Criteria andHInteractionGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_interaction >=", value, "hInteraction");
            return (Criteria) this;
        }

        public Criteria andHInteractionLessThan(Integer value) {
            addCriterion("h_interaction <", value, "hInteraction");
            return (Criteria) this;
        }

        public Criteria andHInteractionLessThanOrEqualTo(Integer value) {
            addCriterion("h_interaction <=", value, "hInteraction");
            return (Criteria) this;
        }

        public Criteria andHInteractionIn(List<Integer> values) {
            addCriterion("h_interaction in", values, "hInteraction");
            return (Criteria) this;
        }

        public Criteria andHInteractionNotIn(List<Integer> values) {
            addCriterion("h_interaction not in", values, "hInteraction");
            return (Criteria) this;
        }

        public Criteria andHInteractionBetween(Integer value1, Integer value2) {
            addCriterion("h_interaction between", value1, value2, "hInteraction");
            return (Criteria) this;
        }

        public Criteria andHInteractionNotBetween(Integer value1, Integer value2) {
            addCriterion("h_interaction not between", value1, value2, "hInteraction");
            return (Criteria) this;
        }

        public Criteria andHAttendPeopleCountIsNull() {
            addCriterion("h_attend_people_count is null");
            return (Criteria) this;
        }

        public Criteria andHAttendPeopleCountIsNotNull() {
            addCriterion("h_attend_people_count is not null");
            return (Criteria) this;
        }

        public Criteria andHAttendPeopleCountEqualTo(Integer value) {
            addCriterion("h_attend_people_count =", value, "hAttendPeopleCount");
            return (Criteria) this;
        }

        public Criteria andHAttendPeopleCountNotEqualTo(Integer value) {
            addCriterion("h_attend_people_count <>", value, "hAttendPeopleCount");
            return (Criteria) this;
        }

        public Criteria andHAttendPeopleCountGreaterThan(Integer value) {
            addCriterion("h_attend_people_count >", value, "hAttendPeopleCount");
            return (Criteria) this;
        }

        public Criteria andHAttendPeopleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_attend_people_count >=", value, "hAttendPeopleCount");
            return (Criteria) this;
        }

        public Criteria andHAttendPeopleCountLessThan(Integer value) {
            addCriterion("h_attend_people_count <", value, "hAttendPeopleCount");
            return (Criteria) this;
        }

        public Criteria andHAttendPeopleCountLessThanOrEqualTo(Integer value) {
            addCriterion("h_attend_people_count <=", value, "hAttendPeopleCount");
            return (Criteria) this;
        }

        public Criteria andHAttendPeopleCountIn(List<Integer> values) {
            addCriterion("h_attend_people_count in", values, "hAttendPeopleCount");
            return (Criteria) this;
        }

        public Criteria andHAttendPeopleCountNotIn(List<Integer> values) {
            addCriterion("h_attend_people_count not in", values, "hAttendPeopleCount");
            return (Criteria) this;
        }

        public Criteria andHAttendPeopleCountBetween(Integer value1, Integer value2) {
            addCriterion("h_attend_people_count between", value1, value2, "hAttendPeopleCount");
            return (Criteria) this;
        }

        public Criteria andHAttendPeopleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("h_attend_people_count not between", value1, value2, "hAttendPeopleCount");
            return (Criteria) this;
        }

        public Criteria andHMaxPeopleIsNull() {
            addCriterion("h_max_people is null");
            return (Criteria) this;
        }

        public Criteria andHMaxPeopleIsNotNull() {
            addCriterion("h_max_people is not null");
            return (Criteria) this;
        }

        public Criteria andHMaxPeopleEqualTo(Integer value) {
            addCriterion("h_max_people =", value, "hMaxPeople");
            return (Criteria) this;
        }

        public Criteria andHMaxPeopleNotEqualTo(Integer value) {
            addCriterion("h_max_people <>", value, "hMaxPeople");
            return (Criteria) this;
        }

        public Criteria andHMaxPeopleGreaterThan(Integer value) {
            addCriterion("h_max_people >", value, "hMaxPeople");
            return (Criteria) this;
        }

        public Criteria andHMaxPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_max_people >=", value, "hMaxPeople");
            return (Criteria) this;
        }

        public Criteria andHMaxPeopleLessThan(Integer value) {
            addCriterion("h_max_people <", value, "hMaxPeople");
            return (Criteria) this;
        }

        public Criteria andHMaxPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("h_max_people <=", value, "hMaxPeople");
            return (Criteria) this;
        }

        public Criteria andHMaxPeopleIn(List<Integer> values) {
            addCriterion("h_max_people in", values, "hMaxPeople");
            return (Criteria) this;
        }

        public Criteria andHMaxPeopleNotIn(List<Integer> values) {
            addCriterion("h_max_people not in", values, "hMaxPeople");
            return (Criteria) this;
        }

        public Criteria andHMaxPeopleBetween(Integer value1, Integer value2) {
            addCriterion("h_max_people between", value1, value2, "hMaxPeople");
            return (Criteria) this;
        }

        public Criteria andHMaxPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("h_max_people not between", value1, value2, "hMaxPeople");
            return (Criteria) this;
        }

        public Criteria andHConscientiousIsNull() {
            addCriterion("h_conscientious is null");
            return (Criteria) this;
        }

        public Criteria andHConscientiousIsNotNull() {
            addCriterion("h_conscientious is not null");
            return (Criteria) this;
        }

        public Criteria andHConscientiousEqualTo(String value) {
            addCriterion("h_conscientious =", value, "hConscientious");
            return (Criteria) this;
        }

        public Criteria andHConscientiousNotEqualTo(String value) {
            addCriterion("h_conscientious <>", value, "hConscientious");
            return (Criteria) this;
        }

        public Criteria andHConscientiousGreaterThan(String value) {
            addCriterion("h_conscientious >", value, "hConscientious");
            return (Criteria) this;
        }

        public Criteria andHConscientiousGreaterThanOrEqualTo(String value) {
            addCriterion("h_conscientious >=", value, "hConscientious");
            return (Criteria) this;
        }

        public Criteria andHConscientiousLessThan(String value) {
            addCriterion("h_conscientious <", value, "hConscientious");
            return (Criteria) this;
        }

        public Criteria andHConscientiousLessThanOrEqualTo(String value) {
            addCriterion("h_conscientious <=", value, "hConscientious");
            return (Criteria) this;
        }

        public Criteria andHConscientiousLike(String value) {
            addCriterion("h_conscientious like", value, "hConscientious");
            return (Criteria) this;
        }

        public Criteria andHConscientiousNotLike(String value) {
            addCriterion("h_conscientious not like", value, "hConscientious");
            return (Criteria) this;
        }

        public Criteria andHConscientiousIn(List<String> values) {
            addCriterion("h_conscientious in", values, "hConscientious");
            return (Criteria) this;
        }

        public Criteria andHConscientiousNotIn(List<String> values) {
            addCriterion("h_conscientious not in", values, "hConscientious");
            return (Criteria) this;
        }

        public Criteria andHConscientiousBetween(String value1, String value2) {
            addCriterion("h_conscientious between", value1, value2, "hConscientious");
            return (Criteria) this;
        }

        public Criteria andHConscientiousNotBetween(String value1, String value2) {
            addCriterion("h_conscientious not between", value1, value2, "hConscientious");
            return (Criteria) this;
        }

        public Criteria andCardUuidIsNull() {
            addCriterion("card_uuid is null");
            return (Criteria) this;
        }

        public Criteria andCardUuidIsNotNull() {
            addCriterion("card_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andCardUuidEqualTo(String value) {
            addCriterion("card_uuid =", value, "cardUuid");
            return (Criteria) this;
        }

        public Criteria andCardUuidNotEqualTo(String value) {
            addCriterion("card_uuid <>", value, "cardUuid");
            return (Criteria) this;
        }

        public Criteria andCardUuidGreaterThan(String value) {
            addCriterion("card_uuid >", value, "cardUuid");
            return (Criteria) this;
        }

        public Criteria andCardUuidGreaterThanOrEqualTo(String value) {
            addCriterion("card_uuid >=", value, "cardUuid");
            return (Criteria) this;
        }

        public Criteria andCardUuidLessThan(String value) {
            addCriterion("card_uuid <", value, "cardUuid");
            return (Criteria) this;
        }

        public Criteria andCardUuidLessThanOrEqualTo(String value) {
            addCriterion("card_uuid <=", value, "cardUuid");
            return (Criteria) this;
        }

        public Criteria andCardUuidLike(String value) {
            addCriterion("card_uuid like", value, "cardUuid");
            return (Criteria) this;
        }

        public Criteria andCardUuidNotLike(String value) {
            addCriterion("card_uuid not like", value, "cardUuid");
            return (Criteria) this;
        }

        public Criteria andCardUuidIn(List<String> values) {
            addCriterion("card_uuid in", values, "cardUuid");
            return (Criteria) this;
        }

        public Criteria andCardUuidNotIn(List<String> values) {
            addCriterion("card_uuid not in", values, "cardUuid");
            return (Criteria) this;
        }

        public Criteria andCardUuidBetween(String value1, String value2) {
            addCriterion("card_uuid between", value1, value2, "cardUuid");
            return (Criteria) this;
        }

        public Criteria andCardUuidNotBetween(String value1, String value2) {
            addCriterion("card_uuid not between", value1, value2, "cardUuid");
            return (Criteria) this;
        }

        public Criteria andHOrganizerIsNull() {
            addCriterion("h_organizer is null");
            return (Criteria) this;
        }

        public Criteria andHOrganizerIsNotNull() {
            addCriterion("h_organizer is not null");
            return (Criteria) this;
        }

        public Criteria andHOrganizerEqualTo(String value) {
            addCriterion("h_organizer =", value, "hOrganizer");
            return (Criteria) this;
        }

        public Criteria andHOrganizerNotEqualTo(String value) {
            addCriterion("h_organizer <>", value, "hOrganizer");
            return (Criteria) this;
        }

        public Criteria andHOrganizerGreaterThan(String value) {
            addCriterion("h_organizer >", value, "hOrganizer");
            return (Criteria) this;
        }

        public Criteria andHOrganizerGreaterThanOrEqualTo(String value) {
            addCriterion("h_organizer >=", value, "hOrganizer");
            return (Criteria) this;
        }

        public Criteria andHOrganizerLessThan(String value) {
            addCriterion("h_organizer <", value, "hOrganizer");
            return (Criteria) this;
        }

        public Criteria andHOrganizerLessThanOrEqualTo(String value) {
            addCriterion("h_organizer <=", value, "hOrganizer");
            return (Criteria) this;
        }

        public Criteria andHOrganizerLike(String value) {
            addCriterion("h_organizer like", value, "hOrganizer");
            return (Criteria) this;
        }

        public Criteria andHOrganizerNotLike(String value) {
            addCriterion("h_organizer not like", value, "hOrganizer");
            return (Criteria) this;
        }

        public Criteria andHOrganizerIn(List<String> values) {
            addCriterion("h_organizer in", values, "hOrganizer");
            return (Criteria) this;
        }

        public Criteria andHOrganizerNotIn(List<String> values) {
            addCriterion("h_organizer not in", values, "hOrganizer");
            return (Criteria) this;
        }

        public Criteria andHOrganizerBetween(String value1, String value2) {
            addCriterion("h_organizer between", value1, value2, "hOrganizer");
            return (Criteria) this;
        }

        public Criteria andHOrganizerNotBetween(String value1, String value2) {
            addCriterion("h_organizer not between", value1, value2, "hOrganizer");
            return (Criteria) this;
        }

        public Criteria andHContactwayIsNull() {
            addCriterion("h_contactway is null");
            return (Criteria) this;
        }

        public Criteria andHContactwayIsNotNull() {
            addCriterion("h_contactway is not null");
            return (Criteria) this;
        }

        public Criteria andHContactwayEqualTo(String value) {
            addCriterion("h_contactway =", value, "hContactway");
            return (Criteria) this;
        }

        public Criteria andHContactwayNotEqualTo(String value) {
            addCriterion("h_contactway <>", value, "hContactway");
            return (Criteria) this;
        }

        public Criteria andHContactwayGreaterThan(String value) {
            addCriterion("h_contactway >", value, "hContactway");
            return (Criteria) this;
        }

        public Criteria andHContactwayGreaterThanOrEqualTo(String value) {
            addCriterion("h_contactway >=", value, "hContactway");
            return (Criteria) this;
        }

        public Criteria andHContactwayLessThan(String value) {
            addCriterion("h_contactway <", value, "hContactway");
            return (Criteria) this;
        }

        public Criteria andHContactwayLessThanOrEqualTo(String value) {
            addCriterion("h_contactway <=", value, "hContactway");
            return (Criteria) this;
        }

        public Criteria andHContactwayLike(String value) {
            addCriterion("h_contactway like", value, "hContactway");
            return (Criteria) this;
        }

        public Criteria andHContactwayNotLike(String value) {
            addCriterion("h_contactway not like", value, "hContactway");
            return (Criteria) this;
        }

        public Criteria andHContactwayIn(List<String> values) {
            addCriterion("h_contactway in", values, "hContactway");
            return (Criteria) this;
        }

        public Criteria andHContactwayNotIn(List<String> values) {
            addCriterion("h_contactway not in", values, "hContactway");
            return (Criteria) this;
        }

        public Criteria andHContactwayBetween(String value1, String value2) {
            addCriterion("h_contactway between", value1, value2, "hContactway");
            return (Criteria) this;
        }

        public Criteria andHContactwayNotBetween(String value1, String value2) {
            addCriterion("h_contactway not between", value1, value2, "hContactway");
            return (Criteria) this;
        }

        public Criteria andHCtimeIsNull() {
            addCriterion("h_cTime is null");
            return (Criteria) this;
        }

        public Criteria andHCtimeIsNotNull() {
            addCriterion("h_cTime is not null");
            return (Criteria) this;
        }

        public Criteria andHCtimeEqualTo(String value) {
            addCriterion("h_cTime =", value, "hCtime");
            return (Criteria) this;
        }

        public Criteria andHCtimeNotEqualTo(String value) {
            addCriterion("h_cTime <>", value, "hCtime");
            return (Criteria) this;
        }

        public Criteria andHCtimeGreaterThan(String value) {
            addCriterion("h_cTime >", value, "hCtime");
            return (Criteria) this;
        }

        public Criteria andHCtimeGreaterThanOrEqualTo(String value) {
            addCriterion("h_cTime >=", value, "hCtime");
            return (Criteria) this;
        }

        public Criteria andHCtimeLessThan(String value) {
            addCriterion("h_cTime <", value, "hCtime");
            return (Criteria) this;
        }

        public Criteria andHCtimeLessThanOrEqualTo(String value) {
            addCriterion("h_cTime <=", value, "hCtime");
            return (Criteria) this;
        }

        public Criteria andHCtimeLike(String value) {
            addCriterion("h_cTime like", value, "hCtime");
            return (Criteria) this;
        }

        public Criteria andHCtimeNotLike(String value) {
            addCriterion("h_cTime not like", value, "hCtime");
            return (Criteria) this;
        }

        public Criteria andHCtimeIn(List<String> values) {
            addCriterion("h_cTime in", values, "hCtime");
            return (Criteria) this;
        }

        public Criteria andHCtimeNotIn(List<String> values) {
            addCriterion("h_cTime not in", values, "hCtime");
            return (Criteria) this;
        }

        public Criteria andHCtimeBetween(String value1, String value2) {
            addCriterion("h_cTime between", value1, value2, "hCtime");
            return (Criteria) this;
        }

        public Criteria andHCtimeNotBetween(String value1, String value2) {
            addCriterion("h_cTime not between", value1, value2, "hCtime");
            return (Criteria) this;
        }

        public Criteria andHMtimeIsNull() {
            addCriterion("h_mTime is null");
            return (Criteria) this;
        }

        public Criteria andHMtimeIsNotNull() {
            addCriterion("h_mTime is not null");
            return (Criteria) this;
        }

        public Criteria andHMtimeEqualTo(String value) {
            addCriterion("h_mTime =", value, "hMtime");
            return (Criteria) this;
        }

        public Criteria andHMtimeNotEqualTo(String value) {
            addCriterion("h_mTime <>", value, "hMtime");
            return (Criteria) this;
        }

        public Criteria andHMtimeGreaterThan(String value) {
            addCriterion("h_mTime >", value, "hMtime");
            return (Criteria) this;
        }

        public Criteria andHMtimeGreaterThanOrEqualTo(String value) {
            addCriterion("h_mTime >=", value, "hMtime");
            return (Criteria) this;
        }

        public Criteria andHMtimeLessThan(String value) {
            addCriterion("h_mTime <", value, "hMtime");
            return (Criteria) this;
        }

        public Criteria andHMtimeLessThanOrEqualTo(String value) {
            addCriterion("h_mTime <=", value, "hMtime");
            return (Criteria) this;
        }

        public Criteria andHMtimeLike(String value) {
            addCriterion("h_mTime like", value, "hMtime");
            return (Criteria) this;
        }

        public Criteria andHMtimeNotLike(String value) {
            addCriterion("h_mTime not like", value, "hMtime");
            return (Criteria) this;
        }

        public Criteria andHMtimeIn(List<String> values) {
            addCriterion("h_mTime in", values, "hMtime");
            return (Criteria) this;
        }

        public Criteria andHMtimeNotIn(List<String> values) {
            addCriterion("h_mTime not in", values, "hMtime");
            return (Criteria) this;
        }

        public Criteria andHMtimeBetween(String value1, String value2) {
            addCriterion("h_mTime between", value1, value2, "hMtime");
            return (Criteria) this;
        }

        public Criteria andHMtimeNotBetween(String value1, String value2) {
            addCriterion("h_mTime not between", value1, value2, "hMtime");
            return (Criteria) this;
        }

        public Criteria andHStatusIsNull() {
            addCriterion("h_status is null");
            return (Criteria) this;
        }

        public Criteria andHStatusIsNotNull() {
            addCriterion("h_status is not null");
            return (Criteria) this;
        }

        public Criteria andHStatusEqualTo(Integer value) {
            addCriterion("h_status =", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusNotEqualTo(Integer value) {
            addCriterion("h_status <>", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusGreaterThan(Integer value) {
            addCriterion("h_status >", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_status >=", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusLessThan(Integer value) {
            addCriterion("h_status <", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusLessThanOrEqualTo(Integer value) {
            addCriterion("h_status <=", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusIn(List<Integer> values) {
            addCriterion("h_status in", values, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusNotIn(List<Integer> values) {
            addCriterion("h_status not in", values, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusBetween(Integer value1, Integer value2) {
            addCriterion("h_status between", value1, value2, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("h_status not between", value1, value2, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHRecoIsNull() {
            addCriterion("h_reco is null");
            return (Criteria) this;
        }

        public Criteria andHRecoIsNotNull() {
            addCriterion("h_reco is not null");
            return (Criteria) this;
        }

        public Criteria andHRecoEqualTo(Integer value) {
            addCriterion("h_reco =", value, "hReco");
            return (Criteria) this;
        }

        public Criteria andHRecoNotEqualTo(Integer value) {
            addCriterion("h_reco <>", value, "hReco");
            return (Criteria) this;
        }

        public Criteria andHRecoGreaterThan(Integer value) {
            addCriterion("h_reco >", value, "hReco");
            return (Criteria) this;
        }

        public Criteria andHRecoGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_reco >=", value, "hReco");
            return (Criteria) this;
        }

        public Criteria andHRecoLessThan(Integer value) {
            addCriterion("h_reco <", value, "hReco");
            return (Criteria) this;
        }

        public Criteria andHRecoLessThanOrEqualTo(Integer value) {
            addCriterion("h_reco <=", value, "hReco");
            return (Criteria) this;
        }

        public Criteria andHRecoIn(List<Integer> values) {
            addCriterion("h_reco in", values, "hReco");
            return (Criteria) this;
        }

        public Criteria andHRecoNotIn(List<Integer> values) {
            addCriterion("h_reco not in", values, "hReco");
            return (Criteria) this;
        }

        public Criteria andHRecoBetween(Integer value1, Integer value2) {
            addCriterion("h_reco between", value1, value2, "hReco");
            return (Criteria) this;
        }

        public Criteria andHRecoNotBetween(Integer value1, Integer value2) {
            addCriterion("h_reco not between", value1, value2, "hReco");
            return (Criteria) this;
        }

        public Criteria andHQrcodeIsNull() {
            addCriterion("h_QRCode is null");
            return (Criteria) this;
        }

        public Criteria andHQrcodeIsNotNull() {
            addCriterion("h_QRCode is not null");
            return (Criteria) this;
        }

        public Criteria andHQrcodeEqualTo(String value) {
            addCriterion("h_QRCode =", value, "hQrcode");
            return (Criteria) this;
        }

        public Criteria andHQrcodeNotEqualTo(String value) {
            addCriterion("h_QRCode <>", value, "hQrcode");
            return (Criteria) this;
        }

        public Criteria andHQrcodeGreaterThan(String value) {
            addCriterion("h_QRCode >", value, "hQrcode");
            return (Criteria) this;
        }

        public Criteria andHQrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("h_QRCode >=", value, "hQrcode");
            return (Criteria) this;
        }

        public Criteria andHQrcodeLessThan(String value) {
            addCriterion("h_QRCode <", value, "hQrcode");
            return (Criteria) this;
        }

        public Criteria andHQrcodeLessThanOrEqualTo(String value) {
            addCriterion("h_QRCode <=", value, "hQrcode");
            return (Criteria) this;
        }

        public Criteria andHQrcodeLike(String value) {
            addCriterion("h_QRCode like", value, "hQrcode");
            return (Criteria) this;
        }

        public Criteria andHQrcodeNotLike(String value) {
            addCriterion("h_QRCode not like", value, "hQrcode");
            return (Criteria) this;
        }

        public Criteria andHQrcodeIn(List<String> values) {
            addCriterion("h_QRCode in", values, "hQrcode");
            return (Criteria) this;
        }

        public Criteria andHQrcodeNotIn(List<String> values) {
            addCriterion("h_QRCode not in", values, "hQrcode");
            return (Criteria) this;
        }

        public Criteria andHQrcodeBetween(String value1, String value2) {
            addCriterion("h_QRCode between", value1, value2, "hQrcode");
            return (Criteria) this;
        }

        public Criteria andHQrcodeNotBetween(String value1, String value2) {
            addCriterion("h_QRCode not between", value1, value2, "hQrcode");
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