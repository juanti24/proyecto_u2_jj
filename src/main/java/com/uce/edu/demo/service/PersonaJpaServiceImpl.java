package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IPersonaJpaRepository;
import com.uce.edu.demo.repository.modelo.Persona;

@Service
public class PersonaJpaServiceImpl implements IPersonaJpaService {

	@Autowired
	private IPersonaJpaRepository personaJpaRespository; 
	
	@Override
	public void guardar(Persona persona) {
		this.personaJpaRespository.insertar(persona);
		
	}

	@Override
	public void actualizar(Persona persona) {
		this.personaJpaRespository.actualizar(persona);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.personaJpaRespository.eliminar(id);
		
	}

	@Override
	public Persona buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.personaJpaRespository.buscarPorId(id);
	}

	@Override
	public Persona buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.personaJpaRespository.buscarPorCedula(cedula);
	}

	@Override
	public List<Persona> buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.personaJpaRespository.buscarPorApellido(apellido);
	}

	@Override
	public List<Persona> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.personaJpaRespository.buscarPorNombre(nombre);
	}

	@Override
	public List<Persona> buscarPorGenero(String genero) {
		// TODO Auto-generated method stub
		return this.personaJpaRespository.buscarPorGenero(genero);
	}

	@Override
	public int actualizarPorApellido(String apellido, String genero) {
		// TODO Auto-generated method stub
		return this.personaJpaRespository.actualizarPorApellido(apellido, genero);
	}
	
	@Override
	public List<Persona> buscarPorNombreApellido(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.personaJpaRespository.buscarPorNombreApellido(nombre, apellido);
	}
	
	@Override
	public Persona buscarPorCedulaNative(String cedula) {
		// TODO Auto-generated method stub
		return this.personaJpaRespository.buscarPorCedulaNative(cedula);
	}
	
	@Override
	public Persona buscarPorCedulaNamedNative(String cedula) {
		// TODO Auto-generated method stub
		return this.personaJpaRespository.buscarPorCedulaNamedNative(cedula);
	}

	@Override
	public Persona buscarPorCriteriaApi(String cedula) {
		// TODO Auto-generated method stub
		return this.personaJpaRespository.buscarPorCriteriaApi(cedula);
	}
	
	
	@Override
	public Persona buscarDinamicamente(String nombre, String apellido, String genero) {
		// TODO Auto-generated method stub
		return this.personaJpaRespository.buscarDinamicamente(nombre, apellido, genero);
	}
	
	@Override
	public int eliminarPorGenero(String genero) {
		// TODO Auto-generated method stub
		return this.personaJpaRespository.eliminarPorGenero(genero);
	}

	@Override
	public Persona buscarPorCedulaTyped(String cedula) {
		// TODO Auto-generated method stub
		return this.personaJpaRespository.buscarPorCedulaTyped(cedula);
	}

	@Override
	public Persona buscarPorCedulaNamed(String cedula) {
		// TODO Auto-generated method stub
		return this.personaJpaRespository.buscarPorCedulaNamed(cedula);
	}

	@Override
	public Persona buscarPorCedulaTypedNamed(String cedula) {
		// TODO Auto-generated method stub
		return this.personaJpaRespository.buscarPorCedulaTypedNamed(cedula);
	}

	
}
