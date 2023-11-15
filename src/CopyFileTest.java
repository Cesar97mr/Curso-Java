import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileTest {
	
	public static void main(String[] args) throws IOException {
		copyFile(new File("c:/tmp/imagen.png"), new File("c:/tmp/imagen2.png"));
	}


public static void copyFile(File source, File dest) throws IOException {
	InputStream in = new FileInputStream(source);
	OutputStream out = new FileOutputStream(dest);
	
	int b = in.read();
	while(b != -1) {
		out.write(b);
		b = in.read();
	}
	in.close();
	out.close();
}
}