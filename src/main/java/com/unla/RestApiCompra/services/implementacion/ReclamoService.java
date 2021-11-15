package com.unla.RestApiCompra.services.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.RestApiCompra.entities.Reclamo;
import com.unla.RestApiCompra.repositories.IReclamoRepository;
import com.unla.RestApiCompra.services.IReclamoService;

@Service("reclamoService")
public class ReclamoService implements IReclamoService{
	
	
	@Autowired
	@Qualifier("reclamoRepository")
	private IReclamoRepository reclamoRepository;
	
	@Override
	public List<Reclamo> getAll() {
		return reclamoRepository.findAll();
		
	}



	@Override
	public Reclamo crearReclamo(Reclamo reclamo) {
		Reclamo reclamoDB = reclamoRepository.findByIdReclamo(reclamo.getIdReclamo());
		if( reclamoDB != null) {
			return reclamoDB;
		}

		return reclamoRepository.save(reclamo);
	}

	@Override
	public Reclamo modificarReclamo(Reclamo reclamo) {
		return reclamoRepository.save(reclamo);
	}

	@Override
	public boolean eliminarReclamo(long idReclamo) {
		try {
			reclamoRepository.deleteById(idReclamo);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public Reclamo obtenerReclamo(long idReclamo) {
		return reclamoRepository.findByIdReclamo(idReclamo);
	}
}
