package com.orderService.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.transport.http.HttpsUrlConnectionMessageSender;

@Configuration
public class WebServiceClientConfig {

	@Bean
	public Jaxb2Marshaller marshaller() {
		final Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPaths("co.com.touresbalon.model.canonical._1_0");
		return marshaller;
	}

	@Bean
	public ConnectionSoap clientSoap(final Jaxb2Marshaller marshaller) throws Exception {
		final ConnectionSoap client = new ConnectionSoap();

		client.setDefaultUri("");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);

		final HttpsUrlConnectionMessageSender messageSender = new HttpsUrlConnectionMessageSender();

		messageSender.setHostnameVerifier((hostname, sslSession) -> {
			if (hostname.equals("localhost")) {
				return true;
			}
			return true;
		});

		client.setMessageSender(messageSender);

		return client;
	}

}
