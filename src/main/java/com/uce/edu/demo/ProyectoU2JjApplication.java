package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.deber22.repository.modelo.CiudadanoDos;
import com.uce.edu.demo.deber22.repository.modelo.Pasaporte;
import com.uce.edu.demo.deber22.service.ICiudadanoDosService;


@SpringBootApplication
public class ProyectoU2JjApplication implements CommandLineRunner {

	@Autowired
	private ICiudadanoDosService iciudadanoservice;

	private static Logger Log = Logger.getLogger(ProyectoU2JjApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2JjApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		CiudadanoDos c = new CiudadanoDos();
		
		c.setNombre("Juan");
		c.setApellido("Jumbo");
		c.setCedula("1723920111");
		c.setFechaNacimiento(LocalDateTime.of(1997, 11, 16, 0, 0));
		
		Pasaporte p = new Pasaporte();
		p.setCiudadano(c);
		p.setNumero("1214");
		p.setFechaEmision(LocalDateTime.of(1995, 2, 10, 0, 0));
		p.setFechaCaducidad(LocalDateTime.of(2000, 2, 10, 0, 0));
		
		CiudadanoDos c1 = new CiudadanoDos();
		
		c1.setNombre("Xavier");
		c1.setApellido("Tinizaray");
		c1.setCedula("1723920888");
		c1.setFechaNacimiento(LocalDateTime.of(1990, 5, 12, 0, 0));
		
		Pasaporte p1 = new Pasaporte();
		p1.setCiudadano(c1);
		p1.setNumero("1214");
		p1.setFechaEmision(LocalDateTime.of(1993, 2, 10, 0, 0));
		p1.setFechaCaducidad(LocalDateTime.of(1998, 2, 10, 0, 0));
		c1.setPasaporte(p1);
		
		//Insertar
	     
		this.iciudadanoservice.insertar(c1);
	
		//Buscar
		this.iciudadanoservice.buscar(2);
		
		//Actualizar
		
		c1.setApellido("Suarez");
		this.iciudadanoservice.actualizar(c1);
		
		//Eliminar
		this.iciudadanoservice.eliminar(6);
	}
}