package com.app.dto;

import org.springframework.stereotype.Component;

@Component
public class FeedbackRequest {
	private int Id;
	private String firstName;
	private String lasttName;
	private String email;
	private int mobile;
	private String courses;
	private String trainerName;
	private String batch;
	private String topicName;
	private String ratings;
	private String msg;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasttName() {
		return lasttName;
	}
	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getRatings() {
		return ratings;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", firstName=" + firstName + ", lasttName=" + lasttName + ", email=" + email
				+ ", mobile=" + mobile + ", courses=" + courses + ", trainerName=" + trainerName + ", batch=" + batch
				+ ", topicName=" + topicName + ", ratings=" + ratings + ", msg=" + msg + "]";
	}


}
