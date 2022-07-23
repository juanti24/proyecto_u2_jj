package com.uce.edu.demo;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.onetwomany.Habitacion;
import com.uce.edu.demo.repository.modelo.onetwomany.Hotel;
import com.uce.edu.demo.service.IHabitacionService;
import com.uce.edu.demo.service.IHotelService;


@SpringBootApplication
public class ProyectoU2JjApplication implements CommandLineRunner {

	@Autowired
	private IHotelService ihotelService;

	@Autowired
	private IHabitacionService ihabitacionService ;
	
	private static Logger Log = Logger.getLogger(ProyectoU2JjApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2JjApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		//Hotel hotel2 = new Hotel();
		//hotel2.setNombre("Hilto Guayaquil");
		//hotel2.setDireccion("Patria");

		//this.ihotelService.insertar(hotel2);
		Hotel hote = new Hotel();
		hote.setId(1);
		
		
		Habitacion habi1 = new Habitacion();
		habi1.setNumero("A234");
		habi1.setPiso("10");
		habi1.setTipo("Familiar");
		habi1.setHotel(hote);
		
		Habitacion habi2 = new Habitacion();
		habi2.setNumero("A55");
		habi2.setPiso("1");
		habi2.setTipo("Individual");
		habi2.setHotel(hote);
		
		this.ihabitacionService.insertar(habi1);
		this.ihabitacionService.insertar(habi2);
	}
}