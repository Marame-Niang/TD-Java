import java.util.Scanner;

public class EXO6 {

	public static void main(String[] args) {
		double x1, x2, y1, y2, distance ;
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Saisir les coordonnées du point A ");
		x1 = scan1.nextFloat();
		y1 = scan1.nextFloat();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Saisir les coordonnées du point B");
		x2 = scan2.nextFloat();
		y2= scan2.nextFloat();
		
		distance = Math.sqrt ( ((x1 - x2) *(x1 - x2)) + ((y1 - y2) * (y1 - y2)) ) ;
		
		System.out.print("La distance entre les 2 points est : " + distance);
	}

}
