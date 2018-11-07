package com.orderService.interfaces;

import co.com.touresbalon.model.canonical._1_0.CancelOrderRequest;
import co.com.touresbalon.model.canonical._1_0.CancelOrderResponse;
import co.com.touresbalon.model.canonical._1_0.CreateSalesOrderRequest;
import co.com.touresbalon.model.canonical._1_0.CreateSalesOrderResponse;


public interface IOrderConsumer {

	CreateSalesOrderResponse consumeCreateOrderValidation(CreateSalesOrderRequest createOrderRequestBPEL);
	
	CancelOrderResponse  consumeCancelOrderValidation(CancelOrderRequest cancelOrderRequestBPEL);
	
}
