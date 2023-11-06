package libreria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.sql.Statement;



public class Biblioteca {
	
	private Scanner sc = new Scanner(System.in);
	private int id_biblio;
	private String nombre;
	private String direccion_id;
	private HashMap<String, Libro> libros = new HashMap<String, Libro>();
	
	public Biblioteca() {
		
	}
	
	public Biblioteca(int id_biblio, String nombre, String direccion_id) {
		super();
		this.id_biblio = id_biblio;
		this.nombre = nombre;
		this.direccion_id = direccion_id;
	}

	public int getId_biblio() {
		return id_biblio;
	}

	public void setId_biblio(int id_biblio) {
		this.id_biblio = id_biblio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion_id() {
		return direccion_id;
	}

	public void setDireccion_id(String direccion_id) {
		this.direccion_id = direccion_id;
	}

	public HashMap<String, Libro> getLibros() {
		return libros;
	}

	public void setLibros(HashMap<String, Libro> libros) {
		this.libros = libros;
	}
	
	public void mostrarDatosBiblio(int idx) {
		String url = "jdbc:mysql://localhost:3306/bibliotecas?serverTimezone=Europe/Madrid";
		String username = "root";
		String password = "12345678";
		
		try (
				Connection connection = DriverManager.getConnection(url, username, password);
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery("select * from tb_bibliotecas where id_biblio="+idx + ";");
			) {			
			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("id_biblio"));
				System.out.println("Nombre Biblioteca: " + rs.getString("nombre"));
				System.out.println("Direccion: " + rs.getString("direccion_id"));
				
			}
		

		} catch (SQLException e) {
			System.err.println("Ha habido un error " + e.getMessage());
//			e.printStackTrace();
		} 

	}


	

//
//	public void agregarLibro() {
//		System.out.println("Introduce el titulo: ");
//		String titulo = sc.nextLine();
//		System.out.println("Introduce el autor: ");
//		String autor = sc.nextLine();
//		
//		Collection<String> claves = this.libros.keySet();
//		
//		if(!claves.contains(titulo)) {
//			Libro libro = new Libro(titulo,autor,1);
//			libros.put(titulo, libro);
//			System.out.println("Libro agreado por primera vez!");
//		}else {
//			
//			for (Map.Entry<String, Libro> libreria : this.libros.entrySet()) {
//				if(libreria.getKey().equals(titulo)) {
//					libreria.getValue().setNumCopias(libreria.getValue().getNumCopias() +1);
//					System.out.println("Libro añadido correctamente!");
//				}
//			}
//		}
//	}
//	public void mostrarLibros() {
//		if(this.libros.size() == 0) {
//			System.out.println("No tenemos libros disponibles!!");
//		}else {
//			for (Map.Entry<String, Libro> libreria : this.libros.entrySet()) {
//				System.out.println("[ " + libreria.getKey() + " ] " + " = "+ libreria.getValue().getAutor() + " - " + 
//								   libreria.getValue().getTitulo() + " - " + libreria.getValue().getNumCopias());
//			}
//		}
//	}
//	
//	
//	public void prestarLibro() {
//		Set<Entry<String, Libro>> biblio  = this.libros.entrySet();
//		Set<Entry<Integer, Libro>> prestado = this.prestados.entrySet();
//		
//		System.out.println("Introduce el nombre del libro: ");
//		String titulo = sc.nextLine();
//		int exists = 0;
//	
//		for (Entry<String, Libro> entry : biblio) {
//			
//			int numCopias = entry.getValue().getNumCopias();
//		
//			if(entry.getKey().equals(titulo) && numCopias == 1){		
//			
//			entry.getValue().setNumCopias(numCopias - 1);
//			System.out.println("Entregado!! NumCopias restantes = " + entry.getValue().getNumCopias());
//			exists = 1;
//			}else if(entry.getKey().equals(titulo) && numCopias > 1) {
//				entry.getValue().setNumCopias(numCopias - 1);
//				System.out.println("Entregado!! NumCopias restantes = " + entry.getValue().getNumCopias());
//			}
//		}
//		if(exists == 1) {
//			this.libros.remove(titulo);
//			exists = 0;
//		}
//	}
//	
//	public void librosPrestados() {
//		Set<Entry<Integer, Libro>> prestados = this.prestados.entrySet();
//		
//		if(this.libros.size() == 0) {
//			System.out.println("No tenemos libros disponibles!!");
//		}else {
//			for (Entry<Integer, Libro> libreria: prestados) {
//				System.out.println("[ " + libreria.getKey() + " ] " + " - " + 
//								   libreria.getKey() + " - " + libreria.getValue().getNumCopias());
//			}
//		}
//	}
//	
//	public void devolverLibro() {
//		Set<Entry<String, Libro>> biblio  = this.libros.entrySet();
//		System.out.println("Introduce el titulo del libro a devolver: ");
//		String valor = sc.nextLine();
//		
//		for(Map.Entry<String, Libro> prestado: biblio) {
//			if(prestado.getValue().getNumCopias() >= 1) {
//				prestado.getValue().setNumCopias(prestado.getValue().getNumCopias() + 1);
//				System.out.println("Libro devuelto!");
//			}else {
//				this.libros.put(valor, null);
//				System.out.println("Libro devuelto!!");
//			}
//			
//		}
//}
	
}
