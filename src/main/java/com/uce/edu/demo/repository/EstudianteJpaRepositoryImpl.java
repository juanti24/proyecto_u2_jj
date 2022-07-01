package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.uce.edu.demo.repository.modelo.Estudiante;

@Repository
@Transactional
public class EstudianteJpaRepositoryImpl implements IEstudianteJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);
		
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.entityManager.merge(estudiante);
		
	}

	@Override
	public void eliminar(Integer id) {
		Estudiante e = this.buscar(id);
		this.entityManager.remove(e);
		
	}

}
