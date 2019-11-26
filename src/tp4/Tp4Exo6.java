package tp4;

import java.util.Scanner;

public class Tp4Exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("donnez un nombre compris entre 1 et 100 inclus");

		Scanner sc = new Scanner(System.in);
		int nb = sc.nextInt();
		if (nb > 100 || nb < 1) {
			System.out.println("erreur");

		} else {

			int somme = 0;
			int temp = 1;
			for (int i = 0; i < nb; i++) {
				System.out.println(temp);
				somme = temp + somme;
				temp += 2;

			}
			System.out.println(somme);
			sc.close();

		}
	}

}
