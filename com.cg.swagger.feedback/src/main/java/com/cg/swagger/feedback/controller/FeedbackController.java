package com.cg.swagger.feedback.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cg.swagger.feedback.dto.Feedback;
import com.cg.swagger.feedback.service.FeedbackService;

@Controller
@RequestMapping("/Feedbacks")
 public class FeedbackController{
	@GetMapping("/hi")
	public String hi() {
		return "Hi!";
	}
	@Autowired
	private FeedbackService feedbackService;
@GetMapping(value = {"/" })
public @ResponseBody List<Feedback> getFeedback() 
{ 
	List<Feedback> feedbacks = feedbackService.getAllfeedbacks();
	return feedbacks;
}
@GetMapping("/{id}")
public @ResponseBody  Feedback getFeedbackById(@PathVariable Long id) 
{
	
	return feedbackService.getFeedbackById(id);
}
@PostMapping("/")
public @ResponseBody Feedback addFeedback(@RequestBody Feedback feedback) 
{
	return feedbackService.addFeedback(feedback);
}

@PutMapping("/{id}")
public @ResponseBody Feedback updateFeedback(@PathVariable Long id,@RequestBody Feedback feedback) 
{
	
	return feedbackService.updateFeedback(id,feedback);
}
@DeleteMapping("/{id}")
public @ResponseBody Feedback removeFeedbackById(@PathVariable Long id) 
{
	return feedbackService.removeFeedbackById(id);
}
}