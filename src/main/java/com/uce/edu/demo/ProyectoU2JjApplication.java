package com.uce.edu.demo;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IEstudianteJpaService;
import com.uce.edu.demo.service.IPersonaJpaService;

@SpringBootApplication
public class ProyectoU2JjApplication implements CommandLineRunner {

	
	@Autowired
	private IEstudianteJpaService estudianteJpaService;

	private static Logger log = Logger.getLogger(ProyectoU2JjApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//Buscar
		log.info("Dato con JPA: " + this.estudianteJpaService.buscar(1));

		Estudiante e = new Estudiante();
		e.setId(6);
		e.setNombre("Alejandra");
		e.setApellido("Tinizaray");
		e.setCedula("1723949457");
		e.setTelefono("0994987474");
		
		//Guardar
		this.estudianteJpaService.guardar(e);

		Estudiante e1 = new Estudiante();
		e1.setId(1);
		e1.setNombre("Nori");
		e1.setApellido("Soto");
		
		//Actualizar
		this.estudianteJpaService.actualizar(e1);
		
		//Eliminar
		this.estudianteJpaService.eliminar(2);
		
		
		
		
		
		
	}

}
