package utils;
import java.util.Scanner;

public class Utils {
	
	public static String pideDatoTexto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un texto: ");
		String str = sc.next();
		
		return str;
	}
	
	public static int pideDatoNumerico() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		String valor = sc.next();
		
		int newValor = Integer.parseInt(valor);
		return newValor;
	}
}
