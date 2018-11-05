package com.orderService.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.orderService.dto.CreateOrderRequest;
import com.orderService.dto.CreateOrderResponse;
import com.orderService.dto.Items;
import com.orderService.interfaces.IOrderMapper;

import co.com.touresbalon.model.canonical._1_0.CreateSalesOrderRequest;
import co.com.touresbalon.model.canonical._1_0.CreateSalesOrderResponse;
import co.com.touresbalon.model.canonical._1_0.CustomerType;
import co.com.touresbalon.model.canonical._1_0.Item;
import co.com.touresbalon.model.canonical._1_0.SalesOrder;
import co.com.touresbalon.model.canonical._1_0.Transport;

public class OrderMapper implements IOrderMapper {

	@Override
	public CreateSalesOrderRequest buildCreateOrderRequest(CreateOrderRequest createOrderRequest) {
		CreateSalesOrderRequest createSalesOrderRequest = new CreateSalesOrderRequest();
		SalesOrder salesOrder = new SalesOrder();
		salesOrder.setSalesOrderId(String.valueOf(System.currentTimeMillis()));
		salesOrder.setIdCustomer(createOrderRequest.getIdCustomer());
		salesOrder.setCustomerUserName(createOrderRequest.getCustomerUserName());
		salesOrder.setCustomerEmail(createOrderRequest.getCustomerEmail());
		salesOrder.setCustomerType(CustomerType.fromValue(createOrderRequest.getCustomerType()));
		salesOrder.setCreditCardNumber(createOrderRequest.getCreditCardNumber());
		salesOrder.setPrice(BigDecimal.valueOf(createOrderRequest.getPrice()));
		salesOrder.getItems().addAll(buildItemsToSend(createOrderRequest));
		
		
		return createSalesOrderRequest;
	}
	
	private List<Item> buildItemsToSend(CreateOrderRequest createOrderRequest) {
		List<Item> itemsList = new ArrayList<>();
		for (Items items :createOrderRequest.getItems()){
			Item item = new Item();
			item.setItemId(items.getItemId());
			item.setItemName(items.getItemName());
			item.setItemDescriptions(items.getItemDescriptions());
			item.setItemDescriptions(items.getItemDescriptions());
			Transport transport = new Transport() ;
			transport.setId(items.getTransportType());
			item.setTransportType(transport);
			
			
			itemsList.add(item);
			
		}
		
		return itemsList;
	}

	@Override
	public CreateOrderResponse buildCreateOrderResponse(CreateSalesOrderResponse createSalesOrderResponse) {
		// TODO Auto-generated method stub
		return null;
	}
	
	// TODO falta mapear lo de cancelacion

}
