package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.deber24.repository.modelo.Autor1;
import com.uce.edu.demo.deber24.repository.modelo.Libro1;
import com.uce.edu.demo.deber24.repository.modelo.LibroAutor;
import com.uce.edu.demo.deber24.service.IAutor1Service;
import com.uce.edu.demo.deber24.service.ILibroAutorService;
import com.uce.edu.demo.deber24.service.ILibro1Service;

@SpringBootApplication
public class ProyectoU2JjApplication implements CommandLineRunner {

	@Autowired
	private ILibro1Service iLibro1Service;

	@Autowired
	private IAutor1Service iAutor1Service;

	@Autowired
	private ILibroAutorService libroAutorService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// 1 libro que tiene dos autores

		Libro1 l1 = new Libro1();
		l1.setTitulo("La Mala Hora");
		l1.setCantidadPaginas(500);

		Autor1 a1 = new Autor1();
		a1.setNombre("Luis Perez");

		Autor1 a2 = new Autor1();
		a2.setNombre("Carlos Suarez");

		this.iLibro1Service.insertar(l1);
		this.iAutor1Service.insertar(a1);
		this.iAutor1Service.insertar(a2);

		this.libroAutorService.insertar(a1.getNombre(), l1.getTitulo());
		this.libroAutorService.insertar(a2.getNombre(), l1.getTitulo());

		// 1 autor que escribió dos libros

		Autor1 a3 = new Autor1();
		a3.setNombre("Luis Jumbo");

		Libro1 l2 = new Libro1();
		l2.setTitulo("Soledad");
		l2.setCantidadPaginas(220);

		Libro1 l3 = new Libro1();
		l3.setTitulo("Cronicas de Narnia");
		l3.setCantidadPaginas(320);

		this.iAutor1Service.insertar(a3);
		this.iLibro1Service.insertar(l2);
		this.iLibro1Service.insertar(l3);

		this.libroAutorService.insertar(a3.getNombre(), l2.getTitulo());
		this.libroAutorService.insertar(a3.getNombre(), l3.getTitulo());

	}

}