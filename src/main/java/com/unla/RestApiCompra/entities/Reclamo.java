package com.unla.RestApiCompra.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="reclamo")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Reclamo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idReclamo;
	
	private String descripcion;
	
	private String estado;
	
	private long idPedido;

}
