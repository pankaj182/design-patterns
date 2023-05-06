package com.neatcode.designpattern.singleton;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

public class EagerLoggerTest {
    @Test
    public void testSingleton() {
        MyLogger logger1 = EagerLogger.getInstance();
        MyLogger logger2 = EagerLogger.getInstance();
        assert logger1 instanceof MyLogger;
        assert logger2 instanceof MyLogger;
        assert logger2 == logger1;
        logger1.log("Logger1 is " + logger1);
        logger2.log("Logger2 is " + logger2);
    }

    @Test
    void testMultipleCallsReturnTheSameObjectInDifferentThreads() throws Exception {
        assertTimeout(ofMillis(10000), () -> {
            // Create 10000 tasks and inside each callable instantiate the singleton class
            final var tasks = IntStream.range(0, 10000)
                .<Callable<MyLogger>>mapToObj(i -> EagerLogger::getInstance)
                .collect(Collectors.toCollection(ArrayList::new));

            // Use up to 6 concurrent threads to handle the tasks
            final var executorService = Executors.newFixedThreadPool(6);
            final var results = executorService.invokeAll(tasks);

            // wait for all the threads to complete
            final var expectedInstance = EagerLogger.getInstance();
            for (var res : results) {
                final var instance = res.get();
                assertNotNull(instance);
                assertSame(expectedInstance, instance);
            }
            executorService.shutdown();
        });
    }
}
