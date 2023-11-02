package libreria;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Biblioteca {
	private Scanner sc = new Scanner(System.in);
	private String nombre;
	private HashMap<String, Libro> libros = new HashMap<String, Libro>();
	private HashMap<String, Libro> prestados = new HashMap<String, Libro>();
	
public Biblioteca(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Biblioteca(String nombre, HashMap<String, Libro> libros) {
		super();
		this.nombre = nombre;
		this.libros = libros;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashMap<String, Libro> getLibros() {
		return libros;
	}

	public void setLibros(HashMap<String, Libro> libros) {
		this.libros = libros;
	}
	
	
	public HashMap<String, Libro> getPrestados() {
		return prestados;
	}

	public void setPrestados(HashMap<String, Libro> prestados) {
		this.prestados = prestados;
	}

	public void agregarLibro() {
		System.out.println("Introduce el titulo: ");
		String titulo = sc.nextLine();
		System.out.println("Introduce el autor: ");
		String autor = sc.nextLine();
		
		
		Collection<Libro> valores = this.libros.values();
		Collection<String> claves = this.libros.keySet();
		
		if(!claves.contains(titulo)) {
			Libro libro = new Libro(titulo,autor,1);
			libros.put(titulo, libro);
			System.out.println("Libro agreado por primera vez!");
		}else {
			
			for (Map.Entry<String, Libro> libreria : this.libros.entrySet()) {
				if(libreria.getKey().equals(titulo)) {
					libreria.getValue().setNumCopias(libreria.getValue().getNumCopias() +1);
					System.out.println("Libro añadido correctamente!");
				}
			}
		}
	}
	public void mostrarLibros() {
		if(this.libros.size() == 0) {
			System.out.println("No tenemos libros disponibles!!");
		}else {
			for (Map.Entry<String, Libro> libreria : this.libros.entrySet()) {
				System.out.println("[ " + libreria.getKey() + " ] " + " = "+ libreria.getValue().getAutor() + " - " + 
								   libreria.getValue().getTitulo() + " - " + libreria.getValue().getNumCopias());
			}
		}
	}
	
	
	public void prestarLibro() {
		Set<Entry<String, Libro>> biblio  = this.libros.entrySet();
		Set<Entry<String, Libro>> prestados = this.prestados.entrySet();
		
		System.out.println("Introduce el nombre del libro: ");
		String titulo = sc.nextLine();
		int exists = 0;
		for (Entry<String, Libro> entry : biblio) {
			if(entry.getKey().equals(entry.getValue().getTitulo()) && entry.getKey().equals("")) {
				this.prestados.put("true", entry.getValue());
			}else if(entry.getKey().equals(entry.getValue().getTitulo()) && entry.getKey().equals("true")) {
				for (Entry<String, Libro> entry2 : prestados) {
					if(entry2.getValue().getTitulo().equals(titulo)) {
						entry2.getValue().setNumCopias(entry2.getValue().getNumCopias() + 2);
					}
				}
			}
		}
	
		for (Entry<String, Libro> entry : biblio) {
			
			int numCopias = entry.getValue().getNumCopias();
		
			if(entry.getKey().equals(titulo) && numCopias == 1){		
				exists = 1;

				entry.getValue().setNumCopias(numCopias -1);		
				System.out.println("Libro entregado! - NumCopias restantes = " + entry.getValue().getNumCopias());
			
			}else if(entry.getKey().equals(titulo)){
				
				entry.getValue().setNumCopias(numCopias -1);
			
				System.out.println("Libro entregado! - NumCopias restantes = " + entry.getValue().getNumCopias());
			}
		}
		
		
		
		if(exists == 1) {
			this.libros.remove(titulo);
			exists = 0;
		}
	}
	public void librosPrestados() {
		Set<Entry<String, Libro>> prestados = this.prestados.entrySet();
		
		if(this.libros.size() == 0) {
			System.out.println("No tenemos libros disponibles!!");
		}else {
			for (Entry<String, Libro> libreria: prestados) {
				System.out.println("[ " + libreria.getKey() + " ] " + " - " + 
								   libreria.getKey() + " - " + libreria.getValue().getNumCopias());
			}
		}
	}
	
	public void devolverLibro() {
//		Set<Entry<String, Libro>> biblio  = this.libros.entrySet();
//		System.out.println("Introduce el titulo del libro a devolver: ");
//		String valor = sc.nextLine();
//		
//		for(Map.Entry<String, Libro> prestado: prestados.entrySet()) {
//			if(valor.equals(prestado.getKey()) && prestado.getValue() > 1) {
//				System.out.println("Devolviendo libro...");
//			    prestado.setValue(prestado.getValue()-1);
//			}else {
//				if(valor.equals(prestado.getKey()) && prestado.getValue() == 1) {
//					this.libros.put(valor, 1);
//				}
//			}
//		}
}
	
}
