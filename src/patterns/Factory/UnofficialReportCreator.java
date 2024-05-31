package patterns.Factory;

public class UnofficialReportCreator extends ReportCreator{
    @Override
    public Report createReport() {
        return new UnofficialReport();
    }
}
