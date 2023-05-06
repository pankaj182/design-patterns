package com.neatcode.designpattern.singleton;

public class EagerLogger implements MyLogger {
    private static EagerLogger instance = new EagerLogger();

    private EagerLogger() {
        // Initialize the logging system
    }

    public static MyLogger getInstance() {
        return instance;
    }
}
