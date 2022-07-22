package com.uce.edu.demo.deber22.repository.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "pasaporte")
public class Pasaporte {

	@Id
	@Column(name = "port_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "port_id_seq")
	@SequenceGenerator(name = "port_id_seq", sequenceName = "port_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "port_numero")
	private String numero;

	@Column(name = "port_fecha_emision")
	private LocalDateTime fechaEmision;

	@Column(name = "port_fecha_caducidad")
	private LocalDateTime fechaCaducidad;

	@OneToOne
	@JoinColumn(name = "port_id_ciudadano")
	private CiudadanoDos ciudadano;

	@Override
	public String toString() {
		return "Pasaporte [id=" + id + ", numero=" + numero + ", fechaEmision=" + fechaEmision + ", fechaCaducidad="
				+ fechaCaducidad + ", ciudadano=" + ciudadano + "]";
	}

	// SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDateTime fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public LocalDateTime getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDateTime fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public CiudadanoDos getCiudadano() {
		return ciudadano;
	}

	public void setCiudadano(CiudadanoDos ciudadano) {
		this.ciudadano = ciudadano;
	}

}
