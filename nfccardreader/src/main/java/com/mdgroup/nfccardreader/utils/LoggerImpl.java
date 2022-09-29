package com.mdgroup.nfccardreader.utils;

import android.util.Log;

public class LoggerImpl implements Logger {

    private String TAG = "NfcCardReader";

    @Override
    public void d(String msg) {
        Log.d(TAG, msg);
    }

    @Override
    public void e(String msg) {
        Log.e(TAG, msg);
    }

    @Override
    public void e(Throwable tr) {
        Log.e(TAG, "", tr);
    }

    @Override
    public void e(Throwable tr, String msg) {
        Log.e(TAG, msg, tr);
    }
}