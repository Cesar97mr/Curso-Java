package es.curso.java.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EjemploArrays2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Cuantas notas quieres guardar?");
		int cant = sc.nextInt();
		int [] notas = new int[cant];
		System.out.println("Indica el nombre del alumno:");
		String name = sc.next();
		double media = 0;
		for(int i = 0; i<notas.length; i++) {
			System.out.println("Indica las notas:");
			notas[i] = sc.nextInt();
			media += notas[i];
		}
		media = media / notas.length;
		System.out.println("La nota media es de: " + media);
		int max = 0;
		int min = notas[0];
		
		int aux = 0;
		for(int not : notas) {
			
			if(not > max) {
				max = not;
			}if(not < min) {
				min = not;
			}
		}
		
		System.out.println("La nota maxima es: " + max);
		System.out.println("La nota minima es: " + min);
		
		Arrays.sort(notas);
		
		
		int [] auxiliar = new int[notas.length];
		 
		for (int i = 0; i < notas.length; i++) {
		           
		            System.out.println(notas[(notas.length -1) - i]);
		}
		notas = auxiliar;
		
	}
	
	
}
