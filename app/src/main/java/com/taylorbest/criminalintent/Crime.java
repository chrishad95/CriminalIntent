package com.taylorbest.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by chadley on 9/28/2015.
 */


public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public UUID getId() {

        return mId;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String getTitle() {
        return mTitle;

    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }


    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();

    }
}
