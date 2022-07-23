package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.onetwomany.Habitacion;
@Repository
@Transactional
public class HabitacionRepositoryImpl implements IHabitacionRepository {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	
	@Override
	public void insertar(Habitacion h) {
		this.entityManager.persist(h);
		
	}

}
