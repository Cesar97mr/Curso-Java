package orquesta;

public class BandaMusica {
	public static void main(String[] args) {
		
		BandaMusica bm = new BandaMusica();
		
		
		bm.tocarInstrumentos(bm.afinarInstrumentos(bm.empezarConcierto()));
	}
	
	public Instrumento[]  empezarConcierto() {
		Tambor t1 = new Tambor("Tambor", "Percusion" ,"Cuero");
		Piano p1 = new Piano("Piano", "Cuerda", 10, "Pianola");
		GuitarraElectrica ge1 = new GuitarraElectrica("Guitarra Electrica", "Cuerda pulsada", 120);
		Guitarra g1 = new Guitarra("Guitarra", "Cuerda pulsada", 5);
	
		Instrumento [] instrumentos = {t1,p1,ge1,g1};
		System.out.println("Se han creado los instrumentos!!");
		System.out.println("~~~~~~~~~~~~~~");
		return instrumentos;
	}
	
	public Instrumento[] afinarInstrumentos(Instrumento [] instrumentos) {
		
		for(int i = 0; i<instrumentos.length;i++) {
			instrumentos[i].afinar();
		}
		
		System.out.println("~~~~~~~~~~~~~~");
		return instrumentos;
	}
	
	public void tocarInstrumentos(Instrumento [] instrumentos) {
		
		for(int i = 0; i<instrumentos.length;i++) {
			
		
		}
		
	}
}
