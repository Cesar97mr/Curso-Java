package libreria.dao;

import java.sql.Connection;
import java.sql.SQLException;

import es.curso.java.ddbb.utils.UtilsDataBase;

public abstract class ConexionDAO {
	
	private Connection conexion;
	
	public ConexionDAO() throws SQLException {
		super();
		this.conexion = UtilsDataBase.getInstance();
	}
	
	public Connection getConexion() {
		
		return conexion;
	}
}
