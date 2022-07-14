package com.uce.edu.demo.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
@NamedQuery(name = "Estudiante.buscarPorApellido", query = "SELECT e FROM Estudiante e WHERE e.apellido = :dato_apellido ORDER BY e.apellido")
@NamedQuery(name = "Estudiante.buscarPorNombre", query = "SELECT e FROM Estudiante e WHERE e.nombre = :dato_nombre ORDER BY e.nombre")
@NamedQuery(name = "Estudiante.buscarPorSemestre", query = "SELECT e FROM Estudiante e WHERE e.semestre = :dato_semestre1 OR e.semestre = :dato_semestre2 ORDER BY e.semestre")
@NamedQuery(name = "Estudiante.buscarPorEdad", query = "SELECT e FROM Estudiante e WHERE e.edad BETWEEN :dato_edad1 AND :dato_edad2 ORDER BY e.edad")

@NamedNativeQuery(name="Estudiante.buscarPorCedulaSemestre",query = "SELECT * FROM estudiante WHERE estu_cedula = :datocedula AND estu_semestre = :datosemestre",resultClass = Estudiante.class)
@NamedNativeQuery(name="Estudiante.buscarPorFacultadEdad",query = "SELECT * FROM estudiante WHERE estu_facultad = :datofacultad AND estu_edad<= :datoedad",resultClass = Estudiante.class)
public class Estudiante {

	@Id
	@Column(name = "estu_cedula")
	private String cedula;

	@Column(name = "estu_nombre")
	private String nombre;

	@Column(name = "estu_apellido")
	private String apellido;

	@Column(name = "estu_edad")
	private Integer edad;

	@Column(name = "estu_semestre")
	private String semestre;

	@Column(name = "estu_correo")
	private String correo;

	@Column(name = "estu_facultad")
	private String facultad;

	public Estudiante() {

	}

	public Estudiante(String cedula, String nombre, String apellido, Integer edad, String semestre) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.semestre = semestre;
	}

	@Override
	public String toString() {
		return "Estudiante [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", semestre=" + semestre + "]";
	}

	// GET & SET
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

}