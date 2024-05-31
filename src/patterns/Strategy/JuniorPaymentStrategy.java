package patterns.Strategy;

public class JuniorPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("juniors paid");
    }
}
