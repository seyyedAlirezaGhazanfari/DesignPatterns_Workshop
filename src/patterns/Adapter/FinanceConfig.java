package patterns.Adapter;

public class FinanceConfig {
    private static FinanceConfig instance = null;
    private int taxRate;
    private int insuranceRate;
    private FinanceConfig(int taxRate, int insuranceRate) {
        this.insuranceRate = insuranceRate;
        this.taxRate = taxRate;
    }

    public static FinanceConfig getInstance() {
        if (instance != null) {
            return instance;
        }
        instance = new FinanceConfig(20, 30);
        return instance;
    }

    public int getTaxRate() {
        return taxRate;
    }

    public int getInsuranceRate() {
        return insuranceRate;
    }
}
