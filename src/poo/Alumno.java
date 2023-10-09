package poo;

public class Alumno {
	
	 int dni;
	 String nombre;
	 String apellidos;
	 int nota;
	
	public Alumno() {
		
	}
	public Alumno(int dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	public Alumno(int dni, String nombre, String apellidos, int nota) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nota = nota;
	}
	
	public void estudiar() {
		
		if(this.nota == 0) {
			System.out.println("El alumno no ha estudiado nada");
		}else if(this.nota <5) {
			System.out.println("El alumno ha estudiado poco");
		}else if(this.nota > 4 && this.nota <10) {
			System.out.println("El alumno ha estudiado mucho");
		}else {
			System.out.println("Es un genio");
		}
	}
	
	public void  aprobados(Alumno [] aprobados) {
		
		for(int i = 0; i<aprobados.length;i++) {
			if(aprobados[i].nota > 4) {
				System.out.println(aprobados[i].nombre +  " - " + 
										+ aprobados[i].dni +  " - "
										+ aprobados[i].apellidos +  " - "
										+ aprobados[i].nota);
			}
		}
	}
	
}
