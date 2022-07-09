package com.uce.edu.demo.prueba.repository;

import com.uce.edu.demo.prueba.repository.modelo.Matricula;

public interface IMatriculaRepository {
	
	void insertar(Matricula matricula);
	Matricula buscar(Integer id);
	void actualizar(Matricula matricula);
	void eliminar(Integer id);

}
