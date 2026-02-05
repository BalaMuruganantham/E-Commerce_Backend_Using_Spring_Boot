package com.balacode.balacart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balacode.balacart.entity.ProductReview;

import jakarta.persistence.Entity;


public interface ProductReviewRepository extends JpaRepository<ProductReview, Long>{

}
