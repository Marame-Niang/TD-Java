import java.util.Scanner;

public class EXO15 {

	public static void main(String[] args) {
		int nombre , somme, i ;
		float moyenne;
		
		do {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer un nombre entier ");
		nombre = scan.nextInt();
		} while (nombre < 0) ;
		
		somme =  0 ;
		moyenne = 0 ;
		
		for(i= 1; i < nombre; i++) {
			somme = somme + i ;
		}
		
		System.out.println("La somme des entiers de 1 jusqu'à " + nombre + " est " + somme );
	
	
	moyenne = somme / nombre ;
	   
	System.out.println("La moyenne est :" + moyenne);
}
}