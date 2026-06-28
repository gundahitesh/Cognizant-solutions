package com.cognizant.factory;

public abstract class DocumentFactory {

    public abstract Document create();

    public void display() {
        System.out.println("Created : " + create().getType());
    }
}