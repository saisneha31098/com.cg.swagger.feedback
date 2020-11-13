package com.cg.swagger.feedback;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.plugin.core.PluginRegistry;

import com.cg.swagger.feedback.dto.Feedback;
import com.cg.swagger.feedback.repository.FeedbackDao;
import com.cg.swagger.feedback.service.FeedbackService;



@SpringBootApplication
//@ComponentScan(basePackages = "com.cg.swagger.feedback")
//@EnableCaching
public class FeedbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedbackApplication.class, args);
	}

	/*@Autowired
	FeedbackService feedbackService;

	@Bean
	InitializingBean seedDatabase() {
	    return () -> {
	    	
	    	feedbackService.insertFeedback(new Feedback(101,3,"good"));
	    	feedbackService.insertFeedback(new Feedback(102,2.5,"very bad"));
	    	feedbackService.insertFeedback(new Feedback(103,4,"very good"));
	    		}; 
} */
}