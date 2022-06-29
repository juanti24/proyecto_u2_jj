package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.to.PersonaTo;

public interface IPersonaJdbcService {
	
	public void guardar(PersonaTo personaTo);
	
	public void actualizar(PersonaTo personaTo);
	
	public void eliminar(int id);
	
	public PersonaTo buscar(int id);
	
	public List<PersonaTo> buscarTodos();
	
	

}
