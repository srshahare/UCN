package com.ssproduction.shashank.ucn;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
}

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
        {
            fragment = new FragmentA();
        }
        else if (position == 1)
        {
            fragment = new FragmentB();
        }
        else if (position == 2)
        {
            fragment = new FragmentC();
        }
        else if (position == 3)
        {
            fragment = new FragmentD();
        }
        else if (position == 4)
        {
            fragment = new FragmentE();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0)
        {
        }
        else if (position == 1)
        {
        }
        else if (position == 2)
        {
        }
        else if (position == 3)
        {
        }
        else if (position == 4)
        {
        }
        return title;
    }
}
