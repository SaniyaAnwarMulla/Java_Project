package com.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.FeedbackRequest;
import com.app.dto.FeedbackResponse;
import com.app.model.Feedback;
import com.app.service.FeedbackService;

@RestController
public class ReedbackController {
	@Autowired
	FeedbackService feedbackService;

	@PostMapping("/addfeedback")
	public ResponseEntity<FeedbackResponse>addFeedback(@RequestBody FeedbackRequest feedback){
		return new ResponseEntity<FeedbackResponse>(feedbackService.addCustomer(feedback),HttpStatus.OK);
	}
	@PutMapping("/updatecustomer")
	public ResponseEntity<FeedbackResponse> updateFeedback(@RequestBody Feedback request){
		return new ResponseEntity<FeedbackResponse>
		(feedbackService.updateFeedback(request),HttpStatus.OK);
			}
	@DeleteMapping("/remove")
	public ResponseEntity<String> deletFeedback(@RequestParam int request){
		return new ResponseEntity<String>
		(feedbackService.deleteFeedback(request),HttpStatus.OK);
	}
	@GetMapping("/list")
	public ResponseEntity<List<Feedback>>getAll(){
		return new ResponseEntity<List<Feedback>>
		(feedbackService.getCustomer(),HttpStatus.OK);
	}
}
