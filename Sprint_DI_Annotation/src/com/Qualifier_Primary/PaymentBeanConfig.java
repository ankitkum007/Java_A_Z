package com.Qualifier_Primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan("com.Qualifier_Primary")
public class PaymentBeanConfig {
	
	@Bean
	public PaymentType upiPayment() {
		PaymentType upi = new PaymentType();
		upi.setPaymentType("upi payment");
		return upi;
	}
	@Primary
	@Bean
	public PaymentType creditCard() {
		PaymentType card1 = new PaymentType();
		card1.setPaymentType("credit card payment");
		return card1;
	}
	@Bean
	public PaymentType debitCard() {
		PaymentType card2 = new PaymentType();
		card2.setPaymentType("debit card payment");
		return card2;
	}
}
