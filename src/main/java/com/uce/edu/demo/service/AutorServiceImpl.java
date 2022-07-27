package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IAutorRepository;
import com.uce.edu.demo.repository.modelo.manytomany.Autor;

@Service
public class AutorServiceImpl implements IAutorService{
	
	@Autowired
	private IAutorRepository iautorRepository;

	@Override
	public void insertar(Autor a) {
		this.iautorRepository.insertar(a);
		
	}

}
