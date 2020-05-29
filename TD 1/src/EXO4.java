import java.util.Scanner;
public class EXO4 {

	public static void main(String[] args) {
		double x, puissance ;
		int n ;
		
		System.out.println("Version 1");
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Entrer un nombre réel ");
		x = scan1.nextDouble();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Entrer un nombre entier ");
		n = scan2.nextInt();
		
		puissance = Math.pow (x, n) ;
		System.out.print("La puissance est : " + puissance +"\n \n");
		
		System.out.println("Version 2");
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Entrer un nombre réel ");
		x = scan1.nextFloat();
		
		Scanner scan4 = new Scanner(System.in);
		System.out.println("Entrer un nombre entier ");
		n = scan2.nextInt();
		
		puissance = 1;
		for (int i = 1; i <= n; i++) {
			puissance *= x ;
			
			
		}
		System.out.print("La puissance est : " + puissance);
	}
 
}
