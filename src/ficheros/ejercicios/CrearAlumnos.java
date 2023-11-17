package ficheros.ejercicios;

import java.io.IOException;

import ficheros.ArchivoServicio;

public class CrearAlumnos {
	public static void main(String[] args) {
		ArchivoServicio servicio = new ArchivoServicio();
    	try {
			servicio.crearAlumnos("./enunciados/ficheros/alumnos.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
