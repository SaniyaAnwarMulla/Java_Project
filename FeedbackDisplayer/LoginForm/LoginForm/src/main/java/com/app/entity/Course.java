package com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String courseType;
	private String courseName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", courseType=" + courseType + ", courseName=" + courseName + "]";
	}
		
}
