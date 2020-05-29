import java.util.Scanner;

public class EXO20 {

	public static void main(String[] args) {
		float Tab[] = new float[10];
	     int i, indice;
         float plus_grand = 0 ;
         indice = 0;

         for(i = 0; i< 10; i++) {
        	 Scanner scan = new Scanner(System.in);
     		
        	 System.out.printf(" Saisir Tab [ " + i + "] :");
        	 (Tab[i])= scan.nextFloat();
        
        	 
             if (Tab[i] > plus_grand) {
            	 plus_grand = Tab[i] ;
            	 indice = i ;
            	 
            	 

             }
             

         } System.out.printf ("le plus grand entre ces 10 nombres est : " + plus_grand + " et son rang est " + indice ) ;
         
         
        

	}

}
