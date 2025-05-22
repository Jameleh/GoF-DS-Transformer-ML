class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();
        
        // Create a PDF document
        PdfDocument annualReport = (PdfDocument) registry.getPdfPrototype();
        annualReport.setFileName("annual_report_2024.pdf");
        annualReport.setAuthor("Acme Corp");
        annualReport.setPageCount(150);
        annualReport.open();
        
        // Create a Text document
        TextDocument meetingNotes = (TextDocument) registry.getTextDocumentPrototype();
        meetingNotes.setFilePath("meeting_notes.txt");
        meetingNotes.setEncoding("UTF-8");
        meetingNotes.setWordCount(250);
        meetingNotes.open();
        
        // Create a Spreadsheet document
        SpreadsheetDocument salesData = (SpreadsheetDocument) registry.getSpreadsheetPrototype();
        salesData.setSpreadsheetName("sales_data_q1.xlsx");
        salesData.setRowCount(1000);
        salesData.setColumnCount(20);
        salesData.open();
        
        // Create another PDF document
        PdfDocument summaryReport = (PdfDocument) registry.getPdfPrototype();
        summaryReport.setFileName("summary_report.pdf");
        summaryReport.setAuthor("Acme Corp");
        summaryReport.setPageCount(30);
        summaryReport.open();
    }
}