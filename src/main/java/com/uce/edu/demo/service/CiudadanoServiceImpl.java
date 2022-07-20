package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ICiudadanoRepository;
import com.uce.edu.demo.repository.modelo.Ciudadano;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService{

	@Autowired
	private ICiudadanoRepository iciudadanoepository; 
	
	@Override
	public void insertar(Ciudadano c) {
		
		this.iciudadanoepository.insertar(c);
		
		
	}

}
