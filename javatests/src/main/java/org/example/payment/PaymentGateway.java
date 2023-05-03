package org.example.payment;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);

}
