package com.neatcode.designpattern.singleton;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

public class EnumLoggerTest {
    @Test
    public void testSingleton() {
        MyLogger logger1 = EnumLogger.INSTANCE;
        MyLogger logger2 = EnumLogger.INSTANCE;
        assert logger1 instanceof MyLogger;
        assert logger2 instanceof MyLogger;
        assert logger2 == logger1;
        logger1.log("Logger1 is " + logger1 + " : " + logger1.hashCode());
        logger2.log("Logger2 is " + logger2 + " : " + logger2.hashCode());
    }
}
