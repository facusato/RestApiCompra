package com.unla.RestApiCompra.repositories;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.RestApiCompra.entities.Carrito;


@Repository("carritoRepository")
public interface ICarritoRepository extends JpaRepository<Carrito, Serializable> {
	
	
	public abstract Carrito findByIdCarrito(long idCarrito);


}
