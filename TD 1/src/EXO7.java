import java.util.Scanner;

public class EXO7 {

	public static void main(String[] args) {
		
		int montant_euro, billet20, billet10, billet5, piece2, piece1;
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Entrer le montant en euro");
		montant_euro = scan1.nextInt();
		
		billet20 = montant_euro / 20 ;  
		billet10 = (montant_euro % 20) / 10 ; 
		billet5 = ( ( (montant_euro % 20) % 10 ) / 5) ; 
		piece2 =  ( ( ( (montant_euro % 20) % 10 ) % 5) / 2) ; 
		piece1 = ( ( ( ( (montant_euro % 20) % 10 ) % 5) % 2) / 1) ;

		System.out.print("Le montant en auro est composé de :\n "+ billet20 + " billet de 20: \n");
		System.out.print(billet10 + " billet de 10: \n");
		System.out.print(billet5 + " billet de 5: \n");
		System.out.print(piece2 + " piece de 2: \n");
		System.out.print(piece1 + " piece de 1 ");
	
	}

}
 