package com.unla.RestApiCompra.CorreoSoap;

import javax.xml.bind.JAXBElement;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.unla.RestApiCompra.stub.ConfirmarIdentidadResponse;
import com.unla.RestApiCompra.stub.ConsultarEstadoPorCodSeguimResponse;
import com.unla.RestApiCompra.stub.ConsultarSaldoResponse;
import com.unla.RestApiCompra.stub.GenerarCodSeguimientoResponse;





public class SoapClient extends WebServiceGatewaySupport {
	
	public GenerarCodSeguimientoResponse obtenerCodigoSeguimiento(String url, Object request) {
		JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
		return (GenerarCodSeguimientoResponse) res.getValue();
	}

	public ConsultarEstadoPorCodSeguimResponse obtenerEstado(String url, Object request) {
		JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
		return (ConsultarEstadoPorCodSeguimResponse) res.getValue();
	}
	
	public ConfirmarIdentidadResponse obtenerIdentidad(String url, Object request) {
		JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
		return (ConfirmarIdentidadResponse) res.getValue();
	}
	
	
	public ConsultarSaldoResponse obtenerSaldo(String url, Object request) {
		JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
		return (ConsultarSaldoResponse) res.getValue();
	}
}
