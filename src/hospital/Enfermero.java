package hospital;

public class Enfermero extends EmpleadosHospital{

	private int planta;
	
	public Enfermero() {
		
	}
	public Enfermero(String turno, Persona[] empleados) {
		super(turno, empleados);
		// TODO Auto-generated constructor stub
	}
	
	public Paciente atenderPaciente(Paciente [] salaDeEspera) {
		
		
			Paciente primer = salaDeEspera[0];
			System.out.println("El enfermero + " + this.getNombre() +
								" va a atender al paciente: " + primer.getNombre());	
			for(int i = 0; i<salaDeEspera.length; i++) {
				salaDeEspera[i] = salaDeEspera[i+1];
			}
			return primer;
	}
	
	public int getPlanta() {
		return planta;
	}


	public void setPlanta(int planta) {
		this.planta = planta;
	}
}
