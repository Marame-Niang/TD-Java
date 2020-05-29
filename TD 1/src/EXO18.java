import java.util.Scanner;

public class EXO18 {

	public static void main(String[] args) {
		int a, b, c, d, r ;
		
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
		
		if (a < b) {
			
			c = a ;
            r = b % a ;
		}
		
		else {
			c = b ;
            r = a % b ;
 
		}
		
		while (r != 0) {
		  
        d = c ;
		c = r ;
		r = d % c ;
		}
		
		System.out.printf("Le PGCD de " + a + " et " + b + " est : " + c + "\n") ;
		System.out.printf(" Le   PPCM de " + a + " et " + b + " est :" +  ((a*b) / c)) ;  

	}

}
