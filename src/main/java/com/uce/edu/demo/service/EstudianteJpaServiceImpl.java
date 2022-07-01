package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.repository.IEstudianteJpaRepository;
import com.uce.edu.demo.repository.modelo.Estudiante;

@Service
public class EstudianteJpaServiceImpl implements IEstudianteJpaService {

	@Autowired
	private IEstudianteJpaRepository estudianteJpaRepository;

	@Override
	public void guardar(Estudiante estudiante) {
		this.estudianteJpaRepository.insertar(estudiante);

	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.estudianteJpaRepository.actualizar(estudiante);

	}

	@Override
	public void eliminar(Integer id) {
		this.estudianteJpaRepository.eliminar(id);

	}

	@Override
	public Estudiante buscar(Integer id) {

		return this.estudianteJpaRepository.buscar(id);
	}

}
