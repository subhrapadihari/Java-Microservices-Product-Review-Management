package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Review;
import com.nit.exception.ReviewNotFoundException;
import com.nit.repo.ReviewRepository;

@Service
public class ReviewServiceImpl {
	
	@Autowired
    private ReviewRepository repo;
	
	public Review addReview(Review r) {
		
		return repo.save(r);
	}
	
	public List<Review> getAllReview(){
		return repo.findAll();
	}

	
	public Review getById(Long id)  {
		return repo.findById(id).orElseThrow(()-> new ReviewNotFoundException("Invalid Id"));
	}
	
	
	public Review updateByid(Long id, Review r ) {
		
		Review e = repo.findById(id).orElseThrow(()->new ReviewNotFoundException("Inavlid Id"));
		
		e.setReviewName(r.getReviewName());
		e.setProductName(r.getProductName());
		e.setRating(r.getRating());
		e.setComment(r.getComment());
		
		return repo.save(e);
		
	}
	
	public String delete(Long id) {
		Review findOrNot= repo.findById(id).orElseThrow(()->new ReviewNotFoundException("Inavlid Id"));
		repo.deleteById(id);
		return id+" ID Review is deleted";
	}
	
	
	
}
