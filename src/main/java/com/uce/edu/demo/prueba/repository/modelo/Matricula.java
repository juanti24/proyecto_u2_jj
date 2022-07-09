package com.uce.edu.demo.prueba.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula {

	@Id
	@Column(name = "mtri_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mtri_id_seq")
	@SequenceGenerator(name = "mtri_id_seq", sequenceName = "mtri_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "mtri_fecha_matricula")
	private LocalDateTime fechaMatricula;

	@Column(name = "mtri_valor_matricula")
	private BigDecimal valorMatricula;

//	@Column(name = "mtri_propietario")
//	private Propietario propietario;
//	
//	@Column(name = "mtri_vehiculo")
//	private Vehiculo vehiculo;

	// SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}

	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}

	@Override
	public String toString() {
		return "Matricula [id=" + id + ", fechaMatricula=" + fechaMatricula + ", valorMatricula=" + valorMatricula
				+ "]";
	}

}