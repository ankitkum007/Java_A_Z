package com.bean.Autowired.byType;

public class Patient {
	private String patientName;
	private long patientNumber;
	private Hospital hospital;
	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public long getPatientNumber() {
		return patientNumber;
	}
	public void setPatientNumber(long patientNumber) {
		this.patientNumber = patientNumber;
	}
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
}
