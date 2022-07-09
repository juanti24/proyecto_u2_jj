package com.uce.edu.demo.prueba.service;

import com.uce.edu.demo.prueba.repository.modelo.Matricula;

public interface IMatriculaService {
	
	void insertarMatricula(Matricula matricula);
	Matricula buscarPorId(Integer id);
	void actualizarMatricula(Matricula matricula);
	void eliminarPorId(Integer id);

}
