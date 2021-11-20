package com.unla.RestApiCompra.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.RestApiCompra.entities.Cliente;
import com.unla.RestApiCompra.entities.MedioDePago;


@Repository("clienteRepository")
public interface IClienteRepository extends JpaRepository<Cliente, Serializable> {
	
	public abstract Cliente findByIdCliente(long idCliente);
	public abstract Cliente findByDni(long dni);
	public abstract Cliente findByApellido(String apellido);
	public abstract List<Cliente> findClientesByApellido(String apellido);
	public abstract MedioDePago save(MedioDePago medio);
	
	

}
