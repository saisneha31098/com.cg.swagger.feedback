package com.cg.swagger.feedback.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Feedback {
	
	@Id
	@Column
	private  Long Id;
	@Column
	private double ratings; 
	@Column
	private String comments;
	
	
	public Feedback() {
		super();
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public double getRatings() {
		return ratings;
	}


	public void setRatings(double ratings) {
		this.ratings = ratings;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	@Override
	public String toString() {
		return "Feedback [Id=" + Id + ", ratings=" + ratings + ", comments=" + comments + "]";
	}
}