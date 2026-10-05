package com.College.Q_P;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Value("CS")
	private String provideCourse;
	@Value("5500")
	private double fee;
	
	@Qualifier("cyberSecurity")
	@Autowired
	private Course course;

	public College() {
		System.out.println("College provide these course");
	}

	public String getProvideCourse() {
		return provideCourse;
	}

	public void setProvideCourse(String provideCourse) {
		this.provideCourse = provideCourse;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Course getCourse() {
		return course;
	}

	@Override
	public String toString() {
		return "College [provideCourse=" + provideCourse + ", fee=" + fee + ", course=" + course + "]";
	}
	
	

}
