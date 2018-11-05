package com.orderService.interfaces;

import com.orderService.dto.CreateOrderRequest;
import com.orderService.dto.CreateOrderResponse;

import co.com.touresbalon.model.canonical._1_0.CreateSalesOrderRequest;
import co.com.touresbalon.model.canonical._1_0.CreateSalesOrderResponse;

public interface IOrderMapper {

	CreateSalesOrderRequest buildCreateOrderRequest(CreateOrderRequest createOrderRequest);

	CreateOrderResponse buildCreateOrderResponse(CreateSalesOrderResponse createSalesOrderResponse);


}
