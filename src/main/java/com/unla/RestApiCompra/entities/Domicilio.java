package com.unla.RestApiCompra.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="domicilios")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
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
	
	
	
	
	
	
	
	
}
