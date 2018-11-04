package com.orderService.controller;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orderService.model.CreditCard;
import com.orderService.model.OrderProduct;
import com.orderService.model.Orders;
import com.orderService.payload.OrderRequest;
import com.orderService.payload.OrderResponse;
import com.orderService.repository.CustomerRepository;
import com.orderService.repository.OrderProductRepository;
import com.orderService.repository.OrderRepository;


@RestController
@CrossOrigin(origins = "*")
public class OrderController {
	
	@Autowired
    OrderRepository orderRepository;
	
	@Autowired
	OrderProductRepository orderProductRepository;
	
	@Autowired
	CustomerRepository customerRepository;

    @RequestMapping(
  	      value = "/registerOrder",
  	      method = RequestMethod.POST,
  	      produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> registerOrder(@RequestBody OrderRequest orderRequest) {

    	Orders order = new Orders(null, 1L, orderRequest.getIdCustomer(), orderRequest.getNumberCard(), orderRequest.getAmount(), new Date(), null);
    	CreditCard card = new CreditCard(orderRequest.getNumberCard(), orderRequest.getCvv(), orderRequest.getExpirationMonth(), orderRequest.getExpirationYear());
    	List<OrderProduct> orderProducts = orderRequest.getOrderProducts();

    	Orders orderResult = new Orders();
    	OrderResponse orderResponse = new OrderResponse("", false);
    	
        if(customerRepository.existsById(order.getIdCustomer()))
        {
        	orderResult =  orderRepository.save(order);
        	
        	for (OrderProduct orderProduct : orderProducts) {
        		orderProduct.setIdOrder(orderResult.getidOrder());
    			orderProductRepository.save(orderProduct);
    		}
        	
            orderResponse.setMessage("Orden Registrada");
            orderResponse.setSuccess(true);
            
            // TODO call BPEL SERVICE
            // Creacion interface y implementacion de interface
            // importar clases con CXF, utilizando wsdl
            // crear folder de wsdl bpel en resources
          	// crear Repository con la tabla de proveedores para traer el id y la URL del servicio
            // hacer mapper del servicio ; response del servicio OK
            // config del servicio para consumo
            // propiedades de consumo en application.properties
        
        }
        else
        {
        	orderResponse.setMessage("La orden no pudo ser Registrada");
        	orderResponse.setSuccess(false);
        }
    	    	
    	return ResponseEntity.ok(orderResponse);
    }
    
    @RequestMapping(
    	      value = "/findOrder",
    	      method = RequestMethod.GET,
    	      produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Orders> findOrder(@RequestParam("idCustomer") long idCustomer) {

    	List<Orders> orderResult =  orderRepository.findByidCustomer(idCustomer);
    	
    	return orderResult;
    }

    @RequestMapping(
  	      value = "/cancelOrder",
  	      method = RequestMethod.GET,
  	      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> cancelOrder(@RequestParam("idOrder") long idOrder) {
    
	OrderResponse orderResponse = new OrderResponse("", false);
    if(orderRepository.existsById(idOrder))
    {
    	Orders orderResult =  orderRepository.getOne(idOrder);
    	orderResult.setIdStateOrder(3L);
        orderRepository.save(orderResult);
        orderResponse.setMessage("Orden Cancelada");
        orderResponse.setSuccess(true);   
        
        // TODO call BPEL SERVICE
    }
    else
    {
    	orderResponse.setMessage("La orden no pudo ser cancelada");
    	orderResponse.setSuccess(false);
    }
    
  	return ResponseEntity.ok(orderResponse);
  }

}
