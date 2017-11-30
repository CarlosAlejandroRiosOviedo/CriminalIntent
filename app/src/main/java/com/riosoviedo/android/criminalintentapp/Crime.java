package com.riosoviedo.android.criminalintentapp;

import java.util.Date;
import java.util.UUID;

public class Crime {
    UUID mId;
    String mTitle;
    Date mDate;
    boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId(){
        return mId;
    }

    public void setTitle(String s){
        this.mTitle = "";
    }
    public String getTitle(){
        return mTitle;
    }
    public void setDate(){
        this.mDate = mDate;
    }
    public Date getDate(){
        return mDate;
    }

    public void setSolved(boolean solved) {
        this.mSolved = solved;
    }

    public boolean isSolved(){
        return mSolved;
    }
}
