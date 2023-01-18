package com.app.dto;

import org.springframework.stereotype.Component;

import com.app.model.Feedback;


@Component
public class FeedbackResponse {
private Feedback feedback;
private String status;
public Feedback getFeedback() {
	return feedback;
}
public void setFeedback(Feedback feedback) {
	this.feedback = feedback;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "FeedbackResponse [status=" + status + "]";
}


}
