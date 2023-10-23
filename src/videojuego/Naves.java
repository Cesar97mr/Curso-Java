package videojuego;

import java.util.ArrayList;
import java.util.List;

public class Naves extends Guerreros{
	private int vidaNave = 100;
	private int ataqueNave = 10;
	private int escudoNave = 20;
	private List<Guerreros> tripulacion = new ArrayList<Guerreros>();
	
	
	public Naves() {
		this.setAzules(this.getAzules());
		this.setRojos(this.getRojos());
	}
	public Naves(int id, int vida, int danio, int velocidad, int escudo, List<Guerreros> rojos,
			List<Guerreros> azules) {
		super(id, vida, danio, velocidad, escudo, rojos, azules);
		
		// TODO Auto-generated constructor stub
	}
	public Naves(int id, int vida, int danio, int velocidad, int escudo) {
		super(id, vida, danio, velocidad, escudo);
		// TODO Auto-generated constructor stub
	}
	public int getVidaNave() {
		return vidaNave;
	}
	public void setVidaNave(int vidaNave) {
		this.vidaNave = vidaNave;
	}
	public int getAtaqueNave() {
		return ataqueNave;
	}
	public void setAtaqueNave(int ataqueNave) {
		this.ataqueNave = ataqueNave;
	}
	public int getEscudoNave() {
		return escudoNave;
	}
	public void setEscudoNave(int escudoNave) {
		this.escudoNave = escudoNave;
	}

	
	public List<Guerreros> getTripulacion() {
		return tripulacion;
	}
	public void setTripulacion(List<Guerreros> tripulacion) {
		this.tripulacion = tripulacion;
	}
	public void generarNave() {
		
	
		System.out.println(this.getRojos().size());
	}
	
	
	

}
