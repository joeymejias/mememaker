package com.teamtreehouse.mememaker.models;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by Joey Mejias on 8/1/15.
 */
public class ImageItem {
    private Bitmap mBitmap;
    private String mText;

    public ImageItem(String filePath, String text) {
        mBitmap = BitmapFactory.decodeFile(filePath);
        mText = text;
    }

    public Bitmap getBitmap() {
        return mBitmap;
    }

    public String getText() {
        return mText;
    }
}
