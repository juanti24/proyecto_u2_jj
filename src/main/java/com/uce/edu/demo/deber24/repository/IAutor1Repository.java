package com.uce.edu.demo.deber24.repository;

import com.uce.edu.demo.deber24.repository.modelo.Autor1;

public interface IAutor1Repository {
	
	public void insertar(Autor1 a1);

	public Autor1 buscarPorNombre(String nombre);

}
