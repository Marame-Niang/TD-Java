import java.util.Scanner;
public class EXO5 {

	public static void main(String[] args) {
		int Somme, i ;
		int tab [] = new int[5];
		
		Somme = 0;
		for(i = 0; i< tab.length; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println(" Saisir  tab [ "+ i +"] :") ;
		  tab[i] = scan.nextInt();
		  
		  Somme += tab[i]; 

		}
		
		System.out.print("La somme est: " + Somme);
	}

}
