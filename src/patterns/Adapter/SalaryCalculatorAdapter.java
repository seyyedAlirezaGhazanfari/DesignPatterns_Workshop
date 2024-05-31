package patterns.Adapter;

import patterns.Employee;

public class SalaryCalculatorAdapter implements HRSalaryCalculator {

    private SalaryCalculatorService adaptee;

    public SalaryCalculatorAdapter(SalaryCalculatorService adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int showSalary(Employee employee) {
        FinanceConfig config = FinanceConfig.getInstance();
        Reciept reciept = new Reciept(employee, config.getTaxRate() / 100, config.getInsuranceRate() / 100);
        return (int) this.adaptee.calculateSalary(reciept);
    }
}
