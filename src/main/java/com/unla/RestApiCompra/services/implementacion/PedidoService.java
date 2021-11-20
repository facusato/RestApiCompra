package com.unla.RestApiCompra.services.implementacion;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.RestApiCompra.client.ProductoClient;
import com.unla.RestApiCompra.entities.Items;
import com.unla.RestApiCompra.entities.Pedido;
import com.unla.RestApiCompra.models.Producto;
import com.unla.RestApiCompra.repositories.IClienteRepository;
import com.unla.RestApiCompra.repositories.IItemsRepository;
import com.unla.RestApiCompra.repositories.IPedidoRepository;
import com.unla.RestApiCompra.services.IPedidoService;

@Service("pedidoService")
public class PedidoService implements IPedidoService{
	
	
	@Autowired
	@Qualifier("pedidoRepository")
	private IPedidoRepository pedidoRepository;
	
	@Autowired
	@Qualifier("clienteRepository")
	private IClienteRepository clienteRepository;
	
	@Autowired
	@Qualifier("itemsRepository")
	private IItemsRepository itemsRepository;
	
	@Autowired
	ProductoClient productoClient;
	
	@Override
	public List<Pedido> getAll() {
		return pedidoRepository.findAll();
		
	}

	@Override
	public Pedido crearPedido(Pedido pedido) {
		Pedido pedidoDB = pedidoRepository.findByIdPedido(pedido.getIdPedido());
		pedidoRepository.save(pedido);
		pedidoDB.getItems().forEach( items -> {
            productoClient.updateStockProduct( items.getProductoId(), items.getCantidad() * -1);
        });

		return pedidoDB;
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
		Pedido pedido =pedidoRepository.findByIdPedido(idPedido);
		if(null!=pedido) {
			List<Items> listaItems=pedido.getItems().stream().map(items -> {
                Producto producto = productoClient.obtenerProductoPorId(items.getProductoId()).getBody();
                items.setProducto(producto);
                return items;
            }).collect(Collectors.toList());
            pedido.setItems(listaItems);
        }
        return pedido ;
	}
}
