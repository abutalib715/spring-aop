package com.spring.aop.service;

public class PaymentServiceImpl implements PaymentService {

    public void makePayment(int amount) {
        System.out.println(amount + " amount debited/created");
    }
}
