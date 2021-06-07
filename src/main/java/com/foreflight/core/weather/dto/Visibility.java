package com.foreflight.core.weather.dto;

public class Visibility {
    private String distanceSm;
    private String prevailingVisSm;

    public String getDistanceSm() {
        return distanceSm;
    }

    public void setDistanceSm(String distanceSm) {
        this.distanceSm = distanceSm;
    }

    public String getPrevailingVisSm() {
        return prevailingVisSm;
    }

    public void setPrevailingVisSm(String prevailingVisSm) {
        this.prevailingVisSm = prevailingVisSm;
    }
}
