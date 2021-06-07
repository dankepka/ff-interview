package com.foreflight.core.airport.dto;

public class Runway {
    private String ident;
    private String name;
    private String latitudeBase;
    private String longitudeBase;
    private Integer width;
    private String surfaceQuality;

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatitudeBase() {
        return latitudeBase;
    }

    public void setLatitudeBase(String latitudeBase) {
        this.latitudeBase = latitudeBase;
    }

    public String getLongitudeBase() {
        return longitudeBase;
    }

    public void setLongitudeBase(String longitudeBase) {
        this.longitudeBase = longitudeBase;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getSurfaceQuality() {
        return surfaceQuality;
    }

    public void setSurfaceQuality(String surfaceQuality) {
        this.surfaceQuality = surfaceQuality;
    }
}
