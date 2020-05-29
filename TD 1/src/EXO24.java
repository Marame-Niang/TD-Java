import java.util.Scanner;

public class EXO24 {

	public static void main(String[] args) {
		int utl1, utl2 ;
		
		Scanner scan = new Scanner(System.in);
	    System.out.printf("Veuillez entrer le nombre secret ");
	    utl1 = scan.nextInt();
	    
	     do {
	    	 System.out.printf("\n Veuillez entrer l’entier saisi par le premier utilisateur ");
	 	    utl2 = scan.nextInt();
	 	    
	 	    if (utl1 > utl2) {
	 	    	System.out.printf("Trop petit");
	 	    }
	 	    
	 	    else if (utl1 < utl2) {
	 	    	System.out.printf("Trop grand");
	 	    }
	 	    
	 	    else {
	 	    	System.out.print ("\n Vous avez donné la bonne réponse"); 
	 	    }
	    	
	    } while (utl1 != utl2);

	}

}
