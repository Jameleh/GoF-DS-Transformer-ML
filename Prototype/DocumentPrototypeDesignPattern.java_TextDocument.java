class TextDocument implements Document {
    private String filePath;
    private String encoding;
    private int wordCount;
    
    public TextDocument() {
        System.out.println("Creating a Text Document prototype.");
        // Initialize with default values
        this.filePath = "default.txt";
        this.encoding = "UTF-8";
        this.wordCount = 0;
    }
    
    @Override
    public Document clone() {
        TextDocument copy = new TextDocument();
        copy.filePath = this.filePath;
        copy.encoding = this.encoding;
        copy.wordCount = this.wordCount;
        return copy;
    }
    
    @Override
    public void open() {
        System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
        System.out.println("Type: " + getType() + ", Path: " + filePath + ", Encoding: " + encoding + ", Words: " + wordCount);
    }
    
    @Override
    public String getType() {
        return "Text";
    }
    
    // Setters for customizing cloned objects
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
    
    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }    
}