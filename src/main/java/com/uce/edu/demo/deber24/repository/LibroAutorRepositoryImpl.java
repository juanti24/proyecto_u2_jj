package com.uce.edu.demo.deber24.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.deber24.repository.modelo.LibroAutor;

@Repository
@Transactional
public class LibroAutorRepositoryImpl implements ILibroAutorRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(LibroAutor libroAutor) {
		this.entityManager.persist(libroAutor);
	}

}
