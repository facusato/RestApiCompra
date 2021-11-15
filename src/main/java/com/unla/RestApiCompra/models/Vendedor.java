package com.unla.RestApiCompra.models;

import lombok.Data;

@Data
public class Vendedor {
	
	private long idVendedor;
	private String usuario;
	private String password;
	private String nombre;
	private String apellido;
	private long dni;
	private double Billetera;

}
