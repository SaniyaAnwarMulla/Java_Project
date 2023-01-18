package com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Subject {
	@Id
	private String subjectName;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + "]";
	}

	}
