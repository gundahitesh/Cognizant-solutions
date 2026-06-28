package com.cognizant.factory;

public class FactoryMethodPatternExample {

    public static void main(String[] args) {

        DocumentFactory[] factories = {
                new WordDocumentFactory(),
                new PdfDocumentFactory(),
                new ExcelDocumentFactory()
        };

        for (DocumentFactory factory : factories) {
            factory.display();
        }
    }
}