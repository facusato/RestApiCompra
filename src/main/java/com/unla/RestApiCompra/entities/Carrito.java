package com.unla.RestApiCompra.entities;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.unla.RestApiCompra.models.Producto;
import lombok.Data;




@Data 
@Entity
@Table(name="carrito")
public class Carrito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCarrito;
	
	@Column(name="cantidad")
	private int cantidad;
	
	@Column(name="subTotal")
	private double subtotal;
	
	@Column(name="producto_id")
	private long idProducto;
	
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="cliente_id", nullable=false)
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Cliente cliente;
	
	@Transient
	private Producto producto;
	
}
