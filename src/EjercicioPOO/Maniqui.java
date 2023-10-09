package EjercicioPOO;

import java.util.Scanner;

public class Maniqui {
	private int id;
	private Vestido vestido;
	private Pantalon pantalon;
	private Camisa camisa;
	
	public Maniqui(int id) {
		this.id = id;
	}
	public Maniqui(int id, Vestido vestido) {
		this.id = id;
		this.vestido = vestido;
	}
	public Maniqui(int id, Camisa camisa, Pantalon pantalon) {
		this.id = id;
		this.camisa = camisa;
		this.pantalon = pantalon;
	}
	
	public Maniqui(int id, Vestido vestido, Pantalon pantalon, Camisa camisa) {
		super();
		this.id = id;
		this.vestido = vestido;
		this.pantalon = pantalon;
		this.camisa = camisa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}
	
	public void desvestir(Maniqui maniqui) {
		
		this.camisa = null;
		this.pantalon = null;
		this.vestido = null;
		
	}
	
	public void vestir(Pantalon p1, Camisa c1) {	
			this.camisa = c1;
			this.pantalon = p1;
	}
	public void vestir(Vestido v1) {
		this.vestido = v1;
	}
}
