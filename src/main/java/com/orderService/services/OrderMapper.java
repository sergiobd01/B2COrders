package com.orderService.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.orderService.dto.CancelOrderRq;
import com.orderService.dto.CancelOrderRs;
import com.orderService.dto.CreateOrderRequest;
import com.orderService.dto.CreateOrderResponse;
import com.orderService.dto.Items;
import com.orderService.interfaces.IOrderMapper;

import co.com.touresbalon.model.canonical._1_0.CancelOrder;
import co.com.touresbalon.model.canonical._1_0.CancelOrderRequest;
import co.com.touresbalon.model.canonical._1_0.CancelOrderResponse;
import co.com.touresbalon.model.canonical._1_0.CreateSalesOrderRequest;
import co.com.touresbalon.model.canonical._1_0.CreateSalesOrderResponse;
import co.com.touresbalon.model.canonical._1_0.CustomerType;
import co.com.touresbalon.model.canonical._1_0.Item;
import co.com.touresbalon.model.canonical._1_0.Lodging;
import co.com.touresbalon.model.canonical._1_0.SalesOrder;
import co.com.touresbalon.model.canonical._1_0.Spectacle;
import co.com.touresbalon.model.canonical._1_0.Transport;

@Service
public class OrderMapper implements IOrderMapper {

	@Override
	public CreateSalesOrderRequest buildCreateOrderRequest(CreateOrderRequest createOrderRequest) {
		CreateSalesOrderRequest createSalesOrderRequest = new CreateSalesOrderRequest();
		SalesOrder salesOrder = new SalesOrder();
		salesOrder.setSalesOrderId(String.valueOf(System.currentTimeMillis()));
		salesOrder.setIdCustomer(createOrderRequest.getIdCustomer());
		salesOrder.setCustomerUserName(createOrderRequest.getCustomerUserName());
		salesOrder.setCustomerEmail(createOrderRequest.getCustomerEmail());
		salesOrder.setCustomerType(createOrderRequest.getCustomerType().equals(CustomerType.GOLD) ? CustomerType.GOLD
				: createOrderRequest.getCustomerType().equals(CustomerType.PLATINUM) ? CustomerType.PLATINUM
						: CustomerType.SILVER);
		salesOrder.setCreditCardNumber(createOrderRequest.getCreditCardNumber());
		salesOrder.setPrice(BigDecimal.valueOf(createOrderRequest.getPrice()));
		salesOrder.getItems().addAll(buildItemsToSend(createOrderRequest,null));
		createSalesOrderRequest.setOrder(salesOrder);
		return createSalesOrderRequest;
	}

	private List<Item> buildItemsToSend(CreateOrderRequest createOrderRequest, CancelOrderRq cancelOrderRequest) {
		List<Item> itemsList = new ArrayList<>();
		for (Items item : createOrderRequest.getItems()) {
			Item itemObj = new Item();
			itemObj.setItemId(item.getItemId());
			itemObj.setItemName(item.getItemName());
			itemObj.setItemDescriptions(item.getItemDescriptions());
			Transport transport = new Transport();
			transport.setId(item.getTransportType());
			itemObj.setTransportType(transport);
			Spectacle spectacle = new Spectacle();
			spectacle.setId(item.getSpectacleType());
			itemObj.setSpectacleType(spectacle);
			Lodging lodging = new Lodging();
			lodging.setId(item.getLodgingType());
			itemObj.setLodgingType(lodging);
			itemObj.setArrivalDate(item.getArrivalDate());
			itemObj.setDepartureDate(item.getDepartureDate());
			itemObj.setSourceCity(item.getSourceCity());
			itemObj.setTargetCity(item.getTargetCity());
			itemObj.setPrice(BigDecimal.valueOf(item.getPrice()));
			itemObj.setQuantity(item.getQuantity());
			itemsList.add(itemObj);
		}
		return itemsList;
	}

	@Override
	public CreateOrderResponse buildCreateOrderResponse(CreateSalesOrderResponse createSalesOrderResponse) {
		CreateOrderResponse createOrderResponse = new CreateOrderResponse();
		createOrderResponse.setSalesOrderId(createSalesOrderResponse.getSalesOrderId());
		createOrderResponse.setSalesOrderStatus(createSalesOrderResponse.getSalesOrderStatus());
		createOrderResponse.setSalesOrderCreationDate(createSalesOrderResponse.getSalesOrderCreationDate());
		createOrderResponse.setPrice(createSalesOrderResponse.getPrice().doubleValue());
		return createOrderResponse;
	}

	@Override
	public CancelOrderRequest buildCancelOrderRequest(CancelOrderRq cancelOrderRq) {
		CancelOrderRequest cancelOrderRequest = new CancelOrderRequest();
		CancelOrder cancelOrder = new CancelOrder();
		cancelOrder.setSalesOrderId(String.valueOf(System.currentTimeMillis()));
		cancelOrder.setIdCustomer(cancelOrderRq.getIdCustomer());
		cancelOrder.setCustomerUserName(cancelOrderRq.getCustomerUserName());
		cancelOrder.setCustomerEmail(cancelOrderRq.getCustomerEmail());
		cancelOrder.setCustomerType(cancelOrderRq.getCustomerType().equals(CustomerType.GOLD) ? CustomerType.GOLD
				: cancelOrderRq.getCustomerType().equals(CustomerType.PLATINUM) ? CustomerType.PLATINUM
						: CustomerType.SILVER);
		cancelOrder.setCreditCardNumber(cancelOrderRq.getCreditCardNumber());
		cancelOrder.setPrice(BigDecimal.valueOf(cancelOrderRq.getPrice()));
		cancelOrder.getItems().addAll(buildItemsToSend(null,cancelOrderRq));
		cancelOrderRequest.setOrder(cancelOrder);
		return cancelOrderRequest;
	}

	@Override
	public CancelOrderRs buildCancelOrderResponse(CancelOrderResponse cancelOrderResponse) {
		CancelOrderRs cancelOrderRs = new CancelOrderRs();
		cancelOrderRs.setCancelOrderDate(cancelOrderResponse.getCancelOrderDate());
		cancelOrderRs.setCancelrOrderStatus(cancelOrderResponse.getCancelrOrderStatus());
		return cancelOrderRs;
	}

}
