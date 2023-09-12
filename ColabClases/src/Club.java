import java.util.Scanner;

public class Club {
	private Socio s1, s2, s3;
	private Scanner sc;
	
	public Club() {
		sc = new Scanner(System.in);
		s1 = new Socio(sc);
		s2 = new Socio(sc);
		s3 = new Socio(sc);
	}
	
	public void mayor() {
		if(s1.retornarAntiguedad() > s2.retornarAntiguedad() && 
		   s1.retornarAntiguedad() > s3.retornarAntiguedad()) {
			s1.imprimir();
		}else {
			if(s2.retornarAntiguedad() > s3.retornarAntiguedad()) {
				s2.imprimir();
			}else {
				s3.imprimir();
			}
		}
		
	}
	
	public static void main(String[] args) {
		Club club1 = new Club();
		club1.mayor();
	}
}
