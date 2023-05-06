package com.neatcode.designpattern.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.neatcode")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
