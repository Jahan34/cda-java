package tp6;
import java.util.Scanner;
public class Tp6Exo2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("veuillez saisir un texte ");
		String text= sc.nextLine();
		text=text.replaceAll("e", "");
	System.out.println(text);
	}

}
