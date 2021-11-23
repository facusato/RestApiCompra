package com.unla.RestApiCompra.entities;

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
@Table(name="reclamo")
public class Reclamo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idReclamo;
	
	private String descripcion;
	
	private String estado;
	
	private long idPedido;

	public Reclamo(long idReclamo, String descripcion, String estado, long idPedido) {
		super();
		this.idReclamo = idReclamo;
		this.descripcion = descripcion;
		this.estado = estado;

	}

	public Reclamo() {
		super();
	}

	public long getIdReclamo() {
		return idReclamo;
	}

	public void setIdReclamo(long idReclamo) {
		this.idReclamo = idReclamo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}

 
	
}
