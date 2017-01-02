package projet1;

import java.util.Scanner;

public class tp1 {
	public static void main(String[] args) {
		int x=1;
		Scanner sc = new Scanner(System.in);
		while(x==1){
			System.out.println("Choisissez le mode de conversion: \n 1 - Celsius - Fahrenheit \n 2- Fahrenheit - Celsius");
			char reponse = sc.nextLine().charAt(0);
			if (reponse!='1' && reponse!='2'){
				System.out.println("Veuillez écrire '1' ou '2'");
				
			}
			else{
				System.out.println("temperature a convertir :");
				double temp=sc.nextDouble();
				sc.nextLine();
				if(reponse=='1'){
					double resultat= arrondi((9*temp)/5+32,2);
					System.out.println(temp +"°C correspond a "+resultat+"°F. \n Voulez-vous convertir une autre température ? O/N");
					char reponse2 = sc.nextLine().charAt(0);
					if(reponse2=='N'){
						System.out.println("Au revoir");
						x=2;
					}
				}
				else{
					double resultat= arrondi(((temp-32)*5)/9,2);
					System.out.println(temp +"°F correspond a "+resultat+"°C. \n Voulez-vous convertir une autre température ? O/N ");
					char reponse2 = sc.nextLine().charAt(0);
					if(reponse2=='N'){
						System.out.println("Au revoir");
						x=2;
					}
				}		
			}	
		}	
	}
	public static double arrondi(double A, int B) {

		  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);

	}
}



