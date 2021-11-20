package com.unla.RestApiCompra.entities;

import lombok.Data;

import javax.persistence.*;

import com.unla.RestApiCompra.models.Producto;

@Entity
@Data
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
        if (this.producto.getPrecio() >0  && this.cantidad >0 ){
            return this.cantidad * this.producto.getPrecio();
        }else {
            return (double) 0;
        }
    }
    public Items(){
        this.cantidad=(int) 0;
        this.precio=(double) 0;

    }
}