package hospital;

public class Enfermo extends Persona{
	
	private String enfermedad;
	
	public Enfermo(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	public void comer() {
		System.out.println("Paciente comiendo en la cafeteria");
	}
}
