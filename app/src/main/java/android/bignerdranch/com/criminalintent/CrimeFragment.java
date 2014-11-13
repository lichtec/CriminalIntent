package android.bignerdranch.com.criminalintent;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class CrimeFragment extends Fragment {
    
    private Crime mCrime;
    private EditText mTitleField;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime, parent, false);
        
        mTitleField = (EditText)v.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(
                CharSequence c, int start, int before, int count){
                    mCrime.setTitle(c.toString());
        }
        public void beforeTextChanged(
            CharSequence c, int start, int count, int after) {
                //BLANK FOR A REASON
            }
        public void afterTextChanged(Editable c) {
            //THIS TOO
        }
        });
        return v;
    }

}
