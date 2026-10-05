package com.Qualifier_Primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatway {
	private int amount;
	private String accountHolder;

	@Qualifier("upiPayment")
	@Autowired
	private PaymentType paymentType; // 4 -> qr,upi,credit,debit, 

	public PaymentGatway() {
		System.out.println("Payment Gatway crated");
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

}
