package com.developerhaoz.matisseanalysis.gooduse;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

import static android.content.ContentResolver.SCHEME_CONTENT;

/**
 * Created by developerHaoz on 2017/8/22.
 */

public class UriHelper {

    /**
     * 将文件的 Uri 转换成文件的路径
     *
     * @param resolver
     * @param uri
     * @return
     */
    public static String getPath(ContentResolver resolver, Uri uri){
        if(uri == null){
            return null;
        }

        if(SCHEME_CONTENT.equals(uri.getScheme())){
            Cursor cursor = null;
            try{
                cursor = resolver.query(uri, new String[]{MediaStore.Images.ImageColumns.DATA}, null, null, null);
                if(cursor == null || !cursor.moveToFirst()){
                    return null;
                }
                return cursor.getString(cursor.getColumnIndex(MediaStore.Images.ImageColumns.DATA));
            }finally {
                if(cursor != null){
                    cursor.close();
                }
            }
        }
        return uri.getPath();
    }
}



















