package com.uce.edu.demo.deber22.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.deber22.repository.ICiudadanoDosRepository;
import com.uce.edu.demo.deber22.repository.modelo.CiudadanoDos;

@Service
public class CiudadanoDosServiceImpl implements ICiudadanoDosService {

	@Autowired
	private ICiudadanoDosRepository ciudadanoDosRepository;

	@Override
	public void insertar(CiudadanoDos c) {
		this.ciudadanoDosRepository.insertar(c);

	}

	@Override
	public CiudadanoDos buscar(Integer id) {

		return this.ciudadanoDosRepository.buscar(id);
	}

	@Override
	public void actualizar(CiudadanoDos c) {
		this.ciudadanoDosRepository.actualizar(c);

	}

	@Override
	public void eliminar(Integer id) {
		this.ciudadanoDosRepository.eliminar(id);

	}

}
