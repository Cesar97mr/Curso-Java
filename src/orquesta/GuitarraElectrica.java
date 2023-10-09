package orquesta;

public class GuitarraElectrica extends Guitarra{
	private boolean afinado;
	private int potencia;
	
	public GuitarraElectrica(String nombre, String tipo) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}
	
	
	public GuitarraElectrica(String nombre, String tipo, int potencia) {
		super(nombre, tipo);
		this.potencia = potencia;
	}
	


	public GuitarraElectrica(String nombre, String tipo, boolean afinado, int potencia) {
		super(nombre, tipo);
		this.afinado = afinado;
		this.potencia = potencia;
	}


	public boolean isAfinado() {
		return afinado;
	}


	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}


	public int getPotencia() {
		return potencia;
	}


	public void setPotencia(int potencia) {
		this.potencia = potencia;
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
	
	public void tocar() {
		
	}
	
}
