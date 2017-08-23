package com.developerhaoz.matisseanalysis;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.zhihu.matisse.Matisse;
import com.zhihu.matisse.engine.impl.GlideEngine;

import static android.content.ContentResolver.SCHEME_CONTENT;

/**
 * Created by developerHaoz on 2017/8/17.
 */

public class ThirdActivity extends AppCompatActivity {

    private static final String TAG = "ThirdActivity";
    private static final int REQUEST_CODE_CHOOSE = 1;

    private Uri testUri = Uri.parse("content://media/external/images/media/874");

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.d(TAG, "onCreate: getPath" + testUri.getPath());
        Log.d(TAG, "onCreate: " + getPath(this.getContentResolver(), testUri));

        findViewById(R.id.third_btn_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Matisse.from(ThirdActivity.this)
                        .choose(com.zhihu.matisse.MimeType.allOf())
                        .theme(R.style.Matisse_Dracula)
                        .countable(false)
                        .maxSelectable(9)
                        .imageEngine(new GlideEngine())
                        .forResult(REQUEST_CODE_CHOOSE);
            }
        });

    }

    public static String getPath(ContentResolver resolver, Uri uri) {
        if (uri == null) {
            return null;
        }
        ContactsContract.Contacts.CONTENT_URI

        if (SCHEME_CONTENT.equals(uri.getScheme())) {
            Cursor cursor = null;
            try {
                cursor = resolver.query(uri, new String[]{MediaStore.Images.ImageColumns.DATA},
                        null, null, null);
                if (cursor == null || !cursor.moveToFirst()) {
                    return null;
                }
                return cursor.getString(cursor.getColumnIndex(MediaStore.Images.ImageColumns.DATA));
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return uri.getPath();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == REQUEST_CODE_CHOOSE){
            Log.d(TAG, "onActivityResult: " + Matisse.obtainResult(data).get(0));
        }
    }
}
