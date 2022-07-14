package com.uce.edu.demo;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteJpaService;

@SpringBootApplication
public class ProyectoU2JjApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteJpaService iestudianteJpaService;

	private static Logger Log = Logger.getLogger(ProyectoU2JjApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2JjApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		// INSERTAR ESTUDIANTE
		Estudiante e = new Estudiante();

		e.setNombre("Luis");
		e.setApellido("Suarez");
		e.setCedula("1712900117");
		e.setEdad(22);
		e.setSemestre("Segundo");
		e.setFacultad("Fisica");
		e.setCorreo("lusu@gmail.com");

		// this.iestudianteJpaService.crear(e);

		// Native

		Log.info("\nBúsqueda 1: BUSCAR POR FACULTAD.");

		Estudiante e1 = this.iestudianteJpaService.buscarPorFacultad("Fisica");

		Log.info("Estudiante: " + e1);

		Log.info("\nBúsqueda 2: BUSCAR POR CORREO.");

		Estudiante e2 = this.iestudianteJpaService.buscarPorCorreo("pepin@gmail.com");

		Log.info("Estudiante: " + e2);

		// NamedNativeQuery

		Log.info("\nBúsqueda 3: BUSCAR POR CEDULA Y SEMESTRE.");

		Estudiante e3 = this.iestudianteJpaService.buscarPorCedulaSemestre("1715900117", "Segundo");

		Log.info("Estudiante: " + e3);

		Log.info("\nBúsqueda 4: BUSCAR POR FACULTAD Y EDAD.");

		List<Estudiante> e4 = this.iestudianteJpaService.buscarPorFacultadEdad("Matematicas", 20);

		for (Estudiante item : e4) {
			Log.info("Estudiante: " + item);
		}

	}

}