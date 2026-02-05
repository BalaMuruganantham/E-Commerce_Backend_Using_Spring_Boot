package com.balacode.balacart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.balacode.balacart.dto.CreateOrderRequest;
import com.balacode.balacart.dto.OrderCreated;
import com.balacode.balacart.entity.Order;
import com.balacode.balacart.services.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController{
	
	@Autowired
	private OrderService orderService;

	@PostMapping
	public ResponseEntity<?> createOrder(@RequestBody CreateOrderRequest orderRequest){
		OrderCreated  orderCreated = orderService.createOrder(orderRequest);
		return ResponseEntity.ok().body(orderCreated);
	}
	
	@GetMapping("/{referenceId}")
	public ResponseEntity<?> getOrder(@PathVariable String referenceId){
		Order order = orderService.getOrder(referenceId);
		return ResponseEntity.ok().body(order);
	}
}
