package com.uce.edu.demo;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IPersonaJdbcService;
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

		//Buscar
		log.info("Dato con JPA: " + this.personaJpaService.buscar(1));

		Persona per = new Persona();
		per.setId(7);
		per.setNombre("Ivan");
		per.setApellido("Aulestia");

		//Guardar
		//this.personaJpaService.guardar(per);
		
		Persona per1 = new Persona();
		per1.setId(2);
		per1.setNombre("Kevin");
		per1.setApellido("Jumb");
		
		//Actualizar
		//this.personaJpaService.actualizar(per1);
		
		//Eliminar
		this.personaJpaService.eliminar(2);
		
	}

}
