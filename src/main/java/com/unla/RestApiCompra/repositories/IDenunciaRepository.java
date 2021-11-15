package com.unla.RestApiCompra.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.unla.RestApiCompra.entities.Denuncia;

@Repository("denunciaRepository")
public interface IDenunciaRepository extends JpaRepository<Denuncia, Serializable> {
	
	public abstract Denuncia findByIdDenuncia(long idDenuncia);
}
