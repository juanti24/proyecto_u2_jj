package com.uce.edu.demo.deber23.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.deber23.repository.modelo.Editorial;

@Repository
@Transactional
public class EditorialRepositoryImpl implements IEditorialRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Editorial e) {
		this.entityManager.persist(e);

	}

	@Override
	public Editorial buscar(Integer id) {

		return this.entityManager.find(Editorial.class, id);
	}

	@Override
	public void actualizar(Editorial e) {
		this.entityManager.merge(e);

	}

	@Override
	public void eliminar(Integer id) {

		Editorial e = this.buscar(id);
		this.entityManager.remove(e);

	}

}
