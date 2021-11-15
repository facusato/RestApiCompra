package com.unla.RestApiCompra.services;

import java.util.List;

import com.unla.RestApiCompra.entities.Denuncia;

public interface IDenunciaService {
	
	public List<Denuncia> getAll();
	
	public Denuncia crearDenuncia(Denuncia denuncia);
	
	public Denuncia modificarDenuncia(Denuncia denuncia);
	
	public Denuncia obtenerDenuncia (long idDenuncia);

	public boolean eliminarDenuncia(long idDenuncia);

}
