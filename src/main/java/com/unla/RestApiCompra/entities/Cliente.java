package com.unla.RestApiCompra.entities;



import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="cliente")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
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
	
	
	
}
