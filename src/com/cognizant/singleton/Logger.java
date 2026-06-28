package com.cognizant.singleton;

public class Logger {

    private static Logger logger = new Logger();

    private Logger() {
    }

    public static Logger getLogger() {
        return logger;
    }

    public void print(String message) {
        System.out.println("[LOG] " + message);
    }
}