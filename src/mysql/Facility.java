package mysql;

import java.util.HashSet;
import java.util.Set;

public class Facility {
	private long id;
	private int guid;
	private String nombre;
	private String descripcion;
	private String categoria;
	private String address;
	private double height;
	
	public Facility(long id, int guid, String nombre, String descripcion, String categoria, String address,
			double height) {
		super();
		this.id = id;
		this.guid = guid;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.address = address;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Facility [id=" + id + ", guid=" + guid + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", categoria=" + categoria + ", address=" + address + ", height=" + height + "]";
	}
	
	
}
