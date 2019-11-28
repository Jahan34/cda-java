package tp6;
import java.util.Scanner;
public class Tp6Exo3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Veuillez saisir un mot de plus de 30 caractères");
		String ligne = sc.nextLine();
		String revers= "";
		int j=0;
		for (int i =ligne.length()-1; i >= 0; i--) {
			revers+=ligne.charAt(i);
			
		}
		System.out.println(revers);
	}

}
