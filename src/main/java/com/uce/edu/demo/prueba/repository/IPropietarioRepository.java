package com.uce.edu.demo.prueba.repository;

import com.uce.edu.demo.prueba.repository.modelo.Propietario;

public interface IPropietarioRepository {

	void insertar(Propietario propietario);

	Propietario buscar(String cedula);

	void actualizar(Propietario propietario);

	void eliminar(String cedula);

}
