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
	private IPersonaJpaService ipersonaJpaService;

	private static Logger Log = Logger.getLogger(ProyectoU2JjApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Persona per = new Persona();
		per.setNombre("Carlos");
		per.setApellido("Suarez");
		per.setGenero("Masculino");
		per.setCedula("1112320979");

		// Guardar
		//this.ipersonaJpaService.guardar(per);
		
		//1 TypedQuery
		Persona perTyped=this.ipersonaJpaService.buscarPorCedulaTyped("1112320979");
		Log.info("Persona Typed: " + perTyped);
		//2 NamedQuery
		Persona perNamed=this.ipersonaJpaService.buscarPorCedulaNamed("1112320979");
		Log.info("Persona Named: " + perNamed);
		//3 TypedQuery y NamedQuery
		Persona perTypedNamed=this.ipersonaJpaService.buscarPorCedulaTypedNamed("1112320979");
		Log.info("Persona TypedNamed: " + perTypedNamed);
		
		//4. Varios NamedQuery
		List<Persona> listaPersona = this.ipersonaJpaService.buscarPorNombreApellido("Carlos", "Suarez");
		for(Persona item:listaPersona) {
			Log.info("Persona: " + item);
		}
	}

}