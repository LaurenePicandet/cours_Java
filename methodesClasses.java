package projet1.CommencerEnJava;

import java.util.Scanner;

public class methodesClasses {
	
	public static void main(String[] args){
		
		// Methodes natives 
		String chaine = new String("COUCOU"), chaine2=new String();
		chaine2 = chaine.toLowerCase();
		System.out.println(chaine2);
		
		if(!chaine.equals(chaine2))
			System.out.println(chaine);
		
		System.out.println(chaine.substring(2,4));
		System.out.println(chaine.lastIndexOf('C'));
		
		System.out.println(Math.random());
		
		 // creation d'un tableau pour la methode ci-dessous 
		int tab[]={0,1,2,3,4};
		ParcoursTableau(tab);
		

		
	} 
	
	// Methode pour parcourir un tableau 
	
	public static void ParcoursTableau(int tableau[]){
		for(int i =0; i < tableau.length; i++){
			System.out.println("Case "+i+" du tableau : "+tableau[i]);
		}
	}
	
	// variante 
	public static void ParcoursTableau2(int tableau[]){
		for(int i : tableau){
			System.out.println("Case "+i+" du tableau : "+tableau[i]);
		}
	}
	
	// la surcharge de méthode : on écrit une méthode ayant le même nom mais traitant un type d'argument différent 
	static void ParcoursTableau(String[] tab){
		for(String str : tab)
			System.out.println(str);
	}
	
	
}


