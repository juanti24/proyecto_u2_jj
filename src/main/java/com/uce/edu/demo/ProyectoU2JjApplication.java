package com.uce.edu.demo;

import java.util.HashSet;
import java.util.Set;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.manytomany.Autor;
import com.uce.edu.demo.repository.modelo.manytomany.Libro;
import com.uce.edu.demo.service.ILibroService;

@SpringBootApplication
public class ProyectoU2JjApplication implements CommandLineRunner {

	@Autowired
	private ILibroService ilibroService;

	private static Logger Log = Logger.getLogger(ProyectoU2JjApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2JjApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Libro libro1 = new Libro();
		libro1.setTitulo("La Mala Hora");
		libro1.setCantidadPaginas(220);

		Autor autor1 = new Autor();
		autor1.setNombre("Juan Perez");
		Set<Autor> autores = new HashSet<>();
		autores.add(autor1);

		libro1.setAutores(autores);

		this.ilibroService.insertar(libro1);

	}
}