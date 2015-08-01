package com.teamtreehouse.mememaker.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Joey Mejias on 8/1/15.
 */
public class MemeDataSource {

    private Context mContext;
    private MemeSQLiteHelper mMemeSqlLiteHelper;

    public MemeDataSource(Context context) {

        mContext = context;
        mMemeSqlLiteHelper = new MemeSQLiteHelper(context);
        SQLiteDatabase database = mMemeSqlLiteHelper.getReadableDatabase();
        database.close();
    }
}
