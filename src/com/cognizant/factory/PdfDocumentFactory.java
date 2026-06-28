package com.cognizant.factory;

public class PdfDocumentFactory extends DocumentFactory {

    public Document create() {
        return new PdfDocument();
    }
}