package es.curso.java.arrays;

import java.util.Scanner;

public class EjemploArrays3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] alumnos;
		int cant = 0;
		System.out.println("Ingresa el numero de alumnos");
		cant = sc.nextInt();
		alumnos = new String[cant];
		String [] aprobados;
		int cont = 0;
		
		for(int i = 0; i<alumnos.length; i++) {
			System.out.println("Ingresa una nota");
			String nota = sc.next();
			alumnos[i] = "Alumno" + i + ":" + nota;
			String dato = alumnos[i];
			//System.out.println(dato);
			int posicionDosPuntos = dato.indexOf(":");
			String nombre = dato.substring(0,posicionDosPuntos);
			String notaStr = dato.substring(posicionDosPuntos+1);
			int not = Integer.parseInt(notaStr);
			
			if (not>=5) {
				cont++;
			}
		}
		
		for(int j = 0; j<alumnos.length;j++) {
			System.out.println(alumnos[j]);
		}
		
		System.out.println("~~~ Aprobados ~~~");
		aprobados = new String[cont];
		int indice = 0;
		
		for(int x = 0; x<alumnos.length; x++) {
			int pos = alumnos[x].indexOf(":");
			String nota = alumnos[x].substring(pos+1);
			int num = Integer.parseInt(nota);
			if(num > 4) {
				aprobados[indice] = nota;
				indice++;
			}
		}
		for(String name : aprobados) {
			System.out.println(name);
		}
	}

}
