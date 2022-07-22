package com.uce.edu.demo.deber22.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.deber22.repository.modelo.CiudadanoDos;

@Repository
@Transactional
public class CiudadanoDosRepositoryImpl implements ICiudadanoDosRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CiudadanoDos c) {
		this.entityManager.persist(c);
	}

	@Override
	public CiudadanoDos buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CiudadanoDos.class, id);
	}

	@Override
	public void actualizar(CiudadanoDos c) {
		this.entityManager.merge(c);
	}

	@Override
	public void eliminar(Integer id) {
		CiudadanoDos c = this.buscar(id);

		this.entityManager.remove(c);

	}

}
