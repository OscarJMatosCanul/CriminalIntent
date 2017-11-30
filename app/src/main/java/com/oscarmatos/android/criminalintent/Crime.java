package com.oscarmatos.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by oscar on 29/11/2017.
 */

public class Crime {


    private UUID mId;
    private String mtitle;
    private Date mDate;
    private boolean mSolved;

    public Crime (){
        mId= UUID.randomUUID();
        mDate=new Date();
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID mId) {
        this.mId = mId;
    }

    public String gettitle() {
        return mtitle;
    }

    public void settitle(String mtitle) {
        this.mtitle = mtitle;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }
}
