package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sId;
    
    @NotBlank(message = "Name is mandatory")
    @Column(name = "studentName")
    private String studentName;
    
    @NotBlank(message = "name is mandatory")
    @Column(name = "courseName")
    private String courseName;

    @NotBlank(message = "name is mandatory")
    @Column(name = "batchName")
    private String batchName;
    
    @NotBlank(message = "name is mandatory")
    @Column(name = "trainerName")
    private String trainerName;

	public long getsId() {
		return sId;
	}

	public void setsId(long sId) {
		this.sId = sId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

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

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", studentName=" + studentName + ", courseName=" + courseName + ", batchName="
				+ batchName + ", trainerName=" + trainerName + "]";
	}
    
    

	  
} 
    