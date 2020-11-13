package com.cg.swagger.feedback;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.cg.swagger.feedback.controller.FeedbackController;
import com.cg.swagger.feedback.dto.Feedback;
import com.cg.swagger.feedback.service.FeedbackService;



@ExtendWith(MockitoExtension.class)
public class FeedbackControllerTest {

	private MockMvc mockMvc;
	@Mock
	FeedbackService feedbackServices;

	@InjectMocks
	FeedbackController feedbackController;
	
	@Test
	public void testAddFeedback() {
		
		Feedback feedback=new Feedback();
		        Mockito.when(feedbackController.addFeedback(feedback)).thenReturn(feedback);
		        assertEquals(feedback,feedbackController.addFeedback(feedback));
		        System.out.println("testAddFeedback");
		    }
	 @Test
	    public void testGetAllFeedbacks() {
	        List<Feedback> feedback=new ArrayList<Feedback>();
	       Mockito.when(feedbackController.getFeedback()).thenReturn(feedback);
	        assertEquals(feedback,feedbackController.getFeedback());
	        System.out.println("testGetAllFeedback");

	    }
	 @Test
		void testFeedbackById() {

			Feedback feedback=new Feedback();
			Long id = 1L;
			Mockito.when(feedbackController.getFeedbackById(id)).thenReturn(feedback);
			assertEquals(feedback, feedbackController.getFeedbackById(id));
			System.out.println("testGetPatientById");
			
		}

	@Test
	void testremoveFeedback() {

		Feedback feedback=new Feedback();
		 Long id=1L;
		 Mockito.when(feedbackController.removeFeedbackById(id)).thenReturn(feedback);
	     assertEquals(feedback,feedbackController.removeFeedbackById(id));
	    System.out.println("testRemoveFeedbackById");
	}
	@Test
	 public void testUpdateFeedbackById() {

		Feedback feedback=new Feedback();
		 Long id=1L;
		 Mockito.when(feedbackController.getFeedbackById(id)).thenReturn(feedback);
	        assertEquals(feedback,feedbackController.getFeedbackById(id));
	        System.out.println("testUpdateFeedbacktById");
	}
	
	 
	
}