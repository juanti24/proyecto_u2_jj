package com.uce.edu.demo.deber24.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.deber24.repository.modelo.Libro1;

@Repository
@Transactional
public class Libro1RepositoryImpl implements ILibro1Repository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Libro1 l1) {
		this.entityManager.persist(l1);
	}

	@Override
	public Libro1 buscarPorNombre(String nombre) {
		TypedQuery<Libro1> myQuery = this.entityManager.createQuery("SELECT l FROM Libro1 l WHERE l.titulo = :titulo",
				Libro1.class);
		myQuery.setParameter("titulo", nombre);
		return myQuery.getSingleResult();
	}

}
