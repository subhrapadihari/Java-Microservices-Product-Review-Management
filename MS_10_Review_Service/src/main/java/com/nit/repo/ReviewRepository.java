package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

}
