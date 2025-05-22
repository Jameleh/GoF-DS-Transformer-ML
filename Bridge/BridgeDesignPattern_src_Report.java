public abstract class Report {
    private IReportFormat reportFormat;
    public Report(IReportFormat reportFormat) {
        this.reportFormat = reportFormat;
    }
    public IReportFormat getReportFormat() {
        return reportFormat;
    }

    private void setReportFormat(IReportFormat reportFormat) {
        this.reportFormat = reportFormat;
    }


    public abstract void display();
}
