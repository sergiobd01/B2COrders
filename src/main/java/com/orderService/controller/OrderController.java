package com.orderService.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.orderService.dto.CreateOrderRequest;
import com.orderService.dto.CreateOrderResponse;
import com.orderService.dto.Items;
import com.orderService.interfaces.IOrderService;
import com.orderService.model.CreditCard;
import com.orderService.model.Customer;
import com.orderService.model.OrderProduct;
import com.orderService.model.Orders;
import com.orderService.model.Product;
import com.orderService.payload.OrderRequest;
import com.orderService.payload.OrderResponse;
import com.orderService.repository.CustomerRepository;
import com.orderService.repository.OrderProductRepository;
import com.orderService.repository.OrderRepository;
import com.orderService.repository.ProductRepository;

@RestController
@CrossOrigin(origins = "*")
public class OrderController {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	OrderProductRepository orderProductRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	ProductRepository productRepository;

	@Autowired
	IOrderService orderService;

	@RequestMapping(value = "/registerOrder", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> registerOrder(@RequestBody OrderRequest orderRequest) {

		Orders order = new Orders(null, 1L, orderRequest.getIdCustomer(), orderRequest.getNumberCard(),
				orderRequest.getAmount(), new Date(), null);
		CreditCard card = new CreditCard(orderRequest.getNumberCard(), orderRequest.getCvv(),
				orderRequest.getExpirationMonth(), orderRequest.getExpirationYear());
		List<OrderProduct> orderProducts = orderRequest.getOrderProducts();

		Orders orderResult = new Orders();
		OrderResponse orderResponse = new OrderResponse("", false);

		if (customerRepository.existsById(order.getIdCustomer())) {
			orderResult = orderRepository.save(order);

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
			// hacer mapper del servicio ; response del servicio OK
			// config del servicio para consumo
			// propiedades de consumo en application.properties
			// actualizacion controller llamado BPEL creacion order

			CreateOrderResponse createOrderResponse = buildRequestToBPEL(orderResult, orderProducts);
			if (createOrderResponse != null) {
				LOGGER.info("id: " + createOrderResponse.getSalesOrderId() + " order status: "
						+ createOrderResponse.getSalesOrderStatus() + " creation date :"
						+ createOrderResponse.getSalesOrderCreationDate() + " price Order: "
						+ createOrderResponse.getPrice());
			} else {
				LOGGER.error("order data not found");
			}

		} else {
			orderResponse.setMessage("La orden no pudo ser Registrada");
			orderResponse.setSuccess(false);
		}

		return ResponseEntity.ok(orderResponse);
	}

	@RequestMapping(value = "/findOrder", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Orders> findOrder(@RequestParam("idCustomer") long idCustomer) {

		List<Orders> orderResult = orderRepository.findByidCustomer(idCustomer);

		return orderResult;
	}

	@RequestMapping(value = "/cancelOrder", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cancelOrder(@RequestParam("idOrder") long idOrder) {

		OrderResponse orderResponse = new OrderResponse("", false);
		if (orderRepository.existsById(idOrder)) {
			Orders orderResult = orderRepository.getOne(idOrder);
			orderResult.setIdStateOrder(3L);
			orderRepository.save(orderResult);
			orderResponse.setMessage("Orden Cancelada");
			orderResponse.setSuccess(true);

			// TODO call BPEL SERVICE for cancel order
		} else {
			orderResponse.setMessage("La orden no pudo ser cancelada");
			orderResponse.setSuccess(false);
		}

		return ResponseEntity.ok(orderResponse);
	}

	private CreateOrderResponse buildRequestToBPEL(Orders orderToSend, List<OrderProduct> orderProducts) {
		LOGGER.info("entre al BPEL");
		CreateOrderRequest request = new CreateOrderRequest();

		Optional<Customer> customer = customerRepository.findById(orderToSend.getIdCustomer());

		request.setIdCustomer(String.valueOf(orderToSend.getIdCustomer()));
		request.setCustomerUserName(customer.get().getUserName());
		request.setCustomerEmail(customer.get().getEmail());
		request.setCustomerType(String.valueOf(customer.get().getIdCategory()));
		request.setCreditCardNumber(String.valueOf(orderToSend.getNumberCard()));
		request.setPrice(orderToSend.getAmount());
		List<Items> itemsList = new ArrayList<>();
		for (OrderProduct orderProduct : orderProducts) {
			Product product = productRepository.findById((long)orderProduct.getId());
			itemsList.add(buildItemForProduct(product, orderProduct));
		}
		request.setItems(itemsList);

		CreateOrderResponse createOrderResponse = orderService.createOrderValidateBPEL(request);

		return createOrderResponse;

	}

	private Items buildItemForProduct(Product product, OrderProduct orderProduct) {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Items itemObj = new Items();
		itemObj.setItemId(product.getIdProduct());
		itemObj.setItemName(product.getName());
		itemObj.setItemDescriptions(product.getDescription());
		itemObj.setTransportType(product.getIdTransport());
		itemObj.setSpectacleType(product.getIdEntertainment());
		itemObj.setLodgingType(product.getIdHotel());
		itemObj.setArrivalDate(simpleDateFormat.format(product.getArrivalDate()));
		itemObj.setDepartureDate(simpleDateFormat.format(product.getDepartureDate()));
		itemObj.setSourceCity(simpleDateFormat.format(product.getSourceCity()));
		itemObj.setTargetCity(simpleDateFormat.format(product.getTargetCity()));
		itemObj.setPrice(Double.valueOf(product.getPrice()));
		itemObj.setQuantity(Long.valueOf(orderProduct.getQuantity()));
		return itemObj;
	}

}
