package service;

public class CommissionedPayment extends PaymentEmployee {

    @Override
    public Double calculateEmployeePayment(Double value) {
        return value + (value * (0.25));
    }
}