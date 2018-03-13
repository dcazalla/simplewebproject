package com.dcazalla.simplewebproject.repository.base;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.dcazalla.simplewebproject.model.base.EntidadBase;

public abstract class BaseRepository<T extends EntidadBase> implements Repository<T>{
	
	@PersistenceContext
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	@Override
	@Transactional
	public void insertar(T entidad) {
		this.entityManager.persist(entidad);
	}
	@Override
	@Transactional
	public void actualizar(T entidad) {
		this.entityManager.merge(entidad);
	}
	@Override
	@Transactional
	public void eliminar(T entidad) {
		this.entityManager.remove(entidad);
	}

	public List<T> buscar() {
		return null;
	}

	public T buscarPorId(Integer id) {
		return null;
	}
	

}
