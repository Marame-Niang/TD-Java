import java.util.Scanner;

public class EXO25 {

	public static void main(String[] args) {
		int i, j, nombre, compteur;
		
System.out.printf("======================================================\n");
	    for (i = 1; i<= 10; i++){
	    for(j = 1; j <= i; j++){


	          System.out.print(i);



	          System.out.printf(" ");

	    }
	    
	    System.out.printf("\n");
	    
	    }
	    
	    System.out.printf("======================================================\n");

	    do {
			Scanner scan = new Scanner(System.in);
	    	System.out.print("Veuillez entrer un nombre entier ");
	    	nombre = scan.nextInt();
	    } while (nombre < 1);
	    
	    compteur = 0 ;
	    
	    for(i = 1; i< nombre; i++) {
	    		if (nombre % i == 0) {
	    			compteur +=1 ;
	    		}
	    }
	    if(compteur == 1) {
    		System.out.printf(nombre + " est un nombre premier");
    	}
	    else{
	    	System.out.printf(nombre + " n'est pas un nombre premier"); 
	}
	}

}
