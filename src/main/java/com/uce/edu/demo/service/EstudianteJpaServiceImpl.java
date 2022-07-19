package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IEstudianteJpaRepository;
import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.EstudianteContadorEdad;
import com.uce.edu.demo.repository.modelo.EstudianteSencillo;

@Service
public class EstudianteJpaServiceImpl implements IEstudianteJpaService {

	@Autowired
	private IEstudianteJpaRepository estudianteJpaRepository;

	@Override
	public void crear(Estudiante e) {
		this.estudianteJpaRepository.insertar(e);
	}

	@Override
	public void renovarInformacion(Estudiante e) {
		this.estudianteJpaRepository.actualizar(e);
	}

	@Override
	public Estudiante consultar(String cedula) {
		return this.estudianteJpaRepository.buscar(cedula);
	}

	@Override
	public void eliminarRegistro(String cedula) {
		this.estudianteJpaRepository.eliminar(cedula);
	}

	@Override
	public List<Estudiante> buscarTodos() {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarTodos();
	}

	@Override
	public List<Estudiante> buscarTodosOrdenados() {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarTodosOrdenados();
	}

	@Override
	public List<Estudiante> buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorApellido(apellido);
	}

	@Override
	public List<Estudiante> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorNombre(nombre);
	}

	@Override
	public List<Estudiante> buscarPorSemestre(String semestre1, String semestre2) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorSemestre(semestre1, semestre2);
	}

	@Override
	public List<Estudiante> buscarPorEdad(Integer edad1, Integer edad2) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorEdad(edad1, edad2);
	}

	@Override
	public Estudiante buscarPorFacultad(String facultad) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorFacultad(facultad);
	}

	@Override
	public Estudiante buscarPorCorreo(String correo) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorCorreo(correo);
	}

	@Override
	public Estudiante buscarPorCedulaSemestre(String cedula, String semestre) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorCedulaSemestre(cedula, semestre);
	}

	@Override
	public List<Estudiante> buscarPorFacultadEdad(String facultad, Integer edad) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorFacultadEdad(facultad, edad);
	}

	@Override
	public List<Estudiante> buscarPorNombresFacultad(String nombre, String apellido, String facultad) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorNombresFacultad(nombre, apellido, facultad);
	}

	@Override
	public Estudiante buscarPorCedulaCorreo(String cedula, String correo) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorCedulaCorreo(cedula, correo);
	}

	@Override
	public EstudianteSencillo buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.buscarPorCedula(cedula);
	}

	@Override
	public List<EstudianteContadorEdad> consultarCantidadPorEdad() {
		// TODO Auto-generated method stub
		return this.estudianteJpaRepository.consultarCantidadPorEdad();
	}


}