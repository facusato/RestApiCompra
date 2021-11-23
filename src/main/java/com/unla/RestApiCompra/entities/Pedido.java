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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



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
	    
	
	public Pedido() {
		
		items = new ArrayList<>();
	}


	public Pedido(long idPedido, int codigoSeguim, String estado, Cliente cliente, List<Items> items) {
		super();
		this.idPedido = idPedido;
		this.codigoSeguim = codigoSeguim;
		this.estado = estado;
		this.cliente = cliente;
		this.items = items;
	}




	public long getIdPedido() {
		return idPedido;
	}


	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}


	public int getCodigoSeguim() {
		return codigoSeguim;
	}


	public void setCodigoSeguim(int codigoSeguim) {
		this.codigoSeguim = codigoSeguim;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<Items> getItems() {
		return items;
	}


	public void setItems(List<Items> items) {
		this.items = items;
	}


	

}
