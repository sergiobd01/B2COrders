package com.orderService.interfaces;

import com.orderService.dto.CancelOrderRq;
import com.orderService.dto.CancelOrderRs;
import com.orderService.dto.CreateOrderRequest;
import com.orderService.dto.CreateOrderResponse;

import co.com.touresbalon.model.canonical._1_0.CancelOrderRequest;
import co.com.touresbalon.model.canonical._1_0.CancelOrderResponse;
import co.com.touresbalon.model.canonical._1_0.CreateSalesOrderRequest;
import co.com.touresbalon.model.canonical._1_0.CreateSalesOrderResponse;

public interface IOrderMapper {

	CreateSalesOrderRequest buildCreateOrderRequest(CreateOrderRequest createOrderRequest);

	CreateOrderResponse buildCreateOrderResponse(CreateSalesOrderResponse createSalesOrderResponse);
	
	CancelOrderRequest buildCancelOrderRequest(CancelOrderRq createOrderRequest);

	CancelOrderRs buildCancelOrderResponse(CancelOrderResponse createSalesOrderResponse);


}
