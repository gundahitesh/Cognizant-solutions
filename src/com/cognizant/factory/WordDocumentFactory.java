package com.cognizant.factory;

public class WordDocumentFactory extends DocumentFactory {

    public Document create() {
        return new WordDocument();
    }
}