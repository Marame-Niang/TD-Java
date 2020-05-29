import java.util.Scanner;

public class EXO10 {

	public static void main(String[] args) {
		int a,  b, c ;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer les valeurs de a, b et c");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		if (a > b && b > c) {
			a = a + c ;      
			c = a - c ; 
			a = a - c ; 
		}
		
		if (b > a && a > c) {
			c = c + a ;  
			a = c - a ;
			c = c - a ;
			c = c + b ;
			b = c - b ;
			c = c - b ;

		}
		
		if (b > c && c > a) {
			b = b + c ;  
			c = b - c ;       
		    b = b - c ;         

		}
		
		if (a > c && c > b) {
			a = a + c ;      
			c = a - c ;       
			a = a - c ;       
		    a = a + b ;       
		    b = a - b ;       
			a = a - b ;

		}
		
		System.out.printf("Dans l’ordre croissant on a : " + a + " " +  b + " " + c);
		}

}
