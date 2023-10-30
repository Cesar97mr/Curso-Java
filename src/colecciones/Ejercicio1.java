package colecciones;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import poo.Alumno;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Ejercicio1 e1 = new Ejercicio1();
		e1.buscador();
	}
	
	public Set<Alumno> crearAlumnos() {
		
		Alumno a1 = new Alumno(4141212, "Javier", "torero", 7);
		Alumno a2 = new Alumno(141412, "Mari", "torreta", 9);
		Alumno a3 = new Alumno(56757345, "Marcos", "Molino", 3);
		Alumno a4 = new Alumno(8989766, "Lucia", "Lucero", 6);
		
		Set<Alumno> alumnos = new HashSet<Alumno>();
		alumnos.add(a1);
		alumnos.add(a2);
		alumnos.add(a3);
		alumnos.add(a4);
		
		int notaMedia = 0;
		for (Alumno nota : alumnos) {
			notaMedia += nota.getNota();
		}
		
		
		return alumnos;
	}
	
	public Map<String,Set<Alumno>> mostrarcolegios() {
		
		Map<String,Set<Alumno>> colegios = new HashMap<String,Set<Alumno>>();
		colegios.put("Virgen salvadora", crearAlumnos());
		colegios.put("Salvador Dali", crearAlumnos());
		colegios.put("Isaac Albeniz", crearAlumnos());
		
		for(Map.Entry<String, Set<Alumno>> datos: colegios.entrySet()) {
			System.out.println("key: " + datos.getKey() + " value: " + "\n"+ datos.getValue());
		}
		
		return colegios;
	}
	
	public void buscador() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Porfavor inserta un DNI: ");
		int valor = sc.nextInt();
		
		for(Map.Entry<String, Set<Alumno>> colegio: mostrarcolegios().entrySet()) {
			if(valor == colegio.getValue().iterator().next().getDni()) {
				System.out.println("El alumno con DNI " + valor + " está en el colegio "+
									colegio.getKey());
			}
		}
	}
	
}
