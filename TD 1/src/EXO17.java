import java.util.Scanner;

public class EXO17 {
	public static void main(String[] args) {
		
		int a, b ;
		
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Entrer le premier nombre entier");
			a = scan.nextInt();
			 } while (a < 0);
		
		do {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Entrer le deuxieme nombre entier");
			b = scan1.nextInt();
			 } while (b < 0);
		
		while (a != b) {
			
			if (a < b) {
	
				b = b - a ;
			}
			
			else {
				a = a - b ; 
			}
			
		}
			
			System.out.printf("Le PGCD de  a  et b est : " +b) ;
		
	}
}
