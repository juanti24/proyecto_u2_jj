package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.jboss.logging.Logger;
import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.to.Persona;

@SpringBootApplication
public class ProyectoU2JjApplication implements CommandLineRunner {

	@Autowired
	private IPersonaJdbcService personaJdbcService;
	
	private static Logger log = Logger.getLogger(ProyectoU2JjApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		
		Persona p = new Persona();
		p.setId(3);
		p.setNombre("Luis");
		p.setApellido("Jumbo");

		// insertar
		// this.personaJdbcService.guardar(p);

		Persona p1 = new Persona();
		p1.setId(2);
		p1.setNombre("Carlos");
		p1.setApellido("Jumbo");

		//actualizar
		//this.personaJdbcService.actualizar(p1);
		
		//eliminar
		//this.personaJdbcService.eliminar(3);
		
		//buscar por id
		 log.info(this.personaJdbcService.buscar(2));
		

	}

}
