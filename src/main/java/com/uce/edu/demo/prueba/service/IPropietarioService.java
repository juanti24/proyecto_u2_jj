package com.uce.edu.demo.prueba.service;

import com.uce.edu.demo.prueba.repository.modelo.Propietario;

public interface IPropietarioService {
	
	public void insertar(Propietario p);

	public void borrarPorCedula(String cedula);

}
