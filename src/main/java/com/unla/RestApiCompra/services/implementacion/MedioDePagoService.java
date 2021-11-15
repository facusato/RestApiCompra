package com.unla.RestApiCompra.services.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.RestApiCompra.entities.MedioDePago;
import com.unla.RestApiCompra.repositories.IMedioDePagoRepository;
import com.unla.RestApiCompra.services.IMedioDePagoService;

@Service("medioDePagoService")
public class MedioDePagoService implements IMedioDePagoService{
	
	
	@Autowired
	@Qualifier("medioDePagoRepository")
	private IMedioDePagoRepository medioDePagoRepository;
	
	@Override
	public List<MedioDePago> getAll() {
		return medioDePagoRepository.findAll();
		
	}



	@Override
	public MedioDePago crearMedioDePago(MedioDePago medioDePago) {
		MedioDePago medioDePagoDB = medioDePagoRepository.findByIdMedioDePago(medioDePago.getIdMedioDePago());
		if( medioDePagoDB != null) {
			return medioDePagoDB;
		}

		return medioDePagoRepository.save(medioDePago);
	}

	@Override
	public MedioDePago modificarMedioDePago(MedioDePago medioDePago) {
		return medioDePagoRepository.save(medioDePago);
	}

	@Override
	public boolean eliminarMedioDePago(long idMedioDePago) {
		try {
			medioDePagoRepository.deleteById(idMedioDePago);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public MedioDePago obtenerMedioDePago(long idMedioDePago) {
		return medioDePagoRepository.findByIdMedioDePago(idMedioDePago);
	}
}
