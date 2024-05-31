package patterns.Singleton;

import patterns.Employee;

import java.lang.foreign.StructLayout;

public class Admin {
    private String name;
    private String id;

    private static Admin instance = null;

    private Admin(String name, String id) {
        this.id = id;
        this.name = name;
    }

    public static Admin getInstance() {
        if (instance != null) {
            return instance;
        }
        instance = new Admin("alireza", "0000q1290");
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(Employee employee, int salary) {
        System.out.println(this.id);
        employee.setSalary(salary);
    }

    public void notifyAdminForMilitaryRequest() {
        System.out.println("notified admin of hr");
    }

    public boolean checkTechForExit(Employee employee) {
        System.out.println("checking");
        return true;
    }

    public boolean checkOtherEmployeeExit(Employee employee) {
        System.out.println("checking");
        return true;
    }
}
