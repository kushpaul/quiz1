package com.example.kushpaul.quiz1;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by KushPaul on 6/21/17.
 */

public class BaseViewPageAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> list;

    public BaseViewPageAdapter(FragmentManager fm) {
        super(fm);
    }
    public BaseViewPageAdapter(FragmentManager fm, ArrayList<Fragment> list) {
        super(fm);
        this.list=list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
