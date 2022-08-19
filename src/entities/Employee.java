package entities;

import enums.TypeWorker;

public class Employee {
    private String name;
    private Double salary;

    private Integer hour;

    private String typeWorker;

    public Employee(String name, Double salary, String typeWorker, Integer hour){
        this.name = name;
        this.salary = salary;
        this.typeWorker = typeWorker;
        this.hour = hour;
    }


    public String getTypeWorker() {
        return typeWorker;
    }

    public void setTypeWorker(String typeWorker) {
        this.typeWorker = typeWorker;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }
}
