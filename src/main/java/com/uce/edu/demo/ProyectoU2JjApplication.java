package com.uce.edu.demo;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.service.IEstudianteJdbcService;
import com.uce.edu.demo.to.Estudiante;
import com.uce.edu.demo.to.Persona;

@SpringBootApplication
public class ProyectoU2JjApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteJdbcService estudianteJdbcService;

	private static Logger log = Logger.getLogger(ProyectoU2JjApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Insertar
		Estudiante e = new Estudiante();
		e.setId(1);
		e.setNombre("Juan");
		e.setApellido("Jumbo");
		e.setCedula("1723920979");
		e.setTelefono("0958768529");

		Estudiante e1 = new Estudiante();
		e1.setId(2);
		e1.setNombre("Xavier");
		e1.setApellido("Jumbo");
		e1.setCedula("1723920878");
		e1.setTelefono("0999768529");

		Estudiante e2 = new Estudiante();
		e2.setId(3);
		e2.setNombre("Carlos");
		e2.setApellido("Suarez");
		e2.setCedula("1123920878");
		e2.setTelefono("0989768449");
		
		//this.estudianteJdbcService.guardar(e2);
		log.info("Se inserto el estudiante: " + e2);

		// Actualizar
		Estudiante e3 = new Estudiante();
		e3.setId(3);
		e3.setNombre("Carlos");
		e3.setApellido("Jumbo");
		e3.setCedula("1123920878");
		e3.setTelefono("0989768449");

		// this.estudianteJdbcService.actualizar(e3);
		log.info("Se actualizo el estudiante: " + e3);

		// Eliminar
		// this.estudianteJdbcService.eliminar(2);
		log.info("Se elimino el estudiante con id: " + 2 + " correspondiente: " + e1);

		// Buscar
		//log.info(this.estudianteJdbcService.buscar(1));
		log.info("Se busco el estudiante con id: " + 1 + " correspondiente: " + e);
		

	}

}
