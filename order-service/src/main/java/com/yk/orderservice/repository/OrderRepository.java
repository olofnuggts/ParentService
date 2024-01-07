package com.yk.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yk.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
