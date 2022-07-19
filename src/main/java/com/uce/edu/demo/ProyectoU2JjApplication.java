package com.uce.edu.demo;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.repository.modelo.PersonaSencilla;
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

		List<PersonaSencilla> listaPersona = this.personaJpaService.buscarPorPersonaSencillo("Tinizaray");

		for (PersonaSencilla perItem : listaPersona) {
			Log.info("PersonaSencilla: " + perItem );
		}
		
		List<PersonaContadorGenero> listaPersona1 = this.personaJpaService.consultarCantidadPorGenero();

		for (PersonaContadorGenero perItem : listaPersona1) {
			Log.info("PersonaContadorGenero: " + perItem );
		}
		
	}
}