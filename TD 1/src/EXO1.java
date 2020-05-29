import java.util.Scanner;


public class EXO1 { 
	
	public static void main(String[] args) {
		
		int a, b, quot, rest;
		float ratio;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("saisir le premier nombre");
		a = scan.nextInt();
		
		do { 
		Scanner scan2 = new Scanner(System.in);
		System.out.println ("saisir le deuxième nombre") ;
		b = scan2.nextInt();
		}
		while (b <= 0) ;
		
		quot= a / b ;
		rest= a % b ;
		ratio = a / b ;
		
		System.out.printf("le quotient vaut : "+ quot + "\n") ;
		System.out.printf("le reste de la division est : "+ rest + "\n") ;
		System.out.printf("le quotient réel est : "+ ratio) ;

}

}
