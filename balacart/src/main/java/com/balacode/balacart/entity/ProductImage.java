package com.balacode.balacart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class ProductImage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(nullable = false)
	private String publicId;
	
	@Column(nullable = false)
	private String url;
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getPublicId() {
		return publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public ProductImage(Long id, String publicId, String url) {
		super();
		Id = id;
		this.publicId = publicId;
		this.url = url;
	}
	
	public ProductImage() {
	    // required by JPA
	}
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	public ProductImage(String url, Product product) {
		this.url = "/uploads/"+url;
		this.publicId = url;
		this.product = product;
	}
	
}
