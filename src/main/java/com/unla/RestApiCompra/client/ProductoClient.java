package com.unla.RestApiCompra.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.unla.RestApiCompra.models.Producto;

@FeignClient(name="ApiRestVentas")
@RequestMapping("/producto")
public interface ProductoClient {
	
	
	@GetMapping("/{idProducto}")
	public ResponseEntity<Producto> obtenerProductoPorId(@PathVariable("idProducto") long idProducto);
	
	@GetMapping("/nombre/{nombre}")
	public ResponseEntity<List<Producto>> obtenerProductosPorNombre(@PathVariable("nombre") String nombre);
	
	 @PutMapping ("/stock/{idProducto}")
	 public ResponseEntity<Producto> updateStockProduct(@PathVariable("idProducto")  Long idProducto ,@RequestParam(name = "stock", required = true) int stock);
}
