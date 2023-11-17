package ficheros;

import java.io.IOException;


public class EjemploLeerArchivo {
    public static void main(String[] args) {
        //String nombreArchivo = "D:\\Cursos\\Java\\archivo\\java.txt";
//    	String nombreArchivo = "./enunciados/ficheros/alumnos.txt";
//        ArchivoServicio servicio = new ArchivoServicio();
//
//        
//        try {
//			System.out.println(servicio.leerArchivo3(nombreArchivo));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    	ArchivoServicio servicio = new ArchivoServicio();
    	try {
			servicio.crearAlumnos("./enunciados/ficheros/alumnos.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}