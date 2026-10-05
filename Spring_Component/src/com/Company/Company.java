package com.Company;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Value("101")
	private int companyId;
	@Value("Amazon")
	private String companyName;

	public Company() {
		System.out.println("Software development");
	}

	public void displayInf() {
		System.out.println("id- " + companyId + " name- " + companyName);
	}

	public Company(int companyId, String companyName) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
