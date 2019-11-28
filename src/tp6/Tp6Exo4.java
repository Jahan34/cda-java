package tp6;
import java.util.Arrays;
import java.util.Scanner;
public class Tp6Exo4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String TAB[]=new String[3];
		
		for (int i = 0; i < TAB.length; i++) {
			System.out.println("Veuillez saisir un mot");
		String ligne = sc.nextLine();
		TAB[i]= ligne;
		}
		Arrays.sort(TAB);
		for (String string : TAB) {
			System.out.println(string);
			
		}
		
	}

}
