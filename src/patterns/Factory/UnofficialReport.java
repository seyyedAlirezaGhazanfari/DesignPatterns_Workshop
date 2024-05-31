package patterns.Factory;

public class UnofficialReport extends Report {
    @Override
    public void handle() {
        System.out.println("it started unofficial to handle");
        this.close();
    }

    @Override
    public void close() {
        System.out.println("it is finished unofficial");
    }
}
