package com.example.ugo.quakereport;

public class Quake {
    private String mMag;
    private String mLocation;
    private String mDate;
    Quake(String mag, String location, String date){
        mMag = mag;
        mLocation = location;
        mDate = date;
     }
     public String getMag(){return mMag;}
     public String getLocation(){return mLocation;}
     public String getDate(){return mDate;}
}
