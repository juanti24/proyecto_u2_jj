package com.uce.edu.demo.repository.modelo;

import java.io.Serializable;

public class EstudianteContadorEdad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer edad;
	private Long numero;

	public EstudianteContadorEdad() {

	}

	public EstudianteContadorEdad(Integer edad, Long numero) {
		this.edad = edad;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "EstudianteContadorEdad [edad=" + edad + ", numero=" + numero + "]";
	}

	// SET y GET

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

}