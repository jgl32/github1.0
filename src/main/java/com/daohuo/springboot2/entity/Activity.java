package com.daohuo.springboot2.entity;

public class Activity {
    private Integer hId;

    private String hActivityName;

    private String hContent;

    private String hPicture;

    private String hActivityCity;

    private String hActivityAddress;

    private String hActivityDestination;

    private String hActivityStime;

    private String hActivityEtime;

    private String hActivityWeek;

    private String hActivitySdate;

    private String hActivityEdate;

    private String hActivityPlace;

    private Double hLatitude;

    private Double hLongitude;

    private String hCircuitlistCount;

    private Integer hButtJoint;

    private Integer hInteraction;

    private Integer hAttendPeopleCount;

    private Integer hMaxPeople;

    private String hConscientious;

    private String cardUuid;

    private String hOrganizer;

    private String hContactway;

    private String hCtime;

    private String hMtime;

    private Integer hStatus;

    private Integer hReco;

    private String hQrcode;

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public String gethActivityName() {
        return hActivityName;
    }

    public void sethActivityName(String hActivityName) {
        this.hActivityName = hActivityName == null ? null : hActivityName.trim();
    }

    public String gethContent() {
        return hContent;
    }

    public void sethContent(String hContent) {
        this.hContent = hContent == null ? null : hContent.trim();
    }

    public String gethPicture() {
        return hPicture;
    }

    public void sethPicture(String hPicture) {
        this.hPicture = hPicture == null ? null : hPicture.trim();
    }

    public String gethActivityCity() {
        return hActivityCity;
    }

    public void sethActivityCity(String hActivityCity) {
        this.hActivityCity = hActivityCity == null ? null : hActivityCity.trim();
    }

    public String gethActivityAddress() {
        return hActivityAddress;
    }

    public void sethActivityAddress(String hActivityAddress) {
        this.hActivityAddress = hActivityAddress == null ? null : hActivityAddress.trim();
    }

    public String gethActivityDestination() {
        return hActivityDestination;
    }

    public void sethActivityDestination(String hActivityDestination) {
        this.hActivityDestination = hActivityDestination == null ? null : hActivityDestination.trim();
    }

    public String gethActivityStime() {
        return hActivityStime;
    }

    public void sethActivityStime(String hActivityStime) {
        this.hActivityStime = hActivityStime == null ? null : hActivityStime.trim();
    }

    public String gethActivityEtime() {
        return hActivityEtime;
    }

    public void sethActivityEtime(String hActivityEtime) {
        this.hActivityEtime = hActivityEtime == null ? null : hActivityEtime.trim();
    }

    public String gethActivityWeek() {
        return hActivityWeek;
    }

    public void sethActivityWeek(String hActivityWeek) {
        this.hActivityWeek = hActivityWeek == null ? null : hActivityWeek.trim();
    }

    public String gethActivitySdate() {
        return hActivitySdate;
    }

    public void sethActivitySdate(String hActivitySdate) {
        this.hActivitySdate = hActivitySdate == null ? null : hActivitySdate.trim();
    }

    public String gethActivityEdate() {
        return hActivityEdate;
    }

    public void sethActivityEdate(String hActivityEdate) {
        this.hActivityEdate = hActivityEdate == null ? null : hActivityEdate.trim();
    }

    public String gethActivityPlace() {
        return hActivityPlace;
    }

    public void sethActivityPlace(String hActivityPlace) {
        this.hActivityPlace = hActivityPlace == null ? null : hActivityPlace.trim();
    }

    public Double gethLatitude() {
        return hLatitude;
    }

    public void sethLatitude(Double hLatitude) {
        this.hLatitude = hLatitude;
    }

    public Double gethLongitude() {
        return hLongitude;
    }

    public void sethLongitude(Double hLongitude) {
        this.hLongitude = hLongitude;
    }

    public String gethCircuitlistCount() {
        return hCircuitlistCount;
    }

    public void sethCircuitlistCount(String hCircuitlistCount) {
        this.hCircuitlistCount = hCircuitlistCount == null ? null : hCircuitlistCount.trim();
    }

    public Integer gethButtJoint() {
        return hButtJoint;
    }

    public void sethButtJoint(Integer hButtJoint) {
        this.hButtJoint = hButtJoint;
    }

    public Integer gethInteraction() {
        return hInteraction;
    }

    public void sethInteraction(Integer hInteraction) {
        this.hInteraction = hInteraction;
    }

    public Integer gethAttendPeopleCount() {
        return hAttendPeopleCount;
    }

    public void sethAttendPeopleCount(Integer hAttendPeopleCount) {
        this.hAttendPeopleCount = hAttendPeopleCount;
    }

    public Integer gethMaxPeople() {
        return hMaxPeople;
    }

    public void sethMaxPeople(Integer hMaxPeople) {
        this.hMaxPeople = hMaxPeople;
    }

    public String gethConscientious() {
        return hConscientious;
    }

    public void sethConscientious(String hConscientious) {
        this.hConscientious = hConscientious == null ? null : hConscientious.trim();
    }

    public String getCardUuid() {
        return cardUuid;
    }

    public void setCardUuid(String cardUuid) {
        this.cardUuid = cardUuid == null ? null : cardUuid.trim();
    }

    public String gethOrganizer() {
        return hOrganizer;
    }

    public void sethOrganizer(String hOrganizer) {
        this.hOrganizer = hOrganizer == null ? null : hOrganizer.trim();
    }

    public String gethContactway() {
        return hContactway;
    }

    public void sethContactway(String hContactway) {
        this.hContactway = hContactway == null ? null : hContactway.trim();
    }

    public String gethCtime() {
        return hCtime;
    }

    public void sethCtime(String hCtime) {
        this.hCtime = hCtime == null ? null : hCtime.trim();
    }

    public String gethMtime() {
        return hMtime;
    }

    public void sethMtime(String hMtime) {
        this.hMtime = hMtime == null ? null : hMtime.trim();
    }

    public Integer gethStatus() {
        return hStatus;
    }

    public void sethStatus(Integer hStatus) {
        this.hStatus = hStatus;
    }

    public Integer gethReco() {
        return hReco;
    }

    public void sethReco(Integer hReco) {
        this.hReco = hReco;
    }

    public String gethQrcode() {
        return hQrcode;
    }

    public void sethQrcode(String hQrcode) {
        this.hQrcode = hQrcode == null ? null : hQrcode.trim();
    }
}