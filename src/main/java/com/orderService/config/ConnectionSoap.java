package com.orderService.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


public class ConnectionSoap extends WebServiceGatewaySupport {

	@Value("${bpel.ws.hostname}")
    private String hostname;

	@Value("${bpel.ws.callbackHostname}")
	private String callbackHostname;

	@SuppressWarnings("unchecked")
	public <T extends Object> Object getConnection(Object request, String endpoint, String method) {

		T resultadoSOAP =
				(T) getWebServiceTemplate().marshalSendAndReceive(
						hostname + endpoint, request,
				new SoapActionCallback(
						callbackHostname + endpoint + "/" + method));

		return resultadoSOAP;
	}


}