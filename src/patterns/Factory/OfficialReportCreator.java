package patterns.Factory;

public class OfficialReportCreator extends ReportCreator{
    @Override
    public Report createReport() {
        return new OfficialReport();
    }
}
