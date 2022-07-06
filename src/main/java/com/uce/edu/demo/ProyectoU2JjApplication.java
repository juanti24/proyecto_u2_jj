package com.uce.edu.demo;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IPersonaJpaService;

@SpringBootApplication
public class ProyectoU2JjApplication implements CommandLineRunner {

	@Autowired
	private IPersonaJpaService personaJpaService;

	private static Logger log = Logger.getLogger(ProyectoU2JjApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Persona per = new Persona();
		// per.setId(3);
		per.setNombre("Kevin");
		per.setApellido("Gutierrez");
		per.setGenero("Masculino");
		per.setCedula("1722753151");

		// Guardar
		// this.personaJpaService.guardar(per);
		

		// Buscar Por Apellido
		// List<Persona> listp = this.personaJpaService.buscarPorApellido("Suarez");
		// for(Persona item : listp) {
		// log.info("Persona: " + item);
		// }

		// Buscar Por Nombre
		log.info("Buscar Por Nombre");
		List<Persona> listp1 = this.personaJpaService.buscarPorNombre("Kevin");
		for (Persona item1 : listp1) {
			log.info("Persona: " + item1);
		}

		// Buscar Por Genero
		log.info("Buscar Por Genero");
		List<Persona> listp2 = this.personaJpaService.buscarPorGenero("Masculino");
		for (Persona item2 : listp2) {
			log.info("Persona: " + item2);
		 }

	}

}
