package com.cognizant.singleton;

public class SingletonPatternExample {

    public static void main(String[] args) {

        Logger first = Logger.getLogger();
        Logger second = Logger.getLogger();

        first.print("Application Started");

        if (first == second)
            System.out.println("Singleton Verified");
    }
}