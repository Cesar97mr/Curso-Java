package hospital;

public class Hospital {

	private String nombre;
	private Habitacion [] habitaciones = new Habitacion[3];
	private Paciente [] salaDeEspera = new Paciente[3];
	
	public Hospital() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Hospital h1 = new Hospital();
		h1.abrirHospital();
	}
	
	public Persona [] abrirHospital() {
		
		Habitacion hab1 = new Habitacion();
		Habitacion hab2 = new Habitacion();
		
		Paciente p1 = new Paciente();
		Paciente p2 = new Paciente();
		Paciente p3 = new Paciente();
		
		Paciente [] pacientes = {p1,p2,p3};
		for(int i = 0; i<salaDeEspera.length; i++) {
			salaDeEspera[i] = pacientes[i];
		}
		
		Enfermero enfermero1 = new Enfermero();
		Doctor doc1 = new Doctor("Pediatria");
		
		Persona [] trabajadores = {enfermero1, doc1};
		
		return trabajadores;
	}
	
	public void ficharTrabajadores(Persona [] trabajadores) {
		EmpleadosHospital eh = new EmpleadosHospital("Tarde", trabajadores);
		eh.fichar(trabajadores);
	}
	public void comerTrabajadores(Persona [] trabajadores) {
		EmpleadosHospital eh = new EmpleadosHospital("Tarde", trabajadores);
		eh.comer(trabajadores);
	}	
}
