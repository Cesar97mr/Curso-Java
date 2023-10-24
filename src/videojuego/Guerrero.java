package videojuego;



public class Guerrero implements Ejercito {
		private int danio;
		private int velocidad;
		private int escudo;

		public Guerrero(int danio, int velocidad, int escudo) {
			super();
			this.danio = danio;
			this.velocidad = velocidad;
			this.escudo = escudo;
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

		@Override
		public void generarSoldado() {
			
			SoldadoRojo sr1 = new SoldadoRojo();
			
		}

		@Override
		public void mostrarSoldado() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void soldadoEspecial() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void atacar() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void defender() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void generarSoldados(int num) {
			// TODO Auto-generated method stub
			
		}
	
	
}