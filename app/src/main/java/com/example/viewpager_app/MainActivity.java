package com.example.viewpager_app;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    MyViewPagerAdapter myAdapter;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);

        myAdapter = new MyViewPagerAdapter(
                getSupportFragmentManager(),getLifecycle()
        );

        //adding fragments to list in the adapter class
        myAdapter.addFragments(new Fragment1());
        myAdapter.addFragments(new Fragment_2());
        myAdapter.addFragments(new Fragment_3());


        //setup the orientation in ViewPager2
        viewPager2 = findViewById(R.id.viewPager2);
        viewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        //Connecting the Adapter to Viewpager2
        viewPager2.setAdapter(myAdapter);

        //Connecting TabLayout with ViewPager
        new TabLayoutMediator(
                tabLayout,
                viewPager2,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        tab.setText("Fragment "+(position +1));
                    }
                }
        ).attach();
    }
}