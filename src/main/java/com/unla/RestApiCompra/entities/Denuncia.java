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
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Denuncia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDenuncia;
	
	private String categoria;
	//falsificación ilegal fraude inapropiado
	
	private String descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="cliente_id", nullable=false)
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Cliente cliente;
	
	
	

}
