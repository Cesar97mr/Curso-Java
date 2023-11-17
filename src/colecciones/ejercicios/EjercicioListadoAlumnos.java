package colecciones.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import poo.Alumno;
import utils.Utils;



public class EjercicioListadoAlumnos {

	public static void main(String[] args) {
		List<String> arrayList = Arrays.asList(args);
		
		
		EjercicioListadoAlumnos ela = new EjercicioListadoAlumnos();
		ela.iniciaEjercicio();

	}

	private void iniciaEjercicio() {
		List<Alumno> alumnos = generaListadoAlumnos();
		System.out.println(alumnos.size());
		
		pintaAlumnos(alumnos);
		
		String dni = Utils.pideDatoTexto("Introduce el dni a borrar");
		
		for (Alumno alumno : alumnos) {
			if (dni.equalsIgnoreCase(alumno.getDni())) {
				alumnos.remove(alumno);
			}
		}
		
		pintaAlumnos(alumnos);
		
		dni = Utils.pideDatoTexto("Introduce el dni del alumno a modificar");
		
		for (Alumno alumno : alumnos) {
			if (dni.equalsIgnoreCase(alumno.getDni())) {
				alumno.setNombre("Nombre Nuevo");
			}
		}
		
		pintaAlumnos(alumnos);
		
	}
	
	
	private void pintaAlumnos (List<Alumno> alumnos) {
		System.out.println("===========================");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
	}
	
	/**
	 * Método para devolver listado de alumnos
	 * @return
	 */
	public List<Alumno> generaListadoAlumnos(){
		Alumno alumno1 = new Alumno("1", "Nombre1", "Ape1");
		Alumno alumno2 = new Alumno("2", "Nombre2", "Ape2");
		Alumno alumno3 = new Alumno("3", "Nombre3", "Ape3");
		Alumno alumno4 = new Alumno("4", "Nombre4", "Ape4");
		
		List<Alumno> listaAlumnos = new CopyOnWriteArrayList<Alumno>();
		
		if (listaAlumnos.isEmpty()) {
			listaAlumnos.add(alumno4);
			listaAlumnos.add(alumno2);
			listaAlumnos.add(alumno3);
			listaAlumnos.add(alumno1);
			listaAlumnos.add(alumno4);
		}
		
		List<String> arrayList = Arrays.asList(new String[]{"Rojo","Azul"});
		
		return listaAlumnos;
	}
	
}
