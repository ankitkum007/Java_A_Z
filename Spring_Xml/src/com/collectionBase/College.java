package com.collectionBase;
import java.util.*;

public class College {
	private List<String> studentName;
	private Set<Integer> numbers; 
	private Map<Integer, String> user;
	
	
	public Map<Integer, String> getUser() {
		return user;
	}

	public void setUser(Map<Integer, String> user) {
		this.user = user;
	}
	
	public void printMap() {
		System.out.println(user);
	}

	public Set<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(Set<Integer> numbers) {
		this.numbers = numbers;
	}

	public College() {
		System.out.println("college bean created");
	}

	public List<String> getStudentName() {
		return studentName;
	}

	public void setStudentName(List<String> studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "studentName=" + studentName +
				"numbers=" + numbers;
	}
}
