package com.unla.RestApiCompra.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.unla.RestApiCompra.entities.MedioDePago;

@Repository("medioDePagoRepository")
public interface IMedioDePagoRepository extends JpaRepository<MedioDePago, Serializable> {
	
	public abstract MedioDePago findByIdMedioDePago(long idMedioDePago);
	
	@Query("SELECT m FROM MedioDePago m JOIN FETCH m.cliente c WHERE c.idCliente = (:idCliente)")
	public abstract List<MedioDePago> findByIdCliente(long idCliente);
}