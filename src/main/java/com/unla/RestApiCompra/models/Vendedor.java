package com.unla.RestApiCompra.models;

import java.util.HashSet;
import java.util.Set;


import lombok.Data;

@Data
public class Vendedor {
	
	private long idVendedor;
	private String nombre;
	private String apellido;
	private long dni;
	private double Billetera;
	private Set<Producto> productos = new HashSet<>();

}
