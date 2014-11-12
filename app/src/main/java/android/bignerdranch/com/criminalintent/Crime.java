package android.bignerdranch.com.criminalintent;

import java.util.UUID;

/**
 * Created by christopherl on 11/11/14.
 */
public class Crime {
    private UUID mId;
    private String mTtile;

    public Crime(){
        //Generate unique identifier
        mId = UUID.randomUUID();
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
}
