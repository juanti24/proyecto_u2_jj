package com.uce.edu.demo.prueba.repository;

import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;

public interface IVehiculoRepository {
	
	public void insertar(Vehiculo v);

	public Vehiculo buscarPorPlaca(String placa);

	public void actualizar(Vehiculo v);

	public void borrar(String placa);

}
