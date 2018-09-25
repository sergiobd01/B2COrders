package com.orderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderService.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
