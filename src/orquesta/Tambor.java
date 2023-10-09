package orquesta;

public class Tambor extends Instrumento{
	private boolean afinado;
	private String material;
	
	public Tambor(String nombre, String tipo) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}
	
	
	public Tambor(String nombre, String tipo, String material) {
		super(nombre, tipo);
		this.material = material;
	}
	
	public Tambor(String nombre, String tipo, boolean afinado, String material) {
		super(nombre, tipo);
		this.afinado = afinado;
		this.material = material;
	}


	public boolean isAfinado() {
		return afinado;
	}


	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public void aporrear() {
		System.out.println("Aporreando: " + this.getNombre());
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
}
