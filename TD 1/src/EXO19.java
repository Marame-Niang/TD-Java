import java.util.Scanner;

public class EXO19 {

	public static void main(String[] args) {
		int prix, somme ;
		
		somme = 0 ;
		do {
			do {
				Scanner scan = new Scanner(System.in);
				System.out.println("Entrer un prix de l’article ");
				prix = scan.nextInt();
			 } while (prix < 0);
		
		somme = somme + prix ;
	}
		while (prix != 0) ;
		
		System.out.printf("La somme des prix de cette suite d’article est : " + somme);
	}

}
