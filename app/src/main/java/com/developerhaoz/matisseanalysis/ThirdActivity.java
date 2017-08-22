package com.developerhaoz.matisseanalysis;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by developerHaoz on 2017/8/17.
 */

public class ThirdActivity extends AppCompatActivity {

    private static final String TAG = "ThirdActivity";

    private TextView mTvShowData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        mTvShowData = (TextView) findViewById(R.id.third_tv_show_data);
        Intent intent = getIntent();


        if(intent != null){
            ParcelBeanTest parcelBeanTest = intent.getParcelableExtra(SecondActivity.KEY_PARCELBEAN);
            mTvShowData.setText(parcelBeanTest.toString());
        }
    }
}
