package com.example.anthony.td4;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Anthony on 01/10/2016.
 */
public class ExamplePagerAdapter extends FragmentStatePagerAdapter{

    public ExamplePagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                // return new AFragment();
                return new NumberPickerFragment();
            default:
                // return new BFragment();
                return new TextFragment();

        }

    }
    @Override
    public int getCount() {//le nombre d’onglet
        return 2;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return "myFrag";
    }

}
