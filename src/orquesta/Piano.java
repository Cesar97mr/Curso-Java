package orquesta;

public class Piano extends Instrumento{
	private boolean afinado;
	private int numeroOctavas;
	private String tipoPiano;
	
	public Piano(String nombre, String tipo) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Piano(String nombre, String tipo, int numeroOctavas, String tipoPiano) {
		super(nombre, tipo);
		this.numeroOctavas = numeroOctavas;
		this.tipoPiano = tipoPiano;
	}


	public Piano(String nombre, String tipo, boolean afinado, int numeroOctavas, String tipoPiano) {
		super(nombre, tipo);
		this.afinado = afinado;
		this.numeroOctavas = numeroOctavas;
		this.tipoPiano = tipoPiano;
	}



	public boolean isAfinado() {
		return afinado;
	}



	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}



	public int getNumeroOctavas() {
		return numeroOctavas;
	}



	public void setNumeroOctavas(int numeroOctavas) {
		this.numeroOctavas = numeroOctavas;
	}



	public String getTipoPiano() {
		return tipoPiano;
	}



	public void setTipoPiano(String tipoPiano) {
		this.tipoPiano = tipoPiano;
	}



	public void afinar() {
		int valor = 0;
		if(!posibleError()) {
			System.out.println("Afinando: " + this.getNombre());
			valor = 1;
		}else {
			System.out.println("Error al afinal el instrumento!!");
			
		}
		
	}
	}
