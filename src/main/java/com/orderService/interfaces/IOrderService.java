package com.orderService.interfaces;

import com.orderService.dto.CancelOrderRequest;
import com.orderService.dto.CancelOrderResponse;
import com.orderService.dto.CreateOrderRequest;
import com.orderService.dto.CreateOrderResponse;

public interface IOrderService {

	CreateOrderResponse createOrderValidateBPEL(CreateOrderRequest createOrderRequest);

	CancelOrderResponse cancelOrderValidateBPEL(CancelOrderRequest cancelOrderRequest);

}
