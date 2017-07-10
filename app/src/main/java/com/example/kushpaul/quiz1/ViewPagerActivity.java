package com.example.kushpaul.quiz1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> list=new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();
        viewPager = (ViewPager)findViewById(R.id.activity_view_pager);
        list.add(new RedFragment());
        list.add(new GreenFragment());
        list.add(new BlueFragment());
        BaseViewPageAdapter pagerAdapter = new BaseViewPageAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(pagerAdapter);

    }

    public ViewPagerActivity() {
        super();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","onDestroy");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart");
    }
}
