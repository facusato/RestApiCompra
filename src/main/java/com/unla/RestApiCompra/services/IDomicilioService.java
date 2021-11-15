package com.unla.RestApiCompra.services;

import java.util.List;

import com.unla.RestApiCompra.entities.Domicilio;

public interface IDomicilioService {
	
	public List<Domicilio> getAll();
	
	public Domicilio crearDomicilio(Domicilio domicilio);
	
	public Domicilio modificarDomicilio(Domicilio domicilio);
	
	public Domicilio obtenerDomicilio (long idDomicilio);

	public boolean eliminarDomicilio(long idDomicilio);

}
