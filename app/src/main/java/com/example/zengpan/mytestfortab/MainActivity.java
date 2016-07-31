package com.example.zengpan.mytestfortab;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ScrollingTabContainerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TabLayout tab;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initID();
        setup();
    }

    private void initID()
    {
        tab = (TabLayout)findViewById(R.id.tab_lay);
        viewPager = (ViewPager)findViewById(R.id.view_pager);
    }

    private void setup()
    {
        if(tab == null || viewPager == null)
        {
            Log.e(TAG, "setup is null");
        }

        List<String> titlelist = new ArrayList<String>();
        titlelist.add("小说");
        titlelist.add("音乐");
        List<Fragment> Fraglist = new ArrayList<Fragment>();
        Fraglist.add(new Fragment1());
        Fraglist.add(new Fragment2());
        viewPager.setAdapter(new Adapter(getSupportFragmentManager(), Fraglist, titlelist));
//        viewPager.setCurrentItem(0);
        tab.setupWithViewPager(viewPager);

    }
}
