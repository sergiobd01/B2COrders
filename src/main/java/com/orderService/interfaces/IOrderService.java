package com.orderService.interfaces;

import com.orderService.dto.CancelOrderRq;
import com.orderService.dto.CancelOrderRs;
import com.orderService.dto.CreateOrderRequest;
import com.orderService.dto.CreateOrderResponse;

public interface IOrderService {

	CreateOrderResponse createOrderValidateBPEL(CreateOrderRequest createOrderRequest);

	CancelOrderRs cancelOrderValidateBPEL(CancelOrderRq cancelOrderRequest);

}
