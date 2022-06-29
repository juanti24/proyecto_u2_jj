package com.uce.edu.demo.service;

import com.uce.edu.demo.to.Estudiante;
import com.uce.edu.demo.to.PersonaTo;

public interface IEstudianteJdbcService {

	public void guardar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	public void eliminar(int id);

	public Estudiante buscar(int id);

}
