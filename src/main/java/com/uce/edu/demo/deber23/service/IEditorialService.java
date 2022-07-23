package com.uce.edu.demo.deber23.service;

import com.uce.edu.demo.deber23.repository.modelo.Editorial;

public interface IEditorialService {

	public void insertar(Editorial e);

	public Editorial buscar(Integer id);

	public void actualizar(Editorial e);

	public void eliminar(Integer id);

}
