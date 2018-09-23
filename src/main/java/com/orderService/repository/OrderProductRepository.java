package com.orderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderService.model.OrderProduct;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Long>{

}
