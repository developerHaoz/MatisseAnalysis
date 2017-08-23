package com.developerhaoz.matisseanalysis;

import android.app.LoaderManager;
import android.content.Context;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;

import java.lang.ref.WeakReference;

/**
 * Created by developerHaoz on 2017/8/22.
 */

public class AlbumCollection implements LoaderManager.LoaderCallbacks<Cursor> {

    private static final int LOADER_ID = 1;
    private static final String STATE_CURRENT_SELECTION = "state_current_selection";
    private WeakReference<Context> mContext;
    private LoaderManager mLoaderManager;
    private AlbumCallbacks mCallbacks;
    private int mCurrentSelection;


    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }

    public interface AlbumCallbacks{
        void onAlbumLoad(Cursor curosr);

        void onAlbumReset();
    }
}
