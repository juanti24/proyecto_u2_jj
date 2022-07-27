package com.uce.edu.demo.prueba.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.prueba.repository.IMatriculaRepository;
import com.uce.edu.demo.prueba.repository.IPropietarioRepository;
import com.uce.edu.demo.prueba.repository.IVehiculoRepository;
import com.uce.edu.demo.prueba.repository.modelo.Matricula;
import com.uce.edu.demo.prueba.repository.modelo.Propietario;
import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;

@Service
public class GestorMatriculaServiceImpl implements IGestorMatriculaService{
	
	@Autowired
	private IVehiculoRepository iVehiculoRepository;

	@Autowired
	@Qualifier("liviano")
	private IVehiculoService iVehiculoServiceLiviano;

	@Autowired
	@Qualifier("pesado")
	private IVehiculoService iVehiculoServicePesado;

	@Autowired
	private IMatriculaRepository iMatriculaRepository;

	@Autowired
	private IPropietarioRepository iPropietarioJpaRepository;

	@Override
	public BigDecimal valorMatricula(Vehiculo v) {
		// TODO Auto-generated method stub
		BigDecimal valorMatricula = null;
		BigDecimal descuento = new BigDecimal(7).divide(new BigDecimal(100));

		if (v.getTipo().equals("L")) {
			// Liviano
			valorMatricula = this.iVehiculoServiceLiviano.calcularValor(v.getPrecio());
		} else {
			// Pesado
			valorMatricula = this.iVehiculoServicePesado.calcularValor(v.getPrecio());
		}

		if (valorMatricula.compareTo(new BigDecimal(2000)) == 1) {

			valorMatricula = valorMatricula.subtract(valorMatricula.multiply(descuento));
		}

		return valorMatricula;
	}

	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		Vehiculo v = this.iVehiculoRepository.buscarPorPlaca(placa);

		Propietario p = this.iPropietarioJpaRepository.buscarPorCedula(cedula);

		Matricula m = new Matricula();
		m.setFechaMatricula(LocalDate.now());
		m.setValorMatricula(this.iVehiculoServiceLiviano.calcularValor(v.getPrecio()));
		m.setPropietario(p);
		m.setVehiculo(v);
		this.iMatriculaRepository.insertar(m);

	}

}

