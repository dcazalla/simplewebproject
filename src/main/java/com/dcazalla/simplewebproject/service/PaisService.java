package com.dcazalla.simplewebproject.service;

import java.util.List;

import com.dcazalla.simplewebproject.model.Pais;

public interface PaisService {
	
	List<Pais> buscarPaises();
	
	Pais buscarPais(Integer idPais);

	void insertar(Pais pais);
	
	void eliminar(Pais pais);

}
