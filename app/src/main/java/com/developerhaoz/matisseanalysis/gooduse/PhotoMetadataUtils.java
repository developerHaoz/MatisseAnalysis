package com.developerhaoz.matisseanalysis.gooduse;

/**
 *  工具类没必要初始化，直接设置成 final 类，而且让构造器私有化，防止 new 出实例
 *
 * Created by developerHaoz on 2017/8/22.
 */

public final class PhotoMetadataUtils {

    private static final String TAG = "PhotoMetadataUtils";
    private static final int MAX_WIDTH = 1_600;
    private static final String SCHEME_CONTENT = "content";

    private PhotoMetadataUtils(){
        throw new AssertionError("oops! the utility class is about to be instantiated...");
    }


}



























