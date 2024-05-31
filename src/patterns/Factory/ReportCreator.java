package patterns.Factory;

public abstract class ReportCreator {
    public void notifyReport(String reporterID, String text) {
        Report report = createReport();
        report.setReportID(reporterID);
        report.setSubject(text);
        report.handle();
    }
    public abstract Report createReport();
}
