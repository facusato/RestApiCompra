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

import com.unla.RestApiCompra.entities.Pedido;
import com.unla.RestApiCompra.services.implementacion.ClienteService;
import com.unla.RestApiCompra.services.implementacion.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
	
	@Autowired
	@Qualifier("pedidoService")
	PedidoService pedidoService;
	
	@Autowired
	@Qualifier("clienteService")
	ClienteService clienteService;
	
	@GetMapping()
	public ResponseEntity<List<Pedido>> obtenerPedidos(){
		List<Pedido> lstPedidos = pedidoService.getAll();
		if(lstPedidos.isEmpty()) {
			ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(lstPedidos);
	}
	
	@GetMapping("/{idPedido}")
	public ResponseEntity<Pedido> obtenerPedidoPorId(@PathVariable("idPedido") long idPedido){
		Pedido pedido = pedidoService.obtenerPedido(idPedido);
		if(pedido==null) {
			ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(pedido);
	}
	
	@PostMapping()
	public ResponseEntity<Pedido> insertarPedido(@RequestBody Pedido pedido, BindingResult result){
		return ResponseEntity.status(HttpStatus.CREATED).body(pedidoService.crearPedido(pedido));
	}
	
	@PutMapping("/{idPedido}")
	public ResponseEntity<Pedido> actualizarPedido(@PathVariable("idPedido") long idPedido, @RequestBody Pedido pedido){
		Pedido pedidoAct = pedidoService.obtenerPedido(idPedido);
		pedidoAct.setCodigoSeguim(pedido.getCodigoSeguim());
		pedidoAct.setDomicilio(pedido.getDomicilio());
		pedidoAct.setDni(pedido.getDni());
		pedidoAct.setEstado(pedido.getEstado());
		//setear productos
		return ResponseEntity.ok(pedidoService.modificarPedido(pedidoAct));
	}
	
	@DeleteMapping("/{idPedido}")
	public boolean eliminarPedido(@PathVariable("idPedido") long idPedido) {
		return pedidoService.eliminarPedido(idPedido);
	}
}
