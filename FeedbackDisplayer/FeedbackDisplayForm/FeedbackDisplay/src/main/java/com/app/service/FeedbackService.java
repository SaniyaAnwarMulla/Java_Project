package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.app.dto.FeedbackRequest;
import com.app.dto.FeedbackResponse;
import com.app.model.Feedback;
import com.app.repository.feedbackRepository;

@Service
public class FeedbackService {
@Autowired
feedbackRepository feedbackRepo;

public FeedbackResponse addCustomer(FeedbackRequest feedback) {
	// TODO Auto-generated method stub
	Feedback feed=feedbackRequest(feedback);
	Feedback response=feedbackRepo.save(feed);
	FeedbackResponse customerResponse=new FeedbackResponse();
	if(response!=null) {
		customerResponse.setFeedback(response);
		customerResponse.setStatus("SUCCESS");
	}else {
		customerResponse.setFeedback(feed);
		customerResponse.setStatus("Fail");
	}
	return customerResponse;
	
}
private Feedback feedbackRequest(FeedbackRequest feedback) {
	Feedback feed=new Feedback();
	feed.setFirstName(feedback.getFirstName());
	feed.setLasttName(feedback.getLasttName());
	feed.setEmail(feedback.getEmail());
	feed.setCourses(feedback.getCourses());
	feed.setMobile(feedback.getMobile());
	feed.setBatch(feedback.getBatch());
	feed.setTrainerName(feedback.getTrainerName());
	feed.setTopicName(feedback.getTopicName());
	feed.setRatings(feedback.getRatings());
	feed.setMsg(feedback.getMsg());
	
	return feed;
}
public FeedbackResponse updateFeedback(Feedback request) {
	// TODO Auto-generated method stub
	feedbackRepo.updateFeddbackOnId(request.getCourses(), request.getId());
	FeedbackResponse response=new FeedbackResponse();
	/*
	 * if(res!=null) { Customer cust=new Customer();
	 * cust.setCustAddress(request.getCustAddress());
	 * cust.setCustId(res.getCustId()); Customer updatecust=null;
	 * customerRepo.updateCustomerOnId(request.getCustAddress(),request.getCustId())
	 * ;
	 * 
	 * if(updatecust!=null) { response.setCustomer(updatecust);
	 * response.setStatus("Updated"); } } else {
	 * response.setStatus("Please check your Record or connect with admin...!"); }
	 
	 */
	response.setStatus("Please check your Record or connect with admin..!");
	return response;
}

public String deleteFeedback(int request) {
	// TODO Auto-generated method stub
	String sts="FAIL";
	Feedback c=feedbackRepo.getById(request);
	if(c!=null)
	{
		feedbackRepo.deleteById(request);
		sts="Deleted";
			}else {
				sts="Record not found...!";
			}
	return sts;
}
public List<Feedback> getCustomer() {
	// TODO Auto-generated method stub
	return (List<Feedback>)feedbackRepo.findAll();
}

}
