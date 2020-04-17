package com.example.android.quakereport;

import java.util.Date;

public class EarthQuake {

    private Double mag;
    private String primaryLocation;
    private String location;
    private String url;
    private long date;

    public EarthQuake(Double mag, String location, long date, String url) {
        this.mag = mag;
        this.location = location;
        this.date = date;
        this.url = url;
    }

    public Double getMag() {
        return mag;
    }

    public String getLocation() {
        return location;
    }

    public long getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }
}
