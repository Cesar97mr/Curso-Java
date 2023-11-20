package ficheros;

import java.io.IOException;
import java.sql.SQLException;


public class EjemploLeerArchivo {
    public static void main(String[] args) throws IOException {
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
			servicio.insertarDatosBiblio("./enunciados/ficheros/bibliotecas.txt");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}