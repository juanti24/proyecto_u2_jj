package com.uce.edu.demo.prueba.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;

@Repository
@Transactional
public class VehiculoRepositoryImpl implements IVehiculoRepository {
	
private static Logger LOG = Logger.getLogger(VehiculoRepositoryImpl.class);
	
	@PersistenceContext
	private EntityManager entitymanager;
			
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		LOG.debug("Insertanddo vehiculo: "+vehiculo.toString());
		this.entitymanager.persist(vehiculo);
	}

	@Override
	public Vehiculo buscar(String placa) {
		Query myQuery = this.entitymanager.createQuery("SELECT v FROM Vehiculo v WHERE v.placa=:placa");
		myQuery.setParameter("placa", placa);
		return (Vehiculo) myQuery.getSingleResult();
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		LOG.debug("Actualizando vehiculo ");
		this.entitymanager.merge(vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		LOG.debug("Eliminando vehiculo por placa: "+placa);
		Vehiculo v = this.buscar(placa);
		this.entitymanager.remove(v);
	}

}
