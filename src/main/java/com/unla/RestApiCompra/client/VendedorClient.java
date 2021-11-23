package com.unla.RestApiCompra.client;

import java.util.ArrayList;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.unla.RestApiCompra.models.Vendedor;

@FeignClient(name="b", url="http://localhost:8091")
@RequestMapping("/vendedor")
public interface VendedorClient {
	
	 @GetMapping("/productonombre")
	    public ArrayList<Vendedor> obtenerVendedorPorNombreDeProducto(@RequestParam("nombre") String nombre);
	 
	 @GetMapping("/{idVendedor}")
		public ResponseEntity<Vendedor> obtenerVendedorPorId(@PathVariable("idVendedor") long idVendedor);

}
