package com.orderService.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.orderService.config.ConnectionSoap;
import com.orderService.interfaces.IOrderConsumer;

import co.com.touresbalon.model.canonical._1_0.CreateSalesOrderRequest;
import co.com.touresbalon.model.canonical._1_0.CreateSalesOrderResponse;

@Component
public class OrderConsumer implements IOrderConsumer{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);
	
	@Autowired
	private ConnectionSoap connectionSoap;
	
	@Value("${bpel.endpoint.createorder.uri}")
	private String endpointCreateOrderService;

	@Value("${bpel.endpoint.createorder.method}")
	private String createOrderServiceMethod;

	@Override
	public CreateSalesOrderResponse consumeCreateOrderValidation(CreateSalesOrderRequest createOrderRequestBPEL) {
		try {
			return (CreateSalesOrderResponse) connectionSoap.getConnection(createOrderRequestBPEL, endpointCreateOrderService, createOrderServiceMethod);
		} catch (Exception e) {
			LOGGER.error("error conexion flujo creacion de orden", e);
		}
		return null; 
	}
	
	// TODO aqui se implementa la conexion con el servicio de cancelacion
	
	

}
