package com.maven.mmsProj.model;

//TechVO, EnergyVO ..?
public class TechVO {


    private String techId;
    private String division;
    private String value;
    private String reason;
    private String genName;
    private String genId;
    private String tradeDate;

    public String getTechId() {
        return techId;
    }

    public void setTechId(String techId) {
        this.techId = techId;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getGenName() {
        return this.genName;
    }

    public void setGenName(String genName) {
        this.genName = genName;
    }

    public String getGenId() {
        return genId;
    }

    public void setGenId(String genId) {
        this.genId = genId;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    @Override
    public String toString() {
        return "TechVO{" +
                "techId='" + techId + '\'' +
                ", division='" + division + '\'' +
                ", value='" + value + '\'' +
                ", reason='" + reason + '\'' +
                ", genName='" + genName + '\'' +
                ", genId='" + genId + '\'' +
                ", tradeDate='" + tradeDate + '\'' +
                '}';
    }
}
