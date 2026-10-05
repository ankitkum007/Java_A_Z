package com.Qualifier_Primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Flipkart {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(PaymentBeanConfig.class);

		PaymentGatway getway = (PaymentGatway) container.getBean("paymentGatway");

		PaymentType type = getway.getPaymentType();

		System.out.println(type.getPaymentType());

		((AbstractApplicationContext) container).close();
	}

}
