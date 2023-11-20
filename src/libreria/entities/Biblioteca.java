package libreria.entities;

public class Biblioteca {
	private long id;
	private String nombre;
	private long id_dir;
	private Direccion direccion;

	
	public Biblioteca(String nombre, long id_dir) {
		super();
		this.nombre = nombre;
		this.id_dir = id_dir;
	}
	public Biblioteca(long id, String nombre, Direccion direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		
		
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the direccion
	 */
	public Direccion getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Biblioteca [id=" + id + ", " + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (direccion != null ? "direccion=" + direccion : "") + "]";
	}
	
	
}

