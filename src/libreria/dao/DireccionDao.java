package libreria.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import libreria.entities.Direccion;
import libreria.exceptions.NoResultsException;

public class DireccionDao extends ConexionDAO{
	private static final Logger logger = LogManager.getLogger(DireccionDao.class);

	public DireccionDao() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void insertarDireccion(String tipo_dir, String dir, String ciudad, String provincia, int cp) throws SQLException, NoResultsException {
		
		String query = "INSERT INTO tb_direccion (tipo_direccion, direccion, ciudad, provincia, cp) values (?,?,?,?,?);";
		
		logger.debug(query);
		
		PreparedStatement ps = this.getConexion().prepareStatement(query);
		ps.setString(1, tipo_dir);
		ps.setString(2, dir);
		ps.setString(3, ciudad);
		ps.setString(4, provincia);
		ps.setInt(5, cp);
		
		int insertados = ps.executeUpdate();
		
		if(insertados == 0) {
			throw new NoResultsException("No se ha insertado ninguna direccion");
		}else {
			logger.info("Insert de direccion realizado correctamente");
		}
	}
	
	public void insertarDireccion(Direccion direccion) throws SQLException, NoResultsException {
		
		insertarDireccion(direccion.getTipo(),direccion.getNombre(),direccion.getCiudad(),direccion.getProvincia(),direccion.getCodPostal());
	}
	
	public long getLastDireccion() throws SQLException {
		
		String query = "SELECT * FROM tb_direccion ORDER BY id DESC LIMIT 1;";
		long id = 0;
		logger.debug("Consulta creada");
		Statement stmt = this.getConexion().createStatement();
		ResultSet rs = stmt.executeQuery(query);
		if (rs.next()) {
			 id = rs.getLong("id");
			System.out.println("Enviando un id= " + id);
		}
		return id;
	}

}
