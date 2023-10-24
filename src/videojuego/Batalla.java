package videojuego;

public class Batalla {
	public static void main(String[] args) {
		
		Guerreros guerreros = new Guerreros(0, 0, 0);
		guerreros.generarSoldados(3);
		guerreros.generarSoldados(3);
		guerreros.mostrarSoldado();
		
		
		Naves nave = new Naves();
		nave.generarNave();
		
		
		
	}
}
