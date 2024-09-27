package com.spring.aop;

import com.spring.aop.service.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");

        PaymentService payment = con.getBean("payment", PaymentService.class);

        payment.makePayment(123);

    }
}
