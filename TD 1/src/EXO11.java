import java.util.Scanner;

public class EXO11 {

	public static void main(String[] args) {
		int a, b, resultat ;
		String op;
		char operant;
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer les valeurs de a et b ");
		a = scan.nextInt();
		b = scan.nextInt();
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Entrer l’oprérant");
		op = scan1.nextLine();
		operant = op.charAt(0);
		
		if (operant == '+') {
			resultat = a + b ;
			
			System.out.print("Le résultat de l’opération "+ a + " + " + b + " = " + resultat);

		}
		
		else if(operant == '-') {
			resultat = a - b ;
			
			System.out.print("Le résultat de l’opération " + a + " - " + b + " = " +  resultat);

		}
		
		else if (operant == '*') {
			 resultat = a * b ;	
			 
				System.out.print("Le résultat de l’opération "+ a + " * " + b +" = " + resultat);

		}
		
		else if(operant == '/' && b != 0) {
		 resultat = a / b ;
		 
			System.out.print("Le résultat de l’opération " +  a  + " / " +  b  + " = "  + resultat);
			
			
		}
		
		else if(operant == '/' && b == 0) {
			 
				System.out.print("L’opération est impossible ");
				
				
			}
		
		
	}

}
