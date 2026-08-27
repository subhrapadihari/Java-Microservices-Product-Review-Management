package com.nit.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nit.model.Review;

@FeignClient(name="Review-Service")
public interface ReviewFeignClient {
	
	@PostMapping("/review")
	public Review addReview(@RequestBody Review r);

	@GetMapping("/review")
	public List<Review> getAllReview();
	
	@GetMapping("/review/{id}")
	public Review getById(@PathVariable Long id);
	
	@PutMapping("/review/{id}")
	public Review updateByid(@PathVariable Long id,@RequestBody Review r);
	
	@DeleteMapping("/review/{id}")
	public String delete(@PathVariable Long id);

}
