package com.uce.edu.demo.to;

public class EstudianteTo {

	private int id;
	private String nombre;
	private String apellido;
	private String cedula;
	private String telefono;

	// Constructor por defecto
	public EstudianteTo() {

	}

	public EstudianteTo(int id, String nombre, String apellido, String cedula, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.telefono = telefono;
	}

	// SET Y GET
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", telefono=" + telefono + "]";
	}

}
