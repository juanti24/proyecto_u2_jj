package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.repository.IEstudianteJdbcRepository;
import com.uce.edu.demo.to.Estudiante;
import com.uce.edu.demo.to.Persona;

@Service
public class EstudianteJdbcServiceImpl implements IEstudianteJdbcService {
	
	@Autowired
	private IEstudianteJdbcRepository estudianteJdbcRepository;

	@Override
	public void guardar(Estudiante estudiante) {
		this.estudianteJdbcRepository.insertar(estudiante);
		
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.estudianteJdbcRepository.actualizar(estudiante);
		
	}

	@Override
	public void eliminar(int id) {
		this.estudianteJdbcRepository.eliminar(id);
		
	}

	@Override
	public Estudiante buscar(int id) {
	
		return this.estudianteJdbcRepository.buscarPorId(id);
	}

}
