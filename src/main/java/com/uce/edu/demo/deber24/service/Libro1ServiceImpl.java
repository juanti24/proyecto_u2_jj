package com.uce.edu.demo.deber24.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.deber24.repository.ILibro1Repository;
import com.uce.edu.demo.deber24.repository.modelo.Libro1;

@Service
public class Libro1ServiceImpl implements ILibro1Service {

	@Autowired
	private ILibro1Repository libro1Repository;

	@Override
	public void insertar(Libro1 l1) {
		this.libro1Repository.insertar(l1);
	}

	@Override
	public Libro1 buscarPorTitulo(String titulo) {
		// TODO Auto-generated method stub
		return this.libro1Repository.buscarPorNombre(titulo);
	}

}