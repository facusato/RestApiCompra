package com.unla.RestApiCompra.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="pedido")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Pedido {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPedido;
	
	@Column(name="codigoSeguim")
	private int codigoSeguim;
	
	@Column(name="dni")
	private int dni;
	
	@OneToOne
	private Domicilio domicilio;
	
	@Column(name="estado")
	private String estado;
	
}
