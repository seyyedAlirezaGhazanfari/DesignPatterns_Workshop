package patterns.Adapter;

import patterns.Employee;

public class Reciept {
    private Employee employee;
    private int taxRate;
    private int insuranceRate;

    private float amount;

    public float getAmount() {
        return amount;
    }

    public Reciept(Employee employee, int taxRate, int insuranceRate) {
        this.employee = employee;
        this.taxRate = taxRate;
        this.insuranceRate = insuranceRate;
        this.calculateShares();
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }

    public int getInsuranceRate() {
        return insuranceRate;
    }

    public void setInsuranceRate(int insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

    public void calculateShares() {
        this.amount = this.getEmployee().getSalary() - this.getTaxRate() * 10 - this.getInsuranceRate() * 20;
    }
}
