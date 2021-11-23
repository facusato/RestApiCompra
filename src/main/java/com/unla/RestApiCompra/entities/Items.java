package com.unla.RestApiCompra.entities;

import lombok.Data;

import javax.persistence.*;

import com.unla.RestApiCompra.models.Producto;

@Entity
@Table(name = "items")

public class Items  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private int cantidad;
    
    private Double  precio;

    @Column(name = "producto_id")
    private Long productoId;
    
    @Transient
    private Double subTotal;

    @Transient
    private Producto producto;

    public Double getSubTotal(){
        if (this.getPrecio() >0  && this.cantidad >0 ){
            return this.cantidad * this.getPrecio();
        }else {
            return (double) 0;
        }
    }
    public Items(){
        this.cantidad=(int) 0;
        this.precio=(double) 0;

    }
	public Items(Long id, int cantidad, Double precio, Long productoId, Double subTotal, Producto producto) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.precio = precio;
		this.productoId = productoId;
		this.subTotal = subTotal;
		this.producto = producto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Long getProductoId() {
		return productoId;
	}
	public void setProductoId(Long productoId) {
		this.productoId = productoId;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
    
    
}