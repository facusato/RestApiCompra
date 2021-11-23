package com.unla.RestApiCompra.services.implementacion;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.unla.RestApiCompra.client.VendedorClient;
import com.unla.RestApiCompra.entities.Cliente;
import com.unla.RestApiCompra.entities.Pedido;
import com.unla.RestApiCompra.models.Vendedor;
import com.unla.RestApiCompra.repositories.IClienteRepository;
import com.unla.RestApiCompra.services.IClienteService;

@Service("clienteService")
public class ClienteService implements IClienteService{
	
	
	@Autowired
	@Qualifier("clienteRepository")
	private IClienteRepository clienteRepository;
	
	@Autowired
	private VendedorClient vendedorClient;
	
	@Override
	public List<Cliente> getAll() {
		return clienteRepository.findAll();
		
	}



	@Override
	public Cliente crearCliente(Cliente cliente) {
		Cliente clienteDB = clienteRepository.findByIdCliente(cliente.getIdCliente());
		if( clienteDB != null) {
			return clienteDB;
		}

		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente modificarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente findByIdCliente(long idCliente) {
		return clienteRepository.findByIdCliente(idCliente);
	}
	

	@Override
	public boolean eliminarCliente(long idCliente) {
		try {
			clienteRepository.deleteById(idCliente);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public Cliente obtenerCliente(long idCliente) {
		return clienteRepository.findByIdCliente(idCliente);
	}



	public ArrayList<Vendedor> obtenerVendedorPorNombreDeProducto(String nombre) {
		return vendedorClient.obtenerVendedorPorNombreDeProducto(nombre);
	}
	
	
	 @Transactional
	 public Cliente addPedido(Cliente cliente, Pedido pedido) {
	    	
	    	return clienteRepository.save(cliente);
	    }
	

}
