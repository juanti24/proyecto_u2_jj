package com.uce.edu.demo.deber24.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.deber24.repository.IAutor1Repository;
import com.uce.edu.demo.deber24.repository.modelo.Autor1;

@Service
public class Autor1ServiceImpl implements IAutor1Service {

	@Autowired
	private IAutor1Repository autor1Repository;

	@Override
	public void insertar(Autor1 a1) {
		this.autor1Repository.insertar(a1);
	}

	@Override
	public Autor1 buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.autor1Repository.buscarPorNombre(nombre);
	}

}