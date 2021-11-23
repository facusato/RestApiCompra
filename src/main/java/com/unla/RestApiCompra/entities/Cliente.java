package com.unla.RestApiCompra.entities;

import javax.persistence.*;


@Entity
@Table(name="cliente") 
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCliente;
	
	@Column(name="nombre",nullable = false)
	private String nombre;
	
	@Column(name="apellido",nullable = false)
	private String apellido;
	
	@Column(name="dni",unique = true,nullable = false)
	private long dni;
	
	@Column(name="domicilio",nullable = false)
	private String domicilio;
	

	public Cliente(long idCliente, String nombre, String apellido, long dni, String domicilio) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
	}

	public Cliente() {
		super();
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
	
	
}
