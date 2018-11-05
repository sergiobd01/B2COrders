package com.orderService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderService.dto.CancelOrderRequest;
import com.orderService.dto.CancelOrderResponse;
import com.orderService.dto.CreateOrderRequest;
import com.orderService.dto.CreateOrderResponse;
import com.orderService.interfaces.IOrderConsumer;
import com.orderService.interfaces.IOrderMapper;
import com.orderService.interfaces.IOrderService;

import co.com.touresbalon.model.canonical._1_0.CreateSalesOrderRequest;
import co.com.touresbalon.model.canonical._1_0.CreateSalesOrderResponse;

@Service
public class OrderServiceImpl implements IOrderService {
	
	@Autowired
	private IOrderConsumer orderConsumer;
	
	@Autowired
	private IOrderMapper orderMapper;

	@Override
	public CreateOrderResponse createOrderValidateBPEL(CreateOrderRequest createOrderRequest) {
		
		CreateSalesOrderRequest createOrderRequestBPEL = orderMapper.buildCreateOrderRequest(createOrderRequest);
		CreateSalesOrderResponse createSalesOrderResponse = orderConsumer.consumeCreateOrderValidation(createOrderRequestBPEL);
        return orderMapper.buildCreateOrderResponse(createSalesOrderResponse);
		
	}

	@Override
	public CancelOrderResponse cancelOrderValidateBPEL(CancelOrderRequest cancelOrderRequest) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
