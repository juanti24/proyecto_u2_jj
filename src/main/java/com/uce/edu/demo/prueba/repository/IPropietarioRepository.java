package com.uce.edu.demo.prueba.repository;

import com.uce.edu.demo.prueba.repository.modelo.Propietario;

public interface IPropietarioRepository {

	public void insertar(Propietario p);

	public void borrar(String cedula);

	public Propietario buscarPorCedula(String cedula);

}
