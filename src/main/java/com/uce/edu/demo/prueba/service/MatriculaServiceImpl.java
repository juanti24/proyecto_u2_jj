package com.uce.edu.demo.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.prueba.repository.IMatriculaRepository;
import com.uce.edu.demo.prueba.repository.modelo.Matricula;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository matriculaRepo;

	@Override
	public void insertarMatricula(Matricula matricula) {
		this.matriculaRepo.insertar(matricula);
	}

	@Override
	public void actualizarMatricula(Matricula matricula) {
		this.matriculaRepo.actualizar(matricula);
	}

	@Override
	public Matricula buscarPorId(Integer id) {
		return this.matriculaRepo.buscar(id);
	}

	@Override
	public void eliminarPorId(Integer id) {
		this.matriculaRepo.eliminar(id);
	}

}