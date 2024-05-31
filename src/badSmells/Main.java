package badSmells;

public class Main {
    private static void hrSetFrontSalary() {
        Employee employee = new Employee("mohammad");
        Admin admin = new Admin("alireza", "0000Q1291");
        admin.setSalary(employee, 34);
    }

    private static void hrSetBackSalary() {
        Employee employee = new Employee("asghar");
        Admin admin = new Admin("alireza", "000Q1291");
        admin.setSalary(employee, 36);
    }
    public static void main(String[] args) {
        // Singleton
        hrSetFrontSalary();
        hrSetBackSalary();

    }
}
