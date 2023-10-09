package poo;

public class AlumnoMain{
	public static void main(String[] args) {
		
		Alumno a1 = new Alumno();
		Alumno a2 = new Alumno(4343, "cesar" , "ramos");
		Alumno a3 = new Alumno(3123, "fabi", "dejesus", 10);
		
		a1.nombre = "Lauren";
		a1.dni = 1141;
		a1.apellidos = "Garcia";
		a1.nota = 3;
		
		a2.nota = 5;
		
		Alumno [] arrAprobados ={a1,a2,a3};
		
		a1.aprobados(arrAprobados);
	}
	
	
	
}
