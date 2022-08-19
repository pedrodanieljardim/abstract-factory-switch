package service;

import entities.Employee;
import enums.TypeWorker;


public class CalculateSalary {

    public static Double CalculateSalaryPerEmployee(Employee employee){
        switch (employee.getTypeWorker()){
            case "salaried":
                return calculateSalaried(employee);
            case "hourly":
                return calculateHourly(employee);
            case "commissioned":
                return calculateComissioned(employee);
            default:
                return 0.0;
        }
    }

    public static Double calculateSalaried(Employee employee){
        return employee.getSalary();
    }

    public static Double calculateHourly(Employee employee){
        return employee.getHour() * 5.0;
    }

    public static Double calculateComissioned(Employee employee){
        return employee.getSalary() + (employee.getSalary() * (0.25));
    }
}
