package com.dcazalla.simplewebproject.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import com.dcazalla.simplewebproject.model.Pais;
import com.dcazalla.simplewebproject.repository.base.BaseRepository;

@Repository(value = "paisRepository")
public class PaisRepository extends BaseRepository<Pais> {
	
//	private EntityManager entityManager;
//
//	@PersistenceContext
//	public EntityManager getEntityManager() {
//		return entityManager;
//	}
//
//	public void setEntityManager(EntityManager entityManager) {
//		this.entityManager = entityManager;
//	}

}
