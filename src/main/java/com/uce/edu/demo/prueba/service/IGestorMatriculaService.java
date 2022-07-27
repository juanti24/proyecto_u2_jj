package com.uce.edu.demo.prueba.service;

import java.math.BigDecimal;

import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;

public interface IGestorMatriculaService {
	
	public BigDecimal valorMatricula(Vehiculo v);

	public void matricular(String cedula, String placa);

}
