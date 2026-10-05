package com.Qualifier_Primary;

import org.springframework.stereotype.Component;

@Component("QrPayment")
public class PaymentType {
	private String paymentType;
	
	public PaymentType() {
		System.out.println("PaymentType are created..");
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
}
