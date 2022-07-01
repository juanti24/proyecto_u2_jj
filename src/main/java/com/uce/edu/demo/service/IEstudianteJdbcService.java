package com.uce.edu.demo.service;

import com.uce.edu.demo.to.EstudianteTo;
import com.uce.edu.demo.to.PersonaTo;

public interface IEstudianteJdbcService {

	public void guardar(EstudianteTo estudianteTo);

	public void actualizar(EstudianteTo estudianteTo);

	public void eliminar(int id);

	public EstudianteTo buscar(int id);

}
