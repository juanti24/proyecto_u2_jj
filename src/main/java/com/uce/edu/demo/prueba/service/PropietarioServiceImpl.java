package com.uce.edu.demo.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.prueba.repository.IPropietarioRepository;
import com.uce.edu.demo.prueba.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	private IPropietarioRepository propietarioRepo;
	
	@Override
	public void insertarPropietario(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepo.insertar(propietario);
	}

	@Override
	public Propietario buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.propietarioRepo.buscar(cedula);
	}

	@Override
	public void actualizarPropietario(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepo.actualizar(propietario);
	}

	@Override
	public void eliminarPropietario(String cedula) {
		// TODO Auto-generated method stub
		this.propietarioRepo.eliminar(cedula);
	}

}
