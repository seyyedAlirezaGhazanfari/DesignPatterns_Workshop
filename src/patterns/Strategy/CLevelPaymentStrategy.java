package patterns.Strategy;

public class CLevelPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("c levels are paid");
    }
}
