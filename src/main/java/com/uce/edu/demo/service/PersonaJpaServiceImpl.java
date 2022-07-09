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
	public int eliminarPorGenero(String genero) {
		// TODO Auto-generated method stub
		return this.personaJpaRespository.eliminarPorGenero(genero);
	}

}
