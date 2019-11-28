package tp6;
import java.util.Scanner;
public class Tp6Exo1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("veuillez saisir un texte");
		String text= sc.nextLine();
		int compteur=0;
		for (int i = 0; i < text.length(); i++) {
			char j=text.charAt(i);
			System.out.println(j);
			if (j == 'e')
				compteur++;
		}
System.out.println("compteur e égal : "+compteur);
	}

}
