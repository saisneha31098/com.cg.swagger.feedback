package com.cg.swagger.feedback.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.swagger.feedback.dto.Feedback;
import com.cg.swagger.feedback.exception.UnknownUserException;
import com.cg.swagger.feedback.repository.FeedbackDao;


@Service
public class FeedbackService {

	@Autowired
	private FeedbackDao hospital;

	public List<Feedback> getAllfeedbacks() {
		System.out.println("Feedback");
		return hospital.findAll();
	}
public Feedback getFeedbackById(Long id)   
	{
		System.out.println("Feedback accessed");
		Optional<Feedback>optional=hospital.findById(id);
		if(!optional.isPresent()) {
			throw new UnknownUserException(" Feedback could not be accessed for id="+id);
		}
		else
			return optional.get();
	}
public Feedback addFeedback(Feedback  feedback) throws UnknownUserException  {
	try {
		System.out.println("Feedback Added");
		
		return hospital.save(feedback);
		}
		catch( UnknownUserException e)
		{
		    System.out.println("Feedback could not be added");
			e.printStackTrace();
		    return null;
		}
}
public Feedback updateFeedback(Long id, Feedback feedback)   {
	System.out.println("Feedback updated.");
	Optional<Feedback> repFeedback = hospital.findById(id);
	if(!repFeedback.isPresent()) {
		throw new UnknownUserException ("Feedback not found for id="+id);
	}
	else
	{
		Feedback  feedbackToBeUpdated = repFeedback.get();
		feedbackToBeUpdated.setId(feedback.getId());
		feedbackToBeUpdated.setRatings(feedback.getRatings());
		feedbackToBeUpdated.setComments(feedback.getComments());
		System.out.println("Feedback Updated");

		return hospital.save(feedbackToBeUpdated);
		
	}
}
public Feedback removeFeedbackById(Long id)   
{
	System.out.println("Feedback  removed");
	Optional<Feedback >optional=hospital.findById(id);
	if(!optional.isPresent()) {
		throw new UnknownUserException ("Feedback could not be removed for id="+id);
	}
	else
		return optional.get();
}


	public List<Feedback> getAllfeedbacks1() {
		System.out.println("feedbacks");
		return hospital.findAll();
	}
public Feedback getFeedbackById1(Long id)   
	{
		System.out.println("Feedback accessed");
		Optional<Feedback>optional=hospital.findById(id);
		if(!optional.isPresent()) {
			throw new UnknownUserException ("Feedback could not be accessed for id="+id);
		}
		else
			return optional.get();
	}
public Feedback addFeedback1(Feedback feedback) throws IllegalArgumentException  {
	try {
		System.out.println("Feedback Added");
		
		return hospital.save(feedback);
		}
		catch(IllegalArgumentException e)
		{
		    System.out.println("Feedback could not be added");
			e.printStackTrace();
		    return null;
		}
}
public Feedback updateFeedback1(Long id, Feedback feedback )   {
	System.out.println("Feedback updated.");
	Optional<Feedback> repFeedback= hospital.findById(id);
	if(!repFeedback.isPresent()) {
		throw new UnknownUserException("Feedback not found for id="+id);
	}
	else
	{
		Feedback feedbackToBeUpdated = repFeedback .get();
		feedbackToBeUpdated.setId(feedback.getId());
		feedbackToBeUpdated.setRatings(feedback.getRatings());
		feedbackToBeUpdated.setComments(feedback.getComments());
		System.out.println("Feedback Updated");

		return hospital.save(feedbackToBeUpdated);
		
	}
}
public Feedback removeFeedbackById1(Long id)   
{
	System.out.println("Feedback removed");
	Optional<Feedback>optional=hospital.findById(id);
	if(!optional.isPresent()) {
		throw new UnknownUserException ("Admin could not be removed for id="+id);
	}
	else
		return optional.get();
}
}