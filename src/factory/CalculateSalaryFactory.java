package factory;

import asset.EmployeeSalary;
import entities.Employee;

public interface CalculateSalaryFactory {
    public EmployeeSalary calculateSalaryPerEmployee (Employee employee);
}
