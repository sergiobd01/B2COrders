package com.orderService.interfaces;

import co.com.touresbalon.model.canonical._1_0.CreateSalesOrderRequest;
import co.com.touresbalon.model.canonical._1_0.CreateSalesOrderResponse;

public interface IOrderConsumer {

	CreateSalesOrderResponse consumeCreateOrderValidation(CreateSalesOrderRequest createOrderRequestBPEL);
	
	// TODO aqui se coloca la interfaz para conectar al de cancelacion

}
