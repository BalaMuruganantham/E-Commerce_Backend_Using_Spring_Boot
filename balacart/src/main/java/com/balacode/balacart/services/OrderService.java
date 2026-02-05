package com.balacode.balacart.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balacode.balacart.dto.CreateOrderRequest;
import com.balacode.balacart.dto.OrderCreated;
import com.balacode.balacart.dto.OrderItemDto;
import com.balacode.balacart.entity.Order;
import com.balacode.balacart.entity.OrderItem;
import com.balacode.balacart.entity.Product;
import com.balacode.balacart.repository.OrderRepository;
import com.balacode.balacart.repository.ProductRepository;

@Service
public class OrderService {

	
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private OrderRepository orderRepo;
	
	public OrderCreated createOrder(CreateOrderRequest orderRequest) {
		Order order = new Order();
		order.setStatus("PENDING");
		double totalItemsAmount = 0;
		
		for(OrderItemDto item : orderRequest.getOrderItems()) {
			OrderItem orderItem = new OrderItem();
			orderItem.setName(item.getName());
			orderItem.setImage(item.getImage());
			orderItem.setPrice(item.getPrice());
			orderItem.setQuantity(item.getQuantity());
			
			Product product = productRepo.findById(item.getProductId()).orElseThrow(() -> new RuntimeException("Product Id not found"));
			orderItem.setProduct(product);
			
			totalItemsAmount += item.getPrice() * item.getQuantity();
			order.getOrderItems().add(orderItem);
			orderItem.setOrder(order);

			
			
			
		}
		order.setTotalItemsAmount(totalItemsAmount);
		double totalAmount = 0;
		double taxAmount = 10;
		totalAmount = totalItemsAmount  + taxAmount;
		String refId = UUID.randomUUID().toString();
		order.setReferenceId(refId);
		order.setTotalAmount(totalAmount);
		order.setTaxAmount(taxAmount);
		 orderRepo.save(order);
		
		
		return new OrderCreated(refId);
	}
	
	public Order getOrder(String referenceId) {
		return orderRepo.findByReferenceId(referenceId).orElseThrow(() -> new RuntimeException("No Order found with this referenceId"));
	}
}
