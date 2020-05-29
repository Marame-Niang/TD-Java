import java.util.Scanner;

public class EXO8 {

	public static void main(String[] args) {
		
		float a,  b,  c,  delta,  x1, x2 ;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer les valeurs de a, b et c ");
		a = scan.nextFloat();
		b = scan.nextFloat();
		c = scan.nextFloat();
 
		delta = (b*b) - (4 *a*c) ;
		
		if (a == 0) {
			System.out.println("L’équation est du premier degré \n");
			
			if(b > 0) {
				System.out.print("La solution est :" + (-c/b) );
				
			}
				
				else if(a == 0 && b == 0 && c == 0) {
					System.out.print("Tout réel est solution");
					
				}
			
				else {
					System.out.print("Pas de solution ");
				}	
				
		}
		
		
		else if (delta == 0) {
			x1 = x2 = -b / (2*a) ;
			System.out.print("On a une racine double qui est " + x1);
			
		}
		
		else if (delta > 0) {
			x1 = (float) (( (-b) - (Math.sqrt(delta))) / (2*a)); 
			x2 = (float) (( (-b) + (Math.sqrt (delta))) / (2*a));
			
			System.out.printf("l'équation admet 2 racines distincts réels que sont:"+ x1 +" et" + x2);
		}
		else if (delta < 0) {
			System.out.print("l'équation n'a pas de solution dans IR ");
			
		}
		
		
	}
}
	

