package herencia;


public class Empleado extends Persona {
	
	private int sueldo;

	
	public void cargarSueldo() {
		System.out.println("Indica el sueldo a cargar");
		sueldo = sc.nextInt();
	}
	public void imprimirSueldo() {
		System.out.println("El sueldo es:"+sueldo);
	}
	

}
