class DocumentRegistry {
    private Document pdfPrototype;
    private Document textDocumentPrototype;
    private Document spreadsheetPrototype;
    
    public DocumentRegistry() {
        // Initialize prototypes
        pdfPrototype = new PdfDocument();
        textDocumentPrototype = new TextDocument();
        spreadsheetPrototype = new SpreadsheetDocument();
    }
    
    public Document getPdfPrototype() {
        return pdfPrototype.clone();
    }
    
    public Document getTextDocumentPrototype() {
        return textDocumentPrototype.clone();
    }
    
    public Document getSpreadsheetPrototype() {
        return spreadsheetPrototype.clone();
    }
    
    // Factory methods as shown in the UML
    public Document createSheep(String name) {
        // This simulates the Animal example from the UML while using our document system
        Document doc = getPdfPrototype();
        if (doc instanceof PdfDocument) {
            ((PdfDocument) doc).setName(name);
        }
        return doc;
    }
    
    public Document createCow() {
        // This simulates the Animal example from the UML
        return getTextDocumentPrototype();
    }
    
    public Document createHorse() {
        // This simulates the Animal example from the UML
        return getSpreadsheetPrototype();
    }
}