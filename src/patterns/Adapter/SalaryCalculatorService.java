package patterns.Adapter;

public class SalaryCalculatorService {
    public float calculateSalary(Reciept reciept) {
        // yearly change the rate of taxes over all reciept
        reciept.setTaxRate(20);
        reciept.calculateShares();
        return reciept.getAmount();
    }
}
