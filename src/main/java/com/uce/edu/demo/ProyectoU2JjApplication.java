package com.uce.edu.demo;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.service.EstudianteJdbcServiceImpl;
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

		// INSERTAR ESTUDIANTE
		Estudiante e = new Estudiante();

		e.setNombre("Carlos");
		e.setApellido("Tinizaray");
		e.setCedula("1723111979");
		e.setEdad(20);
		e.setSemestre("Sexto");

		// this.estudianteJdbcServiceImpl.crear(e);

		// Typed Query
		Log.info("\nBúsqueda 1: BUSCAR TODOS.");
		List<Estudiante> listae1 = this.estudianteJpaService.buscarTodos();
		for (Estudiante item : listae1) {
			Log.info("Busqueda 1: " + item);
		}

		Log.info("\nBúsqueda 2: BUSCAR TODOS ORDENADOS POR APELLIDO.");
		List<Estudiante> listae2 = this.estudianteJpaService.buscarTodosOrdenados();
		for (Estudiante item : listae2) {
			Log.info("Búsqueda 2: " + item);
		}

		// Named Query
		Log.info("\nBúsqueda 3: BUSCAR POR APELLIDO.");
		List<Estudiante> listae3 = this.estudianteJpaService.buscarPorApellido("Jumbo");
		for (Estudiante item : listae3) {
			Log.info("Búsqueda 3: " + item);
		}

		Log.info("\nBúsqueda 4: BUSCAR POR NOMBRE.");
		List<Estudiante> listae4 = this.estudianteJpaService.buscarPorNombre("Juan");
		for (Estudiante item : listae4) {
			Log.info("Búsqueda 4: " + item);
		}

		// Typed y Named Query
		Log.info("\nBúsqueda 5: BUSCAR POR SEMESTRES.");
		List<Estudiante> listae5 = this.estudianteJpaService.buscarPorSemestre("Sexto", "Noveno");
		for (Estudiante item : listae5) {
			Log.info("Búsqueda 5: " + item);
		}

		Log.info("\nBúsqueda 6: BUSCAR POR RANGO DE EDAD.");
		List<Estudiante> listae6 = this.estudianteJpaService.buscarPorEdad(24, 25);
		for (Estudiante item : listae6) {
			Log.info("Búsqueda 6: " + item);
		}

	}

}