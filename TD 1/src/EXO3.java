import java.util.Scanner;
 
public class EXO3 {

	public static void main(String[] args) {
		
		float R1, R2, R3, rest_serie, rest_paral, freq;
		int choix;
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Entrer la première résistance ");
		R1= scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Entrer la deuxième résistance ");
		R2= scan2.nextInt();
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Entrer la troisième résistance ");
		R3= scan3.nextInt();
		
		System.out.println("Version 1 \n");
		
		rest_serie = R1 + R2 +R3 ;
		rest_paral = (R1 * R2 * R3) / (R1*R2 + R2*R3 + R1*R3) ;
		
		System.out.print ("La résistance en série est de :"+ rest_serie + "\n") ;
		System.out.print("La résistance en parallèle est de :"+ rest_paral + "\n") ;
		
		System.out.println("Version 2 \n");
		
		Scanner scan4 = new Scanner(System.in);
		System.out.println("Faites votre choix");
		choix = scan4.nextInt();
		
		if (choix == 1) {
			freq = (R1/rest_serie) + (R2/rest_serie) + (R3/rest_serie) ;
			System.out.print("La fréquence est de :" + freq);

		}
		else if (choix == 2) {
			freq = (R1/ rest_paral)  + (R2 / rest_paral) + (R3/ rest_paral) ;
			System.out.print("La fréquence est de :" + freq);

		}
		
		else {
			System.out.print("Vous ne pouvez choisir que 1 ou 2 ");
		}
		
		 
	}

}
