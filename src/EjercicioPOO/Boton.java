package EjercicioPOO;

public class Boton {
	private int id;
	private String forma;
	private String color;
	private String tamanio;
	
	
	public Boton(int id, String forma, String color, String tamanio) {
		super();
		this.id = id;
		this.forma = forma;
		this.color = color;
		this.tamanio = tamanio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	
}
