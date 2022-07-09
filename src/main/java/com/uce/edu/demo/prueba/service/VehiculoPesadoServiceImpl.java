package com.uce.edu.demo.prueba.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("pesado")
public class VehiculoPesadoServiceImpl implements IMatriculaVehicularService{

	@Override
	public BigDecimal calcularDescuento(BigDecimal precio) {
		// TODO Auto-generated method stub
		return precio.multiply(new BigDecimal(0.15));
	}

}