package com.mdgroup.nfccardreader.utils;

public interface Logger {

    public void d(String msg);

    public void e(String msg);

    public void e(Throwable tr);

    public void e(Throwable tr, String msg);
}