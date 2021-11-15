package com.unla.RestApiCompra.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.RestApiCompra.entities.Reclamo;

@Repository("reclamoRepository")
public interface IReclamoRepository extends JpaRepository<Reclamo, Serializable> {
	
	public abstract Reclamo findByIdReclamo(long idReclamo);
}

