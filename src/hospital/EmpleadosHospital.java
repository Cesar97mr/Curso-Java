package hospital;

public class EmpleadosHospital extends Persona{

	private String turno;
	private Persona [] empleados;
	
	public EmpleadosHospital() {
		
	}
	public EmpleadosHospital(String turno, Persona [] empleados) {
		this.empleados = empleados;
		this.turno = turno;
	}
	public void comer() {
		// TODO Auto-generated method stub
		
	}
	public   void comer(Persona [] empleados) {
		for(int i = 0; i<empleados.length; i++) {
			System.out.println("El empleado: " + empleados[i].getNombre() + " |" +
								empleados[i].getId() + " |"+ " esta COMIENDO");
	}
	}
	public void fichar(Persona [] empleados) {
		
		for(int i = 0; i<empleados.length; i++) {
			System.out.println("El empleado: " + empleados[i].getNombre() + " |" +
								empleados[i].getId() + " |"+ " esta fichando");
	}

	}
	public Persona [] getEmpleados() {
		return empleados;
	}
	public void setEmpleados(Persona [] empleados) {
		this.empleados = empleados;
	}
}
