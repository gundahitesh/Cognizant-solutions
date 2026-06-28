package com.cognizant.factory;

public class ExcelDocumentFactory extends DocumentFactory {

    public Document create() {
        return new ExcelDocument();
    }
}