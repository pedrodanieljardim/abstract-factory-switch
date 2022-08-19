package factory.impl;

import asset.EmployeeSalary;
import entities.Employee;
import factory.CalculateSalaryFactory;
import service.CommissionedPayment;
import service.HourlyPayment;
import service.SalariedPayment;

public class CalculateSalaryImpl implements CalculateSalaryFactory {
    @Override
    public EmployeeSalary calculateSalaryPerEmployee(Employee employee) {

        SalariedPayment s = new SalariedPayment();
        HourlyPayment h = new HourlyPayment();
        CommissionedPayment c = new CommissionedPayment();

        switch (employee.getTypeWorker()){
            case "salaried":
                return new EmployeeSalary(s.calculateEmployeePayment(employee.getSalary()), "salaried");
            case "hourly":
                return new EmployeeSalary(h.calculateEmployeePayment(employee.getSalary()), "hourly");
            case "commissioned":
                return new EmployeeSalary(c.calculateEmployeePayment(employee.getSalary()), "commissioned");
            default:
                return new EmployeeSalary(0.0, "nothing else");
        }
    }
}
