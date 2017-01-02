package projet1;

import java.util.Scanner;

public class tableaux{
	public static void main(String[] args){
		
		// chapitre sur les tableaux 
		char tableauCaractere[]={'a','b','c','d','e','f','g'};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ecrivez une lettre");
		String resultat = sc.nextLine();
		char lettre = resultat.charAt(0);
		// ajouter une vérification 
		boolean isInTable = false;
		for(int i =0; i < tableauCaractere.length; i++){
			if(lettre==tableauCaractere[i]){
				isInTable=true;
			}
		}
		if(isInTable)
			System.out.println("La lettre " + lettre + " est dans le tableau");
		else 
			System.out.println("La lettre " + lettre + " n'est pas dans le tableau");
			
		int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} }, i = 0, j = 0;
		
		while(i<2){
			j = 0;
			while(j < 5){
				System.out.println(premiersNombres[i][j]);
				j ++;
			}
			i ++;
		}
	}
	
	
}