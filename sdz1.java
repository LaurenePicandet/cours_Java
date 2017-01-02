package projet1;

import java.util.Scanner;

public class sdz1 {

	public static void main(String[] args) {
		
		// chapitres 1 a 4 
		/*System.out.println("Hello \rworld!");
		int nbre1 =3, nbre2=2;
		// double resultat=(double)(nbre1/nbre2);
		double resultat=(double)nbre1/(double)nbre2;
		System.out.println("resultat="+resultat);
		
		int i = 12;
		String j = new String();
		j=j.valueOf(i);
		System.out.println("j="+j);
		int k = Integer.valueOf(j).intValue();
		System.out.println(k);
		
		int t=1__9;
		System.out.println(t);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ecrivez un entier :");
		int i2 = sc.nextInt();
		System.out.println("Ecrivez une chaine : " );
		sc.nextLine();
		String s = sc.nextLine();
		System.out.println("fin");*/
		
		// chapitre 5 : les boucles 
		//String prenom;
		//char reponse='O';
		Scanner sc = new Scanner(System.in);
		
		/*while(reponse=='O'){
			System.out.println("Donnez un prénom : ");
			prenom = sc.nextLine();
			System.out.println("Bonjour"+ prenom +" comment vas-tu ?");
			reponse=' ';
			while(reponse != 'O' && reponse!='N'){
				System.out.println("Voulez-vous reessayer ? O/N");
				reponse = sc.nextLine().charAt(0);
			}
		}
			
		int a=1, b=15;
		while(a++<b) // le a est incrémenté avant d'être comparé à b
			System.out.println("coucou"+ a +"fois");
		
		int c=1, d=15;
		while(++c < d) // le c est comparé à d avant d'être incrémenté 
			System.out.println("coucou"+ c +"fois");*/
		
		String prenom= new String();
		char reponse=' ';
	
		do{
			System.out.println("Donnez un prénom : ");
			prenom = sc.nextLine();
			System.out.println("Bonjour"+ prenom +" comment vas-tu ?");
			do{
				System.out.println("Voulez-vous reessayer ? O/N");
				reponse = sc.nextLine().charAt(0);
			}while(reponse != 'O' && reponse!='N');
		}while(reponse=='O');
		
		
	}

}
