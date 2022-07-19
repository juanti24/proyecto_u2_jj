package com.uce.edu.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.repository.modelo.PersonaSencilla;

@Repository
@Transactional
public class PersonaJpaRespositoryImpl implements IPersonaJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Persona buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Persona.class, id);
	}

	@Override
	public void insertar(Persona persona) {
		this.entityManager.persist(persona);

	}

	@Override
	public void actualizar(Persona persona) {
		this.entityManager.merge(persona);

	}

	@Override
	public void eliminar(Integer id) {
		Persona persona = this.buscarPorId(id);

		this.entityManager.remove(persona);

	}

	@Override
	public Persona buscarPorCedula(String cedula) {

		Query jpqlQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		return (Persona) jpqlQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaTyped(String cedula) {
		TypedQuery<Persona> miTypedQuery = this.entityManager
				.createQuery("SELECT p FROM Persona p WHERE p.cedula = :datoCedula", Persona.class);
		miTypedQuery.setParameter("datoCedula", cedula);
		return miTypedQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaNamed(String cedula) {
		TypedQuery<Persona> myQuery = this.entityManager.createNamedQuery("Persona.buscarPorCeddula", Persona.class);
		myQuery.setParameter("datoCedula", cedula);
		return (Persona) myQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaTypedNamed(String cedula) {
		TypedQuery<Persona> myQuery = this.entityManager.createNamedQuery("Persona.buscarPorCeddula", Persona.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaNative(String cedula) {
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM persona WHERE pers_cedula = :datoCedula ",
				Persona.class);
		myQuery.setParameter("datoCedula", cedula);
		return (Persona) myQuery.getSingleResult();

	}

	@Override
	public Persona buscarPorCedulaNamedNative(String cedula) {
		TypedQuery<Persona> myQuery = this.entityManager.createNamedQuery("Persona.buscarPorCedulaNative",
				Persona.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();

	}

	@Override
	public Persona buscarPorCriteriaApi(String cedula) {

		// Instancia de la interfaz Criteria Fabrica para construir nuestro query
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		// Especificamos el retorno de mi SQl
		CriteriaQuery<Persona> myQuery = myBuilder.createQuery(Persona.class);

		// Construimos el Sql
		// Root, From es por la tabla princial

		Root<Persona> personaFrom = myQuery.from(Persona.class);// FROM Persona
		// myQuery.select(personaFrom);//Select p FROM Persona

		// Las condiciones where en criteriaAPI se los conoce como predicados

		Predicate p1 = myBuilder.equal(personaFrom.get("cedula"), cedula);// p.cedula = :datoCedula

		CriteriaQuery<Persona> myQuery1 = myQuery.select(personaFrom).where(p1);
		// Finalizado mi query

		TypedQuery<Persona> myQueyFinal = this.entityManager.createQuery(myQuery1);

		return myQueyFinal.getSingleResult();
	}

	@Override
	public Persona buscarDinamicamente(String nombre, String apellido, String genero) {

		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Persona> myQuery = myCriteria.createQuery(Persona.class);

		Root<Persona> myTabla = myQuery.from(Persona.class);

		Predicate pNombre = myCriteria.equal(myTabla.get("nombre"), nombre);

		Predicate pApellido = myCriteria.equal(myTabla.get("apellido"), apellido);

		Predicate miPredicadoFinal = null;

		if (genero.equals("Masculino")) {
			miPredicadoFinal = myCriteria.and(pNombre, pApellido);
		} else {
			miPredicadoFinal = myCriteria.or(pNombre, pApellido);
		}

		myQuery.select(myTabla).where(miPredicadoFinal);

		TypedQuery<Persona> myQueyFinal = this.entityManager.createQuery(myQuery);

		return myQueyFinal.getSingleResult();

	}

	@Override
	public Persona buscarDinamicamentePredicados(String nombre, String apellido, String genero) {

		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();

		CriteriaQuery<Persona> myQuery = myCriteria.createQuery(Persona.class);

		Root<Persona> myTabla = myQuery.from(Persona.class);

		Predicate pNombre = myCriteria.equal(myTabla.get("nombre"), nombre);

		Predicate pApellido = myCriteria.equal(myTabla.get("apellido"), apellido);

		Predicate pGenero = myCriteria.equal(myTabla.get("genero"), genero);

		Predicate miPredicadoFinal = null;

		if (genero.equals("Masculino")) {
			miPredicadoFinal = myCriteria.and(pNombre, pApellido, pGenero);
			myCriteria.and(miPredicadoFinal, pGenero);
		} else {
			miPredicadoFinal = myCriteria.and(pNombre, pApellido, pGenero);
			miPredicadoFinal = myCriteria.or(pNombre, pApellido, pGenero);
		}

		myQuery.select(myTabla).where(miPredicadoFinal);

		TypedQuery<Persona> myQueyFinal = this.entityManager.createQuery(myQuery);

		return myQueyFinal.getSingleResult();

	}

	@Override
	public List<Persona> buscarPorApellido(String apellido) {

		Query myQuery = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.apellido = :datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}

	@Override
	public List<PersonaSencilla> buscarPorPersonaSencillo(String apellido) {

		TypedQuery<PersonaSencilla> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.uce.edu.demo.repository.modelo.PersonaSencilla(p.nombre, p.apellido) FROM Persona p WHERE p.apellido = :datoApellido",
				PersonaSencilla.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}

	
	@Override
	public List<PersonaContadorGenero> consultarCantidadPorGenero() {
		TypedQuery<PersonaContadorGenero> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.uce.edu.demo.repository.modelo.PersonaContadorGenero(p.genero, COUNT(p.genero)) FROM Persona p GROUP BY p.genero",
				PersonaContadorGenero.class);
		
		return myQuery.getResultList();
	}
	
	@Override
	public List<Persona> buscarPorNombreApellido(String nombre, String apellido) {
		TypedQuery<Persona> myQuery = this.entityManager.createNamedQuery("Persona.buscarPorNombreApellido",
				Persona.class);
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();

	}

	@Override
	public List<Persona> buscarPorNombre(String nombre) {
		Query myQuery1 = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.nombre = :datoNombre");
		myQuery1.setParameter("datoNombre", nombre);
		return myQuery1.getResultList();
	}

	@Override
	public List<Persona> buscarPorGenero(String genero) {
		Query myQuery2 = this.entityManager.createQuery("SELECT p FROM Persona p WHERE p.genero = :datoGenero");
		myQuery2.setParameter("datoGenero", genero);
		return myQuery2.getResultList();
	}

	@Override
	public int actualizarPorApellido(String apellido, String genero) {
		Query myQuery3 = this.entityManager
				.createQuery("UPDATE Persona p SET p.genero = :datoGenero WHERE p.apellido = :datoApellido");
		myQuery3.setParameter("datoGenero", genero);
		myQuery3.setParameter("datoApellido", apellido);
		return myQuery3.executeUpdate();

	}

	@Override
	public int eliminarPorGenero(String genero) {
		Query myQuery4 = this.entityManager.createQuery("DELETE FROM Persona p WHERE p.genero = :datoGenero");
		myQuery4.setParameter("datoGenero", genero);
		return myQuery4.executeUpdate();
	}

	

}
