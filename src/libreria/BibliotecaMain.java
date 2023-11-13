package libreria;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import libreria.dao.BibliotecaDao;
import libreria.entities.Biblioteca;
import libreria.dao.*;
import utils.Utils;

public class BibliotecaMain {
	private Map<Long,Biblioteca> mapBibliotecas;
	
	public BibliotecaMain() {
		super();
		this.mapBibliotecas = new HashMap();
	}

	public static void main(String[] args) {
		BibliotecaMain bibliotecaMain = new BibliotecaMain();
		bibliotecaMain.inicio();
	
	}

	public void inicio () {
		
		cargarDatosBiblioteca();
		int opcion = crearMenuPrincipal();
		if (opcion==(mapBibliotecas.size()+1)) {
			System.out.println("Adios");
		}else {
			Biblioteca biblioElegida= mapBibliotecas.get(opcion);
			System.out.println(biblioElegida.getNombre());
			cargarSubmenu(biblioElegida);
		}
		
	}
	
	public void cargarSubmenu(Biblioteca b) {
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		Set<Long> claves = mapBibliotecas.keySet();
		do {
			
			System.out.println("1. Mostrar info Biblioteca. " + "\n" +
							   "2. Mostrar Libros de la biblioteca" + "\n" +
							   "3. Buscar libro (por titulo)." + "\n" +
							   "4. Insertar libro." + "\n"+
							   "5. Modificar libro (por titulo si se encuentra)" + "\n"+
							   "6. Borrar libro (por titulo si se encuentra)" + "\n" +
							   "7. Volver");
			
			opcion = sc.nextInt();
			switch (opcion) {
			case 1: {
				
				
				break;
			}
			case 2: {
				
				break;
			}
			case 3: {
	
				break;
			}
			case 4: {
	
				break;
			}
			case 5: {
	
				break;
			}
			case 6: {
				
				break;
			}
			case 7: {
	
				break;
			}
			
			}
			
		}while(opcion != 7);
	}
	
	public void cargarDatosBiblioteca () {
		
		try {
			BibliotecaDao bibliotecaDAO = new BibliotecaDao();
			
			for (Biblioteca biblioteca : bibliotecaDAO.getBibliotecas()) {
				mapBibliotecas.put(biblioteca.getId(), biblioteca);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public int crearMenuPrincipal() {
		
		Set<Entry<Long,Biblioteca> > entryBiblioteca  =  mapBibliotecas.entrySet();
		
		for (Entry<Long, Biblioteca> entry : entryBiblioteca) {
			System.out.println(entry.getKey() + ". " + entry.getValue().getNombre());
		}
		int opcion = Utils.pintarMenu((entryBiblioteca.size()+1) + ". Salir");
		
		return opcion;
	}
	
	
	
}
