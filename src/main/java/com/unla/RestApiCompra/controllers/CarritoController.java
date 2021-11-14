package com.unla.RestApiCompra.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unla.RestApiCompra.entities.Carrito;
import com.unla.RestApiCompra.services.implementacion.CarritoService;

@RestController
@RequestMapping("/carrito")
public class CarritoController {
	
	@Autowired
	@Qualifier("carritoService")
	CarritoService carritoService;

	@GetMapping()
	public ResponseEntity<List<Carrito>> obtenerCarritos(){
		List<Carrito> lstCarrito = carritoService.getAll();
		if(lstCarrito.isEmpty()) {
			ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(lstCarrito);
	}
	
	@GetMapping("/{idCarrito")
	public ResponseEntity<Carrito> obtenerCarritoPorId(@PathVariable("idCarrito") long idCarrito){
		Carrito carrito = carritoService.obtenerCarrito(idCarrito);
		if(carrito==null) {
			ResponseEntity.noContent().build();
	}
	return ResponseEntity.ok(carrito);
	}

	@PostMapping()
	public ResponseEntity<Carrito> insertarCarrito(@RequestBody Carrito carrito , BindingResult result){
		return ResponseEntity.status(HttpStatus.CREATED).body(carritoService.crearCarrito(carrito));	
	}
	
	@PutMapping("/{idCarrito")
		public ResponseEntity<Carrito> actualizarCarrito(@PathVariable("idCarrito") long idCarrito, @RequestBody Carrito carrito){
			Carrito carritoAct = carritoService.obtenerCarrito(idCarrito);
			carritoAct.setCantidad(carrito.getCantidad());
			carritoAct.setSubtotal(carrito.getSubtotal());
			
			return ResponseEntity.ok(carritoService.modificarCarrito(carritoAct));
		}
	
	@DeleteMapping("/{idCarrito}")
	public boolean eliminarCarrito(@PathVariable("idCarrito") long idCarrito) {
		return carritoService.eliminarCarrito(idCarrito);
	}
	
	}






