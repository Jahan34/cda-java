package tp3;

import java.util.Scanner;

public class Tp3Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("hello world");

			System.out.println("Salut");
			Scanner lecture_clavier=new
			Scanner(System.in);
			
			int n;System.out.println("Saisir un entier : ");
			n =lecture_clavier.nextInt();
			System.out.println("Entier saisi = "+n);
			
			int p;System.out.println("Saisir un second entier : ");
			p =lecture_clavier.nextInt();
			System.out.println("Entier saisi = "+p);
			
			long q;System.out.println("Saisir un Long : ");
			q =lecture_clavier.nextLong();
			System.out.println("Long saisi = "+q);
			
			float x; System.out.println("saisir un reel: ");
			x =lecture_clavier.nextFloat();
			System.out.println("reel saisi: "+x);
			
			//long somme_a =  n + q;
			//System.out.print("la somme des deux valeurs est : "+somme_a);
			//somme_a= lecture_clavier.nextLong();
			//System.out.print(n+q);
			
			float somme_b =  n + x;
			System.out.print("la somme des deux valeurs est : "+somme_b);
			somme_b= lecture_clavier.nextFloat();
			System.out.print(n+x);
			
			long somme_c =  (n%p)*q;
			System.out.print("la somme des deux valeurs est : "+somme_c);
			somme_c= lecture_clavier.nextLong();
			System.out.print((n%p)*q);
			
			int somme_d =  n%-p*n;
			System.out.print("la somme des deux valeurs est : "+somme_d);
			somme_d= lecture_clavier.nextInt();
			System.out.print((n%-p)*q);
			
			int somme_e =  -n%p*n;
			System.out.print("la somme des deux valeurs est : "+somme_e);
			somme_e= lecture_clavier.nextInt();
			System.out.print(-n%p*n);
			
			lecture_clavier.close();
			 
		}

	

	}


