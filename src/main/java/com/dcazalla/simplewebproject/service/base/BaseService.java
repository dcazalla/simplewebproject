package com.dcazalla.simplewebproject.service.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dcazalla.simplewebproject.model.base.EntidadBase;
import com.dcazalla.simplewebproject.repository.base.Repository;

public abstract class BaseService<T extends EntidadBase> implements Service<T> {
	 @Autowired
	    private Repository<T> tRepository;

	    @Override
	    public void insertar(T entidad) throws Exception {
	        this.tRepository.insertar(entidad);
	    }

//	    @Override
//	    public T buscar(Class<T> clase, int id) {
//	        try {
//	            return this.tRepository.buscar(clase, id);
//	        } catch (Exception ex) {
//	            return null;
//	        }
//	    }

	    @Override
	    public void actualizar(T entidad) {
	        this.tRepository.actualizar(entidad);
	    }

	    @Override
	    public void eliminar(T entidad) {
	        this.tRepository.eliminar(entidad);
	    }

//	    @Override
//	    public void validar(T entidad) throws Exception {
//
//	        if (entidad == null) {
//	            throw new Exception("La información suministrada es incorrecta.");
//	        }
//
//	        if (entidad instanceof EntidadComun) {
//	            this.validarEntidadComun(entidad);
//	        }
//	    }

//	    @Override
//	    public List<T> buscar(String namedQuery, List<Object> parametros, Class<T> clase) {
//	        return this.tRepository.buscar(namedQuery, parametros, clase);
//	    }
//
//	    @Override
//	    public T buscarEntidad(String namedQuery, List<Object> parametros, Class<T> clase) {
//	        try {
//	            return this.tRepository.buscarEntidad(namedQuery, parametros, clase);
//	        } catch (Exception ex) {
//	            return null;
//	        }
//	    }

	    @Override
	    public boolean existeEntidad(String namedQuery, List<Object> parametros, Class<T> clase) {
	        return this.buscarEntidad(namedQuery, parametros, clase) != null;
	    }


//	    @Override
//	    public boolean comparar(T clase1, T clase2) {
//	        return clase1.equals(clase2);
//	    }

}