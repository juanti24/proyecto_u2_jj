package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.repository.IEstudianteJdbcRepository;
import com.uce.edu.demo.to.EstudianteTo;
import com.uce.edu.demo.to.PersonaTo;

@Service
public class EstudianteJdbcServiceImpl implements IEstudianteJdbcService {
	
	@Autowired
	private IEstudianteJdbcRepository estudianteJdbcRepository;

	@Override
	public void guardar(EstudianteTo estudianteTo) {
		this.estudianteJdbcRepository.insertar(estudianteTo);
		
	}

	@Override
	public void actualizar(EstudianteTo estudianteTo) {
		this.estudianteJdbcRepository.actualizar(estudianteTo);
		
	}

	@Override
	public void eliminar(int id) {
		this.estudianteJdbcRepository.eliminar(id);
		
	}

	@Override
	public EstudianteTo buscar(int id) {
	
		return this.estudianteJdbcRepository.buscarPorId(id);
	}

}
