package com.uce.edu.demo.prueba.service;

import java.math.BigDecimal;

import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;

public interface IVehiculoService {
	
	public void insertar(Vehiculo v);

	public Vehiculo buscarPorPalca(String placa);

	public void actualizar(Vehiculo v);

	public void borrarPorPlaca(String placa);
	
	public BigDecimal calcularValor(BigDecimal precio);

}
