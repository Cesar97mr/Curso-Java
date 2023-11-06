package libreria.entities;

public class Biblioteca {
	
	private long id;
	private String nombre;
	private String direccion;
	
	public Biblioteca(long id, String nombre, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Biblioteca [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	
	
}
