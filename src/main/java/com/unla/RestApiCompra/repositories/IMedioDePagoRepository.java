package com.unla.RestApiCompra.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.RestApiCompra.entities.MedioDePago;

@Repository("medioDePagoRepository")
public interface IMedioDePagoRepository extends JpaRepository<MedioDePago, Serializable> {
	
	public abstract MedioDePago findByIdMedioDePago(long idMedioDePago);
}