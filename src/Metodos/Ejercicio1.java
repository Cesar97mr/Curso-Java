package Metodos;

import java.util.Scanner;

import utils.Utils;

public class Ejercicio1 {
	
	
	public int calculaEdad(String anioNacimiento) {
		
		int anio = Integer.parseInt(anioNacimiento);
		int edad = 2023 - anio;
	
		return edad;
		
	}
	
	public void pintarTabla(int numero) {
		
		for(int i = 0 ; i <= 10; i++) {
			int result = numero * i;
			System.out.println(numero + " x " + i + " = " + result);
		}
	}
	
	public String [] juntaDatos (String texto, int numRepeticiones) {
		
		String[] result = new String[numRepeticiones];
		for(int i = 0; i<numRepeticiones; i++) {
		
			String str = texto.substring(0, texto.length() - i);
			result[i] = str;
		
			System.out.println(result[i]);
		}
		return result;
	}
	
	public void velocidad(int km, int tiempo) {
		
		float velocidad = km / tiempo;
		
		System.out.println(velocidad);
	}
	
	public int pintarMenu(String[] str) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		System.err.println("Bienvenido!, Elige una opcion: ");
		for(int i = 0; i<str.length;i++) {
			System.err.println(str[i]);
		}
		int result = sc.nextInt();
		
		return result;
		
	}
	
	public static void main(String[] args){
		Ejercicio1 e1 = new Ejercicio1();
		
		
		String [] newArr = {"1:Sumar numeros", "2:Lanzar numero random", "3: Contar hasta 10", "4: Salir"};
		
		e1.pintarMenu(newArr);
		
	}
	
}
