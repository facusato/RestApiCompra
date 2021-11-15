package com.unla.RestApiCompra.services.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.RestApiCompra.entities.Denuncia;
import com.unla.RestApiCompra.repositories.IDenunciaRepository;
import com.unla.RestApiCompra.services.IDenunciaService;

@Service("denunciaService")
public class DenunciaService implements IDenunciaService{
	
	
	@Autowired
	@Qualifier("denunciaRepository")
	private IDenunciaRepository denunciaRepository;
	
	@Override
	public List<Denuncia> getAll() {
		return denunciaRepository.findAll();
		
	}



	@Override
	public Denuncia crearDenuncia(Denuncia denuncia) {
		Denuncia denunciaDB = denunciaRepository.findByIdDenuncia(denuncia.getIdDenuncia());
		if( denunciaDB != null) {
			return denunciaDB;
		}

		return denunciaRepository.save(denuncia);
	}

	@Override
	public Denuncia modificarDenuncia(Denuncia denuncia) {
		return denunciaRepository.save(denuncia);
	}

	@Override
	public boolean eliminarDenuncia(long idDenuncia) {
		try {
			denunciaRepository.deleteById(idDenuncia);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public Denuncia obtenerDenuncia(long idDenuncia) {
		return denunciaRepository.findByIdDenuncia(idDenuncia);
	}
}