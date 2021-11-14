package com.unla.RestApiCompra.services.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.RestApiCompra.client.ProductoClient;
import com.unla.RestApiCompra.entities.Carrito;
import com.unla.RestApiCompra.models.Producto;
import com.unla.RestApiCompra.models.Vendedor;
import com.unla.RestApiCompra.repositories.ICarritoRepository;
import com.unla.RestApiCompra.repositories.IClienteRepository;
import com.unla.RestApiCompra.services.ICarritoService;

@Service("carritoService")
public class CarritoService implements ICarritoService{
	
	@Autowired
	@Qualifier("carritoRepository")
	private ICarritoRepository carritoRepository;
	
	@Autowired
	@Qualifier("clienteRepository")
	private IClienteRepository clienteRepository;
	
	@Autowired
	ProductoClient productoClient;

	@Override
	public List<Carrito> getAll() {
		
		return carritoRepository.findAll();
	}

	@Override
	public Carrito crearCarrito(Carrito carrito) {
		Producto producto=productoClient.obtenerProductoPorId(carritoRepository.findByIdCarrito(carrito.getIdCarrito()).getIdProducto()).getBody();
		Carrito carritoDB = carritoRepository.findByIdCarrito(carrito.getIdCarrito());
		carritoDB.setCliente(clienteRepository.findByIdCliente(carritoDB.getCliente().getIdCliente()));
		Vendedor vendedor=producto.getVendedor();
		producto.setVendedor(vendedor);
		carritoDB.setProducto(producto);
		return carritoRepository.save(carritoDB);
		
	}

	@Override
	public Carrito modificarCarrito(Carrito carrito) {
		return carritoRepository.save(carrito);
	}

	@Override
	public Carrito obtenerCarrito(long idCarrito) {
		//Producto producto=productoClient.obtenerProductoPorId(carritoRepository.findByIdCarrito(idCarrito).getIdProducto()).getBody();
		//Carrito carrito=carritoRepository.findByIdCarrito(idCarrito);
		//carrito.setCliente(carrito.getCliente());
		//carrito.setProducto(producto);
		return carritoRepository.findByIdCarrito(idCarrito);
	}

	@Override
	public boolean eliminarCarrito(long idCarrito) {
		try {
			carritoRepository.deleteById(idCarrito);
			return true;
		}catch (Exception e) {
		return false;
		}
	}
	
	

}
