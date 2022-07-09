package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.prueba.repository.modelo.Propietario;
import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;
import com.uce.edu.demo.prueba.service.IGestorMatriculaService;
import com.uce.edu.demo.prueba.service.IPropietarioService;
import com.uce.edu.demo.prueba.service.IVehiculoService;

@SpringBootApplication
public class ProyectoU2JjApplication implements CommandLineRunner {

	@Autowired
	private IPropietarioService propietarioService;

	@Autowired
	private IVehiculoService vehiculoService;

	private static Logger log = Logger.getLogger(ProyectoU2JjApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Vehiculo v = new Vehiculo();
		v.setMarca("Toyota");
		v.setPlaca("PJK-2514");
		v.setPrecio(new BigDecimal(23000));
		v.setTipo("L");

		// 1. crear un vehiculo
		this.vehiculoService.insertarVehiculo(v);

		// Actualizar
		v.setMarca("Audi");
		this.vehiculoService.actualizarVehiculo(v);

		Propietario p1 = new Propietario();
		p1.setNombre("Luis");
		p1.setApellido("Jumbo");
		p1.setCedula("1745620979");
		p1.setFechaNacimiento(LocalDateTime.of(1984, Month.JULY, 2, 0, 0));

		// Insertar propietario
		this.propietarioService.insertarPropietario(p1);

		// Crear matricula
		// this.gestorMatriculaService.matricularVehiculo("1723920979","PAP-14255");

	}

}