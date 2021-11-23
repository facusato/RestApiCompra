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
	public Vendedor(long idVendedor, String nombre, String apellido, long dni, double billetera,
			Set<Producto> productos) {
		super();
		this.idVendedor = idVendedor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		Billetera = billetera;
		this.productos = productos;
	}
	public Vendedor() {
		super();
	}
	public long getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(long idVendedor) {
		this.idVendedor = idVendedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public double getBilletera() {
		return Billetera;
	}
	public void setBilletera(double billetera) {
		Billetera = billetera;
	}
	public Set<Producto> getProductos() {
		return productos;
	}
	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}
	
	

}
