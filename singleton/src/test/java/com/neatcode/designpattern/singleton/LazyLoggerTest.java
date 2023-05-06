package com.neatcode.designpattern.singleton;

import org.junit.jupiter.api.Test;

public class LazyLoggerTest {
    @Test
    public void testSingleton() {
        MyLogger logger1 = LazyLogger.getInstance();
        MyLogger logger2 = LazyLogger.getInstance();
        assert logger1 instanceof MyLogger;
        assert logger2 instanceof MyLogger;
        assert logger2 == logger1;
        logger1.log("Logger1 is " + logger1);
        logger2.log("Logger2 is " + logger2);
    }
}
