package com.uce.edu.demo.prueba.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula {

	@Id
	@Column(name = "matri_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matri_id_seq")
	@SequenceGenerator(name = "matri_id_seq", sequenceName = "matri_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "matri_fecha")
	private LocalDate fechaMatricula;

	@Column(name = "matri_valor")
	private BigDecimal valorMatricula;

	@ManyToOne
	@JoinColumn(name = "matri_id_prop")
	private Propietario propietario;

	@OneToOne
	@JoinColumn(name = "matri_id_vehi") // representa la FK
	private Vehiculo vehiculo;

	@Override
	public String toString() {
		return "Matricula [id=" + id + ", fechaMatricula=" + fechaMatricula + ", valorMatricula=" + valorMatricula
				+ ", propietario=" + propietario + ", vehiculo=" + vehiculo + "]";
	}

	// SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDate fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}

	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

}