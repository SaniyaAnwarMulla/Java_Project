package com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Faculty {
	@Id
	private String courseName;
	private String batchName;
	private String studentName;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Faculty [courseName=" + courseName + ", batchName=" + batchName + ", studentName=" + studentName
				+ ", getCourseName()=" + getCourseName() + ", getBatchName()=" + getBatchName() + ", getStudentName()="
				+ getStudentName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
