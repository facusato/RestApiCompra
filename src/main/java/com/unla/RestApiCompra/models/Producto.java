package com.unla.RestApiCompra.models;

import lombok.Data;

@Data
public class Producto {
	
	private  long idProducto;
	private String nombre;
	private String descripcion;
	private String imagen;
	private double precio;
	private int stock;
	private String formaDePago;
	private Vendedor vendedor;

}
