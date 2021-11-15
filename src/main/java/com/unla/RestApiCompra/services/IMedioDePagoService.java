package com.unla.RestApiCompra.services;

import java.util.List;

import com.unla.RestApiCompra.entities.MedioDePago;

public interface IMedioDePagoService {

	public List<MedioDePago> getAll();
	
	public MedioDePago crearMedioDePago(MedioDePago medioDePago);
	
	public MedioDePago modificarMedioDePago(MedioDePago medioDePago);
	
	public MedioDePago obtenerMedioDePago (long idMedioDePago);

	public boolean eliminarMedioDePago(long idMedioDePago);
}
