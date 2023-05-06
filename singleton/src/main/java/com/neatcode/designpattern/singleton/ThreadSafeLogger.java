package com.neatcode.designpattern.singleton;

public class ThreadSafeLogger implements MyLogger{
    private static volatile MyLogger instance = null;

    private ThreadSafeLogger() {}

    public static MyLogger getInstance() {
        if(instance == null) {
            synchronized (ThreadSafeLogger.class) {
                if(instance == null) {
                    instance = new ThreadSafeLogger();
                }
            }
        }
        return instance;
    }
}

