package com.uce.edu.demo.deber23.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro {

	@Id
	@Column(name = "libo_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libo_id_seq")
	@SequenceGenerator(name = "libo_id_seq", sequenceName = "libo_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "libo_nombre")
	private String nombre;

	@Column(name = "libo_genero")
	private String genero;

	@Column(name = "libo_numero_paginas")
	private String numeroPaginas;

	@Column(name = "libo_autor")
	private String autor;

	@ManyToOne
	@JoinColumn(name = "libo_id_editorial")
	private Editorial editorial;

	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(String numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

}
