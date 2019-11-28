package tp5;

import java.util.Scanner;
public class Tp5Exo6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("veuillez saisir un nombre entier en décimal svp ");
		int nb= sc.nextInt();
		String b2= Integer.toString(nb,2);
		String b16= Integer.toString(nb,16);
		System.out.println(b2);
		System.out.println(b16);
	}

}
