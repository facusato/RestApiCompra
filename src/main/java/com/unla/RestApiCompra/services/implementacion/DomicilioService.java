package com.unla.RestApiCompra.services.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.RestApiCompra.entities.Domicilio;
import com.unla.RestApiCompra.repositories.IDomicilioRepository;
import com.unla.RestApiCompra.services.IDomicilioService;

@Service("domicilioService")
public class DomicilioService implements IDomicilioService{
	
	
	@Autowired
	@Qualifier("domicilioRepository")
	private IDomicilioRepository domicilioRepository;
	
	@Override
	public List<Domicilio> getAll() {
		return domicilioRepository.findAll();
		
	}



	@Override
	public Domicilio crearDomicilio(Domicilio domicilio) {
		Domicilio domicilioDB = domicilioRepository.findByIdDomicilio(domicilio.getIdDomicilio());
		if( domicilioDB != null) {
			return domicilioDB;
		}

		return domicilioRepository.save(domicilio);
	}

	@Override
	public Domicilio modificarDomicilio(Domicilio domicilio) {
		return domicilioRepository.save(domicilio);
	}

	@Override
	public boolean eliminarDomicilio(long idDomicilio) {
		try {
			domicilioRepository.deleteById(idDomicilio);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public Domicilio obtenerDomicilio(long idDomicilio) {
		return domicilioRepository.findByIdDomicilio(idDomicilio);
	}
}
