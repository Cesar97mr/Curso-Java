package libreria;

public class Libro {
	private String titulo;
	private String autor;
	private int numCopias;
	
	public Libro(String titulo, String autor, int numCopias) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numCopias = numCopias;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumCopias() {
		return numCopias;
	}
	public void setNumCopias(int numCopias) {
		this.numCopias = numCopias;
	}
	
	
}
