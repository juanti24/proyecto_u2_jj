package com.uce.edu.demo;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.EstudianteContadorEdad;
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

		Log.info("Estudiante: " + this.estudianteJpaService.buscarPorCedula("1715957537"));

		List<EstudianteContadorEdad> listaEstudianteEdad = this.estudianteJpaService.consultarCantidadPorEdad();

		for (EstudianteContadorEdad item : listaEstudianteEdad) {
			Log.info("EstudianteContadorEdad: " + item);
		}

	}
}