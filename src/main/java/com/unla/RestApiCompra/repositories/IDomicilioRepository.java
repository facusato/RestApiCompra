package com.unla.RestApiCompra.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unla.RestApiCompra.entities.Domicilio;

@Repository("domicilioRepository")
public interface IDomicilioRepository extends JpaRepository<Domicilio, Serializable> {
	
	public abstract Domicilio findByIdDomicilio(long idDomicilio);
	
	@Query("SELECT d FROM Domicilio d JOIN FETCH d.cliente c WHERE c.idCliente = (:idCliente)")
	public abstract List<Domicilio> findByIdCliente(long idCliente);
}


