package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.deber23.repository.modelo.Editorial;
import com.uce.edu.demo.deber23.repository.modelo.Libro;
import com.uce.edu.demo.deber23.service.IEditorialService;


@SpringBootApplication
public class ProyectoU2JjApplication implements CommandLineRunner {

	@Autowired
	private IEditorialService ieditorialService ;


	private static Logger Log = Logger.getLogger(ProyectoU2JjApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2JjApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Editorial edit1 = new Editorial();
		edit1.setNombre("Casa Blanca");
		edit1.setUbicacion("Rodrigo de Chavez");
		edit1.setTelefono("3101501");
		
		Libro libro1 = new Libro();
		
		libro1.setNombre("La Mala Hora");
		libro1.setNumeroPaginas("220");
		libro1.setGenero("Terror");
		libro1.setAutor("Paulo Coelho");
		libro1.setEditorial(edit1);
		
		Libro libro2 = new Libro();
		
		libro2.setNombre("El Señor de los Anillos");
		libro2.setNumeroPaginas("220");
		libro2.setGenero("Fantasia");
		libro2.setAutor("J.K Rolling");
		libro2.setEditorial(edit1);
		
		Libro libro3 = new Libro();
		
		libro3.setNombre("El Codigo Da Vince");
		libro3.setNumeroPaginas("200");
		libro3.setGenero("Fantasia");
		libro3.setAutor("Dan Brown");
		libro3.setEditorial(edit1);
		
		List <Libro> libros = new ArrayList<>();
		libros.add(libro1);
		libros.add(libro2);
		libros.add(libro3);
		
		edit1.setLibros(libros);
		
		Editorial edit2 = new Editorial();
		edit2.setNombre("Estudiantil");
		edit2.setUbicacion("Av Bemeo");
		edit2.setTelefono("2657333");
		edit2.setLibros(libros);
		
		Editorial edit3 = new Editorial();
		edit3.setNombre("Don Bos");
		edit3.setUbicacion("Av Universitaria");
		edit3.setTelefono("2640333");
		edit3.setLibros(libros);
		
		
		//Insertar
		this.ieditorialService.insertar(edit3);
		
		//Buscar
		this.ieditorialService.buscar(1);
		
		//Actualizar
		edit2.setUbicacion("La Mariscal");
		this.ieditorialService.actualizar(edit2);
		
		//Eliminar
		this.ieditorialService.eliminar(2);
		
	}
}