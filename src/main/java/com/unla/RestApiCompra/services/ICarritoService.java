package com.unla.RestApiCompra.services;
import java.util.List;
import com.unla.RestApiCompra.entities.Carrito;


public interface ICarritoService {
	
	public List<Carrito> getAll();
	
	public Carrito crearCarrito (Carrito carrito);
	
	public Carrito modificarCarrito (Carrito carrito);
	
	public Carrito obtenerCarrito (long idCarrito);
	
	public boolean eliminarCarrito (long idCarrito);
	
	
}
