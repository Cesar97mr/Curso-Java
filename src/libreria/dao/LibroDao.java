package libreria.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.curso.java.ddbb.ejercicios.biblioteca.entities.Direccion;
import libreria.entities.Biblioteca;
import librerias.mapas.Libro;

public class LibroDao extends ConexionDAO{

	
	
	
public LibroDao() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}

public List<Biblioteca> getLibros () throws SQLException {
		
		List<Libro> libros = new ArrayList<Libro>();

		Statement stmt = this.getConexion().createStatement();
		String query = "SELECT biblio.id, biblio.nombre, dir.tipo_direccion, dir.direccion, dir.ciudad, dir.provincia, dir.cp FROM TB_BIBLIOTECA as biblio JOIN TB_DIRECCION as dir ON biblio.fk_direccion = dir.id;";
		
		ResultSet rs = stmt.executeQuery(query);
		
		while (rs.next()) {
			long idBiblioteca = rs.getLong("biblio.id");
			String nombreBiblioteca = rs.getString("biblio.nombre");
			String tipoDireccion = rs.getString("dir.tipo_direccion");
			String direccion = rs.getString("dir.direccion");
			String ciudad = rs.getString("dir.ciudad");
			String provincia = rs.getString("dir.provincia");
			int codPostal = rs.getInt("dir.cp");

			Direccion dire = new Direccion(tipoDireccion,direccion,ciudad,provincia,codPostal);
			Libro biblio = new Libro(idBiblioteca, nombreBiblioteca, dire);
			
			libros.add(biblio);
		}
		
		return libros;
	}
	
	public List<Biblioteca> getBibliotecas (String ciudad) {
		
		List<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();
		
		return bibliotecas;
	}
	
	
	public Biblioteca getBiblioteca (long id) {
		
		
		return null;
	}
}
