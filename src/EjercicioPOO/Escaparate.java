package EjercicioPOO;

public class Escaparate {

	public static void main(String[] args) {
		
		Maniqui m1 = new Maniqui(001);
		Maniqui m2 = new Maniqui(003);
		
		
		Boton b1 = new Boton(001,"cuadrado","blanco","5mm");
		Boton b2 = new Boton(002,"Redondo","Negro","10mm");
		Boton b3 = new Boton(003,"Redondo","Negro","10mm");
		Boton [] botons = {b1,b2,b3};
		
		Pantalon p1 = new Pantalon(312,"Blanco","M",25,b1);
		
		Camisa c1 = new Camisa(144,"rojo","L",14,botons);
		Vestido v1 = new Vestido(1122,"red","xl",45);
		m1.vestir(v1);
		m2.vestir(p1,c1);
		Maniqui m3 = new Maniqui(004);
		m3.vestir(p1,c1);
		
		Escaparate e1 = new Escaparate();
		
		Maniqui [] maniquies = {m1,m2,m3};
		e1.mostrarEscaparate(maniquies);
	}
	
	public void mostrarManiqui(Maniqui m) {
		
		if(m.getVestido() == null) {
			System.out.println("Maniqui ID = "  + m.getId() + "\n" + "\t" + 
					"Camisa: " + m.getCamisa().getId() + " - " + 
								 m.getCamisa().getColor() + " - " + 
								 m.getCamisa().getTalla() + " - " + 
								 m.getCamisa().getPrecio() + "\n" + "\t" +
					"Pantalon: "+m.getPantalon().getId() + " - " + 
								 m.getPantalon().getColor() + " - " + 
								 m.getPantalon().getTalla() + " - " +  
								 m.getPantalon().getPrecio());
		}else {
			System.out.println("Maniqui ID = "  + m.getId() + "\n" + "\t" + 
					
				"Vestido: "+ m.getVestido().getId() + " - " + 
							 m.getVestido().getColor() + " - " + 
							 m.getVestido().getTalla()+ " - " + 
							 m.getVestido().getPrecio());
		}
	
	}
	
	public void mostrarEscaparate(Maniqui [] ms) {
		
		Escaparate e = new Escaparate();
		for(int i = 0; i<ms.length;i++) {
			e.mostrarManiqui(ms[i]);
		
		}
	}
	

	
}
