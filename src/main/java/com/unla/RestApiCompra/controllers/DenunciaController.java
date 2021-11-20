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
import com.unla.RestApiCompra.entities.Denuncia;
import com.unla.RestApiCompra.services.implementacion.ClienteService;
import com.unla.RestApiCompra.services.implementacion.DenunciaService;

@RestController
@RequestMapping("/denuncia")
public class DenunciaController {
	
	@Autowired
	@Qualifier("denunciaService")
	DenunciaService denunciaService;
	
	@Autowired
	@Qualifier("clienteService")
	ClienteService clienteService;
	
	@GetMapping()
	public ResponseEntity<List<Denuncia>> obtenerDenuncias(){
		List<Denuncia> lstDenuncias = denunciaService.getAll();
		if(lstDenuncias.isEmpty()) {
			ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(lstDenuncias);
	}
	
	@GetMapping("/{idDenuncia}")
	public ResponseEntity<Denuncia> obtenerDenunciaPorId(@PathVariable("idDenuncia") long idDenuncia){
		Denuncia denuncia = denunciaService.obtenerDenuncia(idDenuncia);
		if(denuncia==null) {
			ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(denuncia);
	}
	
	
	@GetMapping("/estado/{estado}")
	public ResponseEntity<List<Denuncia>> obtenerDenunciasPorestado(@PathVariable("estado") String estado){
		List<Denuncia> denuncias = denunciaService.obtenerDenunciasPorEstado(estado);
		if(denuncias.isEmpty()) {
			ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(denuncias);
	}
	
	@PostMapping()
	public ResponseEntity<Denuncia> insertarDenuncia(@RequestBody Denuncia denuncia, BindingResult result){
		return ResponseEntity.status(HttpStatus.CREATED).body(denunciaService.crearDenuncia(denuncia));
	}
	
	@PutMapping("/{idDenuncia}")
	public ResponseEntity<Denuncia> actualizarDenuncia(@PathVariable("idDenuncia") long idDenuncia, @RequestBody Denuncia denuncia){
		Denuncia denunciaAct = denunciaService.obtenerDenuncia(idDenuncia);
		denunciaAct.setCategoria(denuncia.getCategoria());
		denunciaAct.setDescripcion(denuncia.getDescripcion());
		Cliente clienteAct = clienteService.obtenerCliente(denuncia.getCliente().getIdCliente());
		clienteAct.setApellido(denuncia.getCliente().getApellido());
		clienteAct.setNombre(denuncia.getCliente().getNombre());
		denunciaAct.setCliente(clienteAct);
		return ResponseEntity.ok(denunciaService.modificarDenuncia(denunciaAct));
	}
	
	@DeleteMapping("/{idDenuncia}")
	public boolean eliminarDenuncia(@PathVariable("idDenuncia") long idDenuncia) {
		return denunciaService.eliminarDenuncia(idDenuncia);
	}
}
