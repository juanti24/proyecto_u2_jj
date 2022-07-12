package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Estudiante;

public interface IEstudianteJdbcRepository {

	public void insertar(Estudiante e);

	public void actualizar(Estudiante e);

	public Estudiante buscar(String cedula);

	public void eliminar(String cedula);

}