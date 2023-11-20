package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import libreria.dao.BibliotecaDao;
import libreria.dao.DireccionDao;
import libreria.entities.Biblioteca;
import libreria.entities.Direccion;
import libreria.exceptions.NoResultsException;
import poo.Alumno;

public class ArchivoServicio {

	//El nombre es la ruta y el nombre del fichero
	public void crearArchivo(String nombre) {
		File archivo = new File(nombre);
		try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, false))) {

			buffer.append("Hola que tal amigos!\n")
					.append("Todo bien? yo escribiendo en un archivo...\n")
					.append("Hasta luego Lucas!\n");
			// buffer.close();
			System.out.println("El archivo se ha creado con éxito!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void crearArchivo2(String nombre) {
		File archivo = new File(nombre);
		
		try (PrintWriter buffer = new PrintWriter(archivo)) {
			// try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo))){

			buffer.println("Hola que tal amigos!");
			buffer.println("Todo bien? yo acá escribiendo un archivo...");
			buffer.printf("Hasta luego %s! %s", "JoseLuis5", "Cadena");
			// buffer.close();
			System.out.println("El archivo se ha creado con éxito!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String leerArchivo(String nombre) throws IOException {
		StringBuilder sb = new StringBuilder();
		File archivo = new File(nombre);
//		FileReader fileReader = new FileReader(archivo);
//		BufferedReader reader = new BufferedReader(fileReader);
//
//		String linea;
//		while ((linea = reader.readLine()) != null) {
//			sb.append(linea).append("\n");
//		}

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){

            String linea;
            while ( (linea = reader.readLine()) != null){
                sb.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		return sb.toString();
	}

	public String leerArchivo2(String nombre) {
		StringBuilder sb = new StringBuilder();
		File archivo = new File(nombre);
		try (Scanner s = new Scanner(archivo)) {

			s.useDelimiter("\n");
			while (s.hasNext()) {
				sb.append(s.next()).append("\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	public String leerArchivo3(String nombre) throws IOException{
		Path path = Paths.get(nombre);
		StringBuilder sb = new StringBuilder();

		List<String> lines = Files.readAllLines(path);
		for (String linea : lines) {
			sb.append(linea+"\n");
		}

		return sb.toString();
	}

	public void mostrarContenidoDirectorio(String directorio) {
		File dir = new File(directorio);
		File file1 = new File(directorio, "fichero1.txt");
		File file2 = new File(dir, "fichero1.txt");

		if (dir.isDirectory()) {
			String[] ficheros = dir.list();
			for (String nombreFichero : ficheros) {
				// System.out.print(nombreFichero + " ");
				String nuevoFichero = directorio + nombreFichero;
				System.out.println(nuevoFichero);
				File file = new File(nuevoFichero);
				if (file.isDirectory()) {
					// System.out.println("Es un directorio");
				} else {
					if (file.getName().endsWith(".txt")) {
						System.out.println("Se puede leer:" + file.canRead());
						System.out.println("TAmaño " + file.length());
						System.out.println("Es un fichero");
					}
				}

			}
		} else {
			System.err.println("No es un directorio");
		}
	}
	
	public List<Alumno> crearAlumnos(String arch) throws IOException {
		
		List<Alumno> alumnos = new ArrayList<Alumno>();

		try {
			
            String archivo = leerArchivo3(arch);
            Scanner sc = new Scanner(archivo);
            
            while (sc.hasNextLine()) {

            	String[] parts = sc.nextLine().split("\\|");
            	String nombre = parts[0];
            	String apellidos = parts[1];
            	String dni = parts[2];
            	double nota = Integer.parseInt(parts[3]);     
            
                Alumno alumno = new Alumno(dni,nombre,apellidos,nota);
                System.out.println("Alumno creado!");
                alumnos.add(alumno);
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + arch);
            e.printStackTrace();
        }
		System.out.println("El tamaño de la lista de alumnos es de: " + alumnos.size());
		return alumnos;
    }
	
	public void insertarDatosBiblio(String arch) throws SQLException {
		
		DireccionDao direccionDao = new DireccionDao();
		BibliotecaDao bibliotecaDao = new BibliotecaDao();
		try {
			String archivo = leerArchivo3(arch);
			Scanner sc = new Scanner(archivo);
			
			while(sc.hasNextLine()) {
				String[] parts = sc.nextLine().split("\\|");
				
					String tipoCalle = parts[0];
					String nombreCalle = parts[1];
					String ciudad = parts[2];
					String provincia = parts[3];
					int cp = Integer.parseInt(parts[4]);
					String nombreBiblio = parts[5];
				
				Direccion direccion = new Direccion(tipoCalle, nombreCalle, ciudad, provincia, cp);
				
				
				try {
					direccionDao.insertarDireccion(direccion);
					long id_dir = direccionDao.getLastDireccion();
					Biblioteca biblioteca = new Biblioteca(nombreBiblio, id_dir);
					
					bibliotecaDao.insertarBiblioteca(nombreBiblio, id_dir);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoResultsException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

  