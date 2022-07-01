package com.uce.edu.demo.repository;

import com.uce.edu.demo.to.EstudianteTo;

public interface IEstudianteJdbcRepository {
	
	public EstudianteTo buscarPorId(int id);
	
	public void insertar(EstudianteTo estudianteTo);
	
	public void actualizar(EstudianteTo estudianteTo);
	
	public void eliminar(int id);

}
