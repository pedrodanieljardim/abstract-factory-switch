package asset;

public class EmployeeSalary {

    private Double value;
    private String calculateMethod;

    public EmployeeSalary(Double value, String calculateMethod){
        this.value = value;
        this.calculateMethod = calculateMethod;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getCalculateMethod() {
        return calculateMethod;
    }

    public void setCalculateMethod(String calculateMethod) {
        this.calculateMethod = calculateMethod;
    }
}
