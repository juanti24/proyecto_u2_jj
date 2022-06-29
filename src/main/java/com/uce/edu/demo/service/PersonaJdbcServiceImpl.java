package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IPersonaJdbcRepository;
import com.uce.edu.demo.to.PersonaTo;

@Service
public class PersonaJdbcServiceImpl implements IPersonaJdbcService {

	@Autowired
	private IPersonaJdbcRepository personaJdbcRepository;
	
	
	@Override
	public void guardar(PersonaTo personaTo) {
		this.personaJdbcRepository.insertar(personaTo);
		
	}


	@Override
	public void actualizar(PersonaTo personaTo) {
		this.personaJdbcRepository.actualizar(personaTo);
		
	}


	@Override
	public void eliminar(int id) {
		this.personaJdbcRepository.eliminar(id);
		
	}


	@Override
	public PersonaTo buscar(int id) {
		
		return this.personaJdbcRepository.buscarPorId(id);
	}


	@Override
	public List<PersonaTo> buscarTodos() {
		// TODO Auto-generated method stub
		return this.personaJdbcRepository.buscarTodos();
	}

}
