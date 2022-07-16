package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Estudiante;

public interface IEstudianteJpaService {
	
	public void crear(Estudiante e);

	public void renovarInformacion(Estudiante e);

	public Estudiante consultar(String cedula);

	public void eliminarRegistro(String cedula);

	public List<Estudiante> buscarTodos();

	public List<Estudiante> buscarTodosOrdenados();

	public List<Estudiante> buscarPorApellido(String apellido);

	public List<Estudiante> buscarPorNombre(String nombre);

	public List<Estudiante> buscarPorSemestre(String semestre1, String semestre2);

	public List<Estudiante> buscarPorEdad(Integer edad1, Integer edad2);
	
	public Estudiante buscarPorFacultad(String facultad);

	public Estudiante buscarPorCorreo(String correo);

	public Estudiante buscarPorCedulaSemestre(String cedula, String semestre);

	public List<Estudiante> buscarPorFacultadEdad(String facultad, Integer edad);
	
	public List<Estudiante> buscarPorNombresFacultad(String nombre, String apellido, String facultad);

	public Estudiante buscarPorCedulaCorreo(String cedula, String correo);

}


