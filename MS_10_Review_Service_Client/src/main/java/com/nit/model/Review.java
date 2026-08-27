package com.nit.model;


import lombok.Data;


@Data
public class Review {
 

	private Long id;
	private String reviewName;
	private String productName;
	private Double rating;
	private String comment;
	
	
}
