package com.College.Q_P;

import org.springframework.stereotype.Component;

@Component
public class Course {

	private String course;

	public Course() {
		System.out.println("list of course");
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return course;
	}
	

}
