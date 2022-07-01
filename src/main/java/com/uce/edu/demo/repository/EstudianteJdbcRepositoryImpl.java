package com.uce.edu.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.uce.edu.demo.to.EstudianteTo;

@Repository
public class EstudianteJdbcRepositoryImpl implements IEstudianteJdbcRepository{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@SuppressWarnings("deprecation")
	@Override
	public EstudianteTo buscarPorId(int id) {
		return this.jdbcTemplate.queryForObject("select * from estudiante where id=?", new Object[] { id },
				new BeanPropertyRowMapper<EstudianteTo>(EstudianteTo.class));

	}

	@Override
	public void insertar(EstudianteTo estudianteTo) {
		this.jdbcTemplate.update("insert into estudiante (id, nombre, apellido,cedula,telefono) values (?,?,?,?,?)",
				new Object[] { estudianteTo.getId(), estudianteTo.getNombre(), estudianteTo.getApellido(), estudianteTo.getCedula(), estudianteTo.getTelefono() });
		
	}

	@Override
	public void actualizar(EstudianteTo estudianteTo) {
		this.jdbcTemplate.update("update estudiante set nombre=?,apellido=?,cedula=?,telefono=? where id=?",
				new Object[] { estudianteTo.getNombre(), estudianteTo.getApellido(),estudianteTo.getCedula(),estudianteTo.getTelefono(), estudianteTo.getId() });
	}

	@Override
	public void eliminar(int id) {
		this.jdbcTemplate.update("delete from estudiante where id=?", new Object[] { id });
		
	}

}
