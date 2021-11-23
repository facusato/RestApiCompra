package com.unla.RestApiCompra.CorreoSoap;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class BeanConfig {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.unla.RestApiCompra.stub");
		return marshaller;
		
	}
	
	

	
	@Bean
	@Primary
	public SoapClient soapConnector(Jaxb2Marshaller marshaller) {
		SoapClient client = new SoapClient();
		client.setDefaultUri("http://localhost:8080/soap");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
		
	}
	

	
	@Bean
	@Qualifier
	public SoapClient soapConnector2(Jaxb2Marshaller marshaller) {
		SoapClient client = new SoapClient();
		client.setDefaultUri("http://localhost:8000/soap");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
		
	}

}
