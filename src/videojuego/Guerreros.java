package videojuego;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;


public class Guerreros implements Ejercito {
		private int  id = (int)(Math.random()*10000+1);
		private int vida = 30;
		private int danio = (int)(Math.random()*10+1);
		private int velocidad = (int)(Math.random()*10+1);
		private int escudo = (int)(Math.random()*10+1);
		private List<Guerreros> rojos = new ArrayList<Guerreros>();
		private List<Guerreros> azules = new ArrayList<Guerreros>();
 		
		public Guerreros() {
			
		}
		public Guerreros(int id,int vida, int danio, int velocidad, int escudo) {
			super();
			this.id = id;
			this.vida = vida;
			this.danio = danio;
			this.velocidad = velocidad;
			this.escudo = escudo;
		}
		public Guerreros(int id,int vida, int danio, int velocidad, int escudo, List<Guerreros> rojos, List<Guerreros> azules) {
			super();
			this.id = id;
			this.vida = vida;
			this.danio = danio;
			this.velocidad = velocidad;
			this.escudo = escudo;
			this.rojos = rojos;
			this.azules = azules;
		}

		public int getDanio() {
			return danio;
		}

		public void setDanio(int danio) {
			this.danio = danio;
		}

		public int getVelocidad() {
			return velocidad;
		}

		public void setVelocidad(int velocidad) {
			this.velocidad = velocidad;
		}

		public int getEscudo() {
			return escudo;
		}

		public void setEscudo(int escudo) {
			this.escudo = escudo;
		}
		
		
		public int getVida() {
			return vida;
		}
		public void setVida(int vida) {
			this.vida = vida;
		}
		
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		@Override
		public void atacar() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void defender() {
			// TODO Auto-generated method stub
			
		}
		
		
		public List<Guerreros> getRojos() {
			return rojos;
		}
		public void setRojos(List<Guerreros> rojos) {
			this.rojos = rojos;
		}
		public List<Guerreros> getAzules() {
			return azules;
		}
		public void setAzules(List<Guerreros> azules) {
			this.azules = azules;
		}
		@Override
		public void generarSoldados(int num) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Que clase de guerreros quieres crear? ");
			String valor = sc.nextLine();
			if(valor.equals("rojo")) {
				for(int i = 0; i<num;i++) {
					SoldadoRojo sr = new SoldadoRojo();
					rojos.add(sr);
				}
				System.out.println("Se han creado " + num + " soldados ROOJOS!");
			}else if(valor.equals("azul")) {
				for(int i = 0; i<num;i++) {
					SoldadoAzul sa = new SoldadoAzul();
					azules.add(sa);
				}
				System.out.println("Se han creado " + num + " soldados AZUULES!");
			}		
		}
		
		@Override
		public String toString() {
			return "[ Guerrero rojo: id= " + id + " vida=" + vida + " danio=" + danio + ", velocidad=" + velocidad + ", escudo=" + escudo + " ]";
		}
		public void mostrarSoldados() {
			
			System.out.println("[ Guerreros azules en total: " + azules.size() + " ]" + "\n");
			for (Guerreros guerreros : azules) {
				
				System.out.println(guerreros.toString());
			}
			System.out.println("");
			System.out.println("[ Guerreros rojos en total: " + rojos.size() + " ]" + "\n");
			
			for (Guerreros guerreros : rojos) {
				System.out.println(guerreros.toString());
				
			}
			
		}
		
		public void datos() {
			System.out.println(	this.getAzules().size());
		
		}
}