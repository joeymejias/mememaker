package com.teamtreehouse.mememaker;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.teamtreehouse.mememaker.utils.StorageType;

/**
 * Created by Joey Mejias on 8/1/15.
 */
public class MemeMakerApplicationSettings {
    SharedPreferences mSharedPreferences;

    public MemeMakerApplicationSettings(Context context) {
            mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public String getStoragePreferences() {
        return mSharedPreferences.getString("Storage", StorageType.INTERNAL);
    }

    public void setSharedPreferences(String storageType) {
        mSharedPreferences
                .edit()
                .putString("Storage", storageType)
                .apply();
    }
}
