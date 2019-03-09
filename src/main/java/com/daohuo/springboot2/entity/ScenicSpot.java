package com.daohuo.springboot2.entity;

import java.util.Date;
import java.util.List;

public class ScenicSpot {
    private Integer ssId;

    private String ssCategory;

    private String ssLevel;

    private String ssUOpenid;

    private String ssCity;

    private String ssTitle;

    private String ssBrief;

    private String ssPhone;

    private String ssSponsor;

    private String ssUrl;

    private Double ssLatitude;

    private Double ssLongitude;

    private Double latDeviation;

    private Double longDeviation;

    private Date ssCreateTime;

    private Date ssModifiedTime;

    private Date ssRecommend;

    private Date ssStatus;

    private List<Activity> activityList;

    public Integer getSsId() {
        return ssId;
    }

    public void setSsId(Integer ssId) {
        this.ssId = ssId;
    }

    public String getSsCategory() {
        return ssCategory;
    }

    public void setSsCategory(String ssCategory) {
        this.ssCategory = ssCategory == null ? null : ssCategory.trim();
    }

    public String getSsLevel() {
        return ssLevel;
    }

    public void setSsLevel(String ssLevel) {
        this.ssLevel = ssLevel == null ? null : ssLevel.trim();
    }

    public String getSsUOpenid() {
        return ssUOpenid;
    }

    public void setSsUOpenid(String ssUOpenid) {
        this.ssUOpenid = ssUOpenid == null ? null : ssUOpenid.trim();
    }

    public String getSsCity() {
        return ssCity;
    }

    public void setSsCity(String ssCity) {
        this.ssCity = ssCity == null ? null : ssCity.trim();
    }

    public String getSsTitle() {
        return ssTitle;
    }

    public void setSsTitle(String ssTitle) {
        this.ssTitle = ssTitle == null ? null : ssTitle.trim();
    }

    public String getSsBrief() {
        return ssBrief;
    }

    public void setSsBrief(String ssBrief) {
        this.ssBrief = ssBrief == null ? null : ssBrief.trim();
    }

    public String getSsPhone() {
        return ssPhone;
    }

    public void setSsPhone(String ssPhone) {
        this.ssPhone = ssPhone == null ? null : ssPhone.trim();
    }

    public String getSsSponsor() {
        return ssSponsor;
    }

    public void setSsSponsor(String ssSponsor) {
        this.ssSponsor = ssSponsor == null ? null : ssSponsor.trim();
    }

    public String getSsUrl() {
        return ssUrl;
    }

    public void setSsUrl(String ssUrl) {
        this.ssUrl = ssUrl == null ? null : ssUrl.trim();
    }

    public Double getSsLatitude() {
        return ssLatitude;
    }

    public void setSsLatitude(Double ssLatitude) {
        this.ssLatitude = ssLatitude;
    }

    public Double getSsLongitude() {
        return ssLongitude;
    }

    public void setSsLongitude(Double ssLongitude) {
        this.ssLongitude = ssLongitude;
    }

    public Double getLatDeviation() {
        return latDeviation;
    }

    public void setLatDeviation(Double latDeviation) {
        this.latDeviation = latDeviation;
    }

    public Double getLongDeviation() {
        return longDeviation;
    }

    public void setLongDeviation(Double longDeviation) {
        this.longDeviation = longDeviation;
    }

    public Date getSsCreateTime() {
        return ssCreateTime;
    }

    public void setSsCreateTime(Date ssCreateTime) {
        this.ssCreateTime = ssCreateTime;
    }

    public Date getSsModifiedTime() {
        return ssModifiedTime;
    }

    public void setSsModifiedTime(Date ssModifiedTime) {
        this.ssModifiedTime = ssModifiedTime;
    }

    public Date getSsRecommend() {
        return ssRecommend;
    }

    public void setSsRecommend(Date ssRecommend) {
        this.ssRecommend = ssRecommend;
    }

    public Date getSsStatus() {
        return ssStatus;
    }

    public void setSsStatus(Date ssStatus) {
        this.ssStatus = ssStatus;
    }

    public List<Activity> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<Activity> activityList) {
        this.activityList = activityList;
    }
}