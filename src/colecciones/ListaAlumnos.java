package colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

import poo.Alumno;

public class ListaAlumnos {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Alumno> alumnos = new CopyOnWriteArrayList<Alumno>();
		if(alumnos.isEmpty()) {
			alumnos.add(new Alumno(1414, "cesar", "ramos"));
			alumnos.add(new Alumno(1313, "luis", "bonifacio"));
			alumnos.add(new Alumno(1533, "fabi", "dejesus"));
			alumnos.add(new Alumno(1632, "kevin", "ramos"));
		}
		
		System.out.println("Todos los usuarios de la lista: ");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre());
		}
		
		System.out.println("Ingrese un dni: ");
		int valor = sc.nextInt();
		int cont = 0;
	
		for (Alumno alumno : alumnos) {
			if(alumno.getDni() == valor) {
				alumnos.remove(alumno);
			}
		}
		
		
		
		System.out.println("");
		System.out.println("Todos los usuarios de la lista nueva: ");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre());
		}
		System.out.println("Ingrese un dni: ");
		int idx = sc.nextInt();
		for (Alumno alumno : alumnos) {
			if(alumno.getDni() == idx) {
				alumno.setNombre("cambiado");
			}
			System.out.println(alumno.getNombre());
		}
		
	}
}
