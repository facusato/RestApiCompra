package com.unla.RestApiCompra.services;

import java.util.List;

import com.unla.RestApiCompra.entities.Pedido;

public interface IPedidoService {
	
	public List<Pedido> getAll();
	
	public Pedido crearPedido(Pedido pedido);
	
	public Pedido modificarPedido(Pedido pedido);
	
	public Pedido obtenerPedido (long idPedido);

	public boolean eliminarPedido(long idPedido);

}
