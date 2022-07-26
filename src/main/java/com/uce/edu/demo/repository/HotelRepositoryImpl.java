package com.uce.edu.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.onetomany.Habitacion;
import com.uce.edu.demo.repository.modelo.onetomany.Hotel;

@Repository
@Transactional
public class HotelRepositoryImpl implements IHotelRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private IHabitacionRepository habitacionRepository;
	
	@Override
	public void insertar(Hotel h) {
		
		
		//List<Habitacion> habitaciones = h.getHabitaciones();
		//h.setHabitaciones(null);
		this.entityManager.persist(h);
		
		//####################
		//Buscar El hotel
		//Esto se utiliza cuando yo antes tengas que hacer calculos
		//String numero = h.getNombre();
		//Hotel hotelBuscado = null;
		//for(Habitacion habiItem: habitaciones) {
			//Calculos
		//	habiItem.setHotel(hotelBuscado);
		//	this.habitacionRepository.insertar(habiItem);
		}
	}

//}
