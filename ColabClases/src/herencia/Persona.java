package herencia;

import java.util.Scanner;

public class Persona {
	protected String nombre;
	protected int edad;
	protected Scanner sc;
	
	public Persona() {
		sc = new Scanner(System.in);
	}
	
	public void cargar(){
		System.out.println("Ingresa el nombre");
		nombre = sc.next();
		System.out.println("Ingresa la edad");
		edad = sc.nextInt();
	}
	
	public void imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}
	
	public static void main(String[] args) {
		Persona persona1=new Persona();
        persona1.cargar();
        Empleado empleado1=new Empleado();
        empleado1.cargar();
        empleado1.cargarSueldo();
        persona1.imprimir();        
        empleado1.imprimir();
        empleado1.imprimirSueldo();
	}
}
