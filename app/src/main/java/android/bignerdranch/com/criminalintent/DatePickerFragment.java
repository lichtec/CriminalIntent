package android.bignerdranch.com.criminalintent;

import android.support.v4.app.DialogFragment;

/**
 * Created by christopherl on 12/20/14.
 */
public class DatePickerFragment extends DialogFragment {
    public static final String EXTRA_DATE = "com.bignerdranch.android.criminalintent.date";
    
    private Date mDate;
    
    public static DatePickerFragment newInstance(Date date) {
        Bundle args = new Bundle();
        args.putSerializable(EXTRA_DATE, date);
        
        DatePickerFragment fragment = new DatePickerFragment();
        fragment.setArguments(args);
        
        return fragment;
    }
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View v = getActivity().getLayoutInflater().inflate(R.layout.dialog_date, null);
        
        return new AlterDialog.Builder(getActivity()).setView(v)
        .setTitle(R.string.date_picker_title).setPositiveButton(android.R.string.ok, null)
        .create();
    }
    

}
