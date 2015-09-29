package com.taylorbest.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by chadley on 9/29/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
