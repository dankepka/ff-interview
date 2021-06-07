package com.foreflight.core.weather.dto;

public class CloudLayer {
    private String coverage;
    private String altitudeFt;
    private boolean ceiling;

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public String getAltitudeFt() {
        return altitudeFt;
    }

    public void setAltitudeFt(String altitudeFt) {
        this.altitudeFt = altitudeFt;
    }

    public boolean isCeiling() {
        return ceiling;
    }

    public void setCeiling(boolean ceiling) {
        this.ceiling = ceiling;
    }
}
