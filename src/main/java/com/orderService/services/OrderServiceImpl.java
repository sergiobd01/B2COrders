package com.orderService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderService.dto.CancelOrderRq;
import com.orderService.dto.CancelOrderRs;
import com.orderService.dto.CreateOrderRequest;
import com.orderService.dto.CreateOrderResponse;
import com.orderService.interfaces.IOrderConsumer;
import com.orderService.interfaces.IOrderMapper;
import com.orderService.interfaces.IOrderService;

import co.com.touresbalon.model.canonical._1_0.CancelOrderRequest;
import co.com.touresbalon.model.canonical._1_0.CancelOrderResponse;
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
	public CancelOrderRs cancelOrderValidateBPEL(CancelOrderRq cancelOrderRequest) {
		CancelOrderRequest cancelOrderRequestBPEL = orderMapper.buildCancelOrderRequest(cancelOrderRequest);
		CancelOrderResponse cancelOrderResponse = orderConsumer.consumeCancelOrderValidation(cancelOrderRequestBPEL);
        return orderMapper.buildCancelOrderResponse(cancelOrderResponse);
	}
	
	

}
