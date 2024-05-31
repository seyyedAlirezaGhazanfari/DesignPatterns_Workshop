package patterns.Facade;

import patterns.Employee;
import patterns.Singleton.Admin;
import patterns.Team;

public class ExitEmployeeFacade {
    public boolean canHeGoOut(String employeeID) {
        Employee employee = Employee.findEmployee(employeeID);
        boolean result = false;
        if (employee.getTeam() == Team.TECH) {
            if (employee.getSalary() > 10000) {
                result = Admin.getInstance().checkTechForExit(employee);
            }
        } else {
            result = Admin.getInstance().checkOtherEmployeeExit(employee);
        }
        return result;
    }
}
