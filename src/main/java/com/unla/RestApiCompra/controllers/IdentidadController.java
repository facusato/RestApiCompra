package com.unla.RestApiCompra.controllers;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unla.RestApiCompra.CorreoSoap.SoapClient;
import com.unla.RestApiCompra.stub.ConfirmarIdentidad;
import com.unla.RestApiCompra.stub.ConfirmarIdentidadResponse;
import com.unla.RestApiCompra.stub.ObjectFactory;





@RestController
@RequestMapping("/identidad")
public class IdentidadController {
	
	@Autowired
	private SoapClient soapClient;
	
	@GetMapping
	public String identidad(@RequestParam long nroCuenta, long nroDni ) {
		
		ObjectFactory objectFactory = new ObjectFactory();
		ConfirmarIdentidad request =  new ConfirmarIdentidad();
		BigInteger numDni = BigInteger.valueOf(nroDni);
		BigInteger numCuenta = BigInteger.valueOf(nroCuenta);
		request.setDniPersona(numDni);
		request.setNroCuenta(numCuenta);
		
		ConfirmarIdentidadResponse response = soapClient.obtenerIdentidad("http://localhost:8000/soap", objectFactory.createConfirmarIdentidad(request));
		
		return response.getConfirmarIdentidadResult();
	}
	
}