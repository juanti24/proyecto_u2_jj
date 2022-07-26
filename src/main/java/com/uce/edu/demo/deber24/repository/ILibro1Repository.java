package com.uce.edu.demo.deber24.repository;

import com.uce.edu.demo.deber24.repository.modelo.Libro1;

public interface ILibro1Repository {

	public void insertar(Libro1 l1);

	public Libro1 buscarPorNombre(String nombre);

}
