package com.example.zengpan.mytestfortab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/7/31.
 */
public class Adapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentlist;
    private List<String> titlelist;

    public Adapter(FragmentManager fm, List<Fragment> fragmentlist, List<String> titlelist) {
        super(fm);
        this.fragmentlist = fragmentlist;
        this.titlelist = titlelist;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentlist.get(position);
    }

    @Override
    public int getCount() {
        return fragmentlist.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titlelist.get(position);
    }
}
