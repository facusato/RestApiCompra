package com.unla.RestApiCompra.entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;


@Data
@Entity
@Table(name="pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPedido;
	
	//atributo que viene de correo
	@Column(name="codigoSeguim")
	private int codigoSeguim;
	
	//atributo que viene  del correo
	@Column(name="estado")
	private String estado;
	
	@OneToOne
	private Cliente cliente;
	
	
	
	 @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	 @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 @JoinColumn(name = "pedido_id")
	 private List<Items> items;
	 
	 
	 @Transient
	 private double total;
	    
	
	public Pedido() {
		
		items = new ArrayList<>();
	}
	
	
	public double getTotal(){
		int i=0;
		while(i<items.size()) {
			
			total+=items.get(i).getCantidad()*items.get(i).getPrecio();
			i++;
		}
        return total;
    }

	

}
