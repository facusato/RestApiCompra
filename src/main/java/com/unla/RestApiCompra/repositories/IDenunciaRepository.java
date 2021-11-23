package com.unla.RestApiCompra.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unla.RestApiCompra.entities.Denuncia;


@Repository("denunciaRepository")
public interface IDenunciaRepository extends JpaRepository<Denuncia, Serializable> {
	
	public abstract Denuncia findByIdDenuncia(long idDenuncia);
	
	@Query("SELECT d FROM  Denuncia d WHERE d.estado = (:estado)")
	public abstract List<Denuncia> findByEstado(String estado);
	
	/*@Query("SELECT d FROM Denuncia d JOIN FETCH d.cliente c WHERE c.idCliente = (:idCliente)")
	public abstract List<Denuncia> findByIdCliente(long idCliente);*/
}
