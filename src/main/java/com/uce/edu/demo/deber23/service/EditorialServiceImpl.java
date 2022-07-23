package com.uce.edu.demo.deber23.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.deber23.repository.IEditorialRepository;
import com.uce.edu.demo.deber23.repository.modelo.Editorial;

@Service
public class EditorialServiceImpl implements IEditorialService{

	@Autowired
	private IEditorialRepository ieditorialRepository;
	
	@Override
	public void insertar(Editorial e) {
		this.ieditorialRepository.insertar(e);
		
	}

	@Override
	public Editorial buscar(Integer id) {
		
		return this.ieditorialRepository.buscar(id);
	}

	@Override
	public void actualizar(Editorial e) {
		this.ieditorialRepository.actualizar(e);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.ieditorialRepository.eliminar(id);
		
	}

}
