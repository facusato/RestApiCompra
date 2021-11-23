package com.unla.RestApiCompra.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="medioDePago")
public class MedioDePago {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idMedioDePago;
	
	@Column(name="nombre_medio")
	private String nombreMedio;
	
	@Column(name="monto")
	private double monto;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="cliente_id", nullable=false)
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Cliente cliente;


	public MedioDePago(long idMedioDePago, String nombreMedio, double monto, Cliente cliente) {
		super();
		this.idMedioDePago = idMedioDePago;
		this.nombreMedio = nombreMedio;
		this.monto = monto;
		this.cliente = cliente;
	}


	public long getIdMedioDePago() {
		return idMedioDePago;
	}


	public void setIdMedioDePago(long idMedioDePago) {
		this.idMedioDePago = idMedioDePago;
	}


	public String getNombreMedio() {
		return nombreMedio;
	}


	public void setNombreMedio(String nombreMedio) {
		this.nombreMedio = nombreMedio;
	}


	public double getMonto() {
		return monto;
	}


	public void setMonto(double monto) {
		this.monto = monto;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public MedioDePago() {
		super();
	}
	
	
	
	

}
