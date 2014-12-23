package android.bignerdranch.com.criminalintent;

import android.support.v4.app.DialogFragment;

/**
 * Created by christopherl on 12/20/14.
 */
public class DatePickerFragment extends DialogFragment {
    
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View v = getActivity().getLayoutInflater().inflate(R.layout.dialog_date, null);
        
        return new AlterDialog.Builder(getActivity()).setView(v)
        .setTitle(R.string.date_picker_title).setPositiveButton(android.R.string.ok, null)
        .create();
    }
    

}
