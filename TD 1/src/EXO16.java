import java.util.Scanner;

public class EXO16 {
	public static void main(String[] args) {
	int a, b, quotient ;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Entrer le premier nombre entier");
	a = scan.nextInt();
	
	do {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Entrer le deuxieme nombre entier");
		b = scan1.nextInt();
		 } while (b <= 0);
	
	quotient = 0 ;           
	
	while (a >= b) {
		a = a - b ;
        quotient = quotient + 1 ;   

	}
	
	System.out.println ("La division de " + a + " / " + b + " est égale à : " + quotient);
}
}
