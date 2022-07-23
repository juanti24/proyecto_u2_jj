package com.uce.edu.demo.deber23.repository;

import com.uce.edu.demo.deber23.repository.modelo.Editorial;

public interface IEditorialRepository {
	
	public void insertar(Editorial e);
	
	public Editorial buscar(Integer id);
	
	public void actualizar(Editorial e);
	
	public void eliminar(Integer id);
	
	

}
