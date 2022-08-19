package service;

public class HourlyPayment extends PaymentEmployee {

    @Override
    public Double calculateEmployeePayment(Double value) {
        return value + (value * (0.25));
    }
}