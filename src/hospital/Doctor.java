package hospital;

public class Doctor extends EmpleadosHospital{
	
	private String especialidad;
	
	public Doctor(String especialidad) {
		this.especialidad = especialidad;
	}
	public Doctor(String turno, Persona[] empleados) {
		super(turno, empleados);
		// TODO Auto-generated constructor stub
	}

	public Enfermo diagnosticarPaciente(Paciente paciente) {

		int gravedad = (int)(Math.random()*10+1);
		if(gravedad > 8) {
			System.out.println("El paciente: " + paciente.getNombre() + 
							   " está enfermo");	
		
		Enfermo enfermo = new Enfermo("Gastroenteritis");
		return enfermo;
		
		}else {
			System.out.println("El paciente no está grave, que vaya a dormir!");
			return null;
		}
	}
}
