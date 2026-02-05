package com.balacode.balacart.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProductReviewDto {
	
	@NotNull(message = "Product Id is required")
	private Long productId;
	
	@NotBlank(message = "Comment cannot be blank")
	private String comment;
	
	@NotNull(message = "Ratings cannot be empty")
	private Double rating;
	
	
	public ProductReviewDto(Long productId, String comment, Double rating) {
		super();
		this.productId = productId;
		this.comment = comment;
		this.rating = rating;
	}
	
	public ProductReviewDto() {
		super();
	}

	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
}
