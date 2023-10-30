package libreria;

public class Menu {
	public static void main(String[] args) {
		Biblioteca b = new Biblioteca("santos");
		
		b.agregarLibro();
		b.agregarLibro();
		b.agregarLibro();
		
		b.prestarLibro();
	}
}
