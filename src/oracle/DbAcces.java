package oracle;

import java.sql.*;
 public class DbAcces 
 {
	 public static void main(String[] args) {
	   
	     String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	     String usuario = "system";
	     String contraseña = "password";

	     try {
	   
	         Class.forName("oracle.jdbc.driver.OracleDriver");

	         // Establecer la conexión
	         Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
	         Statement stmt = conexion.createStatement();
	         ResultSet rset = stmt.executeQuery("select BANNER from SYS.V_$VERSION");
	         while (rset.next())
	               System.out.println (rset.getString(1));  
	         stmt.close();
	         
	         conexion.close();
	     } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	         System.err.println("Asegúrate de tener el controlador JDBC de Oracle en tu classpath.");
	     } catch (SQLException e) {
	         e.printStackTrace();
	         System.err.println("Error al establecer la conexión con la base de datos.");
	     }
	 }
 }
 
