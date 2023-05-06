package com.neatcode.designpattern.singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface MyLogger {
    default void log(String message){
        StringBuilder builder = new StringBuilder();
        builder.append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")))
            .append(": ")
            .append(message);
        System.out.println(builder);
    }
}
