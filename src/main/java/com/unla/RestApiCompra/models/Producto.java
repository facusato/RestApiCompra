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
	public Producto(long idProducto, String nombre, String descripcion, String imagen, double precio, int stock,
			String formaDePago, Vendedor vendedor) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
		this.stock = stock;
		this.formaDePago = formaDePago;
		this.vendedor = vendedor;
	}
	public Producto() {
		super();
	}
	public long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	

}
