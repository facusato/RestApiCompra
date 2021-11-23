package com.unla.RestApiCompra.services.implementacion;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.unla.RestApiCompra.client.ProductoClient;
import com.unla.RestApiCompra.client.VendedorClient;
import com.unla.RestApiCompra.entities.Cliente;
import com.unla.RestApiCompra.entities.Items;
import com.unla.RestApiCompra.entities.Pedido;
import com.unla.RestApiCompra.models.Producto;

import com.unla.RestApiCompra.repositories.IClienteRepository;
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
	ProductoClient productoClient;
	
	@Autowired
	VendedorClient vendedorClient;
	
	@Override
	public List<Pedido> getAll() {
		int index=0;
		List<Pedido> p=pedidoRepository.findAll();
		while(index<p.size()) {
			p.get(index).setCliente(clienteRepository.findByIdCliente(p.get(index).getCliente().getIdCliente()));
		index++;
		}
		return p;
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
			pedido.setCliente(clienteRepository.findByIdCliente(pedido.getCliente().getIdCliente()));
			List<Items> listaItems=pedido.getItems().stream().map(items -> {
                Producto producto = productoClient.obtenerProductoPorId(items.getProductoId()).getBody();
                items.setProducto(producto);
                return items;
            }).collect(Collectors.toList());
            pedido.setItems(listaItems);
        }
        return pedido ;
	}
	
	@Override
	public Pedido crearPedido(Pedido pedido) {
		pedidoRepository.save(pedido);
		Cliente cliente=clienteRepository.findByIdCliente(pedidoRepository.findByIdPedido(pedido.getIdPedido()).getCliente().getIdCliente());
		pedido.setCliente(cliente);
		Pedido pedidoDB = pedidoRepository.findByIdPedido(pedido.getIdPedido());
		pedidoDB.getItems().forEach( items -> {
            productoClient.updateStockProduct( items.getProductoId(), items.getCantidad() * -1); 
        });
		return pedidoDB;
	}
}
