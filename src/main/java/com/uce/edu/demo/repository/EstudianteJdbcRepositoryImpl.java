package com.uce.edu.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.uce.edu.demo.to.Estudiante;

@Repository
public class EstudianteJdbcRepositoryImpl implements IEstudianteJdbcRepository{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@SuppressWarnings("deprecation")
	@Override
	public Estudiante buscarPorId(int id) {
		return this.jdbcTemplate.queryForObject("select * from estudiante where id=?", new Object[] { id },
				new BeanPropertyRowMapper<Estudiante>(Estudiante.class));

	}

	@Override
	public void insertar(Estudiante estudiante) {
		this.jdbcTemplate.update("insert into estudiante (id, nombre, apellido,cedula,telefono) values (?,?,?,?,?)",
				new Object[] { estudiante.getId(), estudiante.getNombre(), estudiante.getApellido(), estudiante.getCedula(), estudiante.getTelefono() });
		
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.jdbcTemplate.update("update estudiante set nombre=?,apellido=?,cedula=?,telefono=? where id=?",
				new Object[] { estudiante.getNombre(), estudiante.getApellido(),estudiante.getCedula(),estudiante.getTelefono(), estudiante.getId() });
	}

	@Override
	public void eliminar(int id) {
		this.jdbcTemplate.update("delete from estudiante where id=?", new Object[] { id });
		
	}

}
