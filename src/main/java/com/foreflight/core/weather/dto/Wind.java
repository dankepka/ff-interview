package com.foreflight.core.weather.dto;

public class Wind {
    private Integer speedKts;
    private Integer gustSpeedKts;
    private String direction;
    private String from;

    public Integer getSpeedKts() {
        return speedKts;
    }

    public void setSpeedKts(Integer speedKts) {
        this.speedKts = speedKts;
    }

    public Integer getGustSpeedKts() {
        return gustSpeedKts;
    }

    public void setGustSpeedKts(Integer gustSpeedKts) {
        this.gustSpeedKts = gustSpeedKts;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSpeedMPH(){
        return null!=speedKts ? String.format("%s",Double.valueOf(speedKts * 1.15078).intValue()) : "-";
    }
}
