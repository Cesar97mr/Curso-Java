package libreria.entities;

public class Direccion {
	private long id;
	private String tipo;
	private String direccion;
	
	public Direccion(long id, String tipo, String direccion) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.direccion = direccion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Direccion [id=" + id + ", tipo=" + tipo + ", direccion=" + direccion + "]";
	}
	
	
	
}
