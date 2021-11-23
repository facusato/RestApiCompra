package com.unla.RestApiCompra.services.implementacion;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.unla.RestApiCompra.CorreoSoap.SoapClient;
import com.unla.RestApiCompra.client.ProductoClient;
import com.unla.RestApiCompra.entities.Cliente;
import com.unla.RestApiCompra.entities.Items;
import com.unla.RestApiCompra.entities.Pedido;
import com.unla.RestApiCompra.models.Producto;
import com.unla.RestApiCompra.repositories.IClienteRepository;
import com.unla.RestApiCompra.repositories.IPedidoRepository;
import com.unla.RestApiCompra.services.IPedidoService;
import com.unla.RestApiCompra.stub.ConsultarEstadoPorCodSeguim;
import com.unla.RestApiCompra.stub.ConsultarEstadoPorCodSeguimResponse;
import com.unla.RestApiCompra.stub.GenerarCodSeguimiento;
import com.unla.RestApiCompra.stub.GenerarCodSeguimientoResponse;
import com.unla.RestApiCompra.stub.ObjectFactory;

@Service("pedidoService")
public class PedidoService implements IPedidoService{
	
	
	@Autowired
	@Qualifier("pedidoRepository")
	private IPedidoRepository pedidoRepository;
	
	@Autowired
	@Qualifier("clienteRepository")
	private IClienteRepository clienteRepository;
	
	@Autowired
	private SoapClient soapClient;
	
	
	
	@Autowired
	ProductoClient productoClient;
	
	@Override
	public List<Pedido> getAll() {
		int index=0;
		List<Pedido> p=pedidoRepository.findAll();
		while(index<p.size()) {
			p.get(index).setCliente(clienteRepository.findByIdCliente(p.get(index).getCliente().getIdCliente()));
		index++;
		}
		return p;
	}


	@Override
	public Pedido modificarPedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

	@Override
	public boolean eliminarPedido(long idPedido) {
		try {
			pedidoRepository.deleteById(idPedido);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public Pedido obtenerPedido(long idPedido) {
		Pedido pedido =pedidoRepository.findByIdPedido(idPedido);
		if(null!=pedido) {
			pedido.setCliente(clienteRepository.findByIdCliente(pedido.getCliente().getIdCliente()));
			int codigo = pedido.getCodigoSeguim();
			String cadena = String.valueOf(codigo);
			long codigoSeguimiento = Long.parseLong(cadena);
			pedido.setEstado(estadoEnvio(codigoSeguimiento));
			List<Items> listaItems=pedido.getItems().stream().map(items -> {
                Producto producto = productoClient.obtenerProductoPorId(items.getProductoId()).getBody();
                items.setProducto(producto);
                return items;
            }).collect(Collectors.toList());
            pedido.setItems(listaItems);
        }
	
        return pedido ;
	}
	
	@Override
	public Pedido crearPedido(Pedido pedido) {
		pedidoRepository.save(pedido);
		Cliente cliente=clienteRepository.findByIdCliente(pedidoRepository.findByIdPedido(pedido.getIdPedido()).getCliente().getIdCliente());
		pedido.setCliente(cliente);
		BigInteger response = generarCodigoSeguimiento(1, cliente.getDni(), cliente.getDomicilio());
		String codigoSeguimiento = response.toString();
		int codigoSeguimientoInt= Integer.parseInt(codigoSeguimiento);
		pedido.setCodigoSeguim(codigoSeguimientoInt);
		String estado = estadoEnvio(codigoSeguimientoInt);
		pedido.setEstado(estado);
		modificarPedido(pedido);
		Pedido pedidoDB = pedidoRepository.findByIdPedido(pedido.getIdPedido());
		pedidoDB.getItems().forEach( items -> {
            productoClient.updateStockProduct( items.getProductoId(), items.getCantidad() * -1);
        });
		return pedidoDB;
	}
	
	
	
public BigInteger generarCodigoSeguimiento(@RequestParam long idVendedor, long dniPersona, String domicilio) {
		
		ObjectFactory objectFactory = new ObjectFactory();
		GenerarCodSeguimiento request = new GenerarCodSeguimiento();
		BigInteger numIdVendedor = BigInteger.valueOf(idVendedor);
		BigInteger numDni = BigInteger.valueOf(dniPersona);
		request.setDniPersona(numDni);
		request.setIdvendedor(numIdVendedor);
		request.setDomicilio(domicilio);
		
		GenerarCodSeguimientoResponse response = soapClient.obtenerCodigoSeguimiento("http://localhost:8088/soap", objectFactory.createGenerarCodSeguimiento(request));
		return response.getGenerarCodSeguimientoResult();
	}


public String estadoEnvio(@RequestParam long codSeguimiento) {
	
	ObjectFactory objectFactory = new ObjectFactory();
	ConsultarEstadoPorCodSeguim request = new ConsultarEstadoPorCodSeguim();
	BigInteger numSeguimiento = BigInteger.valueOf(codSeguimiento);
	request.setCodigoSeguim(numSeguimiento);
	
	
	ConsultarEstadoPorCodSeguimResponse response = soapClient.obtenerEstado("http://localhost:8088/soap", objectFactory.createConsultarEstadoPorCodSeguim(request));
	return response.getConsultarEstadoPorCodSeguimResult();
}
}
