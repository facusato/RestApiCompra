package com.unla.RestApiCompra.services;

import java.util.List;

import com.unla.RestApiCompra.entities.Reclamo;

public interface IReclamoService {
	
	public List<Reclamo> getAll();
	
	public List<Reclamo> obtenerReclamosPorEstado(String estado);
	
	public Reclamo crearReclamo(Reclamo reclamo);
	
	public Reclamo modificarReclamo(Reclamo reclamo);
	
	public Reclamo obtenerReclamo (long idReclamo);

	public boolean eliminarReclamo(long idReclamo);

}
