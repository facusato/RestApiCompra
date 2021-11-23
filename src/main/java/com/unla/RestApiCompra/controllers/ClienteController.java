package com.unla.RestApiCompra.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import  com.unla.RestApiCompra.models.*;
import com.unla.RestApiCompra.entities.Cliente;

import com.unla.RestApiCompra.services.implementacion.ClienteService;
import com.unla.RestApiCompra.services.implementacion.PedidoService;

@RestController
@CrossOrigin("*")
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	@Qualifier("clienteService")
	ClienteService clienteService;
	
	@Autowired
	@Qualifier("pedidoService")
	PedidoService pedidoService;
	
	@GetMapping()
	public ResponseEntity<List<Cliente>> obtenerClientes(){
		List<Cliente> lstClientes = clienteService.getAll();
		if(lstClientes.isEmpty()) {
			ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(lstClientes);
	}
	
	@GetMapping("/{idCliente}")
	public ResponseEntity<Cliente> obtenerClientePorId(@PathVariable("idCliente") long idCliente){
		Cliente cliente = clienteService.obtenerCliente(idCliente);
		if(cliente==null) {
			ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(cliente);
	}
	
	@PostMapping()
	public ResponseEntity<Cliente> insertarCliente(@RequestBody Cliente cliente){
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.crearCliente(cliente));
	}
	
	@PutMapping("/{idCliente}")
	public ResponseEntity<Cliente> actualizarCliente(@PathVariable("idCliente") long idCliente, @RequestBody Cliente cliente){
		Cliente clienteAct = clienteService.obtenerCliente(idCliente);
		clienteAct.setApellido(cliente.getApellido());
		clienteAct.setNombre(cliente.getNombre());
		clienteAct.setDni(cliente.getDni());
	
		return ResponseEntity.ok(clienteService.modificarCliente(clienteAct));
	}
	
	@DeleteMapping("/{idCliente}")
	public boolean eliminarCliente(@PathVariable("idCliente") long idCliente) {
		return clienteService.eliminarCliente(idCliente);
	}
	
	@GetMapping("/productonombre")
    public ArrayList<Vendedor> obtenerVendedorPorNombreDeProducto(@RequestParam("nombre") String nombre){
		
		ArrayList<Vendedor> v=clienteService.obtenerVendedorPorNombreDeProducto(nombre);
		return v;
	}
	
	

}
