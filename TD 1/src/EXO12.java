import java.util.Scanner;

public class EXO12 {

	public static void main(String[] args) {
		int nombre, somme, diviseur, i;
		 somme = 0;
		 
		 do {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer un nomre entier positif");
		nombre = scan.nextInt();
		 } while (nombre < 0);
		 
		for(i= 1; i < nombre; i++) {
			diviseur = nombre % i;
			if (diviseur == 0) {
				somme = somme + i;	
	}
} 

	if (somme == nombre) {
		 System.out.println("Le nombre est parfait");
	}
	else{
		
		System.out.println("Le nombre n'est pas parfait");
	}
}
}