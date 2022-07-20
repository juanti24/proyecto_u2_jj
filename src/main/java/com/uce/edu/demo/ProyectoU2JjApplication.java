package com.uce.edu.demo;

import java.math.BigDecimal;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Ciudadano;
import com.uce.edu.demo.repository.modelo.Empleado;
import com.uce.edu.demo.service.ICiudadanoService;

@SpringBootApplication
public class ProyectoU2JjApplication implements CommandLineRunner {

	@Autowired
	private ICiudadanoService iciudadnoService;

	private static Logger Log = Logger.getLogger(ProyectoU2JjApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2JjApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Ciudadano c1 = new Ciudadano();
		c1.setNombre("Juan");
		c1.setApellido("Jumbo");

		Empleado e1 = new Empleado();
		e1.setCodigoIess("1111");
		e1.setSalario(new BigDecimal(100));
		e1.setCiudadano(c1);
		
		c1.setEmpleado(e1);
		
		this.iciudadnoService.insertar(c1);
		
	

	}
}