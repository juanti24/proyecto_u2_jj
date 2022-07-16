package com.uce.edu.demo;

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

	private static Logger Log = Logger.getLogger(ProyectoU2JjApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2JjApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Persona per = new Persona();
		per.setNombre("Nori");
		per.setApellido("Tinizaray");
		per.setGenero("Femenino");
		per.setCedula("1750020979");

		// Guardar
		//this.personaJpaService.guardar(per);
		
		//Buscar por cedula Api
		Persona p = this.personaJpaService.buscarPorCriteriaApi("1723920979");
		Log.info("Criteria API: "+ p);
		
		Persona p1 = this.personaJpaService.buscarDinamicamente("Irene", "Telo", "Femenino");
		Log.info("Busqueda Dinamica: "+ p1);
		
	}

}