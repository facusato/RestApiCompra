package com.unla.RestApiCompra.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.RestApiCompra.entities.Domicilio;

@Repository("domicilioRepository")
public interface IDomicilioRepository extends JpaRepository<Domicilio, Serializable> {
	
	public abstract Domicilio findByIdDomicilio(long idDomicilio);
}


