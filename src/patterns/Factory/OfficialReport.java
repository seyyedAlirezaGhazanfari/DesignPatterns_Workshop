package patterns.Factory;

public class OfficialReport extends Report {
    @Override
    public void handle() {
        System.out.println("it started to handle officially");
        this.close();
    }

    @Override
    public void close() {
        System.out.println("it is finished officially");
    }
}
