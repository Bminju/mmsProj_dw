package com.maven.mmsProj.model;

import java.util.Date;

public class DwVO {

    String genId;
    String tradeDay;
    String regrId;
    String bidRegDate;
    String bidUserId;
    String regDate;
    String bidId;  //식별 ID
    String bidCode;
    String bidValue;

    public String getGenId() {
        return genId;
    }

    public void setGenId(String genId) {
        this.genId = genId;
    }

    public String getTradeDay() {
        return tradeDay;
    }

    public void setTradeDay(String tradeDay) {
        this.tradeDay = tradeDay;
    }

    public String getRegrId() {
        return regrId;
    }

    public void setRegrId(String regrId) {
        this.regrId = regrId;
    }

    public String getBidRegdate() {
        return bidRegDate;
    }

    public void setBidRegdate(String bidRegdate) {
        this.bidRegDate = bidRegdate;
    }

    public String getBidUserId() {
        return bidUserId;
    }

    public void setBidUserId(String bidUserId) {
        this.bidUserId = bidUserId;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getBidId() {
        return bidId;
    }

    public void setBidId(String bidId) {
        this.bidId = bidId;
    }

    public String getBidCode() {
        return bidCode;
    }

    public void setBidCode(String bidCode) {
        this.bidCode = bidCode;
    }

    public String getBidValue() {
        return bidValue;
    }

    public void setBidValue(String bidValue) {
        this.bidValue = bidValue;
    }

    @Override
    public String toString() {
        return "DwVO{" +
                "genId='" + genId + '\'' +
                ", tradeDay='" + tradeDay + '\'' +
                ", regrId='" + regrId + '\'' +
                ", bidRegdate=" + bidRegDate +
                ", bidUserId='" + bidUserId + '\'' +
                ", regDate=" + regDate +
                ", bidId='" + bidId + '\'' +
                ", bidCode='" + bidCode + '\'' +
                ", bidValue='" + bidValue + '\'' +
                '}';
    }
}
