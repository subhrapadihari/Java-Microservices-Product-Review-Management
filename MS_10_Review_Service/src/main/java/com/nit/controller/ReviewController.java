package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.entity.Review;
import com.nit.service.ReviewServiceImpl;

@RestController
@RequestMapping("/review")
public class ReviewController {
	
	@Autowired
	ReviewServiceImpl service;
	
	
	@PostMapping
	public Review addView(@RequestBody Review r){
		
		return service.addReview(r);
	}
	
	@GetMapping
	public List<Review> getReview(){
		return service.getAllReview();
	}

	@GetMapping("/{id}")
	public Review getById(@PathVariable Long id){
		return service.getById(id);
	}
	
	@PutMapping("/{id}")
	public Review update(@PathVariable Long id,@RequestBody Review r){
		return service.updateByid(id, r);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id){
		return service.delete(id);
	}
}
