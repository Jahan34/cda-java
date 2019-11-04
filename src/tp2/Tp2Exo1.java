package tp2;

import java.util.Scanner;

public class Tp2Exo1 {

	public static void main(String[] args) {
		System.out.println("hello world");

		System.out.println("Salut");
		Scanner lecture_clavier=new
		Scanner(System.in);
		int valeur;System.out.println("Saisir un entier : ");
		valeur =lecture_clavier.nextInt();System.out.println("Entier saisi = "+valeur);
		
		int valeur2;System.out.print("Saisir un second entier : ");
		valeur2 =lecture_clavier.nextInt();System.out.println("Entier saisi = "+valeur2);
		
		int somme = valeur+valeur2;System.out.print("la somme des deux valeurs est : "+somme);
		somme= lecture_clavier.nextInt();System.out.print(valeur+valeur2);
		
		lecture_clavier.close();
		 
	}

}
