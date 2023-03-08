package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialization
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        TabItem tabChat = findViewById(R.id.tab_chats);
        TabItem tabStatus = findViewById(R.id.tab_status);
        TabItem tabCalls = findViewById(R.id.tab_Calls);
        ViewPager viewPager = findViewById(R.id.view_pager);

        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        // To join tab layout with viewpager
        tabLayout.setupWithViewPager(viewPager);
    }
}