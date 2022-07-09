package com.uce.edu.demo.prueba.service;

import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;

public interface IVehiculoService {
	
	void insertarVehiculo(Vehiculo vehiculo);

	Vehiculo buscarPorPlaca(String placa);

	void actualizarVehiculo(Vehiculo vehiculo);

	void eliminarPorPlaca(String placa);

}
