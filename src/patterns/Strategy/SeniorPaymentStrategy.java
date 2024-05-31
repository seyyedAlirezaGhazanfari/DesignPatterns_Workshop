package patterns.Strategy;

public class SeniorPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("seniors paid");
    }
}
