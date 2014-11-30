package android.bignerdranch.com.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by christopherl on 11/11/14.
 */
public class Crime {
    private UUID mId;
    private String mTtile;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        //Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    @Override
    public String toString() {
        return mTtile;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTtile;
    }

    public void setTitle(String title) {
        mTtile = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
