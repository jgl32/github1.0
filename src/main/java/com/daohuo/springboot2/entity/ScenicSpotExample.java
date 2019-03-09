package com.daohuo.springboot2.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScenicSpotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicSpotExample() {
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

        public Criteria andSsIdIsNull() {
            addCriterion("ss_id is null");
            return (Criteria) this;
        }

        public Criteria andSsIdIsNotNull() {
            addCriterion("ss_id is not null");
            return (Criteria) this;
        }

        public Criteria andSsIdEqualTo(Integer value) {
            addCriterion("ss_id =", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotEqualTo(Integer value) {
            addCriterion("ss_id <>", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdGreaterThan(Integer value) {
            addCriterion("ss_id >", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ss_id >=", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdLessThan(Integer value) {
            addCriterion("ss_id <", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ss_id <=", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdIn(List<Integer> values) {
            addCriterion("ss_id in", values, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotIn(List<Integer> values) {
            addCriterion("ss_id not in", values, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdBetween(Integer value1, Integer value2) {
            addCriterion("ss_id between", value1, value2, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ss_id not between", value1, value2, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsCategoryIsNull() {
            addCriterion("ss_category is null");
            return (Criteria) this;
        }

        public Criteria andSsCategoryIsNotNull() {
            addCriterion("ss_category is not null");
            return (Criteria) this;
        }

        public Criteria andSsCategoryEqualTo(String value) {
            addCriterion("ss_category =", value, "ssCategory");
            return (Criteria) this;
        }

        public Criteria andSsCategoryNotEqualTo(String value) {
            addCriterion("ss_category <>", value, "ssCategory");
            return (Criteria) this;
        }

        public Criteria andSsCategoryGreaterThan(String value) {
            addCriterion("ss_category >", value, "ssCategory");
            return (Criteria) this;
        }

        public Criteria andSsCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("ss_category >=", value, "ssCategory");
            return (Criteria) this;
        }

        public Criteria andSsCategoryLessThan(String value) {
            addCriterion("ss_category <", value, "ssCategory");
            return (Criteria) this;
        }

        public Criteria andSsCategoryLessThanOrEqualTo(String value) {
            addCriterion("ss_category <=", value, "ssCategory");
            return (Criteria) this;
        }

        public Criteria andSsCategoryLike(String value) {
            addCriterion("ss_category like", value, "ssCategory");
            return (Criteria) this;
        }

        public Criteria andSsCategoryNotLike(String value) {
            addCriterion("ss_category not like", value, "ssCategory");
            return (Criteria) this;
        }

        public Criteria andSsCategoryIn(List<String> values) {
            addCriterion("ss_category in", values, "ssCategory");
            return (Criteria) this;
        }

        public Criteria andSsCategoryNotIn(List<String> values) {
            addCriterion("ss_category not in", values, "ssCategory");
            return (Criteria) this;
        }

        public Criteria andSsCategoryBetween(String value1, String value2) {
            addCriterion("ss_category between", value1, value2, "ssCategory");
            return (Criteria) this;
        }

        public Criteria andSsCategoryNotBetween(String value1, String value2) {
            addCriterion("ss_category not between", value1, value2, "ssCategory");
            return (Criteria) this;
        }

        public Criteria andSsLevelIsNull() {
            addCriterion("ss_level is null");
            return (Criteria) this;
        }

        public Criteria andSsLevelIsNotNull() {
            addCriterion("ss_level is not null");
            return (Criteria) this;
        }

        public Criteria andSsLevelEqualTo(String value) {
            addCriterion("ss_level =", value, "ssLevel");
            return (Criteria) this;
        }

        public Criteria andSsLevelNotEqualTo(String value) {
            addCriterion("ss_level <>", value, "ssLevel");
            return (Criteria) this;
        }

        public Criteria andSsLevelGreaterThan(String value) {
            addCriterion("ss_level >", value, "ssLevel");
            return (Criteria) this;
        }

        public Criteria andSsLevelGreaterThanOrEqualTo(String value) {
            addCriterion("ss_level >=", value, "ssLevel");
            return (Criteria) this;
        }

        public Criteria andSsLevelLessThan(String value) {
            addCriterion("ss_level <", value, "ssLevel");
            return (Criteria) this;
        }

        public Criteria andSsLevelLessThanOrEqualTo(String value) {
            addCriterion("ss_level <=", value, "ssLevel");
            return (Criteria) this;
        }

        public Criteria andSsLevelLike(String value) {
            addCriterion("ss_level like", value, "ssLevel");
            return (Criteria) this;
        }

        public Criteria andSsLevelNotLike(String value) {
            addCriterion("ss_level not like", value, "ssLevel");
            return (Criteria) this;
        }

        public Criteria andSsLevelIn(List<String> values) {
            addCriterion("ss_level in", values, "ssLevel");
            return (Criteria) this;
        }

        public Criteria andSsLevelNotIn(List<String> values) {
            addCriterion("ss_level not in", values, "ssLevel");
            return (Criteria) this;
        }

        public Criteria andSsLevelBetween(String value1, String value2) {
            addCriterion("ss_level between", value1, value2, "ssLevel");
            return (Criteria) this;
        }

        public Criteria andSsLevelNotBetween(String value1, String value2) {
            addCriterion("ss_level not between", value1, value2, "ssLevel");
            return (Criteria) this;
        }

        public Criteria andSsUOpenidIsNull() {
            addCriterion("ss_u_openid is null");
            return (Criteria) this;
        }

        public Criteria andSsUOpenidIsNotNull() {
            addCriterion("ss_u_openid is not null");
            return (Criteria) this;
        }

        public Criteria andSsUOpenidEqualTo(String value) {
            addCriterion("ss_u_openid =", value, "ssUOpenid");
            return (Criteria) this;
        }

        public Criteria andSsUOpenidNotEqualTo(String value) {
            addCriterion("ss_u_openid <>", value, "ssUOpenid");
            return (Criteria) this;
        }

        public Criteria andSsUOpenidGreaterThan(String value) {
            addCriterion("ss_u_openid >", value, "ssUOpenid");
            return (Criteria) this;
        }

        public Criteria andSsUOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("ss_u_openid >=", value, "ssUOpenid");
            return (Criteria) this;
        }

        public Criteria andSsUOpenidLessThan(String value) {
            addCriterion("ss_u_openid <", value, "ssUOpenid");
            return (Criteria) this;
        }

        public Criteria andSsUOpenidLessThanOrEqualTo(String value) {
            addCriterion("ss_u_openid <=", value, "ssUOpenid");
            return (Criteria) this;
        }

        public Criteria andSsUOpenidLike(String value) {
            addCriterion("ss_u_openid like", value, "ssUOpenid");
            return (Criteria) this;
        }

        public Criteria andSsUOpenidNotLike(String value) {
            addCriterion("ss_u_openid not like", value, "ssUOpenid");
            return (Criteria) this;
        }

        public Criteria andSsUOpenidIn(List<String> values) {
            addCriterion("ss_u_openid in", values, "ssUOpenid");
            return (Criteria) this;
        }

        public Criteria andSsUOpenidNotIn(List<String> values) {
            addCriterion("ss_u_openid not in", values, "ssUOpenid");
            return (Criteria) this;
        }

        public Criteria andSsUOpenidBetween(String value1, String value2) {
            addCriterion("ss_u_openid between", value1, value2, "ssUOpenid");
            return (Criteria) this;
        }

        public Criteria andSsUOpenidNotBetween(String value1, String value2) {
            addCriterion("ss_u_openid not between", value1, value2, "ssUOpenid");
            return (Criteria) this;
        }

        public Criteria andSsCityIsNull() {
            addCriterion("ss_city is null");
            return (Criteria) this;
        }

        public Criteria andSsCityIsNotNull() {
            addCriterion("ss_city is not null");
            return (Criteria) this;
        }

        public Criteria andSsCityEqualTo(String value) {
            addCriterion("ss_city =", value, "ssCity");
            return (Criteria) this;
        }

        public Criteria andSsCityNotEqualTo(String value) {
            addCriterion("ss_city <>", value, "ssCity");
            return (Criteria) this;
        }

        public Criteria andSsCityGreaterThan(String value) {
            addCriterion("ss_city >", value, "ssCity");
            return (Criteria) this;
        }

        public Criteria andSsCityGreaterThanOrEqualTo(String value) {
            addCriterion("ss_city >=", value, "ssCity");
            return (Criteria) this;
        }

        public Criteria andSsCityLessThan(String value) {
            addCriterion("ss_city <", value, "ssCity");
            return (Criteria) this;
        }

        public Criteria andSsCityLessThanOrEqualTo(String value) {
            addCriterion("ss_city <=", value, "ssCity");
            return (Criteria) this;
        }

        public Criteria andSsCityLike(String value) {
            addCriterion("ss_city like", value, "ssCity");
            return (Criteria) this;
        }

        public Criteria andSsCityNotLike(String value) {
            addCriterion("ss_city not like", value, "ssCity");
            return (Criteria) this;
        }

        public Criteria andSsCityIn(List<String> values) {
            addCriterion("ss_city in", values, "ssCity");
            return (Criteria) this;
        }

        public Criteria andSsCityNotIn(List<String> values) {
            addCriterion("ss_city not in", values, "ssCity");
            return (Criteria) this;
        }

        public Criteria andSsCityBetween(String value1, String value2) {
            addCriterion("ss_city between", value1, value2, "ssCity");
            return (Criteria) this;
        }

        public Criteria andSsCityNotBetween(String value1, String value2) {
            addCriterion("ss_city not between", value1, value2, "ssCity");
            return (Criteria) this;
        }

        public Criteria andSsTitleIsNull() {
            addCriterion("ss_title is null");
            return (Criteria) this;
        }

        public Criteria andSsTitleIsNotNull() {
            addCriterion("ss_title is not null");
            return (Criteria) this;
        }

        public Criteria andSsTitleEqualTo(String value) {
            addCriterion("ss_title =", value, "ssTitle");
            return (Criteria) this;
        }

        public Criteria andSsTitleNotEqualTo(String value) {
            addCriterion("ss_title <>", value, "ssTitle");
            return (Criteria) this;
        }

        public Criteria andSsTitleGreaterThan(String value) {
            addCriterion("ss_title >", value, "ssTitle");
            return (Criteria) this;
        }

        public Criteria andSsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("ss_title >=", value, "ssTitle");
            return (Criteria) this;
        }

        public Criteria andSsTitleLessThan(String value) {
            addCriterion("ss_title <", value, "ssTitle");
            return (Criteria) this;
        }

        public Criteria andSsTitleLessThanOrEqualTo(String value) {
            addCriterion("ss_title <=", value, "ssTitle");
            return (Criteria) this;
        }

        public Criteria andSsTitleLike(String value) {
            addCriterion("ss_title like", value, "ssTitle");
            return (Criteria) this;
        }

        public Criteria andSsTitleNotLike(String value) {
            addCriterion("ss_title not like", value, "ssTitle");
            return (Criteria) this;
        }

        public Criteria andSsTitleIn(List<String> values) {
            addCriterion("ss_title in", values, "ssTitle");
            return (Criteria) this;
        }

        public Criteria andSsTitleNotIn(List<String> values) {
            addCriterion("ss_title not in", values, "ssTitle");
            return (Criteria) this;
        }

        public Criteria andSsTitleBetween(String value1, String value2) {
            addCriterion("ss_title between", value1, value2, "ssTitle");
            return (Criteria) this;
        }

        public Criteria andSsTitleNotBetween(String value1, String value2) {
            addCriterion("ss_title not between", value1, value2, "ssTitle");
            return (Criteria) this;
        }

        public Criteria andSsBriefIsNull() {
            addCriterion("ss_brief is null");
            return (Criteria) this;
        }

        public Criteria andSsBriefIsNotNull() {
            addCriterion("ss_brief is not null");
            return (Criteria) this;
        }

        public Criteria andSsBriefEqualTo(String value) {
            addCriterion("ss_brief =", value, "ssBrief");
            return (Criteria) this;
        }

        public Criteria andSsBriefNotEqualTo(String value) {
            addCriterion("ss_brief <>", value, "ssBrief");
            return (Criteria) this;
        }

        public Criteria andSsBriefGreaterThan(String value) {
            addCriterion("ss_brief >", value, "ssBrief");
            return (Criteria) this;
        }

        public Criteria andSsBriefGreaterThanOrEqualTo(String value) {
            addCriterion("ss_brief >=", value, "ssBrief");
            return (Criteria) this;
        }

        public Criteria andSsBriefLessThan(String value) {
            addCriterion("ss_brief <", value, "ssBrief");
            return (Criteria) this;
        }

        public Criteria andSsBriefLessThanOrEqualTo(String value) {
            addCriterion("ss_brief <=", value, "ssBrief");
            return (Criteria) this;
        }

        public Criteria andSsBriefLike(String value) {
            addCriterion("ss_brief like", value, "ssBrief");
            return (Criteria) this;
        }

        public Criteria andSsBriefNotLike(String value) {
            addCriterion("ss_brief not like", value, "ssBrief");
            return (Criteria) this;
        }

        public Criteria andSsBriefIn(List<String> values) {
            addCriterion("ss_brief in", values, "ssBrief");
            return (Criteria) this;
        }

        public Criteria andSsBriefNotIn(List<String> values) {
            addCriterion("ss_brief not in", values, "ssBrief");
            return (Criteria) this;
        }

        public Criteria andSsBriefBetween(String value1, String value2) {
            addCriterion("ss_brief between", value1, value2, "ssBrief");
            return (Criteria) this;
        }

        public Criteria andSsBriefNotBetween(String value1, String value2) {
            addCriterion("ss_brief not between", value1, value2, "ssBrief");
            return (Criteria) this;
        }

        public Criteria andSsPhoneIsNull() {
            addCriterion("ss_phone is null");
            return (Criteria) this;
        }

        public Criteria andSsPhoneIsNotNull() {
            addCriterion("ss_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSsPhoneEqualTo(String value) {
            addCriterion("ss_phone =", value, "ssPhone");
            return (Criteria) this;
        }

        public Criteria andSsPhoneNotEqualTo(String value) {
            addCriterion("ss_phone <>", value, "ssPhone");
            return (Criteria) this;
        }

        public Criteria andSsPhoneGreaterThan(String value) {
            addCriterion("ss_phone >", value, "ssPhone");
            return (Criteria) this;
        }

        public Criteria andSsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ss_phone >=", value, "ssPhone");
            return (Criteria) this;
        }

        public Criteria andSsPhoneLessThan(String value) {
            addCriterion("ss_phone <", value, "ssPhone");
            return (Criteria) this;
        }

        public Criteria andSsPhoneLessThanOrEqualTo(String value) {
            addCriterion("ss_phone <=", value, "ssPhone");
            return (Criteria) this;
        }

        public Criteria andSsPhoneLike(String value) {
            addCriterion("ss_phone like", value, "ssPhone");
            return (Criteria) this;
        }

        public Criteria andSsPhoneNotLike(String value) {
            addCriterion("ss_phone not like", value, "ssPhone");
            return (Criteria) this;
        }

        public Criteria andSsPhoneIn(List<String> values) {
            addCriterion("ss_phone in", values, "ssPhone");
            return (Criteria) this;
        }

        public Criteria andSsPhoneNotIn(List<String> values) {
            addCriterion("ss_phone not in", values, "ssPhone");
            return (Criteria) this;
        }

        public Criteria andSsPhoneBetween(String value1, String value2) {
            addCriterion("ss_phone between", value1, value2, "ssPhone");
            return (Criteria) this;
        }

        public Criteria andSsPhoneNotBetween(String value1, String value2) {
            addCriterion("ss_phone not between", value1, value2, "ssPhone");
            return (Criteria) this;
        }

        public Criteria andSsSponsorIsNull() {
            addCriterion("ss_sponsor is null");
            return (Criteria) this;
        }

        public Criteria andSsSponsorIsNotNull() {
            addCriterion("ss_sponsor is not null");
            return (Criteria) this;
        }

        public Criteria andSsSponsorEqualTo(String value) {
            addCriterion("ss_sponsor =", value, "ssSponsor");
            return (Criteria) this;
        }

        public Criteria andSsSponsorNotEqualTo(String value) {
            addCriterion("ss_sponsor <>", value, "ssSponsor");
            return (Criteria) this;
        }

        public Criteria andSsSponsorGreaterThan(String value) {
            addCriterion("ss_sponsor >", value, "ssSponsor");
            return (Criteria) this;
        }

        public Criteria andSsSponsorGreaterThanOrEqualTo(String value) {
            addCriterion("ss_sponsor >=", value, "ssSponsor");
            return (Criteria) this;
        }

        public Criteria andSsSponsorLessThan(String value) {
            addCriterion("ss_sponsor <", value, "ssSponsor");
            return (Criteria) this;
        }

        public Criteria andSsSponsorLessThanOrEqualTo(String value) {
            addCriterion("ss_sponsor <=", value, "ssSponsor");
            return (Criteria) this;
        }

        public Criteria andSsSponsorLike(String value) {
            addCriterion("ss_sponsor like", value, "ssSponsor");
            return (Criteria) this;
        }

        public Criteria andSsSponsorNotLike(String value) {
            addCriterion("ss_sponsor not like", value, "ssSponsor");
            return (Criteria) this;
        }

        public Criteria andSsSponsorIn(List<String> values) {
            addCriterion("ss_sponsor in", values, "ssSponsor");
            return (Criteria) this;
        }

        public Criteria andSsSponsorNotIn(List<String> values) {
            addCriterion("ss_sponsor not in", values, "ssSponsor");
            return (Criteria) this;
        }

        public Criteria andSsSponsorBetween(String value1, String value2) {
            addCriterion("ss_sponsor between", value1, value2, "ssSponsor");
            return (Criteria) this;
        }

        public Criteria andSsSponsorNotBetween(String value1, String value2) {
            addCriterion("ss_sponsor not between", value1, value2, "ssSponsor");
            return (Criteria) this;
        }

        public Criteria andSsUrlIsNull() {
            addCriterion("ss_url is null");
            return (Criteria) this;
        }

        public Criteria andSsUrlIsNotNull() {
            addCriterion("ss_url is not null");
            return (Criteria) this;
        }

        public Criteria andSsUrlEqualTo(String value) {
            addCriterion("ss_url =", value, "ssUrl");
            return (Criteria) this;
        }

        public Criteria andSsUrlNotEqualTo(String value) {
            addCriterion("ss_url <>", value, "ssUrl");
            return (Criteria) this;
        }

        public Criteria andSsUrlGreaterThan(String value) {
            addCriterion("ss_url >", value, "ssUrl");
            return (Criteria) this;
        }

        public Criteria andSsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ss_url >=", value, "ssUrl");
            return (Criteria) this;
        }

        public Criteria andSsUrlLessThan(String value) {
            addCriterion("ss_url <", value, "ssUrl");
            return (Criteria) this;
        }

        public Criteria andSsUrlLessThanOrEqualTo(String value) {
            addCriterion("ss_url <=", value, "ssUrl");
            return (Criteria) this;
        }

        public Criteria andSsUrlLike(String value) {
            addCriterion("ss_url like", value, "ssUrl");
            return (Criteria) this;
        }

        public Criteria andSsUrlNotLike(String value) {
            addCriterion("ss_url not like", value, "ssUrl");
            return (Criteria) this;
        }

        public Criteria andSsUrlIn(List<String> values) {
            addCriterion("ss_url in", values, "ssUrl");
            return (Criteria) this;
        }

        public Criteria andSsUrlNotIn(List<String> values) {
            addCriterion("ss_url not in", values, "ssUrl");
            return (Criteria) this;
        }

        public Criteria andSsUrlBetween(String value1, String value2) {
            addCriterion("ss_url between", value1, value2, "ssUrl");
            return (Criteria) this;
        }

        public Criteria andSsUrlNotBetween(String value1, String value2) {
            addCriterion("ss_url not between", value1, value2, "ssUrl");
            return (Criteria) this;
        }

        public Criteria andSsLatitudeIsNull() {
            addCriterion("ss_latitude is null");
            return (Criteria) this;
        }

        public Criteria andSsLatitudeIsNotNull() {
            addCriterion("ss_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andSsLatitudeEqualTo(Double value) {
            addCriterion("ss_latitude =", value, "ssLatitude");
            return (Criteria) this;
        }

        public Criteria andSsLatitudeNotEqualTo(Double value) {
            addCriterion("ss_latitude <>", value, "ssLatitude");
            return (Criteria) this;
        }

        public Criteria andSsLatitudeGreaterThan(Double value) {
            addCriterion("ss_latitude >", value, "ssLatitude");
            return (Criteria) this;
        }

        public Criteria andSsLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("ss_latitude >=", value, "ssLatitude");
            return (Criteria) this;
        }

        public Criteria andSsLatitudeLessThan(Double value) {
            addCriterion("ss_latitude <", value, "ssLatitude");
            return (Criteria) this;
        }

        public Criteria andSsLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("ss_latitude <=", value, "ssLatitude");
            return (Criteria) this;
        }

        public Criteria andSsLatitudeIn(List<Double> values) {
            addCriterion("ss_latitude in", values, "ssLatitude");
            return (Criteria) this;
        }

        public Criteria andSsLatitudeNotIn(List<Double> values) {
            addCriterion("ss_latitude not in", values, "ssLatitude");
            return (Criteria) this;
        }

        public Criteria andSsLatitudeBetween(Double value1, Double value2) {
            addCriterion("ss_latitude between", value1, value2, "ssLatitude");
            return (Criteria) this;
        }

        public Criteria andSsLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("ss_latitude not between", value1, value2, "ssLatitude");
            return (Criteria) this;
        }

        public Criteria andSsLongitudeIsNull() {
            addCriterion("ss_longitude is null");
            return (Criteria) this;
        }

        public Criteria andSsLongitudeIsNotNull() {
            addCriterion("ss_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andSsLongitudeEqualTo(Double value) {
            addCriterion("ss_longitude =", value, "ssLongitude");
            return (Criteria) this;
        }

        public Criteria andSsLongitudeNotEqualTo(Double value) {
            addCriterion("ss_longitude <>", value, "ssLongitude");
            return (Criteria) this;
        }

        public Criteria andSsLongitudeGreaterThan(Double value) {
            addCriterion("ss_longitude >", value, "ssLongitude");
            return (Criteria) this;
        }

        public Criteria andSsLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("ss_longitude >=", value, "ssLongitude");
            return (Criteria) this;
        }

        public Criteria andSsLongitudeLessThan(Double value) {
            addCriterion("ss_longitude <", value, "ssLongitude");
            return (Criteria) this;
        }

        public Criteria andSsLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("ss_longitude <=", value, "ssLongitude");
            return (Criteria) this;
        }

        public Criteria andSsLongitudeIn(List<Double> values) {
            addCriterion("ss_longitude in", values, "ssLongitude");
            return (Criteria) this;
        }

        public Criteria andSsLongitudeNotIn(List<Double> values) {
            addCriterion("ss_longitude not in", values, "ssLongitude");
            return (Criteria) this;
        }

        public Criteria andSsLongitudeBetween(Double value1, Double value2) {
            addCriterion("ss_longitude between", value1, value2, "ssLongitude");
            return (Criteria) this;
        }

        public Criteria andSsLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("ss_longitude not between", value1, value2, "ssLongitude");
            return (Criteria) this;
        }

        public Criteria andLatDeviationIsNull() {
            addCriterion("lat_deviation is null");
            return (Criteria) this;
        }

        public Criteria andLatDeviationIsNotNull() {
            addCriterion("lat_deviation is not null");
            return (Criteria) this;
        }

        public Criteria andLatDeviationEqualTo(Double value) {
            addCriterion("lat_deviation =", value, "latDeviation");
            return (Criteria) this;
        }

        public Criteria andLatDeviationNotEqualTo(Double value) {
            addCriterion("lat_deviation <>", value, "latDeviation");
            return (Criteria) this;
        }

        public Criteria andLatDeviationGreaterThan(Double value) {
            addCriterion("lat_deviation >", value, "latDeviation");
            return (Criteria) this;
        }

        public Criteria andLatDeviationGreaterThanOrEqualTo(Double value) {
            addCriterion("lat_deviation >=", value, "latDeviation");
            return (Criteria) this;
        }

        public Criteria andLatDeviationLessThan(Double value) {
            addCriterion("lat_deviation <", value, "latDeviation");
            return (Criteria) this;
        }

        public Criteria andLatDeviationLessThanOrEqualTo(Double value) {
            addCriterion("lat_deviation <=", value, "latDeviation");
            return (Criteria) this;
        }

        public Criteria andLatDeviationIn(List<Double> values) {
            addCriterion("lat_deviation in", values, "latDeviation");
            return (Criteria) this;
        }

        public Criteria andLatDeviationNotIn(List<Double> values) {
            addCriterion("lat_deviation not in", values, "latDeviation");
            return (Criteria) this;
        }

        public Criteria andLatDeviationBetween(Double value1, Double value2) {
            addCriterion("lat_deviation between", value1, value2, "latDeviation");
            return (Criteria) this;
        }

        public Criteria andLatDeviationNotBetween(Double value1, Double value2) {
            addCriterion("lat_deviation not between", value1, value2, "latDeviation");
            return (Criteria) this;
        }

        public Criteria andLongDeviationIsNull() {
            addCriterion("long_deviation is null");
            return (Criteria) this;
        }

        public Criteria andLongDeviationIsNotNull() {
            addCriterion("long_deviation is not null");
            return (Criteria) this;
        }

        public Criteria andLongDeviationEqualTo(Double value) {
            addCriterion("long_deviation =", value, "longDeviation");
            return (Criteria) this;
        }

        public Criteria andLongDeviationNotEqualTo(Double value) {
            addCriterion("long_deviation <>", value, "longDeviation");
            return (Criteria) this;
        }

        public Criteria andLongDeviationGreaterThan(Double value) {
            addCriterion("long_deviation >", value, "longDeviation");
            return (Criteria) this;
        }

        public Criteria andLongDeviationGreaterThanOrEqualTo(Double value) {
            addCriterion("long_deviation >=", value, "longDeviation");
            return (Criteria) this;
        }

        public Criteria andLongDeviationLessThan(Double value) {
            addCriterion("long_deviation <", value, "longDeviation");
            return (Criteria) this;
        }

        public Criteria andLongDeviationLessThanOrEqualTo(Double value) {
            addCriterion("long_deviation <=", value, "longDeviation");
            return (Criteria) this;
        }

        public Criteria andLongDeviationIn(List<Double> values) {
            addCriterion("long_deviation in", values, "longDeviation");
            return (Criteria) this;
        }

        public Criteria andLongDeviationNotIn(List<Double> values) {
            addCriterion("long_deviation not in", values, "longDeviation");
            return (Criteria) this;
        }

        public Criteria andLongDeviationBetween(Double value1, Double value2) {
            addCriterion("long_deviation between", value1, value2, "longDeviation");
            return (Criteria) this;
        }

        public Criteria andLongDeviationNotBetween(Double value1, Double value2) {
            addCriterion("long_deviation not between", value1, value2, "longDeviation");
            return (Criteria) this;
        }

        public Criteria andSsCreateTimeIsNull() {
            addCriterion("ss_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSsCreateTimeIsNotNull() {
            addCriterion("ss_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSsCreateTimeEqualTo(Date value) {
            addCriterion("ss_create_time =", value, "ssCreateTime");
            return (Criteria) this;
        }

        public Criteria andSsCreateTimeNotEqualTo(Date value) {
            addCriterion("ss_create_time <>", value, "ssCreateTime");
            return (Criteria) this;
        }

        public Criteria andSsCreateTimeGreaterThan(Date value) {
            addCriterion("ss_create_time >", value, "ssCreateTime");
            return (Criteria) this;
        }

        public Criteria andSsCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ss_create_time >=", value, "ssCreateTime");
            return (Criteria) this;
        }

        public Criteria andSsCreateTimeLessThan(Date value) {
            addCriterion("ss_create_time <", value, "ssCreateTime");
            return (Criteria) this;
        }

        public Criteria andSsCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ss_create_time <=", value, "ssCreateTime");
            return (Criteria) this;
        }

        public Criteria andSsCreateTimeIn(List<Date> values) {
            addCriterion("ss_create_time in", values, "ssCreateTime");
            return (Criteria) this;
        }

        public Criteria andSsCreateTimeNotIn(List<Date> values) {
            addCriterion("ss_create_time not in", values, "ssCreateTime");
            return (Criteria) this;
        }

        public Criteria andSsCreateTimeBetween(Date value1, Date value2) {
            addCriterion("ss_create_time between", value1, value2, "ssCreateTime");
            return (Criteria) this;
        }

        public Criteria andSsCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ss_create_time not between", value1, value2, "ssCreateTime");
            return (Criteria) this;
        }

        public Criteria andSsModifiedTimeIsNull() {
            addCriterion("ss_modified_time is null");
            return (Criteria) this;
        }

        public Criteria andSsModifiedTimeIsNotNull() {
            addCriterion("ss_modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andSsModifiedTimeEqualTo(Date value) {
            addCriterion("ss_modified_time =", value, "ssModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSsModifiedTimeNotEqualTo(Date value) {
            addCriterion("ss_modified_time <>", value, "ssModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSsModifiedTimeGreaterThan(Date value) {
            addCriterion("ss_modified_time >", value, "ssModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSsModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ss_modified_time >=", value, "ssModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSsModifiedTimeLessThan(Date value) {
            addCriterion("ss_modified_time <", value, "ssModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSsModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("ss_modified_time <=", value, "ssModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSsModifiedTimeIn(List<Date> values) {
            addCriterion("ss_modified_time in", values, "ssModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSsModifiedTimeNotIn(List<Date> values) {
            addCriterion("ss_modified_time not in", values, "ssModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSsModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("ss_modified_time between", value1, value2, "ssModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSsModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("ss_modified_time not between", value1, value2, "ssModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSsRecommendIsNull() {
            addCriterion("ss_recommend is null");
            return (Criteria) this;
        }

        public Criteria andSsRecommendIsNotNull() {
            addCriterion("ss_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andSsRecommendEqualTo(Date value) {
            addCriterion("ss_recommend =", value, "ssRecommend");
            return (Criteria) this;
        }

        public Criteria andSsRecommendNotEqualTo(Date value) {
            addCriterion("ss_recommend <>", value, "ssRecommend");
            return (Criteria) this;
        }

        public Criteria andSsRecommendGreaterThan(Date value) {
            addCriterion("ss_recommend >", value, "ssRecommend");
            return (Criteria) this;
        }

        public Criteria andSsRecommendGreaterThanOrEqualTo(Date value) {
            addCriterion("ss_recommend >=", value, "ssRecommend");
            return (Criteria) this;
        }

        public Criteria andSsRecommendLessThan(Date value) {
            addCriterion("ss_recommend <", value, "ssRecommend");
            return (Criteria) this;
        }

        public Criteria andSsRecommendLessThanOrEqualTo(Date value) {
            addCriterion("ss_recommend <=", value, "ssRecommend");
            return (Criteria) this;
        }

        public Criteria andSsRecommendIn(List<Date> values) {
            addCriterion("ss_recommend in", values, "ssRecommend");
            return (Criteria) this;
        }

        public Criteria andSsRecommendNotIn(List<Date> values) {
            addCriterion("ss_recommend not in", values, "ssRecommend");
            return (Criteria) this;
        }

        public Criteria andSsRecommendBetween(Date value1, Date value2) {
            addCriterion("ss_recommend between", value1, value2, "ssRecommend");
            return (Criteria) this;
        }

        public Criteria andSsRecommendNotBetween(Date value1, Date value2) {
            addCriterion("ss_recommend not between", value1, value2, "ssRecommend");
            return (Criteria) this;
        }

        public Criteria andSsStatusIsNull() {
            addCriterion("ss_status is null");
            return (Criteria) this;
        }

        public Criteria andSsStatusIsNotNull() {
            addCriterion("ss_status is not null");
            return (Criteria) this;
        }

        public Criteria andSsStatusEqualTo(Date value) {
            addCriterion("ss_status =", value, "ssStatus");
            return (Criteria) this;
        }

        public Criteria andSsStatusNotEqualTo(Date value) {
            addCriterion("ss_status <>", value, "ssStatus");
            return (Criteria) this;
        }

        public Criteria andSsStatusGreaterThan(Date value) {
            addCriterion("ss_status >", value, "ssStatus");
            return (Criteria) this;
        }

        public Criteria andSsStatusGreaterThanOrEqualTo(Date value) {
            addCriterion("ss_status >=", value, "ssStatus");
            return (Criteria) this;
        }

        public Criteria andSsStatusLessThan(Date value) {
            addCriterion("ss_status <", value, "ssStatus");
            return (Criteria) this;
        }

        public Criteria andSsStatusLessThanOrEqualTo(Date value) {
            addCriterion("ss_status <=", value, "ssStatus");
            return (Criteria) this;
        }

        public Criteria andSsStatusIn(List<Date> values) {
            addCriterion("ss_status in", values, "ssStatus");
            return (Criteria) this;
        }

        public Criteria andSsStatusNotIn(List<Date> values) {
            addCriterion("ss_status not in", values, "ssStatus");
            return (Criteria) this;
        }

        public Criteria andSsStatusBetween(Date value1, Date value2) {
            addCriterion("ss_status between", value1, value2, "ssStatus");
            return (Criteria) this;
        }

        public Criteria andSsStatusNotBetween(Date value1, Date value2) {
            addCriterion("ss_status not between", value1, value2, "ssStatus");
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