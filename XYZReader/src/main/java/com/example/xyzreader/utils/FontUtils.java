package com.example.xyzreader.utils;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by bapspatil
 */

public class FontUtils {

    public static Typeface getCabinTypeface(Context context, String fontFile) {
        return Typeface.createFromAsset(context.getAssets(), fontFile);
    }
}
