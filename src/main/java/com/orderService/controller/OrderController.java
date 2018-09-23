package com.orderService.controller;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.orderService.model.CreditCard;
import com.orderService.model.OrderProduct;
import com.orderService.model.Orders;
import com.orderService.payload.OrderRequest;
import com.orderService.payload.OrderResponse;
import com.orderService.repository.OrderProductRepository;
import com.orderService.repository.OrderRepository;


@RestController
@CrossOrigin(origins = "*")
public class OrderController {
	
	@Autowired
    OrderRepository orderRepository;
	
	@Autowired
	OrderProductRepository orderProductRepository;

    @RequestMapping(
  	      value = "/registerOrder",
  	      method = RequestMethod.POST,
  	      produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> registerOrder(@RequestBody OrderRequest orderRequest) {

    	Orders order = new Orders(null, 1L, orderRequest.getIdCustomer(), orderRequest.getNumberCard(), orderRequest.getAmount(), new Date(), null);
    	CreditCard card = new CreditCard(orderRequest.getNumberCard(), orderRequest.getCvv(), orderRequest.getExpirationMonth(), orderRequest.getExpirationYear());
    	List<OrderProduct> orderProducts = orderRequest.getOrderProducts();
    	
    	Orders orderResult =  orderRepository.save(order);
    	
    	for (OrderProduct orderProduct : orderProducts) {
    		orderProduct.setIdOrder(orderResult.getidOrder());
			orderProductRepository.save(orderProduct);
		}
    	    	
    	OrderResponse orderResponse = new OrderResponse("Orden Registrada");
    	return ResponseEntity.ok(orderResponse);
    }
    
    @RequestMapping(
    	      value = "/findOrder/{idCustomer}",
    	      method = RequestMethod.GET,
    	      produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Orders> findOrder(@PathVariable long idCustomer) {

    	List<Orders> orderResult =  orderRepository.findByidCustomer(idCustomer);
    	
    	return orderResult;
    }
    
    @RequestMapping(
  	      value = "/cancelOrder/{idOrder}",
  	      method = RequestMethod.GET,
  	      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> cancelOrder(@PathVariable long idOrder) {

    Orders orderResult =  orderRepository.getOne(idOrder);
    orderResult.setIdState(3L);
    orderRepository.save(orderResult);
  	OrderResponse orderResponse = new OrderResponse("Orden Cancelada");
  	return ResponseEntity.ok(orderResponse);
  }

}
