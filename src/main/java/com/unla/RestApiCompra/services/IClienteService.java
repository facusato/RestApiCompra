package com.unla.RestApiCompra.services;
import java.util.List;


import com.unla.RestApiCompra.entities.Cliente;


public interface IClienteService {
	
	public List<Cliente> getAll();
	
	public Cliente crearCliente(Cliente cliente);
	
	public Cliente modificarCliente(Cliente cliente);
	
	public Cliente obtenerCliente (long idCliente);

	public boolean eliminarCliente(long idCliente);
	
}
