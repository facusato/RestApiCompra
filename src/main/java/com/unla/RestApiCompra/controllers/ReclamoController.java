package com.unla.RestApiCompra.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.unla.RestApiCompra.entities.Reclamo;
import com.unla.RestApiCompra.services.implementacion.ClienteService;
import com.unla.RestApiCompra.services.implementacion.ReclamoService;

@RestController
@CrossOrigin("*")
@RequestMapping("/reclamo")
public class ReclamoController {
	
	@Autowired
	@Qualifier("reclamoService")
	ReclamoService reclamoService;
	
	
	@Autowired
	@Qualifier("clienteService")
	ClienteService clienteService;
	
	@GetMapping()
	public ResponseEntity<List<Reclamo>> obtenerReclamos(){
		List<Reclamo> lstReclamos = reclamoService.getAll();
		if(lstReclamos.isEmpty()) {
			ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(lstReclamos);
	}
	
	@GetMapping("/{idReclamo}")
	public ResponseEntity<Reclamo> obtenerReclamoPorId(@PathVariable("idReclamo") long idReclamo){
		Reclamo reclamo = reclamoService.obtenerReclamo(idReclamo);
		if(reclamo==null) {
			ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(reclamo);
	}
	
	
	@GetMapping("/estado/{estado}")
	public ResponseEntity<List<Reclamo>> obtenerReclamosPorEstado(@PathVariable("estado") String estado){
		List<Reclamo> reclamos = reclamoService.obtenerReclamosPorEstado(estado);
		if(reclamos.isEmpty()) {
			ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(reclamos);
	}
	
	@PostMapping()
	public ResponseEntity<Reclamo> insertarReclamo(@RequestBody Reclamo reclamo, BindingResult result){
		return ResponseEntity.status(HttpStatus.CREATED).body(reclamoService.crearReclamo(reclamo));
	}
	
	@PutMapping("/{idReclamo}")
	public ResponseEntity<Reclamo> actualizarReclamo(@PathVariable("idReclamo") long idReclamo, @RequestBody Reclamo reclamo){
		Reclamo reclamoAct = reclamoService.obtenerReclamo(idReclamo);
		reclamoAct.setEstado(reclamo.getEstado());
		reclamoAct.setDescripcion(reclamo.getDescripcion());
		reclamoAct.setIdPedido(reclamo.getIdPedido());
		return ResponseEntity.ok(reclamoService.modificarReclamo(reclamoAct));
	}
	
	@DeleteMapping("/{idReclamo}")
	public boolean eliminarReclamo(@PathVariable("idReclamo") long idReclamo) {
		return reclamoService.eliminarReclamo(idReclamo);
	}
}
