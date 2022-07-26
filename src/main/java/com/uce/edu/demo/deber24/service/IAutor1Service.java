package com.uce.edu.demo.deber24.service;

import com.uce.edu.demo.deber24.repository.modelo.Autor1;

public interface IAutor1Service {

	public void insertar(Autor1 a1);

	public Autor1 buscarPorNombre(String nombre);
}
