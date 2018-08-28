package com.example.ugo.quakereport;

public class Quake {
    private double mMag;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;
    Quake(double mag, String location, long timeInMilliseconds, String url){
        mMag = mag;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
     }
     public double getMagnitude(){return mMag;}
     public String getLocation(){return mLocation;}
     public long getTimeInMilliseconds(){return mTimeInMilliseconds;}
    /*
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {return mUrl;}
}
