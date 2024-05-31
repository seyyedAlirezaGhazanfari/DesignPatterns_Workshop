package patterns;

import java.util.ArrayList;

public class Employee {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private int salary;
    private String name;
    private Team team;

    private String id;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Employee(String name, Team team, String id) {
        this.team = team;
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static Employee findEmployee(String id) {
        for (Employee employee: employees) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }
}
