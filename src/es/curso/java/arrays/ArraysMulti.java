package es.curso.java.arrays;
import java.util.Scanner;
public class ArraysMulti {
public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 
	int [][] cuadrado;
	int filas = 0;
	System.out.println("Ingrese el numero  de filas");
	filas = sc.nextInt();
	int cont = 1;
	cuadrado = new int[filas][filas];
	for(int i = 0; i<cuadrado.length;i++) {
		
		for(int j = 0; j<cuadrado[0].length;j++) {
			
			cuadrado[i][j] = cont;
			cont++;
			
			
		}
	}
	for(int i = 0; i<cuadrado.length;i++) {
		
		for(int j = 0; j<cuadrado[0].length;j++) {
			if(cuadrado[i][j] < 10) {
				System.out.print(cuadrado[i][j] + "  ");
			}else {
				System.out.print(cuadrado[i][j]+ " ");
			}
		}
		System.out.println("");
	}
	
	System.out.println("~~~~ Array unidimensional en diagonal ~~~~");
	
	for(int i = 0; i<cuadrado.length;i++) {
		int [] newArr = new int [filas];
		newArr = cuadrado[i];
	
		System.out.print(newArr[i] + " ");
	}
	System.out.println("");
	
	
	
	for(int i = 0,  j = cuadrado.length-1; i<cuadrado.length / 2; i++, j--) {
	
		int aux = cuadrado[i][j];
		cuadrado[i][j] = cuadrado[j][i];
		cuadrado[j][i] = aux;

	}
	System.out.println("");
	
	System.out.println("~~~~ Array unidimensional invertido ~~~~");
	
	for(int i = 0; i<cuadrado.length;i++) {
		for(int j = 0; j<cuadrado.length;j++) {
			if(cuadrado[i][j] < 10) {
				System.out.print(cuadrado[i][j] + "  ");
			}else {
				System.out.print(cuadrado[i][j]+ " ");
			}
			
		}
		System.out.println(" ");
		
	}
	
}
}
