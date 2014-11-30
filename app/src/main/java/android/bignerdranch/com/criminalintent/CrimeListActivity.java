package android.bignerdranch.com.criminalintent;

/**
 * Created by christopherl on 11/30/14.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected android.app.Fragment createFragment() {
        return new CrimeListFragment();
    }
}
