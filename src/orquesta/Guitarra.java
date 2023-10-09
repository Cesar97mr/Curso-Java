package orquesta;

public class Guitarra extends Instrumento{
		private boolean afinado;
		private int numCuerdas;
		
	public Guitarra(String nombre, String tipo) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}
	
	
	public Guitarra(String nombre, String tipo, int numCuerdas) {
		super(nombre, tipo);
		this.numCuerdas = numCuerdas;
	}


	public Guitarra(String nombre, String tipo, boolean afinado, int numCuerdas) {
		super(nombre, tipo);
		this.afinado = afinado;
		this.numCuerdas = numCuerdas;
	}


	public void afinar() {
		
		if(!posibleError()) {
			System.out.println("Afinando: " + this.getNombre());
			this.afinado = true;
		}else {
			System.out.println("Error al afinal el instrumento!!");
			this.afinado = false;
		}
		
	}


	public boolean isAfinado() {
		return afinado;
	}


	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}


	public int getNumCuerdas() {
		return numCuerdas;
	}


	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}
	

}
