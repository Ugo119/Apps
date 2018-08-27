package com.example.ugo.quakereport;

public class Quake {
    private String mMag;
    private String mLocation;
    private long mTimeInMilliseconds;
    Quake(String mag, String location, long timeInMilliseconds){
        mMag = mag;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
     }
     public String getMag(){return mMag;}
     public String getLocation(){return mLocation;}
     public long getTimeInMilliseconds(){return mTimeInMilliseconds;}
}
