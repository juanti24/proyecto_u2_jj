package com.uce.edu.demo;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IEstudianteJpaService;

@SpringBootApplication
public class ProyectoU2JjApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteJpaService estudianteJpaService;

	private static Logger Log = Logger.getLogger(ProyectoU2JjApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2JjApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		// Criteria API

		Log.info("\nBúsqueda 4: BUSCAR POR NOMBRES Y FACULTAD.");

		List<Estudiante> lista = this.estudianteJpaService.buscarPorNombresFacultad("Juan", "Garcia", "Matematicas");
		for (Estudiante item : lista) {
			Log.info("Estudiante: " + item);
		}

		Log.info("\nBúsqueda 4: BUSCAR POR CEDULA Y CORREO.");

		Estudiante e = this.estudianteJpaService.buscarPorCedulaCorreo("1712900117", "lusu@gmail.com");
		Log.info("Estudiante: " + e);

	}

}