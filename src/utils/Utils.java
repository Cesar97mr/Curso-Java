package utils;
import java.util.Scanner;

public class Utils {
	
	public static String pideDatoTexto(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un texto: ");
		String str2 = sc.next();
		
		return str2;
	}
	
	public static int pideDatoNumerico() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		String valor = sc.next();
		
		int newValor = Integer.parseInt(valor);
		return newValor;
	}
}
