package tp4;

import java.util.Scanner;

public class Tp4Exo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("donnez une valeur comprise entre: 0 & 2147483648 ");
		Scanner sc = new Scanner(System.in);
		long nb = sc.nextLong();
		sc.nextLine();
		long max = 2147483648L;
		if (nb < 0 || nb > max) {
			System.out.println("erreur");

		} else {
			System.out.println("donnez le numéro du bit compris entre 0 et 31");
			byte b = sc.nextByte();
			if (b < 0 || b > 31) {
				System.out.println("erreur");
			} else {
				System.out.println("merci" + b + " le bit du numéro 0 et 1");
				String resultat="";
				while (nb>0) {
					resultat = nb%2+ resultat;
					nb=nb/2;
					
			
				}
				System.out.println(resultat);
				
				String reverse = "";
				for (int i = 0; i < 31; i++) {
					if ( i < resultat.length()) {
						
						reverse = resultat.charAt(i) + reverse;
					}else {
						reverse = "0" + reverse;
					}
				}
				System.out.println(reverse);
				System.out.println(reverse.charAt(b));
				sc.close();
			}
		}

	}

}
