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
@Table(name="denuncia")
public class Denuncia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDenuncia;
	
	private String categoria;
	//falsificación ilegal fraude inapropiado
	
	private String descripcion;
	
	private String estado;
	


	public Denuncia(long idDenuncia, String categoria, String descripcion, String estado) {
		super();
		this.idDenuncia = idDenuncia;
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public Denuncia() {
		super();
	}

	public long getIdDenuncia() {
		return idDenuncia;
	}

	public void setIdDenuncia(long idDenuncia) {
		this.idDenuncia = idDenuncia;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
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


	
	

}
