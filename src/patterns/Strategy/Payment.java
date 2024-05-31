package patterns.Strategy;

public class Payment {
    private PaymentStrategy strategy;

    public Payment(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void doJob() {
        this.strategy.pay();
    }
}
