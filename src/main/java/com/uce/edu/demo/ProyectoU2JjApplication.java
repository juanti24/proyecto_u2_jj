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
	private IPersonaJpaService ipersonaJpaService;

	private static Logger Log = Logger.getLogger(ProyectoU2JjApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2JjApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

	//Native
		
	Persona p = this.ipersonaJpaService.buscarPorCedulaNative("1723920979");	
	
	Log.info("Persona: " + p );
	
	// Named Native
	
	Persona p1 = this.ipersonaJpaService.buscarPorCedulaNamedNative("1712320979");	
		
	Log.info("Persona: " + p1);
	
	

}
	
}