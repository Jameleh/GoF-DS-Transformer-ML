class SpreadsheetDocument implements Document {
    private String spreadsheetName;
    private int rowCount;
    private int columnCount;
    
    public SpreadsheetDocument() {
        System.out.println("Creating a Spreadsheet Document prototype.");
        // Initialize with default values
        this.spreadsheetName = "default.xlsx";
        this.rowCount = 0;
        this.columnCount = 0;
    }
    
    @Override
    public Document clone() {
        SpreadsheetDocument copy = new SpreadsheetDocument();
        copy.spreadsheetName = this.spreadsheetName;
        copy.rowCount = this.rowCount;
        copy.columnCount = this.columnCount;
        return copy;
    }
    
    @Override
    public void open() {
        System.out.println("Opening Spreadsheet Document: " + spreadsheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
        System.out.println("Type: " + getType() + ", Name: " + spreadsheetName + ", Rows: " + rowCount + ", Columns: " + columnCount);
    }
    
    @Override
    public String getType() {
        return "Spreadsheet";
    }
    
    // Setters for customizing cloned objects
    public void setSpreadsheetName(String spreadsheetName) {
        this.spreadsheetName = spreadsheetName;
    }
    
    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }
    
    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }
}