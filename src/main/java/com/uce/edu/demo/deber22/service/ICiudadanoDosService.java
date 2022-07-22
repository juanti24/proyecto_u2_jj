package com.uce.edu.demo.deber22.service;

import com.uce.edu.demo.deber22.repository.modelo.CiudadanoDos;

public interface ICiudadanoDosService {

	public void insertar(CiudadanoDos c);

	public CiudadanoDos buscar(Integer id);

	public void actualizar(CiudadanoDos c);

	public void eliminar(Integer id);

}
