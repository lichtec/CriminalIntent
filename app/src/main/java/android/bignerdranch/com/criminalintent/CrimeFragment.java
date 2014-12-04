package android.bignerdranch.com.criminalintent;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;


public class CrimeFragment extends Fragment {
    
    public static final String EXTRA_CRIME_ID = "com.bignerdranch.android.criminalintent.crime_id";
    
    private Crime mCrime;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UUID crimeId = (UUID)getActivity().getIntent().getSerializableExtra(EXTRA_CRIME_ID);
        mCrime = CrimeLab.get(getActivity()).getCrime(crimeId);
    }
    
    public static CrimeFragment newInstance(UUID crimeId){
        Bundle args = new Bundle();
        args.putSerializable(EXTRA_CRIME_ID, crimeID);
        
        CrimeFragment fragment = new CrimeFragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime, parent, false);
        
        mTitleField = (EditText)v.findViewById(R.id.crime_title);
        mTitleField.setText(mCrime.getTitle());
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
        
        mDateButton = (Button)v.findViewById(R.id.crime_date);
        /*
        DateFormat df = new DateFormat();
        df.format("MM-dd-yyyy", mCrime.getDate());
        String dateString = df.toString();
        mDateButton.setText(dateString);
        */
        mDateButton.setText(DateFormat.format("EEEE, MMM dd, yyyy", mCrime.getDate()).toString());
        mDateButton.setEnabled(false);
        
        mSolvedCheckBox = (CheckBox)v.findViewById(R.id.crime_solved);
        mSolvedCheckBox.setChecked(mCrime.isSolved());
        mSolvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                mCrime.setSolved(isChecked);
            }
        });
        
        return v;
    }

}
