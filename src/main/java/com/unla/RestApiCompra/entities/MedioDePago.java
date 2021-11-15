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
@Data @NoArgsConstructor @AllArgsConstructor @Builder
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
	
	
	
	

}
