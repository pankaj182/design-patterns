package com.neatcode.designpattern.singleton;

public class LazyLogger implements MyLogger {
    private static LazyLogger instance = null;

    private LazyLogger() {
        // Initialize the logging system
    }

    public static MyLogger getInstance() {
        if(instance == null) {
            instance = new LazyLogger();
        }
        return instance;
    }
}
