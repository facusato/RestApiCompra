package com.unla.RestApiCompra.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.unla.RestApiCompra.entities.Reclamo;

@Repository("reclamoRepository")
public interface IReclamoRepository extends JpaRepository<Reclamo, Serializable> {
	
	public abstract Reclamo findByIdReclamo(long idReclamo);
	
	@Query("SELECT r FROM  Reclamo r WHERE r.estado = (:estado)")
	public abstract List<Reclamo> findByEstado(String estado);
	
	/*@Query("SELECT r FROM Reclamo r JOIN FETCH r.cliente c WHERE c.idCliente = (:idCliente)")
	public abstract List<Reclamo> findByIdCliente(long idCliente);*/
}

