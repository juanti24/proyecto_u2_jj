package com.uce.edu.demo.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.prueba.repository.IVehiculoRepository;
import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepository vehiRepo;


	@Override
	public void insertarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiRepo.insertar(vehiculo);

	}

	@Override
	public Vehiculo buscarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		return this.vehiRepo.buscar(placa);
	}

	@Override
	public void actualizarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub

		this.vehiRepo.actualizar(vehiculo);

	}

	@Override
	public void eliminarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		this.vehiRepo.eliminar(placa);
	}

}
