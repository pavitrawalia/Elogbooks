
package com.bhavin.elogbooks.model;

import com.google.gson.annotations.SerializedName;


public class Center {

    @SerializedName("info")
    private String mInfo;
    @SerializedName("latitude")
    private String mLatitude;
    @SerializedName("longitude")
    private String mLongitude;
    @SerializedName("radius")
    private String mRadius;

    public String getInfo() {
        return mInfo;
    }

    public void setInfo(String info) {
        mInfo = info;
    }

    public String getLatitude() {
        return mLatitude;
    }

    public void setLatitude(String latitude) {
        mLatitude = latitude;
    }

    public String getLongitude() {
        return mLongitude;
    }

    public void setLongitude(String longitude) {
        mLongitude = longitude;
    }

    public String getRadius() {
        return mRadius;
    }

    public void setRadius(String radius) {
        mRadius = radius;
    }

}
