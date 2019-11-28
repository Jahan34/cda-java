package tp5;

import java.util.Scanner;

public class Tp5Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir les longueur des matrices");
		int nb=sc.nextInt();
		int TAB2 [][] = new int[nb][nb];
		int TAB1 [][] = new int[nb][nb];
		
		//Boucle tab2
		
		for (int i = 0; i < TAB2.length; i++) {
			System.out.println("rentrez la valeur de TAB2 ");
			int n=sc.nextInt();
			TAB2[i][i]=n;
		}
		
		//Boucle tab1
		for (int i = 0; i < TAB1.length; i++) {
			System.out.println("rentrez la valeur de TAB1 ");
			int num=sc.nextInt();
			TAB1[i][i]= num;
			int somme=(TAB2[i][i]*TAB1[i][i]);
			System.out.println("la multiplication des matrices = "+somme);
		}
		
		
		
		sc.close();
	}
		
}
