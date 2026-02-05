package com.balacode.balacart.entity;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	@NotBlank(message = "Name field is required")
	private String name;
	
	@Column(nullable = false)
	@NotNull(message = "Price field is required")
	@PositiveOrZero(message = "Price must be zero or greater than zero")
	private Double price;
	
//	@NotBlank(message = "Description Filed is required")
	private String description;
	
	private Double ratings = 0.0;
	
	@NotBlank(message = "Seller Filed is required")
	private String seller;
	
	@NotNull(message = "Stock field is required")
	private Integer stock = 0;
	private Integer numOfReviews =0;
	
	public String category;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "product_id")
	private List<ProductImage> images;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "product_id")
	private List<ProductReview> reviews;
	
	public List<ProductReview> getReviews() {
		return reviews;
	}
	public void setReviews(List<ProductReview> reviews) {
		this.reviews = reviews;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getRatings() {
		return ratings;
	}
	public List<ProductImage> getImages() {
		return images;
	}
	public void setImages(List<ProductImage> images) {
		this.images = images;
	}
	public void setRatings(Double ratings) {
		this.ratings = ratings;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getNumOfReviews() {
		return numOfReviews;
	}
	public void setNumOfReviews(Integer numOfReviews) {
		this.numOfReviews = numOfReviews;
	}
	
	public Product(Long id, String name, Double price, String description, String category, Double ratings, String seller, Integer stock, List<String> images) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.category = category;
		this.ratings = ratings;
		this.seller = seller;
		this.stock = stock;
		this.images = images.stream().map(url -> new ProductImage(url, this)).collect(Collectors.toList());
	}
	
	public Product() {
	    // required by JPA
	}

}
