package com.balacode.balacart.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balacode.balacart.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	Optional<Order> findByReferenceId(String referenceId);
}
