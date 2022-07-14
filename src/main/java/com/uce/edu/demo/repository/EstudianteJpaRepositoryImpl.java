package com.uce.edu.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.Persona;

@Repository
@Transactional
public class EstudianteJpaRepositoryImpl implements IEstudianteJpaRepository {

	private final static Logger LOG = Logger.getLogger(EstudianteJpaRepositoryImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante e) {
		LOG.info("Insertando en la base de datos: " + e);
		this.entityManager.persist(e);
	}

	@Override
	public void actualizar(Estudiante e) {
		LOG.info("Actualizando en la base de datos: " + e);
		this.entityManager.merge(e);
	}

	@Override
	public Estudiante buscar(String cedula) {
		LOG.info("Buscando en la base de datos al estudiante con cedula: " + cedula);
		return this.entityManager.find(Estudiante.class, cedula);
	}

	@Override
	public void eliminar(String cedula) {
		LOG.info("Eliminando de la base de datos al estudiante de cedula: " + cedula);
		this.entityManager.remove(this.buscar(cedula));
	}

	@Override
	public List<Estudiante> buscarTodos() {
		TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e", Estudiante.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarTodosOrdenados() {
		TypedQuery<Estudiante> myQuery = this.entityManager
				.createQuery("SELECT e FROM Estudiante e ORDER BY e.apellido", Estudiante.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorApellido(String apellido) {
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellido");
		myQuery.setParameter("dato_apellido", apellido);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombre(String nombre) {
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombre");
		myQuery.setParameter("dato_nombre", nombre);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorSemestre(String semestre1, String semestre2) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorSemestre",
				Estudiante.class);
		myQuery.setParameter("dato_semestre1", semestre1);
		myQuery.setParameter("dato_semestre2", semestre2);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorEdad(Integer edad1, Integer edad2) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorEdad",
				Estudiante.class);
		myQuery.setParameter("dato_edad1", edad1);
		myQuery.setParameter("dato_edad2", edad2);
		return myQuery.getResultList();
	}

	@Override
	public Estudiante buscarPorFacultad(String facultad) {
		Query myQuery = this.entityManager
				.createNativeQuery("SELECT * FROM estudiante WHERE estu_facultad = :datoFacultad", Estudiante.class);
		myQuery.setParameter("datoFacultad", facultad);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCorreo(String correo) {
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM estudiante WHERE estu_correo = :datoCorreo", Estudiante.class);
		myQuery.setParameter("datoCorreo", correo);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCedulaSemestre(String cedula, String semestre) {
		TypedQuery<Estudiante> myQ = this.entityManager.createNamedQuery("Estudiante.buscarPorCedulaSemestre", Estudiante.class);
		myQ.setParameter("datocedula", cedula);
		myQ.setParameter("datosemestre", semestre);
		return myQ.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorFacultadEdad(String facultad, Integer edad) {
		Query myQ = this.entityManager.createNamedQuery("Estudiante.buscarPorFacultadEdad",Estudiante.class);
		myQ.setParameter("datofacultad", facultad);
		myQ.setParameter("datoedad", edad);
		return myQ.getResultList();
	}
}