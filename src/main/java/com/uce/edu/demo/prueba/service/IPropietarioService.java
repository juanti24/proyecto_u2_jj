package com.uce.edu.demo.prueba.service;

import com.uce.edu.demo.prueba.repository.modelo.Propietario;

public interface IPropietarioService {
	
	void insertarPropietario(Propietario propietario);
	Propietario buscarPorCedula(String cedula);
	void actualizarPropietario(Propietario propietario);
	void eliminarPropietario(String cedula);
}