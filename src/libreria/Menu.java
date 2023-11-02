package libreria;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
	
		Menu menu = new Menu();
		menu.menu();
		
	
	}
	
	public void menu() {
		Biblioteca biblioteca = new Biblioteca("Nacional");
		int valor = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Bienvenido a la biblioteca nacional!! " + "\n"
                    + "Seleccion una opción: " + "\n" + 
					"1. Mostrar todos los libros disponibles." + "\n" + 
                    "2. Agregar nuevo libro a la biblioteca." + "\n" + 
					"3. Pedir un libro prestado." + "\n" + 
                    "4. Devolver un libro prestado anteriormente." + "\n" +
					"5. Mostrar los libros prestados." + "\n" + 
                    "6. Salir.");
			valor = sc.nextInt();
			switch (valor) {
			case 1: {
				biblioteca.mostrarLibros();
				break;
			}
			case 2: {
				biblioteca.agregarLibro();
				break;
			}
			case 3: {
				biblioteca.prestarLibro();
				break;
			}
			case 4: {
				biblioteca.devolverLibro();
				break;
			}
			case 5: {
				biblioteca.librosPrestados();
			}
			case 6: {
				System.out.println("Hasta la proxima!");
				break;
			}
			
			}
		}while(valor != 6);
	}
}
