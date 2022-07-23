package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IHabitacionRepository;
import com.uce.edu.demo.repository.modelo.onetwomany.Habitacion;

@Service
public class HabitacionServiceImpl implements IHabitacionService{
	
	@Autowired
	private IHabitacionRepository ihabitacionRepository;

	@Override
	public void insertar(Habitacion h) {
		this.ihabitacionRepository.insertar(h);
		
	}

}
