package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Review;
import com.nit.service.ReviewFeignClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/review")
public class ReviewClientController {
	
	@Autowired
	ReviewFeignClient service;
	
	
	@PostMapping
	public ResponseEntity<Review> addView(@RequestBody Review r){
		
		return ResponseEntity.ok(service.addReview(r));
	}
	
	@GetMapping
	public ResponseEntity<List<Review>> getReview(){
		return ResponseEntity.ok(service.getAllReview());
	}

	@GetMapping("/{id}")
	@CircuitBreaker(name = "reviewClient",fallbackMethod = "fallBackMethod")
	public ResponseEntity<Review> getById(@PathVariable Long id){
		return ResponseEntity.ok(service.getById(id));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Review> update(@PathVariable Long id,@RequestBody Review r){
		return ResponseEntity.ok(service.updateByid(id, r));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id){
		return ResponseEntity.ok(service.delete(id));
	}
	
	
	public ResponseEntity<String> fallBackMethod(Exception e) {
		return ResponseEntity.badRequest().body("Internal Server Error"+e.getMessage());
		
	}
	
}
