package badSmells;

public class Admin {
    private String name;
    private String id;

    public Admin(String name, String id) {
        this.name = name;
        this.id = id;
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
}
