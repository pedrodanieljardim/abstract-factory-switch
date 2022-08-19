import entities.Employee;
import factory.impl.CalculateSalaryImpl;
import service.CalculateSalary;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Pedro", 10000.00, "commissioned", 220);
        Employee e2 = new Employee("Miguel", 3000.00, "hourly", 100);
        Employee e3 = new Employee("Maria", 4532.00, "salaried", 300);

        System.out.println(String.format("%s receberá R$ %.2f", e1.getName(), CalculateSalary.CalculateSalaryPerEmployee(e1)));
        System.out.println(String.format("%s receberá R$ %.2f", e2.getName(), CalculateSalary.CalculateSalaryPerEmployee(e2)));
        System.out.println(String.format("%s receberá R$ %.2f", e3.getName(), CalculateSalary.CalculateSalaryPerEmployee(e3)));

        CalculateSalaryImpl calculateSalary = new CalculateSalaryImpl();
        System.out.println(String.format("%s receberá R$ %.2f", e1.getName(), calculateSalary.calculateSalaryPerEmployee(e1).getValue()));
        System.out.println(String.format("%s receberá R$ %.2f", e2.getName(), calculateSalary.calculateSalaryPerEmployee(e2).getValue()));
        System.out.println(String.format("%s receberá R$ %.2f", e3.getName(), calculateSalary.calculateSalaryPerEmployee(e3).getValue()));


    }
}