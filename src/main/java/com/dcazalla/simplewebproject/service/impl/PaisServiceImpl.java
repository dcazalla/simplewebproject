package com.dcazalla.simplewebproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcazalla.simplewebproject.model.Pais;
import com.dcazalla.simplewebproject.repository.base.Repository;
import com.dcazalla.simplewebproject.service.PaisService;

@Service
public class PaisServiceImpl implements PaisService {

	@Autowired
	private Repository<Pais> paisRepository;
	
	@Override
	public List<Pais> buscarPaises() {
		return this.paisRepository.buscar();
	}
	
	@Override
	public Pais buscarPais(Integer idPais) {
		return this.paisRepository.buscarPorId(idPais);
	}

	@Override
	public void insertar(Pais pais) {
		this.paisRepository.insertar(pais);
	}

	@Override
	public void eliminar(Pais pais) {
		this.paisRepository.eliminar(pais);
	}


}
