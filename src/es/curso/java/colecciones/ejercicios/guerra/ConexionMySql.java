package es.curso.java.colecciones.ejercicios.guerra;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.HashSet;
import java.util.Set;

import es.curso.java.colecciones.ejercicios.guerra.exceptions.LimiteValoresException;
import mysql.Facility;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ConexionMySql {

		private Guerrero guerrero;
		private Tanque tanque;
		private Nave nave;
		private List<Guerrero>warriors = new LinkedList<Guerrero>();
		private List<VehiculoGuerra> vehiculos = new LinkedList<VehiculoGuerra>();
	
		public Guerrero getGuerrero() {
			return guerrero;
		}

		public void setGuerrero(Guerrero guerrero) {
			this.guerrero = guerrero;
		}

		public static void main(String[] args) throws LimiteValoresException {
			ConexionMySql conexion = new ConexionMySql();
			conexion.conectaTryWithResources();

		}

		
		public List conectaTryWithResources() throws LimiteValoresException {
			String url = "jdbc:mysql://localhost:3306/warzone?serverTimezone=Europe/Madrid";
			String username = "root";
			String password = "12345678";
			
			//Connection connection = null;//Conexion con la base de datos
			//Statement stmt = null;//Lanzar consulta
			//ResultSet rs = null;//Recoger datos de la consulta
			
			try (
					Connection connection = DriverManager.getConnection(url, username, password);
					Statement stmt = connection.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM tb_guerrero");
					ResultSet rs2 = stmt.executeQuery("SELECT * FROM tb_vehiculo_guerra");
				) {

				
				while (rs.next()) {
					
					String name = rs.getString("nombre");
					String tipo = rs.getString("tipo");
					int fuerza = rs.getInt("fuerza");
					int resistencia = rs.getInt("resistencia");
					
					guerrero = new Guerrero(name,tipo,fuerza,resistencia);
					warriors.add(guerrero);
				}
				while(rs2.next()) {
					String nombre = rs2.getString("nombre");
					int ataque = rs2.getInt("ataque");
					int defensa = rs2.getInt("defensa");
					String tipo = rs2.getString("tipo");
					if(tipo.equals("Tanque")) {
						
					}
				}
				
				
				return warriors;
			} catch (SQLException e) {
				System.err.println("Ha habido un error " + e.getMessage());
//				e.printStackTrace();
			}
			return warriors; 

		}
}
