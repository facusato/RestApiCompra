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

import com.unla.RestApiCompra.entities.Cliente;
import com.unla.RestApiCompra.entities.Domicilio;
import com.unla.RestApiCompra.services.implementacion.ClienteService;
import com.unla.RestApiCompra.services.implementacion.DomicilioService;

@RestController
@RequestMapping("/domicilio")
public class DomicilioController {
	
	@Autowired
	@Qualifier("domicilioService")
	DomicilioService domicilioService;
	
	@Autowired
	@Qualifier("clienteService")
	ClienteService clienteService;
	
	@GetMapping()
	public ResponseEntity<List<Domicilio>> obtenerDomicilios(){
		List<Domicilio> lstDomicilios = domicilioService.getAll();
		if(lstDomicilios.isEmpty()) {
			ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(lstDomicilios);
	}
	
	@GetMapping("/{idDomicilio}")
	public ResponseEntity<Domicilio> obtenerDomicilioPorId(@PathVariable("idDomicilio") long idDomicilio){
		Domicilio domicilio = domicilioService.obtenerDomicilio(idDomicilio);
		if(domicilio==null) {
			ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(domicilio);
	}
	
	@PostMapping()
	public ResponseEntity<Domicilio> insertarDomicilio(@RequestBody Domicilio domicilio, BindingResult result){
		return ResponseEntity.status(HttpStatus.CREATED).body(domicilioService.crearDomicilio(domicilio));
	}
	
	@PutMapping("/{idDomicilio}")
	public ResponseEntity<Domicilio> actualizarDomicilio(@PathVariable("idDomicilio") long idDomicilio, @RequestBody Domicilio domicilio){
		Domicilio domicilioAct = domicilioService.obtenerDomicilio(idDomicilio);
		domicilioAct.setCodPostal(domicilio.getCodPostal());
		domicilioAct.setProvincia(domicilio.getProvincia());
		domicilioAct.setLocalidad(domicilio.getLocalidad());
		domicilioAct.setDireccion(domicilio.getDireccion());
		Cliente clienteAct = clienteService.obtenerCliente(domicilio.getCliente().getIdCliente());
		clienteAct.setApellido(domicilio.getCliente().getApellido());
		clienteAct.setNombre(domicilio.getCliente().getNombre());
		clienteAct.setUsuario(domicilio.getCliente().getUsuario());
		clienteAct.setPassword(domicilio.getCliente().getPassword());
		domicilioAct.setCliente(clienteAct);
		return ResponseEntity.ok(domicilioService.modificarDomicilio(domicilioAct));
	}
	
	@DeleteMapping("/{idDomicilio}")
	public boolean eliminarDomicilio(@PathVariable("idDomicilio") long idDomicilio) {
		return domicilioService.eliminarDomicilio(idDomicilio);
	}
}
