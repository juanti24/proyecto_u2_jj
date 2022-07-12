package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Estudiante;

public interface IEstudianteJdbcService {

	public void crear(Estudiante e);

	public void renovarInformacion(Estudiante e);

	public Estudiante consultar(String cedula);

	public void eliminarRegistro(String cedula);

}