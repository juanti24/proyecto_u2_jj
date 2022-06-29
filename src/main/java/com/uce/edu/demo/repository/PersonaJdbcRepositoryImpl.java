package com.uce.edu.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.to.PersonaTo;

@Repository
public class PersonaJdbcRepositoryImpl implements IPersonaJdbcRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@SuppressWarnings("deprecation")
	@Override
	public PersonaTo buscarPorId(int id) {
		return this.jdbcTemplate.queryForObject("select * from persona where id=?", new Object[] { id },
				new BeanPropertyRowMapper<PersonaTo>(PersonaTo.class));

	}

	@Override
	public void insertar(PersonaTo personaTo) {
		this.jdbcTemplate.update("insert into persona (id, nombre, apellido) values (?,?,?)",
				new Object[] { personaTo.getId(), personaTo.getNombre(), personaTo.getApellido() });

	}

	@Override
	public void actualizar(PersonaTo personaTo) {
		this.jdbcTemplate.update("update persona set nombre=?,apellido=? where id=?",
				new Object[] { personaTo.getNombre(), personaTo.getApellido(), personaTo.getId() });

	}

	@Override
	public void eliminar(int id) {
		this.jdbcTemplate.update("delete from persona where id=?", new Object[] { id });

	}

	@Override
	public List<PersonaTo> buscarTodos() {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.query("select * from persona order by id desc", new PersonaRowMapper());
	}
	
	class PersonaRowMapper implements RowMapper<PersonaTo>{
		
		@Override
		public PersonaTo mapRow(ResultSet rs, int rowNum) throws SQLException {
			PersonaTo personaTo = new PersonaTo();
			personaTo.setId(rs.getInt("id"));
			personaTo.setNombre(rs.getString("nombre"));
			personaTo.setApellido(rs.getString("apellido"));
			return personaTo;
		}
		
	}

}
