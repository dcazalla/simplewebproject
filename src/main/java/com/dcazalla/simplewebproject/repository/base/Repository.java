package com.dcazalla.simplewebproject.repository.base;

import java.util.List;

public interface Repository<EntityClass> {
	
	void insertar(EntityClass entidad);
	
	void actualizar(EntityClass entidad);
	
	void eliminar(EntityClass entidad);
	
	List<EntityClass> buscar();

	EntityClass buscarPorId(Integer id);

}


