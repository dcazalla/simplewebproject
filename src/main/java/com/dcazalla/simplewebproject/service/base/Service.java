package com.dcazalla.simplewebproject.service.base;

import java.util.List;


public interface Service<EntityClass> {
    void insertar(EntityClass entidad) throws Exception;

    EntityClass buscar(Class<EntityClass> clase, int id);

    void actualizar(EntityClass entidad) throws Exception;

    void eliminar(EntityClass entidad) throws Exception;

    void validar(EntityClass entidad) throws Exception;

    List<EntityClass> buscar(String namedQuery, List<Object> parametros, Class<EntityClass> clase);

    EntityClass buscarEntidad(String namedQuery, List<Object> parametros, Class<EntityClass> clase);

    boolean existeEntidad(String namedQuery, List<Object> parametros, Class<EntityClass> clase);


    boolean comparar(EntityClass clase1, EntityClass clase2);

}
