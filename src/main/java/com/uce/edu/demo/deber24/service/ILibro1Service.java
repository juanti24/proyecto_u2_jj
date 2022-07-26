package com.uce.edu.demo.deber24.service;

import com.uce.edu.demo.deber24.repository.modelo.Libro1;

public interface ILibro1Service {

	public void insertar(Libro1 l1);

	public Libro1 buscarPorTitulo(String titulo);
}
