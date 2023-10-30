package libreria;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

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
		
		Libro libro = new Libro(titulo, autor,1);
		libros.put(titulo,libro);
		
		for(Map.Entry<String, Libro> lib: this.libros.entrySet()) {
			if(titulo.equals(lib.getKey())) {
				lib.getValue().setNumCopias(lib.getValue().getNumCopias()+1);
				System.out.println("Se ha agregado el libro correctamente!");
				System.out.println("Numero total de copias de " + titulo + " :" + lib.getValue().getNumCopias());
			}
		}
		
	}
	
	public void prestarLibro() {
		
		System.out.println("Introduce el nombre del libro: ");
		String titulo = sc.nextLine();
		
		for(Map.Entry<String, Libro> lib: this.libros.entrySet()) {
			if(titulo.equals(lib.getKey())) {
				System.out.println("Libros disponibles: " + lib.getValue().getNumCopias());
				System.out.println("...Prestando libro...");
				prestados.put(lib.getKey(), lib.getValue());
				System.out.println("Ya lo tienes! Libros disponibles: " + lib.getValue().getNumCopias());
			}
		}
	}
	
	public void devolverLibro() {
		
		System.out.println("Introduce el titulo del libro a devolver: ");
		String valor = sc.nextLine();
		
		for(Map.Entry<String, Libro> prestado: prestados.entrySet()) {
			if(valor.equals(prestado.getKey())) {
				System.out.println("Devolviendo libro...");
				this.libros.put(prestado.getKey(), prestado.getValue());
				System.out.println("Devolución completa, copias disponibles de " +
									valor + " = " + this.libros.entrySet());
			}
		}
	}
}
