package com.Company.dept;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JavaDept {
	private String projectName;
	private String durationOfProject;
	
	public String getProjectName() {
		return projectName;
	}
	@Value("E-Commerce")
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDurationOfProject() {
		return durationOfProject;
	}
	@Value("30 days")
	public void setDurationOfProject(String durationOfProject) {
		this.durationOfProject = durationOfProject;
	}
	
	public void display() {
		System.out.println("Project details");
		System.out.println("ProjectName: " + projectName + " Duration: " + durationOfProject);
	}
	
}
