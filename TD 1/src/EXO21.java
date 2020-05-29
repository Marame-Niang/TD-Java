import java.util.Scanner;

public class EXO21 {

	public static void main(String[] args) {
		int utl1, utl2, score ;
		
		score = 0;
		Scanner scan = new Scanner(System.in);
   	    System.out.printf(" Veuillez entrer le nombre à deviner ");
   	    utl1 = scan.nextInt();
   	    
   	      do {
   	    	  Scanner scan1 = new Scanner(System.in);
   	    	  System.out.printf(" deviner l’entier saisi par le premier utilisateur  ");
   	    	  utl2 = scan1.nextInt();
	    
   	    	  if (utl1 < utl2) {
   	    		System.out.printf("L’entier est plus petit que ta proposition \n");
   	    	  }
   	    	  else if (utl1 > utl2) {
   	    		System.out.printf("L’entier est plus grand que ta proposition \n");
   	    	  }
   	    	  else {
   	    		System.out.printf("Vous avez donné la bonne réponse \n");
   	    		score = score +1 ;
   	    		System.out.printf("votre score est:" + score );
   	    	  }
	    
   	    } while (utl1 != utl2);
	}

}
