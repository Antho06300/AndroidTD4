package com.example.anthony.td4;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Anthony on 01/10/2016.
 */

public class TabsActivity  extends AppCompatActivity implements ActionBar.TabListener {


    private ViewPager mViewPager;
    private ExamplePagerAdapter mExamplePagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final android.app.ActionBar actionBar = getActionBar();


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mExamplePagerAdapter);


        // Specify that tabs should be displayed in the action bar.
        if (actionBar != null) {
            actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        }

        // Add 2 tabs, specifying the tab’s text and TabListener
        actionBar.addTab(
                actionBar.newTab()
                        .setText("Text")
                        .setTabListener(this));
        actionBar.addTab(
                actionBar.newTab()
                        .setText("Number")
                        .setTabListener(this));

        mViewPager.setOnPageChangeListener(
                new ViewPager.SimpleOnPageChangeListener() {
                    @Override
                    public void onPageSelected(int position) {
                        // When swiping between pages, select the
                        // corresponding tab.
                        actionBar.setSelectedNavigationItem(position);
                    }
                });
    }

    // Create a tab listener that is called when the user changes tabs.
     /*   tabListener = new ActionBar.TabListener() {  */
    @Override
    public void onTabSelected(ActionBar.Tab tab, android.app.FragmentTransaction ft) {
        // show the given tab
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, android.app.FragmentTransaction ft) {
        // hide the given tab
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, android.app.FragmentTransaction ft) {
        // probably ignore this event
    }


}
