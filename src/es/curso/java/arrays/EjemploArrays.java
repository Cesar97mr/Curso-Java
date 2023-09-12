package es.curso.java.arrays;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EjemploArrays {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos colores quieres guardar?");
		int cant = sc.nextInt();
		String[] colors = new String[cant];
		
		for(int i = 0; i<colors.length; i++) {
				System.out.println("Introduce el nombre del color: ");
				colors[i] = sc.next();
		}
	
		for(String str: colors){
			System.out.println(str);
		}
		System.out.println();
		for(String str: colors){
			if(str.contains("o") && str.startsWith("a")) {
				System.out.println("El color que cumple las condiciones es: " + str);
			}
		}
		
	}
}
