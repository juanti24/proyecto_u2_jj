package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.prueba.repository.modelo.Matricula;
import com.uce.edu.demo.prueba.repository.modelo.Propietario;
import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;
import com.uce.edu.demo.prueba.service.IGestorMatriculaService;
import com.uce.edu.demo.prueba.service.IPropietarioService;
import com.uce.edu.demo.prueba.service.IVehiculoService;

@SpringBootApplication
public class ProyectoU2JjApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("liviano")
	private IVehiculoService iVehiculoLivianoJpaService;

	@Autowired
	@Qualifier("pesado")
	private IVehiculoService iVehiculoPesadoJpaService;

	@Autowired
	private IPropietarioService iPropietarioJpaService;

	@Autowired
	private IGestorMatriculaService iGestorMatriculaService;

	private static Logger LOG = Logger.getLogger(ProyectoU2JjApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Propietario p1 = new Propietario();
		p1.setNombre("Juan");
		p1.setApellido("Jumbo");
		p1.setCedula("1701891102");

		this.iPropietarioJpaService.insertar(p1);

		LOG.info("se ingreso el propietario: " + p1);

		Propietario p2 = new Propietario();
		p2.setNombre("Domenica");
		p2.setApellido("Tini");
		p2.setCedula("1717441415");

		this.iPropietarioJpaService.insertar(p2);

		LOG.info("se ingreso el propietario: " + p2);

		Vehiculo v1 = new Vehiculo();
		v1.setMarca("Chevrolet");
		v1.setModelo("aveo");
		v1.setPlaca("PJJ-0894");
		v1.setPrecio(new BigDecimal(2000));
		v1.setTipo("L");

		this.iVehiculoLivianoJpaService.insertar(v1);
		LOG.info("se ingreso el vehiculo: " + v1);

		Vehiculo v2 = new Vehiculo();
		v2.setMarca("Toyota");
		v2.setModelo("serie500");
		v2.setPlaca("LBA-7899");
		v2.setPrecio(new BigDecimal(10000));
		v2.setTipo("P");

		this.iVehiculoLivianoJpaService.insertar(v2);
		LOG.info("se ingreso el vehiculo: " + v2);

		this.iGestorMatriculaService.matricular("1701891102", "PJJ-0894");

		this.iGestorMatriculaService.matricular("1717441415", "LBA-7899");
		
		
	}

}