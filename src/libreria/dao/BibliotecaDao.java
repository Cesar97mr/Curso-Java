package libreria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import libreria.entities.Biblioteca;
import libreria.entities.Direccion;
import libreria.exceptions.NoResultsException;

public class BibliotecaDao extends ConexionDAO{
	
	private static final Logger logger = LogManager.getLogger(BibliotecaDao.class);
	
	public BibliotecaDao() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}

public List<Biblioteca> getBibliotecas () throws SQLException {
		
		List<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();

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
			Biblioteca biblio = new Biblioteca(idBiblioteca, nombreBiblioteca, dire);
			
			bibliotecas.add(biblio);
		}
		
		return bibliotecas;
	}
	
	public List<Biblioteca> getBibliotecas (String ciudad) {
		
		List<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();
		
		return bibliotecas;
	}
	
	
	public Biblioteca getBiblioteca (long id) {

		return null;
	}
	
	public void insertarBiblioteca(String nombre, long id_dir) throws SQLException, NoResultsException {
		
		String query = "insert into tb_biblioteca (nombre,fk_direccion) values (?,?)";
	
		PreparedStatement ps = this.getConexion().prepareStatement(query);

		ps.setString(1, nombre);
		ps.setLong(2, id_dir);
		
		int insertados = ps.executeUpdate();
		
		if(insertados == 0) {
			throw new NoResultsException("No se ha insertado ninguna direccion");
		}else {
			logger.info("Insert de direccion realizado correctamente");
		}
	}
	public void insertarBiblioteca(Biblioteca biblioteca) throws SQLException, NoResultsException {
		
		insertarBiblioteca(biblioteca.getNombre(), biblioteca.getId());
		
	}
	
}
