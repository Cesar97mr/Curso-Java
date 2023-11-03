package libreria;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
	
		Menu menu = new Menu();
		menu.menu();
		
	
	}
	
	public void menu() {
		Biblioteca biblioteca = new Biblioteca();
		int valor = 0;
		Scanner sc = new Scanner(System.in);
		int str = 0;
		do {
			System.out.println("Estas son las bibliotecas disponibles: ");
			System.out.println("1. Biblioteca 1" + "\n" +
							   "2. Biblioteca 2" + "\n" + 
							   "3. Biblioteca 3" + "\n" + 
							   "4. Salir.");
			valor = sc.nextInt();
			if(valor == 1) {
				do {
					System.out.println("1. Mostrar Info Biblioteca." + "\n" + 
									   "2. Mostrar Libros de la biblioteca" + "\n" +
									   "3. Buscar Libro" + "\n" + 
									   "4. Agregar Libro a la biblioteca" + "\n" +
									   "5. Modificar un libro" + "\n" +
									   "6. Borrar un libro de la biblioteca" + "\n" +
									   "7. Volver");
					
					
					valor = sc.nextInt();
					switch (valor) {
					case 1: {
						biblioteca.mostrarDatosBiblio();
						break;
					}
					case 2: {
					
					}
					case 3: {
						
					}
					case 4: {
						
					}
					case 5: {
						
					}
					case 6: {
						System.out.println("Hasta la proxima!");
						break;
					}
					
					}
				}while(valor != 6);
			}else if(valor == 2) {
				do {
					System.out.println("1. Mostrar Info Biblioteca." + "\n" + 
									   "2. Mostrar Libros de la biblioteca" + "\n" +
									   "3. Buscar Libro" + "\n" + 
									   "4. Agregar Libro a la biblioteca" + "\n" +
									   "5. Modificar un libro" + "\n" +
									   "6. Borrar un libro de la biblioteca" + "\n" +
									   "7. Volver");
					
					
					valor = sc.nextInt();
					switch (valor) {
					case 1: {
						
					}
					case 2: {
						
					}
					case 3: {
						
					}
					case 4: {
					
					}
					case 5: {
						
					}
					case 6: {
						System.out.println("Hasta la proxima!");
						break;
					}
					
					}
				}while(valor != 7);
			}else {
				do {
					System.out.println("1. Mostrar Info Biblioteca." + "\n" + 
									   "2. Mostrar Libros de la biblioteca" + "\n" +
									   "3. Buscar Libro" + "\n" + 
									   "4. Agregar Libro a la biblioteca" + "\n" +
									   "5. Modificar un libro" + "\n" +
									   "6. Borrar un libro de la biblioteca" + "\n" +
									   "7. Volver");
					
					
					valor = sc.nextInt();
					switch (valor) {
					case 1: {
						
					}
					case 2: {
						
					}
					case 3: {
						
					}
					case 4: {
						
					}
					case 5: {
						
					}
					case 6: {
						System.out.println("Hasta la proxima!");
						break;
					}
					
					}
				}while(valor != 7);
			}
			
		
	}while(str !=4);
}
}
