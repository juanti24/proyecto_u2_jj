package com.uce.edu.demo.repository;

import java.util.List;
import com.uce.edu.demo.repository.modelo.Persona;

public interface IPersonaJpaRepository {

	public List<Persona> buscarPorNombre(String nombre);

	public List<Persona> buscarPorNombreApellido(String nombre, String apellido);

	public List<Persona> buscarPorGenero(String genero);

	public List<Persona> buscarPorApellido(String apellido);

	public Persona buscarPorCedula(String cedula);

	public Persona buscarPorCedulaTyped(String cedula);

	public Persona buscarPorCedulaNamed(String cedula);

	public Persona buscarPorCedulaTypedNamed(String cedula);

	public Persona buscarPorCedulaNative(String cedula);

	public Persona buscarPorCriteriaApi(String cedula);

	public Persona buscarDinamicamente(String nombre, String apellido, String genero);

	public Persona buscarPorCedulaNamedNative(String cedula);

	public Persona buscarDinamicamentePredicados(String nombre, String apellido, String genero);

	public Persona buscarPorId(Integer id);

	public void insertar(Persona persona);

	public void actualizar(Persona persona);

	public void eliminar(Integer id);

	public int actualizarPorApellido(String apellido, String genero);

	public int eliminarPorGenero(String genero);

}
