package videojuego;

public class SoldadoRojo extends Guerreros{

	public SoldadoRojo() {
		
	}
	public SoldadoRojo(int id, int vida, int danio, int velocidad, int escudo) {
		super(id, vida, danio, velocidad, escudo);
		// TODO Auto-generated constructor stub
	}
	
	public void superSoldado() {
		SoldadoRojo spr = new SoldadoRojo();
			
		spr.setVida(getVida()*3);
		spr.setDanio(getDanio()*2);
		spr.setEscudo(getEscudo() * 0);
		
	}
}
