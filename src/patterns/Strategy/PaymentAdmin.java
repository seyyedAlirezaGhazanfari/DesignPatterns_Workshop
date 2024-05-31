package patterns.Strategy;

public class PaymentAdmin {
    private PaymentStrategy strategy;

    public PaymentAdmin(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay() {
        this.strategy.pay();
    }
}
