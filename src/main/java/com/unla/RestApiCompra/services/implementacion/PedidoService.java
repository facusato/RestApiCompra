package com.unla.RestApiCompra.services.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.RestApiCompra.entities.Pedido;
import com.unla.RestApiCompra.repositories.IPedidoRepository;
import com.unla.RestApiCompra.services.IPedidoService;

@Service("pedidoService")
public class PedidoService implements IPedidoService{
	
	
	@Autowired
	@Qualifier("pedidoRepository")
	private IPedidoRepository pedidoRepository;
	
	@Override
	public List<Pedido> getAll() {
		return pedidoRepository.findAll();
		
	}



	@Override
	public Pedido crearPedido(Pedido pedido) {
		Pedido pedidoDB = pedidoRepository.findByIdPedido(pedido.getIdPedido());
		if( pedidoDB != null) {
			return pedidoDB;
		}

		return pedidoRepository.save(pedido);
	}

	@Override
	public Pedido modificarPedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

	@Override
	public boolean eliminarPedido(long idPedido) {
		try {
			pedidoRepository.deleteById(idPedido);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public Pedido obtenerPedido(long idPedido) {
		return pedidoRepository.findByIdPedido(idPedido);
	}
}
