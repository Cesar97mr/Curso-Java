package libreria.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.curso.java.ddbb.utils.UtilsDataBase;
import libreria.entities.Biblioteca;

public class BibliotecaDao {
	
	private Connection conexion;
	
	
	public BibliotecaDao(String nombre) throws SQLException {
		super();
		this.conexion = UtilsDataBase.getInstance();
	}
	
	public List<Biblioteca> getBibliotecas() throws SQLException{
		
		List<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();
		this.conexion.createStatement();
		
		return bibliotecas;
	}
	
	public List<Biblioteca> getBibliotecas(String nombre) {
		List<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();
		
		
		return bibliotecas;
	}
	
	public Biblioteca getBiblioteca(long id) {
		
		
		
		return null;
	}
	
	
}
