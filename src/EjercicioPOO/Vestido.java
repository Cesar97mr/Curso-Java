package EjercicioPOO;

public class Vestido {
	private int id;
	private String color;
	private String talla;
	private int precio;
	
	
	public Vestido(int id, String color, String talla, int precio) {
		super();
		this.id = id;
		this.color = color;
		this.talla = talla;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
