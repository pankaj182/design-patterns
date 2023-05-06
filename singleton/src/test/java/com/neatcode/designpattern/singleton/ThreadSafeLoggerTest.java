package com.neatcode.designpattern.singleton;

import org.junit.jupiter.api.Test;

public class ThreadSafeLoggerTest {
    @Test
    public void testSingleton() {
        MyLogger logger1 = ThreadSafeLogger.getInstance();
        MyLogger logger2 = ThreadSafeLogger.getInstance();
        assert logger1 instanceof MyLogger;
        assert logger2 instanceof MyLogger;
        assert logger2 == logger1;
        logger1.log("Logger1 is " + logger1);
        logger2.log("Logger2 is " + logger2);
    }
}
