package com.developerhaoz.matisseanalysis;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by developerHaoz on 2017/8/17.
 */

public class SecondActivity extends AppCompatActivity {

    public static final String KEY_PARCELBEAN = "key_parcelable";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
//        findViewById(R.id.second_btn_send_data).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ParcelBeanTest parcelBeanTest = new ParcelBeanTest("Tom", "engineer", 23);
//                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
//                intent.putExtra(KEY_PARCELBEAN, parcelBeanTest);
//                startActivity(intent);
//            }
//        });
    }


}
