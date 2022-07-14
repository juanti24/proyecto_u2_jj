package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Estudiante;

public interface IEstudianteJpaRepository {

	public void insertar(Estudiante e);

	public void actualizar(Estudiante e);

	public Estudiante buscar(String cedula);

	public Estudiante buscarPorFacultad(String facultad);

	public Estudiante buscarPorCorreo(String correo);

	public Estudiante buscarPorCedulaSemestre(String cedula, String semestre);

	public List<Estudiante> buscarPorFacultadEdad(String facultad, Integer edad);

	public void eliminar(String cedula);

	public List<Estudiante> buscarTodos();

	public List<Estudiante> buscarTodosOrdenados();

	public List<Estudiante> buscarPorApellido(String apellido);

	public List<Estudiante> buscarPorNombre(String nombre);

	public List<Estudiante> buscarPorSemestre(String semestre1, String semestre2);

	public List<Estudiante> buscarPorEdad(Integer edad1, Integer edad2);

}
