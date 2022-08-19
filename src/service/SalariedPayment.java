package service;

public class SalariedPayment extends PaymentEmployee {

    @Override
    public Double calculateEmployeePayment(Double value) {
        return value + (value * (0.25));
    }
}