package videojuego;

public class Batalla {
	public static void main(String[] args) {
		
		Guerreros guerreros = new Guerreros();
		guerreros.generarSoldados(3);
		guerreros.generarSoldados(3);
		guerreros.mostrarSoldados();
		
		
		Naves nave = new Naves();
		nave.generarNave();
		
		
		
	}
}
