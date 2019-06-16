package com.gonuclei.logutil;

import android.util.Log;

public class LogDebug {
    private static final String TAG="LogDebug.java";
    public static void d(String message){
        Log.d(TAG,message);
    }
}
