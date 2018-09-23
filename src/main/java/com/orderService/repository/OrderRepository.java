package com.orderService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.jpa.repository.JpaRepository;

import com.orderService.model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long>  {
	
	public List<Orders> findByidCustomer(Long idCustomer);

}
