import java.util.Scanner;

public class Socio {
	private String name;
	private int antiguedad;
	
	public Socio(Scanner sc) {
		System.out.println("Ingrese el nombre del socio: ");
		name = sc.next();
		System.out.println("Ingrese la antiguedad: ");
		antiguedad = sc.nextInt();
	}
	public void imprimir() {
        System.out.println(name+" tiene una antiguedad de "+antiguedad);
    }
    
    public int retornarAntiguedad() {
        return antiguedad;
    }
	
}
