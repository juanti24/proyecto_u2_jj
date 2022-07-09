package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Persona;

public interface IPersonaJpaService {

	public List<Persona> buscarPorNombre(String nombre);

	public List<Persona> buscarPorGenero(String genero);

	public List<Persona> buscarPorApellido(String apellido);

	public Persona buscarPorCedula(String cedula);

	public void guardar(Persona persona);

	public void actualizar(Persona persona);

	public void eliminar(Integer id);

	public Persona buscar(Integer id);

	public int actualizarPorApellido(String apellido, String genero);

	public int eliminarPorGenero(String genero);

}
