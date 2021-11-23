package com.unla.RestApiCompra.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="domicilios")
public class Domicilio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDomicilio;
	
	@Column(name="provincia")
	private String provincia;
	
	@Column(name="localidad")
	private String localidad;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="codigo_postal")
	private String codPostal;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="cliente_id", nullable=false)
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Cliente cliente;

	public Domicilio(long idDomicilio, String provincia, String localidad, String direccion, String codPostal,
			Cliente cliente) {
		super();
		this.idDomicilio = idDomicilio;
		this.provincia = provincia;
		this.localidad = localidad;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.cliente = cliente;
	}

	public Domicilio() {
		super();
	}

	public long getIdDomicilio() {
		return idDomicilio;
	}

	public void setIdDomicilio(long idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
	
	
	
}
