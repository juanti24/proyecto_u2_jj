package com.uce.edu.demo.deber23.repository.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.uce.edu.demo.repository.modelo.onetwomany.Habitacion;
import com.uce.edu.demo.repository.modelo.onetwomany.Hotel;

@Entity
@Table(name = "editorial")
public class Editorial {

	@Id
	@Column(name = "edit_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "edit_id_seq")
	@SequenceGenerator(name = "edit_id_seq", sequenceName = "edit_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "edit_nombre")
	private String nombre;

	@Column(name = "edit_ubicacion")
	private String ubicacion;

	@Column(name = "edit_telefono")
	private String telefono;

	@OneToMany(mappedBy = "editorial")
	private List<Libro> libros;

	// SET Y GET
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

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

}
