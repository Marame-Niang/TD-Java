import java.util.Scanner;

public class EXO22 {

	public static void main(String[] args) {
		int N, i,long_seq , long_max, position ;
		
		position = 0 ;  
        long_max = 0 ;
        long_seq = 0;
		
		do {
	    	    Scanner scan = new Scanner(System.in);
	    	    System.out.printf("Entrer un nombre entier compris entre 10 et 50");
	    	    N = scan.nextInt();
	     } while (N < 10 || N > 50);
		
		
		int Tab[] = new int[N];
	     
	     
	     for(i = 0; i< Tab.length; i++) {
	    	 
	    	 do {
	    		 
	    	 Scanner scan2 = new Scanner(System.in);
	    	 System.out.printf(" Saisir Tab [ " + i + "] :");
        	 (Tab[i])= scan2.nextInt();
        	 
	    	 } while (Tab[i] < 1 || Tab[i] > 100);
	     }
	    	 
	    	 for(i = 0; i<Tab.length-1; i++) {
	     
	    	 if (Tab[i] < Tab[i+1]) {
	    		 long_seq ++ ;
	    	 }
	    	 
	    	 	else {
	    	 		if (long_max < long_seq) {
	    	 			long_max = long_seq;
	    	 			position = i- long_seq + 1 ;
	    		 }
	    		 long_seq = 1;
	    	 }
	    	 }
	    		
	    		System.out.printf("La plus longue s�quence est ") ;
	    		long_seq = position + long_max;

	    		 while( i < long_seq) {
	        		 
	    		  	System.out.print(Tab[i] + " * ") ;

	        	 }
        		 
	    	    	 
	    	 
	    	 System.out.printf("\n Elle d�bute � la position " + position + " et se termine � la position " + long_max);

	     
	     
	     }
}



	
