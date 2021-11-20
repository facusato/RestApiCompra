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
import com.unla.RestApiCompra.entities.MedioDePago;
import com.unla.RestApiCompra.services.implementacion.ClienteService;
import com.unla.RestApiCompra.services.implementacion.MedioDePagoService;

@RestController
@RequestMapping("/medioDePago")
public class MedioDePagoController {
	
	@Autowired
	@Qualifier("medioDePagoService")
	MedioDePagoService medioDePagoService;
	
	@Autowired
	@Qualifier("clienteService")
	ClienteService clienteService;
	
	@GetMapping()
	public ResponseEntity<List<MedioDePago>> obtenerMedioDePagos(){
		List<MedioDePago> lstMedioDePagos = medioDePagoService.getAll();
		if(lstMedioDePagos.isEmpty()) {
			ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(lstMedioDePagos);
	}
	
	@GetMapping("/{idMedioDePago}")
	public ResponseEntity<MedioDePago> obtenerMedioDePagoPorId(@PathVariable("idMedioDePago") long idMedioDePago){
		MedioDePago medioDePago = medioDePagoService.obtenerMedioDePago(idMedioDePago);
		if(medioDePago==null) {
			ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(medioDePago);
	}
	
	@PostMapping()
	public ResponseEntity<MedioDePago> insertarMedioDePago(@RequestBody MedioDePago medioDePago, BindingResult result){
		return ResponseEntity.status(HttpStatus.CREATED).body(medioDePagoService.crearMedioDePago(medioDePago));
	}
	
	@PutMapping("/{idMedioDePago}")
	public ResponseEntity<MedioDePago> actualizarMedioDePago(@PathVariable("idMedioDePago") long idMedioDePago, @RequestBody MedioDePago medioDePago){
		MedioDePago medioDePagoAct = medioDePagoService.obtenerMedioDePago(idMedioDePago);
		medioDePagoAct.setNombreMedio(medioDePago.getNombreMedio());
		medioDePagoAct.setMonto(medioDePago.getMonto());
		Cliente clienteAct = clienteService.obtenerCliente(medioDePago.getCliente().getIdCliente());
		clienteAct.setApellido(medioDePago.getCliente().getApellido());
		clienteAct.setNombre(medioDePago.getCliente().getNombre());
		medioDePagoAct.setCliente(clienteAct);
		return ResponseEntity.ok(medioDePagoService.modificarMedioDePago(medioDePagoAct));
	}
	
	@DeleteMapping("/{idMedioDePago}")
	public boolean eliminarMedioDePago(@PathVariable("idMedioDePago") long idMedioDePago) {
		return medioDePagoService.eliminarMedioDePago(idMedioDePago);
	}
}
