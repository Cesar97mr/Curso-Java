package colecciones;

import java.util.HashSet;
import java.util.Set;

import poo.Alumno;

public class Ejercicio1 {

	public static void main(String[] args) {
		
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
		System.out.println(notaMedia);
		
		return alumnos;
	}
	
}
